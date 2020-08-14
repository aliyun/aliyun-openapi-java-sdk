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

package com.aliyuncs.teambition_aliyun.transform.v20200226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.teambition_aliyun.model.v20200226.ListProjectTasksResponse;
import com.aliyuncs.teambition_aliyun.model.v20200226.ListProjectTasksResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectTasksResponseUnmarshaller {

	public static ListProjectTasksResponse unmarshall(ListProjectTasksResponse listProjectTasksResponse, UnmarshallerContext _ctx) {
		
		listProjectTasksResponse.setRequestId(_ctx.stringValue("ListProjectTasksResponse.RequestId"));
		listProjectTasksResponse.setSuccessful(_ctx.booleanValue("ListProjectTasksResponse.Successful"));
		listProjectTasksResponse.setErrorCode(_ctx.stringValue("ListProjectTasksResponse.ErrorCode"));
		listProjectTasksResponse.setErrorMsg(_ctx.stringValue("ListProjectTasksResponse.ErrorMsg"));

		List<Task> object = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectTasksResponse.Object.Length"); i++) {
			Task task = new Task();
			task.setTasklistId(_ctx.stringValue("ListProjectTasksResponse.Object["+ i +"].TasklistId"));
			task.setProjectId(_ctx.stringValue("ListProjectTasksResponse.Object["+ i +"].ProjectId"));
			task.setTaskgroupId(_ctx.stringValue("ListProjectTasksResponse.Object["+ i +"].TaskgroupId"));
			task.setName(_ctx.stringValue("ListProjectTasksResponse.Object["+ i +"].Name"));
			task.setCreatorId(_ctx.stringValue("ListProjectTasksResponse.Object["+ i +"].CreatorId"));
			task.setCreated(_ctx.stringValue("ListProjectTasksResponse.Object["+ i +"].Created"));
			task.setModifierId(_ctx.stringValue("ListProjectTasksResponse.Object["+ i +"].ModifierId"));
			task.setUpdated(_ctx.stringValue("ListProjectTasksResponse.Object["+ i +"].Updated"));
			task.setId(_ctx.stringValue("ListProjectTasksResponse.Object["+ i +"].Id"));

			object.add(task);
		}
		listProjectTasksResponse.setObject(object);
	 
	 	return listProjectTasksResponse;
	}
}