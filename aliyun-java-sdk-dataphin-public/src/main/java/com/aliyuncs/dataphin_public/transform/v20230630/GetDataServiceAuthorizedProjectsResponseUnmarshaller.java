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

import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceAuthorizedProjectsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceAuthorizedProjectsResponse.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataServiceAuthorizedProjectsResponseUnmarshaller {

	public static GetDataServiceAuthorizedProjectsResponse unmarshall(GetDataServiceAuthorizedProjectsResponse getDataServiceAuthorizedProjectsResponse, UnmarshallerContext _ctx) {
		
		getDataServiceAuthorizedProjectsResponse.setRequestId(_ctx.stringValue("GetDataServiceAuthorizedProjectsResponse.RequestId"));
		getDataServiceAuthorizedProjectsResponse.setSuccess(_ctx.booleanValue("GetDataServiceAuthorizedProjectsResponse.Success"));
		getDataServiceAuthorizedProjectsResponse.setHttpStatusCode(_ctx.integerValue("GetDataServiceAuthorizedProjectsResponse.HttpStatusCode"));
		getDataServiceAuthorizedProjectsResponse.setCode(_ctx.stringValue("GetDataServiceAuthorizedProjectsResponse.Code"));
		getDataServiceAuthorizedProjectsResponse.setMessage(_ctx.stringValue("GetDataServiceAuthorizedProjectsResponse.Message"));

		List<Project> projectList = new ArrayList<Project>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServiceAuthorizedProjectsResponse.ProjectList.Length"); i++) {
			Project project = new Project();
			project.setRole(_ctx.integerValue("GetDataServiceAuthorizedProjectsResponse.ProjectList["+ i +"].Role"));
			project.setProjectName(_ctx.stringValue("GetDataServiceAuthorizedProjectsResponse.ProjectList["+ i +"].ProjectName"));
			project.setProjectId(_ctx.integerValue("GetDataServiceAuthorizedProjectsResponse.ProjectList["+ i +"].ProjectId"));

			projectList.add(project);
		}
		getDataServiceAuthorizedProjectsResponse.setProjectList(projectList);
	 
	 	return getDataServiceAuthorizedProjectsResponse;
	}
}