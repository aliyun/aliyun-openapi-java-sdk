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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ram.model.v20150501.ListRolesResponse;
import com.aliyuncs.ram.model.v20150501.ListRolesResponse.Role;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRolesResponseUnmarshaller {

	public static ListRolesResponse unmarshall(ListRolesResponse listRolesResponse, UnmarshallerContext _ctx) {
		
		listRolesResponse.setRequestId(_ctx.stringValue("ListRolesResponse.RequestId"));
		listRolesResponse.setIsTruncated(_ctx.booleanValue("ListRolesResponse.IsTruncated"));
		listRolesResponse.setMarker(_ctx.stringValue("ListRolesResponse.Marker"));

		List<Role> roles = new ArrayList<Role>();
		for (int i = 0; i < _ctx.lengthValue("ListRolesResponse.Roles.Length"); i++) {
			Role role = new Role();
			role.setDescription(_ctx.stringValue("ListRolesResponse.Roles["+ i +"].Description"));
			role.setUpdateDate(_ctx.stringValue("ListRolesResponse.Roles["+ i +"].UpdateDate"));
			role.setMaxSessionDuration(_ctx.longValue("ListRolesResponse.Roles["+ i +"].MaxSessionDuration"));
			role.setRoleName(_ctx.stringValue("ListRolesResponse.Roles["+ i +"].RoleName"));
			role.setCreateDate(_ctx.stringValue("ListRolesResponse.Roles["+ i +"].CreateDate"));
			role.setRoleId(_ctx.stringValue("ListRolesResponse.Roles["+ i +"].RoleId"));
			role.setArn(_ctx.stringValue("ListRolesResponse.Roles["+ i +"].Arn"));

			roles.add(role);
		}
		listRolesResponse.setRoles(roles);
	 
	 	return listRolesResponse;
	}
}