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

import com.aliyuncs.batchcompute.model.v20150630.GetJobDescriptionResponse;
import com.aliyuncs.batchcompute.pojo.v20150630.JobDescription;
import com.aliyuncs.batchcompute.pojo.v20150630.TaskDescription;
import com.aliyuncs.batchcompute.transform.v20150630.GetJobDescriptionResponseUnmarshaller;
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
public class GetJobDescriptionResponseUnmarshallerTest extends TestCase {

    @Test
    public void testUnmarshall(){

        GetJobDescriptionResponse response = new GetJobDescriptionResponse();
        UnmarshallerContext context = new UnmarshallerContext();

        /***** 构造http response *********/
        HttpResponse res = new HttpResponse("");
        res.setStatus(200);
        res.setContentType(FormatType.JSON);

        String body = FileLoader.loadFile("resources/getJobDescription.json");

        res.setContent(body.getBytes(),"utf-8",FormatType.JSON);
        /**************/

        context.setHttpResponse(res);

        try {
            GetJobDescriptionResponseUnmarshaller.unmarshall(response, context);
        } catch (ServerException e) {
            e.printStackTrace();
        }

        JobDescription job = response.getJobDescription();

        assertEquals("Demo",job.getJobName());

        assertEquals("cc",job.getJobTag());
        assertEquals(0,job.getPriority());

        TaskDescription sortTask = job.getTaskDag().getTaskDescMap().get("Sort");
        assertEquals("Sort",sortTask.getTaskName());
        assertEquals("img-win-1428654123",sortTask.getImageId());
    }

    @Test
    public void testUnmarshall2(){

        GetJobDescriptionResponse response = new GetJobDescriptionResponse();
        UnmarshallerContext context = new UnmarshallerContext();

        /***** 构造http response *********/
        HttpResponse res = new HttpResponse("");
        res.setStatus(200);
        res.setContentType(FormatType.JSON);

        String body = FileLoader.loadFile("resources/getJobDescription2.json");

        res.setContent(body.getBytes(),"utf-8",FormatType.JSON);
        /**************/

        context.setHttpResponse(res);

        try {
            GetJobDescriptionResponseUnmarshaller.unmarshall(response, context);
        } catch (ServerException e) {
            e.printStackTrace();
        }

        JobDescription job = response.getJobDescription();
        assertEquals("FindPrime",job.getJobName());

        assertEquals("MyTag",job.getJobTag());
        assertEquals(0,job.getPriority());

    }

    @Test
    public void testUnmarshall3(){

        GetJobDescriptionResponse response = new GetJobDescriptionResponse();
        UnmarshallerContext context = new UnmarshallerContext();

        /***** 构造http response *********/
        HttpResponse res = new HttpResponse("");
        res.setStatus(200);
        res.setContentType(FormatType.JSON);

        String body = FileLoader.loadFile("resources/getJobDescription3.json");

        res.setContent(body.getBytes(),"utf-8",FormatType.JSON);
        /**************/

        context.setHttpResponse(res);

        try {
            GetJobDescriptionResponseUnmarshaller.unmarshall(response, context);
        } catch (ServerException e) {
            e.printStackTrace();
        }

        JobDescription job = response.getJobDescription();
        assertEquals("AB-C-DE-F_1433579943.46",job.getJobName());

        assertEquals("xxxxx",job.getJobTag());
        assertEquals(0,job.getPriority());

    }


}