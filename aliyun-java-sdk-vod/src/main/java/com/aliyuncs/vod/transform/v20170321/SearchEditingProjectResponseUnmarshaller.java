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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.SearchEditingProjectResponse;
import com.aliyuncs.vod.model.v20170321.SearchEditingProjectResponse.Project;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchEditingProjectResponseUnmarshaller {

	public static SearchEditingProjectResponse unmarshall(SearchEditingProjectResponse searchEditingProjectResponse, UnmarshallerContext context) {
		
		searchEditingProjectResponse.setRequestId(context.stringValue("SearchEditingProjectResponse.RequestId"));
		searchEditingProjectResponse.setTotal(context.integerValue("SearchEditingProjectResponse.Total"));

		List<Project> projectList = new ArrayList<Project>();
		for (int i = 0; i < context.lengthValue("SearchEditingProjectResponse.ProjectList.Length"); i++) {
			Project project = new Project();
			project.setProjectId(context.stringValue("SearchEditingProjectResponse.ProjectList["+ i +"].ProjectId"));
			project.setCreationTime(context.stringValue("SearchEditingProjectResponse.ProjectList["+ i +"].CreationTime"));
			project.setModifiedTime(context.stringValue("SearchEditingProjectResponse.ProjectList["+ i +"].ModifiedTime"));
			project.setStatus(context.stringValue("SearchEditingProjectResponse.ProjectList["+ i +"].Status"));
			project.setDescription(context.stringValue("SearchEditingProjectResponse.ProjectList["+ i +"].Description"));
			project.setTitle(context.stringValue("SearchEditingProjectResponse.ProjectList["+ i +"].Title"));
			project.setCoverURL(context.stringValue("SearchEditingProjectResponse.ProjectList["+ i +"].CoverURL"));

			projectList.add(project);
		}
		searchEditingProjectResponse.setProjectList(projectList);
	 
	 	return searchEditingProjectResponse;
	}
}