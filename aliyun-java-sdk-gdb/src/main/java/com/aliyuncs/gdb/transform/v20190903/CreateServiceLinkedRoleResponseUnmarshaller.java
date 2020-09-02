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

package com.aliyuncs.gdb.transform.v20190903;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gdb.model.v20190903.CreateServiceLinkedRoleResponse;
import com.aliyuncs.gdb.model.v20190903.CreateServiceLinkedRoleResponse.RoleItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateServiceLinkedRoleResponseUnmarshaller {

	public static CreateServiceLinkedRoleResponse unmarshall(CreateServiceLinkedRoleResponse createServiceLinkedRoleResponse, UnmarshallerContext _ctx) {
		
		createServiceLinkedRoleResponse.setRequestId(_ctx.stringValue("CreateServiceLinkedRoleResponse.RequestId"));

		List<RoleItem> role = new ArrayList<RoleItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateServiceLinkedRoleResponse.Role.Length"); i++) {
			RoleItem roleItem = new RoleItem();
			roleItem.setRoleName(_ctx.stringValue("CreateServiceLinkedRoleResponse.Role["+ i +"].RoleName"));
			roleItem.setDescription(_ctx.stringValue("CreateServiceLinkedRoleResponse.Role["+ i +"].Description"));
			roleItem.setAssumeRolePolicyDocument(_ctx.stringValue("CreateServiceLinkedRoleResponse.Role["+ i +"].AssumeRolePolicyDocument"));
			roleItem.setArn(_ctx.stringValue("CreateServiceLinkedRoleResponse.Role["+ i +"].Arn"));
			roleItem.setCreateDate(_ctx.stringValue("CreateServiceLinkedRoleResponse.Role["+ i +"].CreateDate"));
			roleItem.setRoleId(_ctx.stringValue("CreateServiceLinkedRoleResponse.Role["+ i +"].RoleId"));
			roleItem.setRolePrincipalName(_ctx.stringValue("CreateServiceLinkedRoleResponse.Role["+ i +"].RolePrincipalName"));
			roleItem.setIsServiceLinkedRole(_ctx.booleanValue("CreateServiceLinkedRoleResponse.Role["+ i +"].IsServiceLinkedRole"));
			roleItem.setLatestDeletionTask(_ctx.booleanValue("CreateServiceLinkedRoleResponse.Role["+ i +"].LatestDeletionTask"));

			role.add(roleItem);
		}
		createServiceLinkedRoleResponse.setRole(role);
	 
	 	return createServiceLinkedRoleResponse;
	}
}