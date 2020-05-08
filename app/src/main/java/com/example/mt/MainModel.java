package com.example.mt;

import android.util.Log;

import com.example.mt.Base.BaseModel;
import com.example.mt.Net.INetCallBack;
import com.example.mt.Net.NetWorkFactory;
import com.example.mt.Net.ParamsUtils;
import com.example.mt.Net.api.URLConstants;

import java.util.HashMap;

public class MainModel  extends BaseModel implements MainContract.IMainMode {



    public MainModel() {
    }

    @Override
    public <T> void getRecommendList(INetCallBack<T> netCallBack) {

        HashMap<String, String> commonParams = ParamsUtils.getCommonParams();
        commonParams.put("start","0");
        commonParams.put("number","0");
        commonParams.put("point_time ","0");

        for (String key: commonParams.keySet()) {
            Log.e("TAG","key="+key+",values="+commonParams.get(key));
        }

        NetWorkFactory.getInstance().getNetWork().get(URLConstants.VEDIO_LIST,commonParams ,netCallBack);



    }
}
