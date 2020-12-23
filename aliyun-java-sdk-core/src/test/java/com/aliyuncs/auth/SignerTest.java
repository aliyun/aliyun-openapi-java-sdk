package com.aliyuncs.auth;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class SignerTest {
    @Test
    public void getSignerReturnSha256WithRSASigner() {
        AlibabaCloudCredentials credentials = mock(KeyPairCredentials.class);
        Signer signer = Signer.getSigner(credentials, "");
        Assert.assertTrue(SHA256withRSASigner.class.isAssignableFrom(signer.getClass()));
    }

    @Test
    public void getSignerReturnBearerTokenSigner() {
        AlibabaCloudCredentials credentials = mock(BearerTokenCredentials.class);
        Signer signer = Signer.getSigner(credentials, "");
        Assert.assertTrue(BearerTokenSigner.class.isAssignableFrom(signer.getClass()));
    }

    @Test
    public void getSignerReturnHmacSHA1Signer() {
        AlibabaCloudCredentials credentials = mock(AlibabaCloudCredentials.class);
        Signer signer = Signer.getSigner(credentials, "");
        Assert.assertTrue(HmacSHA1Signer.class.isAssignableFrom(signer.getClass()));
    }

    @Test
    public void getSignerReturnHmacSM3Signer() {
        AlibabaCloudCredentials credentials = mock(AlibabaCloudCredentials.class);
        Signer signer = Signer.getSigner(credentials, "HMAC-SM3");
        Assert.assertTrue(HmacSM3Signer.class.isAssignableFrom(signer.getClass()));
    }
}
