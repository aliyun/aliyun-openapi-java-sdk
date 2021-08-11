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

package com.aliyuncs.ram.transform.v20150501;

import com.aliyuncs.ram.model.v20150501.CreateRoleResponse;
import com.aliyuncs.ram.model.v20150501.CreateRoleResponse.Role;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRoleResponseUnmarshaller {

	public static CreateRoleResponse unmarshall(CreateRoleResponse createRoleResponse, UnmarshallerContext _ctx) {
		
		createRoleResponse.setRequestId(_ctx.stringValue("CreateRoleResponse.RequestId"));

		Role role = new Role();
		role.setAssumeRolePolicyDocument(_ctx.stringValue("CreateRoleResponse.Role.AssumeRolePolicyDocument"));
		role.setDescription(_ctx.stringValue("CreateRoleResponse.Role.Description"));
		role.setMaxSessionDuration(_ctx.longValue("CreateRoleResponse.Role.MaxSessionDuration"));
		role.setRoleName(_ctx.stringValue("CreateRoleResponse.Role.RoleName"));
		role.setCreateDate(_ctx.stringValue("CreateRoleResponse.Role.CreateDate"));
		role.setRoleId(_ctx.stringValue("CreateRoleResponse.Role.RoleId"));
		role.setArn(_ctx.stringValue("CreateRoleResponse.Role.Arn"));
		createRoleResponse.setRole(role);
	 
	 	return createRoleResponse;
	}
}