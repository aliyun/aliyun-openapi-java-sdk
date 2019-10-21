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

package com.aliyuncs.iqa.transform.v20190813;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iqa.model.v20190813.ListProjectsResponse;
import com.aliyuncs.iqa.model.v20190813.ListProjectsResponse.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectsResponseUnmarshaller {

	public static ListProjectsResponse unmarshall(ListProjectsResponse listProjectsResponse, UnmarshallerContext _ctx) {
		
		listProjectsResponse.setRequestId(_ctx.stringValue("ListProjectsResponse.RequestId"));
		listProjectsResponse.setTotalCount(_ctx.integerValue("ListProjectsResponse.TotalCount"));
		listProjectsResponse.setPageNumber(_ctx.integerValue("ListProjectsResponse.PageNumber"));
		listProjectsResponse.setPageSize(_ctx.integerValue("ListProjectsResponse.PageSize"));

		List<Project> projects = new ArrayList<Project>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectsResponse.Projects.Length"); i++) {
			Project project = new Project();
			project.setProjectType(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].ProjectType"));
			project.setProjectId(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].ProjectId"));
			project.setProjectName(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].ProjectName"));
			project.setCreateTime(_ctx.longValue("ListProjectsResponse.Projects["+ i +"].CreateTime"));
			project.setDeployTime(_ctx.longValue("ListProjectsResponse.Projects["+ i +"].DeployTime"));
			project.setModelId(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].ModelId"));
			project.setQuestionCount(_ctx.integerValue("ListProjectsResponse.Projects["+ i +"].QuestionCount"));
			project.setDataStatus(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].DataStatus"));
			project.setTestServiceStatus(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].TestServiceStatus"));
			project.setOnlineServiceStatus(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].OnlineServiceStatus"));
			project.setDeployAvailable(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].DeployAvailable"));
			project.setModelName(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].ModelName"));

			projects.add(project);
		}
		listProjectsResponse.setProjects(projects);
	 
	 	return listProjectsResponse;
	}
}