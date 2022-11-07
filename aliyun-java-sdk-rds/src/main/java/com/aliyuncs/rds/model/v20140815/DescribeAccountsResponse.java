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

	private String systemAdminAccountStatus;

	private String systemAdminAccountFirstActivationTime;

	private Integer pageNumber;

	private String requestId;

	private Integer totalRecordCount;

	private List<DBInstanceAccount> accounts;

	public String getSystemAdminAccountStatus() {
		return this.systemAdminAccountStatus;
	}

	public void setSystemAdminAccountStatus(String systemAdminAccountStatus) {
		this.systemAdminAccountStatus = systemAdminAccountStatus;
	}

	public String getSystemAdminAccountFirstActivationTime() {
		return this.systemAdminAccountFirstActivationTime;
	}

	public void setSystemAdminAccountFirstActivationTime(String systemAdminAccountFirstActivationTime) {
		this.systemAdminAccountFirstActivationTime = systemAdminAccountFirstActivationTime;
	}

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

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public List<DBInstanceAccount> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(List<DBInstanceAccount> accounts) {
		this.accounts = accounts;
	}

	public static class DBInstanceAccount {

		private String accountStatus;

		private String accountDescription;

		private String dBInstanceId;

		private String privExceeded;

		private String accountType;

		private String accountName;

		private String validUntil;

		private String createDB;

		private String replication;

		private String createRole;

		private String bypassRLS;

		private List<DatabasePrivilege> databasePrivileges;

		public String getAccountStatus() {
			return this.accountStatus;
		}

		public void setAccountStatus(String accountStatus) {
			this.accountStatus = accountStatus;
		}

		public String getAccountDescription() {
			return this.accountDescription;
		}

		public void setAccountDescription(String accountDescription) {
			this.accountDescription = accountDescription;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getPrivExceeded() {
			return this.privExceeded;
		}

		public void setPrivExceeded(String privExceeded) {
			this.privExceeded = privExceeded;
		}

		public String getAccountType() {
			return this.accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public String getValidUntil() {
			return this.validUntil;
		}

		public void setValidUntil(String validUntil) {
			this.validUntil = validUntil;
		}

		public String getCreateDB() {
			return this.createDB;
		}

		public void setCreateDB(String createDB) {
			this.createDB = createDB;
		}

		public String getReplication() {
			return this.replication;
		}

		public void setReplication(String replication) {
			this.replication = replication;
		}

		public String getCreateRole() {
			return this.createRole;
		}

		public void setCreateRole(String createRole) {
			this.createRole = createRole;
		}

		public String getBypassRLS() {
			return this.bypassRLS;
		}

		public void setBypassRLS(String bypassRLS) {
			this.bypassRLS = bypassRLS;
		}

		public List<DatabasePrivilege> getDatabasePrivileges() {
			return this.databasePrivileges;
		}

		public void setDatabasePrivileges(List<DatabasePrivilege> databasePrivileges) {
			this.databasePrivileges = databasePrivileges;
		}

		public static class DatabasePrivilege {

			private String dBName;

			private String accountPrivilege;

			private String accountPrivilegeDetail;

			public String getDBName() {
				return this.dBName;
			}

			public void setDBName(String dBName) {
				this.dBName = dBName;
			}

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
		}
	}

	@Override
	public DescribeAccountsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAccountsResponseUnmarshaller.unmarshall(this, context);
	}
}
