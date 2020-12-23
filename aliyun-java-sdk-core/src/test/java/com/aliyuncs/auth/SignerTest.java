package com.aliyuncs.auth;

import com.aliyuncs.CommonRpcRequest;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class SignerTest {
    @Test
    public void getSignerReturnSha256WithRSASigner() {
        AlibabaCloudCredentials credentials = mock(KeyPairCredentials.class);
        CommonRpcRequest request = new CommonRpcRequest("Fake");
        Signer signer = Signer.getSigner(credentials, request);
        Assert.assertTrue(SHA256withRSASigner.class.isAssignableFrom(signer.getClass()));
    }

    @Test
    public void getSignerReturnBearerTokenSigner() {
        AlibabaCloudCredentials credentials = mock(BearerTokenCredentials.class);
        CommonRpcRequest request = new CommonRpcRequest("Fake");
        Signer signer = Signer.getSigner(credentials, request);
        Assert.assertTrue(BearerTokenSigner.class.isAssignableFrom(signer.getClass()));
    }

    @Test
    public void getSignerReturnHmacSHA1Signer() {
        AlibabaCloudCredentials credentials = mock(AlibabaCloudCredentials.class);
        CommonRpcRequest request = new CommonRpcRequest("Fake");
        Signer signer = Signer.getSigner(credentials, request);
        Assert.assertTrue(HmacSHA1Signer.class.isAssignableFrom(signer.getClass()));
    }

    @Test
    public void getSignerReturnHmacSM3Signer() {
        AlibabaCloudCredentials credentials = mock(AlibabaCloudCredentials.class);
        CommonRpcRequest request = new CommonRpcRequest("Fake");
        request.setSysSignatureMethod("HMAC-SM3");
        Signer signer = Signer.getSigner(credentials, request);
        Assert.assertTrue(HmacSM3Signer.class.isAssignableFrom(signer.getClass()));
    }
}
