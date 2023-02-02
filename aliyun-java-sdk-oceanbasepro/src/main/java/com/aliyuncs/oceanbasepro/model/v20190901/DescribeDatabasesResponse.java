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
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeDatabasesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDatabasesResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<Data> databases;

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

	public List<Data> getDatabases() {
		return this.databases;
	}

	public void setDatabases(List<Data> databases) {
		this.databases = databases;
	}

	public static class Data {

		private String status;

		private String description;

		private String encoding;

		private String dbType;

		private String databaseName;

		private String createTime;

		private String tenantId;

		private Double requiredSize;

		private Double dataSize;

		private String collation;

		private String instanceId;

		private List<UsersItem> users;

		private List<TablesItem> tables;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getEncoding() {
			return this.encoding;
		}

		public void setEncoding(String encoding) {
			this.encoding = encoding;
		}

		public String getDbType() {
			return this.dbType;
		}

		public void setDbType(String dbType) {
			this.dbType = dbType;
		}

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public Double getRequiredSize() {
			return this.requiredSize;
		}

		public void setRequiredSize(Double requiredSize) {
			this.requiredSize = requiredSize;
		}

		public Double getDataSize() {
			return this.dataSize;
		}

		public void setDataSize(Double dataSize) {
			this.dataSize = dataSize;
		}

		public String getCollation() {
			return this.collation;
		}

		public void setCollation(String collation) {
			this.collation = collation;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public List<UsersItem> getUsers() {
			return this.users;
		}

		public void setUsers(List<UsersItem> users) {
			this.users = users;
		}

		public List<TablesItem> getTables() {
			return this.tables;
		}

		public void setTables(List<TablesItem> tables) {
			this.tables = tables;
		}

		public static class UsersItem {

			private String userType;

			private String role;

			private String userName;

			public String getUserType() {
				return this.userType;
			}

			public void setUserType(String userType) {
				this.userType = userType;
			}

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

		public static class TablesItem {

			private String tableName;

			public String getTableName() {
				return this.tableName;
			}

			public void setTableName(String tableName) {
				this.tableName = tableName;
			}
		}
	}

	@Override
	public DescribeDatabasesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDatabasesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
