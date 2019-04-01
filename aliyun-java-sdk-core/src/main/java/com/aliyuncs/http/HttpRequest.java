package com.aliyuncs.http;

import lombok.ToString;

import java.util.Map;

@ToString(callSuper = true)
public class HttpRequest extends HttpMessage {

    public HttpRequest(String strUrl) {
        super(strUrl);
    }

    public HttpRequest(String strUrl, Map<String, String> tmpHeaders) {
        super(strUrl);
        if (null != tmpHeaders) {
            this.headers = tmpHeaders;
        }
    }
}
