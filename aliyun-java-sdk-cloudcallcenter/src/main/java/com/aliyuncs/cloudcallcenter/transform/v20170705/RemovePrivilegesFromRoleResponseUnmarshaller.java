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

import com.aliyuncs.cloudcallcenter.model.v20170705.RemovePrivilegesFromRoleResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.RemovePrivilegesFromRoleResponse.Role;
import com.aliyuncs.cloudcallcenter.model.v20170705.RemovePrivilegesFromRoleResponse.Role.Privilege;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemovePrivilegesFromRoleResponseUnmarshaller {

	public static RemovePrivilegesFromRoleResponse unmarshall(RemovePrivilegesFromRoleResponse removePrivilegesFromRoleResponse, UnmarshallerContext context) {
		
		removePrivilegesFromRoleResponse.setRequestId(context.stringValue("RemovePrivilegesFromRoleResponse.RequestId"));
		removePrivilegesFromRoleResponse.setSuccess(context.booleanValue("RemovePrivilegesFromRoleResponse.Success"));
		removePrivilegesFromRoleResponse.setCode(context.stringValue("RemovePrivilegesFromRoleResponse.Code"));
		removePrivilegesFromRoleResponse.setMessage(context.stringValue("RemovePrivilegesFromRoleResponse.Message"));
		removePrivilegesFromRoleResponse.setHttpStatusCode(context.integerValue("RemovePrivilegesFromRoleResponse.HttpStatusCode"));

		Role role = new Role();
		role.setRoleId(context.stringValue("RemovePrivilegesFromRoleResponse.Role.RoleId"));
		role.setInstanceId(context.stringValue("RemovePrivilegesFromRoleResponse.Role.InstanceId"));
		role.setRoleName(context.stringValue("RemovePrivilegesFromRoleResponse.Role.RoleName"));
		role.setRoleDescription(context.stringValue("RemovePrivilegesFromRoleResponse.Role.RoleDescription"));
		role.setUserCount(context.integerValue("RemovePrivilegesFromRoleResponse.Role.UserCount"));

		List<Privilege> privileges = new ArrayList<Privilege>();
		for (int i = 0; i < context.lengthValue("RemovePrivilegesFromRoleResponse.Role.Privileges.Length"); i++) {
			Privilege privilege = new Privilege();
			privilege.setPrivilegeId(context.stringValue("RemovePrivilegesFromRoleResponse.Role.Privileges["+ i +"].PrivilegeId"));
			privilege.setPrivilegeName(context.stringValue("RemovePrivilegesFromRoleResponse.Role.Privileges["+ i +"].PrivilegeName"));
			privilege.setPrivilegeDescription(context.stringValue("RemovePrivilegesFromRoleResponse.Role.Privileges["+ i +"].PrivilegeDescription"));

			privileges.add(privilege);
		}
		role.setPrivileges(privileges);
		removePrivilegesFromRoleResponse.setRole(role);
	 
	 	return removePrivilegesFromRoleResponse;
	}
}