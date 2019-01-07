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

import static org.junit.Assert.*;

import java.security.InvalidKeyException;
import java.util.Map;

import org.junit.Test;

import com.aliyuncs.AcsRequest;
import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeRegionsRequest;
import com.aliyuncs.ros.model.v20150901.DescribeResourcesRequest;
import com.aliyuncs.http.FormatType;

@SuppressWarnings("unchecked")
public class AuthTest {
   
    @Test
    public void testRPCComposer() {
        Signer signer = new HmacSHA1Signer();
        @SuppressWarnings("rawtypes")
        AcsRequest request = new DescribeRegionsRequest();

        ISignatureComposer composer = RpcSignatureComposer.getComposer();
        Map<String, String> immune = composer.refreshSignParameters(request.getQueryParameters(),
            signer, "testid", FormatType.XML);
        String strToSign = composer.composeStringToSign(
            request.getMethod(), null, signer, immune, null, null);
        assertEquals(0, strToSign.indexOf("GET&%2F&AccessKeyId%3Dtestid%26Action%3DDescribeRegions%26Format%3DXML%26"));
        assertEquals(true, strToSign.endsWith("Version%3D2014-05-26"));
    }

    @SuppressWarnings("rawtypes")
    @Test
    public void testRoaComposer() {
        Signer signer = new HmacSHA1Signer();
        RoaAcsRequest request = new DescribeResourcesRequest();

        ISignatureComposer composer = RoaSignatureComposer.getComposer();
        Map<String, String> immune = composer.refreshSignParameters(request.getHeaders(), signer, "testid", FormatType.XML);
        String strToSign = composer.composeStringToSign(request.getMethod(), request.getUriPattern(), signer,
            request.getQueryParameters(), immune, request.getPathParameters());
        assertEquals(0, strToSign.indexOf("GET\napplication/xml\n"));
        assertEquals(true, strToSign.endsWith(
                "\nx-acs-signature-method:HMAC-SHA1\n" +
                        "x-acs-signature-version:1.0\n" +
                        "x-acs-version:2015-09-01\n" +
                        "/stacks/[StackName]/[StackId]/resources"));
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testHmac1() {
        ISigner signer = new ShaHmac1();

        String sign;
        try {
            sign = signer.signString("GET&%2F&AccessKeyId%3Dtestid%26Action%3DDescribeRegions%26Format%3DXML" +
                "%26RegionId%3Dregion1%26SignatureMethod%3DHMAC-SHA1%26SignatureNonce%3DNwDAxvLU6tFE0DVb%26Sign" +
                "atureVersion%3D1.0%26TimeStamp%3D2012-12-26T10%253A33%253A56Z%26Version%3D2013-01-10", "testsecret&");
            assertEquals("axE3FUHgDyfm9/+Iep0HpZXrRwE=", sign);
        } catch (InvalidKeyException e) {
            fail(e.toString());
        } catch (IllegalStateException e) {
            fail(e.toString());
        }
    }

}
