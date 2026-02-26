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

import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceMyProjectsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceMyProjectsResponse.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataServiceMyProjectsResponseUnmarshaller {

	public static GetDataServiceMyProjectsResponse unmarshall(GetDataServiceMyProjectsResponse getDataServiceMyProjectsResponse, UnmarshallerContext _ctx) {
		
		getDataServiceMyProjectsResponse.setRequestId(_ctx.stringValue("GetDataServiceMyProjectsResponse.RequestId"));
		getDataServiceMyProjectsResponse.setSuccess(_ctx.booleanValue("GetDataServiceMyProjectsResponse.Success"));
		getDataServiceMyProjectsResponse.setHttpStatusCode(_ctx.integerValue("GetDataServiceMyProjectsResponse.HttpStatusCode"));
		getDataServiceMyProjectsResponse.setCode(_ctx.stringValue("GetDataServiceMyProjectsResponse.Code"));
		getDataServiceMyProjectsResponse.setMessage(_ctx.stringValue("GetDataServiceMyProjectsResponse.Message"));

		List<Project> projectList = new ArrayList<Project>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServiceMyProjectsResponse.ProjectList.Length"); i++) {
			Project project = new Project();
			project.setRole(_ctx.integerValue("GetDataServiceMyProjectsResponse.ProjectList["+ i +"].Role"));
			project.setProjectName(_ctx.stringValue("GetDataServiceMyProjectsResponse.ProjectList["+ i +"].ProjectName"));
			project.setProjectId(_ctx.integerValue("GetDataServiceMyProjectsResponse.ProjectList["+ i +"].ProjectId"));

			projectList.add(project);
		}
		getDataServiceMyProjectsResponse.setProjectList(projectList);
	 
	 	return getDataServiceMyProjectsResponse;
	}
}