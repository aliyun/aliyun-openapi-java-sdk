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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeSQLLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSQLLogsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private List<Item> items;

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

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public static class Item {

		private String dBName;

		private String accountName;

		private String operationExecuteTime;

		private String sQLText;

		private Long returnRowCounts;

		private Float executeCost;

		private String dBRole;

		private String sourceIP;

		private Integer sourcePort;

		private String executeState;

		private String operationClass;

		private String operationType;

		private Long scanRowCounts;

		private String sQLPlan;

		public String getDBName() {
			return this.dBName;
		}

		public void setDBName(String dBName) {
			this.dBName = dBName;
		}

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public String getOperationExecuteTime() {
			return this.operationExecuteTime;
		}

		public void setOperationExecuteTime(String operationExecuteTime) {
			this.operationExecuteTime = operationExecuteTime;
		}

		public String getSQLText() {
			return this.sQLText;
		}

		public void setSQLText(String sQLText) {
			this.sQLText = sQLText;
		}

		public Long getReturnRowCounts() {
			return this.returnRowCounts;
		}

		public void setReturnRowCounts(Long returnRowCounts) {
			this.returnRowCounts = returnRowCounts;
		}

		public Float getExecuteCost() {
			return this.executeCost;
		}

		public void setExecuteCost(Float executeCost) {
			this.executeCost = executeCost;
		}

		public String getDBRole() {
			return this.dBRole;
		}

		public void setDBRole(String dBRole) {
			this.dBRole = dBRole;
		}

		public String getSourceIP() {
			return this.sourceIP;
		}

		public void setSourceIP(String sourceIP) {
			this.sourceIP = sourceIP;
		}

		public Integer getSourcePort() {
			return this.sourcePort;
		}

		public void setSourcePort(Integer sourcePort) {
			this.sourcePort = sourcePort;
		}

		public String getExecuteState() {
			return this.executeState;
		}

		public void setExecuteState(String executeState) {
			this.executeState = executeState;
		}

		public String getOperationClass() {
			return this.operationClass;
		}

		public void setOperationClass(String operationClass) {
			this.operationClass = operationClass;
		}

		public String getOperationType() {
			return this.operationType;
		}

		public void setOperationType(String operationType) {
			this.operationType = operationType;
		}

		public Long getScanRowCounts() {
			return this.scanRowCounts;
		}

		public void setScanRowCounts(Long scanRowCounts) {
			this.scanRowCounts = scanRowCounts;
		}

		public String getSQLPlan() {
			return this.sQLPlan;
		}

		public void setSQLPlan(String sQLPlan) {
			this.sQLPlan = sQLPlan;
		}
	}

	@Override
	public DescribeSQLLogsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSQLLogsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
