package com.aliyuncs.utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ParameterHelperTest {
    @Before
    public void init() {
        new ParameterHelper();
    }

    @Test
    public void getUniqueNonce() {
        String nonce = ParameterHelper.getUniqueNonce();
        Assert.assertNotEquals(nonce, ParameterHelper.getUniqueNonce());
    }

    @Test
    public void getRFC2616Date() throws ParseException {
        Date d2 = ParameterHelper.parseRFC2616("Tue, 18 Dec 2018 16:13:15 GMT");
        Assert.assertEquals("Tue, 18 Dec 2018 16:13:15 GMT", ParameterHelper.getRFC2616Date(d2));
    }

    @Test
    public void getISO8601Time() throws ParseException {
        Date d2 = ParameterHelper.parseISO8601("2018-12-18T16:39:38Z");
        Assert.assertEquals("2018-12-18T16:39:38Z", ParameterHelper.getISO8601Time(d2));
    }

    @Test
    public void parseISO8601() throws ParseException {
        Date d = ParameterHelper.parseISO8601(null);
        Assert.assertNull(d);
        Assert.assertNull(ParameterHelper.parseISO8601(""));
        Assert.assertNull(ParameterHelper.parseISO8601("123"));
        Date d2 = ParameterHelper.parseISO8601("2018-12-18T16:39:38Z");
        Assert.assertEquals(1545151178000L, d2.getTime());
    }

    @Test
    public void parseRFC2616() throws ParseException {
        // the null cases
        Assert.assertNull(ParameterHelper.parseRFC2616(null));
        Assert.assertNull(ParameterHelper.parseRFC2616(""));
        Assert.assertNull(ParameterHelper.parseRFC2616("123"));
        Date d2 = ParameterHelper.parseRFC2616("Tue, 18 Dec 2018 16:13:15 GMT");
        Assert.assertEquals(1545149595000L, d2.getTime());
    }

    @Test
    public void parse() throws ParseException {
        Assert.assertNull(ParameterHelper.parse(null));
        Assert.assertNull(ParameterHelper.parse(""));
        Assert.assertNull(ParameterHelper.parse("123"));
        Date d2 = ParameterHelper.parse("2018-12-18T16:39:38Z");
        Assert.assertEquals(1545151178000L, d2.getTime());
        Date d3 = ParameterHelper.parse("Tue, 18 Dec 2018 16:13:15 GMT");
        Assert.assertEquals(1545149595000L, d3.getTime());
    }

    @Test
    public void testMd5() throws UnsupportedEncodingException {
        String encoding = "UTF-8";
        String source = "<Product name=\"Yundun\" domain=\"yundun.aliyuncs.com\"/>";
        String md5 = ParameterHelper.md5Sum(source.getBytes(encoding));
        Assert.assertEquals("+J93MVb8RzUp4M+yNoFtLg==", md5);
        Assert.assertNull(ParameterHelper.md5Sum(null));
    }

    @Test
    public void testGetJsonData() throws UnsupportedEncodingException {
        Map<String, String> params = new HashMap<String, String>();
        params.put("key", "value");
        byte[] output = ParameterHelper.getJsonData(params);
        Assert.assertEquals("{\"key\":\"value\"}", new String(output));
    }

    @Test
    public void testGetFormData() throws UnsupportedEncodingException {
        Map<String, String> params = new HashMap<String, String>();
        params.put("key", "value");
        byte[] output = ParameterHelper.getFormData(params);
        Assert.assertEquals("key=value", new String(output));
        params.put("key2", "value2");
        Assert.assertEquals("key2=value2&key=value", new String(ParameterHelper.getFormData(params)));
    }

    @Test
    public void testGetXmlData() throws UnsupportedEncodingException {
        Map<String, String> params = new HashMap<String, String>();
        params.put("key", "value");
        byte[] output = ParameterHelper.getXmlData(params);
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><key>value</key>", new String(output));
    }

}