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

import com.aliyuncs.devops.model.v20210625.CreateProjectResponse;
import com.aliyuncs.devops.model.v20210625.CreateProjectResponse.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateProjectResponseUnmarshaller {

	public static CreateProjectResponse unmarshall(CreateProjectResponse createProjectResponse, UnmarshallerContext _ctx) {
		
		createProjectResponse.setRequestId(_ctx.stringValue("CreateProjectResponse.requestId"));
		createProjectResponse.setErrorMsg(_ctx.stringValue("CreateProjectResponse.errorMsg"));
		createProjectResponse.setErrorCode(_ctx.stringValue("CreateProjectResponse.errorCode"));
		createProjectResponse.setSuccess(_ctx.booleanValue("CreateProjectResponse.success"));

		Project project = new Project();
		project.setCategoryIdentifier(_ctx.stringValue("CreateProjectResponse.project.categoryIdentifier"));
		project.setCreator(_ctx.stringValue("CreateProjectResponse.project.creator"));
		project.setCustomCode(_ctx.stringValue("CreateProjectResponse.project.customCode"));
		project.setDescription(_ctx.stringValue("CreateProjectResponse.project.description"));
		project.setGmtCreate(_ctx.longValue("CreateProjectResponse.project.gmtCreate"));
		project.setGmtModified(_ctx.longValue("CreateProjectResponse.project.gmtModified"));
		project.setIcon(_ctx.stringValue("CreateProjectResponse.project.icon"));
		project.setIdentifier(_ctx.stringValue("CreateProjectResponse.project.identifier"));
		project.setLogicalStatus(_ctx.stringValue("CreateProjectResponse.project.logicalStatus"));
		project.setModifier(_ctx.stringValue("CreateProjectResponse.project.modifier"));
		project.setName(_ctx.stringValue("CreateProjectResponse.project.name"));
		project.setOrganizationIdentifier(_ctx.stringValue("CreateProjectResponse.project.organizationIdentifier"));
		project.setScope(_ctx.stringValue("CreateProjectResponse.project.scope"));
		project.setStatusIdentifier(_ctx.stringValue("CreateProjectResponse.project.statusIdentifier"));
		project.setStatusStageIdentifier(_ctx.stringValue("CreateProjectResponse.project.statusStageIdentifier"));
		project.setTypeIdentifier(_ctx.stringValue("CreateProjectResponse.project.typeIdentifier"));
		createProjectResponse.setProject(project);
	 
	 	return createProjectResponse;
	}
}