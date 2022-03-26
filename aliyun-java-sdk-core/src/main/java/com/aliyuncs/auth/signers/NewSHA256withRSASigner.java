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

import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;

import static com.aliyuncs.auth.AcsURLEncoder.hexEncode;

public class NewSHA256withRSASigner extends Signer {

    public static final String ENCODING = "UTF-8";
    private static final String ALGORITHM_NAME = "SHA256withRSA";
    private static String HASH_SHA256 = "SHA-256";
    private final static String PEM_BEGIN = "-----BEGIN RSA PRIVATE KEY-----\n";
    private final static String PEM_END = "\n-----END RSA PRIVATE KEY-----";

    @Override
    public String signString(String stringToSign, String accessKeySecret) {
        try {
            Signature rsaSign = Signature.getInstance(ALGORITHM_NAME);
            KeyFactory kf = KeyFactory.getInstance("RSA");
            byte[] keySpec = DatatypeConverter.parseBase64Binary(checkRSASecret(accessKeySecret));
            PrivateKey privateKey = kf.generatePrivate(new PKCS8EncodedKeySpec(keySpec));
            rsaSign.initSign(privateKey);
            rsaSign.update(stringToSign.getBytes(ENCODING));
            byte[] sign = rsaSign.sign();
            return hexEncode(sign);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e.toString());
        } catch (InvalidKeySpecException e) {
            throw new IllegalArgumentException(e.toString());
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e.toString());
        } catch (SignatureException e) {
            throw new IllegalArgumentException(e.toString());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e.toString());
        }
    }

    private String checkRSASecret(String accessKeySecret) {
        if (accessKeySecret != null) {
            if (accessKeySecret.startsWith(PEM_BEGIN)) {
                accessKeySecret = accessKeySecret.replace(PEM_BEGIN, "");
            }
            while (accessKeySecret.endsWith("\n") || accessKeySecret.endsWith("\r")) {
                accessKeySecret = accessKeySecret.substring(0, accessKeySecret.length() - 1);
            }
            if (accessKeySecret.endsWith(PEM_END)) {
                accessKeySecret = accessKeySecret.replace(PEM_END, "");
            }
        }
        return accessKeySecret;
    }

    @Override
    public String signString(String stringToSign, AlibabaCloudCredentials credentials) {
        return signString(stringToSign, credentials.getAccessKeySecret());
    }

    @Override
    public String getSignerName() {
        return "ACS3-RSA-SHA256";
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
