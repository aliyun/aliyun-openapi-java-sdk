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

package com.aliyuncs.imm.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20200930.ListTasksResponse;
import com.aliyuncs.imm.model.v20200930.ListTasksResponse.TasksItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTasksResponseUnmarshaller {

	public static ListTasksResponse unmarshall(ListTasksResponse listTasksResponse, UnmarshallerContext _ctx) {
		
		listTasksResponse.setRequestId(_ctx.stringValue("ListTasksResponse.RequestId"));
		listTasksResponse.setProjectName(_ctx.stringValue("ListTasksResponse.ProjectName"));
		listTasksResponse.setNextToken(_ctx.stringValue("ListTasksResponse.NextToken"));
		listTasksResponse.setMaxResults(_ctx.stringValue("ListTasksResponse.MaxResults"));

		List<TasksItem> tasks = new ArrayList<TasksItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTasksResponse.Tasks.Length"); i++) {
			TasksItem tasksItem = new TasksItem();
			tasksItem.setStatus(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].Status"));
			tasksItem.setCode(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].Code"));
			tasksItem.setMessage(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].Message"));
			tasksItem.setStartTime(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].StartTime"));
			tasksItem.setEndTime(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].EndTime"));
			tasksItem.setUserData(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].UserData"));
			tasksItem.setTaskType(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].TaskType"));
			tasksItem.setTaskId(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].TaskId"));
			tasksItem.setTags(_ctx.mapValue("ListTasksResponse.Tasks["+ i +"].Tags"));

			tasks.add(tasksItem);
		}
		listTasksResponse.setTasks(tasks);
	 
	 	return listTasksResponse;
	}
}