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

package com.aliyuncs.sddp.model.v20190103;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sddp.transform.v20190103.DescribeAuditLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAuditLogsResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalCount;

	private List<Log> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Log> getItems() {
		return this.items;
	}

	public void setItems(List<Log> items) {
		this.items = items;
	}

	public static class Log {

		private Long id;

		private String productCode;

		private Long productId;

		private Long logTime;

		private String userId;

		private String userName;

		private String clientIp;

		private String clientPort;

		private String clientUa;

		private String instanceName;

		private Long creationTime;

		private String databaseName;

		private String tableName;

		private String columnName;

		private String packageName;

		private String ossObjectKey;

		private Long executeTime;

		private Long effectRow;

		private String operateType;

		private String ruleId;

		private String ruleName;

		private String warnLevel;

		private Integer executeStatus;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public Long getProductId() {
			return this.productId;
		}

		public void setProductId(Long productId) {
			this.productId = productId;
		}

		public Long getLogTime() {
			return this.logTime;
		}

		public void setLogTime(Long logTime) {
			this.logTime = logTime;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getClientIp() {
			return this.clientIp;
		}

		public void setClientIp(String clientIp) {
			this.clientIp = clientIp;
		}

		public String getClientPort() {
			return this.clientPort;
		}

		public void setClientPort(String clientPort) {
			this.clientPort = clientPort;
		}

		public String getClientUa() {
			return this.clientUa;
		}

		public void setClientUa(String clientUa) {
			this.clientUa = clientUa;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public Long getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(Long creationTime) {
			this.creationTime = creationTime;
		}

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getColumnName() {
			return this.columnName;
		}

		public void setColumnName(String columnName) {
			this.columnName = columnName;
		}

		public String getPackageName() {
			return this.packageName;
		}

		public void setPackageName(String packageName) {
			this.packageName = packageName;
		}

		public String getOssObjectKey() {
			return this.ossObjectKey;
		}

		public void setOssObjectKey(String ossObjectKey) {
			this.ossObjectKey = ossObjectKey;
		}

		public Long getExecuteTime() {
			return this.executeTime;
		}

		public void setExecuteTime(Long executeTime) {
			this.executeTime = executeTime;
		}

		public Long getEffectRow() {
			return this.effectRow;
		}

		public void setEffectRow(Long effectRow) {
			this.effectRow = effectRow;
		}

		public String getOperateType() {
			return this.operateType;
		}

		public void setOperateType(String operateType) {
			this.operateType = operateType;
		}

		public String getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(String ruleId) {
			this.ruleId = ruleId;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getWarnLevel() {
			return this.warnLevel;
		}

		public void setWarnLevel(String warnLevel) {
			this.warnLevel = warnLevel;
		}

		public Integer getExecuteStatus() {
			return this.executeStatus;
		}

		public void setExecuteStatus(Integer executeStatus) {
			this.executeStatus = executeStatus;
		}
	}

	@Override
	public DescribeAuditLogsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAuditLogsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
