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

import com.aliyuncs.devops.model.v20210625.UpdateWorkitemFieldResponse;
import com.aliyuncs.devops.model.v20210625.UpdateWorkitemFieldResponse.Workitem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateWorkitemFieldResponseUnmarshaller {

	public static UpdateWorkitemFieldResponse unmarshall(UpdateWorkitemFieldResponse updateWorkitemFieldResponse, UnmarshallerContext _ctx) {
		
		updateWorkitemFieldResponse.setRequestId(_ctx.stringValue("UpdateWorkitemFieldResponse.requestId"));
		updateWorkitemFieldResponse.setErrorMsg(_ctx.stringValue("UpdateWorkitemFieldResponse.errorMsg"));
		updateWorkitemFieldResponse.setErrorCode(_ctx.stringValue("UpdateWorkitemFieldResponse.errorCode"));
		updateWorkitemFieldResponse.setSuccess(_ctx.booleanValue("UpdateWorkitemFieldResponse.success"));

		Workitem workitem = new Workitem();
		workitem.setIdentifier(_ctx.stringValue("UpdateWorkitemFieldResponse.workitem.identifier"));
		workitem.setSubject(_ctx.stringValue("UpdateWorkitemFieldResponse.workitem.subject"));
		workitem.setDocument(_ctx.stringValue("UpdateWorkitemFieldResponse.workitem.document"));
		workitem.setAssignedTo(_ctx.stringValue("UpdateWorkitemFieldResponse.workitem.assignedTo"));
		workitem.setStatus(_ctx.stringValue("UpdateWorkitemFieldResponse.workitem.status"));
		workitem.setStatusStageIdentifier(_ctx.stringValue("UpdateWorkitemFieldResponse.workitem.statusStageIdentifier"));
		workitem.setSpaceIdentifier(_ctx.stringValue("UpdateWorkitemFieldResponse.workitem.spaceIdentifier"));
		workitem.setSpaceName(_ctx.stringValue("UpdateWorkitemFieldResponse.workitem.spaceName"));
		workitem.setSpaceType(_ctx.stringValue("UpdateWorkitemFieldResponse.workitem.spaceType"));
		workitem.setLogicalStatus(_ctx.stringValue("UpdateWorkitemFieldResponse.workitem.logicalStatus"));
		workitem.setCategoryIdentifier(_ctx.stringValue("UpdateWorkitemFieldResponse.workitem.categoryIdentifier"));
		workitem.setParentIdentifier(_ctx.stringValue("UpdateWorkitemFieldResponse.workitem.parentIdentifier"));
		workitem.setWorkitemTypeIdentifier(_ctx.stringValue("UpdateWorkitemFieldResponse.workitem.workitemTypeIdentifier"));
		workitem.setUpdateStatusAt(_ctx.longValue("UpdateWorkitemFieldResponse.workitem.updateStatusAt"));
		workitem.setSerialNumber(_ctx.stringValue("UpdateWorkitemFieldResponse.workitem.serialNumber"));
		workitem.setGmtCreate(_ctx.longValue("UpdateWorkitemFieldResponse.workitem.gmtCreate"));
		workitem.setGmtModified(_ctx.longValue("UpdateWorkitemFieldResponse.workitem.gmtModified"));
		workitem.setCreator(_ctx.stringValue("UpdateWorkitemFieldResponse.workitem.creator"));
		workitem.setModifier(_ctx.stringValue("UpdateWorkitemFieldResponse.workitem.modifier"));
		workitem.setStatusIdentifier(_ctx.stringValue("UpdateWorkitemFieldResponse.workitem.statusIdentifier"));
		workitem.setSprintIdentifier(_ctx.stringValue("UpdateWorkitemFieldResponse.workitem.sprintIdentifier"));
		updateWorkitemFieldResponse.setWorkitem(workitem);
	 
	 	return updateWorkitemFieldResponse;
	}
}