package com.littlered.conclusion.presenter;

import com.littlered.conclusion.model.IModel;
import com.littlered.conclusion.view.IView;

public interface IPresenter {
    void LoginPresenter(IModel iModel, IView iView);
    //mvp解绑
    void Destroy();
}
