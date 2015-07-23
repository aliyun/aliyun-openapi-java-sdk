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

import com.aliyuncs.batchcompute.model.v20150630.ListTaskStatusResponse;
import com.aliyuncs.batchcompute.pojo.v20150630.TaskStatus;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;


public class ListTaskStatusResponseUnmarshaller {

    public static ListTaskStatusResponse unmarshall(ListTaskStatusResponse listTaskStatusResponse, UnmarshallerContext context) throws ServerException {
        HttpResponse httpResponse = context.getHttpResponse();
        listTaskStatusResponse.setHttpResponse(httpResponse);
        try {
            String body = new String(httpResponse.getContent(), httpResponse.getEncoding());

            parseTaskStatusList(body, listTaskStatusResponse);
        } catch (UnsupportedEncodingException e) {
            throw new ServerException("API.EncodeError", "encode response body error",listTaskStatusResponse.getRequestId());
        } catch (IOException e) {
            throw new ServerException("API.EncodeError", "encode response body error",listTaskStatusResponse.getRequestId());
        }

        return listTaskStatusResponse;
    }


    public static void parseTaskStatusList(String body,ListTaskStatusResponse listTaskStatusResponse) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        List<TaskStatus> taskStatusList = new ArrayList<TaskStatus>();

        Map<String, TaskStatus> taskStatusMap = mapper.readValue(body,
                new TypeReference<Map<String, TaskStatus>>() {
                });

        Iterator<String> keyIt = taskStatusMap.keySet().iterator();

        while (keyIt.hasNext()) {
            String taskName = keyIt.next();
            TaskStatus taskStatus = taskStatusMap.get(taskName);
            taskStatus.setTaskName(taskName);

            taskStatusList.add(taskStatus);
        }

        sortList(taskStatusList);

        listTaskStatusResponse.setTaskStatusList(taskStatusList);
    }

    public static void sortList(List<TaskStatus> taskStatusList) {

        Collections.sort(taskStatusList, new Comparator<TaskStatus>() {
            public int compare(TaskStatus a, TaskStatus b) {

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