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

import com.aliyuncs.batchcompute.model.v20151111.ListClustersResponse;
import com.aliyuncs.batchcompute.model.v20151111.ListJobsResponse;
import com.aliyuncs.batchcompute.pojo.v20151111.Cluster;
import com.aliyuncs.batchcompute.pojo.v20151111.Job;
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
public class ListJobsResponseTest extends TestCase {

    public void testGetInstance() throws ServerException {

        ListJobsResponse res = new ListJobsResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");
        String body = FileLoader.loadFile("resources/v20151111/listJobs.json");

        httpResponse.setHttpContent(body.getBytes(), "utf-8", FormatType.JSON);

        context.setHttpResponse(httpResponse);

        res.getInstance(context);

        List<Job> list = res.getItems();

        Job job = list.get(0);
        assertEquals("BatchcomputePythonSDKJob", job.getName());
        assertEquals("job-00000000564ECC3F0000A25D0000000C", job.getId());
        assertEquals("Finished", job.getState());

        assertEquals(1448005498164L, job.getCreationTime().getTime());
        assertEquals(0, job.getInstanceMetrics().getRunningCount());
        assertEquals(3, job.getInstanceMetrics().getFinishedCount());
        assertEquals(0, job.getInstanceMetrics().getFailedCount());
        assertEquals(0, job.getInstanceMetrics().getStoppedCount());
        assertEquals(0, job.getInstanceMetrics().getWaitingCount());

        assertEquals("", job.getMessage());
        assertEquals(48351, job.getOwnerId());

        assertEquals(0, job.getTaskMetrics().getRunningCount());
        assertEquals(1, job.getTaskMetrics().getFinishedCount());
        assertEquals(0, job.getTaskMetrics().getFailedCount());
        assertEquals(0, job.getTaskMetrics().getStoppedCount());
        assertEquals(0, job.getTaskMetrics().getWaitingCount());



    }

    public void testGetInstanceWithUnsupportedEncoding() {

        ListJobsResponse res = new ListJobsResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");
        String body = FileLoader.loadFile("resources/v20151111/listJobs.json");

        httpResponse.setHttpContent(body.getBytes(), "xxx", FormatType.JSON);

        context.setHttpResponse(httpResponse);
        try {
            res.getInstance(context);
        } catch (ServerException e) {
            assertEquals(e.getErrCode(), "API.EncodeError");
        }
    }


    @Test
    public void testGetInstanceWithIncorrectJSON() {
        ListJobsResponse res = new ListJobsResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");
        String str = "{\"Id\":\"xxxooo";

        httpResponse.setHttpContent(str.getBytes(), "utf-8", FormatType.JSON);

        context.setHttpResponse(httpResponse);
        try {
            res.getInstance(context);
        } catch (ServerException e) {
            assertEquals(e.getErrCode(), "API.EncodeError");
        }

    }
}
