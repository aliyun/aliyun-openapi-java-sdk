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
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static com.aliyuncs.auth.AcsURLEncoder.hexEncode;

public class HmacSM3Signer extends Signer {

    public static final String ENCODING = "UTF-8";
    private static final String ALGORITHM_NAME = "HMAC-SM3";
    private static String HASH_SM3 = "SM3";

    @Override
    public String signString(String stringToSign, String accessKeySecret) {
        try {
            SecretKey key = new SecretKeySpec((accessKeySecret).getBytes(ENCODING), ALGORITHM_NAME);
            HMac mac = new HMac(new SM3Digest());
            byte[] sign = new byte[mac.getMacSize()];
            byte[] inputBytes = stringToSign.getBytes(ENCODING);
            mac.init(new KeyParameter(key.getEncoded()));
            mac.update(inputBytes, 0, inputBytes.length);
            mac.doFinal(sign, 0);
            return hexEncode(sign);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e.toString());
        }
    }

    @Override
    public String signString(String stringToSign, AlibabaCloudCredentials credentials) {
        return signString(stringToSign, credentials.getAccessKeySecret());
    }

    @Override
    public String getSignerName() {
        return "ACS3-HMAC-SM3";
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
        BouncyCastleProvider provider = new BouncyCastleProvider();
        MessageDigest digest = MessageDigest.getInstance(HASH_SM3, provider);
        return digest.digest(raw);
    }

    @Override
    public String getContent() {
        return "x-acs-content-sm3";
    }
}
