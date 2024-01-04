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

package com.aliyuncs.devops.transform.v20210625;

import com.aliyuncs.devops.model.v20210625.UpdateWorkItemResponse;
import com.aliyuncs.devops.model.v20210625.UpdateWorkItemResponse.Workitem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateWorkItemResponseUnmarshaller {

	public static UpdateWorkItemResponse unmarshall(UpdateWorkItemResponse updateWorkItemResponse, UnmarshallerContext _ctx) {
		
		updateWorkItemResponse.setRequestId(_ctx.stringValue("UpdateWorkItemResponse.requestId"));
		updateWorkItemResponse.setErrorCode(_ctx.stringValue("UpdateWorkItemResponse.errorCode"));
		updateWorkItemResponse.setErrorMessage(_ctx.stringValue("UpdateWorkItemResponse.errorMessage"));
		updateWorkItemResponse.setSuccess(_ctx.booleanValue("UpdateWorkItemResponse.success"));

		Workitem workitem = new Workitem();
		workitem.setIdentifier(_ctx.stringValue("UpdateWorkItemResponse.workitem.identifier"));
		workitem.setSubject(_ctx.stringValue("UpdateWorkItemResponse.workitem.subject"));
		workitem.setDocument(_ctx.stringValue("UpdateWorkItemResponse.workitem.document"));
		workitem.setAssignedTo(_ctx.stringValue("UpdateWorkItemResponse.workitem.assignedTo"));
		workitem.setStatus(_ctx.stringValue("UpdateWorkItemResponse.workitem.status"));
		workitem.setStatusStageIdentifier(_ctx.stringValue("UpdateWorkItemResponse.workitem.statusStageIdentifier"));
		workitem.setSpaceIdentifier(_ctx.stringValue("UpdateWorkItemResponse.workitem.spaceIdentifier"));
		workitem.setSpaceName(_ctx.stringValue("UpdateWorkItemResponse.workitem.spaceName"));
		workitem.setSpaceType(_ctx.stringValue("UpdateWorkItemResponse.workitem.spaceType"));
		workitem.setLogicalStatus(_ctx.stringValue("UpdateWorkItemResponse.workitem.logicalStatus"));
		workitem.setCategoryIdentifier(_ctx.stringValue("UpdateWorkItemResponse.workitem.categoryIdentifier"));
		workitem.setParentIdentifier(_ctx.stringValue("UpdateWorkItemResponse.workitem.parentIdentifier"));
		workitem.setWorkitemTypeIdentifier(_ctx.stringValue("UpdateWorkItemResponse.workitem.workitemTypeIdentifier"));
		workitem.setUpdateStatusAt(_ctx.longValue("UpdateWorkItemResponse.workitem.updateStatusAt"));
		workitem.setSerialNumber(_ctx.stringValue("UpdateWorkItemResponse.workitem.serialNumber"));
		workitem.setGmtCreate(_ctx.longValue("UpdateWorkItemResponse.workitem.gmtCreate"));
		workitem.setGmtModified(_ctx.longValue("UpdateWorkItemResponse.workitem.gmtModified"));
		workitem.setCreator(_ctx.stringValue("UpdateWorkItemResponse.workitem.creator"));
		workitem.setModifier(_ctx.stringValue("UpdateWorkItemResponse.workitem.modifier"));
		workitem.setStatusIdentifier(_ctx.stringValue("UpdateWorkItemResponse.workitem.statusIdentifier"));
		workitem.setSprintIdentifier(_ctx.stringValue("UpdateWorkItemResponse.workitem.sprintIdentifier"));
		updateWorkItemResponse.setWorkitem(workitem);
	 
	 	return updateWorkItemResponse;
	}
}