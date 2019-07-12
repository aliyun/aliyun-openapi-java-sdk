package com.aliyuncs.http;

import java.io.InputStream;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class TimeoutResolveTest {
    protected static final String TIMEOUT_CONFIG = "timeout_config.json";

    private JsonObject timeoutConfigData;

    @Before
    public void getTimeoutConfigData() {
        ClassLoader classLoader = TimeoutResolve.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream(TIMEOUT_CONFIG);
        Scanner scanner = new Scanner(is, "UTF-8");
        scanner.useDelimiter("\0");
        String jsonStr = scanner.hasNext() ? scanner.next() : "";
        scanner.close();
        timeoutConfigData = (new JsonParser()).parse(jsonStr).getAsJsonObject();
    }

    @Test
    public void testResolveTimeout() {
        IClientProfile profile = DefaultProfile.getProfile();
        TimeoutResolve resolve = new TimeoutResolve();
        HttpRequest request = new HttpRequest("test.com");
        resolve.resolveTimeout(request, profile, "xxx", "2014-05-26", "AddTags");
        Assert.assertTrue(request.getSysConnectTimeout().longValue() == HttpClientConfig.DEFAULT_CONNECTION_TIMEOUT);
        Assert.assertTrue(request.getSysReadTimeout().longValue() == HttpClientConfig.DEFAULT_READ_TIMEOUT);

        request = new HttpRequest("test.com");
        resolve.resolveTimeout(request, profile, "ecs", "2014-05-26", "AddTags");
        long apiReadTimeout = timeoutConfigData.get("ecs").getAsJsonObject().get("2014-05-26").getAsJsonObject().get(
                "AddTags").getAsLong() * 1000;
        Assert.assertTrue(request.getSysConnectTimeout().longValue() == HttpClientConfig.DEFAULT_CONNECTION_TIMEOUT);
        Assert.assertTrue(request.getSysReadTimeout().longValue() == apiReadTimeout);

        request = new HttpRequest("test.com");
        HttpClientConfig config = new HttpClientConfig();
        config.setConnectionTimeoutMillis(12345);
        config.setReadTimeoutMillis(45678);
        profile.setHttpClientConfig(config);
        resolve.resolveTimeout(request, profile, "ecs", "2014-05-26", "AddTags");
        Assert.assertTrue(request.getSysConnectTimeout().longValue() == 12345);
        Assert.assertTrue(request.getSysReadTimeout().longValue() == 45678);

        request = new HttpRequest("test.com");
        request.setSysConnectTimeout(3000);
        request.setSysReadTimeout(4000);
        resolve.resolveTimeout(request, profile, "ecs", "2014-05-26", "AddTags");
        Assert.assertTrue(request.getSysConnectTimeout().longValue() == 3000);
        Assert.assertTrue(request.getSysReadTimeout().longValue() == 4000);
    }
}
