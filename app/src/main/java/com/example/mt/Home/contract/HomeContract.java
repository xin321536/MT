package com.example.mt.Home.contract;

import com.example.mt.Base.BaseView;
import com.example.mt.Net.INetCallBack;

public class HomeContract {

        public interface IHomeView extends BaseView {

            void setBannView(String string);

            void setTabList(String string);

        }
        public interface IHomeMode{
           <T> void getHomeBannview(INetCallBack<T> iNetCallBack);
            <T> void getHomeTabList(INetCallBack<T> iNetCallBack);
        }
        public interface IHomePresenter{
            void callHomeBannview(String string);
            void getBannerView();
            void getHomeTabList();
        }
}
