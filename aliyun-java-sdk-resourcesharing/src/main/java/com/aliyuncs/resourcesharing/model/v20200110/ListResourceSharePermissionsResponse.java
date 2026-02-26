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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcesharing.transform.v20200110.ListResourceSharePermissionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListResourceSharePermissionsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<Permission> permissions;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Permission> getPermissions() {
		return this.permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public static class Permission {

		private String permissionName;

		private String permissionVersion;

		private Boolean defaultVersion;

		private String createTime;

		private String updateTime;

		private String resourceType;

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

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public Boolean getDefaultPermission() {
			return this.defaultPermission;
		}

		public void setDefaultPermission(Boolean defaultPermission) {
			this.defaultPermission = defaultPermission;
		}
	}

	@Override
	public ListResourceSharePermissionsResponse getInstance(UnmarshallerContext context) {
		return	ListResourceSharePermissionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
