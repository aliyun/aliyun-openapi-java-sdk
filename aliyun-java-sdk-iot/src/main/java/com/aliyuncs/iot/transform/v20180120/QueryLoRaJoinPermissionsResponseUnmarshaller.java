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

	public static QueryLoRaJoinPermissionsResponse unmarshall(QueryLoRaJoinPermissionsResponse queryLoRaJoinPermissionsResponse, UnmarshallerContext context) {
		
		queryLoRaJoinPermissionsResponse.setRequestId(context.stringValue("QueryLoRaJoinPermissionsResponse.RequestId"));
		queryLoRaJoinPermissionsResponse.setSuccess(context.booleanValue("QueryLoRaJoinPermissionsResponse.Success"));
		queryLoRaJoinPermissionsResponse.setCode(context.stringValue("QueryLoRaJoinPermissionsResponse.Code"));
		queryLoRaJoinPermissionsResponse.setErrorMessage(context.stringValue("QueryLoRaJoinPermissionsResponse.ErrorMessage"));
		queryLoRaJoinPermissionsResponse.setProductKey(context.stringValue("QueryLoRaJoinPermissionsResponse.ProductKey"));

		List<JoinPermission> joinPermissions = new ArrayList<JoinPermission>();
		for (int i = 0; i < context.lengthValue("QueryLoRaJoinPermissionsResponse.JoinPermissions.Length"); i++) {
			JoinPermission joinPermission = new JoinPermission();
			joinPermission.setJoinPermissionId(context.stringValue("QueryLoRaJoinPermissionsResponse.JoinPermissions["+ i +"].JoinPermissionId"));
			joinPermission.setJoinPermissionName(context.stringValue("QueryLoRaJoinPermissionsResponse.JoinPermissions["+ i +"].JoinPermissionName"));
			joinPermission.setJoinPermissionType(context.stringValue("QueryLoRaJoinPermissionsResponse.JoinPermissions["+ i +"].JoinPermissionType"));
			joinPermission.setOwnerAliyunPk(context.stringValue("QueryLoRaJoinPermissionsResponse.JoinPermissions["+ i +"].OwnerAliyunPk"));
			joinPermission.setEnabled(context.booleanValue("QueryLoRaJoinPermissionsResponse.JoinPermissions["+ i +"].Enabled"));
			joinPermission.setClassMode(context.stringValue("QueryLoRaJoinPermissionsResponse.JoinPermissions["+ i +"].ClassMode"));

			joinPermissions.add(joinPermission);
		}
		queryLoRaJoinPermissionsResponse.setJoinPermissions(joinPermissions);
	 
	 	return queryLoRaJoinPermissionsResponse;
	}
}