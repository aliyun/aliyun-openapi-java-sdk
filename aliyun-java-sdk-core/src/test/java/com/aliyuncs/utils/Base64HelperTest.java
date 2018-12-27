package com.aliyuncs.utils;

import java.io.UnsupportedEncodingException;

import org.junit.Assert;
import org.junit.Test;

public class Base64HelperTest {

    @Test
    public void testConstructor() {
        new Base64Helper();
    }

    @Test
    public void testBase64() throws UnsupportedEncodingException {
        String encoding = "UTF-8";
        String encode1 = Base64Helper.encode("1234567890", encoding);
        Assert.assertEquals("MTIzNDU2Nzg5MA==", encode1);

        String encode2 = Base64Helper.encode("abcdefghijklmnopqrstuvwxyz", encoding);
        Assert.assertEquals("YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXo=", encode2);

        String decode1 = Base64Helper.decode(encode1, encoding);
        Assert.assertEquals("1234567890", decode1);

        String decode2 = Base64Helper.decode(encode2, encoding);
        Assert.assertEquals("abcdefghijklmnopqrstuvwxyz", decode2);

        // encode with null string or null encoding
        Assert.assertNull(Base64Helper.encode(null, encoding));
        Assert.assertNull(Base64Helper.encode("1234567", null));
        Assert.assertNull(Base64Helper.encode(null));

        // decode with null string or null encoding
        Assert.assertNull(Base64Helper.decode(null, encoding));
        Assert.assertNull(Base64Helper.decode("1234567", null));

        // more =
        Assert.assertEquals("1234567890", Base64Helper.decode("MTIzNDU2Nzg5MA=", encoding));
        Assert.assertEquals("1234567890", Base64Helper.decode("MTIzNDU2Nzg5MA", encoding));
        Assert.assertEquals("123", Base64Helper.decode("MTIz", encoding));
    }
}
