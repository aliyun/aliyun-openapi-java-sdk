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

import com.aliyuncs.dataphin_public.model.v20230630.ListTenantRolesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListTenantRolesResponse.Role;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTenantRolesResponseUnmarshaller {

	public static ListTenantRolesResponse unmarshall(ListTenantRolesResponse listTenantRolesResponse, UnmarshallerContext _ctx) {
		
		listTenantRolesResponse.setRequestId(_ctx.stringValue("ListTenantRolesResponse.RequestId"));
		listTenantRolesResponse.setMessage(_ctx.stringValue("ListTenantRolesResponse.Message"));
		listTenantRolesResponse.setHttpStatusCode(_ctx.integerValue("ListTenantRolesResponse.HttpStatusCode"));
		listTenantRolesResponse.setCode(_ctx.stringValue("ListTenantRolesResponse.Code"));
		listTenantRolesResponse.setSuccess(_ctx.booleanValue("ListTenantRolesResponse.Success"));

		List<Role> roleList = new ArrayList<Role>();
		for (int i = 0; i < _ctx.lengthValue("ListTenantRolesResponse.RoleList.Length"); i++) {
			Role role = new Role();
			role.setRoleKey(_ctx.stringValue("ListTenantRolesResponse.RoleList["+ i +"].RoleKey"));
			role.setStatus(_ctx.stringValue("ListTenantRolesResponse.RoleList["+ i +"].Status"));
			role.setTenantId(_ctx.longValue("ListTenantRolesResponse.RoleList["+ i +"].TenantId"));
			role.setRoleName(_ctx.stringValue("ListTenantRolesResponse.RoleList["+ i +"].RoleName"));
			role.setTenantType(_ctx.stringValue("ListTenantRolesResponse.RoleList["+ i +"].TenantType"));
			role.setGmtCreate(_ctx.stringValue("ListTenantRolesResponse.RoleList["+ i +"].GmtCreate"));
			role.setAuthJson(_ctx.stringValue("ListTenantRolesResponse.RoleList["+ i +"].AuthJson"));
			role.setRoleType(_ctx.stringValue("ListTenantRolesResponse.RoleList["+ i +"].RoleType"));
			role.setRoleDesc(_ctx.stringValue("ListTenantRolesResponse.RoleList["+ i +"].RoleDesc"));
			role.setGmtModified(_ctx.stringValue("ListTenantRolesResponse.RoleList["+ i +"].GmtModified"));
			role.setCreator(_ctx.stringValue("ListTenantRolesResponse.RoleList["+ i +"].Creator"));
			role.setModifier(_ctx.stringValue("ListTenantRolesResponse.RoleList["+ i +"].Modifier"));

			roleList.add(role);
		}
		listTenantRolesResponse.setRoleList(roleList);
	 
	 	return listTenantRolesResponse;
	}
}