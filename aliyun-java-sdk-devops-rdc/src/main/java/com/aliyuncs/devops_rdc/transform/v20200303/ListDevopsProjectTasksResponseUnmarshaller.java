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

package com.aliyuncs.devops_rdc.transform.v20200303;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops_rdc.model.v20200303.ListDevopsProjectTasksResponse;
import com.aliyuncs.devops_rdc.model.v20200303.ListDevopsProjectTasksResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDevopsProjectTasksResponseUnmarshaller {

	public static ListDevopsProjectTasksResponse unmarshall(ListDevopsProjectTasksResponse listDevopsProjectTasksResponse, UnmarshallerContext _ctx) {
		
		listDevopsProjectTasksResponse.setRequestId(_ctx.stringValue("ListDevopsProjectTasksResponse.RequestId"));
		listDevopsProjectTasksResponse.setErrorMsg(_ctx.stringValue("ListDevopsProjectTasksResponse.ErrorMsg"));
		listDevopsProjectTasksResponse.setSuccessful(_ctx.booleanValue("ListDevopsProjectTasksResponse.Successful"));
		listDevopsProjectTasksResponse.setErrorCode(_ctx.stringValue("ListDevopsProjectTasksResponse.ErrorCode"));

		List<Task> object = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("ListDevopsProjectTasksResponse.Object.Length"); i++) {
			Task task = new Task();
			task.setTaskgroupId(_ctx.stringValue("ListDevopsProjectTasksResponse.Object["+ i +"].TaskgroupId"));
			task.setTasklistId(_ctx.stringValue("ListDevopsProjectTasksResponse.Object["+ i +"].TasklistId"));
			task.setProjectId(_ctx.stringValue("ListDevopsProjectTasksResponse.Object["+ i +"].ProjectId"));
			task.setModifierId(_ctx.stringValue("ListDevopsProjectTasksResponse.Object["+ i +"].ModifierId"));
			task.setUpdated(_ctx.stringValue("ListDevopsProjectTasksResponse.Object["+ i +"].Updated"));
			task.setCreatorId(_ctx.stringValue("ListDevopsProjectTasksResponse.Object["+ i +"].CreatorId"));
			task.setCreated(_ctx.stringValue("ListDevopsProjectTasksResponse.Object["+ i +"].Created"));
			task.setName(_ctx.stringValue("ListDevopsProjectTasksResponse.Object["+ i +"].Name"));
			task.setId(_ctx.stringValue("ListDevopsProjectTasksResponse.Object["+ i +"].Id"));

			object.add(task);
		}
		listDevopsProjectTasksResponse.setObject(object);
	 
	 	return listDevopsProjectTasksResponse;
	}
}