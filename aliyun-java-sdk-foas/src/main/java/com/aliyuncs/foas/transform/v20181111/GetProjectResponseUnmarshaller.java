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

	public static GetProjectResponse unmarshall(GetProjectResponse getProjectResponse, UnmarshallerContext context) {
		
		getProjectResponse.setRequestId(context.stringValue("GetProjectResponse.RequestId"));

		Project project = new Project();
		project.setName(context.stringValue("GetProjectResponse.Project.Name"));
		project.setState(context.stringValue("GetProjectResponse.Project.State"));
		project.setCreator(context.stringValue("GetProjectResponse.Project.Creator"));
		project.setCreateTime(context.longValue("GetProjectResponse.Project.CreateTime"));
		project.setModifier(context.stringValue("GetProjectResponse.Project.Modifier"));
		project.setModifyTime(context.longValue("GetProjectResponse.Project.ModifyTime"));
		project.setDescription(context.stringValue("GetProjectResponse.Project.Description"));
		project.setDeployType(context.stringValue("GetProjectResponse.Project.DeployType"));
		project.setClusterId(context.stringValue("GetProjectResponse.Project.ClusterId"));
		getProjectResponse.setProject(project);
	 
	 	return getProjectResponse;
	}
}