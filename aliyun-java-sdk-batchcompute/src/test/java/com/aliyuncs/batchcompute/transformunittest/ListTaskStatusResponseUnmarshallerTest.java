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

import com.aliyuncs.batchcompute.model.v20150630.ListTaskStatusResponse;
import com.aliyuncs.batchcompute.pojo.v20150630.InstanceStatus;
import com.aliyuncs.batchcompute.pojo.v20150630.TaskStatus;
import com.aliyuncs.batchcompute.transform.v20150630.ListTaskStatusResponseUnmarshaller;
import com.aliyuncs.batchcompute.util.FileLoader;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guangchun.luo on 15/4/17.
 */
public class ListTaskStatusResponseUnmarshallerTest extends TestCase {

    @Test
    public void testUnmarshall(){

        ListTaskStatusResponse response = new ListTaskStatusResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        /***** 构造http response *********/
        HttpResponse res = new HttpResponse("");
        res.setStatus(200);
        res.setContentType(FormatType.JSON);

        String body = FileLoader.loadFile("resources/listTaskStatus.json");

        res.setContent(body.getBytes(),"utf-8",FormatType.JSON);
        /**************/

        context.setHttpResponse(res);

        try {
            ListTaskStatusResponseUnmarshaller.unmarshall(response, context);
        } catch (ServerException e) {
            e.printStackTrace();
        }

        List<TaskStatus> list = response.getTaskStatusList();


        TaskStatus taskStatus = list.get(0);


        assertEquals("_prepare", taskStatus.getTaskName());
        assertEquals("Running", taskStatus.getState());


        assertTrue(taskStatus.getEndTime() == 0);
        assertTrue(taskStatus.getStartTime() == 1429193332L);

        InstanceStatus instanceStatus = taskStatus.getInstanceStatusList().get(0);

        assertTrue(instanceStatus.getStartTime() == 0);
        assertEquals("Running", instanceStatus.getState());
        assertTrue(instanceStatus.getEndTime() == 0);
        assertTrue(instanceStatus.getInstanceId() == 0);
    }


    @Test
    public void testSortList() {

        TaskStatus a = new TaskStatus();
        a.setTaskName("taskName1");
        a.setStartTime(0);

        TaskStatus b = new TaskStatus();
        b.setTaskName("taskName2");
        b.setStartTime(0);

        List<TaskStatus> list = new ArrayList();
        list.add(a);
        list.add(b);


        ListTaskStatusResponseUnmarshaller.sortList(list);

        assertEquals("taskName1", list.get(0).getTaskName());


        b.setStartTime(1);
        a.setStartTime(10);
        ListTaskStatusResponseUnmarshaller.sortList(list);
        assertEquals("taskName2", list.get(0).getTaskName());
    }


}