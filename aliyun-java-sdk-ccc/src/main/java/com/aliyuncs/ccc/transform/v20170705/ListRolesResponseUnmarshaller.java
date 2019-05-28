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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.ListRolesResponse;
import com.aliyuncs.ccc.model.v20170705.ListRolesResponse.Role;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRolesResponseUnmarshaller {

	public static ListRolesResponse unmarshall(ListRolesResponse listRolesResponse, UnmarshallerContext context) {
		
		listRolesResponse.setRequestId(context.stringValue("ListRolesResponse.RequestId"));
		listRolesResponse.setSuccess(context.booleanValue("ListRolesResponse.Success"));
		listRolesResponse.setCode(context.stringValue("ListRolesResponse.Code"));
		listRolesResponse.setMessage(context.stringValue("ListRolesResponse.Message"));
		listRolesResponse.setHttpStatusCode(context.integerValue("ListRolesResponse.HttpStatusCode"));

		List<Role> roles = new ArrayList<Role>();
		for (int i = 0; i < context.lengthValue("ListRolesResponse.Roles.Length"); i++) {
			Role role = new Role();
			role.setRoleId(context.stringValue("ListRolesResponse.Roles["+ i +"].RoleId"));
			role.setInstanceId(context.stringValue("ListRolesResponse.Roles["+ i +"].InstanceId"));
			role.setRoleName(context.stringValue("ListRolesResponse.Roles["+ i +"].RoleName"));
			role.setRoleDescription(context.stringValue("ListRolesResponse.Roles["+ i +"].RoleDescription"));

			roles.add(role);
		}
		listRolesResponse.setRoles(roles);
	 
	 	return listRolesResponse;
	}
}