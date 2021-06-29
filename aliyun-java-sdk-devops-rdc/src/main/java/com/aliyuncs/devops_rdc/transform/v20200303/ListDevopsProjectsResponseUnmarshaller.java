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

package com.aliyuncs.devops_rdc.transform.v20200303;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops_rdc.model.v20200303.ListDevopsProjectsResponse;
import com.aliyuncs.devops_rdc.model.v20200303.ListDevopsProjectsResponse.Object;
import com.aliyuncs.devops_rdc.model.v20200303.ListDevopsProjectsResponse.Object.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDevopsProjectsResponseUnmarshaller {

	public static ListDevopsProjectsResponse unmarshall(ListDevopsProjectsResponse listDevopsProjectsResponse, UnmarshallerContext _ctx) {
		
		listDevopsProjectsResponse.setRequestId(_ctx.stringValue("ListDevopsProjectsResponse.RequestId"));
		listDevopsProjectsResponse.setErrorMsg(_ctx.stringValue("ListDevopsProjectsResponse.ErrorMsg"));
		listDevopsProjectsResponse.setSuccessful(_ctx.booleanValue("ListDevopsProjectsResponse.Successful"));
		listDevopsProjectsResponse.setErrorCode(_ctx.stringValue("ListDevopsProjectsResponse.ErrorCode"));

		Object object = new Object();
		object.setNextPageToken(_ctx.stringValue("ListDevopsProjectsResponse.Object.NextPageToken"));

		List<Project> result = new ArrayList<Project>();
		for (int i = 0; i < _ctx.lengthValue("ListDevopsProjectsResponse.Object.Result.Length"); i++) {
			Project project = new Project();
			project.setLogo(_ctx.stringValue("ListDevopsProjectsResponse.Object.Result["+ i +"].Logo"));
			project.setIsStar(_ctx.booleanValue("ListDevopsProjectsResponse.Object.Result["+ i +"].IsStar"));
			project.setCreatorId(_ctx.stringValue("ListDevopsProjectsResponse.Object.Result["+ i +"].CreatorId"));
			project.setMembersCount(_ctx.integerValue("ListDevopsProjectsResponse.Object.Result["+ i +"].MembersCount"));
			project.setOrganizationId(_ctx.stringValue("ListDevopsProjectsResponse.Object.Result["+ i +"].OrganizationId"));
			project.setVisibility(_ctx.stringValue("ListDevopsProjectsResponse.Object.Result["+ i +"].Visibility"));
			project.setIsTemplate(_ctx.booleanValue("ListDevopsProjectsResponse.Object.Result["+ i +"].IsTemplate"));
			project.setDescription(_ctx.stringValue("ListDevopsProjectsResponse.Object.Result["+ i +"].Description"));
			project.setUpdated(_ctx.stringValue("ListDevopsProjectsResponse.Object.Result["+ i +"].Updated"));
			project.setCreated(_ctx.stringValue("ListDevopsProjectsResponse.Object.Result["+ i +"].Created"));
			project.setIsArchived(_ctx.booleanValue("ListDevopsProjectsResponse.Object.Result["+ i +"].IsArchived"));
			project.setName(_ctx.stringValue("ListDevopsProjectsResponse.Object.Result["+ i +"].Name"));
			project.setIsPublic(_ctx.booleanValue("ListDevopsProjectsResponse.Object.Result["+ i +"].IsPublic"));
			project.setTasksCount(_ctx.integerValue("ListDevopsProjectsResponse.Object.Result["+ i +"].TasksCount"));
			project.setRoleId(_ctx.stringValue("ListDevopsProjectsResponse.Object.Result["+ i +"].RoleId"));
			project.setId(_ctx.stringValue("ListDevopsProjectsResponse.Object.Result["+ i +"].Id"));

			result.add(project);
		}
		object.setResult(result);
		listDevopsProjectsResponse.setObject(object);
	 
	 	return listDevopsProjectsResponse;
	}
}