package com.aliyuncs.auth;

import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.MethodType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
@PowerMockIgnore("javax.net.ssl.*")
@RunWith(PowerMockRunner.class)
@PrepareForTest(FormatType.class)
public class OssSignatureComposerTest {
    @Test
    public void constructorTest() {
        ISignatureComposer composer = OssSignatureComposer.getComposer();
        Assert.assertNotNull("should not be null", composer);
    }

    @Test
    public void composeStringToSignTest() {
        ISignatureComposer composer = OssSignatureComposer.getComposer();
        MethodType methodType = MethodType.GET;
        String uriPattern = "http://www.aliyun.com/[pathKey1]";
        Signer signer = mock(Signer.class);
        Map<String, String> queries = new HashMap<String, String>() {
            {
                put("queryKey1", "queryValue1");
                put("queryKey2", "queryValue2");
                put("queryKey3", null);
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
                put("x-oss-header-key1", "x-oss-header-value1");

            }
        };
        Map<String, String> paths = new HashMap<String, String>() {
            {
                put("pathKey1", "pathValue1");
                put("pathKey2", "pathValue2");
            }
        };
        String stringToSign = composer.composeStringToSign(methodType, uriPattern, signer, queries, headers, paths);
        String expected = "GET\n" + "Content-MD5-Value\n" + "Content-Type-Value\n" + "19910706\n"
                + "x-oss-header-key1:x-oss-header-value1\n"
                + "http://www.aliyun.com/[pathKey1]?queryKey2=queryValue2&queryKey1=queryValue1&queryKey3";
        Assert.assertEquals(expected, stringToSign);

    }

    @Test
    public void testComposeStringToSignNullQueries() {
        ISignatureComposer composer = OssSignatureComposer.getComposer();
        MethodType methodType = MethodType.GET;
        String uriPattern = "http://www.aliyun.com/[pathKey1]";
        Signer signer = mock(Signer.class);
        Map<String, String> queries = new HashMap<String, String>();
        Map<String, String> headers = new HashMap<String, String>() {
            {
                put("headerKey1", "headerValue1");
                put("headerKey2", "headerValue2");
                put("Accept", "XML");
                put("x-oss-header-key1", "x-oss-header-value1");

            }
        };
        Map<String, String> paths = new HashMap<String, String>() {
            {
                put("pathKey1", "pathValue1");
                put("pathKey2", "pathValue2");
            }
        };
        String stringToSign = composer.composeStringToSign(methodType, uriPattern, signer, queries, headers, paths);
        String expected = "GET\n" + "\n" + "\n" + "\n" + "x-oss-header-key1:x-oss-header-value1\n"
                + "http://www.aliyun.com/[pathKey1]";
        Assert.assertEquals(expected, stringToSign);

    }

    @Test
    public void refreshSignParametersTest() {
        ISignatureComposer composer = OssSignatureComposer.getComposer();
        Map<String, String> parameters = new HashMap<String, String>() {
            {
                put("paraKey1", "paraValue1");
                put("paraKey2", "paraValue2");
            }
        };
        Signer signer = mock(Signer.class);
        String accessKeyId = "ak";
        FormatType formatType = FormatType.JSON;
        Map<String, String> res = composer.refreshSignParameters(parameters, signer, accessKeyId, formatType);
        Assert.assertEquals("paraValue1", res.get("paraKey1"));
        Assert.assertNotNull(res.get("Date"));

    }
}
