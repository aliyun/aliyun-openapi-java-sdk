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

import com.aliyuncs.resourcesharing.model.v20200110.ListPermissionVersionsResponse;
import com.aliyuncs.resourcesharing.model.v20200110.ListPermissionVersionsResponse.Permission;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPermissionVersionsResponseUnmarshaller {

	public static ListPermissionVersionsResponse unmarshall(ListPermissionVersionsResponse listPermissionVersionsResponse, UnmarshallerContext _ctx) {
		
		listPermissionVersionsResponse.setRequestId(_ctx.stringValue("ListPermissionVersionsResponse.RequestId"));
		listPermissionVersionsResponse.setNextToken(_ctx.stringValue("ListPermissionVersionsResponse.NextToken"));

		List<Permission> permissions = new ArrayList<Permission>();
		for (int i = 0; i < _ctx.lengthValue("ListPermissionVersionsResponse.Permissions.Length"); i++) {
			Permission permission = new Permission();
			permission.setPermissionName(_ctx.stringValue("ListPermissionVersionsResponse.Permissions["+ i +"].PermissionName"));
			permission.setPermissionVersion(_ctx.stringValue("ListPermissionVersionsResponse.Permissions["+ i +"].PermissionVersion"));
			permission.setDefaultVersion(_ctx.booleanValue("ListPermissionVersionsResponse.Permissions["+ i +"].DefaultVersion"));
			permission.setCreateTime(_ctx.stringValue("ListPermissionVersionsResponse.Permissions["+ i +"].CreateTime"));
			permission.setUpdateTime(_ctx.stringValue("ListPermissionVersionsResponse.Permissions["+ i +"].UpdateTime"));
			permission.setResourceType(_ctx.stringValue("ListPermissionVersionsResponse.Permissions["+ i +"].ResourceType"));
			permission.setDefaultPermission(_ctx.booleanValue("ListPermissionVersionsResponse.Permissions["+ i +"].DefaultPermission"));

			permissions.add(permission);
		}
		listPermissionVersionsResponse.setPermissions(permissions);
	 
	 	return listPermissionVersionsResponse;
	}
}