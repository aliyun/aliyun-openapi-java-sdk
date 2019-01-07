package com.aliyuncs.http;

import com.aliyuncs.http.clients.CompatibleUrlConnClient;

public enum HttpClientType {

    Compatible(CompatibleUrlConnClient.class),
    ApacheHttpClient(com.aliyuncs.http.clients.ApacheHttpClient.class),
    OkHttp(null),
    Custom(null),;

    private Class<? extends IHttpClient> implClass;

    HttpClientType(Class<? extends IHttpClient> implClass) {
        this.implClass = implClass;
    }

    public Class<? extends IHttpClient> getImplClass() {
        return implClass;
    }
}
