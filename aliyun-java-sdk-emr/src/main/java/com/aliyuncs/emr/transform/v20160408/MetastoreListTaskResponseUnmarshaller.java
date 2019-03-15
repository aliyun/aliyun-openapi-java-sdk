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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.MetastoreListTaskResponse;
import com.aliyuncs.emr.model.v20160408.MetastoreListTaskResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class MetastoreListTaskResponseUnmarshaller {

	public static MetastoreListTaskResponse unmarshall(MetastoreListTaskResponse metastoreListTaskResponse, UnmarshallerContext context) {
		
		metastoreListTaskResponse.setRequestId(context.stringValue("MetastoreListTaskResponse.RequestId"));
		metastoreListTaskResponse.setTotalCount(context.integerValue("MetastoreListTaskResponse.TotalCount"));
		metastoreListTaskResponse.setPageNumber(context.integerValue("MetastoreListTaskResponse.PageNumber"));
		metastoreListTaskResponse.setPageSize(context.integerValue("MetastoreListTaskResponse.PageSize"));

		List<Task> taskList = new ArrayList<Task>();
		for (int i = 0; i < context.lengthValue("MetastoreListTaskResponse.TaskList.Length"); i++) {
			Task task = new Task();
			task.setBizId(context.stringValue("MetastoreListTaskResponse.TaskList["+ i +"].BizId"));
			task.setTaskType(context.stringValue("MetastoreListTaskResponse.TaskList["+ i +"].TaskType"));
			task.setTaskObject(context.stringValue("MetastoreListTaskResponse.TaskList["+ i +"].TaskObject"));
			task.setTaskStatus(context.stringValue("MetastoreListTaskResponse.TaskList["+ i +"].TaskStatus"));
			task.setStartTime(context.longValue("MetastoreListTaskResponse.TaskList["+ i +"].StartTime"));
			task.setEndTime(context.longValue("MetastoreListTaskResponse.TaskList["+ i +"].EndTime"));
			task.setTaskProcess(context.integerValue("MetastoreListTaskResponse.TaskList["+ i +"].TaskProcess"));
			task.setTriggerUser(context.stringValue("MetastoreListTaskResponse.TaskList["+ i +"].TriggerUser"));
			task.setTriggerType(context.stringValue("MetastoreListTaskResponse.TaskList["+ i +"].TriggerType"));
			task.setGmtCreate(context.longValue("MetastoreListTaskResponse.TaskList["+ i +"].GmtCreate"));
			task.setGmtModified(context.longValue("MetastoreListTaskResponse.TaskList["+ i +"].GmtModified"));
			task.setExecuteTime(context.longValue("MetastoreListTaskResponse.TaskList["+ i +"].ExecuteTime"));

			taskList.add(task);
		}
		metastoreListTaskResponse.setTaskList(taskList);
	 
	 	return metastoreListTaskResponse;
	}
}