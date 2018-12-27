package com.aliyuncs.http;

import java.util.Map;

public class HttpRequest extends HttpMessage {

    public HttpRequest(String strUrl) {
        super(strUrl);
    }

    public HttpRequest(String strUrl, Map<String, String> tmpHeaders) {
        super(strUrl);
        if (null != tmpHeaders) { this.headers = tmpHeaders; }
    }
}
