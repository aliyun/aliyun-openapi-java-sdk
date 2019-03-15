package com.aliyuncs.utils;

public class EnvironmentUtils {

    private static volatile String httpProxy;
    private static volatile String httpsProxy;

    public static String getHttpProxy() {
        if (null == httpProxy) {
            return System.getenv("HTTP_PROXY");
        } else {
            return httpProxy;
        }
    }

    public static void setHttpProxy(String httpProxy) {
        EnvironmentUtils.httpProxy = httpProxy;
    }

    public static String getHttpsProxy() {
        if (null == httpsProxy) {
            return System.getenv("HTTPS_PROXY");
        } else {
            return httpsProxy;
        }
    }

    public static void setHttpsProxy(String httpsProxy) {
        EnvironmentUtils.httpsProxy = httpsProxy;
    }


}
