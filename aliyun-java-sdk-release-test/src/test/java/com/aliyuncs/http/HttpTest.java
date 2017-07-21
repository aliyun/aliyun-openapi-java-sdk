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
package com.aliyuncs.http;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class HttpTest {

    @Test
    public void test() {
        testHttpGet();
        testHttpPut();
        testHttps();
    }

    private void testHttps() {
        HttpRequest request = new HttpRequest("https://acs.aliyun-inc.com/");
        request.setMethod(MethodType.GET);
        try {
            X509TrustAll.ignoreSSLCertificate();
            HttpResponse response = HttpResponse.getResponse(request);
            String strResult = new String(response.getHttpContent(), response.getEncoding());
            assertEquals(400, response.getStatus());
            assertNotNull(strResult);
        } catch (IOException e) {
            fail(e.toString());
            e.printStackTrace();
        } finally {
            X509TrustAll.restoreSSLCertificate();
        }
    }

    private void testHttpGet() {
        HttpRequest request = new HttpRequest("http://acs.aliyun-inc.com/");
        request.setMethod(MethodType.GET);
        try {
            HttpResponse response = HttpResponse.getResponse(request);
            String strResult = new String(response.getHttpContent(), response.getEncoding());
            assertEquals(400, response.getStatus());
            assertNotNull(strResult);
        } catch (IOException e) {
            fail(e.toString());
            e.printStackTrace();
        }
    }

    private void testHttpPut() {
        String content = "<Product name=\"Yundun\" domain=\"yundun.aliyuncs.com\"/>";
        HttpRequest request = new HttpRequest("http://acs.aliyun-inc.com/");
        request.setMethod(MethodType.PUT);
        try {
            request.setHttpContent(content.getBytes("UTF-8"), "UTF-8", FormatType.XML);
            HttpResponse response = HttpResponse.getResponse(request);
            String strResult = new String(response.getHttpContent(), response.getEncoding());
            assertEquals(400, response.getStatus());
            assertNotNull(strResult);
        } catch (IOException e) {
            fail(e.toString());
            e.printStackTrace();
        }
    }
}
