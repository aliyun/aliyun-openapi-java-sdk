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

	public static FindProjectListResponse unmarshall(FindProjectListResponse findProjectListResponse, UnmarshallerContext context) {
		
		findProjectListResponse.setRequestId(context.stringValue("FindProjectListResponse.RequestId"));
		findProjectListResponse.setCode(context.integerValue("FindProjectListResponse.Code"));
		findProjectListResponse.setMessage(context.stringValue("FindProjectListResponse.Message"));

		Data data = new Data();
		data.setCurrentPage(context.integerValue("FindProjectListResponse.Data.CurrentPage"));
		data.setPageNumber(context.integerValue("FindProjectListResponse.Data.PageNumber"));
		data.setTotal(context.integerValue("FindProjectListResponse.Data.Total"));

		List<Project> projectList = new ArrayList<Project>();
		for (int i = 0; i < context.lengthValue("FindProjectListResponse.Data.ProjectList.Length"); i++) {
			Project project = new Project();
			project.setApiNum(context.integerValue("FindProjectListResponse.Data.ProjectList["+ i +"].ApiNum"));
			project.setCsbId(context.longValue("FindProjectListResponse.Data.ProjectList["+ i +"].CsbId"));
			project.setDeleteFlag(context.integerValue("FindProjectListResponse.Data.ProjectList["+ i +"].DeleteFlag"));
			project.setDescription(context.stringValue("FindProjectListResponse.Data.ProjectList["+ i +"].Description"));
			project.setGmtCreate(context.longValue("FindProjectListResponse.Data.ProjectList["+ i +"].GmtCreate"));
			project.setGmtModified(context.longValue("FindProjectListResponse.Data.ProjectList["+ i +"].GmtModified"));
			project.setId(context.longValue("FindProjectListResponse.Data.ProjectList["+ i +"].Id"));
			project.setInterfaceJarLocation(context.stringValue("FindProjectListResponse.Data.ProjectList["+ i +"].InterfaceJarLocation"));
			project.setInterfaceJarName(context.stringValue("FindProjectListResponse.Data.ProjectList["+ i +"].InterfaceJarName"));
			project.setJarFileKey(context.stringValue("FindProjectListResponse.Data.ProjectList["+ i +"].JarFileKey"));
			project.setOwnerId(context.stringValue("FindProjectListResponse.Data.ProjectList["+ i +"].OwnerId"));
			project.setProjectName(context.stringValue("FindProjectListResponse.Data.ProjectList["+ i +"].ProjectName"));
			project.setProjectOwnerEmail(context.stringValue("FindProjectListResponse.Data.ProjectList["+ i +"].ProjectOwnerEmail"));
			project.setProjectOwnerName(context.stringValue("FindProjectListResponse.Data.ProjectList["+ i +"].ProjectOwnerName"));
			project.setProjectOwnerPhoneNum(context.stringValue("FindProjectListResponse.Data.ProjectList["+ i +"].ProjectOwnerPhoneNum"));
			project.setStatus(context.integerValue("FindProjectListResponse.Data.ProjectList["+ i +"].Status"));
			project.setUserId(context.stringValue("FindProjectListResponse.Data.ProjectList["+ i +"].UserId"));

			projectList.add(project);
		}
		data.setProjectList(projectList);
		findProjectListResponse.setData(data);
	 
	 	return findProjectListResponse;
	}
}