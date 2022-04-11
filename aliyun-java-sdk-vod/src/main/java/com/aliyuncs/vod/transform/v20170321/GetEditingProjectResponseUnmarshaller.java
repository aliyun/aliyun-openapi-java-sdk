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

import com.aliyuncs.vod.model.v20170321.GetEditingProjectResponse;
import com.aliyuncs.vod.model.v20170321.GetEditingProjectResponse.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEditingProjectResponseUnmarshaller {

	public static GetEditingProjectResponse unmarshall(GetEditingProjectResponse getEditingProjectResponse, UnmarshallerContext _ctx) {
		
		getEditingProjectResponse.setRequestId(_ctx.stringValue("GetEditingProjectResponse.RequestId"));

		Project project = new Project();
		project.setStorageLocation(_ctx.stringValue("GetEditingProjectResponse.Project.StorageLocation"));
		project.setStatus(_ctx.stringValue("GetEditingProjectResponse.Project.Status"));
		project.setCreationTime(_ctx.stringValue("GetEditingProjectResponse.Project.CreationTime"));
		project.setModifiedTime(_ctx.stringValue("GetEditingProjectResponse.Project.ModifiedTime"));
		project.setFEExtend(_ctx.stringValue("GetEditingProjectResponse.Project.FEExtend"));
		project.setDescription(_ctx.stringValue("GetEditingProjectResponse.Project.Description"));
		project.setCoverURL(_ctx.stringValue("GetEditingProjectResponse.Project.CoverURL"));
		project.setProjectId(_ctx.stringValue("GetEditingProjectResponse.Project.ProjectId"));
		project.setTimeline(_ctx.stringValue("GetEditingProjectResponse.Project.Timeline"));
		project.setTitle(_ctx.stringValue("GetEditingProjectResponse.Project.Title"));
		project.setRegionId(_ctx.stringValue("GetEditingProjectResponse.Project.RegionId"));
		getEditingProjectResponse.setProject(project);
	 
	 	return getEditingProjectResponse;
	}
}