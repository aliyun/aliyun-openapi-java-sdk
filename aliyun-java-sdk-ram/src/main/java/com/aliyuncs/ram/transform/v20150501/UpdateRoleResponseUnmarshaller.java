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

import com.aliyuncs.ram.model.v20150501.UpdateRoleResponse;
import com.aliyuncs.ram.model.v20150501.UpdateRoleResponse.Role;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateRoleResponseUnmarshaller {

	public static UpdateRoleResponse unmarshall(UpdateRoleResponse updateRoleResponse, UnmarshallerContext _ctx) {
		
		updateRoleResponse.setRequestId(_ctx.stringValue("UpdateRoleResponse.RequestId"));

		Role role = new Role();
		role.setRoleId(_ctx.stringValue("UpdateRoleResponse.Role.RoleId"));
		role.setRoleName(_ctx.stringValue("UpdateRoleResponse.Role.RoleName"));
		role.setArn(_ctx.stringValue("UpdateRoleResponse.Role.Arn"));
		role.setDescription(_ctx.stringValue("UpdateRoleResponse.Role.Description"));
		role.setAssumeRolePolicyDocument(_ctx.stringValue("UpdateRoleResponse.Role.AssumeRolePolicyDocument"));
		role.setCreateDate(_ctx.stringValue("UpdateRoleResponse.Role.CreateDate"));
		role.setUpdateDate(_ctx.stringValue("UpdateRoleResponse.Role.UpdateDate"));
		role.setMaxSessionDuration(_ctx.longValue("UpdateRoleResponse.Role.MaxSessionDuration"));
		updateRoleResponse.setRole(role);
	 
	 	return updateRoleResponse;
	}
}