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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeCloudDrivePermissionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCloudDrivePermissionsResponse extends AcsResponse {

	private String requestId;

	private List<CloudDrivePermissionModel> cloudDrivePermissionModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CloudDrivePermissionModel> getCloudDrivePermissionModels() {
		return this.cloudDrivePermissionModels;
	}

	public void setCloudDrivePermissionModels(List<CloudDrivePermissionModel> cloudDrivePermissionModels) {
		this.cloudDrivePermissionModels = cloudDrivePermissionModels;
	}

	public static class CloudDrivePermissionModel {

		private String permission;

		private List<String> endUsers;

		public String getPermission() {
			return this.permission;
		}

		public void setPermission(String permission) {
			this.permission = permission;
		}

		public List<String> getEndUsers() {
			return this.endUsers;
		}

		public void setEndUsers(List<String> endUsers) {
			this.endUsers = endUsers;
		}
	}

	@Override
	public DescribeCloudDrivePermissionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCloudDrivePermissionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
