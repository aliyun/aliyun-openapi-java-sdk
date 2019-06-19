package com.aliyuncs.http;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class X509TrustAllTest {

    @Before
    public void createInstance(){
       new X509TrustAll();
    }

    @Test
    public void x509TrustAllTest(){
        X509TrustAll.ignoreSSLCertificate();
        X509TrustAll.ignoreSSLCertificate(null);
        Assert.assertTrue(X509TrustAll.ignoreSSLCerts);

        X509TrustAll.restoreSSLCertificate();
        X509TrustAll.restoreSSLCertificate(null);
        Assert.assertFalse(X509TrustAll.ignoreSSLCerts);
    }
}
