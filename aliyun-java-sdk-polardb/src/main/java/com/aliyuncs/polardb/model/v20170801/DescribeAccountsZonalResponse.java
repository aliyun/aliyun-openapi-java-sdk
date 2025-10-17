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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeAccountsZonalResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAccountsZonalResponse extends AcsResponse {

	private Integer pageRecordCount;

	private String requestId;

	private Integer pageNumber;

	private String nextToken;

	private Integer maxResults;

	private List<DBAccount> accounts;

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<DBAccount> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(List<DBAccount> accounts) {
		this.accounts = accounts;
	}

	public static class DBAccount {

		private String accountDescription;

		private String accountStatus;

		private String privilegeExceeded;

		private String dynamoDBAuthPassword;

		private String accountLockState;

		private String accountPasswordValidTime;

		private String accountType;

		private String tairPasswordSetted;

		private String accountName;

		private String accountPassword;

		private List<DatabasePrivilege> databasePrivileges;

		public String getAccountDescription() {
			return this.accountDescription;
		}

		public void setAccountDescription(String accountDescription) {
			this.accountDescription = accountDescription;
		}

		public String getAccountStatus() {
			return this.accountStatus;
		}

		public void setAccountStatus(String accountStatus) {
			this.accountStatus = accountStatus;
		}

		public String getPrivilegeExceeded() {
			return this.privilegeExceeded;
		}

		public void setPrivilegeExceeded(String privilegeExceeded) {
			this.privilegeExceeded = privilegeExceeded;
		}

		public String getDynamoDBAuthPassword() {
			return this.dynamoDBAuthPassword;
		}

		public void setDynamoDBAuthPassword(String dynamoDBAuthPassword) {
			this.dynamoDBAuthPassword = dynamoDBAuthPassword;
		}

		public String getAccountLockState() {
			return this.accountLockState;
		}

		public void setAccountLockState(String accountLockState) {
			this.accountLockState = accountLockState;
		}

		public String getAccountPasswordValidTime() {
			return this.accountPasswordValidTime;
		}

		public void setAccountPasswordValidTime(String accountPasswordValidTime) {
			this.accountPasswordValidTime = accountPasswordValidTime;
		}

		public String getAccountType() {
			return this.accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		public String getTairPasswordSetted() {
			return this.tairPasswordSetted;
		}

		public void setTairPasswordSetted(String tairPasswordSetted) {
			this.tairPasswordSetted = tairPasswordSetted;
		}

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public String getAccountPassword() {
			return this.accountPassword;
		}

		public void setAccountPassword(String accountPassword) {
			this.accountPassword = accountPassword;
		}

		public List<DatabasePrivilege> getDatabasePrivileges() {
			return this.databasePrivileges;
		}

		public void setDatabasePrivileges(List<DatabasePrivilege> databasePrivileges) {
			this.databasePrivileges = databasePrivileges;
		}

		public static class DatabasePrivilege {

			private String accountPrivilege;

			private String dBName;

			public String getAccountPrivilege() {
				return this.accountPrivilege;
			}

			public void setAccountPrivilege(String accountPrivilege) {
				this.accountPrivilege = accountPrivilege;
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
	public DescribeAccountsZonalResponse getInstance(UnmarshallerContext context) {
		return	DescribeAccountsZonalResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
