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

package com.aliyuncs.batchcompute.modelunittest.v20151111;

import com.aliyuncs.batchcompute.model.v20151111.CreateJobResponse;
import com.aliyuncs.batchcompute.model.v20151111.DeleteJobResponse;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import junit.framework.TestCase;
import org.junit.Test;

import java.text.Format;

/**
 * Created by guangchun.luo on 15/5/6.
 */
public class CreateJobResponseTest extends TestCase {


    @Test
    public void testSetResourceId() {

        String REQUEST_ID = "xx000111";

        CreateJobResponse res = new CreateJobResponse();
        res.setRequestId(REQUEST_ID);
        res.setStatusCode(201);

        assertEquals(res.getRequestId(), REQUEST_ID);
    }


    @Test
    public void testGetInstance() throws ServerException {
        CreateJobResponse res = new CreateJobResponse();


        UnmarshallerContext context = new UnmarshallerContext();

        HttpResponse httpResponse = new HttpResponse("");

        httpResponse.setStatus(201);
        httpResponse.setHttpContent("{\"Id\":\"job-001\"}".getBytes(), "UTF-8", FormatType.JSON);

        context.setHttpResponse(httpResponse);

        res.getInstance(context);

        res.setRequestId("aaa");

        assertEquals(res.getRequestId(), "aaa");
        assertTrue(res.getStatusCode() == 201);

        assertEquals("job-001",res.getJobId());
    }
}
