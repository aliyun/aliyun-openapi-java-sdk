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

package com.aliyuncs.ivision.transform.v20190308;

import com.aliyuncs.ivision.model.v20190308.CreateProjectResponse;
import com.aliyuncs.ivision.model.v20190308.CreateProjectResponse.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateProjectResponseUnmarshaller {

	public static CreateProjectResponse unmarshall(CreateProjectResponse createProjectResponse, UnmarshallerContext context) {
		
		createProjectResponse.setRequestId(context.stringValue("CreateProjectResponse.RequestId"));

		Project project = new Project();
		project.setProjectId(context.stringValue("CreateProjectResponse.Project.ProjectId"));
		project.setName(context.stringValue("CreateProjectResponse.Project.Name"));
		project.setDescription(context.stringValue("CreateProjectResponse.Project.Description"));
		project.setProType(context.stringValue("CreateProjectResponse.Project.ProType"));
		project.setIterCount(context.integerValue("CreateProjectResponse.Project.IterCount"));
		project.setCreationTime(context.stringValue("CreateProjectResponse.Project.CreationTime"));
		project.setStatus(context.stringValue("CreateProjectResponse.Project.Status"));
		createProjectResponse.setProject(project);
	 
	 	return createProjectResponse;
	}
}