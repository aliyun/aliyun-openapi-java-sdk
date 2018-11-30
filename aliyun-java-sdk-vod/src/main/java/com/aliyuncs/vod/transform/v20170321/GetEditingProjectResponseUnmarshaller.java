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

	public static GetEditingProjectResponse unmarshall(GetEditingProjectResponse getEditingProjectResponse, UnmarshallerContext context) {
		
		getEditingProjectResponse.setRequestId(context.stringValue("GetEditingProjectResponse.RequestId"));

		Project project = new Project();
		project.setProjectId(context.stringValue("GetEditingProjectResponse.Project.ProjectId"));
		project.setCreationTime(context.stringValue("GetEditingProjectResponse.Project.CreationTime"));
		project.setModifiedTime(context.stringValue("GetEditingProjectResponse.Project.ModifiedTime"));
		project.setStatus(context.stringValue("GetEditingProjectResponse.Project.Status"));
		project.setDescription(context.stringValue("GetEditingProjectResponse.Project.Description"));
		project.setTitle(context.stringValue("GetEditingProjectResponse.Project.Title"));
		project.setTimeline(context.stringValue("GetEditingProjectResponse.Project.Timeline"));
		project.setCoverURL(context.stringValue("GetEditingProjectResponse.Project.CoverURL"));
		getEditingProjectResponse.setProject(project);
	 
	 	return getEditingProjectResponse;
	}
}