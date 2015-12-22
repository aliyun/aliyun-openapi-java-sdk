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

import com.aliyuncs.batchcompute.model.v20151111.GetClusterResponse;
import com.aliyuncs.batchcompute.model.v20151111.GetJobResponse;
import com.aliyuncs.batchcompute.pojo.v20151111.Cluster;
import com.aliyuncs.batchcompute.util.FileLoader;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import junit.framework.TestCase;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by guangchun.luo on 15/4/16.
 */
public class GetClusterResponseTest extends TestCase {

    public void testGetInstance() throws ServerException {

        GetClusterResponse res = new GetClusterResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");
        String body = FileLoader.loadFile("resources/v20151111/getCluster.json");

        httpResponse.setContent(body.getBytes(), "utf-8", FormatType.JSON);

        context.setHttpResponse(httpResponse);

        res.getInstance(context);

        Cluster cluster = res.getCluster();
        assertEquals(res.getCluster().getName(), "cluster_test");
        assertEquals("Active", res.getCluster().getState());

        assertEquals(0, cluster.getMetrics().getRunningCount());
        assertEquals(0, cluster.getMetrics().getStartingCount());
        assertEquals(0, cluster.getMetrics().getStoppedCount());
        assertEquals(0, cluster.getMetrics().getStoppingCount());

    }
    public void testGetInstance2() throws ServerException {

        GetClusterResponse res = new GetClusterResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");
        String body = FileLoader.loadFile("resources/v20151111/getCluster2.json");

        httpResponse.setContent(body.getBytes(), "utf-8", FormatType.JSON);

        context.setHttpResponse(httpResponse);

        res.getInstance(context);

        Cluster cluster = res.getCluster();
        assertEquals(res.getCluster().getName(), "cluster_test");
        assertEquals("Active", res.getCluster().getState());

        assertEquals(0, cluster.getMetrics().getRunningCount());
        assertEquals(0, cluster.getMetrics().getStartingCount());
        assertEquals(0, cluster.getMetrics().getStoppedCount());
        assertEquals(0, cluster.getMetrics().getStoppingCount());

    }

    public void testGetInstanceWithUnsupportedEncoding() {

        GetClusterResponse res = new GetClusterResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");
        String body = FileLoader.loadFile("resources/v20151111/getCluster.json");

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
        GetClusterResponse res = new GetClusterResponse();

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
