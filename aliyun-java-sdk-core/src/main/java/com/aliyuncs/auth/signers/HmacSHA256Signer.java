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

package com.aliyuncs.auth.signers;

import com.aliyuncs.auth.AlibabaCloudCredentials;
import com.aliyuncs.auth.Signer;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static com.aliyuncs.auth.AcsURLEncoder.hexEncode;

public class HmacSHA256Signer extends Signer {

    private static final String ALGORITHM_NAME = "HmacSHA256";
    private static String HASH_SHA256 = "SHA-256";

    @Override
    public String signString(String stringToSign, String accessKeySecret) {
        try {
            Mac sha256_HMAC = Mac.getInstance(ALGORITHM_NAME);
            SecretKeySpec secret_key = new SecretKeySpec(accessKeySecret.getBytes(), ALGORITHM_NAME);
            sha256_HMAC.init(secret_key);
            return hexEncode(sha256_HMAC.doFinal(stringToSign.getBytes()));
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
        return ALGORITHM_NAME;
    }

    @Override
    public String getSignerVersion() {
        return "3.0";
    }

    @Override
    public String getSignerType() {
        return null;
    }

    @Override
    public byte[] hash(byte[] raw) throws NoSuchAlgorithmException {
        if(null == raw){
            return null;
        }
        MessageDigest digest = MessageDigest.getInstance(HASH_SHA256);
        return digest.digest(raw);
    }

    @Override
    public String getContent() {
        return "x-acs-content-sha256";
    }
}
