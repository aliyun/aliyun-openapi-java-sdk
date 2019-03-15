package com.aliyuncs.http;

import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CompositeX509TrustManager implements X509TrustManager {

    private final List<X509TrustManager> trustManagers;

    private boolean ignoreSSLCert = false;

    public boolean isIgnoreSSLCert() {
        return ignoreSSLCert;
    }

    public void setIgnoreSSLCert(boolean ignoreSSLCert) {
        this.ignoreSSLCert = ignoreSSLCert;
    }

    public CompositeX509TrustManager(List<X509TrustManager> trustManagers) {
        this.trustManagers = trustManagers;
    }

    @Override
    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        // do nothing
    }

    @Override
    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        if (ignoreSSLCert) {
            return;
        }
        for (X509TrustManager trustManager : trustManagers) {
            try {
                trustManager.checkServerTrusted(chain, authType);
                return; // someone trusts them. success!
            } catch (CertificateException e) {
                // maybe someone else will trust them
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        List<X509Certificate> certificates = new ArrayList<X509Certificate>();
        for (X509TrustManager trustManager : trustManagers) {
            certificates.addAll(Arrays.asList(trustManager.getAcceptedIssuers()));
        }
        X509Certificate[] certificatesArray = new X509Certificate[certificates.size()];
        return certificates.toArray(certificatesArray);
    }

}
