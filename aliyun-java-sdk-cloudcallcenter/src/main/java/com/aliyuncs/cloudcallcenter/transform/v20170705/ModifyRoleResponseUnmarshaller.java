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

import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyRoleResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyRoleResponse.Role;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyRoleResponse.Role.Privilege;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyRoleResponseUnmarshaller {

	public static ModifyRoleResponse unmarshall(ModifyRoleResponse modifyRoleResponse, UnmarshallerContext context) {
		
		modifyRoleResponse.setRequestId(context.stringValue("ModifyRoleResponse.RequestId"));
		modifyRoleResponse.setSuccess(context.booleanValue("ModifyRoleResponse.Success"));
		modifyRoleResponse.setCode(context.stringValue("ModifyRoleResponse.Code"));
		modifyRoleResponse.setMessage(context.stringValue("ModifyRoleResponse.Message"));
		modifyRoleResponse.setHttpStatusCode(context.integerValue("ModifyRoleResponse.HttpStatusCode"));

		Role role = new Role();
		role.setRoleId(context.stringValue("ModifyRoleResponse.Role.RoleId"));
		role.setInstanceId(context.stringValue("ModifyRoleResponse.Role.InstanceId"));
		role.setRoleName(context.stringValue("ModifyRoleResponse.Role.RoleName"));
		role.setRoleDescription(context.stringValue("ModifyRoleResponse.Role.RoleDescription"));
		role.setUserCount(context.integerValue("ModifyRoleResponse.Role.UserCount"));

		List<Privilege> privileges = new ArrayList<Privilege>();
		for (int i = 0; i < context.lengthValue("ModifyRoleResponse.Role.Privileges.Length"); i++) {
			Privilege privilege = new Privilege();
			privilege.setPrivilegeId(context.stringValue("ModifyRoleResponse.Role.Privileges["+ i +"].PrivilegeId"));
			privilege.setPrivilegeName(context.stringValue("ModifyRoleResponse.Role.Privileges["+ i +"].PrivilegeName"));
			privilege.setPrivilegeDescription(context.stringValue("ModifyRoleResponse.Role.Privileges["+ i +"].PrivilegeDescription"));

			privileges.add(privilege);
		}
		role.setPrivileges(privileges);
		modifyRoleResponse.setRole(role);
	 
	 	return modifyRoleResponse;
	}
}