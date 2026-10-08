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

import com.aliyuncs.dataphin_public.model.v20230630.ListProjectRolesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListProjectRolesResponse.Role;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectRolesResponseUnmarshaller {

	public static ListProjectRolesResponse unmarshall(ListProjectRolesResponse listProjectRolesResponse, UnmarshallerContext _ctx) {
		
		listProjectRolesResponse.setRequestId(_ctx.stringValue("ListProjectRolesResponse.RequestId"));
		listProjectRolesResponse.setMessage(_ctx.stringValue("ListProjectRolesResponse.Message"));
		listProjectRolesResponse.setHttpStatusCode(_ctx.integerValue("ListProjectRolesResponse.HttpStatusCode"));
		listProjectRolesResponse.setCode(_ctx.stringValue("ListProjectRolesResponse.Code"));
		listProjectRolesResponse.setSuccess(_ctx.booleanValue("ListProjectRolesResponse.Success"));

		List<Role> roleList = new ArrayList<Role>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectRolesResponse.RoleList.Length"); i++) {
			Role role = new Role();
			role.setRoleKey(_ctx.stringValue("ListProjectRolesResponse.RoleList["+ i +"].RoleKey"));
			role.setStatus(_ctx.stringValue("ListProjectRolesResponse.RoleList["+ i +"].Status"));
			role.setTenantId(_ctx.longValue("ListProjectRolesResponse.RoleList["+ i +"].TenantId"));
			role.setRoleName(_ctx.stringValue("ListProjectRolesResponse.RoleList["+ i +"].RoleName"));
			role.setGmtCreate(_ctx.stringValue("ListProjectRolesResponse.RoleList["+ i +"].GmtCreate"));
			role.setAuthJson(_ctx.stringValue("ListProjectRolesResponse.RoleList["+ i +"].AuthJson"));
			role.setRoleType(_ctx.stringValue("ListProjectRolesResponse.RoleList["+ i +"].RoleType"));
			role.setProjectType(_ctx.stringValue("ListProjectRolesResponse.RoleList["+ i +"].ProjectType"));
			role.setRoleDesc(_ctx.stringValue("ListProjectRolesResponse.RoleList["+ i +"].RoleDesc"));
			role.setGmtModified(_ctx.stringValue("ListProjectRolesResponse.RoleList["+ i +"].GmtModified"));
			role.setCreator(_ctx.stringValue("ListProjectRolesResponse.RoleList["+ i +"].Creator"));
			role.setModifier(_ctx.stringValue("ListProjectRolesResponse.RoleList["+ i +"].Modifier"));

			roleList.add(role);
		}
		listProjectRolesResponse.setRoleList(roleList);
	 
	 	return listProjectRolesResponse;
	}
}