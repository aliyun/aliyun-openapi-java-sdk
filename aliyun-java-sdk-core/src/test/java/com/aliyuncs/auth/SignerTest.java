package com.aliyuncs.auth;

import com.aliyuncs.auth.signers.*;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class SignerTest {
    @Test
    public void getSignerReturnSha256WithRSASigner() {
        AlibabaCloudCredentials credentials = mock(KeyPairCredentials.class);
        Signer signer = Signer.getSigner(credentials, SignatureVersion.V1, null);
        Assert.assertEquals(true, com.aliyuncs.auth.signers.SHA256withRSASigner.class.isAssignableFrom(signer.getClass()));
        Assert.assertSame(signer, Signer.getSigner(credentials));
    }

    @Test
    public void getSignerReturnBearerTokenSigner() {
        AlibabaCloudCredentials credentials = mock(BearerTokenCredentials.class);
        Signer signer = Signer.getSigner(credentials, SignatureVersion.V1, null);
        Assert.assertEquals(true, com.aliyuncs.auth.signers.BearerTokenSigner.class.isAssignableFrom(signer.getClass()));
        Assert.assertSame(signer, Signer.getSigner(credentials));
    }

    @Test
    public void getSignerReturnSignatureV2HmacSHA256Signer() {
        AlibabaCloudCredentials credentials = mock(AlibabaCloudCredentials.class);
        Signer signer = Signer.getSigner(credentials, SignatureVersion.V1, null);
        Assert.assertTrue(signer instanceof SignatureV2HmacSHA256Signer);
        Assert.assertTrue(Signer.getSigner(credentials) instanceof SignatureV2HmacSHA256Signer);
    }

    @Test
    public void getSignerReturnNewSHA256withRSASigner() {
        AlibabaCloudCredentials credentials = mock(AlibabaCloudCredentials.class);
        Signer signer = Signer.getSigner(credentials, SignatureVersion.V3, SignatureAlgorithm.ACS3_RSA_SHA256);
        Assert.assertEquals(true, NewSHA256withRSASigner.class.isAssignableFrom(signer.getClass()));
    }

    @Test
    public void getSignerReturnHmacSM3Signer() {
        AlibabaCloudCredentials credentials = mock(AlibabaCloudCredentials.class);
        Signer signer = Signer.getSigner(credentials, SignatureVersion.V3, SignatureAlgorithm.ACS3_HMAC_SM3);
        Assert.assertEquals(true, HmacSM3Signer.class.isAssignableFrom(signer.getClass()));
    }

    @Test
    public void getSignerReturnHmacSHA256Signer() {
        AlibabaCloudCredentials credentials = mock(AlibabaCloudCredentials.class);
        Signer signer = Signer.getSigner(credentials, SignatureVersion.V3, SignatureAlgorithm.ACS3_HMAC_SHA256);
        Assert.assertEquals(true, HmacSHA256Signer.class.isAssignableFrom(signer.getClass()));
    }

}
