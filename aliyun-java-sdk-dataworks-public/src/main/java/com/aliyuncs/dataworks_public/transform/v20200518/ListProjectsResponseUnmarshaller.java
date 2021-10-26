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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListProjectsResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListProjectsResponse.PageResult;
import com.aliyuncs.dataworks_public.model.v20200518.ListProjectsResponse.PageResult.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectsResponseUnmarshaller {

	public static ListProjectsResponse unmarshall(ListProjectsResponse listProjectsResponse, UnmarshallerContext _ctx) {
		
		listProjectsResponse.setRequestId(_ctx.stringValue("ListProjectsResponse.RequestId"));

		PageResult pageResult = new PageResult();
		pageResult.setPageNumber(_ctx.integerValue("ListProjectsResponse.PageResult.PageNumber"));
		pageResult.setPageSize(_ctx.integerValue("ListProjectsResponse.PageResult.PageSize"));
		pageResult.setTotalCount(_ctx.integerValue("ListProjectsResponse.PageResult.TotalCount"));

		List<Project> projectList = new ArrayList<Project>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectsResponse.PageResult.ProjectList.Length"); i++) {
			Project project = new Project();
			project.setProjectStatusCode(_ctx.stringValue("ListProjectsResponse.PageResult.ProjectList["+ i +"].ProjectStatusCode"));
			project.setProjectStatus(_ctx.integerValue("ListProjectsResponse.PageResult.ProjectList["+ i +"].ProjectStatus"));
			project.setProjectName(_ctx.stringValue("ListProjectsResponse.PageResult.ProjectList["+ i +"].ProjectName"));
			project.setProjectIdentifier(_ctx.stringValue("ListProjectsResponse.PageResult.ProjectList["+ i +"].ProjectIdentifier"));
			project.setProjectId(_ctx.longValue("ListProjectsResponse.PageResult.ProjectList["+ i +"].ProjectId"));
			project.setProjectDescription(_ctx.stringValue("ListProjectsResponse.PageResult.ProjectList["+ i +"].ProjectDescription"));
			project.setProjectOwnerBaseId(_ctx.stringValue("ListProjectsResponse.PageResult.ProjectList["+ i +"].ProjectOwnerBaseId"));

			projectList.add(project);
		}
		pageResult.setProjectList(projectList);
		listProjectsResponse.setPageResult(pageResult);
	 
	 	return listProjectsResponse;
	}
}