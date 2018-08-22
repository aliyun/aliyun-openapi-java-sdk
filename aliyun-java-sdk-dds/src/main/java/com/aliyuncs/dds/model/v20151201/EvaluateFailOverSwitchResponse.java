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

package com.aliyuncs.dds.model.v20151201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.EvaluateFailOverSwitchResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class EvaluateFailOverSwitchResponse extends AcsResponse {

	private String requestId;

	private String replicaId;

	private String evaluateResult;

	private List<ItemsItem> items;

	private List<ReportsItem> reports;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getReplicaId() {
		return this.replicaId;
	}

	public void setReplicaId(String replicaId) {
		this.replicaId = replicaId;
	}

	public String getEvaluateResult() {
		return this.evaluateResult;
	}

	public void setEvaluateResult(String evaluateResult) {
		this.evaluateResult = evaluateResult;
	}

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public List<ReportsItem> getReports() {
		return this.reports;
	}

	public void setReports(List<ReportsItem> reports) {
		this.reports = reports;
	}

	public static class ItemsItem {

		private String dBInstanceId;

		private String regionId;

		private String readWriteType;

		private String instanceNetworkType;

		private String securityIPList;

		private Boolean hasInternetIP;

		private String internetIP;

		private List<AccountsItem> accounts;

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getReadWriteType() {
			return this.readWriteType;
		}

		public void setReadWriteType(String readWriteType) {
			this.readWriteType = readWriteType;
		}

		public String getInstanceNetworkType() {
			return this.instanceNetworkType;
		}

		public void setInstanceNetworkType(String instanceNetworkType) {
			this.instanceNetworkType = instanceNetworkType;
		}

		public String getSecurityIPList() {
			return this.securityIPList;
		}

		public void setSecurityIPList(String securityIPList) {
			this.securityIPList = securityIPList;
		}

		public Boolean getHasInternetIP() {
			return this.hasInternetIP;
		}

		public void setHasInternetIP(Boolean hasInternetIP) {
			this.hasInternetIP = hasInternetIP;
		}

		public String getInternetIP() {
			return this.internetIP;
		}

		public void setInternetIP(String internetIP) {
			this.internetIP = internetIP;
		}

		public List<AccountsItem> getAccounts() {
			return this.accounts;
		}

		public void setAccounts(List<AccountsItem> accounts) {
			this.accounts = accounts;
		}

		public static class AccountsItem {

			private String accountPrivilege;

			private String accountStatus;

			private String accountPrivilegeDetail;

			private String accountDescription;

			private String accountID;

			private String accountName;

			private String privExceeded;

			private String engine;

			private String accountType;

			public String getAccountPrivilege() {
				return this.accountPrivilege;
			}

			public void setAccountPrivilege(String accountPrivilege) {
				this.accountPrivilege = accountPrivilege;
			}

			public String getAccountStatus() {
				return this.accountStatus;
			}

			public void setAccountStatus(String accountStatus) {
				this.accountStatus = accountStatus;
			}

			public String getAccountPrivilegeDetail() {
				return this.accountPrivilegeDetail;
			}

			public void setAccountPrivilegeDetail(String accountPrivilegeDetail) {
				this.accountPrivilegeDetail = accountPrivilegeDetail;
			}

			public String getAccountDescription() {
				return this.accountDescription;
			}

			public void setAccountDescription(String accountDescription) {
				this.accountDescription = accountDescription;
			}

			public String getAccountID() {
				return this.accountID;
			}

			public void setAccountID(String accountID) {
				this.accountID = accountID;
			}

			public String getAccountName() {
				return this.accountName;
			}

			public void setAccountName(String accountName) {
				this.accountName = accountName;
			}

			public String getPrivExceeded() {
				return this.privExceeded;
			}

			public void setPrivExceeded(String privExceeded) {
				this.privExceeded = privExceeded;
			}

			public String getEngine() {
				return this.engine;
			}

			public void setEngine(String engine) {
				this.engine = engine;
			}

			public String getAccountType() {
				return this.accountType;
			}

			public void setAccountType(String accountType) {
				this.accountType = accountType;
			}
		}
	}

	public static class ReportsItem {

		private String checkType;

		private String severity;

		private String reasonCode;

		private String reasonMessage;

		public String getCheckType() {
			return this.checkType;
		}

		public void setCheckType(String checkType) {
			this.checkType = checkType;
		}

		public String getSeverity() {
			return this.severity;
		}

		public void setSeverity(String severity) {
			this.severity = severity;
		}

		public String getReasonCode() {
			return this.reasonCode;
		}

		public void setReasonCode(String reasonCode) {
			this.reasonCode = reasonCode;
		}

		public String getReasonMessage() {
			return this.reasonMessage;
		}

		public void setReasonMessage(String reasonMessage) {
			this.reasonMessage = reasonMessage;
		}
	}

	@Override
	public EvaluateFailOverSwitchResponse getInstance(UnmarshallerContext context) {
		return	EvaluateFailOverSwitchResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
