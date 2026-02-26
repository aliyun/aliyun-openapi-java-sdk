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
import com.aliyuncs.oceanbasepro.transform.v20190901.ModifyDatabaseUserRolesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyDatabaseUserRolesResponse extends AcsResponse {

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

		private String databaseName;

		private String tenantId;

		private List<UserRole> users;

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public List<UserRole> getUsers() {
			return this.users;
		}

		public void setUsers(List<UserRole> users) {
			this.users = users;
		}

		public static class UserRole {

			private String role;

			private String userName;

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}
		}
	}

	@Override
	public ModifyDatabaseUserRolesResponse getInstance(UnmarshallerContext context) {
		return	ModifyDatabaseUserRolesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
