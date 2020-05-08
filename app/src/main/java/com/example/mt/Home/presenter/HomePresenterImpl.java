package com.example.mt.Home.presenter;


import com.example.mt.Base.BasePresenter;
import com.example.mt.Home.bean.User;
import com.example.mt.Home.contract.HomeContract;
import com.example.mt.Home.model.HomeModelImpl;
import com.example.mt.Home.view.HomeActivity;
import com.example.mt.Net.INetCallBack;

public class HomePresenterImpl extends BasePresenter<HomeActivity> implements HomeContract.IHomePresenter {

    private HomeContract.IHomeMode  iHomeMode;
//    private HomeContract.IHomeView iHomeView;

    public HomePresenterImpl() {
        iHomeMode = new HomeModelImpl(this);
    }
    @Override
    public void callHomeBannview(String string) {
//        P层中拿到数据
        mview.setBannView(string);
    }
    @Override
    public void getBannerView() {
        iHomeMode.getHomeBannview(new INetCallBack<User>() {
            @Override
            public void onSuccess(User user) {

            }

            @Override
            public void onError(Throwable throwable) {

            }
        });
    }

    @Override
    public void getHomeTabList() {

    }

   /* @Override
    public void disAttachView() {
        iHomeMode = null;
        iHomeView = null;
    }*/
}
