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
import com.aliyuncs.batchcompute.model.v20151111.GetQuotasResponse;
import com.aliyuncs.batchcompute.pojo.v20151111.Cluster;
import com.aliyuncs.batchcompute.pojo.v20151111.Job;
import com.aliyuncs.batchcompute.pojo.v20151111.Quotas;
import com.aliyuncs.batchcompute.util.Config;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.regions.Endpoint;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class RegionTest extends TestCase {

    private static BatchCompute client;

    final String PRODUCT_CODE = "batchcompute";

    @Override
    public void setUp() throws Exception {

        //BatchComputeClient.useHttps = true;
        BatchComputeClient.verbose = true;
    }

    @Test
    public void testListJob() throws ClientException {


        run("cn-beijing");
        run("cn-hangzhou");
        run("cn-qingdao");
        run("cn-shenzhen");
        run("cn-shanghai");


        Map<String,String> m = BatchComputeClient.listEndpoints();
        for (Map.Entry<String, String> entry : m.entrySet()) {
            System.out.println(entry.getKey() +"======>"+ entry.getValue());
            assertEquals("batchcompute."+entry.getKey()+".aliyuncs.com", entry.getValue());
        }

    }

    public void run(String region) throws ClientException {
        Config cfg = Config.getInstance();
        client = new BatchComputeClient(region, cfg.getAccessId(), cfg.getAccessKey());

        List<Job>  arr = client.listJobs().getItems();

        if(arr!=null)
            for(Job j: arr){
                System.out.println(j.getId());
            }
    }
}