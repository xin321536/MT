package com.example.mt.Home.model;

import android.util.Log;

import com.example.mt.Home.contract.RecommendContract;
import com.example.mt.Net.INetCallBack;
import com.example.mt.Net.NetWorkFactory;
import com.example.mt.Net.ParamsUtils;
import com.example.mt.Net.api.URLConstants;

import java.util.HashMap;

public class RecommendModel implements RecommendContract.IRecommendMode {

    @Override
    public <T> void getRecommendList(String id, INetCallBack<T> iNetCallBack) {


    }

    @Override
    public <T> void getColumList(INetCallBack<T> iNetCallBack) {

        HashMap<String, String> commonParams = ParamsUtils.getCommonParams();
//        commonParams.put("token","");

        for (String key: commonParams.keySet()) {
            Log.e("TAG","key="+key+",values="+commonParams.get(key));
        }

        NetWorkFactory.getInstance().getNetWork().get(URLConstants.COLUM_LIST,commonParams,iNetCallBack);


    }
}
