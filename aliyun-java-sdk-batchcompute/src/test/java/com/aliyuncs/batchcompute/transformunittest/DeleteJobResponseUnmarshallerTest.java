/*
 *
 *  * Licensed to the Apache Software Foundation (ASF) under one
 *  * or more contributor license agreements.  See the NOTICE file
 *  * distributed with this work for additional information
 *  * regarding copyright ownership.  The ASF licenses this file
 *  * to you under the Apache License, Version 2.0 (the
 *  * "License"); you may not use this file except in compliance
 *  * with the License.  You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing,
 *  * software distributed under the License is distributed on an
 *  * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  * KIND, either express or implied.  See the License for the
 *  * specific language governing permissions and limitations
 *  * under the License.
 *
 */

package com.aliyuncs.batchcompute.transformunittest;

import com.aliyuncs.batchcompute.model.v20150630.DeleteJobResponse;
import com.aliyuncs.batchcompute.transform.v20150630.DeleteJobResponseUnmarshaller;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by guangchun.luo on 15/4/17.
 */
public class DeleteJobResponseUnmarshallerTest extends TestCase {

    @Test
    public void testUnmarshall(){

        DeleteJobResponse response = new DeleteJobResponse();
        UnmarshallerContext context = new UnmarshallerContext();

        /***** 构造http response *********/
        HttpResponse res = new HttpResponse("");
        res.setStatus(204);

        res.putHeaderParameter("Request-Id","abc123");
        /**************/

        context.setHttpResponse(res);

        DeleteJobResponseUnmarshaller.unmarshall(response, context);

        assertEquals(response.getRequestId(), "abc123");

    }

    @Test
    public void testUnmarshallError(){

        DeleteJobResponse response = new DeleteJobResponse();
        UnmarshallerContext context = new UnmarshallerContext();

        /***** 构造http response *********/
        HttpResponse res = new HttpResponse("");
        res.setStatus(500);

        res.putHeaderParameter("Request-Id","abc123");
        /**************/

        context.setHttpResponse(res);

        DeleteJobResponseUnmarshaller.unmarshall(response, context);

        assertEquals(response.getRequestId(), "abc123");

    }

}