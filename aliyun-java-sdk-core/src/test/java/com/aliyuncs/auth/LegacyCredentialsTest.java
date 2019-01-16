package com.aliyuncs.auth;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;

public class LegacyCredentialsTest {
    @SuppressWarnings("deprecation")
    @Test
    public void constructor() {
        Credential credential = mock(Credential.class);
        when(credential.getAccessKeyId()).thenReturn("ak");
        when(credential.getAccessSecret()).thenReturn("sk");
        LegacyCredentials legacyCredentials = new LegacyCredentials(credential);
        Assert.assertEquals("ak", legacyCredentials.getAccessKeyId());
        Assert.assertEquals("sk", legacyCredentials.getAccessKeySecret());
    }
}
