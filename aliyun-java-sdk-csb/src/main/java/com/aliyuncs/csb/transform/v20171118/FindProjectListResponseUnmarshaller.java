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

package com.aliyuncs.csb.transform.v20171118;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csb.model.v20171118.FindProjectListResponse;
import com.aliyuncs.csb.model.v20171118.FindProjectListResponse.Data;
import com.aliyuncs.csb.model.v20171118.FindProjectListResponse.Data.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindProjectListResponseUnmarshaller {

	public static FindProjectListResponse unmarshall(FindProjectListResponse findProjectListResponse, UnmarshallerContext _ctx) {
		
		findProjectListResponse.setRequestId(_ctx.stringValue("FindProjectListResponse.RequestId"));
		findProjectListResponse.setCode(_ctx.integerValue("FindProjectListResponse.Code"));
		findProjectListResponse.setMessage(_ctx.stringValue("FindProjectListResponse.Message"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("FindProjectListResponse.Data.CurrentPage"));
		data.setPageNumber(_ctx.integerValue("FindProjectListResponse.Data.PageNumber"));
		data.setTotal(_ctx.integerValue("FindProjectListResponse.Data.Total"));

		List<Project> projectList = new ArrayList<Project>();
		for (int i = 0; i < _ctx.lengthValue("FindProjectListResponse.Data.ProjectList.Length"); i++) {
			Project project = new Project();
			project.setApiNum(_ctx.integerValue("FindProjectListResponse.Data.ProjectList["+ i +"].ApiNum"));
			project.setCsbId(_ctx.longValue("FindProjectListResponse.Data.ProjectList["+ i +"].CsbId"));
			project.setDeleteFlag(_ctx.integerValue("FindProjectListResponse.Data.ProjectList["+ i +"].DeleteFlag"));
			project.setDescription(_ctx.stringValue("FindProjectListResponse.Data.ProjectList["+ i +"].Description"));
			project.setGmtCreate(_ctx.longValue("FindProjectListResponse.Data.ProjectList["+ i +"].GmtCreate"));
			project.setGmtModified(_ctx.longValue("FindProjectListResponse.Data.ProjectList["+ i +"].GmtModified"));
			project.setId(_ctx.longValue("FindProjectListResponse.Data.ProjectList["+ i +"].Id"));
			project.setInterfaceJarLocation(_ctx.stringValue("FindProjectListResponse.Data.ProjectList["+ i +"].InterfaceJarLocation"));
			project.setInterfaceJarName(_ctx.stringValue("FindProjectListResponse.Data.ProjectList["+ i +"].InterfaceJarName"));
			project.setJarFileKey(_ctx.stringValue("FindProjectListResponse.Data.ProjectList["+ i +"].JarFileKey"));
			project.setOwnerId(_ctx.stringValue("FindProjectListResponse.Data.ProjectList["+ i +"].OwnerId"));
			project.setProjectName(_ctx.stringValue("FindProjectListResponse.Data.ProjectList["+ i +"].ProjectName"));
			project.setProjectOwnerEmail(_ctx.stringValue("FindProjectListResponse.Data.ProjectList["+ i +"].ProjectOwnerEmail"));
			project.setProjectOwnerName(_ctx.stringValue("FindProjectListResponse.Data.ProjectList["+ i +"].ProjectOwnerName"));
			project.setProjectOwnerPhoneNum(_ctx.stringValue("FindProjectListResponse.Data.ProjectList["+ i +"].ProjectOwnerPhoneNum"));
			project.setStatus(_ctx.integerValue("FindProjectListResponse.Data.ProjectList["+ i +"].Status"));
			project.setUserId(_ctx.stringValue("FindProjectListResponse.Data.ProjectList["+ i +"].UserId"));

			projectList.add(project);
		}
		data.setProjectList(projectList);
		findProjectListResponse.setData(data);
	 
	 	return findProjectListResponse;
	}
}