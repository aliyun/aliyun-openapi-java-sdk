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

import com.aliyuncs.imm.model.v20170906.ListPhotoProcessTasksResponse;
import com.aliyuncs.imm.model.v20170906.ListPhotoProcessTasksResponse.TasksItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPhotoProcessTasksResponseUnmarshaller {

	public static ListPhotoProcessTasksResponse unmarshall(ListPhotoProcessTasksResponse listPhotoProcessTasksResponse, UnmarshallerContext context) {
		
		listPhotoProcessTasksResponse.setRequestId(context.stringValue("ListPhotoProcessTasksResponse.RequestId"));
		listPhotoProcessTasksResponse.setNextMarker(context.stringValue("ListPhotoProcessTasksResponse.NextMarker"));

		List<TasksItem> tasks = new ArrayList<TasksItem>();
		for (int i = 0; i < context.lengthValue("ListPhotoProcessTasksResponse.Tasks.Length"); i++) {
			TasksItem tasksItem = new TasksItem();
			tasksItem.setTaskId(context.stringValue("ListPhotoProcessTasksResponse.Tasks["+ i +"].TaskId"));
			tasksItem.setStatus(context.stringValue("ListPhotoProcessTasksResponse.Tasks["+ i +"].Status"));
			tasksItem.setSrcUri(context.stringValue("ListPhotoProcessTasksResponse.Tasks["+ i +"].SrcUri"));
			tasksItem.setTgtUri(context.stringValue("ListPhotoProcessTasksResponse.Tasks["+ i +"].TgtUri"));
			tasksItem.setStyle(context.stringValue("ListPhotoProcessTasksResponse.Tasks["+ i +"].Style"));
			tasksItem.setNotifyTopicName(context.stringValue("ListPhotoProcessTasksResponse.Tasks["+ i +"].NotifyTopicName"));
			tasksItem.setNotifyEndpoint(context.stringValue("ListPhotoProcessTasksResponse.Tasks["+ i +"].NotifyEndpoint"));
			tasksItem.setExternalID(context.stringValue("ListPhotoProcessTasksResponse.Tasks["+ i +"].ExternalID"));
			tasksItem.setCreateTime(context.stringValue("ListPhotoProcessTasksResponse.Tasks["+ i +"].CreateTime"));
			tasksItem.setFinishTime(context.stringValue("ListPhotoProcessTasksResponse.Tasks["+ i +"].FinishTime"));
			tasksItem.setPercent(context.integerValue("ListPhotoProcessTasksResponse.Tasks["+ i +"].Percent"));

			tasks.add(tasksItem);
		}
		listPhotoProcessTasksResponse.setTasks(tasks);
	 
	 	return listPhotoProcessTasksResponse;
	}
}