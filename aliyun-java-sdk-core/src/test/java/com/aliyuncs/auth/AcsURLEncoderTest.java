package com.aliyuncs.auth;

import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

public class AcsURLEncoderTest {
    @Test
    public void encode() throws UnsupportedEncodingException {
        String value = "123abc!@#$%^&*()-=_+ ~|\\/";
        String res = AcsURLEncoder.encode(value);
        Assert.assertEquals("123abc%21%40%23%24%25%5E%26*%28%29-%3D_%2B%20%7E%7C%5C%2F", res);
    }

    @Test
    public void percentEncodeReturnNull() throws UnsupportedEncodingException {
        Assert.assertNull(AcsURLEncoder.percentEncode(null));
    }

    @Test
    public void percentEncodeReturnNormal() throws UnsupportedEncodingException {
        String value = "123abc!@#$%^&*()-=_+ ~|\\/";
        String res = AcsURLEncoder.percentEncode(value);
        Assert.assertEquals("123abc%21%40%23%24%25%5E%26%2A%28%29-%3D_%2B%20~%7C%5C%2F", res);
    }

    @Test
    public void hexEncodeReturnNull() throws UnsupportedEncodingException {
        Assert.assertNull(AcsURLEncoder.hexEncode(null));
    }

    @Test
    public void hexEncodeReturnNormal() throws UnsupportedEncodingException {
        String value = "test";
        String res = AcsURLEncoder.hexEncode(value.getBytes("UTF-8"));
        Assert.assertEquals("74657374", res);
    }
}
