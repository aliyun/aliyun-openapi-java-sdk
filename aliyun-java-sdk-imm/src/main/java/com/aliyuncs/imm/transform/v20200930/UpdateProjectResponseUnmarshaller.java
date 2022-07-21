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

import com.aliyuncs.imm.model.v20200930.UpdateProjectResponse;
import com.aliyuncs.imm.model.v20200930.UpdateProjectResponse.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateProjectResponseUnmarshaller {

	public static UpdateProjectResponse unmarshall(UpdateProjectResponse updateProjectResponse, UnmarshallerContext _ctx) {
		
		updateProjectResponse.setRequestId(_ctx.stringValue("UpdateProjectResponse.RequestId"));

		Project project = new Project();
		project.setProjectName(_ctx.stringValue("UpdateProjectResponse.Project.ProjectName"));
		project.setServiceRole(_ctx.stringValue("UpdateProjectResponse.Project.ServiceRole"));
		project.setTemplateId(_ctx.stringValue("UpdateProjectResponse.Project.TemplateId"));
		project.setCreateTime(_ctx.stringValue("UpdateProjectResponse.Project.CreateTime"));
		project.setUpdateTime(_ctx.stringValue("UpdateProjectResponse.Project.UpdateTime"));
		project.setDescription(_ctx.stringValue("UpdateProjectResponse.Project.Description"));
		project.setProjectQueriesPerSecond(_ctx.longValue("UpdateProjectResponse.Project.ProjectQueriesPerSecond"));
		project.setEngineConcurrency(_ctx.longValue("UpdateProjectResponse.Project.EngineConcurrency"));
		project.setProjectMaxDatasetCount(_ctx.longValue("UpdateProjectResponse.Project.ProjectMaxDatasetCount"));
		project.setDatasetMaxBindCount(_ctx.longValue("UpdateProjectResponse.Project.DatasetMaxBindCount"));
		project.setDatasetMaxFileCount(_ctx.longValue("UpdateProjectResponse.Project.DatasetMaxFileCount"));
		project.setDatasetMaxEntityCount(_ctx.longValue("UpdateProjectResponse.Project.DatasetMaxEntityCount"));
		project.setDatasetMaxRelationCount(_ctx.longValue("UpdateProjectResponse.Project.DatasetMaxRelationCount"));
		project.setDatasetMaxTotalFileSize(_ctx.longValue("UpdateProjectResponse.Project.DatasetMaxTotalFileSize"));
		project.setDatasetCount(_ctx.longValue("UpdateProjectResponse.Project.DatasetCount"));
		project.setFileCount(_ctx.longValue("UpdateProjectResponse.Project.FileCount"));
		project.setTotalFileSize(_ctx.longValue("UpdateProjectResponse.Project.TotalFileSize"));
		updateProjectResponse.setProject(project);
	 
	 	return updateProjectResponse;
	}
}