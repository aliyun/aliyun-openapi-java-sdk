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

import com.aliyuncs.ram.model.v20150501.GetRoleResponse;
import com.aliyuncs.ram.model.v20150501.GetRoleResponse.Role;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRoleResponseUnmarshaller {

	public static GetRoleResponse unmarshall(GetRoleResponse getRoleResponse, UnmarshallerContext _ctx) {
		
		getRoleResponse.setRequestId(_ctx.stringValue("GetRoleResponse.RequestId"));

		Role role = new Role();
		role.setRoleId(_ctx.stringValue("GetRoleResponse.Role.RoleId"));
		role.setRoleName(_ctx.stringValue("GetRoleResponse.Role.RoleName"));
		role.setArn(_ctx.stringValue("GetRoleResponse.Role.Arn"));
		role.setDescription(_ctx.stringValue("GetRoleResponse.Role.Description"));
		role.setAssumeRolePolicyDocument(_ctx.stringValue("GetRoleResponse.Role.AssumeRolePolicyDocument"));
		role.setCreateDate(_ctx.stringValue("GetRoleResponse.Role.CreateDate"));
		role.setUpdateDate(_ctx.stringValue("GetRoleResponse.Role.UpdateDate"));
		role.setMaxSessionDuration(_ctx.longValue("GetRoleResponse.Role.MaxSessionDuration"));
		getRoleResponse.setRole(role);
	 
	 	return getRoleResponse;
	}
}