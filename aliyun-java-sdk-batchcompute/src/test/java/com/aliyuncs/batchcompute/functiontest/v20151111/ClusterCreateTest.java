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
import com.aliyuncs.batchcompute.pojo.v20151111.*;
import com.aliyuncs.batchcompute.util.Config;
import com.aliyuncs.exceptions.ClientException;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;


/**
 * Created by guangchun.luo on 15/4/14.
 */
public class ClusterCreateTest extends TestCase {

    private static BatchCompute client;

    private String gImageId =  "img-ubuntu";

    private String gClusterId;

    private String gInstanceType;

    private String gMnsEndpoint;

    @Override
    public void setUp() throws Exception {
        Config cfg = Config.getInstance();

        BatchComputeClient.verbose = true;
        BatchComputeClient.addRequestHeader("x-acs-source-ip", "127.0.0.1");
        BatchComputeClient.addRequestHeader("x-acs-secure-transport", "true");

        gMnsEndpoint  = "mns."+cfg.getRegionId()+".aliyuncs.com";

        client = new BatchComputeClient(cfg.getRegionId(), cfg.getAccessId(), cfg.getAccessKey());

        List<String> arr = client.getQuotas().getQuotas().getAvailableClusterInstanceType();
        gInstanceType = arr.get(0);
    }



    @Test
    public void testCluster() throws ClientException {


        //1. create cluster

        ClusterDescription desc = getClusterDesc();

        desc.getGroups().get("group1").setDesiredVMCount(0);

        CreateClusterResponse res = client.createCluster(desc);

        assertEquals(201, res.getStatusCode());

        String clusterId = res.getClusterId();
        System.out.println("-------->ClusterId: "+clusterId);
        assertTrue(clusterId.startsWith("cls-"));



        //2. get cluster

        GetClusterResponse getClusterResponse = client.getCluster(clusterId);
        Cluster cluster  = getClusterResponse.getCluster();

        assertTrue(0 == cluster.getGroups().get("group1").getDesiredVMCount());


        // 6. delete cluster
        DeleteClusterResponse deleteClusterResponse = client.deleteCluster(clusterId);

        int delStatusCode = deleteClusterResponse.getStatusCode();
        System.out.println("--------delete status code:"+ delStatusCode);

        assertTrue( 200 == delStatusCode);
    }



    private ClusterDescription getClusterDesc(){
        ClusterDescription desc = new ClusterDescription();

        desc.setName("cluster_test");
        desc.setImageId(gImageId);
        desc.setDescription("java sdk test");


        GroupDescription groupDesc = new GroupDescription();
        groupDesc.setDesiredVMCount(0);
        groupDesc.setInstanceType(gInstanceType);
        groupDesc.setResourceType("OnDemand");
        desc.addGroup("group1", groupDesc);

//        DataDisk dataDisk = new DataDisk();
//        dataDisk.setSize(400);
//        dataDisk.setType("cloud");
//        dataDisk.setMountPoint("/home/admin/xxx");
//        desc.mountDataDisk(dataDisk);

//        SystemDisk systemDisk = new SystemDisk();
//        systemDisk.setSize(30); //GB
//        systemDisk.setType("cloud");
//        desc.mountSystemDisk(systemDisk);

        desc.addUserData("a","bb");

        Notification noti = new Notification();
        Topic topic = new Topic();
        topic.addEvent(Topic.ON_CLUSTER_DELETED);
        topic.addEvent(Topic.ON_CLUSTER_INSTANCE_ACTIVE);
        noti.setTopic(topic);
        topic.setName("tp_n2");
        topic.setEndpoint(gMnsEndpoint);
        desc.setNotification(noti);

        return desc;
    }

}
