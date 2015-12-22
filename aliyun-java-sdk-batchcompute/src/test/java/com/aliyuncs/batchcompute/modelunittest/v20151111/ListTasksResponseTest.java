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

import com.aliyuncs.batchcompute.model.v20151111.ListJobsResponse;
import com.aliyuncs.batchcompute.model.v20151111.ListTasksResponse;
import com.aliyuncs.batchcompute.pojo.v20151111.Job;
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
public class ListTasksResponseTest extends TestCase {

    public void testGetInstance() throws ServerException {

        ListTasksResponse res = new ListTasksResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");
        String body = FileLoader.loadFile("resources/v20151111/listTasks.json");

        httpResponse.setContent(body.getBytes(), "utf-8", FormatType.JSON);

        context.setHttpResponse(httpResponse);

        res.getInstance(context);

        List<Task> list = res.getItems();

        Task task = list.get(0);

        assertEquals("task_1", task.getTaskName());
        assertEquals("Stopped", task.getState());

        assertEquals(1, task.getInstanceMetrics().getWaitingCount());
        assertEquals(0, task.getInstanceMetrics().getRunningCount());
        assertEquals(0, task.getInstanceMetrics().getStoppedCount());
        assertEquals(0, task.getInstanceMetrics().getFailedCount());
        assertEquals(0, task.getInstanceMetrics().getFinishedCount());
        assertEquals(null, task.getEndTime());
        assertEquals(null, task.getStartTime());

        assertEquals("", res.getNextMarker());



    }

    public void testGetInstanceWithUnsupportedEncoding() {

        ListTasksResponse res = new ListTasksResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");
        String body = FileLoader.loadFile("resources/v20151111/listTasks.json");

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
        ListTasksResponse res = new ListTasksResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");
        String str = "{\"Id\":\"xxxooo";

        httpResponse.setContent(str.getBytes(), "utf-8", FormatType.JSON);

        context.setHttpResponse(httpResponse);
        try {
            res.getInstance(context);
        } catch (ServerException e) {
            assertEquals(e.getErrCode(), "API.EncodeError");
        }

    }
}
