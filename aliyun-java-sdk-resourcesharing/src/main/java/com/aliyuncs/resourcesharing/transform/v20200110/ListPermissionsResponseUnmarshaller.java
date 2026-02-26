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

package com.aliyuncs.resourcesharing.transform.v20200110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcesharing.model.v20200110.ListPermissionsResponse;
import com.aliyuncs.resourcesharing.model.v20200110.ListPermissionsResponse.Permission;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPermissionsResponseUnmarshaller {

	public static ListPermissionsResponse unmarshall(ListPermissionsResponse listPermissionsResponse, UnmarshallerContext _ctx) {
		
		listPermissionsResponse.setRequestId(_ctx.stringValue("ListPermissionsResponse.RequestId"));
		listPermissionsResponse.setNextToken(_ctx.stringValue("ListPermissionsResponse.NextToken"));

		List<Permission> permissions = new ArrayList<Permission>();
		for (int i = 0; i < _ctx.lengthValue("ListPermissionsResponse.Permissions.Length"); i++) {
			Permission permission = new Permission();
			permission.setPermissionName(_ctx.stringValue("ListPermissionsResponse.Permissions["+ i +"].PermissionName"));
			permission.setPermissionVersion(_ctx.stringValue("ListPermissionsResponse.Permissions["+ i +"].PermissionVersion"));
			permission.setDefaultVersion(_ctx.booleanValue("ListPermissionsResponse.Permissions["+ i +"].DefaultVersion"));
			permission.setCreateTime(_ctx.stringValue("ListPermissionsResponse.Permissions["+ i +"].CreateTime"));
			permission.setUpdateTime(_ctx.stringValue("ListPermissionsResponse.Permissions["+ i +"].UpdateTime"));
			permission.setResourceType(_ctx.stringValue("ListPermissionsResponse.Permissions["+ i +"].ResourceType"));
			permission.setDefaultPermission(_ctx.booleanValue("ListPermissionsResponse.Permissions["+ i +"].DefaultPermission"));

			permissions.add(permission);
		}
		listPermissionsResponse.setPermissions(permissions);
	 
	 	return listPermissionsResponse;
	}
}