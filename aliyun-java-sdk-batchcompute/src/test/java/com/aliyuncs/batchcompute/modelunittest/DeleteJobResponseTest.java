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

package com.aliyuncs.batchcompute.modelunittest;

import com.aliyuncs.batchcompute.model.v20150630.DeleteJobResponse;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by guangchun.luo on 15/5/6.
 */
public class DeleteJobResponseTest extends TestCase {


    @Test
    public void testSetResourceId() {

        String REQUEST_ID = "xx000111";

        DeleteJobResponse deleteJobResponse = new DeleteJobResponse();
        deleteJobResponse.setRequestId(REQUEST_ID);
        deleteJobResponse.setStatusCode(204);

        assertEquals(deleteJobResponse.getRequestId(), REQUEST_ID);
    }


    @Test
    public void testGetInstance() {
        DeleteJobResponse res = new DeleteJobResponse();


        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");

        httpResponse.setStatus(204);

        context.setHttpResponse(httpResponse);
        res.getInstance(context);

        res.setStatusCode(204);

        res.setRequestId("aaaa");

        assertEquals(res.getRequestId(), "aaaa");
    }
}
