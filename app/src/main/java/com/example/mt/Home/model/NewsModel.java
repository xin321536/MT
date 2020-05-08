package com.example.mt.Home.model;

import android.util.Log;

import com.example.mt.Home.contract.NewsFragmentContract;
import com.example.mt.Net.INetCallBack;
import com.example.mt.Net.NetWorkFactory;
import com.example.mt.Net.ParamsUtils;
import com.example.mt.Net.api.URLConstants;

import java.util.HashMap;

public class NewsModel implements NewsFragmentContract.INewsMode {
    @Override
    public <T> void getRecommendList(String tabID, INetCallBack<T> iNetCallBack) {
        HashMap<String, String> commonParams = ParamsUtils.getCommonParams();
        commonParams.put("id",tabID);
        commonParams.put("start","0");
        commonParams.put("number ","0");
        commonParams.put("point_time","0");
        for (String key: commonParams.keySet()) {
            Log.e("TAG","key="+key+",values="+commonParams.get(key));
        }
        NetWorkFactory.getInstance().getNetWork().get(URLConstants.RECOMMEND_LIST,commonParams,iNetCallBack);

    }
}
