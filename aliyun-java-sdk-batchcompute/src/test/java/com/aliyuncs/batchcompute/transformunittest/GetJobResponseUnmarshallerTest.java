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

import com.aliyuncs.batchcompute.model.v20150630.GetJobDescriptionResponse;
import com.aliyuncs.batchcompute.model.v20150630.GetJobResponse;
import com.aliyuncs.batchcompute.pojo.v20150630.JobDescription;
import com.aliyuncs.batchcompute.pojo.v20150630.Job;
import com.aliyuncs.batchcompute.transform.v20150630.GetJobDescriptionResponseUnmarshaller;
import com.aliyuncs.batchcompute.transform.v20150630.GetJobResponseUnmarshaller;
import com.aliyuncs.batchcompute.util.FileLoader;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by guangchun.luo on 15/4/17.
 */
public class GetJobResponseUnmarshallerTest extends TestCase {

    @Test
    public void testUnmarshall(){

        GetJobResponse response = new GetJobResponse();



        UnmarshallerContext context = new UnmarshallerContext();

        /***** 构造http response *********/
        HttpResponse res = new HttpResponse("");
        res.setStatus(200);
        res.setContentType(FormatType.JSON);

        String body = FileLoader.loadFile("resources/getJob.json");

        res.setContent(body.getBytes(),"utf-8",FormatType.JSON);
        /**************/

        context.setHttpResponse(res);

        try {
            GetJobResponseUnmarshaller.unmarshall(response, context);
        } catch (ServerException e) {
            e.printStackTrace();
        }

        Job job = response.getJob();

        assertEquals("job-00000000552F996A00002B2D00000041", job.getJobId());

        assertEquals(1429192352L, job.getCreationTime());
        assertEquals(1429193263L, job.getEndTime());
        assertEquals("FindPrime", job.getJobName());
        assertEquals(2, job.getNumFinishedInstance());
        assertEquals(48351, job.getOwnerId());
        assertEquals("Finished", job.getState());

        assertEquals("", job.getDescription());
        assertEquals(0, job.getPriority());

        assertEquals(0, job.getNumFailedInstance());
        assertEquals(0, job.getNumFailedTask());

        assertEquals(2, job.getNumFinishedInstance());
        assertEquals(2, job.getNumFinishedTask());

        assertEquals(0, job.getNumRunningInstance());
        assertEquals(0, job.getNumRunningTask());

        assertEquals(0, job.getNumWaitingInstance());
        assertEquals(0, job.getNumWaitingTask());

        assertEquals(0, job.getNumStoppedInstance());
        assertEquals(0, job.getNumStoppedTask());

        assertEquals(2, job.getNumTotalInstance());
        assertEquals(2, job.getNumTotalTask());

        assertEquals(1429192352L, job.getStartTime());
        assertEquals(62L, job.getFinishedInstanceTotalTime());
    }


}