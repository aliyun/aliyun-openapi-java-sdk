/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.http;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public final class X509TrustAll implements X509TrustManager, HostnameVerifier {

    private static HostnameVerifier defaultVerifier;
    private static SSLSocketFactory defaultSSLFactory;

    @Override
    public boolean verify(String hostname, SSLSession session) {
        return true;
    }

    @Override
    public void checkClientTrusted(X509Certificate[] arg0, String arg1)
        throws CertificateException {
    }

    @Override
    public void checkServerTrusted(X509Certificate[] arg0, String arg1)
        throws CertificateException {
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }

    public static void restoreSSLCertificate() {
        if (null != defaultSSLFactory) {
            HttpsURLConnection.setDefaultSSLSocketFactory(defaultSSLFactory);
            HttpsURLConnection.setDefaultHostnameVerifier(defaultVerifier);
        }
    }

    public static void ignoreSSLCertificate() {
        try {
            X509TrustAll trustAll = new X509TrustAll();
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, new TrustManager[] {trustAll}, new java.security.SecureRandom());
            if (null == defaultSSLFactory) {
                defaultSSLFactory = HttpsURLConnection.getDefaultSSLSocketFactory();
                defaultVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
            }
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
            HttpsURLConnection.setDefaultHostnameVerifier(trustAll);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Failed setting up all thrusting certificate manager.", e);
        } catch (KeyManagementException e) {
            throw new RuntimeException("Failed setting up all thrusting certificate manager.", e);
        }
    }
}
