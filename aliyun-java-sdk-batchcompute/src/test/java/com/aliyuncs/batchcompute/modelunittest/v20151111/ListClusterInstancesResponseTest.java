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

import com.aliyuncs.batchcompute.model.v20151111.ListClusterInstancesResponse;
import com.aliyuncs.batchcompute.model.v20151111.ListInstancesResponse;
import com.aliyuncs.batchcompute.pojo.v20151111.ClusterInstance;
import com.aliyuncs.batchcompute.pojo.v20151111.Instance;
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
public class ListClusterInstancesResponseTest extends TestCase {

    public void testListClusterInstances() throws ServerException {

        ListClusterInstancesResponse res = new ListClusterInstancesResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");
        String body = FileLoader.loadFile("resources/v20151111/listClusterInstances.json");

        httpResponse.setHttpContent(body.getBytes(), "utf-8", FormatType.JSON);

        context.setHttpResponse(httpResponse);

        res.getInstance(context);

        List<ClusterInstance> list = res.getItems();
        ClusterInstance ins = list.get(0);

        assertEquals("ci-48351", ins.getId());

        assertEquals("Pending", ins.getState());
        assertEquals(1449566035470L, ins.getCreationTime().getTime());
        assertEquals("xxxooo", ins.getHint());

    }

    public void testListClusterInstancesWithUnsupportedEncoding() {

        ListClusterInstancesResponse res = new ListClusterInstancesResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");
        String body = FileLoader.loadFile("resources/v20151111/listClusterInstances.json");

        httpResponse.setHttpContent(body.getBytes(), "xxx", FormatType.JSON);

        context.setHttpResponse(httpResponse);
        try {
            res.getInstance(context);
        } catch (ServerException e) {
            assertEquals(e.getErrCode(), "API.EncodeError");
        }
    }


    @Test
    public void testListClusterInstancesWithIncorrectJSON() {
        ListClusterInstancesResponse res = new ListClusterInstancesResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");
        String str = "{\"Id\":0";

        httpResponse.setHttpContent(str.getBytes(), "utf-8", FormatType.JSON);

        context.setHttpResponse(httpResponse);
        try {
            res.getInstance(context);
        } catch (ServerException e) {
            assertEquals(e.getErrCode(), "API.EncodeError");
        }

    }
}
