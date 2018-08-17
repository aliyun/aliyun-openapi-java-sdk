package com.aliyuncs.utils;

import com.aliyuncs.http.X509TrustAll;

public class SslUtils {

    public static void ignoreSsl() throws Exception {
        X509TrustAll.ignoreSSLCertificate();
    }

}