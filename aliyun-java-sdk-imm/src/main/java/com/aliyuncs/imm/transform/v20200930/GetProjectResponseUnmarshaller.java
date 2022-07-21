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

import com.aliyuncs.imm.model.v20200930.GetProjectResponse;
import com.aliyuncs.imm.model.v20200930.GetProjectResponse.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectResponseUnmarshaller {

	public static GetProjectResponse unmarshall(GetProjectResponse getProjectResponse, UnmarshallerContext _ctx) {
		
		getProjectResponse.setRequestId(_ctx.stringValue("GetProjectResponse.RequestId"));

		Project project = new Project();
		project.setProjectName(_ctx.stringValue("GetProjectResponse.Project.ProjectName"));
		project.setServiceRole(_ctx.stringValue("GetProjectResponse.Project.ServiceRole"));
		project.setTemplateId(_ctx.stringValue("GetProjectResponse.Project.TemplateId"));
		project.setCreateTime(_ctx.stringValue("GetProjectResponse.Project.CreateTime"));
		project.setUpdateTime(_ctx.stringValue("GetProjectResponse.Project.UpdateTime"));
		project.setDescription(_ctx.stringValue("GetProjectResponse.Project.Description"));
		project.setProjectQueriesPerSecond(_ctx.longValue("GetProjectResponse.Project.ProjectQueriesPerSecond"));
		project.setEngineConcurrency(_ctx.longValue("GetProjectResponse.Project.EngineConcurrency"));
		project.setProjectMaxDatasetCount(_ctx.longValue("GetProjectResponse.Project.ProjectMaxDatasetCount"));
		project.setDatasetMaxBindCount(_ctx.longValue("GetProjectResponse.Project.DatasetMaxBindCount"));
		project.setDatasetMaxFileCount(_ctx.longValue("GetProjectResponse.Project.DatasetMaxFileCount"));
		project.setDatasetMaxEntityCount(_ctx.longValue("GetProjectResponse.Project.DatasetMaxEntityCount"));
		project.setDatasetMaxRelationCount(_ctx.longValue("GetProjectResponse.Project.DatasetMaxRelationCount"));
		project.setDatasetMaxTotalFileSize(_ctx.longValue("GetProjectResponse.Project.DatasetMaxTotalFileSize"));
		project.setDatasetCount(_ctx.longValue("GetProjectResponse.Project.DatasetCount"));
		project.setFileCount(_ctx.longValue("GetProjectResponse.Project.FileCount"));
		project.setTotalFileSize(_ctx.longValue("GetProjectResponse.Project.TotalFileSize"));
		getProjectResponse.setProject(project);
	 
	 	return getProjectResponse;
	}
}