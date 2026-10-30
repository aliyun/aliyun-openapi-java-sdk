package com.aliyuncs.auth.signers;

import com.aliyuncs.auth.AlibabaCloudCredentials;
import com.aliyuncs.auth.Signer;

import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

public class HmacSHA256V2Signer extends Signer {

    private static final Charset ENCODING = Charset.forName("UTF-8");
    private static final String ALGORITHM_NAME = "HmacSHA256";

    @Override
    public String signString(String stringToSign, String accessKeySecret) {
        try {
            Mac mac = Mac.getInstance(ALGORITHM_NAME);
            mac.init(new SecretKeySpec(accessKeySecret.getBytes(ENCODING), ALGORITHM_NAME));
            return DatatypeConverter.printBase64Binary(mac.doFinal(stringToSign.getBytes(ENCODING)));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e.toString());
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e.toString());
        }
    }

    @Override
    public String signString(String stringToSign, AlibabaCloudCredentials credentials) {
        return signString(stringToSign, credentials.getAccessKeySecret());
    }

    @Override
    public String getSignerName() {
        return "HMAC-SHA256";
    }

    @Override
    public String getSignerVersion() {
        return "1.0";
    }

    @Override
    public String getSignerType() {
        return null;
    }

    @Override
    public byte[] hash(byte[] raw) throws NoSuchAlgorithmException {
        return null;
    }

    @Override
    public String getContent() {
        return null;
    }
}
