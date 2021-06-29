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

import com.aliyuncs.linkedmall.model.v20210616.QueryPermissionsResponse;
import com.aliyuncs.linkedmall.model.v20210616.QueryPermissionsResponse.Permission;
import com.aliyuncs.linkedmall.model.v20210616.QueryPermissionsResponse.PermissionItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPermissionsResponseUnmarshaller {

	public static QueryPermissionsResponse unmarshall(QueryPermissionsResponse queryPermissionsResponse, UnmarshallerContext _ctx) {
		
		queryPermissionsResponse.setRequestId(_ctx.stringValue("QueryPermissionsResponse.RequestId"));
		queryPermissionsResponse.setCode(_ctx.stringValue("QueryPermissionsResponse.Code"));
		queryPermissionsResponse.setMessage(_ctx.stringValue("QueryPermissionsResponse.Message"));

		List<Permission> permissionList = new ArrayList<Permission>();
		for (int i = 0; i < _ctx.lengthValue("QueryPermissionsResponse.PermissionList.Length"); i++) {
			Permission permission = new Permission();
			permission.setPermissionId(_ctx.stringValue("QueryPermissionsResponse.PermissionList["+ i +"].PermissionId"));
			permission.setName(_ctx.stringValue("QueryPermissionsResponse.PermissionList["+ i +"].Name"));
			permission.setCode(_ctx.stringValue("QueryPermissionsResponse.PermissionList["+ i +"].Code"));
			permission.setDescription(_ctx.stringValue("QueryPermissionsResponse.PermissionList["+ i +"].Description"));

			permissionList.add(permission);
		}
		queryPermissionsResponse.setPermissionList(permissionList);

		List<PermissionItem> permissionItemList = new ArrayList<PermissionItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryPermissionsResponse.PermissionItemList.Length"); i++) {
			PermissionItem permissionItem = new PermissionItem();
			permissionItem.setPermissionItemId(_ctx.stringValue("QueryPermissionsResponse.PermissionItemList["+ i +"].PermissionItemId"));
			permissionItem.setActionType(_ctx.stringValue("QueryPermissionsResponse.PermissionItemList["+ i +"].ActionType"));
			permissionItem.setPermissionType(_ctx.stringValue("QueryPermissionsResponse.PermissionItemList["+ i +"].PermissionType"));

			permissionItemList.add(permissionItem);
		}
		queryPermissionsResponse.setPermissionItemList(permissionItemList);
	 
	 	return queryPermissionsResponse;
	}
}