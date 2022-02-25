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

package com.aliyuncs.cloudphone.transform.v20201230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudphone.model.v20201230.ListTasksResponse;
import com.aliyuncs.cloudphone.model.v20201230.ListTasksResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTasksResponseUnmarshaller {

	public static ListTasksResponse unmarshall(ListTasksResponse listTasksResponse, UnmarshallerContext _ctx) {
		
		listTasksResponse.setRequestId(_ctx.stringValue("ListTasksResponse.RequestId"));
		listTasksResponse.setNextToken(_ctx.stringValue("ListTasksResponse.NextToken"));
		listTasksResponse.setTotalCount(_ctx.integerValue("ListTasksResponse.TotalCount"));
		listTasksResponse.setMaxResults(_ctx.integerValue("ListTasksResponse.MaxResults"));
		listTasksResponse.setRegionId(_ctx.stringValue("ListTasksResponse.RegionId"));

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("ListTasksResponse.Tasks.Length"); i++) {
			Task task = new Task();
			task.setTaskType(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].TaskType"));
			task.setProgress(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].Progress"));
			task.setTaskStatus(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].TaskStatus"));
			task.setExecuteMsg(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].ExecuteMsg"));
			task.setCreateTime(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].CreateTime"));
			task.setFinishedTime(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].FinishedTime"));
			task.setInstanceId(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].InstanceId"));
			task.setTaskId(_ctx.stringValue("ListTasksResponse.Tasks["+ i +"].TaskId"));

			tasks.add(task);
		}
		listTasksResponse.setTasks(tasks);
	 
	 	return listTasksResponse;
	}
}