package com.example.mt.Home.presenter;


import com.example.mt.Base.BasePresenter;
import com.example.mt.Home.bean.NewsBean;
import com.example.mt.Home.contract.NewsFragmentContract;
import com.example.mt.Home.contract.RecommendContract;
import com.example.mt.Home.model.NewsModel;
import com.example.mt.Net.INetCallBack;

public class NewsPresenter extends BasePresenter<NewsFragmentContract.INewsView> implements RecommendContract.IRecommendPresenter {
    private NewsFragmentContract.INewsMode iNewsMode;

    @Override
    public void getColumList() {

    }

    public NewsPresenter() {

        iNewsMode = new NewsModel();

    }

    @Override
    public void getRecommendList(String id) {
        iNewsMode.getRecommendList(id,new INetCallBack<NewsBean>() {
            @Override
            public void onSuccess(NewsBean newsBean) {

                mview.setRecommendList(newsBean);
            }

            @Override
            public void onError(Throwable throwable) {

            }
        });


    }
}
