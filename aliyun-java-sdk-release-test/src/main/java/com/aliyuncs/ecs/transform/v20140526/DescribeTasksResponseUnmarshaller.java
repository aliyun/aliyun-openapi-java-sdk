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
package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeTasksResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeTasksResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTasksResponseUnmarshaller {

	public static DescribeTasksResponse unmarshall(DescribeTasksResponse describeTasksResponse, UnmarshallerContext context) {
		
		describeTasksResponse.setRequestId(context.stringValue("DescribeTasksResponse.RequestId"));
		describeTasksResponse.setRegionId(context.stringValue("DescribeTasksResponse.RegionId"));
		describeTasksResponse.setTotalCount(context.integerValue("DescribeTasksResponse.TotalCount"));
		describeTasksResponse.setPageNumber(context.integerValue("DescribeTasksResponse.PageNumber"));
		describeTasksResponse.setPageSize(context.integerValue("DescribeTasksResponse.PageSize"));

		List<Task> taskSet = new ArrayList<Task>();
		for (int i = 0; i < context.lengthValue("DescribeTasksResponse.TaskSet.Length"); i++) {
			Task task = new Task();
			task.setTaskId(context.stringValue("DescribeTasksResponse.TaskSet["+ i +"].TaskId"));
			task.setTaskAction(context.stringValue("DescribeTasksResponse.TaskSet["+ i +"].TaskAction"));
			task.setTaskStatus(context.stringValue("DescribeTasksResponse.TaskSet["+ i +"].TaskStatus"));
			task.setSupportCancel(context.stringValue("DescribeTasksResponse.TaskSet["+ i +"].SupportCancel"));
			task.setCreationTime(context.stringValue("DescribeTasksResponse.TaskSet["+ i +"].CreationTime"));
			task.setFinishedTime(context.stringValue("DescribeTasksResponse.TaskSet["+ i +"].FinishedTime"));

			taskSet.add(task);
		}
		describeTasksResponse.setTaskSet(taskSet);
	 
	 	return describeTasksResponse;
	}
}