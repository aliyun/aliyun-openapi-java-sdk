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

import com.aliyuncs.emr.model.v20160408.ListOpsOperationTask1Response;
import com.aliyuncs.emr.model.v20160408.ListOpsOperationTask1Response.TaskListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOpsOperationTask1ResponseUnmarshaller {

	public static ListOpsOperationTask1Response unmarshall(ListOpsOperationTask1Response listOpsOperationTask1Response, UnmarshallerContext context) {
		
		listOpsOperationTask1Response.setRequestId(context.stringValue("ListOpsOperationTask1Response.RequestId"));

		List<TaskListItem> taskList = new ArrayList<TaskListItem>();
		for (int i = 0; i < context.lengthValue("ListOpsOperationTask1Response.TaskList.Length"); i++) {
			TaskListItem taskListItem = new TaskListItem();
			taskListItem.setId(context.longValue("ListOpsOperationTask1Response.TaskList["+ i +"].Id"));
			taskListItem.setOpsOperationId(context.longValue("ListOpsOperationTask1Response.TaskList["+ i +"].OpsOperationId"));
			taskListItem.setTaskId(context.longValue("ListOpsOperationTask1Response.TaskList["+ i +"].TaskId"));
			taskListItem.setStatus(context.stringValue("ListOpsOperationTask1Response.TaskList["+ i +"].Status"));
			taskListItem.setRegionId(context.stringValue("ListOpsOperationTask1Response.TaskList["+ i +"].RegionId"));
			taskListItem.setUserId(context.stringValue("ListOpsOperationTask1Response.TaskList["+ i +"].UserId"));
			taskListItem.setClusterId(context.longValue("ListOpsOperationTask1Response.TaskList["+ i +"].ClusterId"));
			taskListItem.setExternalClusterId(context.stringValue("ListOpsOperationTask1Response.TaskList["+ i +"].ExternalClusterId"));
			taskListItem.setHostId(context.longValue("ListOpsOperationTask1Response.TaskList["+ i +"].HostId"));
			taskListItem.setStartTime(context.stringValue("ListOpsOperationTask1Response.TaskList["+ i +"].StartTime"));
			taskListItem.setEndTime(context.stringValue("ListOpsOperationTask1Response.TaskList["+ i +"].EndTime"));
			taskListItem.setCommandName(context.stringValue("ListOpsOperationTask1Response.TaskList["+ i +"].CommandName"));
			taskListItem.setHostName(context.stringValue("ListOpsOperationTask1Response.TaskList["+ i +"].HostName"));

			taskList.add(taskListItem);
		}
		listOpsOperationTask1Response.setTaskList(taskList);
	 
	 	return listOpsOperationTask1Response;
	}
}