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

package com.aliyuncs.ddi.transform.v20200617;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddi.model.v20200617.ListFlowProjectsResponse;
import com.aliyuncs.ddi.model.v20200617.ListFlowProjectsResponse.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowProjectsResponseUnmarshaller {

	public static ListFlowProjectsResponse unmarshall(ListFlowProjectsResponse listFlowProjectsResponse, UnmarshallerContext _ctx) {
		
		listFlowProjectsResponse.setRequestId(_ctx.stringValue("ListFlowProjectsResponse.RequestId"));
		listFlowProjectsResponse.setPageNumber(_ctx.integerValue("ListFlowProjectsResponse.PageNumber"));
		listFlowProjectsResponse.setPageSize(_ctx.integerValue("ListFlowProjectsResponse.PageSize"));
		listFlowProjectsResponse.setTotal(_ctx.integerValue("ListFlowProjectsResponse.Total"));

		List<Project> projects = new ArrayList<Project>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowProjectsResponse.Projects.Length"); i++) {
			Project project = new Project();
			project.setDescription(_ctx.stringValue("ListFlowProjectsResponse.Projects["+ i +"].Description"));
			project.setGmtCreate(_ctx.longValue("ListFlowProjectsResponse.Projects["+ i +"].GmtCreate"));
			project.setGmtModified(_ctx.longValue("ListFlowProjectsResponse.Projects["+ i +"].GmtModified"));
			project.setId(_ctx.stringValue("ListFlowProjectsResponse.Projects["+ i +"].Id"));
			project.setName(_ctx.stringValue("ListFlowProjectsResponse.Projects["+ i +"].Name"));
			project.setUserId(_ctx.stringValue("ListFlowProjectsResponse.Projects["+ i +"].UserId"));

			projects.add(project);
		}
		listFlowProjectsResponse.setProjects(projects);
	 
	 	return listFlowProjectsResponse;
	}
}