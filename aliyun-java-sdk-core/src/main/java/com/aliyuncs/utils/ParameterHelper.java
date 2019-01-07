package com.aliyuncs.utils;

import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ParameterHelper {

    private final static String TIME_ZONE = "GMT";
    private final static String FORMAT_ISO8601 = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private final static String FORMAT_RFC2616 = "EEE, dd MMM yyyy HH:mm:ss zzz";

    public ParameterHelper() {
    }

    public static String getUniqueNonce() {
        StringBuffer uniqueNonce = new StringBuffer();
        UUID uuid = UUID.randomUUID();
        uniqueNonce.append(uuid.toString());
        uniqueNonce.append(System.currentTimeMillis());
        uniqueNonce.append(Thread.currentThread().getId());
        return uniqueNonce.toString();
    }

    public static String getISO8601Time(Date date) {
        SimpleDateFormat df = new SimpleDateFormat(FORMAT_ISO8601);
        df.setTimeZone(new SimpleTimeZone(0, TIME_ZONE));
        return df.format(date);
    }

    public static String getRFC2616Date(Date date) {
        SimpleDateFormat df = new SimpleDateFormat(FORMAT_RFC2616, Locale.ENGLISH);
        df.setTimeZone(new SimpleTimeZone(0, TIME_ZONE));
        return df.format(date);
    }

    public static Date parse(String strDate) throws ParseException {
        if (null == strDate || "".equals(strDate)) {
            return null;
        }
        // The format contains 4 '
        if (strDate.length() == FORMAT_ISO8601.length() - 4) {
            return parseISO8601(strDate);
        } else if (strDate.length() == FORMAT_RFC2616.length()) {
            return parseRFC2616(strDate);
        }
        return null;
    }

    public static Date parseISO8601(String strDate) throws ParseException {
        if (null == strDate || "".equals(strDate)) {
            return null;
        }

        // The format contains 4 ' symbol
        if (strDate.length() != (FORMAT_ISO8601.length() - 4)) {
            return null;
        }

        SimpleDateFormat df = new SimpleDateFormat(FORMAT_ISO8601);
        df.setTimeZone(new SimpleTimeZone(0, TIME_ZONE));
        return df.parse(strDate);
    }

    public static Date parseRFC2616(String strDate) throws ParseException {
        if (null == strDate || "".equals(strDate) || strDate.length() != FORMAT_RFC2616.length()) {
            return null;
        }
        SimpleDateFormat df = new SimpleDateFormat(FORMAT_RFC2616, Locale.ENGLISH);
        df.setTimeZone(new SimpleTimeZone(0, TIME_ZONE));
        return df.parse(strDate);
    }

    public static String md5Sum(byte[] buff) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(buff);
            return Base64Helper.encode(messageDigest);
        } catch (Exception e) {
            // TODO: should not eat the excepiton
        }
        return null;
    }

    public static byte[] getXmlData(Map<String, String> params) throws UnsupportedEncodingException {
        StringBuilder xml = new StringBuilder();
        xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        Iterator<Map.Entry<String, String>> entries = params.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, String> entry = entries.next();
            xml.append("<" + entry.getKey() + ">");
            xml.append(entry.getValue());
            xml.append("</" + entry.getKey() + ">");
        }
        return xml.toString().getBytes("UTF-8");
    }

    public static byte[] getJsonData(Map<String, String> params) throws UnsupportedEncodingException {
        String json = new Gson().toJson(params);
        return json.getBytes("UTF-8");
    }

    public static byte[] getFormData(Map<String, String> params) throws UnsupportedEncodingException {
        StringBuilder result = new StringBuilder();
        boolean first = true;
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (first) {
                first = false;
            } else {
                result.append("&");
            }
            result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
        }
        return result.toString().getBytes("UTF-8");
    }
}