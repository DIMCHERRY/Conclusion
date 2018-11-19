package com.littlered.conclusion.presenter;

import com.littlered.conclusion.api.LoginListenerApi;
import com.littlered.conclusion.api.LoginReq;
import com.littlered.conclusion.bean.BaseUser;
import com.littlered.conclusion.bean.User;
import com.littlered.conclusion.model.IModel;
import com.littlered.conclusion.view.IView;

import java.util.HashMap;
import java.util.Map;

public class PresenterImpl implements IPresenter{
    private IView iView;

    @Override
    public void LoginPresenter(IModel iModel, final IView iView) {
        this.iView = iView;

        //获取用户名密码做验证
        String mobile = iView.getMobile();
        String password = iView.getPassword();

        if(mobile.length() == 0){
            iView.MobileError("手机号格式不正确");
        }
        if(password.length() == 0){
            iView.PasswordError("密码格式不正确");
        }

        LoginReq map =  new LoginReq(mobile,password,101);
//        map.put("account", mobile);
//        map.put("secret", password);
//        map.put("type", 101);

        //判断登录成功
        iModel.LoginModel(map, new LoginListenerApi() {
            @Override
            public void Success(BaseUser<User> baseUser) {
                String code = baseUser.getError_code();
                if(code.equals(0)){
                    iView.LoginSuccess(baseUser);
                }else {
                    iView.Failure(baseUser.getMsg());
                }
            }

            @Override
            public void Error(String error) {
                iView.Failure(error);
            }
        });
    }

    @Override
    public void Destroy() {
        if (iView != null) {
            iView = null;
        }
    }
}
