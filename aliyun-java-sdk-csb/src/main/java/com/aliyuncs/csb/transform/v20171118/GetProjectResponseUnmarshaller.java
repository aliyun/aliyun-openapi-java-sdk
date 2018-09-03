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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectResponseUnmarshaller {

	public static GetProjectResponse unmarshall(GetProjectResponse getProjectResponse, UnmarshallerContext context) {
		
		getProjectResponse.setRequestId(context.stringValue("GetProjectResponse.RequestId"));
		getProjectResponse.setCode(context.integerValue("GetProjectResponse.Code"));
		getProjectResponse.setMessage(context.stringValue("GetProjectResponse.Message"));

		Data data = new Data();

		List<Project> projectList = new ArrayList<Project>();
		for (int i = 0; i < context.lengthValue("GetProjectResponse.Data.ProjectList.Length"); i++) {
			Project project = new Project();
			project.setApiNum(context.integerValue("GetProjectResponse.Data.ProjectList["+ i +"].ApiNum"));
			project.setCsbId(context.longValue("GetProjectResponse.Data.ProjectList["+ i +"].CsbId"));
			project.setDeleteFlag(context.integerValue("GetProjectResponse.Data.ProjectList["+ i +"].DeleteFlag"));
			project.setDescription(context.stringValue("GetProjectResponse.Data.ProjectList["+ i +"].Description"));
			project.setGmtCreate(context.longValue("GetProjectResponse.Data.ProjectList["+ i +"].GmtCreate"));
			project.setGmtModified(context.longValue("GetProjectResponse.Data.ProjectList["+ i +"].GmtModified"));
			project.setId(context.longValue("GetProjectResponse.Data.ProjectList["+ i +"].Id"));
			project.setInterfaceJarLocation(context.stringValue("GetProjectResponse.Data.ProjectList["+ i +"].InterfaceJarLocation"));
			project.setInterfaceJarName(context.stringValue("GetProjectResponse.Data.ProjectList["+ i +"].InterfaceJarName"));
			project.setJarFileKey(context.stringValue("GetProjectResponse.Data.ProjectList["+ i +"].JarFileKey"));
			project.setOwnerId(context.stringValue("GetProjectResponse.Data.ProjectList["+ i +"].OwnerId"));
			project.setProjectName(context.stringValue("GetProjectResponse.Data.ProjectList["+ i +"].ProjectName"));
			project.setProjectOwnerEmail(context.stringValue("GetProjectResponse.Data.ProjectList["+ i +"].ProjectOwnerEmail"));
			project.setProjectOwnerName(context.stringValue("GetProjectResponse.Data.ProjectList["+ i +"].ProjectOwnerName"));
			project.setProjectOwnerPhoneNum(context.stringValue("GetProjectResponse.Data.ProjectList["+ i +"].ProjectOwnerPhoneNum"));
			project.setStatus(context.integerValue("GetProjectResponse.Data.ProjectList["+ i +"].Status"));
			project.setUserId(context.stringValue("GetProjectResponse.Data.ProjectList["+ i +"].UserId"));

			projectList.add(project);
		}
		data.setProjectList(projectList);
		getProjectResponse.setData(data);
	 
	 	return getProjectResponse;
	}
}