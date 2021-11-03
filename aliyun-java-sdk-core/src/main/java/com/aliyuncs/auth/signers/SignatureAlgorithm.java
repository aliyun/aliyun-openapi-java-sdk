package com.aliyuncs.auth.signers;

public enum SignatureAlgorithm {
    ACS3_HMAC_SHA256("V3"),
    ACS3_HMAC_SM3("V3"),
    ACS3_RSA_SHA256("V1,V3");

    private final String scope;

    SignatureAlgorithm(String scope){
        this.scope = scope;
    }

    public String scope() {
        return scope;
    }
}
