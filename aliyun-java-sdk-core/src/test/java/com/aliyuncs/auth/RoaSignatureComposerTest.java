package com.aliyuncs.auth;

import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.MethodType;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(FormatType.class)
public class RoaSignatureComposerTest {
    private static final Log log = LogFactory.getLog(RpcSignatureComposerTest.class);

    @Test
    public void constructorTest() {

        ISignatureComposer composer = RoaSignatureComposer.getComposer();
        Assert.assertNotNull("should not be null", composer);
    }

    @Test
    public void composeStringToSignTest() {
        ISignatureComposer composer = RoaSignatureComposer.getComposer();
        MethodType methodType = MethodType.GET;
        String uriPattern = "http://www.aliyun.com/[pathKey1]";
        Signer signer = mock(Signer.class);
        Map<String, String> queries = new HashMap<String, String>() {{
            put("queryKey1", "queryValue1");
            put("queryKey2", "queryValue2");
            put("queryKey3", "");
            put("queryKey4", "queryValue4");
        }};
        Map<String, String> headers = new HashMap<String, String>() {{
            put("headerKey1", "headerValue1");
            put("headerKey2", "headerValue2");
            put("Accept", "XML");
            put("Content-MD5", "Content-MD5-Value");
            put("Content-Type", "Content-Type-Value");
            put("Date", "19910706");
            put("x-acs-signature-version", "signature-version-value");

        }};
        Map<String, String> paths = new HashMap<String, String>() {{
            put("pathKey1", "pathValue1");
            put("pathKey2", "pathValue2");
        }};
        String stringToSign = composer.composeStringToSign(methodType, uriPattern, signer, queries, headers, paths);
        String expected = "GET\n" +
                "XML\n" +
                "Content-MD5-Value\n" +
                "Content-Type-Value\n" +
                "19910706\n" +
                "x-acs-signature-version:signature-version-value\n" +
                "http://www.aliyun.com/pathValue1?queryKey1=queryValue1&queryKey2=queryValue2&queryKey3&queryKey4=queryValue4";
        Assert.assertEquals(expected, stringToSign);

    }

    @Test
    public void refreshSignParametersTest() {
        ISignatureComposer composer = RoaSignatureComposer.getComposer();
        Map<String, String> parameters = new HashMap<String, String>() {{
            put("paraKey1", "paraValue1");
            put("paraKey2", "paraValue2");
        }};
        Signer signer = mock(Signer.class);
        when(signer.getSignerName()).thenReturn("signerName1");
        when(signer.getSignerVersion()).thenReturn("signerVersion1");
        when(signer.getSignerType()).thenReturn("signerType1");
        PowerMockito.mockStatic(FormatType.class);
        BDDMockito.given(FormatType.mapFormatToAccept(FormatType.RAW)).willReturn("raw");
        String accessKeyId = "ak";
        FormatType formatType = null;
        Map<String, String> res = composer.refreshSignParameters(parameters, signer, accessKeyId, formatType);
        Assert.assertEquals("paraValue1", res.get("paraKey1"));
        Assert.assertEquals("signerVersion1", res.get("x-acs-signature-version"));
        Assert.assertEquals("raw", res.get("Accept"));
        Assert.assertEquals("signerType1", res.get("x-acs-signature-type"));
        Assert.assertEquals("signerName1", res.get("x-acs-signature-method"));
        Assert.assertNotNull(res.get("Date"));

    }
}
