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

import com.aliyuncs.batchcompute.model.v20151111.GetJobDescriptionResponse;
import com.aliyuncs.batchcompute.pojo.v20151111.*;
import com.aliyuncs.batchcompute.util.FileLoader;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by guangchun.luo on 15/4/16.
 */
public class GetJobDescriptionResponseTest extends TestCase {

    public void testGetInstance() throws ServerException {

        GetJobDescriptionResponse res = new GetJobDescriptionResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");
        String body = FileLoader.loadFile("resources/v20151111/getJobDescription.json");

        httpResponse.setHttpContent(body.getBytes(), "utf-8", FormatType.JSON);

        context.setHttpResponse(httpResponse);

        res.getInstance(context);

        JobDescription desc = res.getJobDescription();

        assertEquals(desc.getName(), "jobName1");
        assertEquals(desc.isAutoRelease(), false);

        assertEquals(desc.getPriority(), 10);

        Topic topic = desc.getNotification().getTopic();

        assertEquals(topic.getName(), "test-topic");
        assertEquals(topic.getEndpoint(), "xxx");
        assertEquals(topic.getEvents().size(), 16);
        assertEquals(topic.getEvents().get(0), "OnJobWaiting");

        assertEquals(desc.getDag().getTasks().get("task_1").getAutoCluster().getConfigs().getNetworks().getVpc().getVpcId(),"vpc-xxx");

    }
    public void testGetInstanceMoreFields() throws ServerException {

        GetJobDescriptionResponse res = new GetJobDescriptionResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");
        String body = FileLoader.loadFile("resources/v20151111/getJobDescription2.json");

        httpResponse.setHttpContent(body.getBytes(), "utf-8", FormatType.JSON);

        context.setHttpResponse(httpResponse);

        res.getInstance(context);

        JobDescription desc = res.getJobDescription();

        assertEquals(desc.getName(), "jobName1");
        assertEquals(desc.isAutoRelease(), false);

        assertEquals(desc.getPriority(), 10);

        Topic topic = desc.getNotification().getTopic();

        assertEquals(topic.getName(), "test-topic");
        assertEquals(topic.getEndpoint(), "xxx");
        assertEquals(topic.getEvents().size(), 16);
        assertEquals(topic.getEvents().get(0), "OnJobWaiting");

        //vpc
        TaskDescription task1 = desc.getDag().getTasks().get("task_1");

        VPC vpc = task1.getAutoCluster().getConfigs().getNetworks().getVpc();


        assertEquals("10.0.0.0/8", vpc.getCidrBlock());
        assertEquals("Large.2", vpc.getExpressConnectSpec());
        assertEquals("cn-hangzhou", vpc.getOppositeRegionId());
        assertEquals("", vpc.getOppositeAccessPointId());
        assertEquals("VRouter", vpc.getOppositeRouterType());
        assertEquals("vtb-xxyyzz", vpc.getOppositeRouterId());
        assertEquals("xxyyzz", vpc.getOppositeInterfaceId());


        //task mounts 字段
        TaskDescription tdesc = desc.getDag().getTasks().get("task_1");

        Mounts task_mounts = tdesc.getMounts();
        assertEquals(task_mounts.getLocale(), "GBK");
        assertEquals(task_mounts.isLock(), false);

        assertEquals(task_mounts.getEntries().get(0).getDestination(),  "/home/admin/mount-dest2");
        assertEquals(task_mounts.getNas().getAccessGroup().get(0),  "group1");
        assertEquals(task_mounts.getNas().getFileSystem().get(0),  "filesystem1");
        assertEquals(task_mounts.getOss().getAccessKeyId(),  "abc");

        // auto cluster config mounts
        Mounts auto_mounts = tdesc.getAutoCluster().getConfigs().getMounts();

        assertEquals(auto_mounts.getLocale(), "GBK");
        assertEquals(auto_mounts.isLock(), false);

        assertEquals(auto_mounts.getEntries().get(0).getDestination(),  "/home/admin/mount-dest");
        assertEquals(auto_mounts.getNas().getAccessGroup().get(0),  "group1");
        assertEquals(auto_mounts.getNas().getFileSystem().get(0),  "filesystem1");
        assertEquals(auto_mounts.getOss().getAccessKeyId(),  "abc2");

        // net work
        ClassicNetWork cnw = tdesc.getAutoCluster().getConfigs().getNetworks().getClassic();
        assertEquals(cnw.getAllowIpAddress().get(0),  "10.1.1.1");


    }

    public void testGetInstanceWithUnsupportedEncoding() {

        GetJobDescriptionResponse res = new GetJobDescriptionResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");
        String body = FileLoader.loadFile("resources/v20151111/getJobDescription.json");

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
        GetJobDescriptionResponse res = new GetJobDescriptionResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");
        String str = "{\"ResourceId\":\"xxxooo";

        httpResponse.setHttpContent(str.getBytes(), "utf-8", FormatType.JSON);

        context.setHttpResponse(httpResponse);
        try {
            res.getInstance(context);
        } catch (ServerException e) {
            assertEquals(e.getErrCode(), "API.EncodeError");
        }

    }
}
