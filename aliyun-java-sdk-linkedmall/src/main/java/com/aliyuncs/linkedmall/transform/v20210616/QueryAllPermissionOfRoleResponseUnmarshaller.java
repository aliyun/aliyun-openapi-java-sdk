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

package com.aliyuncs.linkedmall.transform.v20210616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20210616.QueryAllPermissionOfRoleResponse;
import com.aliyuncs.linkedmall.model.v20210616.QueryAllPermissionOfRoleResponse.Permission;
import com.aliyuncs.linkedmall.model.v20210616.QueryAllPermissionOfRoleResponse.Permission.PermissionItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAllPermissionOfRoleResponseUnmarshaller {

	public static QueryAllPermissionOfRoleResponse unmarshall(QueryAllPermissionOfRoleResponse queryAllPermissionOfRoleResponse, UnmarshallerContext _ctx) {
		
		queryAllPermissionOfRoleResponse.setRequestId(_ctx.stringValue("QueryAllPermissionOfRoleResponse.RequestId"));
		queryAllPermissionOfRoleResponse.setCode(_ctx.stringValue("QueryAllPermissionOfRoleResponse.Code"));
		queryAllPermissionOfRoleResponse.setMessage(_ctx.stringValue("QueryAllPermissionOfRoleResponse.Message"));

		List<Permission> permissionList = new ArrayList<Permission>();
		for (int i = 0; i < _ctx.lengthValue("QueryAllPermissionOfRoleResponse.PermissionList.Length"); i++) {
			Permission permission = new Permission();
			permission.setPermissionId(_ctx.stringValue("QueryAllPermissionOfRoleResponse.PermissionList["+ i +"].PermissionId"));
			permission.setName(_ctx.stringValue("QueryAllPermissionOfRoleResponse.PermissionList["+ i +"].Name"));
			permission.setCode(_ctx.stringValue("QueryAllPermissionOfRoleResponse.PermissionList["+ i +"].Code"));
			permission.setDescription(_ctx.stringValue("QueryAllPermissionOfRoleResponse.PermissionList["+ i +"].Description"));

			List<PermissionItem> permissionItemList = new ArrayList<PermissionItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryAllPermissionOfRoleResponse.PermissionList["+ i +"].PermissionItemList.Length"); j++) {
				PermissionItem permissionItem = new PermissionItem();
				permissionItem.setPermissionItemId(_ctx.stringValue("QueryAllPermissionOfRoleResponse.PermissionList["+ i +"].PermissionItemList["+ j +"].PermissionItemId"));
				permissionItem.setActionType(_ctx.stringValue("QueryAllPermissionOfRoleResponse.PermissionList["+ i +"].PermissionItemList["+ j +"].ActionType"));
				permissionItem.setPermissionType(_ctx.stringValue("QueryAllPermissionOfRoleResponse.PermissionList["+ i +"].PermissionItemList["+ j +"].PermissionType"));

				permissionItemList.add(permissionItem);
			}
			permission.setPermissionItemList(permissionItemList);

			permissionList.add(permission);
		}
		queryAllPermissionOfRoleResponse.setPermissionList(permissionList);
	 
	 	return queryAllPermissionOfRoleResponse;
	}
}