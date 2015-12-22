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

package com.aliyuncs.batchcompute.modelunittest.v20150630;


import com.aliyuncs.batchcompute.model.v20150630.UpdateJobRequest;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by guangchun.luo on 15/4/14.
 */
public class UpdateJobRequestTest extends TestCase {


    @Test
    public void testSetContent() throws NoSuchAlgorithmException, IOException {
        UpdateJobRequest req = new UpdateJobRequest();
        String RESOURCE_ID = "xxx123";

        req.setJobId(RESOURCE_ID);
        req.setPriority(2);

        assertEquals(req.getJobId(), RESOURCE_ID);
        assertEquals(req.getPriority(), 2);

    }


    @Test
    public void testSetContent2() throws NoSuchAlgorithmException, IOException {

        String RESOURCE_ID = "xxx123";
        UpdateJobRequest req = new UpdateJobRequest(RESOURCE_ID, 2);

        assertEquals(req.getJobId(), RESOURCE_ID);
        assertEquals(req.getPriority(), 2);

    }
}
