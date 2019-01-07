package com.aliyuncs.auth;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BasicCredentialsTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorNormal() {
        BasicCredentials credentials = new BasicCredentials("ak", "sk");
        Assert.assertEquals("ak", credentials.getAccessKeyId());
        Assert.assertEquals("sk", credentials.getAccessKeySecret());
    }

    @Test
    public void constructorNullAk() {
        thrown.expect(IllegalArgumentException.class);
        BasicCredentials credentials = new BasicCredentials(null, "sk");
        Assert.assertNull(credentials);
    }

    @Test
    public void constructorNullsk() {
        thrown.expect(IllegalArgumentException.class);
        BasicCredentials credentials = new BasicCredentials("ak", null);
        Assert.assertNull(credentials);
    }
}
