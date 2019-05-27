/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.ListVideoTasksResponse;
import com.aliyuncs.imm.model.v20170906.ListVideoTasksResponse.TasksItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVideoTasksResponseUnmarshaller {

	public static ListVideoTasksResponse unmarshall(ListVideoTasksResponse listVideoTasksResponse, UnmarshallerContext context) {
		
		listVideoTasksResponse.setRequestId(context.stringValue("ListVideoTasksResponse.RequestId"));
		listVideoTasksResponse.setNextMarker(context.stringValue("ListVideoTasksResponse.NextMarker"));

		List<TasksItem> tasks = new ArrayList<TasksItem>();
		for (int i = 0; i < context.lengthValue("ListVideoTasksResponse.Tasks.Length"); i++) {
			TasksItem tasksItem = new TasksItem();
			tasksItem.setStatus(context.stringValue("ListVideoTasksResponse.Tasks["+ i +"].Status"));
			tasksItem.setTaskId(context.stringValue("ListVideoTasksResponse.Tasks["+ i +"].TaskId"));
			tasksItem.setTaskType(context.stringValue("ListVideoTasksResponse.Tasks["+ i +"].TaskType"));
			tasksItem.setParameters(context.stringValue("ListVideoTasksResponse.Tasks["+ i +"].Parameters"));
			tasksItem.setResult(context.stringValue("ListVideoTasksResponse.Tasks["+ i +"].Result"));
			tasksItem.setStartTime(context.stringValue("ListVideoTasksResponse.Tasks["+ i +"].StartTime"));
			tasksItem.setEndTime(context.stringValue("ListVideoTasksResponse.Tasks["+ i +"].EndTime"));
			tasksItem.setErrorMessage(context.stringValue("ListVideoTasksResponse.Tasks["+ i +"].ErrorMessage"));
			tasksItem.setNotifyEndpoint(context.stringValue("ListVideoTasksResponse.Tasks["+ i +"].NotifyEndpoint"));
			tasksItem.setNotifyTopicName(context.stringValue("ListVideoTasksResponse.Tasks["+ i +"].NotifyTopicName"));
			tasksItem.setProgress(context.integerValue("ListVideoTasksResponse.Tasks["+ i +"].Progress"));

			tasks.add(tasksItem);
		}
		listVideoTasksResponse.setTasks(tasks);
	 
	 	return listVideoTasksResponse;
	}
}