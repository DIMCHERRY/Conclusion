package com.littlered.conclusion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.littlered.conclusion.bean.RegisterBackJson;
import com.littlered.conclusion.bean.RegisterJson;
import com.littlered.conclusion.utils.GsonUtils;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.et_register_phone)
    EditText etPhone;
    @BindView(R.id.et_register_nickname)
    EditText etNickname;
    @BindView(R.id.et_register_password)
    EditText etPassword;
    @BindView(R.id.et_register_password_check)
    EditText etPwChecked;
    @BindView(R.id.tv_register)
    TextView tvRegister;
    @BindView(R.id.iv_back_login)
    ImageView backLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
//                .addInterceptor(new LoggerInterceptor("TAG"))
                .connectTimeout(10000L, TimeUnit.MILLISECONDS)
                .readTimeout(10000L, TimeUnit.MILLISECONDS)
                //其他配置
                .build();

        OkHttpUtils.initClient(okHttpClient);
    }

    public void register(){
        RegisterJson registerJson = new RegisterJson(etPhone.getText().toString(),etPassword.getText().toString(),101,etNickname.getText().toString());
        String s = GsonUtils.GsonString(registerJson);
        OkHttpUtils
                .postString()
                .url("http://40.73.116.21:8888/v1/client/register")
                .content(s)
                .mediaType(MediaType.parse("application/json; charset=utf-8"))
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Toast.makeText(RegisterActivity.this,call.request().body().toString(),Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        parseJsonWithGson(response);
                        /*Toast.makeText(RegisterActivity.this,response,Toast.LENGTH_LONG).show();*/
                    }
                });
/*        registerJson.setNickname(etNickname.getText().toString());
        registerJson.setAccount(etPhone.getText().toString());
        registerJson.setSecret(etPassword.getText().toString());
        String nickName = registerJson.getNickname();
        String account = registerJson.getAccount();
        String pw = registerJson.getSecret();*/
    }

    private void parseJsonWithGson(String jsonData) {
        RegisterBackJson json = GsonUtils.GsonToBean(jsonData,RegisterBackJson.class);
        Toast.makeText(RegisterActivity.this,json.getMsg(),0).show();
    }


    @OnClick({R.id.tv_register,R.id.iv_back_login})
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            //返回登录
            case R.id.iv_back_login:
                finish();
                break;
            case R.id.tv_register:
                register();
                break;
        }
    }
}
