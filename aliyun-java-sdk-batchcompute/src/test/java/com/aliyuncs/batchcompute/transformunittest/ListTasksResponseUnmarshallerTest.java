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

import com.aliyuncs.batchcompute.model.v20150630.ListTasksResponse;
import com.aliyuncs.batchcompute.pojo.v20150630.Instance;
import com.aliyuncs.batchcompute.pojo.v20150630.Task;
import com.aliyuncs.batchcompute.transform.v20150630.ListTasksResponseUnmarshaller;
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
public class ListTasksResponseUnmarshallerTest extends TestCase {

    @Test
    public void testUnmarshall(){

        ListTasksResponse response = new ListTasksResponse();

        UnmarshallerContext context = new UnmarshallerContext();

        /***** 构造http response *********/
        HttpResponse res = new HttpResponse("");
        res.setStatus(200);
        res.setContentType(FormatType.JSON);

        String body = FileLoader.loadFile("resources/listTasks.json");

        res.setContent(body.getBytes(),"utf-8",FormatType.JSON);
        /**************/

        context.setHttpResponse(res);

        try {
            ListTasksResponseUnmarshaller.unmarshall(response, context);
        } catch (ServerException e) {
            e.printStackTrace();
        }

        List<Task> list = response.getTaskList();


        Task task = list.get(0);


        assertEquals("_prepare", task.getTaskName());
        assertEquals("Running", task.getState());


        assertTrue(task.getEndTime() == 0);
        assertTrue(task.getStartTime() == 1429193332L);

        Instance instance = task.getInstanceList().get(0);

        assertTrue(instance.getStartTime() == 0);
        assertEquals("Running", instance.getState());
        assertTrue(instance.getEndTime() == 0);
        assertTrue(instance.getInstanceId() == 0);
    }


    @Test
    public void testSortList() {

        Task a = new Task();
        a.setTaskName("taskName1");
        a.setStartTime(0);

        Task b = new Task();
        b.setTaskName("taskName2");
        b.setStartTime(0);

        List<Task> list = new ArrayList();
        list.add(a);
        list.add(b);


        ListTasksResponseUnmarshaller.sortList(list);

        assertEquals("taskName1", list.get(0).getTaskName());


        b.setStartTime(1);
        a.setStartTime(10);
        ListTasksResponseUnmarshaller.sortList(list);
        assertEquals("taskName2", list.get(0).getTaskName());
    }


}