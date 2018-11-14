package com.littlered.conclusion;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.tv_home)
    TextView tvhome;
    @BindView(R.id.tv_interests)
    TextView tvInterests;
    @BindView(R.id.tv_profile)
    TextView tvProfile;

    private Fragment fg1,fg2,fg3;
    private FragmentManager fgManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        fgManager = getSupportFragmentManager();
        ButterKnife.bind(this);
        setListener();
    }

    //事件监听
    private void setListener(){
        tvhome.setOnClickListener(this);
        tvInterests.setOnClickListener(this);
        tvProfile.setOnClickListener(this);
    }

    //重置所有文本的选中状态
    private void setSelected(){
        tvhome.setSelected(false);
        tvInterests.setSelected(false);
        tvProfile.setSelected(false);
    }

    //隐藏所有Fragment
    private void hideAllFragment(FragmentTransaction fragmentTransaction){
        if(fg1 != null) fragmentTransaction.hide(fg1);
        if(fg2 != null) fragmentTransaction.hide(fg2);
        if(fg3 != null) fragmentTransaction.hide(fg3);
    }
    @Override
    public void onClick(View v) {
        FragmentTransaction fgTransaction = fgManager.beginTransaction();
        hideAllFragment(fgTransaction);
        switch (v.getId()){
            case R.id.tv_home:
                setSelected();
                tvhome.setSelected(true);
                if(fg1 == null){
                    fg1 = new MyFragment("first");
                    fgTransaction.add(R.id.fl_content,fg1);
                }else{
                    fgTransaction.show(fg1);
                }
                break;
            case R.id.tv_interests:
                setSelected();
                tvInterests.setSelected(true);
                if(fg2 == null){
                    fg2 = new MyFragment("second");
                    fgTransaction.add(R.id.fl_content,fg2);
                }else{
                    fgTransaction.show(fg2);
                }
                break;
            case R.id.tv_profile:
                setSelected();
                tvProfile.setSelected(true);
                if(fg3 == null){
                    fg3 = new ProfileFragment();
                    fgTransaction.add(R.id.fl_content,fg3);
                }else{
                    fgTransaction.show(fg3);
                }
                break;
        }
        fgTransaction.commit();
    }
}
