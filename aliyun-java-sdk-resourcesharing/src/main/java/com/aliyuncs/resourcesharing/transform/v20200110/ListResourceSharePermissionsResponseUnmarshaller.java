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

import com.aliyuncs.resourcesharing.model.v20200110.ListResourceSharePermissionsResponse;
import com.aliyuncs.resourcesharing.model.v20200110.ListResourceSharePermissionsResponse.Permission;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceSharePermissionsResponseUnmarshaller {

	public static ListResourceSharePermissionsResponse unmarshall(ListResourceSharePermissionsResponse listResourceSharePermissionsResponse, UnmarshallerContext _ctx) {
		
		listResourceSharePermissionsResponse.setRequestId(_ctx.stringValue("ListResourceSharePermissionsResponse.RequestId"));
		listResourceSharePermissionsResponse.setNextToken(_ctx.stringValue("ListResourceSharePermissionsResponse.NextToken"));

		List<Permission> permissions = new ArrayList<Permission>();
		for (int i = 0; i < _ctx.lengthValue("ListResourceSharePermissionsResponse.Permissions.Length"); i++) {
			Permission permission = new Permission();
			permission.setPermissionName(_ctx.stringValue("ListResourceSharePermissionsResponse.Permissions["+ i +"].PermissionName"));
			permission.setPermissionVersion(_ctx.stringValue("ListResourceSharePermissionsResponse.Permissions["+ i +"].PermissionVersion"));
			permission.setDefaultVersion(_ctx.booleanValue("ListResourceSharePermissionsResponse.Permissions["+ i +"].DefaultVersion"));
			permission.setCreateTime(_ctx.stringValue("ListResourceSharePermissionsResponse.Permissions["+ i +"].CreateTime"));
			permission.setUpdateTime(_ctx.stringValue("ListResourceSharePermissionsResponse.Permissions["+ i +"].UpdateTime"));
			permission.setResourceType(_ctx.stringValue("ListResourceSharePermissionsResponse.Permissions["+ i +"].ResourceType"));
			permission.setDefaultPermission(_ctx.booleanValue("ListResourceSharePermissionsResponse.Permissions["+ i +"].DefaultPermission"));

			permissions.add(permission);
		}
		listResourceSharePermissionsResponse.setPermissions(permissions);
	 
	 	return listResourceSharePermissionsResponse;
	}
}