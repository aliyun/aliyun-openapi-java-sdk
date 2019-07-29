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

	public static ListProjectResponse unmarshall(ListProjectResponse listProjectResponse, UnmarshallerContext _ctx) {
		
		listProjectResponse.setRequestId(_ctx.stringValue("ListProjectResponse.RequestId"));
		listProjectResponse.setPageIndex(_ctx.integerValue("ListProjectResponse.PageIndex"));
		listProjectResponse.setPageSize(_ctx.integerValue("ListProjectResponse.PageSize"));
		listProjectResponse.setTotalPage(_ctx.integerValue("ListProjectResponse.TotalPage"));
		listProjectResponse.setTotalCount(_ctx.longValue("ListProjectResponse.TotalCount"));

		List<Project> projects = new ArrayList<Project>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectResponse.Projects.Length"); i++) {
			Project project = new Project();
			project.setName(_ctx.stringValue("ListProjectResponse.Projects["+ i +"].Name"));
			project.setState(_ctx.stringValue("ListProjectResponse.Projects["+ i +"].State"));
			project.setCreator(_ctx.stringValue("ListProjectResponse.Projects["+ i +"].Creator"));
			project.setCreateTime(_ctx.longValue("ListProjectResponse.Projects["+ i +"].CreateTime"));
			project.setModifier(_ctx.stringValue("ListProjectResponse.Projects["+ i +"].Modifier"));
			project.setModifyTime(_ctx.longValue("ListProjectResponse.Projects["+ i +"].ModifyTime"));
			project.setDescription(_ctx.stringValue("ListProjectResponse.Projects["+ i +"].Description"));
			project.setDeployType(_ctx.stringValue("ListProjectResponse.Projects["+ i +"].DeployType"));
			project.setClusterId(_ctx.stringValue("ListProjectResponse.Projects["+ i +"].ClusterId"));
			project.setManagerIds(_ctx.stringValue("ListProjectResponse.Projects["+ i +"].ManagerIds"));
			project.setRegion(_ctx.stringValue("ListProjectResponse.Projects["+ i +"].Region"));
			project.setId(_ctx.stringValue("ListProjectResponse.Projects["+ i +"].Id"));

			projects.add(project);
		}
		listProjectResponse.setProjects(projects);
	 
	 	return listProjectResponse;
	}
}