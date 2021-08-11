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

import com.aliyuncs.devops_rdc.model.v20200303.ListDevopsProjectTaskFlowStatusResponse;
import com.aliyuncs.devops_rdc.model.v20200303.ListDevopsProjectTaskFlowStatusResponse.TaskflowStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDevopsProjectTaskFlowStatusResponseUnmarshaller {

	public static ListDevopsProjectTaskFlowStatusResponse unmarshall(ListDevopsProjectTaskFlowStatusResponse listDevopsProjectTaskFlowStatusResponse, UnmarshallerContext _ctx) {
		
		listDevopsProjectTaskFlowStatusResponse.setRequestId(_ctx.stringValue("ListDevopsProjectTaskFlowStatusResponse.RequestId"));
		listDevopsProjectTaskFlowStatusResponse.setErrorMsg(_ctx.stringValue("ListDevopsProjectTaskFlowStatusResponse.ErrorMsg"));
		listDevopsProjectTaskFlowStatusResponse.setSuccessful(_ctx.booleanValue("ListDevopsProjectTaskFlowStatusResponse.Successful"));
		listDevopsProjectTaskFlowStatusResponse.setErrorCode(_ctx.stringValue("ListDevopsProjectTaskFlowStatusResponse.ErrorCode"));

		List<TaskflowStatus> object = new ArrayList<TaskflowStatus>();
		for (int i = 0; i < _ctx.lengthValue("ListDevopsProjectTaskFlowStatusResponse.Object.Length"); i++) {
			TaskflowStatus taskflowStatus = new TaskflowStatus();
			taskflowStatus.setTaskflowId(_ctx.stringValue("ListDevopsProjectTaskFlowStatusResponse.Object["+ i +"].TaskflowId"));
			taskflowStatus.setKind(_ctx.stringValue("ListDevopsProjectTaskFlowStatusResponse.Object["+ i +"].Kind"));
			taskflowStatus.setPos(_ctx.integerValue("ListDevopsProjectTaskFlowStatusResponse.Object["+ i +"].Pos"));
			taskflowStatus.setIsDeleted(_ctx.booleanValue("ListDevopsProjectTaskFlowStatusResponse.Object["+ i +"].IsDeleted"));
			taskflowStatus.setUpdated(_ctx.stringValue("ListDevopsProjectTaskFlowStatusResponse.Object["+ i +"].Updated"));
			taskflowStatus.setCreatorId(_ctx.stringValue("ListDevopsProjectTaskFlowStatusResponse.Object["+ i +"].CreatorId"));
			taskflowStatus.setName(_ctx.stringValue("ListDevopsProjectTaskFlowStatusResponse.Object["+ i +"].Name"));
			taskflowStatus.setCreated(_ctx.stringValue("ListDevopsProjectTaskFlowStatusResponse.Object["+ i +"].Created"));
			taskflowStatus.setRejectStatusIds(_ctx.stringValue("ListDevopsProjectTaskFlowStatusResponse.Object["+ i +"].RejectStatusIds"));
			taskflowStatus.setId(_ctx.stringValue("ListDevopsProjectTaskFlowStatusResponse.Object["+ i +"].Id"));

			object.add(taskflowStatus);
		}
		listDevopsProjectTaskFlowStatusResponse.setObject(object);
	 
	 	return listDevopsProjectTaskFlowStatusResponse;
	}
}