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

package com.aliyuncs.dbfs.transform.v20200418;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dbfs.model.v20200418.ListTaskResponse;
import com.aliyuncs.dbfs.model.v20200418.ListTaskResponse.TasksItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTaskResponseUnmarshaller {

	public static ListTaskResponse unmarshall(ListTaskResponse listTaskResponse, UnmarshallerContext _ctx) {
		
		listTaskResponse.setRequestId(_ctx.stringValue("ListTaskResponse.RequestId"));
		listTaskResponse.setTotalCount(_ctx.integerValue("ListTaskResponse.TotalCount"));
		listTaskResponse.setPageNumber(_ctx.integerValue("ListTaskResponse.PageNumber"));
		listTaskResponse.setPageSize(_ctx.integerValue("ListTaskResponse.PageSize"));

		List<TasksItem> tasks = new ArrayList<TasksItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTaskResponse.Tasks.Length"); i++) {
			TasksItem tasksItem = new TasksItem();
			tasksItem.setId(_ctx.integerValue("ListTaskResponse.Tasks["+ i +"].Id"));
			tasksItem.setTaskName(_ctx.stringValue("ListTaskResponse.Tasks["+ i +"].TaskName"));
			tasksItem.setTaskType(_ctx.stringValue("ListTaskResponse.Tasks["+ i +"].TaskType"));
			tasksItem.setTaskOwner(_ctx.stringValue("ListTaskResponse.Tasks["+ i +"].TaskOwner"));
			tasksItem.setTaskAdder(_ctx.stringValue("ListTaskResponse.Tasks["+ i +"].TaskAdder"));
			tasksItem.setTaskRunner(_ctx.stringValue("ListTaskResponse.Tasks["+ i +"].TaskRunner"));
			tasksItem.setTaskProgress(_ctx.integerValue("ListTaskResponse.Tasks["+ i +"].TaskProgress"));
			tasksItem.setTaskProgressDescription(_ctx.stringValue("ListTaskResponse.Tasks["+ i +"].TaskProgressDescription"));
			tasksItem.setTaskStatus(_ctx.stringValue("ListTaskResponse.Tasks["+ i +"].TaskStatus"));
			tasksItem.setClientToken(_ctx.stringValue("ListTaskResponse.Tasks["+ i +"].ClientToken"));
			tasksItem.setCreatedTime(_ctx.stringValue("ListTaskResponse.Tasks["+ i +"].CreatedTime"));
			tasksItem.setCompletionTime(_ctx.stringValue("ListTaskResponse.Tasks["+ i +"].CompletionTime"));
			tasksItem.setPriority(_ctx.stringValue("ListTaskResponse.Tasks["+ i +"].Priority"));
			tasksItem.setMaxRetry(_ctx.integerValue("ListTaskResponse.Tasks["+ i +"].MaxRetry"));
			tasksItem.setNextExecutionTime(_ctx.stringValue("ListTaskResponse.Tasks["+ i +"].NextExecutionTime"));
			tasksItem.setTaskExecutionCounts(_ctx.integerValue("ListTaskResponse.Tasks["+ i +"].TaskExecutionCounts"));
			tasksItem.setTaskErrorReason(_ctx.stringValue("ListTaskResponse.Tasks["+ i +"].TaskErrorReason"));
			tasksItem.setTaskStatusCode(_ctx.integerValue("ListTaskResponse.Tasks["+ i +"].TaskStatusCode"));

			tasks.add(tasksItem);
		}
		listTaskResponse.setTasks(tasks);
	 
	 	return listTaskResponse;
	}
}