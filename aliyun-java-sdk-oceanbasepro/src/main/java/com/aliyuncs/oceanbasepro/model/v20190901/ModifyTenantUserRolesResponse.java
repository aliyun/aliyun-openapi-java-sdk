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
import com.aliyuncs.oceanbasepro.transform.v20190901.ModifyTenantUserRolesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyTenantUserRolesResponse extends AcsResponse {

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

		private String userName;

		private String tenantId;

		private List<UserRoleItem> userRole;

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public List<UserRoleItem> getUserRole() {
			return this.userRole;
		}

		public void setUserRole(List<UserRoleItem> userRole) {
			this.userRole = userRole;
		}

		public static class UserRoleItem {

			private String database;

			private String role;

			private String table;

			private Boolean isSuccess;

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

			public String getTable() {
				return this.table;
			}

			public void setTable(String table) {
				this.table = table;
			}

			public Boolean getIsSuccess() {
				return this.isSuccess;
			}

			public void setIsSuccess(Boolean isSuccess) {
				this.isSuccess = isSuccess;
			}
		}
	}

	@Override
	public ModifyTenantUserRolesResponse getInstance(UnmarshallerContext context) {
		return	ModifyTenantUserRolesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
