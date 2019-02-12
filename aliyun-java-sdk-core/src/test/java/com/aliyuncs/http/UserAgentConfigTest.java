package com.aliyuncs.http;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class UserAgentConfigTest {

    @Test
    public void appendGetTest() {
        UserAgentConfig userAgentConfig = new UserAgentConfig();
        userAgentConfig.append("Test", "1.2.2");
        userAgentConfig.append("Test", null);
        userAgentConfig.append("Test", "");
        userAgentConfig.append("", "1.2.2");
        userAgentConfig.append(null, "1.2.2");
        Map<String, String> map = userAgentConfig.getSysUserAgentsMap();
        Assert.assertEquals("1.2.2", map.get("Test"));
        Assert.assertNull(map.get(null));
        Assert.assertNull(map.get(""));
    }

    @Test
    public void resolveTest() {
        UserAgentConfig userAgentConfig = new UserAgentConfig();
        String agent = UserAgentConfig.resolve(userAgentConfig, null);
        Assert.assertEquals(UserAgentConfig.getDefaultMessage(), agent);

        agent = UserAgentConfig.resolve(null, userAgentConfig);
        Assert.assertEquals(UserAgentConfig.getDefaultMessage(), agent);

        userAgentConfig.append("test", "8.8.8");
        userAgentConfig.append("Java", "8");
        String reaultStr = UserAgentConfig.getDefaultMessage() + " test/8.8.8";

        agent = UserAgentConfig.resolve(null, userAgentConfig);
        Assert.assertEquals(reaultStr, agent);

        agent = UserAgentConfig.resolve(userAgentConfig, null);
        Assert.assertEquals(reaultStr, agent);

        agent = UserAgentConfig.resolve(null, null);
        Assert.assertEquals(UserAgentConfig.getDefaultMessage(), agent);

        UserAgentConfig requestUserAgentConfig = new UserAgentConfig();
        requestUserAgentConfig.append("requestUserAgentConfig", "8.8.8");
        requestUserAgentConfig.append("test", "6.6.6");
        reaultStr = UserAgentConfig.getDefaultMessage()+" test/6.6.6 requestUserAgentConfig/8.8.8";
        agent = UserAgentConfig.resolve(requestUserAgentConfig, userAgentConfig);
        Assert.assertEquals(reaultStr, agent);
    }
}
