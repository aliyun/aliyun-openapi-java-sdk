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
package com.aliyuncs.oss;

import org.junit.Assert;
import org.junit.Test;

import com.aliyuncs.BaseTest;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.oss.model.ListBucketRequest;
import com.aliyuncs.oss.model.ListBucketResponse;

public class OssTest extends BaseTest {

    @Test
    public void listBucketTest() {
        try {
            ListBucketRequest listBucketRequest = new ListBucketRequest();
            ListBucketResponse listBucketResponse = client.getAcsResponse(listBucketRequest);

            Assert.assertNotNull(listBucketResponse.getOwner().getId());
            Assert.assertNotNull(listBucketResponse.getOwner().getDisplayName());

        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
