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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeInstanceAccountsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceAccountsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<InstanceAccount> instanceAccounts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<InstanceAccount> getInstanceAccounts() {
		return this.instanceAccounts;
	}

	public void setInstanceAccounts(List<InstanceAccount> instanceAccounts) {
		this.instanceAccounts = instanceAccounts;
	}

	public static class InstanceAccount {

		private String accountName;

		private String host;

		private Integer accountType;

		private String description;

		private List<DbPrivilege> dbPrivileges;

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public String getHost() {
			return this.host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public Integer getAccountType() {
			return this.accountType;
		}

		public void setAccountType(Integer accountType) {
			this.accountType = accountType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<DbPrivilege> getDbPrivileges() {
			return this.dbPrivileges;
		}

		public void setDbPrivileges(List<DbPrivilege> dbPrivileges) {
			this.dbPrivileges = dbPrivileges;
		}

		public static class DbPrivilege {

			private String dbName;

			private String privilege;

			public String getDbName() {
				return this.dbName;
			}

			public void setDbName(String dbName) {
				this.dbName = dbName;
			}

			public String getPrivilege() {
				return this.privilege;
			}

			public void setPrivilege(String privilege) {
				this.privilege = privilege;
			}
		}
	}

	@Override
	public DescribeInstanceAccountsResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceAccountsResponseUnmarshaller.unmarshall(this, context);
	}
}
