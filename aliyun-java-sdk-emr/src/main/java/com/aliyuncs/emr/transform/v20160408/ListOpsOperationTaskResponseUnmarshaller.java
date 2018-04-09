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

import com.aliyuncs.emr.model.v20160408.ListOpsOperationTaskResponse;
import com.aliyuncs.emr.model.v20160408.ListOpsOperationTaskResponse.TaskListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOpsOperationTaskResponseUnmarshaller {

	public static ListOpsOperationTaskResponse unmarshall(ListOpsOperationTaskResponse listOpsOperationTaskResponse, UnmarshallerContext context) {
		
		listOpsOperationTaskResponse.setRequestId(context.stringValue("ListOpsOperationTaskResponse.RequestId"));
		listOpsOperationTaskResponse.setTotal(context.integerValue("ListOpsOperationTaskResponse.Total"));
		listOpsOperationTaskResponse.setPageNumber(context.integerValue("ListOpsOperationTaskResponse.PageNumber"));
		listOpsOperationTaskResponse.setPageSize(context.integerValue("ListOpsOperationTaskResponse.PageSize"));

		List<TaskListItem> taskList = new ArrayList<TaskListItem>();
		for (int i = 0; i < context.lengthValue("ListOpsOperationTaskResponse.TaskList.Length"); i++) {
			TaskListItem taskListItem = new TaskListItem();
			taskListItem.setId(context.longValue("ListOpsOperationTaskResponse.TaskList["+ i +"].Id"));
			taskListItem.setOpsOperationId(context.longValue("ListOpsOperationTaskResponse.TaskList["+ i +"].OpsOperationId"));
			taskListItem.setTaskId(context.longValue("ListOpsOperationTaskResponse.TaskList["+ i +"].TaskId"));
			taskListItem.setStatus(context.stringValue("ListOpsOperationTaskResponse.TaskList["+ i +"].Status"));
			taskListItem.setRegionId(context.stringValue("ListOpsOperationTaskResponse.TaskList["+ i +"].RegionId"));
			taskListItem.setUserId(context.stringValue("ListOpsOperationTaskResponse.TaskList["+ i +"].UserId"));
			taskListItem.setClusterId(context.longValue("ListOpsOperationTaskResponse.TaskList["+ i +"].ClusterId"));
			taskListItem.setExternalClusterId(context.stringValue("ListOpsOperationTaskResponse.TaskList["+ i +"].ExternalClusterId"));
			taskListItem.setHostId(context.longValue("ListOpsOperationTaskResponse.TaskList["+ i +"].HostId"));
			taskListItem.setStartTime(context.stringValue("ListOpsOperationTaskResponse.TaskList["+ i +"].StartTime"));
			taskListItem.setEndTime(context.stringValue("ListOpsOperationTaskResponse.TaskList["+ i +"].EndTime"));
			taskListItem.setCommandName(context.stringValue("ListOpsOperationTaskResponse.TaskList["+ i +"].CommandName"));
			taskListItem.setHostName(context.stringValue("ListOpsOperationTaskResponse.TaskList["+ i +"].HostName"));

			taskList.add(taskListItem);
		}
		listOpsOperationTaskResponse.setTaskList(taskList);
	 
	 	return listOpsOperationTaskResponse;
	}
}