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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeDatabasesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDatabasesResponse extends AcsResponse {

	private String requestId;

	private List<Database> databases;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Database> getDatabases() {
		return this.databases;
	}

	public void setDatabases(List<Database> databases) {
		this.databases = databases;
	}

	public static class Database {

		private String characterSetName;

		private String collate;

		private String connLimit;

		private String ctype;

		private String dBDescription;

		private String dBInstanceId;

		private String dBName;

		private String dBStatus;

		private String engine;

		private Integer pageNumber;

		private Integer pageSize;

		private String resourceGroupId;

		private String tablespace;

		private Integer totalCount;

		private List<AccountPrivilegeInfo> accounts;

		private List<Map<Object,Object>> advancedInfo;

		private List<Map<Object,Object>> basicInfo;

		private List<Map<Object,Object>> runtimeInfo;

		public String getCharacterSetName() {
			return this.characterSetName;
		}

		public void setCharacterSetName(String characterSetName) {
			this.characterSetName = characterSetName;
		}

		public String getCollate() {
			return this.collate;
		}

		public void setCollate(String collate) {
			this.collate = collate;
		}

		public String getConnLimit() {
			return this.connLimit;
		}

		public void setConnLimit(String connLimit) {
			this.connLimit = connLimit;
		}

		public String getCtype() {
			return this.ctype;
		}

		public void setCtype(String ctype) {
			this.ctype = ctype;
		}

		public String getDBDescription() {
			return this.dBDescription;
		}

		public void setDBDescription(String dBDescription) {
			this.dBDescription = dBDescription;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getDBName() {
			return this.dBName;
		}

		public void setDBName(String dBName) {
			this.dBName = dBName;
		}

		public String getDBStatus() {
			return this.dBStatus;
		}

		public void setDBStatus(String dBStatus) {
			this.dBStatus = dBStatus;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getTablespace() {
			return this.tablespace;
		}

		public void setTablespace(String tablespace) {
			this.tablespace = tablespace;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<AccountPrivilegeInfo> getAccounts() {
			return this.accounts;
		}

		public void setAccounts(List<AccountPrivilegeInfo> accounts) {
			this.accounts = accounts;
		}

		public List<Map<Object,Object>> getAdvancedInfo() {
			return this.advancedInfo;
		}

		public void setAdvancedInfo(List<Map<Object,Object>> advancedInfo) {
			this.advancedInfo = advancedInfo;
		}

		public List<Map<Object,Object>> getBasicInfo() {
			return this.basicInfo;
		}

		public void setBasicInfo(List<Map<Object,Object>> basicInfo) {
			this.basicInfo = basicInfo;
		}

		public List<Map<Object,Object>> getRuntimeInfo() {
			return this.runtimeInfo;
		}

		public void setRuntimeInfo(List<Map<Object,Object>> runtimeInfo) {
			this.runtimeInfo = runtimeInfo;
		}

		public static class AccountPrivilegeInfo {

			private String account;

			private String accountPrivilege;

			private String accountPrivilegeDetail;

			public String getAccount() {
				return this.account;
			}

			public void setAccount(String account) {
				this.account = account;
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
	public DescribeDatabasesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDatabasesResponseUnmarshaller.unmarshall(this, context);
	}
}
