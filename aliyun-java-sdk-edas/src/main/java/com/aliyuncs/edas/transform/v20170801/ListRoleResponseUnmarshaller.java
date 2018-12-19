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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRoleResponseUnmarshaller {

	public static ListRoleResponse unmarshall(ListRoleResponse listRoleResponse, UnmarshallerContext context) {
		
		listRoleResponse.setRequestId(context.stringValue("ListRoleResponse.RequestId"));
		listRoleResponse.setCode(context.integerValue("ListRoleResponse.Code"));
		listRoleResponse.setMessage(context.stringValue("ListRoleResponse.Message"));

		List<RoleItem> roleList = new ArrayList<RoleItem>();
		for (int i = 0; i < context.lengthValue("ListRoleResponse.RoleList.Length"); i++) {
			RoleItem roleItem = new RoleItem();

			Role role = new Role();
			role.setId(context.integerValue("ListRoleResponse.RoleList["+ i +"].Role.Id"));
			role.setAdminUserId(context.stringValue("ListRoleResponse.RoleList["+ i +"].Role.AdminUserId"));
			role.setName(context.stringValue("ListRoleResponse.RoleList["+ i +"].Role.Name"));
			role.setCreateTime(context.longValue("ListRoleResponse.RoleList["+ i +"].Role.CreateTime"));
			role.setUpdateTime(context.longValue("ListRoleResponse.RoleList["+ i +"].Role.UpdateTime"));
			role.setIsDefault(context.booleanValue("ListRoleResponse.RoleList["+ i +"].Role.IsDefault"));
			roleItem.setRole(role);

			List<Action> actionList = new ArrayList<Action>();
			for (int j = 0; j < context.lengthValue("ListRoleResponse.RoleList["+ i +"].ActionList.Length"); j++) {
				Action action = new Action();
				action.setGroupId(context.stringValue("ListRoleResponse.RoleList["+ i +"].ActionList["+ j +"].GroupId"));
				action.setCode(context.stringValue("ListRoleResponse.RoleList["+ i +"].ActionList["+ j +"].Code"));
				action.setName(context.stringValue("ListRoleResponse.RoleList["+ i +"].ActionList["+ j +"].Name"));
				action.setDescription(context.stringValue("ListRoleResponse.RoleList["+ i +"].ActionList["+ j +"].Description"));

				actionList.add(action);
			}
			roleItem.setActionList(actionList);

			roleList.add(roleItem);
		}
		listRoleResponse.setRoleList(roleList);
	 
	 	return listRoleResponse;
	}
}