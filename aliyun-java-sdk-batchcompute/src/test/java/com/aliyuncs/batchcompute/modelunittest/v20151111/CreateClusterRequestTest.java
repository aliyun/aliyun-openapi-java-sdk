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


import com.aliyuncs.batchcompute.model.v20151111.*;
import com.aliyuncs.batchcompute.pojo.v20151111.*;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import junit.framework.TestCase;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by guangchun.luo on 15/4/14.
 */
public class CreateClusterRequestTest extends TestCase {

    @Test
    public void testDefaultConstructor() {
        CreateClusterRequest req = new CreateClusterRequest();
        assertEquals(req.getMethod(), MethodType.POST);
        assertEquals(req.getUriPattern(), "/clusters");
        assertEquals(req.getProduct(), "BatchCompute");
    }

    @Test
    public void testConstructor() throws ClientException, IOException {

        ClusterDescription desc = createCluster();

        CreateClusterRequest req = new CreateClusterRequest();
        req.setClusterDescription(desc);

        req.setIdempotentToken("abc123");

        assertEquals(req.getMethod(), MethodType.POST);
        assertEquals(req.getUriPattern(), "/clusters");
        assertEquals(req.getProduct(), "BatchCompute");
        assertEquals(req.getIdempotentToken(), "abc123");

        String contentString = null;
        try {
            contentString = new String(req.getContent(), "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


        ObjectMapper objectMapper = new ObjectMapper();
        ClusterDescription clusterDesc = objectMapper.readValue(contentString, ClusterDescription.class);


        //check

        assertEquals("cluster1", clusterDesc.getName());
        assertEquals("testCluster", clusterDesc.getDescription());
        assertEquals("img-111", clusterDesc.getImageId());

        GroupDescription group1 = clusterDesc.getGroups().get("group1");

        assertTrue(3==group1.getDesiredVMCount());

        assertEquals("OnDemand", group1.getResourceType());
        assertEquals("ecs", group1.getInstanceType());

    }



    private ClusterDescription createCluster() {

        ClusterDescription cluster = new ClusterDescription();
        cluster.setName("cluster1");
        cluster.setDescription("testCluster");
        cluster.setImageId("img-111");
        cluster.addGroup("group1", createGroupDescription());
        return cluster;
    }

    private GroupDescription createGroupDescription(){

        GroupDescription group = new GroupDescription();

        group.setDesiredVMCount(3);
        group.setInstanceType("ecs");
        group.setResourceType("OnDemand");

        return group;
    }

}
