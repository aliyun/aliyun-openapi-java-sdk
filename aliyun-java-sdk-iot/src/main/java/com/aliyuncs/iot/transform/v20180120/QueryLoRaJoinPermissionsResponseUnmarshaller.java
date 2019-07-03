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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryLoRaJoinPermissionsResponse;
import com.aliyuncs.iot.model.v20180120.QueryLoRaJoinPermissionsResponse.JoinPermission;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLoRaJoinPermissionsResponseUnmarshaller {

	public static QueryLoRaJoinPermissionsResponse unmarshall(QueryLoRaJoinPermissionsResponse queryLoRaJoinPermissionsResponse, UnmarshallerContext _ctx) {
		
		queryLoRaJoinPermissionsResponse.setRequestId(_ctx.stringValue("QueryLoRaJoinPermissionsResponse.RequestId"));
		queryLoRaJoinPermissionsResponse.setSuccess(_ctx.booleanValue("QueryLoRaJoinPermissionsResponse.Success"));
		queryLoRaJoinPermissionsResponse.setCode(_ctx.stringValue("QueryLoRaJoinPermissionsResponse.Code"));
		queryLoRaJoinPermissionsResponse.setErrorMessage(_ctx.stringValue("QueryLoRaJoinPermissionsResponse.ErrorMessage"));
		queryLoRaJoinPermissionsResponse.setProductKey(_ctx.stringValue("QueryLoRaJoinPermissionsResponse.ProductKey"));

		List<JoinPermission> joinPermissions = new ArrayList<JoinPermission>();
		for (int i = 0; i < _ctx.lengthValue("QueryLoRaJoinPermissionsResponse.JoinPermissions.Length"); i++) {
			JoinPermission joinPermission = new JoinPermission();
			joinPermission.setJoinPermissionId(_ctx.stringValue("QueryLoRaJoinPermissionsResponse.JoinPermissions["+ i +"].JoinPermissionId"));
			joinPermission.setJoinPermissionName(_ctx.stringValue("QueryLoRaJoinPermissionsResponse.JoinPermissions["+ i +"].JoinPermissionName"));
			joinPermission.setJoinPermissionType(_ctx.stringValue("QueryLoRaJoinPermissionsResponse.JoinPermissions["+ i +"].JoinPermissionType"));
			joinPermission.setOwnerAliyunPk(_ctx.stringValue("QueryLoRaJoinPermissionsResponse.JoinPermissions["+ i +"].OwnerAliyunPk"));
			joinPermission.setEnabled(_ctx.booleanValue("QueryLoRaJoinPermissionsResponse.JoinPermissions["+ i +"].Enabled"));
			joinPermission.setClassMode(_ctx.stringValue("QueryLoRaJoinPermissionsResponse.JoinPermissions["+ i +"].ClassMode"));

			joinPermissions.add(joinPermission);
		}
		queryLoRaJoinPermissionsResponse.setJoinPermissions(joinPermissions);
	 
	 	return queryLoRaJoinPermissionsResponse;
	}
}