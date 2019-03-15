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

	public static ListFlowProjectResponse unmarshall(ListFlowProjectResponse listFlowProjectResponse, UnmarshallerContext context) {
		
		listFlowProjectResponse.setRequestId(context.stringValue("ListFlowProjectResponse.RequestId"));
		listFlowProjectResponse.setPageNumber(context.integerValue("ListFlowProjectResponse.PageNumber"));
		listFlowProjectResponse.setPageSize(context.integerValue("ListFlowProjectResponse.PageSize"));
		listFlowProjectResponse.setTotal(context.integerValue("ListFlowProjectResponse.Total"));

		List<Project> projects = new ArrayList<Project>();
		for (int i = 0; i < context.lengthValue("ListFlowProjectResponse.Projects.Length"); i++) {
			Project project = new Project();
			project.setId(context.stringValue("ListFlowProjectResponse.Projects["+ i +"].Id"));
			project.setGmtCreate(context.longValue("ListFlowProjectResponse.Projects["+ i +"].GmtCreate"));
			project.setGmtModified(context.longValue("ListFlowProjectResponse.Projects["+ i +"].GmtModified"));
			project.setUserId(context.stringValue("ListFlowProjectResponse.Projects["+ i +"].UserId"));
			project.setName(context.stringValue("ListFlowProjectResponse.Projects["+ i +"].Name"));
			project.setDescription(context.stringValue("ListFlowProjectResponse.Projects["+ i +"].Description"));

			projects.add(project);
		}
		listFlowProjectResponse.setProjects(projects);
	 
	 	return listFlowProjectResponse;
	}
}