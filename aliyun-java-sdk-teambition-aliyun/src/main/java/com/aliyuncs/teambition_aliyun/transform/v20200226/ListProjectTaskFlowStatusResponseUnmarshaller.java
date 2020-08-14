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

import com.aliyuncs.teambition_aliyun.model.v20200226.ListProjectTaskFlowStatusResponse;
import com.aliyuncs.teambition_aliyun.model.v20200226.ListProjectTaskFlowStatusResponse.TaskflowStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectTaskFlowStatusResponseUnmarshaller {

	public static ListProjectTaskFlowStatusResponse unmarshall(ListProjectTaskFlowStatusResponse listProjectTaskFlowStatusResponse, UnmarshallerContext _ctx) {
		
		listProjectTaskFlowStatusResponse.setRequestId(_ctx.stringValue("ListProjectTaskFlowStatusResponse.RequestId"));
		listProjectTaskFlowStatusResponse.setSuccessful(_ctx.booleanValue("ListProjectTaskFlowStatusResponse.Successful"));
		listProjectTaskFlowStatusResponse.setErrorCode(_ctx.stringValue("ListProjectTaskFlowStatusResponse.ErrorCode"));
		listProjectTaskFlowStatusResponse.setErrorMsg(_ctx.stringValue("ListProjectTaskFlowStatusResponse.ErrorMsg"));

		List<TaskflowStatus> object = new ArrayList<TaskflowStatus>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectTaskFlowStatusResponse.Object.Length"); i++) {
			TaskflowStatus taskflowStatus = new TaskflowStatus();
			taskflowStatus.setIsDeleted(_ctx.booleanValue("ListProjectTaskFlowStatusResponse.Object["+ i +"].IsDeleted"));
			taskflowStatus.setRejectStatusIds(_ctx.stringValue("ListProjectTaskFlowStatusResponse.Object["+ i +"].RejectStatusIds"));
			taskflowStatus.setPos(_ctx.integerValue("ListProjectTaskFlowStatusResponse.Object["+ i +"].Pos"));
			taskflowStatus.setKind(_ctx.stringValue("ListProjectTaskFlowStatusResponse.Object["+ i +"].Kind"));
			taskflowStatus.setCreated(_ctx.stringValue("ListProjectTaskFlowStatusResponse.Object["+ i +"].Created"));
			taskflowStatus.setTaskflowId(_ctx.stringValue("ListProjectTaskFlowStatusResponse.Object["+ i +"].TaskflowId"));
			taskflowStatus.setName(_ctx.stringValue("ListProjectTaskFlowStatusResponse.Object["+ i +"].Name"));
			taskflowStatus.setCreatorId(_ctx.stringValue("ListProjectTaskFlowStatusResponse.Object["+ i +"].CreatorId"));
			taskflowStatus.setId(_ctx.stringValue("ListProjectTaskFlowStatusResponse.Object["+ i +"].Id"));
			taskflowStatus.setUpdated(_ctx.stringValue("ListProjectTaskFlowStatusResponse.Object["+ i +"].Updated"));

			object.add(taskflowStatus);
		}
		listProjectTaskFlowStatusResponse.setObject(object);
	 
	 	return listProjectTaskFlowStatusResponse;
	}
}