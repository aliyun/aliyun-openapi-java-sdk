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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListFlowProjectResponse;
import com.aliyuncs.emr.model.v20160408.ListFlowProjectResponse.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowProjectResponseUnmarshaller {

	public static ListFlowProjectResponse unmarshall(ListFlowProjectResponse listFlowProjectResponse, UnmarshallerContext _ctx) {
		
		listFlowProjectResponse.setRequestId(_ctx.stringValue("ListFlowProjectResponse.RequestId"));
		listFlowProjectResponse.setPageNumber(_ctx.integerValue("ListFlowProjectResponse.PageNumber"));
		listFlowProjectResponse.setPageSize(_ctx.integerValue("ListFlowProjectResponse.PageSize"));
		listFlowProjectResponse.setTotal(_ctx.integerValue("ListFlowProjectResponse.Total"));

		List<Project> projects = new ArrayList<Project>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowProjectResponse.Projects.Length"); i++) {
			Project project = new Project();
			project.setId(_ctx.stringValue("ListFlowProjectResponse.Projects["+ i +"].Id"));
			project.setGmtCreate(_ctx.longValue("ListFlowProjectResponse.Projects["+ i +"].GmtCreate"));
			project.setGmtModified(_ctx.longValue("ListFlowProjectResponse.Projects["+ i +"].GmtModified"));
			project.setUserId(_ctx.stringValue("ListFlowProjectResponse.Projects["+ i +"].UserId"));
			project.setName(_ctx.stringValue("ListFlowProjectResponse.Projects["+ i +"].Name"));
			project.setDescription(_ctx.stringValue("ListFlowProjectResponse.Projects["+ i +"].Description"));

			projects.add(project);
		}
		listFlowProjectResponse.setProjects(projects);
	 
	 	return listFlowProjectResponse;
	}
}