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

	public static ListOpsOperationTaskResponse unmarshall(ListOpsOperationTaskResponse listOpsOperationTaskResponse, UnmarshallerContext _ctx) {
		
		listOpsOperationTaskResponse.setRequestId(_ctx.stringValue("ListOpsOperationTaskResponse.RequestId"));
		listOpsOperationTaskResponse.setTotal(_ctx.integerValue("ListOpsOperationTaskResponse.Total"));
		listOpsOperationTaskResponse.setPageNumber(_ctx.integerValue("ListOpsOperationTaskResponse.PageNumber"));
		listOpsOperationTaskResponse.setPageSize(_ctx.integerValue("ListOpsOperationTaskResponse.PageSize"));

		List<TaskListItem> taskList = new ArrayList<TaskListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListOpsOperationTaskResponse.TaskList.Length"); i++) {
			TaskListItem taskListItem = new TaskListItem();
			taskListItem.setId(_ctx.longValue("ListOpsOperationTaskResponse.TaskList["+ i +"].Id"));
			taskListItem.setOpsOperationId(_ctx.longValue("ListOpsOperationTaskResponse.TaskList["+ i +"].OpsOperationId"));
			taskListItem.setTaskId(_ctx.longValue("ListOpsOperationTaskResponse.TaskList["+ i +"].TaskId"));
			taskListItem.setStatus(_ctx.stringValue("ListOpsOperationTaskResponse.TaskList["+ i +"].Status"));
			taskListItem.setRegionId(_ctx.stringValue("ListOpsOperationTaskResponse.TaskList["+ i +"].RegionId"));
			taskListItem.setUserId(_ctx.stringValue("ListOpsOperationTaskResponse.TaskList["+ i +"].UserId"));
			taskListItem.setClusterId(_ctx.longValue("ListOpsOperationTaskResponse.TaskList["+ i +"].ClusterId"));
			taskListItem.setExternalClusterId(_ctx.stringValue("ListOpsOperationTaskResponse.TaskList["+ i +"].ExternalClusterId"));
			taskListItem.setHostId(_ctx.longValue("ListOpsOperationTaskResponse.TaskList["+ i +"].HostId"));
			taskListItem.setStartTime(_ctx.stringValue("ListOpsOperationTaskResponse.TaskList["+ i +"].StartTime"));
			taskListItem.setEndTime(_ctx.stringValue("ListOpsOperationTaskResponse.TaskList["+ i +"].EndTime"));
			taskListItem.setCommandName(_ctx.stringValue("ListOpsOperationTaskResponse.TaskList["+ i +"].CommandName"));
			taskListItem.setHostName(_ctx.stringValue("ListOpsOperationTaskResponse.TaskList["+ i +"].HostName"));

			taskList.add(taskListItem);
		}
		listOpsOperationTaskResponse.setTaskList(taskList);
	 
	 	return listOpsOperationTaskResponse;
	}
}