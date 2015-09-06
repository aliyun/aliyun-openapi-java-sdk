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
package com.aliyuncs.batchcompute.model.v20150630;

import com.aliyuncs.batchcompute.main.v20150630.BatchComputeResponse;
import com.aliyuncs.batchcompute.pojo.v20150630.Task;
import com.aliyuncs.batchcompute.transform.v20150630.ListTasksResponseUnmarshaller;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 */
public class ListTasksResponse extends BatchComputeResponse {

    public List<Task> getTaskList() {
        return taskList;
    }

    private List<Task> taskList;
    public void setTaskList(List<Task> list) {
        this.taskList = list;
    }


    @Override
    public ListTasksResponse getInstance(UnmarshallerContext context) throws ServerException {
        return ListTasksResponseUnmarshaller.unmarshall(this, context);
    }
}
