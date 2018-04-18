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

import com.aliyuncs.http.clients.CompatibleUrlConnClient;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class HttpsTest {

    @Test
    public void testIgnore() {
        HttpRequest request = new HttpRequest("https://acs.aliyun-inc.com/");
        request.setMethod(MethodType.GET);
        try {
            X509TrustAll.ignoreSSLCertificate();
            HttpResponse response = CompatibleUrlConnClient.compatibleGetResponse(request);
            String strResult = new String(response.getHttpContent(), response.getEncoding());
            assertEquals(400, response.getStatus());
            assertNotNull(strResult);
        } catch (Exception e) {
            //fail(e.toString());
            e.printStackTrace();
        } finally {
            X509TrustAll.restoreSSLCertificate();
        }
    }

    //@Test
    //public void testCert() {
    //    HttpRequest request = new HttpRequest("https://acs.aliyun-inc.com/");
    //    request.setMethod(MethodType.GET);
    //    try {
    //        X509TrustAll.ignoreSSLCertificate();
    //        HttpResponse response = HttpResponse.getResponse(request);
    //        String strResult = new String(response.getHttpContent(), response.getEncoding());
    //        assertEquals(404, response.getStatus());
    //        assertNotNull(strResult);
    //    } catch (Exception e) {
    //        //fail(e.toString());
    //        e.printStackTrace();
    //    } finally {
    //        X509TrustAll.restoreSSLCertificate();
    //    }
    //}
    //
    //@Test
    //public void testTrustStore() {
    //    HttpRequest request = new HttpRequest("https://acs.aliyun-inc.com/");
    //    request.setMethod(MethodType.GET);
    //    try {
    //        HttpResponse response = HttpResponse.getResponse(request);
    //        String strResult = new String(response.getHttpContent(), response.getEncoding());
    //        assertEquals(400, response.getStatus());
    //        assertNotNull(strResult);
    //    } catch (Exception e) {
    //        fail(e.toString());
    //        e.printStackTrace();
    //    }
    //}

    @Test
    public void testHttpsPut() {
        String content = "<Product name=\"Yundun\" domain=\"yundun.aliyuncs.com\"/>";
        HttpRequest request = new HttpRequest("https://acs.aliyun-inc.com/");
        request.setMethod(MethodType.PUT);
        try {
            request.setHttpContent(content.getBytes("UTF-8"), "UTF-8", FormatType.XML);
            HttpResponse response = CompatibleUrlConnClient.compatibleGetResponse(request);
            String strResult = new String(response.getHttpContent(), response.getEncoding());
            assertEquals(400, response.getStatus());
            assertNotNull(strResult);
        } catch (Exception e) {
            fail(e.toString());
            e.printStackTrace();
        }
    }
}
