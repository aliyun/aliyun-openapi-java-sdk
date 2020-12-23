package com.aliyuncs.auth;

import com.aliyuncs.utils.SM3;

import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;

public class HmacSM3Signer extends Signer {
    public static final String ENCODING = "UTF-8";

    @Override
    public String signString(String stringToSign, AlibabaCloudCredentials credentials) {
        return signString(stringToSign, credentials.getAccessKeySecret());
    }

    @Override
    public String signString(String stringToSign, String accessKeySecret) {
        try {
            String signData = SM3.byteArrayToHexString(stringToSign.getBytes(ENCODING));
            return DatatypeConverter.printBase64Binary(signData.getBytes(ENCODING));
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e.toString());
        }
    }

    @Override
    public String getSignerName() {
        return "HMAC-SM3";
    }

    @Override
    public String getSignerVersion() {
        return "1.0";
    }

    @Override
    public String getSignerType() {
        return null;
    }
}
