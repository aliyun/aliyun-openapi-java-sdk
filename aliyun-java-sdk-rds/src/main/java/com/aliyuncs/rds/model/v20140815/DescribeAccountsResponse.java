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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeAccountsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAccountsResponse extends AcsResponse {

	private Integer pageNumber;

	private String requestId;

	private String systemAdminAccountFirstActivationTime;

	private String systemAdminAccountStatus;

	private Integer totalRecordCount;

	private String resourceGroupId;

	private List<DBInstanceAccount> accounts;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSystemAdminAccountFirstActivationTime() {
		return this.systemAdminAccountFirstActivationTime;
	}

	public void setSystemAdminAccountFirstActivationTime(String systemAdminAccountFirstActivationTime) {
		this.systemAdminAccountFirstActivationTime = systemAdminAccountFirstActivationTime;
	}

	public String getSystemAdminAccountStatus() {
		return this.systemAdminAccountStatus;
	}

	public void setSystemAdminAccountStatus(String systemAdminAccountStatus) {
		this.systemAdminAccountStatus = systemAdminAccountStatus;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public List<DBInstanceAccount> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(List<DBInstanceAccount> accounts) {
		this.accounts = accounts;
	}

	public static class DBInstanceAccount {

		private String accountDescription;

		private String accountName;

		private String accountStatus;

		private String accountType;

		private String bypassRLS;

		private Boolean checkPolicy;

		private String createDB;

		private String createRole;

		private String dBInstanceId;

		private String passwordExpireTime;

		private String privExceeded;

		private String replication;

		private String validUntil;

		private List<DatabasePrivilege> databasePrivileges;

		public String getAccountDescription() {
			return this.accountDescription;
		}

		public void setAccountDescription(String accountDescription) {
			this.accountDescription = accountDescription;
		}

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public String getAccountStatus() {
			return this.accountStatus;
		}

		public void setAccountStatus(String accountStatus) {
			this.accountStatus = accountStatus;
		}

		public String getAccountType() {
			return this.accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		public String getBypassRLS() {
			return this.bypassRLS;
		}

		public void setBypassRLS(String bypassRLS) {
			this.bypassRLS = bypassRLS;
		}

		public Boolean getCheckPolicy() {
			return this.checkPolicy;
		}

		public void setCheckPolicy(Boolean checkPolicy) {
			this.checkPolicy = checkPolicy;
		}

		public String getCreateDB() {
			return this.createDB;
		}

		public void setCreateDB(String createDB) {
			this.createDB = createDB;
		}

		public String getCreateRole() {
			return this.createRole;
		}

		public void setCreateRole(String createRole) {
			this.createRole = createRole;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getPasswordExpireTime() {
			return this.passwordExpireTime;
		}

		public void setPasswordExpireTime(String passwordExpireTime) {
			this.passwordExpireTime = passwordExpireTime;
		}

		public String getPrivExceeded() {
			return this.privExceeded;
		}

		public void setPrivExceeded(String privExceeded) {
			this.privExceeded = privExceeded;
		}

		public String getReplication() {
			return this.replication;
		}

		public void setReplication(String replication) {
			this.replication = replication;
		}

		public String getValidUntil() {
			return this.validUntil;
		}

		public void setValidUntil(String validUntil) {
			this.validUntil = validUntil;
		}

		public List<DatabasePrivilege> getDatabasePrivileges() {
			return this.databasePrivileges;
		}

		public void setDatabasePrivileges(List<DatabasePrivilege> databasePrivileges) {
			this.databasePrivileges = databasePrivileges;
		}

		public static class DatabasePrivilege {

			private String accountPrivilege;

			private String accountPrivilegeDetail;

			private String dBName;

			public String getAccountPrivilege() {
				return this.accountPrivilege;
			}

			public void setAccountPrivilege(String accountPrivilege) {
				this.accountPrivilege = accountPrivilege;
			}

			public String getAccountPrivilegeDetail() {
				return this.accountPrivilegeDetail;
			}

			public void setAccountPrivilegeDetail(String accountPrivilegeDetail) {
				this.accountPrivilegeDetail = accountPrivilegeDetail;
			}

			public String getDBName() {
				return this.dBName;
			}

			public void setDBName(String dBName) {
				this.dBName = dBName;
			}
		}
	}

	@Override
	public DescribeAccountsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAccountsResponseUnmarshaller.unmarshall(this, context);
	}
}
