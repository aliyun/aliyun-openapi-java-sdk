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

	public static ListVideoTasksResponse unmarshall(ListVideoTasksResponse listVideoTasksResponse, UnmarshallerContext _ctx) {
		
		listVideoTasksResponse.setRequestId(_ctx.stringValue("ListVideoTasksResponse.RequestId"));
		listVideoTasksResponse.setNextMarker(_ctx.stringValue("ListVideoTasksResponse.NextMarker"));

		List<TasksItem> tasks = new ArrayList<TasksItem>();
		for (int i = 0; i < _ctx.lengthValue("ListVideoTasksResponse.Tasks.Length"); i++) {
			TasksItem tasksItem = new TasksItem();
			tasksItem.setStatus(_ctx.stringValue("ListVideoTasksResponse.Tasks["+ i +"].Status"));
			tasksItem.setTaskId(_ctx.stringValue("ListVideoTasksResponse.Tasks["+ i +"].TaskId"));
			tasksItem.setTaskType(_ctx.stringValue("ListVideoTasksResponse.Tasks["+ i +"].TaskType"));
			tasksItem.setParameters(_ctx.stringValue("ListVideoTasksResponse.Tasks["+ i +"].Parameters"));
			tasksItem.setResult(_ctx.stringValue("ListVideoTasksResponse.Tasks["+ i +"].Result"));
			tasksItem.setStartTime(_ctx.stringValue("ListVideoTasksResponse.Tasks["+ i +"].StartTime"));
			tasksItem.setEndTime(_ctx.stringValue("ListVideoTasksResponse.Tasks["+ i +"].EndTime"));
			tasksItem.setErrorMessage(_ctx.stringValue("ListVideoTasksResponse.Tasks["+ i +"].ErrorMessage"));
			tasksItem.setNotifyEndpoint(_ctx.stringValue("ListVideoTasksResponse.Tasks["+ i +"].NotifyEndpoint"));
			tasksItem.setNotifyTopicName(_ctx.stringValue("ListVideoTasksResponse.Tasks["+ i +"].NotifyTopicName"));
			tasksItem.setProgress(_ctx.integerValue("ListVideoTasksResponse.Tasks["+ i +"].Progress"));

			tasks.add(tasksItem);
		}
		listVideoTasksResponse.setTasks(tasks);
	 
	 	return listVideoTasksResponse;
	}
}