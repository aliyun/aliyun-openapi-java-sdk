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
import com.aliyuncs.sddp.transform.v20190103.DescribeTablesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTablesResponse extends AcsResponse {

	private Integer currentPage;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<Table> items;

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

	public List<Table> getItems() {
		return this.items;
	}

	public void setItems(List<Table> items) {
		this.items = items;
	}

	public static class Table {

		private Long creationTime;

		private String owner;

		private String countDetails;

		private String sensitiveRatio;

		private String tenantName;

		private String departName;

		private Long riskLevelId;

		private String instanceName;

		private Integer s3Count;

		private Integer s1Count;

		private String productId;

		private String name;

		private Integer s2Count;

		private Long instanceId;

		private Integer totalCount;

		private String instanceDescription;

		private Boolean sensitive;

		private String sensLevelName;

		private Long lastScanTime;

		private String regionName;

		private String riskLevelName;

		private Integer totalRows;

		private Integer sensitiveCount;

		private Long id;

		private String productCode;

		private String objectHex;

		private Integer dataType;

		private List<Rule> ruleList;

		public Long getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(Long creationTime) {
			this.creationTime = creationTime;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getCountDetails() {
			return this.countDetails;
		}

		public void setCountDetails(String countDetails) {
			this.countDetails = countDetails;
		}

		public String getSensitiveRatio() {
			return this.sensitiveRatio;
		}

		public void setSensitiveRatio(String sensitiveRatio) {
			this.sensitiveRatio = sensitiveRatio;
		}

		public String getTenantName() {
			return this.tenantName;
		}

		public void setTenantName(String tenantName) {
			this.tenantName = tenantName;
		}

		public String getDepartName() {
			return this.departName;
		}

		public void setDepartName(String departName) {
			this.departName = departName;
		}

		public Long getRiskLevelId() {
			return this.riskLevelId;
		}

		public void setRiskLevelId(Long riskLevelId) {
			this.riskLevelId = riskLevelId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public Integer getS3Count() {
			return this.s3Count;
		}

		public void setS3Count(Integer s3Count) {
			this.s3Count = s3Count;
		}

		public Integer getS1Count() {
			return this.s1Count;
		}

		public void setS1Count(Integer s1Count) {
			this.s1Count = s1Count;
		}

		public String getProductId() {
			return this.productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getS2Count() {
			return this.s2Count;
		}

		public void setS2Count(Integer s2Count) {
			this.s2Count = s2Count;
		}

		public Long getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Long instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public String getInstanceDescription() {
			return this.instanceDescription;
		}

		public void setInstanceDescription(String instanceDescription) {
			this.instanceDescription = instanceDescription;
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

		public Long getLastScanTime() {
			return this.lastScanTime;
		}

		public void setLastScanTime(Long lastScanTime) {
			this.lastScanTime = lastScanTime;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public String getRiskLevelName() {
			return this.riskLevelName;
		}

		public void setRiskLevelName(String riskLevelName) {
			this.riskLevelName = riskLevelName;
		}

		public Integer getTotalRows() {
			return this.totalRows;
		}

		public void setTotalRows(Integer totalRows) {
			this.totalRows = totalRows;
		}

		public Integer getSensitiveCount() {
			return this.sensitiveCount;
		}

		public void setSensitiveCount(Integer sensitiveCount) {
			this.sensitiveCount = sensitiveCount;
		}

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

		public String getObjectHex() {
			return this.objectHex;
		}

		public void setObjectHex(String objectHex) {
			this.objectHex = objectHex;
		}

		public Integer getDataType() {
			return this.dataType;
		}

		public void setDataType(Integer dataType) {
			this.dataType = dataType;
		}

		public List<Rule> getRuleList() {
			return this.ruleList;
		}

		public void setRuleList(List<Rule> ruleList) {
			this.ruleList = ruleList;
		}

		public static class Rule {

			private String displayName;

			private String name;

			private Long riskLevelId;

			private Long count;

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Long getRiskLevelId() {
				return this.riskLevelId;
			}

			public void setRiskLevelId(Long riskLevelId) {
				this.riskLevelId = riskLevelId;
			}

			public Long getCount() {
				return this.count;
			}

			public void setCount(Long count) {
				this.count = count;
			}
		}
	}

	@Override
	public DescribeTablesResponse getInstance(UnmarshallerContext context) {
		return	DescribeTablesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
