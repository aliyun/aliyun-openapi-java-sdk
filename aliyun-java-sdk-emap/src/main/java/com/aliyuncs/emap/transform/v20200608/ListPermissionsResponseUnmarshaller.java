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

package com.aliyuncs.emap.transform.v20200608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emap.model.v20200608.ListPermissionsResponse;
import com.aliyuncs.emap.model.v20200608.ListPermissionsResponse.PermissionData;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPermissionsResponseUnmarshaller {

	public static ListPermissionsResponse unmarshall(ListPermissionsResponse listPermissionsResponse, UnmarshallerContext _ctx) {
		
		listPermissionsResponse.setRequestId(_ctx.stringValue("ListPermissionsResponse.RequestId"));
		listPermissionsResponse.setMessage(_ctx.stringValue("ListPermissionsResponse.Message"));
		listPermissionsResponse.setErrorCode(_ctx.stringValue("ListPermissionsResponse.ErrorCode"));
		listPermissionsResponse.setErrorMessage(_ctx.stringValue("ListPermissionsResponse.ErrorMessage"));
		listPermissionsResponse.setDynamicMessage(_ctx.stringValue("ListPermissionsResponse.DynamicMessage"));
		listPermissionsResponse.setSuccess(_ctx.booleanValue("ListPermissionsResponse.Success"));
		listPermissionsResponse.setDynamicCode(_ctx.stringValue("ListPermissionsResponse.DynamicCode"));
		listPermissionsResponse.setCode(_ctx.stringValue("ListPermissionsResponse.Code"));

		List<PermissionData> permissions = new ArrayList<PermissionData>();
		for (int i = 0; i < _ctx.lengthValue("ListPermissionsResponse.Permissions.Length"); i++) {
			PermissionData permissionData = new PermissionData();
			permissionData.setType(_ctx.stringValue("ListPermissionsResponse.Permissions["+ i +"].Type"));
			permissionData.setOption(_ctx.stringValue("ListPermissionsResponse.Permissions["+ i +"].Option"));
			permissionData.setDesc(_ctx.stringValue("ListPermissionsResponse.Permissions["+ i +"].Desc"));
			permissionData.setUniqueId(_ctx.stringValue("ListPermissionsResponse.Permissions["+ i +"].UniqueId"));
			permissionData.setId(_ctx.longValue("ListPermissionsResponse.Permissions["+ i +"].Id"));

			permissions.add(permissionData);
		}
		listPermissionsResponse.setPermissions(permissions);
	 
	 	return listPermissionsResponse;
	}
}