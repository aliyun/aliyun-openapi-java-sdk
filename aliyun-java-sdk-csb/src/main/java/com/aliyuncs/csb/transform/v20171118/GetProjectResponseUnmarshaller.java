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

import com.aliyuncs.csb.model.v20171118.GetProjectResponse;
import com.aliyuncs.csb.model.v20171118.GetProjectResponse.Data;
import com.aliyuncs.csb.model.v20171118.GetProjectResponse.Data.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectResponseUnmarshaller {

	public static GetProjectResponse unmarshall(GetProjectResponse getProjectResponse, UnmarshallerContext _ctx) {
		
		getProjectResponse.setRequestId(_ctx.stringValue("GetProjectResponse.RequestId"));
		getProjectResponse.setCode(_ctx.integerValue("GetProjectResponse.Code"));
		getProjectResponse.setMessage(_ctx.stringValue("GetProjectResponse.Message"));

		Data data = new Data();

		List<Project> projectList = new ArrayList<Project>();
		for (int i = 0; i < _ctx.lengthValue("GetProjectResponse.Data.ProjectList.Length"); i++) {
			Project project = new Project();
			project.setApiNum(_ctx.integerValue("GetProjectResponse.Data.ProjectList["+ i +"].ApiNum"));
			project.setCsbId(_ctx.longValue("GetProjectResponse.Data.ProjectList["+ i +"].CsbId"));
			project.setDeleteFlag(_ctx.integerValue("GetProjectResponse.Data.ProjectList["+ i +"].DeleteFlag"));
			project.setDescription(_ctx.stringValue("GetProjectResponse.Data.ProjectList["+ i +"].Description"));
			project.setGmtCreate(_ctx.longValue("GetProjectResponse.Data.ProjectList["+ i +"].GmtCreate"));
			project.setGmtModified(_ctx.longValue("GetProjectResponse.Data.ProjectList["+ i +"].GmtModified"));
			project.setId(_ctx.longValue("GetProjectResponse.Data.ProjectList["+ i +"].Id"));
			project.setInterfaceJarLocation(_ctx.stringValue("GetProjectResponse.Data.ProjectList["+ i +"].InterfaceJarLocation"));
			project.setInterfaceJarName(_ctx.stringValue("GetProjectResponse.Data.ProjectList["+ i +"].InterfaceJarName"));
			project.setJarFileKey(_ctx.stringValue("GetProjectResponse.Data.ProjectList["+ i +"].JarFileKey"));
			project.setOwnerId(_ctx.stringValue("GetProjectResponse.Data.ProjectList["+ i +"].OwnerId"));
			project.setProjectName(_ctx.stringValue("GetProjectResponse.Data.ProjectList["+ i +"].ProjectName"));
			project.setProjectOwnerEmail(_ctx.stringValue("GetProjectResponse.Data.ProjectList["+ i +"].ProjectOwnerEmail"));
			project.setProjectOwnerName(_ctx.stringValue("GetProjectResponse.Data.ProjectList["+ i +"].ProjectOwnerName"));
			project.setProjectOwnerPhoneNum(_ctx.stringValue("GetProjectResponse.Data.ProjectList["+ i +"].ProjectOwnerPhoneNum"));
			project.setStatus(_ctx.integerValue("GetProjectResponse.Data.ProjectList["+ i +"].Status"));
			project.setUserId(_ctx.stringValue("GetProjectResponse.Data.ProjectList["+ i +"].UserId"));

			projectList.add(project);
		}
		data.setProjectList(projectList);
		getProjectResponse.setData(data);
	 
	 	return getProjectResponse;
	}
}