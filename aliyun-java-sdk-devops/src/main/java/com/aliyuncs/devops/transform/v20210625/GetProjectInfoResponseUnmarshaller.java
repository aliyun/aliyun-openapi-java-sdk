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

import com.aliyuncs.devops.model.v20210625.GetProjectInfoResponse;
import com.aliyuncs.devops.model.v20210625.GetProjectInfoResponse.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectInfoResponseUnmarshaller {

	public static GetProjectInfoResponse unmarshall(GetProjectInfoResponse getProjectInfoResponse, UnmarshallerContext _ctx) {
		
		getProjectInfoResponse.setRequestId(_ctx.stringValue("GetProjectInfoResponse.requestId"));
		getProjectInfoResponse.setErrorCode(_ctx.stringValue("GetProjectInfoResponse.errorCode"));
		getProjectInfoResponse.setErrorMessage(_ctx.stringValue("GetProjectInfoResponse.errorMessage"));
		getProjectInfoResponse.setSuccess(_ctx.booleanValue("GetProjectInfoResponse.success"));

		Project project = new Project();
		project.setCategory(_ctx.stringValue("GetProjectInfoResponse.project.category"));
		project.setCategoryIdentifier(_ctx.stringValue("GetProjectInfoResponse.project.categoryIdentifier"));
		project.setCreator(_ctx.stringValue("GetProjectInfoResponse.project.creator"));
		project.setCustomCode(_ctx.stringValue("GetProjectInfoResponse.project.customCode"));
		project.setDescription(_ctx.stringValue("GetProjectInfoResponse.project.description"));
		project.setGmtCreate(_ctx.longValue("GetProjectInfoResponse.project.gmtCreate"));
		project.setGmtModified(_ctx.longValue("GetProjectInfoResponse.project.gmtModified"));
		project.setIconGroup(_ctx.stringValue("GetProjectInfoResponse.project.iconGroup"));
		project.setIcon(_ctx.stringValue("GetProjectInfoResponse.project.icon"));
		project.setIconBig(_ctx.stringValue("GetProjectInfoResponse.project.iconBig"));
		project.setIconSmall(_ctx.stringValue("GetProjectInfoResponse.project.iconSmall"));
		project.setId(_ctx.stringValue("GetProjectInfoResponse.project.id"));
		project.setIdentifier(_ctx.stringValue("GetProjectInfoResponse.project.identifier"));
		project.setIdentifierPath(_ctx.stringValue("GetProjectInfoResponse.project.identifierPath"));
		project.setLogicalStatus(_ctx.stringValue("GetProjectInfoResponse.project.logicalStatus"));
		project.setModifier(_ctx.stringValue("GetProjectInfoResponse.project.modifier"));
		project.setName(_ctx.stringValue("GetProjectInfoResponse.project.name"));
		project.setOrganizationIdentifier(_ctx.stringValue("GetProjectInfoResponse.project.organizationIdentifier"));
		project.setParentIdentifier(_ctx.stringValue("GetProjectInfoResponse.project.parentIdentifier"));
		project.setScope(_ctx.stringValue("GetProjectInfoResponse.project.scope"));
		project.setStatusIdentifier(_ctx.stringValue("GetProjectInfoResponse.project.statusIdentifier"));
		project.setStatusStageIdentifier(_ctx.stringValue("GetProjectInfoResponse.project.statusStageIdentifier"));
		project.setSubType(_ctx.stringValue("GetProjectInfoResponse.project.subType"));
		project.setTypeIdentifier(_ctx.stringValue("GetProjectInfoResponse.project.typeIdentifier"));
		getProjectInfoResponse.setProject(project);
	 
	 	return getProjectInfoResponse;
	}
}