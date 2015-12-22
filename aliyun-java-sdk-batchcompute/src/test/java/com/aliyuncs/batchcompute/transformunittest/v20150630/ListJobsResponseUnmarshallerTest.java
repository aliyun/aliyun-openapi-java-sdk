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

package com.aliyuncs.batchcompute.transformunittest.v20150630;

import com.aliyuncs.batchcompute.model.v20150630.ListJobsResponse;
import com.aliyuncs.batchcompute.pojo.v20150630.Job;
import com.aliyuncs.batchcompute.transform.v20150630.ListJobsResponseUnmarshaller;
import com.aliyuncs.batchcompute.util.FileLoader;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

/**
 * Created by guangchun.luo on 15/4/17.
 */
public class ListJobsResponseUnmarshallerTest extends TestCase {

    @Test
    public void testUnmarshall(){

        ListJobsResponse response = new ListJobsResponse();



        UnmarshallerContext context = new UnmarshallerContext();

        /***** 构造http response *********/
        HttpResponse res = new HttpResponse("");
        res.setStatus(200);
        res.setContentType(FormatType.JSON);

        String body = FileLoader.loadFile("resources/listJobs.json");

        res.setContent(body.getBytes(),"utf-8",FormatType.JSON);
        /**************/

        context.setHttpResponse(res);

        try {
            ListJobsResponseUnmarshaller.unmarshall(response, context);
        } catch (ServerException e) {
            e.printStackTrace();
        }

        List<Job> list = response.getJobList();

        Job jobStatus = list.get(0);

        assertEquals("job-00000000552F996A00002B2D00000041", jobStatus.getJobId());

        assertEquals(1429192352, jobStatus.getCreationTime());
        assertEquals(1429193263, jobStatus.getEndTime());
        assertEquals("FindPrime", jobStatus.getJobName());
        assertEquals(2, jobStatus.getNumFinishedInstance());
        assertEquals(48351, jobStatus.getOwnerId());
        assertEquals("Finished", jobStatus.getState());

        assertEquals("a", jobStatus.getDescription());
        assertEquals(0, jobStatus.getPriority());

        assertEquals(0, jobStatus.getNumFailedInstance());
        assertEquals(0, jobStatus.getNumFailedTask());

        assertEquals(2, jobStatus.getNumFinishedInstance());
        assertEquals(2, jobStatus.getNumFinishedTask());

        assertEquals(0, jobStatus.getNumRunningInstance());
        assertEquals(0, jobStatus.getNumRunningTask());

        assertEquals(0, jobStatus.getNumWaitingInstance());
        assertEquals(0, jobStatus.getNumWaitingTask());

        assertEquals(0, jobStatus.getNumStoppedInstance());
        assertEquals(0, jobStatus.getNumStoppedTask());

        assertEquals(2, jobStatus.getNumTotalInstance());
        assertEquals(2, jobStatus.getNumTotalTask());

        assertEquals(1429192352, jobStatus.getStartTime());
        assertEquals(62, jobStatus.getFinishedInstanceTotalTime());
    }



}