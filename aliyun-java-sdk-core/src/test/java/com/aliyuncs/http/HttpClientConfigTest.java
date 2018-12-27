package com.aliyuncs.http;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

public class HttpClientConfigTest {

    @Test
    public void getDefaultTest() {
        HttpClientConfig httpClientConfig = HttpClientConfig.getDefault();
        Assert.assertTrue(httpClientConfig instanceof HttpClientConfig);
    }

    @Test
    public void getSetTest() {
        HttpClientConfig httpClientConfig = new HttpClientConfig();
        httpClientConfig.setClientType(HttpClientType.Custom);
        Assert.assertTrue(HttpClientType.Custom == httpClientConfig.getClientType());

        httpClientConfig.setCertPath("test");
        Assert.assertEquals("test", httpClientConfig.getCertPath());

        httpClientConfig.setExtParams(new HashMap<String, Object>());
        Assert.assertTrue(httpClientConfig.getExtParams() instanceof Map);

        httpClientConfig.setExtParam("test", "test");
        Assert.assertEquals("test", httpClientConfig.getExtParam("test"));
        Assert.assertTrue(httpClientConfig.containsExtParam("test"));

        httpClientConfig.setMaxIdleConnections(88);
        Assert.assertEquals(88, httpClientConfig.getMaxIdleConnections());

        httpClientConfig.setMaxIdleTimeMillis(66L);
        Assert.assertEquals(66L, httpClientConfig.getMaxIdleTimeMillis());

        httpClientConfig.setKeepAliveDurationMillis(66L);
        Assert.assertEquals(66L, httpClientConfig.getKeepAliveDurationMillis());

        httpClientConfig.setConnectionTimeoutMillis(66L);
        Assert.assertEquals(66L, httpClientConfig.getConnectionTimeoutMillis());

        httpClientConfig.setReadTimeoutMillis(88L);
        Assert.assertEquals(88L, httpClientConfig.getReadTimeoutMillis());

        httpClientConfig.setWriteTimeoutMillis(88L);
        Assert.assertEquals(88L, httpClientConfig.getWriteTimeoutMillis());

        httpClientConfig.setSslSocketFactory((SSLSocketFactory) SSLSocketFactory.getDefault());
        Assert.assertTrue(httpClientConfig.getSslSocketFactory() instanceof SSLSocketFactory);

        httpClientConfig.setKeyManagers(new KeyManager[1]);
        Assert.assertNull(httpClientConfig.getKeyManagers()[0]);

        httpClientConfig.setX509TrustManagers(new X509TrustManager[1]);
        Assert.assertNull(httpClientConfig.getX509TrustManagers()[0]);

        httpClientConfig.setSecureRandom(new SecureRandom());
        Assert.assertTrue(httpClientConfig.getSecureRandom() instanceof SecureRandom);

        httpClientConfig.setHostnameVerifier(new NoopHostnameVerifier());
        Assert.assertTrue(httpClientConfig.getHostnameVerifier() instanceof NoopHostnameVerifier);

        httpClientConfig.setMaxRequests(66);
        Assert.assertEquals(66, httpClientConfig.getMaxRequests());

        httpClientConfig.setMaxRequestsPerHost(66);
        Assert.assertEquals(66, httpClientConfig.getMaxRequestsPerHost());

        httpClientConfig.setIdleCallback(new Runnable() {
            @Override
            public void run() {

            }
        });
        Assert.assertTrue(httpClientConfig.getIdleCallback() instanceof Runnable);

        Executors.newFixedThreadPool(1);

        httpClientConfig.setExecutorService(null);
        Assert.assertNull(httpClientConfig.getExecutorService());

        httpClientConfig.setIgnoreSSLCerts(true);
        Assert.assertTrue(httpClientConfig.isIgnoreSSLCerts());

        httpClientConfig.setCompatibleMode(false);
        Assert.assertFalse(httpClientConfig.isCompatibleMode());

        httpClientConfig.setProtocolType(ProtocolType.HTTP);
        Assert.assertTrue(ProtocolType.HTTP == httpClientConfig.getProtocolType());

        httpClientConfig.setCustomClientClassName("test");
        Assert.assertEquals("test", httpClientConfig.getCustomClientClassName());
    }


}
