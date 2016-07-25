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
 * Created by guangchun.luo on 2016-02-01.
 */
public class ClusterInstanceTest extends TestCase {

    private static BatchCompute client;

    private String gImageId;

    private String gClusterId;

    int DUR = 3000;


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

        assertEquals("cluster_instance_test", cluster.getName());
        assertEquals(gImageId, cluster.getImageId());
        assertEquals("java sdk test", cluster.getDescription());

        Group group = cluster.getGroups().get("group1");

        assertEquals("OnDemand", group.getResourceType());
        assertTrue(1 >= group.getActualVMCount());
        assertTrue(1 == group.getDesiredVMCount());
        assertEquals("bb", cluster.getUserData().get("a"));


        String clusterInstanceId = "";
        while(true){
            ListClusterInstancesRequest req = new ListClusterInstancesRequest();
            req.setGroupName("group1");
            req.setClusterId(gClusterId);

            ListClusterInstancesResponse res2 = client.listClusterInstances(req);
            List<ClusterInstance> list = res2.getItems();


            if(list.size()>0){
                clusterInstanceId = list.get(0).getId();
                break;
            }
            try {
                Thread.sleep(DUR);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        //3. get cluster instance
        GetClusterInstanceResponse getClusterInstanceResponse = client.getClusterInstance(gClusterId,"group1",clusterInstanceId);

        assertEquals(clusterInstanceId, getClusterInstanceResponse.getClusterInstance().getId());


        // 4. recreate

        String clusterInstanceId2 = null;
        client.recreateClusterInstance(gClusterId, "group1", clusterInstanceId);

        GetClusterInstanceResponse getClusterInstanceResponse2 = client.getClusterInstance(gClusterId,"group1",clusterInstanceId);
        assertEquals("Deleting",getClusterInstanceResponse2.getClusterInstance().getState());

        while(true){

            ListClusterInstancesResponse res3 = client.listClusterInstances(gClusterId, "group1");

            List<ClusterInstance> list = res3.getItems();


            if(list.size()>0 && !list.get(0).getId().equals(clusterInstanceId)){
                clusterInstanceId2 = list.get(0).getId();
                break;
            }

            try {
                Thread.sleep(DUR);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //5. delete cluster instance
        DeleteClusterInstanceResponse delres= client.deleteClusterInstance(gClusterId, "group1", clusterInstanceId2);
        int scode = delres.getStatusCode();
        assertTrue(200 == scode || 204 == scode || 202 == scode);


        //5. check cluster desired vm count
        while(true) {
            GetClusterResponse getClusterResponse2 = client.getCluster(gClusterId);
            Cluster cluster2  = getClusterResponse2.getCluster();

            if(0==cluster2.getGroups().get("group1").getDesiredVMCount()) {
                assertEquals(0,cluster2.getGroups().get("group1").getDesiredVMCount());
                break;
            }


            try {
                Thread.sleep(DUR);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



        // 6. delete cluster
        DeleteClusterResponse deleteClusterResponse = client.deleteCluster(gClusterId);

        int delStatusCode = deleteClusterResponse.getStatusCode();
        System.out.println("--------delete status code:"+ delStatusCode);

        assertTrue(202 == delStatusCode);
    }



    private ClusterDescription getClusterDesc(){
        ClusterDescription desc = new ClusterDescription();

        desc.setName("cluster_instance_test");
        desc.setImageId(gImageId);
        desc.setDescription("java sdk test");


        GroupDescription groupDesc = new GroupDescription();
        groupDesc.setDesiredVMCount(1);
        groupDesc.setInstanceType("ecs.t1.small");
        groupDesc.setResourceType("OnDemand");
        desc.addGroup("group1", groupDesc);

        desc.addUserData("a","bb");

        return desc;
    }

}
