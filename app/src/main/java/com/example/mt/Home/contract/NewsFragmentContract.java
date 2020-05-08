package com.example.mt.Home.contract;

import com.example.mt.Base.BaseView;
import com.example.mt.Home.bean.NewsBean;
import com.example.mt.Net.INetCallBack;

public class NewsFragmentContract {


    public interface INewsView extends BaseView {
        void  setRecommendList(NewsBean newsBean);
    }
    public interface INewsMode{
        <T> void getRecommendList(String tabID, INetCallBack<T> iNetCallBack);
    }
    public interface INewsPresenter{
        void getRecommend(String string);
    }
}
