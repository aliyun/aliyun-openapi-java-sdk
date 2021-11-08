package com.aliyuncs.auth.signers;

import com.aliyuncs.auth.AlibabaCloudCredentials;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

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

    @Test
    public void hash() {
        BearerTokenSigner signer = new BearerTokenSigner();
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
        BearerTokenSigner signer = new BearerTokenSigner();
        Assert.assertNull(signer.getContent());
    }
}
