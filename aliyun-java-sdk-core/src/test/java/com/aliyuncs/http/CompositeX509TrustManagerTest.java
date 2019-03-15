package com.aliyuncs.http;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class CompositeX509TrustManagerTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void getSetIgnoreSSLCert() {
        CompositeX509TrustManager trustManager = new CompositeX509TrustManager(Collections.<X509TrustManager>emptyList());
        trustManager.setIgnoreSSLCert(true);
        Assert.assertTrue(trustManager.isIgnoreSSLCert());
    }

    @Test
    public void testCheckClientTrusted() throws CertificateException {
        try {
            CompositeX509TrustManager trustManager = new CompositeX509TrustManager(Collections.<X509TrustManager>emptyList());
            trustManager.checkClientTrusted(new X509Certificate[0], "authType");
        }catch (Exception e){
            Assert.fail();
        }

    }

    @Test
    public void testCheckServerTrustedAndIgnoreSSLCert() throws CertificateException {
        try{
            CompositeX509TrustManager trustManager = new CompositeX509TrustManager(Collections.<X509TrustManager>emptyList());
            trustManager.setIgnoreSSLCert(true);
            trustManager.checkServerTrusted(new X509Certificate[0], "authType");
        }catch (Exception e){
            Assert.fail();
        }

    }

    @Test
    public void testCheckServerTrustedSucceedTwice() throws CertificateException {
        try{
            final X509TrustManager trustManager0 = mock(X509TrustManager.class);
            doThrow(CertificateException.class).when(trustManager0).checkServerTrusted(any(X509Certificate[].class), anyString());
            final X509TrustManager trustManager1 = mock(X509TrustManager.class);
            doNothing().when(trustManager0).checkServerTrusted(any(X509Certificate[].class), anyString());
            List<X509TrustManager> trustManagerList = new ArrayList<X509TrustManager>();
            trustManagerList.add(trustManager0);
            trustManagerList.add(trustManager1);
            CompositeX509TrustManager trustManager = new CompositeX509TrustManager(trustManagerList);
            trustManager.checkServerTrusted(new X509Certificate[0], "authType");
        }catch (Exception e){
            Assert.fail();
        }

    }

    @Test
    public void testCheckServerTrustedFailed() throws CertificateException {
        thrown.expect(CertificateException.class);
        final X509TrustManager trustManager0 = mock(X509TrustManager.class);
        doThrow(CertificateException.class).when(trustManager0).checkServerTrusted(any(X509Certificate[].class), anyString());
        List<X509TrustManager> trustManagerList = new ArrayList<X509TrustManager>();
        trustManagerList.add(trustManager0);
        CompositeX509TrustManager trustManager = new CompositeX509TrustManager(trustManagerList);
        trustManager.checkServerTrusted(new X509Certificate[0], "authType");
    }

    @Test
    public void testGetAcceptedIssuers() {
        final X509TrustManager trustManager0 = mock(X509TrustManager.class);
        X509Certificate certificate = mock(X509Certificate.class);
        when(trustManager0.getAcceptedIssuers()).thenReturn(new X509Certificate[]{certificate});
        List<X509TrustManager> trustManagerList = new ArrayList<X509TrustManager>();
        trustManagerList.add(trustManager0);
        CompositeX509TrustManager trustManager = new CompositeX509TrustManager(trustManagerList);
        X509Certificate[] res = trustManager.getAcceptedIssuers();
        Assert.assertEquals(1, res.length);
        Assert.assertEquals(certificate, res[0]);
    }
}
