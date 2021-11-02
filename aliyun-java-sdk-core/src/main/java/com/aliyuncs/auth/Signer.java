/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.aliyuncs.auth;

import com.aliyuncs.auth.signers.*;

import java.security.NoSuchAlgorithmException;

public abstract class Signer {

    private final static Signer HMACSHA1_SIGNER = new com.aliyuncs.auth.signers.HmacSHA1Signer();
    private final static Signer SHA256_WITH_RSA_SIGNER = new com.aliyuncs.auth.signers.SHA256withRSASigner();
    private final static Signer BEARER_TOKEN_SIGNER = new com.aliyuncs.auth.signers.BearerTokenSigner();
    // Signature V3
    private final static Signer RSA_SHA256 = new NewSHA256withRSASigner();
    private final static Signer HMAC_SM3 = new HmacSM3Signer();
    private final static Signer HMAC_SHA256 = new HmacSHA256Signer();

    public static Signer getSigner(AlibabaCloudCredentials credentials) {
        if (credentials instanceof KeyPairCredentials) {
            return SHA256_WITH_RSA_SIGNER;
        } else if (credentials instanceof BearerTokenCredentials) {
            return BEARER_TOKEN_SIGNER;
        } else {
            return HMACSHA1_SIGNER;
        }
    }

    public static Signer getSigner(AlibabaCloudCredentials credentials, SignatureVersion signatureVersion, SignatureAlgorithm signatureAlgorithm) {
        switch (signatureVersion) {
            case V3:
                switch (signatureAlgorithm) {
                    case ACS3_RSA_SHA256:
                        return RSA_SHA256;
                    case ACS3_HMAC_SM3:
                        return HMAC_SM3;
                    case ACS3_HMAC_SHA256:
                        return HMAC_SHA256;
                }
            case V1:
            default:
                if (credentials instanceof KeyPairCredentials) {
                    return SHA256_WITH_RSA_SIGNER;
                } else if (credentials instanceof BearerTokenCredentials) {
                    return BEARER_TOKEN_SIGNER;
                } else {
                    return HMACSHA1_SIGNER;
                }
        }
    }

    public abstract String signString(String stringToSign, AlibabaCloudCredentials credentials);

    public abstract String signString(String stringToSign, String accessKeySecret);

    public abstract String getSignerName();

    public abstract String getSignerVersion();

    public abstract String getSignerType();

    public abstract byte[] hash(byte[] raw) throws NoSuchAlgorithmException;

    public abstract String getContent();
}
