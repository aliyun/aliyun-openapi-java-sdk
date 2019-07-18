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

package com.aliyuncs.vod.transform.v20170321;

import com.aliyuncs.vod.model.v20170321.AddEditingProjectResponse;
import com.aliyuncs.vod.model.v20170321.AddEditingProjectResponse.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddEditingProjectResponseUnmarshaller {

	public static AddEditingProjectResponse unmarshall(AddEditingProjectResponse addEditingProjectResponse, UnmarshallerContext _ctx) {
		
		addEditingProjectResponse.setRequestId(_ctx.stringValue("AddEditingProjectResponse.RequestId"));

		Project project = new Project();
		project.setProjectId(_ctx.stringValue("AddEditingProjectResponse.Project.ProjectId"));
		project.setCreationTime(_ctx.stringValue("AddEditingProjectResponse.Project.CreationTime"));
		project.setModifiedTime(_ctx.stringValue("AddEditingProjectResponse.Project.ModifiedTime"));
		project.setStatus(_ctx.stringValue("AddEditingProjectResponse.Project.Status"));
		project.setDescription(_ctx.stringValue("AddEditingProjectResponse.Project.Description"));
		project.setTitle(_ctx.stringValue("AddEditingProjectResponse.Project.Title"));
		addEditingProjectResponse.setProject(project);
	 
	 	return addEditingProjectResponse;
	}
}