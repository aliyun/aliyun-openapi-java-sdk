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

package com.aliyuncs.resourcemanager.transform.v20200331;

import com.aliyuncs.resourcemanager.model.v20200331.CreateServiceLinkedRoleResponse;
import com.aliyuncs.resourcemanager.model.v20200331.CreateServiceLinkedRoleResponse.Role;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateServiceLinkedRoleResponseUnmarshaller {

	public static CreateServiceLinkedRoleResponse unmarshall(CreateServiceLinkedRoleResponse createServiceLinkedRoleResponse, UnmarshallerContext _ctx) {
		
		createServiceLinkedRoleResponse.setRequestId(_ctx.stringValue("CreateServiceLinkedRoleResponse.RequestId"));

		Role role = new Role();
		role.setArn(_ctx.stringValue("CreateServiceLinkedRoleResponse.Role.Arn"));
		role.setAssumeRolePolicyDocument(_ctx.stringValue("CreateServiceLinkedRoleResponse.Role.AssumeRolePolicyDocument"));
		role.setRolePrincipalName(_ctx.stringValue("CreateServiceLinkedRoleResponse.Role.RolePrincipalName"));
		role.setCreateDate(_ctx.stringValue("CreateServiceLinkedRoleResponse.Role.CreateDate"));
		role.setDescription(_ctx.stringValue("CreateServiceLinkedRoleResponse.Role.Description"));
		role.setRoleId(_ctx.stringValue("CreateServiceLinkedRoleResponse.Role.RoleId"));
		role.setRoleName(_ctx.stringValue("CreateServiceLinkedRoleResponse.Role.RoleName"));
		role.setIsServiceLinkedRole(_ctx.booleanValue("CreateServiceLinkedRoleResponse.Role.IsServiceLinkedRole"));
		createServiceLinkedRoleResponse.setRole(role);
	 
	 	return createServiceLinkedRoleResponse;
	}
}