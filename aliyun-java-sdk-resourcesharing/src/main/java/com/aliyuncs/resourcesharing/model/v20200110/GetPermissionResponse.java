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

package com.aliyuncs.resourcesharing.model.v20200110;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcesharing.transform.v20200110.GetPermissionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPermissionResponse extends AcsResponse {

	private String requestId;

	private Permission permission;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Permission getPermission() {
		return this.permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

	public static class Permission {

		private String permissionName;

		private String permissionVersion;

		private String permission;

		private String resourceType;

		private Boolean defaultVersion;

		private String createTime;

		private String updateTime;

		private Boolean defaultPermission;

		public String getPermissionName() {
			return this.permissionName;
		}

		public void setPermissionName(String permissionName) {
			this.permissionName = permissionName;
		}

		public String getPermissionVersion() {
			return this.permissionVersion;
		}

		public void setPermissionVersion(String permissionVersion) {
			this.permissionVersion = permissionVersion;
		}

		public String getPermission() {
			return this.permission;
		}

		public void setPermission(String permission) {
			this.permission = permission;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public Boolean getDefaultVersion() {
			return this.defaultVersion;
		}

		public void setDefaultVersion(Boolean defaultVersion) {
			this.defaultVersion = defaultVersion;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public Boolean getDefaultPermission() {
			return this.defaultPermission;
		}

		public void setDefaultPermission(Boolean defaultPermission) {
			this.defaultPermission = defaultPermission;
		}
	}

	@Override
	public GetPermissionResponse getInstance(UnmarshallerContext context) {
		return	GetPermissionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
