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

package com.aliyuncs.paifeaturestore.transform.v20230621;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paifeaturestore.model.v20230621.ListTasksResponse;
import com.aliyuncs.paifeaturestore.model.v20230621.ListTasksResponse.TasksItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTasksResponseUnmarshaller {

	public static ListTasksResponse unmarshall(ListTasksResponse listTasksResponse, UnmarshallerContext _ctx) {
		
		listTasksResponse.setRequestId(_ctx.stringValue("ListTasksResponse.RequestId"));
		listTasksResponse.setTotalCount(_ctx.integerValue("ListTasksResponse.TotalCount"));

		List<TasksItem> tasks = new ArrayList<TasksItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTasksResponse.Tasks.Length"); i++) {
			TasksItem tasksItem = new TasksItem();
			tasksItem.setGmtCreateTime(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].GmtCreateTime"));
			tasksItem.setGmtExecutedTime(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].GmtExecutedTime"));
			tasksItem.setGmtFinishedTime(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].GmtFinishedTime"));
			tasksItem.setObjectId(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].ObjectId"));
			tasksItem.setObjectType(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].ObjectType"));
			tasksItem.setProjectId(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].ProjectId"));
			tasksItem.setProjectName(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].ProjectName"));
			tasksItem.setStatus(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].Status"));
			tasksItem.setTaskId(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].TaskId"));
			tasksItem.setType(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].Type"));

			tasks.add(tasksItem);
		}
		listTasksResponse.setTasks(tasks);
	 
	 	return listTasksResponse;
	}
}