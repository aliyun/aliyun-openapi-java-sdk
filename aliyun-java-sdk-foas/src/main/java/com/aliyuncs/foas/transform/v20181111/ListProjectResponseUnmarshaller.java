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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.foas.model.v20181111.ListProjectResponse;
import com.aliyuncs.foas.model.v20181111.ListProjectResponse.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectResponseUnmarshaller {

	public static ListProjectResponse unmarshall(ListProjectResponse listProjectResponse, UnmarshallerContext context) {
		
		listProjectResponse.setRequestId(context.stringValue("ListProjectResponse.RequestId"));
		listProjectResponse.setPageIndex(context.integerValue("ListProjectResponse.PageIndex"));
		listProjectResponse.setPageSize(context.integerValue("ListProjectResponse.PageSize"));
		listProjectResponse.setTotalPage(context.integerValue("ListProjectResponse.TotalPage"));
		listProjectResponse.setTotalCount(context.longValue("ListProjectResponse.TotalCount"));

		List<Project> projects = new ArrayList<Project>();
		for (int i = 0; i < context.lengthValue("ListProjectResponse.Projects.Length"); i++) {
			Project project = new Project();
			project.setName(context.stringValue("ListProjectResponse.Projects["+ i +"].Name"));
			project.setState(context.stringValue("ListProjectResponse.Projects["+ i +"].State"));
			project.setCreator(context.stringValue("ListProjectResponse.Projects["+ i +"].Creator"));
			project.setCreateTime(context.longValue("ListProjectResponse.Projects["+ i +"].CreateTime"));
			project.setModifier(context.stringValue("ListProjectResponse.Projects["+ i +"].Modifier"));
			project.setModifyTime(context.longValue("ListProjectResponse.Projects["+ i +"].ModifyTime"));
			project.setDescription(context.stringValue("ListProjectResponse.Projects["+ i +"].Description"));
			project.setDeployType(context.stringValue("ListProjectResponse.Projects["+ i +"].DeployType"));
			project.setClusterId(context.stringValue("ListProjectResponse.Projects["+ i +"].ClusterId"));
			project.setManagerIds(context.stringValue("ListProjectResponse.Projects["+ i +"].ManagerIds"));

			projects.add(project);
		}
		listProjectResponse.setProjects(projects);
	 
	 	return listProjectResponse;
	}
}