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

import com.aliyuncs.cloudcallcenter.model.v20170705.AssignPrivilegesToRoleResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.AssignPrivilegesToRoleResponse.Role;
import com.aliyuncs.cloudcallcenter.model.v20170705.AssignPrivilegesToRoleResponse.Role.Privilege;
import com.aliyuncs.transform.UnmarshallerContext;


public class AssignPrivilegesToRoleResponseUnmarshaller {

	public static AssignPrivilegesToRoleResponse unmarshall(AssignPrivilegesToRoleResponse assignPrivilegesToRoleResponse, UnmarshallerContext context) {
		
		assignPrivilegesToRoleResponse.setRequestId(context.stringValue("AssignPrivilegesToRoleResponse.RequestId"));
		assignPrivilegesToRoleResponse.setSuccess(context.booleanValue("AssignPrivilegesToRoleResponse.Success"));
		assignPrivilegesToRoleResponse.setCode(context.stringValue("AssignPrivilegesToRoleResponse.Code"));
		assignPrivilegesToRoleResponse.setMessage(context.stringValue("AssignPrivilegesToRoleResponse.Message"));
		assignPrivilegesToRoleResponse.setHttpStatusCode(context.integerValue("AssignPrivilegesToRoleResponse.HttpStatusCode"));

		Role role = new Role();
		role.setRoleId(context.stringValue("AssignPrivilegesToRoleResponse.Role.RoleId"));
		role.setInstanceId(context.stringValue("AssignPrivilegesToRoleResponse.Role.InstanceId"));
		role.setRoleName(context.stringValue("AssignPrivilegesToRoleResponse.Role.RoleName"));
		role.setRoleDescription(context.stringValue("AssignPrivilegesToRoleResponse.Role.RoleDescription"));

		List<Privilege> privileges = new ArrayList<Privilege>();
		for (int i = 0; i < context.lengthValue("AssignPrivilegesToRoleResponse.Role.Privileges.Length"); i++) {
			Privilege privilege = new Privilege();
			privilege.setPrivilegeId(context.stringValue("AssignPrivilegesToRoleResponse.Role.Privileges["+ i +"].PrivilegeId"));
			privilege.setPrivilegeName(context.stringValue("AssignPrivilegesToRoleResponse.Role.Privileges["+ i +"].PrivilegeName"));
			privilege.setPrivilegeDescription(context.stringValue("AssignPrivilegesToRoleResponse.Role.Privileges["+ i +"].PrivilegeDescription"));

			privileges.add(privilege);
		}
		role.setPrivileges(privileges);
		assignPrivilegesToRoleResponse.setRole(role);
	 
	 	return assignPrivilegesToRoleResponse;
	}
}