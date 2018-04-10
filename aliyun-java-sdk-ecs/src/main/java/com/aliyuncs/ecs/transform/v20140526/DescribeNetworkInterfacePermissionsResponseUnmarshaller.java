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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacePermissionsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacePermissionsResponse.NetworkInterfacePermission;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkInterfacePermissionsResponseUnmarshaller {

	public static DescribeNetworkInterfacePermissionsResponse unmarshall(DescribeNetworkInterfacePermissionsResponse describeNetworkInterfacePermissionsResponse, UnmarshallerContext context) {
		
		describeNetworkInterfacePermissionsResponse.setRequestId(context.stringValue("DescribeNetworkInterfacePermissionsResponse.RequestId"));
		describeNetworkInterfacePermissionsResponse.setTotalCount(context.integerValue("DescribeNetworkInterfacePermissionsResponse.TotalCount"));
		describeNetworkInterfacePermissionsResponse.setPageNumber(context.integerValue("DescribeNetworkInterfacePermissionsResponse.PageNumber"));
		describeNetworkInterfacePermissionsResponse.setPageSize(context.integerValue("DescribeNetworkInterfacePermissionsResponse.PageSize"));

		List<NetworkInterfacePermission> networkInterfacePermissions = new ArrayList<NetworkInterfacePermission>();
		for (int i = 0; i < context.lengthValue("DescribeNetworkInterfacePermissionsResponse.NetworkInterfacePermissions.Length"); i++) {
			NetworkInterfacePermission networkInterfacePermission = new NetworkInterfacePermission();
			networkInterfacePermission.setAccountId(context.longValue("DescribeNetworkInterfacePermissionsResponse.NetworkInterfacePermissions["+ i +"].AccountId"));
			networkInterfacePermission.setServiceName(context.stringValue("DescribeNetworkInterfacePermissionsResponse.NetworkInterfacePermissions["+ i +"].ServiceName"));
			networkInterfacePermission.setNetworkInterfaceId(context.stringValue("DescribeNetworkInterfacePermissionsResponse.NetworkInterfacePermissions["+ i +"].NetworkInterfaceId"));
			networkInterfacePermission.setNetworkInterfacePermissionId(context.stringValue("DescribeNetworkInterfacePermissionsResponse.NetworkInterfacePermissions["+ i +"].NetworkInterfacePermissionId"));
			networkInterfacePermission.setPermission(context.stringValue("DescribeNetworkInterfacePermissionsResponse.NetworkInterfacePermissions["+ i +"].Permission"));
			networkInterfacePermission.setPermissionState(context.stringValue("DescribeNetworkInterfacePermissionsResponse.NetworkInterfacePermissions["+ i +"].PermissionState"));

			networkInterfacePermissions.add(networkInterfacePermission);
		}
		describeNetworkInterfacePermissionsResponse.setNetworkInterfacePermissions(networkInterfacePermissions);
	 
	 	return describeNetworkInterfacePermissionsResponse;
	}
}