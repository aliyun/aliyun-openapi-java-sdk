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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeCloudDrivePermissionsResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeCloudDrivePermissionsResponse.CloudDrivePermissionModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudDrivePermissionsResponseUnmarshaller {

	public static DescribeCloudDrivePermissionsResponse unmarshall(DescribeCloudDrivePermissionsResponse describeCloudDrivePermissionsResponse, UnmarshallerContext _ctx) {
		
		describeCloudDrivePermissionsResponse.setRequestId(_ctx.stringValue("DescribeCloudDrivePermissionsResponse.RequestId"));

		List<CloudDrivePermissionModel> cloudDrivePermissionModels = new ArrayList<CloudDrivePermissionModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCloudDrivePermissionsResponse.CloudDrivePermissionModels.Length"); i++) {
			CloudDrivePermissionModel cloudDrivePermissionModel = new CloudDrivePermissionModel();
			cloudDrivePermissionModel.setPermission(_ctx.stringValue("DescribeCloudDrivePermissionsResponse.CloudDrivePermissionModels["+ i +"].Permission"));

			List<String> endUsers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCloudDrivePermissionsResponse.CloudDrivePermissionModels["+ i +"].EndUsers.Length"); j++) {
				endUsers.add(_ctx.stringValue("DescribeCloudDrivePermissionsResponse.CloudDrivePermissionModels["+ i +"].EndUsers["+ j +"]"));
			}
			cloudDrivePermissionModel.setEndUsers(endUsers);

			cloudDrivePermissionModels.add(cloudDrivePermissionModel);
		}
		describeCloudDrivePermissionsResponse.setCloudDrivePermissionModels(cloudDrivePermissionModels);
	 
	 	return describeCloudDrivePermissionsResponse;
	}
}