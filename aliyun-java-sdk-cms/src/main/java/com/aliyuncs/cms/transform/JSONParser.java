package com.aliyuncs.cms.transform;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yichun.zyc on 2016/9/25.
 */
public class JSONParser {
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
    
    public static List<JSONObject> parseJSONArray(UnmarshallerContext context, String arrayKey) {
        try {
            String contont = new String(context.getHttpResponse().getContent(),"UTF-8");
            JSONObject json = JSON.parseObject(contont);
            JSONArray array = json.getJSONArray(arrayKey);
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
    
    public static JSONObject parseJSONObject(UnmarshallerContext context, String key) {
        try {
            String contont = new String(context.getHttpResponse().getContent(),"UTF-8");
            JSONObject json = JSON.parseObject(contont);
            JSONObject jsonObject = json.getJSONObject(key);
            return jsonObject;
        } catch (UnsupportedEncodingException e) {
        }

        return null;
    }

    public static <T> T parseResult(UnmarshallerContext context, Class<T> clazz) {
        try {
            String contont = new String(context.getHttpResponse().getContent(),"UTF-8");
            JSONObject json = JSON.parseObject(contont);
            return json.getObject("Result", clazz);
        } catch (UnsupportedEncodingException e) {
        }

        return null;
    }

    public static List<String> parseStringArray(UnmarshallerContext context) {
        try {
            String contont = new String(context.getHttpResponse().getContent(),"UTF-8");
            JSONObject json = JSON.parseObject(contont);
            JSONArray array = json.getJSONArray("Datapoints");
            if(array!=null) {
                List<String> datapoints = new ArrayList<String>(array.size());
                for (int i = 0; i < array.size(); i++) {
                    datapoints.add(array.getString(i));
                }
                return datapoints;
            }
        } catch (UnsupportedEncodingException e) {
        }

        return null;
    }
}
