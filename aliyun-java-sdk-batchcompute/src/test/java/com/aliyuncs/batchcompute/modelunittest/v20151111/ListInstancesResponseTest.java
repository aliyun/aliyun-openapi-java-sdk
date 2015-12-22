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

package com.aliyuncs.batchcompute.modelunittest.v20151111;

import com.aliyuncs.batchcompute.model.v20151111.ListInstancesResponse;
import com.aliyuncs.batchcompute.model.v20151111.ListTasksResponse;
import com.aliyuncs.batchcompute.pojo.v20151111.Instance;
import com.aliyuncs.batchcompute.pojo.v20151111.Task;
import com.aliyuncs.batchcompute.util.FileLoader;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

/**
 * Created by guangchun.luo on 15/4/16.
 */
public class ListInstancesResponseTest extends TestCase {

    public void testGetInstance() throws ServerException {

        ListInstancesResponse res = new ListInstancesResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");
        String body = FileLoader.loadFile("resources/v20151111/listInstances.json");

        httpResponse.setContent(body.getBytes(), "utf-8", FormatType.JSON);

        context.setHttpResponse(httpResponse);

        res.getInstance(context);

        List<Instance> list = res.getItems();
        Instance ins = list.get(0);

        assertEquals(0, ins.getInstanceId());

        assertEquals("Stopped", ins.getState());

        assertEquals("oss://my-bucket/test/logs/0.stderr", ins.getStderrRedirectPath());
        assertEquals("oss://my-bucket/test/logs/0.stdout", ins.getStdoutRedirectPath());
        assertEquals(null, ins.getEndTime());
        assertEquals(null, ins.getStartTime());
        assertEquals(0, ins.getRetryCount());

        assertEquals("0", res.getNextMarker());


        assertEquals(0, ins.getResult().getExitCode());
        assertEquals("", ins.getResult().getDetail());
        assertEquals("", ins.getResult().getErrorCode());
        assertEquals("", ins.getResult().getErrorMessage());

    }

    public void testGetInstanceWithUnsupportedEncoding() {

        ListInstancesResponse res = new ListInstancesResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");
        String body = FileLoader.loadFile("resources/v20151111/listInstances.json");

        httpResponse.setContent(body.getBytes(), "xxx", FormatType.JSON);

        context.setHttpResponse(httpResponse);
        try {
            res.getInstance(context);
        } catch (ServerException e) {
            assertEquals(e.getErrCode(), "API.EncodeError");
        }
    }


    @Test
    public void testGetInstanceWithIncorrectJSON() {
        ListInstancesResponse res = new ListInstancesResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");
        String str = "{\"InstanceId\":0";

        httpResponse.setContent(str.getBytes(), "utf-8", FormatType.JSON);

        context.setHttpResponse(httpResponse);
        try {
            res.getInstance(context);
        } catch (ServerException e) {
            assertEquals(e.getErrCode(), "API.EncodeError");
        }

    }
}
