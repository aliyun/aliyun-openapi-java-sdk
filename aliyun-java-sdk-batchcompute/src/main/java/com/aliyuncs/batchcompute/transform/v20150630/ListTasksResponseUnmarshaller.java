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
package com.aliyuncs.batchcompute.transform.v20150630;

import com.aliyuncs.batchcompute.model.v20150630.ListTasksResponse;
import com.aliyuncs.batchcompute.pojo.v20150630.Task;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;


public class ListTasksResponseUnmarshaller {

    public static ListTasksResponse unmarshall(ListTasksResponse listTasksResponse, UnmarshallerContext context) throws ServerException {
        HttpResponse httpResponse = context.getHttpResponse();
        listTasksResponse.setHttpResponse(httpResponse);
        try {
            String body = new String(httpResponse.getContent(), httpResponse.getEncoding());

            parseTaskList(body, listTasksResponse);
        } catch (UnsupportedEncodingException e) {
            throw new ServerException("API.EncodeError", "encode response body error", listTasksResponse.getRequestId());
        } catch (IOException e) {
            throw new ServerException("API.EncodeError", "encode response body error", listTasksResponse.getRequestId());
        }

        return listTasksResponse;
    }


    public static void parseTaskList(String body,ListTasksResponse listTasksResponse) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        List<Task> taskList = new ArrayList<Task>();

        Map<String, Task> taskMap = mapper.readValue(body,
                new TypeReference<Map<String, Task>>() {
                });

        Iterator<String> keyIt = taskMap.keySet().iterator();

        while (keyIt.hasNext()) {
            String taskName = keyIt.next();
            Task task = taskMap.get(taskName);
            task.setTaskName(taskName);

            taskList.add(task);
        }

        sortList(taskList);

        listTasksResponse.setTaskList(taskList);
    }

    public static void sortList(List<Task> taskList) {

        Collections.sort(taskList, new Comparator<Task>() {
            public int compare(Task a, Task b) {

                if (a.getStartTime() == b.getStartTime()) {
                    if (a.getTaskName().equals(b.getTaskName())) {
                        return 0;
                    } else {
                        int x = a.getTaskName().compareTo(b.getTaskName());
                        if (x == 0) return 0;
                        else return x < 0 ? -1 : 1;
                    }
                } else {
                    if (a.getStartTime() == 0) {
                        return 1;
                    } else if (b.getStartTime() == 0) {
                        return -1;
                    } else return a.getStartTime() > b.getStartTime() ? 1 : -1;
                }
            }
        });
    }
}