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

import com.aliyuncs.resourcemanager.model.v20200331.CreateRoleResponse;
import com.aliyuncs.resourcemanager.model.v20200331.CreateRoleResponse.Role;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRoleResponseUnmarshaller {

	public static CreateRoleResponse unmarshall(CreateRoleResponse createRoleResponse, UnmarshallerContext _ctx) {
		
		createRoleResponse.setRequestId(_ctx.stringValue("CreateRoleResponse.RequestId"));

		Role role = new Role();
		role.setArn(_ctx.stringValue("CreateRoleResponse.Role.Arn"));
		role.setAssumeRolePolicyDocument(_ctx.stringValue("CreateRoleResponse.Role.AssumeRolePolicyDocument"));
		role.setRolePrincipalName(_ctx.stringValue("CreateRoleResponse.Role.RolePrincipalName"));
		role.setCreateDate(_ctx.stringValue("CreateRoleResponse.Role.CreateDate"));
		role.setDescription(_ctx.stringValue("CreateRoleResponse.Role.Description"));
		role.setRoleId(_ctx.stringValue("CreateRoleResponse.Role.RoleId"));
		role.setRoleName(_ctx.stringValue("CreateRoleResponse.Role.RoleName"));
		role.setMaxSessionDuration(_ctx.longValue("CreateRoleResponse.Role.MaxSessionDuration"));
		createRoleResponse.setRole(role);
	 
	 	return createRoleResponse;
	}
}