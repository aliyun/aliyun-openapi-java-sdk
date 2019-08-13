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

	public static MetastoreListTaskResponse unmarshall(MetastoreListTaskResponse metastoreListTaskResponse, UnmarshallerContext _ctx) {
		
		metastoreListTaskResponse.setRequestId(_ctx.stringValue("MetastoreListTaskResponse.RequestId"));
		metastoreListTaskResponse.setTotalCount(_ctx.integerValue("MetastoreListTaskResponse.TotalCount"));
		metastoreListTaskResponse.setPageNumber(_ctx.integerValue("MetastoreListTaskResponse.PageNumber"));
		metastoreListTaskResponse.setPageSize(_ctx.integerValue("MetastoreListTaskResponse.PageSize"));

		List<Task> taskList = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("MetastoreListTaskResponse.TaskList.Length"); i++) {
			Task task = new Task();
			task.setBizId(_ctx.stringValue("MetastoreListTaskResponse.TaskList["+ i +"].BizId"));
			task.setTaskType(_ctx.stringValue("MetastoreListTaskResponse.TaskList["+ i +"].TaskType"));
			task.setTaskObject(_ctx.stringValue("MetastoreListTaskResponse.TaskList["+ i +"].TaskObject"));
			task.setTaskStatus(_ctx.stringValue("MetastoreListTaskResponse.TaskList["+ i +"].TaskStatus"));
			task.setStartTime(_ctx.longValue("MetastoreListTaskResponse.TaskList["+ i +"].StartTime"));
			task.setEndTime(_ctx.longValue("MetastoreListTaskResponse.TaskList["+ i +"].EndTime"));
			task.setTaskProcess(_ctx.integerValue("MetastoreListTaskResponse.TaskList["+ i +"].TaskProcess"));
			task.setTriggerUser(_ctx.stringValue("MetastoreListTaskResponse.TaskList["+ i +"].TriggerUser"));
			task.setTriggerType(_ctx.stringValue("MetastoreListTaskResponse.TaskList["+ i +"].TriggerType"));
			task.setGmtCreate(_ctx.longValue("MetastoreListTaskResponse.TaskList["+ i +"].GmtCreate"));
			task.setGmtModified(_ctx.longValue("MetastoreListTaskResponse.TaskList["+ i +"].GmtModified"));
			task.setExecuteTime(_ctx.longValue("MetastoreListTaskResponse.TaskList["+ i +"].ExecuteTime"));

			taskList.add(task);
		}
		metastoreListTaskResponse.setTaskList(taskList);
	 
	 	return metastoreListTaskResponse;
	}
}