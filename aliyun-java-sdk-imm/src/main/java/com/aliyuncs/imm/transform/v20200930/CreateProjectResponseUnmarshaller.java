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

package com.aliyuncs.imm.transform.v20200930;

import com.aliyuncs.imm.model.v20200930.CreateProjectResponse;
import com.aliyuncs.imm.model.v20200930.CreateProjectResponse.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateProjectResponseUnmarshaller {

	public static CreateProjectResponse unmarshall(CreateProjectResponse createProjectResponse, UnmarshallerContext _ctx) {
		
		createProjectResponse.setRequestId(_ctx.stringValue("CreateProjectResponse.RequestId"));

		Project project = new Project();
		project.setProjectName(_ctx.stringValue("CreateProjectResponse.Project.ProjectName"));
		project.setServiceRole(_ctx.stringValue("CreateProjectResponse.Project.ServiceRole"));
		project.setTemplateId(_ctx.stringValue("CreateProjectResponse.Project.TemplateId"));
		project.setCreateTime(_ctx.stringValue("CreateProjectResponse.Project.CreateTime"));
		project.setUpdateTime(_ctx.stringValue("CreateProjectResponse.Project.UpdateTime"));
		project.setDescription(_ctx.stringValue("CreateProjectResponse.Project.Description"));
		project.setProjectQueriesPerSecond(_ctx.longValue("CreateProjectResponse.Project.ProjectQueriesPerSecond"));
		project.setEngineConcurrency(_ctx.longValue("CreateProjectResponse.Project.EngineConcurrency"));
		project.setProjectMaxDatasetCount(_ctx.longValue("CreateProjectResponse.Project.ProjectMaxDatasetCount"));
		project.setDatasetMaxBindCount(_ctx.longValue("CreateProjectResponse.Project.DatasetMaxBindCount"));
		project.setDatasetMaxFileCount(_ctx.longValue("CreateProjectResponse.Project.DatasetMaxFileCount"));
		project.setDatasetMaxEntityCount(_ctx.longValue("CreateProjectResponse.Project.DatasetMaxEntityCount"));
		project.setDatasetMaxRelationCount(_ctx.longValue("CreateProjectResponse.Project.DatasetMaxRelationCount"));
		project.setDatasetMaxTotalFileSize(_ctx.longValue("CreateProjectResponse.Project.DatasetMaxTotalFileSize"));
		project.setDatasetCount(_ctx.longValue("CreateProjectResponse.Project.DatasetCount"));
		project.setFileCount(_ctx.longValue("CreateProjectResponse.Project.FileCount"));
		project.setTotalFileSize(_ctx.longValue("CreateProjectResponse.Project.TotalFileSize"));
		createProjectResponse.setProject(project);
	 
	 	return createProjectResponse;
	}
}