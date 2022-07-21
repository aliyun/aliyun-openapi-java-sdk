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

package com.aliyuncs.imm.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20200930.ListProjectsResponse;
import com.aliyuncs.imm.model.v20200930.ListProjectsResponse.ProjectsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectsResponseUnmarshaller {

	public static ListProjectsResponse unmarshall(ListProjectsResponse listProjectsResponse, UnmarshallerContext _ctx) {
		
		listProjectsResponse.setRequestId(_ctx.stringValue("ListProjectsResponse.RequestId"));
		listProjectsResponse.setNextToken(_ctx.stringValue("ListProjectsResponse.NextToken"));

		List<ProjectsItem> projects = new ArrayList<ProjectsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectsResponse.Projects.Length"); i++) {
			ProjectsItem projectsItem = new ProjectsItem();
			projectsItem.setProjectName(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].ProjectName"));
			projectsItem.setServiceRole(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].ServiceRole"));
			projectsItem.setTemplateId(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].TemplateId"));
			projectsItem.setCreateTime(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].CreateTime"));
			projectsItem.setUpdateTime(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].UpdateTime"));
			projectsItem.setDescription(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].Description"));
			projectsItem.setProjectQueriesPerSecond(_ctx.longValue("ListProjectsResponse.Projects["+ i +"].ProjectQueriesPerSecond"));
			projectsItem.setEngineConcurrency(_ctx.longValue("ListProjectsResponse.Projects["+ i +"].EngineConcurrency"));
			projectsItem.setProjectMaxDatasetCount(_ctx.longValue("ListProjectsResponse.Projects["+ i +"].ProjectMaxDatasetCount"));
			projectsItem.setDatasetMaxBindCount(_ctx.longValue("ListProjectsResponse.Projects["+ i +"].DatasetMaxBindCount"));
			projectsItem.setDatasetMaxFileCount(_ctx.longValue("ListProjectsResponse.Projects["+ i +"].DatasetMaxFileCount"));
			projectsItem.setDatasetMaxEntityCount(_ctx.longValue("ListProjectsResponse.Projects["+ i +"].DatasetMaxEntityCount"));
			projectsItem.setDatasetMaxRelationCount(_ctx.longValue("ListProjectsResponse.Projects["+ i +"].DatasetMaxRelationCount"));
			projectsItem.setDatasetMaxTotalFileSize(_ctx.longValue("ListProjectsResponse.Projects["+ i +"].DatasetMaxTotalFileSize"));
			projectsItem.setDatasetCount(_ctx.longValue("ListProjectsResponse.Projects["+ i +"].DatasetCount"));
			projectsItem.setFileCount(_ctx.longValue("ListProjectsResponse.Projects["+ i +"].FileCount"));
			projectsItem.setTotalFileSize(_ctx.longValue("ListProjectsResponse.Projects["+ i +"].TotalFileSize"));

			projects.add(projectsItem);
		}
		listProjectsResponse.setProjects(projects);
	 
	 	return listProjectsResponse;
	}
}