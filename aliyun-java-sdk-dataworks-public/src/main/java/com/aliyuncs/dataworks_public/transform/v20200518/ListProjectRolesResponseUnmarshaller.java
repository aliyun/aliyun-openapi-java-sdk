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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListProjectRolesResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListProjectRolesResponse.Role;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectRolesResponseUnmarshaller {

	public static ListProjectRolesResponse unmarshall(ListProjectRolesResponse listProjectRolesResponse, UnmarshallerContext _ctx) {
		
		listProjectRolesResponse.setRequestId(_ctx.stringValue("ListProjectRolesResponse.RequestId"));

		List<Role> projectRoleList = new ArrayList<Role>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectRolesResponse.ProjectRoleList.Length"); i++) {
			Role role = new Role();
			role.setProjectRoleId(_ctx.integerValue("ListProjectRolesResponse.ProjectRoleList["+ i +"].ProjectRoleId"));
			role.setProjectRoleType(_ctx.stringValue("ListProjectRolesResponse.ProjectRoleList["+ i +"].ProjectRoleType"));
			role.setProjectRoleName(_ctx.stringValue("ListProjectRolesResponse.ProjectRoleList["+ i +"].ProjectRoleName"));
			role.setProjectRoleCode(_ctx.stringValue("ListProjectRolesResponse.ProjectRoleList["+ i +"].ProjectRoleCode"));

			projectRoleList.add(role);
		}
		listProjectRolesResponse.setProjectRoleList(projectRoleList);
	 
	 	return listProjectRolesResponse;
	}
}