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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.CreateRoleResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.CreateRoleResponse.Role;
import com.aliyuncs.cloudcallcenter.model.v20170705.CreateRoleResponse.Role.Privilege;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRoleResponseUnmarshaller {

	public static CreateRoleResponse unmarshall(CreateRoleResponse createRoleResponse, UnmarshallerContext context) {
		
		createRoleResponse.setRequestId(context.stringValue("CreateRoleResponse.RequestId"));
		createRoleResponse.setSuccess(context.booleanValue("CreateRoleResponse.Success"));
		createRoleResponse.setCode(context.stringValue("CreateRoleResponse.Code"));
		createRoleResponse.setMessage(context.stringValue("CreateRoleResponse.Message"));
		createRoleResponse.setHttpStatusCode(context.integerValue("CreateRoleResponse.HttpStatusCode"));

		Role role = new Role();
		role.setRoleId(context.stringValue("CreateRoleResponse.Role.RoleId"));
		role.setInstanceId(context.stringValue("CreateRoleResponse.Role.InstanceId"));
		role.setRoleName(context.stringValue("CreateRoleResponse.Role.RoleName"));
		role.setRoleDescription(context.stringValue("CreateRoleResponse.Role.RoleDescription"));
		role.setUserCount(context.integerValue("CreateRoleResponse.Role.UserCount"));

		List<Privilege> privileges = new ArrayList<Privilege>();
		for (int i = 0; i < context.lengthValue("CreateRoleResponse.Role.Privileges.Length"); i++) {
			Privilege privilege = new Privilege();
			privilege.setPrivilegeId(context.stringValue("CreateRoleResponse.Role.Privileges["+ i +"].PrivilegeId"));
			privilege.setPrivilegeName(context.stringValue("CreateRoleResponse.Role.Privileges["+ i +"].PrivilegeName"));
			privilege.setPrivilegeDescription(context.stringValue("CreateRoleResponse.Role.Privileges["+ i +"].PrivilegeDescription"));

			privileges.add(privilege);
		}
		role.setPrivileges(privileges);
		createRoleResponse.setRole(role);
	 
	 	return createRoleResponse;
	}
}