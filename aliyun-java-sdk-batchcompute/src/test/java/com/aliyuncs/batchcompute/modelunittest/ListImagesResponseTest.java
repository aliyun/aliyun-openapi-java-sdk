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

package com.aliyuncs.batchcompute.modelunittest;

import com.aliyuncs.batchcompute.model.v20150630.ListImagesResponse;
import com.aliyuncs.batchcompute.pojo.v20150630.Image;
import com.aliyuncs.batchcompute.util.FileLoader;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by guangchun.luo on 15/5/19.
 */
public class ListImagesResponseTest extends TestCase {

    @Test
    public void testParseHttpResponse() throws IOException {
        ListImagesResponse res = new ListImagesResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");
        String body = FileLoader.loadFile("resources/listImages.json");

        httpResponse.setContent(body.getBytes(), "utf-8", FormatType.JSON);

        context.setHttpResponse(httpResponse);

        try {
            res.getInstance(context);
        } catch (ClientException e) {
            e.printStackTrace();
        }
        assertTrue(2 == res.getImageList().size());

        Image img = res.getImageList().get(0);

        assertEquals("img-0000000050FE595A755400000001",img.getImageId());
        assertEquals("Normal Image", img.getImageName());
        assertEquals("Linux", img.getPlatform());
        assertEquals("Linux Images", img.getDescription());
    }


    public void testGetGetInstanceWithUnsupportedEncoding() {

        ListImagesResponse res = new ListImagesResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");
        String body = FileLoader.loadFile("resources/listImages.json");

        httpResponse.setContent(body.getBytes(), "xxx", FormatType.JSON);

        context.setHttpResponse(httpResponse);
        try {
            res.getInstance(context);
        } catch (ClientException e) {
            assertEquals(e.getErrCode(), "API.EncodeError");
        }
    }


    @Test
    public void testGetGetInstanceWithIncorrectJSON() {
        ListImagesResponse res = new ListImagesResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");
        String str = "{\"x\":\"xxxooo";

        httpResponse.setContent(str.getBytes(), "utf-8", FormatType.JSON);

        context.setHttpResponse(httpResponse);

        try {
            res.getInstance(context);
        } catch (ServerException e) {
            assertEquals(e.getErrCode(), "API.EncodeError");
        }


    }
}
