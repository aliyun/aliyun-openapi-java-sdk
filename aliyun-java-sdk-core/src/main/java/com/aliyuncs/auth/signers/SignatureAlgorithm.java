package com.aliyuncs.auth.signers;

public enum SignatureAlgorithm {
    ACS3_HMAC_SHA256("V3"),
    ACS3_HMAC_SM3("V3"),
    ACS3_RSA_SHA256("V1,V3"),
    /**
     * HMAC-SHA1 fallback for signature V2 only (SDK {@link com.aliyuncs.auth.SignatureVersion#V1}).
     * SHA1 is less secure; this compatibility fallback is not recommended.
     */
    HMAC_SHA1("V1");

    private final String scope;

    SignatureAlgorithm(String scope){
        this.scope = scope;
    }

    public String scope() {
        return scope;
    }
}
