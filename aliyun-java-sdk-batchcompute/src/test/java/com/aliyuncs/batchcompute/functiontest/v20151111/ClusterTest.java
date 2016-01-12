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

package com.aliyuncs.batchcompute.functiontest.v20151111;

import com.aliyuncs.batchcompute.main.v20151111.BatchCompute;
import com.aliyuncs.batchcompute.main.v20151111.BatchComputeClient;
import com.aliyuncs.batchcompute.model.v20151111.*;
import com.aliyuncs.batchcompute.pojo.v20151111.Cluster;
import com.aliyuncs.batchcompute.pojo.v20151111.ClusterDescription;
import com.aliyuncs.batchcompute.pojo.v20151111.Group;
import com.aliyuncs.batchcompute.pojo.v20151111.GroupDescription;
import com.aliyuncs.batchcompute.util.Config;
import com.aliyuncs.exceptions.ClientException;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;


/**
 * Created by guangchun.luo on 15/4/14.
 */
public class ClusterTest extends TestCase {

    private static BatchCompute client;

    private String gImageId;

    private String gClusterId;


    @Override
    public void setUp() throws Exception {
        Config cfg = Config.getInstance();

        BatchComputeClient.verbose = true;
        BatchComputeClient.addRequestHeader("x-acs-source-ip", "127.0.0.1");
        BatchComputeClient.addRequestHeader("x-acs-secure-transport", "true");

        gImageId = cfg.getEcsImageId();
        System.out.println("=========="+gImageId);

        client = new BatchComputeClient(cfg.getRegionId(), cfg.getAccessId(), cfg.getAccessKey());
    }

    @Test
    public void testCluster() throws ClientException {


        //1. create cluster

        ClusterDescription desc = getClusterDesc();

        CreateClusterResponse res = client.createCluster(desc);

        assertEquals(201, res.getStatusCode());

        gClusterId = res.getClusterId();
        System.out.println("-------->ClusterId: "+gClusterId);
        assertTrue(gClusterId.startsWith("cls-"));



         //2. get cluster

        GetClusterResponse getClusterResponse = client.getCluster(gClusterId);
        Cluster cluster  = getClusterResponse.getCluster();

        assertEquals("cluster_test", cluster.getName());
        assertEquals(gImageId, cluster.getImageId());
        assertEquals("java sdk test", cluster.getDescription());

        Group group = cluster.getGroups().get("group1");

        assertEquals("OnDemand", group.getResourceType());
        assertTrue(3 >= group.getActualVMCount());
        assertTrue(3 == group.getDesiredVMCount());


        //3. list cluster
        ListClustersResponse listClustersResponse = client.listClusters();
        assertEquals(200, listClustersResponse.getStatusCode());

        List<Cluster> list = listClustersResponse.getItems();

        assertTrue(list.size()>0);
        assertTrue(list.get(0).getState()!=null);




        //4. update
        ChangeClusterDesiredVMCountResponse res2 = client.changeClusterDesiredVMCount(gClusterId, "group1", 4);
        assertEquals(200, res2.getStatusCode());

        //5. check cluster desired vm count

        GetClusterResponse getClusterResponse2 = client.getCluster(gClusterId);
        Group group3 = getClusterResponse2.getCluster().getGroups().get("group1");

        assertTrue(4 >= group3.getActualVMCount());
        assertTrue(4 == group3.getDesiredVMCount());


        // 6. delete cluster
        DeleteClusterResponse deleteClusterResponse = client.deleteCluster(gClusterId);

        int delStatusCode = deleteClusterResponse.getStatusCode();
        System.out.println("--------delete status code:"+ delStatusCode);

        assertTrue(200 == delStatusCode || 204 == delStatusCode || 202 == delStatusCode);
    }



    private ClusterDescription getClusterDesc(){
        ClusterDescription desc = new ClusterDescription();

        desc.setName("cluster_test");
        desc.setImageId(gImageId);
        desc.setDescription("java sdk test");


        GroupDescription groupDesc = new GroupDescription();
        groupDesc.setDesiredVMCount(3);
        groupDesc.setInstanceType("ecs.t1.small");
        groupDesc.setResourceType("OnDemand");
        desc.addGroup("group1", groupDesc);

        return desc;
    }

}
