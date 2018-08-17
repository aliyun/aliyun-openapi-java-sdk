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
package com.aliyuncs;

import com.aliyuncs.auth.Credential;
import com.aliyuncs.ecs.v20140526.model.DescribeRegionsRequest;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.profile.DefaultProfile;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@SuppressWarnings("deprecation")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ClientExceptionTest extends BaseTest {

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Test(expected = ClientException.class)
    public void test2_InvalidRegionId() throws ClientException {
        DefaultAcsClient client = new DefaultAcsClient(DefaultProfile.getProfile());
        AcsRequest request = new DescribeRegionsRequest();

        try {
            client.doAction(request, "cn-invalid-region", new Credential("testid", "testsecret"));
        } catch (ServerException e) {
            fail(e.toString());
        } catch (ClientException e) {
            assertEquals("SDK.InvalidRegionId", e.getErrCode());
            throw e;
        }
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Test
    public void test3_InvalidAccessKeyId() throws Exception {
        DefaultAcsClient client = new DefaultAcsClient(DefaultProfile.getProfile());
        AcsRequest request = new DescribeRegionsRequest();

        request.setEndpoint("ecs.aliyuncs.com");
        HttpResponse response = client.doAction(request, "cn-beijing", new Credential("testid", "testsecret"));
        assertNotNull(response);
        assertEquals(404, response.getStatus());
        assertTrue(new String(response.getHttpContent(), "UTF-8").contains("<Code>InvalidAccessKeyId.NotFound</Code>"));
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Test(expected = ClientException.class)
    public void test5_ServerUnreachable() throws ClientException {
        DefaultAcsClient client = new DefaultAcsClient(DefaultProfile.getProfile());
        AcsRequest request = new DescribeRegionsRequest();

        try {
            DefaultProfile.addEndpoint("cn-hangzhou", "cn-beijing", "Ecs", "unreachable.aliyuncs.com");
            client.doAction(request, "cn-beijing", new Credential("testid", "testsecret"));
        } catch (ClientException e) {
            assertEquals("SDK.ServerUnreachable", e.getErrCode());
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.toString());
        } finally {
            // restore
            DefaultProfile.addEndpoint("cn-hangzhou", "cn-beijing", "Ecs", "ecs-cn-hangzhou.aliyuncs.com");
        }
    }
}
