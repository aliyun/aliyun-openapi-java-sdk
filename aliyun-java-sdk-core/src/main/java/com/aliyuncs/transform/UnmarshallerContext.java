package com.aliyuncs.transform;

import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.utils.FlattenMapUtil;

import java.util.List;
import java.util.Map;

public class UnmarshallerContext {
    private int httpStatus;
    private Map<String, String> responseMap;
    private HttpResponse httpResponse;

    public Integer integerValue(String key) {
        String value = responseMap.get(key);
        if (null == value || 0 == value.length()) {
            return null;
        }
        return Integer.valueOf(value);
    }

    public String stringValue(String key) {
        return responseMap.get(key);
    }

    public Long longValue(String key) {
        String value = responseMap.get(key);
        if (null == value || 0 == value.length()) {
            return null;
        }
        return Long.valueOf(responseMap.get(key));
    }

    public Boolean booleanValue(String key) {
        String value = responseMap.get(key);
        if (null == value || 0 == value.length()) {
            return null;
        }
        return Boolean.valueOf(responseMap.get(key));
    }

    public Float floatValue(String key) {
        String value = responseMap.get(key);
        if (null == value || 0 == value.length()) {
            return null;
        }
        return Float.valueOf(responseMap.get(key));
    }

    public Double doubleValue(String key) {
        String value = responseMap.get(key);
        if (null == value || 0 == value.length()) {
            return null;
        }
        return Double.valueOf(responseMap.get(key));
    }

    public int lengthValue(String key) {
        String value = responseMap.get(key);
        if (null == value || 0 == value.length()) {
            return 0;
        }
        return Integer.valueOf(responseMap.get(key));
    }

    public List<Map<Object, Object>> listMapValue(String key) {
        return FlattenMapUtil.toListMap(responseMap, key);
    }

    public Map<Object, Object> mapValue(String key) {
        return FlattenMapUtil.toMap(responseMap, key);
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public Map<String, String> getResponseMap() {
        return responseMap;
    }

    public void setResponseMap(Map<String, String> responseMap) {
        this.responseMap = responseMap;
    }

    public HttpResponse getHttpResponse() {
        return httpResponse;
    }

    public void setHttpResponse(HttpResponse httpResponse) {
        this.httpResponse = httpResponse;
    }

}
