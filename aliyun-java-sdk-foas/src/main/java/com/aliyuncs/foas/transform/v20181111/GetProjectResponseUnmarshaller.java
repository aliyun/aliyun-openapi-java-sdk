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

package com.aliyuncs.foas.transform.v20181111;

import com.aliyuncs.foas.model.v20181111.GetProjectResponse;
import com.aliyuncs.foas.model.v20181111.GetProjectResponse.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectResponseUnmarshaller {

	public static GetProjectResponse unmarshall(GetProjectResponse getProjectResponse, UnmarshallerContext _ctx) {
		
		getProjectResponse.setRequestId(_ctx.stringValue("GetProjectResponse.RequestId"));

		Project project = new Project();
		project.setName(_ctx.stringValue("GetProjectResponse.Project.Name"));
		project.setState(_ctx.stringValue("GetProjectResponse.Project.State"));
		project.setCreator(_ctx.stringValue("GetProjectResponse.Project.Creator"));
		project.setCreateTime(_ctx.longValue("GetProjectResponse.Project.CreateTime"));
		project.setModifier(_ctx.stringValue("GetProjectResponse.Project.Modifier"));
		project.setModifyTime(_ctx.longValue("GetProjectResponse.Project.ModifyTime"));
		project.setDescription(_ctx.stringValue("GetProjectResponse.Project.Description"));
		project.setDeployType(_ctx.stringValue("GetProjectResponse.Project.DeployType"));
		project.setClusterId(_ctx.stringValue("GetProjectResponse.Project.ClusterId"));
		project.setManagerIds(_ctx.stringValue("GetProjectResponse.Project.ManagerIds"));
		project.setRegion(_ctx.stringValue("GetProjectResponse.Project.Region"));
		project.setId(_ctx.stringValue("GetProjectResponse.Project.Id"));
		project.setGlobalJobConfig(_ctx.stringValue("GetProjectResponse.Project.GlobalJobConfig"));
		getProjectResponse.setProject(project);
	 
	 	return getProjectResponse;
	}
}