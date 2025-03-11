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

package com.aliyuncs.oceanbasepro.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.CreateTenantUserResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateTenantUserResponse extends AcsResponse {

	private String requestId;

	private TenantUser tenantUser;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public TenantUser getTenantUser() {
		return this.tenantUser;
	}

	public void setTenantUser(TenantUser tenantUser) {
		this.tenantUser = tenantUser;
	}

	public static class TenantUser {

		private String userType;

		private String userStatus;

		private String userName;

		private String globalPermissions;

		private List<RolesItem> roles;

		public String getUserType() {
			return this.userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		public String getUserStatus() {
			return this.userStatus;
		}

		public void setUserStatus(String userStatus) {
			this.userStatus = userStatus;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getGlobalPermissions() {
			return this.globalPermissions;
		}

		public void setGlobalPermissions(String globalPermissions) {
			this.globalPermissions = globalPermissions;
		}

		public List<RolesItem> getRoles() {
			return this.roles;
		}

		public void setRoles(List<RolesItem> roles) {
			this.roles = roles;
		}

		public static class RolesItem {

			private String database;

			private String role;

			public String getDatabase() {
				return this.database;
			}

			public void setDatabase(String database) {
				this.database = database;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}
		}
	}

	@Override
	public CreateTenantUserResponse getInstance(UnmarshallerContext context) {
		return	CreateTenantUserResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
