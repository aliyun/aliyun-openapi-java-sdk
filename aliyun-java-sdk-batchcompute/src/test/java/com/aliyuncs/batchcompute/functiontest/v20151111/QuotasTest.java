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
import com.aliyuncs.batchcompute.pojo.v20151111.Quotas;
import com.aliyuncs.batchcompute.util.Config;
import com.aliyuncs.exceptions.ClientException;
import junit.framework.TestCase;
import org.junit.Test;


public class QuotasTest extends TestCase {

    private static BatchCompute client;

    private String gImageId;



    @Override
    public void setUp() throws Exception {
        Config cfg = Config.getInstance();

        BatchComputeClient.verbose = true;
        BatchComputeClient.addRequestHeader("x-acs-source-ip", "127.0.0.1");
        BatchComputeClient.addRequestHeader("x-acs-secure-transport", "true");

        BatchComputeClient.addEndpoint("caichi","batchcompute.caichi.aliyuncs.com");
        //BatchComputeClient.addEndpoint("cn-beijing", "batchcompute.cn-beijing.aliyuncs.com");
        gImageId = cfg.getEcsImageId();
        System.out.println("==========" + gImageId);

        client = new BatchComputeClient(cfg.getRegionId(), cfg.getAccessId(), cfg.getAccessKey());
    }

    @Test
    public void testGetQuotas() throws ClientException {

         BatchComputeClient.listEndpoints();

        GetQuotasResponse res = client.getQuotas();
        Quotas q = res.getQuotas();
        System.out.println(q.getAvailableClusterInstanceType());

    }



    //img-6kiif1hv7lelk7n0r9o002


}
