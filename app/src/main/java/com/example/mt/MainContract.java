package com.example.mt;

import com.example.mt.Base.BaseView;
import com.example.mt.Net.INetCallBack;

public class MainContract {

        public interface IMainView extends BaseView {

        }

        public interface IMainMode{
          <T>  void getRecommendList(INetCallBack<T> netCallBack);
        }

        public interface IMainPresenter{

            void getRecommendList();

        }
}
