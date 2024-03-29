package com.aliyuncs.auth.signers;

import com.aliyuncs.auth.AlibabaCloudCredentials;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HmacSHA1SignerTest {
    @Test
    public void getSignerName() {
        HmacSHA1Signer signer = new HmacSHA1Signer();
        Assert.assertEquals("HMAC-SHA1", signer.getSignerName());
    }

    @Test
    public void getSignerVersion() {
        HmacSHA1Signer signer = new HmacSHA1Signer();
        Assert.assertEquals("1.0", signer.getSignerVersion());
    }

    @Test
    public void getSignerType() {
        HmacSHA1Signer signer = new HmacSHA1Signer();
        Assert.assertNull(signer.getSignerType());
    }

    @Test
    public void signStringWithSK() {
        String stringToSign = "abc~!@#";
        String sk = "sk#$!~~~";
        HmacSHA1Signer signer = new HmacSHA1Signer();
        String signedString = signer.signString(stringToSign, sk);
        Assert.assertEquals("7eV3A584uvdgKVk8Ck8r9ukg1gE=", signedString);
    }

    @Test
    public void signStringWithCredentials() {
        String stringToSign = "abc~!@#";
        String sk = "sk#$!~~~";
        AlibabaCloudCredentials credentials = mock(AlibabaCloudCredentials.class);
        when(credentials.getAccessKeySecret()).thenReturn(sk);
        HmacSHA1Signer signer = new HmacSHA1Signer();
        String signedString = signer.signString(stringToSign, credentials);
        Assert.assertEquals("7eV3A584uvdgKVk8Ck8r9ukg1gE=", signedString);
    }

    @Test
    public void hash() {
        HmacSHA1Signer signer = new HmacSHA1Signer();
        try {
            Assert.assertNull(signer.hash("".getBytes("UTF-8")));
        } catch (NoSuchAlgorithmException e) {
            Assert.fail();
        } catch (UnsupportedEncodingException e) {
            Assert.fail();
        }
    }

    @Test
    public void getContent() {
        HmacSHA1Signer signer = new HmacSHA1Signer();
        Assert.assertNull(signer.getContent());
    }
}
