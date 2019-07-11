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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListRoleResponse;
import com.aliyuncs.edas.model.v20170801.ListRoleResponse.RoleItem;
import com.aliyuncs.edas.model.v20170801.ListRoleResponse.RoleItem.Action;
import com.aliyuncs.edas.model.v20170801.ListRoleResponse.RoleItem.Role;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRoleResponseUnmarshaller {

	public static ListRoleResponse unmarshall(ListRoleResponse listRoleResponse, UnmarshallerContext _ctx) {
		
		listRoleResponse.setRequestId(_ctx.stringValue("ListRoleResponse.RequestId"));
		listRoleResponse.setCode(_ctx.integerValue("ListRoleResponse.Code"));
		listRoleResponse.setMessage(_ctx.stringValue("ListRoleResponse.Message"));

		List<RoleItem> roleList = new ArrayList<RoleItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRoleResponse.RoleList.Length"); i++) {
			RoleItem roleItem = new RoleItem();

			Role role = new Role();
			role.setId(_ctx.integerValue("ListRoleResponse.RoleList["+ i +"].Role.Id"));
			role.setAdminUserId(_ctx.stringValue("ListRoleResponse.RoleList["+ i +"].Role.AdminUserId"));
			role.setName(_ctx.stringValue("ListRoleResponse.RoleList["+ i +"].Role.Name"));
			role.setCreateTime(_ctx.longValue("ListRoleResponse.RoleList["+ i +"].Role.CreateTime"));
			role.setUpdateTime(_ctx.longValue("ListRoleResponse.RoleList["+ i +"].Role.UpdateTime"));
			role.setIsDefault(_ctx.booleanValue("ListRoleResponse.RoleList["+ i +"].Role.IsDefault"));
			roleItem.setRole(role);

			List<Action> actionList = new ArrayList<Action>();
			for (int j = 0; j < _ctx.lengthValue("ListRoleResponse.RoleList["+ i +"].ActionList.Length"); j++) {
				Action action = new Action();
				action.setGroupId(_ctx.stringValue("ListRoleResponse.RoleList["+ i +"].ActionList["+ j +"].GroupId"));
				action.setCode(_ctx.stringValue("ListRoleResponse.RoleList["+ i +"].ActionList["+ j +"].Code"));
				action.setName(_ctx.stringValue("ListRoleResponse.RoleList["+ i +"].ActionList["+ j +"].Name"));
				action.setDescription(_ctx.stringValue("ListRoleResponse.RoleList["+ i +"].ActionList["+ j +"].Description"));

				actionList.add(action);
			}
			roleItem.setActionList(actionList);

			roleList.add(roleItem);
		}
		listRoleResponse.setRoleList(roleList);
	 
	 	return listRoleResponse;
	}
}