package com.aliyuncs.v5.http;

public enum HttpClientType {
    /**
     * define Compatiblen,HttpClient,okHttp,Custom
     */

    Compatible(com.aliyuncs.v5.http.clients.CompatibleUrlConnClient.class),
    ApacheHttpClient(com.aliyuncs.v5.http.clients.ApacheHttpClient.class),
    OkHttp(null),
    Custom(null),
    ;

    private Class<? extends IHttpClient> implClass;

    HttpClientType(Class<? extends IHttpClient> implClass) {
        this.implClass = implClass;
    }

    public Class<? extends IHttpClient> getImplClass() {
        return implClass;
    }
}
