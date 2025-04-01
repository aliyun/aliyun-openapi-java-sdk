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
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeSqlAuditStatResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSqlAuditStatResponse extends AcsResponse {

	private String requestId;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String instanceId;

		private String tenantId;

		private String userClientIp;

		private String userName;

		private String databaseName;

		private String sqlId;

		private Long totalSucceed;

		private Long totalFailed;

		private Long totalAffectRows;

		private Long totalScanRows;

		private Long totalReturnRows;

		private Double affectRows;

		private Double scanRows;

		private Double returnRows;

		private Double executeTime;

		private String sqlStatement;

		private String operatorType;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getUserClientIp() {
			return this.userClientIp;
		}

		public void setUserClientIp(String userClientIp) {
			this.userClientIp = userClientIp;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
		}

		public String getSqlId() {
			return this.sqlId;
		}

		public void setSqlId(String sqlId) {
			this.sqlId = sqlId;
		}

		public Long getTotalSucceed() {
			return this.totalSucceed;
		}

		public void setTotalSucceed(Long totalSucceed) {
			this.totalSucceed = totalSucceed;
		}

		public Long getTotalFailed() {
			return this.totalFailed;
		}

		public void setTotalFailed(Long totalFailed) {
			this.totalFailed = totalFailed;
		}

		public Long getTotalAffectRows() {
			return this.totalAffectRows;
		}

		public void setTotalAffectRows(Long totalAffectRows) {
			this.totalAffectRows = totalAffectRows;
		}

		public Long getTotalScanRows() {
			return this.totalScanRows;
		}

		public void setTotalScanRows(Long totalScanRows) {
			this.totalScanRows = totalScanRows;
		}

		public Long getTotalReturnRows() {
			return this.totalReturnRows;
		}

		public void setTotalReturnRows(Long totalReturnRows) {
			this.totalReturnRows = totalReturnRows;
		}

		public Double getAffectRows() {
			return this.affectRows;
		}

		public void setAffectRows(Double affectRows) {
			this.affectRows = affectRows;
		}

		public Double getScanRows() {
			return this.scanRows;
		}

		public void setScanRows(Double scanRows) {
			this.scanRows = scanRows;
		}

		public Double getReturnRows() {
			return this.returnRows;
		}

		public void setReturnRows(Double returnRows) {
			this.returnRows = returnRows;
		}

		public Double getExecuteTime() {
			return this.executeTime;
		}

		public void setExecuteTime(Double executeTime) {
			this.executeTime = executeTime;
		}

		public String getSqlStatement() {
			return this.sqlStatement;
		}

		public void setSqlStatement(String sqlStatement) {
			this.sqlStatement = sqlStatement;
		}

		public String getOperatorType() {
			return this.operatorType;
		}

		public void setOperatorType(String operatorType) {
			this.operatorType = operatorType;
		}
	}

	@Override
	public DescribeSqlAuditStatResponse getInstance(UnmarshallerContext context) {
		return	DescribeSqlAuditStatResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
