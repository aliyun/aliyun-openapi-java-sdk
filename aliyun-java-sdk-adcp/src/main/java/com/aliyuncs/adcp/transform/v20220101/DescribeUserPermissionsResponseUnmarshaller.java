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

package com.aliyuncs.adcp.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adcp.model.v20220101.DescribeUserPermissionsResponse;
import com.aliyuncs.adcp.model.v20220101.DescribeUserPermissionsResponse.Permission;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserPermissionsResponseUnmarshaller {

	public static DescribeUserPermissionsResponse unmarshall(DescribeUserPermissionsResponse describeUserPermissionsResponse, UnmarshallerContext _ctx) {
		
		describeUserPermissionsResponse.setRequestId(_ctx.stringValue("DescribeUserPermissionsResponse.RequestId"));

		List<Permission> permissions = new ArrayList<Permission>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserPermissionsResponse.Permissions.Length"); i++) {
			Permission permission = new Permission();
			permission.setRoleType(_ctx.stringValue("DescribeUserPermissionsResponse.Permissions["+ i +"].RoleType"));
			permission.setRoleName(_ctx.stringValue("DescribeUserPermissionsResponse.Permissions["+ i +"].RoleName"));
			permission.setResourceType(_ctx.stringValue("DescribeUserPermissionsResponse.Permissions["+ i +"].ResourceType"));
			permission.setResourceId(_ctx.stringValue("DescribeUserPermissionsResponse.Permissions["+ i +"].ResourceId"));

			permissions.add(permission);
		}
		describeUserPermissionsResponse.setPermissions(permissions);
	 
	 	return describeUserPermissionsResponse;
	}
}