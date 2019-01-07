package com.aliyuncs.http;

import com.aliyuncs.http.clients.CompatibleUrlConnClient;
import com.aliyuncs.profile.DefaultProfile;
import org.junit.Assert;
import org.junit.Test;

import static com.aliyuncs.http.HttpClientFactory.HTTP_CLIENT_IMPL_KEY;

public class HttpClientFactoryTest {

    @Test
    public void buildClientTest() {
        HttpClientFactory factory = new HttpClientFactory();
        DefaultProfile profile = DefaultProfile.getProfile("hangzhou", "test", "test");
        HttpClientConfig config = new HttpClientConfig();
        config.setCompatibleMode(true);
        profile.setHttpClientConfig(config);
        IHttpClient client = factory.buildClient(profile);
        Assert.assertTrue(client instanceof CompatibleUrlConnClient);

        config.setCustomClientClassName(CompatibleUrlConnClient.class.getName());
        config.setCompatibleMode(false);
        config.setClientType(HttpClientType.Custom);
        profile.setHttpClientConfig(config);
        client = factory.buildClient(profile);
        Assert.assertTrue(client instanceof CompatibleUrlConnClient);

        profile.setHttpClientConfig(null);
        client = HttpClientFactory.buildClient(profile);
        Assert.assertTrue(client instanceof CompatibleUrlConnClient);

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
