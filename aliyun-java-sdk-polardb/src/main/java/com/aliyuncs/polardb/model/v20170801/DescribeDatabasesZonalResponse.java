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
import com.aliyuncs.polardb.transform.v20170801.DescribeDatabasesZonalResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDatabasesZonalResponse extends AcsResponse {

	private Integer pageRecordCount;

	private String requestId;

	private Integer pageNumber;

	private Integer maxResults;

	private String nextToken;

	private List<Database> databases;

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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<Database> getDatabases() {
		return this.databases;
	}

	public void setDatabases(List<Database> databases) {
		this.databases = databases;
	}

	public static class Database {

		private String dBDescription;

		private String dBStatus;

		private String dBName;

		private String engine;

		private String masterID;

		private String characterSetName;

		private List<Account> accounts;

		public String getDBDescription() {
			return this.dBDescription;
		}

		public void setDBDescription(String dBDescription) {
			this.dBDescription = dBDescription;
		}

		public String getDBStatus() {
			return this.dBStatus;
		}

		public void setDBStatus(String dBStatus) {
			this.dBStatus = dBStatus;
		}

		public String getDBName() {
			return this.dBName;
		}

		public void setDBName(String dBName) {
			this.dBName = dBName;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getMasterID() {
			return this.masterID;
		}

		public void setMasterID(String masterID) {
			this.masterID = masterID;
		}

		public String getCharacterSetName() {
			return this.characterSetName;
		}

		public void setCharacterSetName(String characterSetName) {
			this.characterSetName = characterSetName;
		}

		public List<Account> getAccounts() {
			return this.accounts;
		}

		public void setAccounts(List<Account> accounts) {
			this.accounts = accounts;
		}

		public static class Account {

			private String privilegeStatus;

			private String accountStatus;

			private String accountPrivilege;

			private String accountName;

			public String getPrivilegeStatus() {
				return this.privilegeStatus;
			}

			public void setPrivilegeStatus(String privilegeStatus) {
				this.privilegeStatus = privilegeStatus;
			}

			public String getAccountStatus() {
				return this.accountStatus;
			}

			public void setAccountStatus(String accountStatus) {
				this.accountStatus = accountStatus;
			}

			public String getAccountPrivilege() {
				return this.accountPrivilege;
			}

			public void setAccountPrivilege(String accountPrivilege) {
				this.accountPrivilege = accountPrivilege;
			}

			public String getAccountName() {
				return this.accountName;
			}

			public void setAccountName(String accountName) {
				this.accountName = accountName;
			}
		}
	}

	@Override
	public DescribeDatabasesZonalResponse getInstance(UnmarshallerContext context) {
		return	DescribeDatabasesZonalResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
