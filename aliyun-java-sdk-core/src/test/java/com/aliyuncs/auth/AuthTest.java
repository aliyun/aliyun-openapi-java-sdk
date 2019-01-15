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

import com.aliyuncs.AcsRequest;
import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.ecs.v20140526.model.DescribeRegionsRequest;
import com.aliyuncs.ecs.v20140526.model.GetRegionsRequest;
import com.aliyuncs.http.FormatType;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

@SuppressWarnings("unchecked")
public class AuthTest {

    @Test
    public void testRPCComposer() {
        Signer signer = new HmacSHA1Signer();
        @SuppressWarnings("rawtypes")
        AcsRequest request = new DescribeRegionsRequest();

        ISignatureComposer composer = RpcSignatureComposer.getComposer();
        Map<String, String> immune = composer.refreshSignParameters(request.getSysQueryParameters(), signer, "testid",
                FormatType.XML);
        String strToSign = composer.composeStringToSign(request.getSysMethod(), null, signer, immune, null, null);
        assertEquals(0, strToSign.indexOf("GET&%2F&AccessKeyId%3Dtestid%26Action%3DDescribeRegions%26Format%3DXML%26"));
        assertEquals(true, strToSign.endsWith("Version%3D2014-05-26"));
    }

    @SuppressWarnings("rawtypes")
    @Test
    public void testRoaComposer() {
        Signer signer = new HmacSHA1Signer();
        RoaAcsRequest request = new GetRegionsRequest();

        ISignatureComposer composer = RoaSignatureComposer.getComposer();
        Map<String, String> immune = composer.refreshSignParameters(request.getSysHeaders(), signer, "testid",
                FormatType.XML);
        String strToSign = composer.composeStringToSign(request.getSysMethod(), request.getSysUriPattern(), signer,
                request.getSysQueryParameters(), immune, request.getPathParameters());
        assertEquals(0, strToSign.indexOf("GET\napplication/xml\n"));
        assertEquals(true, strToSign.endsWith(
                "\nx-acs-signature-method:HMAC-SHA1\nx-acs-signature-version:1.0\nx-acs-version:2015-01-01\n/"));
    }



}
