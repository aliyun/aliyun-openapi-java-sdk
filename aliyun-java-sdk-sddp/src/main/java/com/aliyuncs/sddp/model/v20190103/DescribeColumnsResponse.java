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
import com.aliyuncs.sddp.transform.v20190103.DescribeColumnsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeColumnsResponse extends AcsResponse {

	private Integer currentPage;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<Column> items;

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Column> getItems() {
		return this.items;
	}

	public void setItems(List<Column> items) {
		this.items = items;
	}

	public static class Column {

		private Long creationTime;

		private String tableName;

		private String dataType;

		private Integer odpsRiskLevelValue;

		private String departName;

		private Long instanceId;

		private Long riskLevelId;

		private String ruleName;

		private Long ruleId;

		private Boolean sensitive;

		private String sensLevelName;

		private String instanceName;

		private String riskLevelName;

		private String odpsRiskLevelName;

		private String name;

		private Long tableId;

		private String id;

		private String productCode;

		private Long revisionStatus;

		private Long revisionId;

		private List<String> sampleList;

		public Long getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(Long creationTime) {
			this.creationTime = creationTime;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getDataType() {
			return this.dataType;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}

		public Integer getOdpsRiskLevelValue() {
			return this.odpsRiskLevelValue;
		}

		public void setOdpsRiskLevelValue(Integer odpsRiskLevelValue) {
			this.odpsRiskLevelValue = odpsRiskLevelValue;
		}

		public String getDepartName() {
			return this.departName;
		}

		public void setDepartName(String departName) {
			this.departName = departName;
		}

		public Long getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Long instanceId) {
			this.instanceId = instanceId;
		}

		public Long getRiskLevelId() {
			return this.riskLevelId;
		}

		public void setRiskLevelId(Long riskLevelId) {
			this.riskLevelId = riskLevelId;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public Long getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Long ruleId) {
			this.ruleId = ruleId;
		}

		public Boolean getSensitive() {
			return this.sensitive;
		}

		public void setSensitive(Boolean sensitive) {
			this.sensitive = sensitive;
		}

		public String getSensLevelName() {
			return this.sensLevelName;
		}

		public void setSensLevelName(String sensLevelName) {
			this.sensLevelName = sensLevelName;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getRiskLevelName() {
			return this.riskLevelName;
		}

		public void setRiskLevelName(String riskLevelName) {
			this.riskLevelName = riskLevelName;
		}

		public String getOdpsRiskLevelName() {
			return this.odpsRiskLevelName;
		}

		public void setOdpsRiskLevelName(String odpsRiskLevelName) {
			this.odpsRiskLevelName = odpsRiskLevelName;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getTableId() {
			return this.tableId;
		}

		public void setTableId(Long tableId) {
			this.tableId = tableId;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public Long getRevisionStatus() {
			return this.revisionStatus;
		}

		public void setRevisionStatus(Long revisionStatus) {
			this.revisionStatus = revisionStatus;
		}

		public Long getRevisionId() {
			return this.revisionId;
		}

		public void setRevisionId(Long revisionId) {
			this.revisionId = revisionId;
		}

		public List<String> getSampleList() {
			return this.sampleList;
		}

		public void setSampleList(List<String> sampleList) {
			this.sampleList = sampleList;
		}
	}

	@Override
	public DescribeColumnsResponse getInstance(UnmarshallerContext context) {
		return	DescribeColumnsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
