package com.aliyuncs.http;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

public class HttpResponseTest {
    private HttpResponse response;

    @Before
    public void creatResponse() {
        response = new HttpResponse();
    }

    @Test
    public void httpResponseTest() {
        response = new HttpResponse("test");
        Assert.assertEquals("test", response.getSysUrl());
    }

    @Test
    public void setHttpContentTest() throws UnsupportedEncodingException {
        response.setHttpContent("test".getBytes(), "UTF-8", FormatType.JSON);
        Assert.assertEquals("UTF-8", response.getSysEncoding());
        Assert.assertEquals("test", new String(response.getHttpContent(), "UTF-8"));
        Assert.assertTrue(FormatType.JSON == response.getHttpContentType());
    }

    @Test
    public void getHeaderValueTest() {
        response.putHeaderParameter("test", "test");
        Assert.assertEquals("test", response.getHeaderValue("test"));
        Assert.assertEquals(null, response.getHeaderValue("test1"));
    }

    @Test
    public void getSetTest() {
        response.setStatus(66);
        Assert.assertEquals(66, response.getStatus());
        response.setReasonPhrase("OK");
        Assert.assertEquals("OK", response.getReasonPhrase());
    }

    @Test
    public void isSuccessTest() {
        response.setStatus(200);
        Assert.assertTrue(response.isSuccess());

        response.setStatus(300);
        Assert.assertFalse(response.isSuccess());

        response.setStatus(100);
        Assert.assertFalse(response.isSuccess());
    }

    @Test
    public void toStringTest() {
        HttpResponse response = new HttpResponse("testURL");
        Assert.assertTrue(response.toString().contains("testURL"));
    }
}
