package com.aliyuncs.http;

import com.aliyuncs.exceptions.ClientException;
import org.apache.http.entity.ContentType;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

import static com.aliyuncs.http.HttpMessage.CONTENT_TYPE;

public class HttpMessageTest {

    @Test
    public void deprecatedSetGetTest() {
        HttpRequest request = new HttpRequest("test");
        request.setUrl("deprecatedSetUrlTest");
        Assert.assertEquals("deprecatedSetUrlTest", request.getUrl());

        request.setMethod(MethodType.PUT);
        Assert.assertTrue(MethodType.PUT == request.getMethod());
        Assert.assertTrue(FormatType.JSON == request.getHttpContentType());

        request.setEncoding("encodingTest");
        Assert.assertEquals("encodingTest", request.getEncoding());

        request.setConnectTimeout(88);
        Assert.assertEquals(88, (int) request.getConnectTimeout());

        request.setReadTimeout(66);
        Assert.assertEquals(66, (int) request.getReadTimeout());

        Assert.assertTrue(request.getHeaders() instanceof Map);
    }

    @Test
    public void headerParameterTest() {
        HttpRequest request = new HttpRequest("test");
        request.putHeaderParameter(null, null);
        Assert.assertNull(request.getHeaderValue(null));

        request.putHeaderParameter(null, "test");
        Assert.assertNull(request.getHeaderValue(null));

        request.putHeaderParameter("valueNulTest", null);
        Assert.assertNull(request.getHeaderValue("valueNulTest"));

        request.putHeaderParameter("test", "test");
        Assert.assertEquals("test", "test");
    }

    @Test
    public void setGetTest() throws ClientException {
        HttpRequest request = new HttpRequest("test");
        request.setSysMethod(MethodType.PUT);
        Assert.assertTrue(MethodType.PUT == request.getSysMethod());
        Assert.assertTrue(FormatType.JSON == request.getHttpContentType());

        request.setSysEncoding("encodingTest");
        Assert.assertEquals("encodingTest", request.getEncoding());

        request.setSysConnectTimeout(88);
        Assert.assertEquals(88, (int) request.getSysConnectTimeout());

        request.setSysReadTimeout(66);
        Assert.assertEquals(66, (int) request.getSysReadTimeout());

        Assert.assertNull(request.getContentTypeValue(null, null));

        request.setHttpContent(null, null, null);
        Assert.assertEquals("", request.getHttpContentString());
    }

    @Test
    public void setHttpContentWillNullTest() throws ClientException {
        HttpRequest request = new HttpRequest("test");
        request.setSysMethod(MethodType.PUT);

        request.setHttpContent(null, null, null);
        Assert.assertEquals(null, request.getHeaderValue(HttpMessage.CONTENT_MD5));
    }

    @Test
    public void setHttpContentWillGETTest() throws ClientException {
        HttpRequest request = new HttpRequest("test");
        request.setSysMethod(MethodType.GET);

        request.setHttpContent("content".getBytes(), null, null);
        // md5 of empty string
        Assert.assertEquals("1B2M2Y8AsgTpgAmY7PhCfg==", request.getHeaderValue(HttpMessage.CONTENT_MD5));
    }

    @Test
    public void setHttpContentWillPOSTTest() throws ClientException {
        HttpRequest request = new HttpRequest("test");
        request.setSysMethod(MethodType.POST);

        request.setHttpContent("content".getBytes(), null, FormatType.XML);
        // md5 of "content"
        Assert.assertEquals("mgNkuembtIDdJeHwKEyFVQ==", request.getHeaderValue(HttpMessage.CONTENT_MD5));
        Assert.assertEquals("application/xml",request.getHeaderValue(CONTENT_TYPE));
    }
}
