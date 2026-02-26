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

import com.aliyuncs.resourcesharing.model.v20200110.GetPermissionResponse;
import com.aliyuncs.resourcesharing.model.v20200110.GetPermissionResponse.Permission;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPermissionResponseUnmarshaller {

	public static GetPermissionResponse unmarshall(GetPermissionResponse getPermissionResponse, UnmarshallerContext _ctx) {
		
		getPermissionResponse.setRequestId(_ctx.stringValue("GetPermissionResponse.RequestId"));

		Permission permission = new Permission();
		permission.setPermissionName(_ctx.stringValue("GetPermissionResponse.Permission.PermissionName"));
		permission.setPermissionVersion(_ctx.stringValue("GetPermissionResponse.Permission.PermissionVersion"));
		permission.setPermission(_ctx.stringValue("GetPermissionResponse.Permission.Permission"));
		permission.setResourceType(_ctx.stringValue("GetPermissionResponse.Permission.ResourceType"));
		permission.setDefaultVersion(_ctx.booleanValue("GetPermissionResponse.Permission.DefaultVersion"));
		permission.setCreateTime(_ctx.stringValue("GetPermissionResponse.Permission.CreateTime"));
		permission.setUpdateTime(_ctx.stringValue("GetPermissionResponse.Permission.UpdateTime"));
		permission.setDefaultPermission(_ctx.booleanValue("GetPermissionResponse.Permission.DefaultPermission"));
		getPermissionResponse.setPermission(permission);
	 
	 	return getPermissionResponse;
	}
}