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

package com.aliyuncs.paifeaturestore.transform.v20230621;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paifeaturestore.model.v20230621.ListProjectsResponse;
import com.aliyuncs.paifeaturestore.model.v20230621.ListProjectsResponse.ProjectsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectsResponseUnmarshaller {

	public static ListProjectsResponse unmarshall(ListProjectsResponse listProjectsResponse, UnmarshallerContext _ctx) {
		
		listProjectsResponse.setRequestId(_ctx.stringValue("ListProjectsResponse.RequestId"));
		listProjectsResponse.setTotalCount(_ctx.longValue("ListProjectsResponse.TotalCount"));

		List<ProjectsItem> projects = new ArrayList<ProjectsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectsResponse.Projects.Length"); i++) {
			ProjectsItem projectsItem = new ProjectsItem();
			projectsItem.setProjectId(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].ProjectId"));
			projectsItem.setName(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].Name"));
			projectsItem.setDescription(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].Description"));
			projectsItem.setOfflineDatasourceType(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].OfflineDatasourceType"));
			projectsItem.setOfflineDatasourceId(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].OfflineDatasourceId"));
			projectsItem.setOfflineDatasourceName(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].OfflineDatasourceName"));
			projectsItem.setOnlineDatasourceType(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].OnlineDatasourceType"));
			projectsItem.setOnlineDatasourceId(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].OnlineDatasourceId"));
			projectsItem.setOnlineDatasourceName(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].OnlineDatasourceName"));
			projectsItem.setOfflineLifecycle(_ctx.integerValue("ListProjectsResponse.Projects["+ i +"].OfflineLifecycle"));
			projectsItem.setFeatureEntityCount(_ctx.integerValue("ListProjectsResponse.Projects["+ i +"].FeatureEntityCount"));
			projectsItem.setFeatureViewCount(_ctx.integerValue("ListProjectsResponse.Projects["+ i +"].FeatureViewCount"));
			projectsItem.setModelCount(_ctx.integerValue("ListProjectsResponse.Projects["+ i +"].ModelCount"));
			projectsItem.setOwner(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].Owner"));
			projectsItem.setGmtCreateTime(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].GmtCreateTime"));
			projectsItem.setGmtModifiedTime(_ctx.stringValue("ListProjectsResponse.Projects["+ i +"].GmtModifiedTime"));

			projects.add(projectsItem);
		}
		listProjectsResponse.setProjects(projects);
	 
	 	return listProjectsResponse;
	}
}