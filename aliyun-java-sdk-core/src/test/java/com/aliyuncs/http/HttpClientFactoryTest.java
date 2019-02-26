package com.aliyuncs.http;

import static com.aliyuncs.http.HttpClientFactory.HTTP_CLIENT_IMPL_KEY;

import com.aliyuncs.http.clients.ApacheHttpClient;
import org.junit.Assert;
import org.junit.Test;

import com.aliyuncs.http.clients.CompatibleUrlConnClient;
import com.aliyuncs.profile.DefaultProfile;

public class HttpClientFactoryTest {

    @Test
    public void testHttpClientFactoryContructor() {
        HttpClientFactory factory = new HttpClientFactory();
        Assert.assertTrue(factory instanceof HttpClientFactory);
    }

    @Test
    public void buildClientTest() {
        DefaultProfile profile = DefaultProfile.getProfile("hangzhou", "test", "test");
        HttpClientConfig config = new HttpClientConfig();
        config.setCompatibleMode(true);
        profile.setHttpClientConfig(config);
        IHttpClient client = HttpClientFactory.buildClient(profile);
        Assert.assertTrue(client instanceof CompatibleUrlConnClient);

        config.setCustomClientClassName(CompatibleUrlConnClient.class.getName());
        config.setCompatibleMode(false);
        config.setClientType(HttpClientType.Custom);
        profile.setHttpClientConfig(config);
        client = HttpClientFactory.buildClient(profile);
        Assert.assertTrue(client instanceof CompatibleUrlConnClient);

        config.setClientType(HttpClientType.Compatible);
        client = HttpClientFactory.buildClient(profile);
        Assert.assertTrue(client instanceof CompatibleUrlConnClient);

        config.setCustomClientClassName(null);
        client = HttpClientFactory.buildClient(profile);
        Assert.assertTrue(client instanceof CompatibleUrlConnClient);

        try {
            config.setClientType(HttpClientType.Custom);
            client = HttpClientFactory.buildClient(profile);
            Assert.fail();
        } catch (IllegalStateException e) {
            Assert.assertEquals("HttpClientFactory buildClient failed", e.getMessage());
        }

        profile.setHttpClientConfig(null);
        client = HttpClientFactory.buildClient(profile);
        Assert.assertTrue(client instanceof ApacheHttpClient);

        try {
            System.setProperty(HTTP_CLIENT_IMPL_KEY, "com.aliyuncs.http.HttpClientFactory");
            client = HttpClientFactory.buildClient(profile);
            Assert.fail();
        } catch (IllegalStateException e) {
            Assert.assertEquals("HttpClientFactory buildClient failed", e.getMessage());
        } finally {
            System.clearProperty(HTTP_CLIENT_IMPL_KEY);
        }
    }

}
