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
package com.aliyuncs.v5.auth;

import com.aliyuncs.v5.http.FormatType;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.utils.ParameterHelper;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class RpcSignatureComposer implements ISignatureComposer {

    private final static String SEPARATOR = "&";
    private static ISignatureComposer composer = null;

    private RpcSignatureComposer() {

    }

    public static ISignatureComposer getComposer() {
        if (null == composer) {
            composer = new RpcSignatureComposer();
        }
        return composer;
    }

    @Override
    public Map<String, String> refreshSignParameters(Map<String, String> parameters,
                                                     Signer signer, String accessKeyId, FormatType format) {
        Map<String, String> immutableMap = new HashMap<String, String>(parameters);
        immutableMap.put("Timestamp", ParameterHelper.getISO8601Time(new Date()));
        immutableMap.put("SignatureMethod", signer.getSignerName());
        immutableMap.put("SignatureVersion", signer.getSignerVersion());
        immutableMap.put("SignatureNonce", ParameterHelper.getUniqueNonce());
        immutableMap.put("AccessKeyId", accessKeyId);
        if (null != format) {
            immutableMap.put("Format", format.toString());
        }
        if (signer.getSignerType() != null) {
            immutableMap.put("SignatureType", signer.getSignerType());
        }
        return immutableMap;
    }

    @Override
    public String composeStringToSign(MethodType method, String uriPattern,
                                      Signer signer, Map<String, String> queries,
                                      Map<String, String> headers, Map<String, String> paths) {

        String[] sortedKeys = queries.keySet().toArray(new String[]{});
        Arrays.sort(sortedKeys);
        StringBuilder canonicalizedQueryString = new StringBuilder();
        try {
            for (String key : sortedKeys) {
                canonicalizedQueryString.append("&")
                        .append(AcsURLEncoder.percentEncode(key)).append("=")
                        .append(AcsURLEncoder.percentEncode(queries.get(key)));
            }

            StringBuilder stringToSign = new StringBuilder();
            stringToSign.append(method.toString());
            stringToSign.append(SEPARATOR);
            stringToSign.append(AcsURLEncoder.percentEncode("/"));
            stringToSign.append(SEPARATOR);
            stringToSign.append(AcsURLEncoder.percentEncode(
                    canonicalizedQueryString.toString().substring(1)));

            return stringToSign.toString();
        } catch (UnsupportedEncodingException exp) {
            throw new RuntimeException("UTF-8 encoding is not supported.");
        }

    }
}
