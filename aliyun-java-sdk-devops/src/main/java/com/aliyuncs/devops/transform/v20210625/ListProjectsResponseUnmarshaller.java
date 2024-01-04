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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListProjectsResponse;
import com.aliyuncs.devops.model.v20210625.ListProjectsResponse.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectsResponseUnmarshaller {

	public static ListProjectsResponse unmarshall(ListProjectsResponse listProjectsResponse, UnmarshallerContext _ctx) {
		
		listProjectsResponse.setTotalCount(_ctx.longValue("ListProjectsResponse.totalCount"));
		listProjectsResponse.setNextToken(_ctx.stringValue("ListProjectsResponse.nextToken"));
		listProjectsResponse.setMaxResults(_ctx.longValue("ListProjectsResponse.maxResults"));
		listProjectsResponse.setRequestId(_ctx.stringValue("ListProjectsResponse.requestId"));
		listProjectsResponse.setErrorMsg(_ctx.stringValue("ListProjectsResponse.errorMsg"));
		listProjectsResponse.setErrorCode(_ctx.stringValue("ListProjectsResponse.errorCode"));
		listProjectsResponse.setSuccess(_ctx.booleanValue("ListProjectsResponse.success"));

		List<Project> projects = new ArrayList<Project>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectsResponse.projects.Length"); i++) {
			Project project = new Project();
			project.setCreator(_ctx.stringValue("ListProjectsResponse.projects["+ i +"].creator"));
			project.setCustomCode(_ctx.stringValue("ListProjectsResponse.projects["+ i +"].customCode"));
			project.setDeleteTime(_ctx.longValue("ListProjectsResponse.projects["+ i +"].deleteTime"));
			project.setDescription(_ctx.stringValue("ListProjectsResponse.projects["+ i +"].description"));
			project.setGmtCreate(_ctx.longValue("ListProjectsResponse.projects["+ i +"].gmtCreate"));
			project.setIcon(_ctx.stringValue("ListProjectsResponse.projects["+ i +"].icon"));
			project.setIdentifier(_ctx.stringValue("ListProjectsResponse.projects["+ i +"].identifier"));
			project.setName(_ctx.stringValue("ListProjectsResponse.projects["+ i +"].name"));
			project.setScope(_ctx.stringValue("ListProjectsResponse.projects["+ i +"].scope"));
			project.setTypeIdentifier(_ctx.stringValue("ListProjectsResponse.projects["+ i +"].typeIdentifier"));
			project.setStatusStageIdentifier(_ctx.stringValue("ListProjectsResponse.projects["+ i +"].statusStageIdentifier"));
			project.setLogicalStatus(_ctx.stringValue("ListProjectsResponse.projects["+ i +"].logicalStatus"));
			project.setCategoryIdentifier(_ctx.stringValue("ListProjectsResponse.projects["+ i +"].categoryIdentifier"));

			projects.add(project);
		}
		listProjectsResponse.setProjects(projects);
	 
	 	return listProjectsResponse;
	}
}