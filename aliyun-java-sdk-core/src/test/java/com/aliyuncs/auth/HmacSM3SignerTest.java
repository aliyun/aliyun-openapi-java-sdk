package com.aliyuncs.auth;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HmacSM3SignerTest {
    @Test
    public void getSignerName() {
        HmacSM3Signer signer = new HmacSM3Signer();
        Assert.assertEquals("HMAC-SM3", signer.getSignerName());
    }

    @Test
    public void getSignerVersion() {
        HmacSM3Signer signer = new HmacSM3Signer();
        Assert.assertEquals("1.0", signer.getSignerVersion());
    }

    @Test
    public void getSignerType() {
        HmacSM3Signer signer = new HmacSM3Signer();
        Assert.assertNull(signer.getSignerType());
    }

    @Test
    public void signStringWithSK() {
        String stringToSign = "abc~!@#";
        String sk = "sk#$!~~~";
        HmacSM3Signer signer = new HmacSM3Signer();
        String signedString = signer.signString(stringToSign, sk);
        Assert.assertEquals("TwTOXs79k5EYtFGxo6ghhzWT9S5ZPuT2+SSqD1w26Qw=", signedString);
    }

    @Test
    public void signStringWithCredentials() {
        String stringToSign = "abc~!@#";
        String sk = "sk#$!~~~";
        AlibabaCloudCredentials credentials = mock(AlibabaCloudCredentials.class);
        when(credentials.getAccessKeySecret()).thenReturn(sk);
        HmacSM3Signer signer = new HmacSM3Signer();
        String signedString = signer.signString(stringToSign, credentials);
        Assert.assertEquals("TwTOXs79k5EYtFGxo6ghhzWT9S5ZPuT2+SSqD1w26Qw=", signedString);
    }
}
