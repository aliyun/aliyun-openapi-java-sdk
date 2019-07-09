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

package com.aliyuncs.ecs.transform.v20140526;

import com.aliyuncs.ecs.model.v20140526.CreateNetworkInterfacePermissionResponse;
import com.aliyuncs.ecs.model.v20140526.CreateNetworkInterfacePermissionResponse.NetworkInterfacePermission;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateNetworkInterfacePermissionResponseUnmarshaller {

	public static CreateNetworkInterfacePermissionResponse unmarshall(CreateNetworkInterfacePermissionResponse createNetworkInterfacePermissionResponse, UnmarshallerContext _ctx) {
		
		createNetworkInterfacePermissionResponse.setRequestId(_ctx.stringValue("CreateNetworkInterfacePermissionResponse.RequestId"));

		NetworkInterfacePermission networkInterfacePermission = new NetworkInterfacePermission();
		networkInterfacePermission.setAccountId(_ctx.longValue("CreateNetworkInterfacePermissionResponse.NetworkInterfacePermission.AccountId"));
		networkInterfacePermission.setServiceName(_ctx.stringValue("CreateNetworkInterfacePermissionResponse.NetworkInterfacePermission.ServiceName"));
		networkInterfacePermission.setNetworkInterfaceId(_ctx.stringValue("CreateNetworkInterfacePermissionResponse.NetworkInterfacePermission.NetworkInterfaceId"));
		networkInterfacePermission.setNetworkInterfacePermissionId(_ctx.stringValue("CreateNetworkInterfacePermissionResponse.NetworkInterfacePermission.NetworkInterfacePermissionId"));
		networkInterfacePermission.setPermission(_ctx.stringValue("CreateNetworkInterfacePermissionResponse.NetworkInterfacePermission.Permission"));
		networkInterfacePermission.setPermissionState(_ctx.stringValue("CreateNetworkInterfacePermissionResponse.NetworkInterfacePermission.PermissionState"));
		createNetworkInterfacePermissionResponse.setNetworkInterfacePermission(networkInterfacePermission);
	 
	 	return createNetworkInterfacePermissionResponse;
	}
}