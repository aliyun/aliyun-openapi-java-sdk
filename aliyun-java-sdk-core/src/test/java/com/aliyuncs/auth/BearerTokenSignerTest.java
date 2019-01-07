package com.aliyuncs.auth;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class BearerTokenSignerTest {
    @Test
    public void signStringTestWithCredentials() {
        String stringToSign = "abc";
        AlibabaCloudCredentials credentials = mock(AlibabaCloudCredentials.class);
        BearerTokenSigner signer = new BearerTokenSigner();
        Assert.assertNull(signer.signString(stringToSign, credentials));
    }

    @Test
    public void signStringTestWithSK() {
        String stringToSign = "abc";
        String sk = "sk";
        BearerTokenSigner signer = new BearerTokenSigner();
        Assert.assertNull(signer.signString(stringToSign, sk));
    }

    @Test
    public void getSingerName() {
        BearerTokenSigner signer = new BearerTokenSigner();
        Assert.assertNull(signer.getSignerName());
    }

    @Test
    public void getSingerVersion() {
        BearerTokenSigner signer = new BearerTokenSigner();
        Assert.assertNull(signer.getSignerVersion());
    }

    @Test
    public void getSingerType() {
        BearerTokenSigner signer = new BearerTokenSigner();
        Assert.assertEquals("BEARERTOKEN", signer.getSignerType());
    }
}
