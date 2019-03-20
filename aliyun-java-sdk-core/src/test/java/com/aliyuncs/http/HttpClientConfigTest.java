package com.aliyuncs.http;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

import static org.mockito.Mockito.mock;

public class HttpClientConfigTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void getDefaultTest() {
        HttpClientConfig httpClientConfig = HttpClientConfig.getDefault();
        Assert.assertTrue(httpClientConfig instanceof HttpClientConfig);
    }

    @Test
    public void getSetCertPath() {
        HttpClientConfig httpClientConfig = new HttpClientConfig();
        httpClientConfig.setCertPath("my/cert/path");
        Assert.assertEquals("my/cert/path", httpClientConfig.getCertPath());
    }

    @Test
    public void setSSLSocketFactory() {
        HttpClientConfig httpClientConfig = new HttpClientConfig();
        SSLSocketFactory sslSocketFactory = mock(SSLSocketFactory.class);
        httpClientConfig.setSslSocketFactory(sslSocketFactory);
        Assert.assertEquals(sslSocketFactory, httpClientConfig.getSslSocketFactory());
    }

    @Test
    public void getSetTest() {
        HttpClientConfig httpClientConfig = new HttpClientConfig();
        httpClientConfig.setClientType(HttpClientType.Custom);
        Assert.assertTrue(HttpClientType.Custom == httpClientConfig.getClientType());

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

        SecureRandom secureRandom = new SecureRandom();
        httpClientConfig.setSecureRandom(secureRandom);
        Assert.assertEquals(secureRandom, httpClientConfig.getSecureRandom());

        httpClientConfig.setMaxRequests(100);
        Assert.assertEquals(100, httpClientConfig.getMaxRequests());

        httpClientConfig.setMaxRequestsPerHost(100);
        Assert.assertEquals(100, httpClientConfig.getMaxRequestsPerHost());

        ExecutorService executorService = mock(ExecutorService.class);
        httpClientConfig.setExecutorService(executorService);
        Assert.assertEquals(executorService, httpClientConfig.getExecutorService());

        Runnable callback = mock(Runnable.class);
        httpClientConfig.setIdleCallback(callback);
        Assert.assertEquals(callback, httpClientConfig.getIdleCallback());

        httpClientConfig.setIgnoreSSLCerts(true);
        Assert.assertEquals(true, httpClientConfig.isIgnoreSSLCerts());

        httpClientConfig.setProtocolType(ProtocolType.HTTPS);
        Assert.assertEquals(ProtocolType.HTTPS, httpClientConfig.getProtocolType());

        httpClientConfig.setHttpProxy("http://www.aliyun.com");
        Assert.assertEquals("http://www.aliyun.com", httpClientConfig.getHttpProxy());

        httpClientConfig.setHttpsProxy("https://www.aliyun.com");
        Assert.assertEquals("https://www.aliyun.com", httpClientConfig.getHttpsProxy());

        httpClientConfig.setNoProxy("http://www.aliyun.com");
        Assert.assertEquals("http://www.aliyun.com", httpClientConfig.getNoProxy());

    }


}
