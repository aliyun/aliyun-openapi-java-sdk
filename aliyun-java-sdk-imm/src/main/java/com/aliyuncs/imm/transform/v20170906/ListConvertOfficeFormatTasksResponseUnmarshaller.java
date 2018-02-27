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
package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.ListConvertOfficeFormatTasksResponse;
import com.aliyuncs.imm.model.v20170906.ListConvertOfficeFormatTasksResponse.TasksItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConvertOfficeFormatTasksResponseUnmarshaller {

	public static ListConvertOfficeFormatTasksResponse unmarshall(ListConvertOfficeFormatTasksResponse listConvertOfficeFormatTasksResponse, UnmarshallerContext context) {
		
		listConvertOfficeFormatTasksResponse.setRequestId(context.stringValue("ListConvertOfficeFormatTasksResponse.RequestId"));
		listConvertOfficeFormatTasksResponse.setNextMarker(context.stringValue("ListConvertOfficeFormatTasksResponse.NextMarker"));

		List<TasksItem> tasks = new ArrayList<TasksItem>();
		for (int i = 0; i < context.lengthValue("ListConvertOfficeFormatTasksResponse.Tasks.Length"); i++) {
			TasksItem tasksItem = new TasksItem();
			tasksItem.setTaskId(context.stringValue("ListConvertOfficeFormatTasksResponse.Tasks["+ i +"].TaskId"));
			tasksItem.setStatus(context.stringValue("ListConvertOfficeFormatTasksResponse.Tasks["+ i +"].Status"));
			tasksItem.setPercent(context.integerValue("ListConvertOfficeFormatTasksResponse.Tasks["+ i +"].Percent"));
			tasksItem.setPageCount(context.integerValue("ListConvertOfficeFormatTasksResponse.Tasks["+ i +"].PageCount"));
			tasksItem.setSrcUri(context.stringValue("ListConvertOfficeFormatTasksResponse.Tasks["+ i +"].SrcUri"));
			tasksItem.setTgtType(context.stringValue("ListConvertOfficeFormatTasksResponse.Tasks["+ i +"].TgtType"));
			tasksItem.setTgtUri(context.stringValue("ListConvertOfficeFormatTasksResponse.Tasks["+ i +"].TgtUri"));
			tasksItem.setImageSpec(context.stringValue("ListConvertOfficeFormatTasksResponse.Tasks["+ i +"].ImageSpec"));
			tasksItem.setNotifyTopicName(context.stringValue("ListConvertOfficeFormatTasksResponse.Tasks["+ i +"].NotifyTopicName"));
			tasksItem.setNotifyEndpoint(context.stringValue("ListConvertOfficeFormatTasksResponse.Tasks["+ i +"].NotifyEndpoint"));
			tasksItem.setExternalID(context.stringValue("ListConvertOfficeFormatTasksResponse.Tasks["+ i +"].ExternalID"));
			tasksItem.setCreateTime(context.stringValue("ListConvertOfficeFormatTasksResponse.Tasks["+ i +"].CreateTime"));
			tasksItem.setFinishTime(context.stringValue("ListConvertOfficeFormatTasksResponse.Tasks["+ i +"].FinishTime"));

			tasks.add(tasksItem);
		}
		listConvertOfficeFormatTasksResponse.setTasks(tasks);
	 
	 	return listConvertOfficeFormatTasksResponse;
	}
}