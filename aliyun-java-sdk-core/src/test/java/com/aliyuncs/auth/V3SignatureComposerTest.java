package com.aliyuncs.auth;

import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.MethodType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;

@RunWith(PowerMockRunner.class)
@PrepareForTest(FormatType.class)
public class V3SignatureComposerTest {

    @Test
    public void constructorTest() {

        ISignatureComposer composer = V3SignatureComposer.getComposer();
        Assert.assertNotNull("should not be null", composer);
    }

    @Test
    public void composeStringToSignTest() {
        ISignatureComposer composer = V3SignatureComposer.getComposer();
        MethodType methodType = MethodType.GET;
        String uriPattern = "http://www.aliyun.com/[pathKey1]";
        Signer signer = mock(Signer.class);
        Map<String, String> queries = new HashMap<String, String>() {
            {
                put("queryKey1", "queryValue1");
                put("queryKey2", "queryValue2");
                put("queryKey3", "");
                put("queryKey4", "queryValue4");
            }
        };
        Map<String, String> headers = new HashMap<String, String>() {
            {
                put("headerKey1", "headerValue1");
                put("headerKey2", "headerValue2");
                put("Accept", "XML");
                put("Content-MD5", "Content-MD5-Value");
                put("Content-Type", "Content-Type-Value");
                put("Date", "19910706");
                put("x-acs-signature-version", "3.0");
                put("x-acs-content-sha256", null);

            }
        };
        Map<String, String> paths = new HashMap<String, String>() {
            {
                put("pathKey1", "pathValue1");
                put("pathKey2", "pathValue2");
            }
        };
        String stringToSign = composer.composeStringToSign(methodType, uriPattern, signer, queries, headers, paths);
        String expected = "GET\n" + "http://www.aliyun.com/pathValue1\n" + "queryKey1=queryValue1&queryKey2=queryValue2&queryKey3=&queryKey4=queryValue4\n"
                + "content-type:Content-Type-Value\n" + "x-acs-content-sha256:null\n" + "x-acs-signature-version:3.0\n\n"
                + "content-type;x-acs-content-sha256;x-acs-signature-version";
        Assert.assertEquals(expected, stringToSign);
        stringToSign = composer.composeStringToSign(methodType, null, signer, queries, headers, null);
        expected = "GET\n" + "/\n" + "queryKey1=queryValue1&queryKey2=queryValue2&queryKey3=&queryKey4=queryValue4\n"
                + "content-type:Content-Type-Value\n" + "x-acs-content-sha256:null\n" + "x-acs-signature-version:3.0\n\n"
                + "content-type;x-acs-content-sha256;x-acs-signature-version";
        Assert.assertEquals(expected, stringToSign);
    }

    @Test
    public void testComposeStringToSignQueries() {
        ISignatureComposer composer = V3SignatureComposer.getComposer();
        MethodType methodType = MethodType.GET;
        String uriPattern = "http://www.aliyun.com/[pathKey1]?queryKey5=queryValue5";
        Signer signer = mock(Signer.class);
        Map<String, String> queries = new HashMap<String, String>() {
            {
                put("queryKey1", "queryValue1");
                put("queryKey2", "queryValue2");
                put("queryKey3", "");
            }
        };
        Map<String, String> headers = new HashMap<String, String>() {
            {
                put("headerKey1", "headerValue1");
                put("headerKey2", "headerValue2");
                put("x-acs-signature-version", "signature-version-value");

            }
        };
        Map<String, String> paths = new HashMap<String, String>() {
            {
                put("pathKey1", "pathValue1");
                put("pathKey2", "pathValue2");
            }
        };
        String stringToSign = composer.composeStringToSign(methodType, uriPattern, signer, queries, headers, paths);
        String expected = "GET\n" + "http://www.aliyun.com/pathValue1?queryKey5=queryValue5\n"
                + "queryKey1=queryValue1&queryKey2=queryValue2&queryKey3=\n"
                + "x-acs-signature-version:signature-version-value\n\n"
                + "x-acs-signature-version";
        Assert.assertEquals(expected, stringToSign);
    }

    @Test
    public void refreshSignParametersTest() {
        ISignatureComposer composer = V3SignatureComposer.getComposer();
        Map<String, String> parameters = new HashMap<String, String>() {
            {
                put("paraKey1", "paraValue1");
                put("paraKey2", "paraValue2");
            }
        };
        Signer signer = mock(Signer.class);
        Map<String, String> res = composer.refreshSignParameters(parameters, signer, null, null);
        Assert.assertEquals("paraValue1", res.get("paraKey1"));
        Assert.assertNotNull(res.get("x-acs-date"));
        Assert.assertNotNull(res.get("x-acs-signature-nonce"));
    }
}
