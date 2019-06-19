package com.aliyuncs.http;

import com.aliyuncs.IAcsClient;

@Deprecated
public final class X509TrustAll {

    public static boolean ignoreSSLCerts = false;

    @Deprecated
    public static void restoreSSLCertificate() {
        ignoreSSLCerts = false;
    }

    @Deprecated
    public static void ignoreSSLCertificate() {
        ignoreSSLCerts = true;
    }
    @Deprecated
    public static void restoreSSLCertificate(IAcsClient client) {
        ignoreSSLCerts = false;
    }
    @Deprecated
    public static void ignoreSSLCertificate(IAcsClient client) {
        ignoreSSLCerts = true;
    }

}
