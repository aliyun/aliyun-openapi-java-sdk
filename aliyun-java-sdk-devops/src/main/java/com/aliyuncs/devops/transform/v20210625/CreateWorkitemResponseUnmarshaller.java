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

import com.aliyuncs.devops.model.v20210625.CreateWorkitemResponse;
import com.aliyuncs.devops.model.v20210625.CreateWorkitemResponse.Workitem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateWorkitemResponseUnmarshaller {

	public static CreateWorkitemResponse unmarshall(CreateWorkitemResponse createWorkitemResponse, UnmarshallerContext _ctx) {
		
		createWorkitemResponse.setRequestId(_ctx.stringValue("CreateWorkitemResponse.requestId"));
		createWorkitemResponse.setErrorMsg(_ctx.stringValue("CreateWorkitemResponse.errorMsg"));
		createWorkitemResponse.setErrorCode(_ctx.stringValue("CreateWorkitemResponse.errorCode"));
		createWorkitemResponse.setSuccess(_ctx.booleanValue("CreateWorkitemResponse.success"));

		Workitem workitem = new Workitem();
		workitem.setIdentifier(_ctx.stringValue("CreateWorkitemResponse.workitem.identifier"));
		workitem.setSubject(_ctx.stringValue("CreateWorkitemResponse.workitem.subject"));
		workitem.setDocument(_ctx.stringValue("CreateWorkitemResponse.workitem.document"));
		workitem.setAssignedTo(_ctx.stringValue("CreateWorkitemResponse.workitem.assignedTo"));
		workitem.setStatus(_ctx.stringValue("CreateWorkitemResponse.workitem.status"));
		workitem.setStatusStageIdentifier(_ctx.stringValue("CreateWorkitemResponse.workitem.statusStageIdentifier"));
		workitem.setSpaceIdentifier(_ctx.stringValue("CreateWorkitemResponse.workitem.spaceIdentifier"));
		workitem.setSpaceName(_ctx.stringValue("CreateWorkitemResponse.workitem.spaceName"));
		workitem.setSpaceType(_ctx.stringValue("CreateWorkitemResponse.workitem.spaceType"));
		workitem.setLogicalStatus(_ctx.stringValue("CreateWorkitemResponse.workitem.logicalStatus"));
		workitem.setCategoryIdentifier(_ctx.stringValue("CreateWorkitemResponse.workitem.categoryIdentifier"));
		workitem.setParentIdentifier(_ctx.stringValue("CreateWorkitemResponse.workitem.parentIdentifier"));
		workitem.setWorkitemTypeIdentifier(_ctx.stringValue("CreateWorkitemResponse.workitem.workitemTypeIdentifier"));
		workitem.setUpdateStatusAt(_ctx.longValue("CreateWorkitemResponse.workitem.updateStatusAt"));
		workitem.setSerialNumber(_ctx.stringValue("CreateWorkitemResponse.workitem.serialNumber"));
		workitem.setGmtCreate(_ctx.longValue("CreateWorkitemResponse.workitem.gmtCreate"));
		workitem.setGmtModified(_ctx.longValue("CreateWorkitemResponse.workitem.gmtModified"));
		workitem.setCreator(_ctx.stringValue("CreateWorkitemResponse.workitem.creator"));
		workitem.setModifier(_ctx.stringValue("CreateWorkitemResponse.workitem.modifier"));
		workitem.setStatusIdentifier(_ctx.stringValue("CreateWorkitemResponse.workitem.statusIdentifier"));
		workitem.setSprintIdentifier(_ctx.stringValue("CreateWorkitemResponse.workitem.sprintIdentifier"));
		createWorkitemResponse.setWorkitem(workitem);
	 
	 	return createWorkitemResponse;
	}
}