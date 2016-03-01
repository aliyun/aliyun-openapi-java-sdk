package com.aliyuncs.cms.transform.v20151020;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fray.yangb-然诺 on 15/10/22.
 */
public final class JSONParser {
    public static List<JSONObject> parseJSONArray(UnmarshallerContext context, int length) {
        List<JSONObject> datapoints = new ArrayList<JSONObject>(length);
        HttpResponse response = context.getHttpResponse();
        try {
            JSONObject json = JSON.parseObject(new String(response.getContent(), "UTF-8"));
            if(json==null)return datapoints;
            JSONObject dpjs = json.getJSONObject("Datapoints");
            if(dpjs==null){return datapoints;}
            JSONArray array = dpjs.getJSONArray("Datapoint");
            if(array==null){return datapoints;}
            for (int i = 0; i < length; i++) {
                datapoints.add(array.getJSONObject(i));
            }
        } catch (UnsupportedEncodingException e) {
        }
        return datapoints;
    }


    public static List<JSONObject> parseJSONArray(UnmarshallerContext context) {
        try {
            String contont = new String(context.getHttpResponse().getContent(),"UTF-8");
            JSONObject json = JSON.parseObject(contont);
            JSONArray array = json.getJSONArray("Datapoints");
            if(array!=null) {
                List<JSONObject> datapoints = new ArrayList<JSONObject>(array.size());
                for (int i = 0; i < array.size(); i++) {
                    datapoints.add(array.getJSONObject(i));
                }
                return datapoints;
            }
        } catch (UnsupportedEncodingException e) {
        }

        return null;
    }
}
