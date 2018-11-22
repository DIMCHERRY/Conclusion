package com.littlered.conclusion.presenter;

import com.littlered.conclusion.model.IModel;
import com.littlered.conclusion.view.IImageListView;
import com.littlered.conclusion.view.IRegisterView;
import com.littlered.conclusion.view.IView;

public interface IPresenter {
    void LoginPresenter(IModel iModel, IView iView);
    void RegisterPresenter(IModel iModel, IRegisterView iView);
    void ImagePresenter(IModel iModel, IImageListView iImageListView);
    //mvp解绑
}
