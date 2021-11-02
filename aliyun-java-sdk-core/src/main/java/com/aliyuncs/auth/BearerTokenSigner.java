package com.aliyuncs.auth;

import java.security.NoSuchAlgorithmException;

@Deprecated
public class BearerTokenSigner extends Signer {

    @Override
    public String signString(String stringToSign, AlibabaCloudCredentials credentials) {
        return null;
    }

    @Override
    public String signString(String stringToSign, String accessKeySecret) {
        return null;
    }

    @Override
    public String getSignerName() {
        return null;
    }

    @Override
    public String getSignerVersion() {
        return null;
    }

    @Override
    public String getSignerType() {
        return "BEARERTOKEN";
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
