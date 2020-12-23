package com.aliyuncs.auth;

import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
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
            SecretKey key = new SecretKeySpec((accessKeySecret).getBytes(ENCODING), "HMAC-SM3");
            HMac mac = new HMac(new SM3Digest());
            byte[] macFinalbytes = new byte[mac.getMacSize()];
            byte[] inputBytes = stringToSign.getBytes(ENCODING);
            mac.init(new KeyParameter(key.getEncoded()));
            mac.update(inputBytes, 0, inputBytes.length);
            mac.doFinal(macFinalbytes, 0);
            return DatatypeConverter.printBase64Binary(macFinalbytes);
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
