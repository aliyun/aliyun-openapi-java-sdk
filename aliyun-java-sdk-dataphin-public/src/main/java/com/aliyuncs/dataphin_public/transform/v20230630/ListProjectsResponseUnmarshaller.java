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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListProjectsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListProjectsResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListProjectsResponse.PageResult.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectsResponseUnmarshaller {

	public static ListProjectsResponse unmarshall(ListProjectsResponse listProjectsResponse, UnmarshallerContext _ctx) {
		
		listProjectsResponse.setRequestId(_ctx.stringValue("ListProjectsResponse.RequestId"));
		listProjectsResponse.setSuccess(_ctx.booleanValue("ListProjectsResponse.Success"));
		listProjectsResponse.setHttpStatusCode(_ctx.integerValue("ListProjectsResponse.HttpStatusCode"));
		listProjectsResponse.setCode(_ctx.stringValue("ListProjectsResponse.Code"));
		listProjectsResponse.setMessage(_ctx.stringValue("ListProjectsResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.integerValue("ListProjectsResponse.PageResult.TotalCount"));

		List<Project> projectList = new ArrayList<Project>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectsResponse.PageResult.ProjectList.Length"); i++) {
			Project project = new Project();
			project.setRealtimeDataSourceName(_ctx.stringValue("ListProjectsResponse.PageResult.ProjectList["+ i +"].RealtimeDataSourceName"));
			project.setOwner(_ctx.stringValue("ListProjectsResponse.PageResult.ProjectList["+ i +"].Owner"));
			project.setOwnerName(_ctx.stringValue("ListProjectsResponse.PageResult.ProjectList["+ i +"].OwnerName"));
			project.setDescription(_ctx.stringValue("ListProjectsResponse.PageResult.ProjectList["+ i +"].Description"));
			project.setMode(_ctx.stringValue("ListProjectsResponse.PageResult.ProjectList["+ i +"].Mode"));
			project.setGmtModified(_ctx.stringValue("ListProjectsResponse.PageResult.ProjectList["+ i +"].GmtModified"));
			project.setEnv(_ctx.stringValue("ListProjectsResponse.PageResult.ProjectList["+ i +"].Env"));
			project.setName(_ctx.stringValue("ListProjectsResponse.PageResult.ProjectList["+ i +"].Name"));
			project.setBizUnitId(_ctx.longValue("ListProjectsResponse.PageResult.ProjectList["+ i +"].BizUnitId"));
			project.setType(_ctx.stringValue("ListProjectsResponse.PageResult.ProjectList["+ i +"].Type"));
			project.setGmtCreate(_ctx.stringValue("ListProjectsResponse.PageResult.ProjectList["+ i +"].GmtCreate"));
			project.setDataSourceName(_ctx.stringValue("ListProjectsResponse.PageResult.ProjectList["+ i +"].DataSourceName"));
			project.setDisplayName(_ctx.stringValue("ListProjectsResponse.PageResult.ProjectList["+ i +"].DisplayName"));
			project.setId(_ctx.longValue("ListProjectsResponse.PageResult.ProjectList["+ i +"].Id"));
			project.setDataSourceId(_ctx.longValue("ListProjectsResponse.PageResult.ProjectList["+ i +"].DataSourceId"));
			project.setRealtimeDataSourceId(_ctx.longValue("ListProjectsResponse.PageResult.ProjectList["+ i +"].RealtimeDataSourceId"));

			projectList.add(project);
		}
		pageResult.setProjectList(projectList);
		listProjectsResponse.setPageResult(pageResult);
	 
	 	return listProjectsResponse;
	}
}