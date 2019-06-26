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

package com.aliyuncs.retailcloud.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailcloud.transform.v20180313.DescribeRdsAccountsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRdsAccountsResponse extends AcsResponse {

	private Integer code;

	private String requestId;

	private String errMsg;

	private Result result;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrMsg() {
		return this.errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private List<AccountsItem> accounts;

		public List<AccountsItem> getAccounts() {
			return this.accounts;
		}

		public void setAccounts(List<AccountsItem> accounts) {
			this.accounts = accounts;
		}

		public static class AccountsItem {

			private String accountStatus;

			private String accountDescription;

			private String accountName;

			private String accountType;

			private String privExceeded;

			private String dBInstanceId;

			private List<DatabasePrivilegesItem> databasePrivileges;

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

			public String getAccountName() {
				return this.accountName;
			}

			public void setAccountName(String accountName) {
				this.accountName = accountName;
			}

			public String getAccountType() {
				return this.accountType;
			}

			public void setAccountType(String accountType) {
				this.accountType = accountType;
			}

			public String getPrivExceeded() {
				return this.privExceeded;
			}

			public void setPrivExceeded(String privExceeded) {
				this.privExceeded = privExceeded;
			}

			public String getDBInstanceId() {
				return this.dBInstanceId;
			}

			public void setDBInstanceId(String dBInstanceId) {
				this.dBInstanceId = dBInstanceId;
			}

			public List<DatabasePrivilegesItem> getDatabasePrivileges() {
				return this.databasePrivileges;
			}

			public void setDatabasePrivileges(List<DatabasePrivilegesItem> databasePrivileges) {
				this.databasePrivileges = databasePrivileges;
			}

			public static class DatabasePrivilegesItem {

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
	}

	@Override
	public DescribeRdsAccountsResponse getInstance(UnmarshallerContext context) {
		return	DescribeRdsAccountsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
