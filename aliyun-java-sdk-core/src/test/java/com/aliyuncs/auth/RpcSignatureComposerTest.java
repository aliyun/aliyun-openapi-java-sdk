package com.aliyuncs.auth;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.MethodType;

public class RpcSignatureComposerTest {

    @Test
    public void constructorTest() {
        ISignatureComposer composer = RpcSignatureComposer.getComposer();
        Assert.assertNotNull("should not be null", composer);
    }

    @Test
    public void composeStringToSignTest() {
        ISignatureComposer composer = RpcSignatureComposer.getComposer();
        MethodType methodType = MethodType.GET;
        String uriPattern = "http://www.aliyun.com";
        Signer signer = mock(Signer.class);
        Map<String, String> queries = new HashMap<String, String>() {
            {
                put("queryKey1", "queryValue1");
                put("queryKey2", "queryValue2");
            }
        };
        Map<String, String> headers = new HashMap<String, String>() {
            {
                put("headerKey1", "headerValue1");
                put("headerKey2", "headerValue2");
            }
        };
        Map<String, String> paths = new HashMap<String, String>() {
            {
                put("pathKey1", "pathValue1");
                put("pathKey2", "pathValue2");
            }
        };
        String stringToSign = composer.composeStringToSign(methodType, uriPattern, signer, queries, headers, paths);
        Assert.assertEquals("GET&%2F&queryKey1%3DqueryValue1%26queryKey2%3DqueryValue2", stringToSign);

    }

    @Test
    public void refreshSignRarametersTest() {
        ISignatureComposer composer = RpcSignatureComposer.getComposer();
        Map<String, String> parameters = new HashMap<String, String>() {
            {
                put("paraKey1", "paraValue1");
                put("paraKey2", "paraValue2");
            }
        };
        Signer signer = mock(Signer.class);
        when(signer.getSignerName()).thenReturn("signerName1");
        when(signer.getSignerVersion()).thenReturn("signerVersion1");
        when(signer.getSignerType()).thenReturn("signerType1");
        String accessKeyId = "ak";
        FormatType formatType = FormatType.XML;
        Map<String, String> res = composer.refreshSignParameters(parameters, signer, accessKeyId, formatType);
        Assert.assertEquals("paraValue1", res.get("paraKey1"));
        Assert.assertEquals("signerVersion1", res.get("SignatureVersion"));
        Assert.assertEquals("ak", res.get("AccessKeyId"));
        Assert.assertEquals(FormatType.XML.name(), res.get("Format"));
        Assert.assertEquals("signerType1", res.get("SignatureType"));

    }
}
