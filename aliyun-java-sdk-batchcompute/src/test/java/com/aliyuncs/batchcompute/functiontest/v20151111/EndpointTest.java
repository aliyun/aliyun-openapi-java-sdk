/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.batchcompute.functiontest.v20151111;


import com.aliyuncs.batchcompute.main.v20151111.BatchCompute;
import com.aliyuncs.batchcompute.main.v20151111.BatchComputeClient;
import com.aliyuncs.batchcompute.model.v20151111.GetQuotasResponse;
import com.aliyuncs.batchcompute.pojo.v20151111.Quotas;
import com.aliyuncs.batchcompute.util.Config;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.regions.Endpoint;
import com.aliyuncs.regions.ProductDomain;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;


public class EndpointTest extends TestCase {

    Config cfg;

    @Override
    public void setUp() throws Exception {

        cfg = Config.getInstance();
        BatchComputeClient.verbose = true;
        BatchComputeClient.addRequestHeader("x-acs-source-ip", "127.0.0.1");
        BatchComputeClient.addRequestHeader("x-acs-secure-transport", "true");

    }

    @Test
    public void testGetQuotas() throws ClientException {

        doTest("cn-beijing");
        doTest("cn-hangzhou");
        doTest("cn-shenzhen");
        doTest("cn-qingdao");

        //第二轮
        doTest("cn-beijing");
        doTest("cn-hangzhou");
        doTest("cn-shenzhen");
        doTest("cn-qingdao");
    }

    private void doTest(String regionId) throws ClientException {
        BatchCompute client = new BatchComputeClient(regionId, cfg.getAccessId(), cfg.getAccessKey());
        GetQuotasResponse res = client.getQuotas();
        assertEquals("http://batchcompute." + regionId + ".aliyuncs.com/quotas", res.getHttpResponse().getUrl());
    }

}
