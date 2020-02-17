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
public class ClusterTest extends TestCase {

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

        gMnsEndpoint = "mns."+cfg.getRegionId()+".aliyuncs.com";

        client = new BatchComputeClient(cfg.getRegionId(), cfg.getAccessId(), cfg.getAccessKey());

        List<String> arr = client.getQuotas().getQuotas().getAvailableClusterInstanceType();
        gInstanceType = arr.get(0);
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
//        assertEquals("GTX", cluster.)

        Group group = cluster.getGroups().get("group1");

        assertEquals("OnDemand", group.getResourceType());
        assertTrue(3 >= group.getActualVMCount());
        assertTrue(3 == group.getDesiredVMCount());
        assertEquals("bb", cluster.getUserData().get("a"));


        Disks disks  = cluster.getConfigs().getDisks();
        DataDisk dataDisk = disks.getDataDisk();
        assertEquals(400, dataDisk.getSize());
        assertEquals("/home/admin/xxx", dataDisk.getMountPoint());
        //assertEquals("cloud", dataDisk.getType());

        SystemDisk systemDisk = disks.getSystemDisk();
        assertEquals(80, systemDisk.getSize());

        Topic topic = cluster.getNotification().getTopic();
        assertEquals("tp_n2", topic.getName());
        assertEquals(gMnsEndpoint, topic.getEndpoint());
        assertEquals(2, topic.getEvents().size());


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


        //change vm count to 0
        ChangeClusterDesiredVMCountResponse res3 = client.changeClusterDesiredVMCount(gClusterId, "group1", 0);
        assertEquals(200, res3.getStatusCode());

        GetClusterResponse getClusterResponse3 = client.getCluster(gClusterId);
        Group group4 = getClusterResponse3.getCluster().getGroups().get("group1");
        assertTrue(0 == group4.getDesiredVMCount());


        // 6. delete cluster
        DeleteClusterResponse deleteClusterResponse = client.deleteCluster(gClusterId);

        int delStatusCode = deleteClusterResponse.getStatusCode();
        System.out.println("--------delete status code:"+ delStatusCode);

        assertTrue( 200 == delStatusCode);
    }


    @Test
    public void testCluster2() throws ClientException {


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
        desc.setDependencyIsvService("GTX");


        GroupDescription groupDesc = new GroupDescription();
        groupDesc.setDesiredVMCount(3);
        groupDesc.setInstanceType(gInstanceType);
        groupDesc.setResourceType("OnDemand");
        desc.addGroup("group1", groupDesc);

        DataDisk dataDisk = new DataDisk();
        dataDisk.setSize(400);
        //dataDisk.setType("cloud");
        dataDisk.setMountPoint("/home/admin/xxx");
        desc.mountDataDisk(dataDisk);

        SystemDisk systemDisk = new SystemDisk();
        systemDisk.setSize(80); //GB
        //systemDisk.setType("cloud");
        desc.mountSystemDisk(systemDisk);

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
