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
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeTenantUsersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTenantUsersResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<TenantUsersItem> tenantUsers;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TenantUsersItem> getTenantUsers() {
		return this.tenantUsers;
	}

	public void setTenantUsers(List<TenantUsersItem> tenantUsers) {
		this.tenantUsers = tenantUsers;
	}

	public static class TenantUsersItem {

		private String userType;

		private String description;

		private String userStatus;

		private String userName;

		private String tenantId;

		private String instanceId;

		private String globalPermissions;

		private List<DatabasesItem> databases;

		public String getUserType() {
			return this.userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
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

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getGlobalPermissions() {
			return this.globalPermissions;
		}

		public void setGlobalPermissions(String globalPermissions) {
			this.globalPermissions = globalPermissions;
		}

		public List<DatabasesItem> getDatabases() {
			return this.databases;
		}

		public void setDatabases(List<DatabasesItem> databases) {
			this.databases = databases;
		}

		public static class DatabasesItem {

			private String database;

			private String role;

			private String table;

			private String privileges;

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

			public String getPrivileges() {
				return this.privileges;
			}

			public void setPrivileges(String privileges) {
				this.privileges = privileges;
			}
		}
	}

	@Override
	public DescribeTenantUsersResponse getInstance(UnmarshallerContext context) {
		return	DescribeTenantUsersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
