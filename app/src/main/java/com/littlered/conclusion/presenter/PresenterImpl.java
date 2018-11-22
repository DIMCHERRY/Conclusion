package com.littlered.conclusion.presenter;

import com.littlered.conclusion.api.ImageListenerApi;
import com.littlered.conclusion.api.ImageReq;
import com.littlered.conclusion.api.LoginListenerApi;
import com.littlered.conclusion.api.LoginReq;
import com.littlered.conclusion.api.RegisterListenerApi;
import com.littlered.conclusion.api.RegisterReq;
import com.littlered.conclusion.bean.BaseData;
import com.littlered.conclusion.bean.Data;
import com.littlered.conclusion.model.IModel;
import com.littlered.conclusion.view.IImageListView;
import com.littlered.conclusion.view.IRegisterView;
import com.littlered.conclusion.view.IView;

public class PresenterImpl implements IPresenter{
    private IView iView;
    private IRegisterView iRegisterView;
    private IImageListView iImageListView;

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
        //判断登录成功
        iModel.LoginModel(map, new LoginListenerApi() {
            @Override
            public void Success(BaseData<Data> baseData) {
                String code = baseData.getError_code();
                if(code.equals(0)){
                    iView.LoginSuccess(baseData);
                }else {
                    iView.Failure(baseData.getMsg());
                }
            }

            @Override
            public void Error(String error) {
                iView.Failure(error);
            }
        });
    }

    @Override
    public void RegisterPresenter(IModel iModel, final IRegisterView iRegisterView) {
        this.iRegisterView = iRegisterView;

        //获取用户名密码做验证
        String mobile = iRegisterView.getMobile();
        String password = iRegisterView.getPassword();
        String nickName = iRegisterView.getNickName();

        if (mobile.length() == 0) {
            iRegisterView.MobileError("手机号格式不正确");
        }
        if (password.length() == 0) {
            iRegisterView.PasswordError("密码格式不正确");
        }

        RegisterReq registerMap = new RegisterReq(mobile, password, nickName, 101);


        //判断注册成功
        iModel.RegisterModel(registerMap, new RegisterListenerApi() {
            @Override
            public void RegisterSuccess(BaseData<Data> baseData) {
                String code = baseData.getError_code();
                if (code.equals(0)) {
                    iRegisterView.RegisterSuccess(baseData);
                } else {
                    iRegisterView.Failure(baseData.getMsg());
                }
            }

            @Override
            public void RegisterError(String error) {
                iRegisterView.Failure(error);
            }
        });
    }

    @Override
    public void ImagePresenter(IModel iModel, IImageListView iImageListView) {
        this.iImageListView = iImageListView;
        ImageReq imageReq = new ImageReq();
        iModel.ImageListModel(imageReq, new ImageListenerApi() {
            @Override
            public void ImageSuccess(BaseData<Data> baseData) {

            }

            @Override
            public void ImageError(String error) {

            }
        });
    }
}
