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
import com.aliyuncs.sddp.transform.v20190103.DescribeInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstancesResponse extends AcsResponse {

	private Integer currentPage;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<Instance> items;

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

	public List<Instance> getItems() {
		return this.items;
	}

	public void setItems(List<Instance> items) {
		this.items = items;
	}

	public static class Instance {

		private Long creationTime;

		private String acl;

		private Long lastFinishTime;

		private String owner;

		private String countDetails;

		private String fileCountDetails;

		private String tenantName;

		private Boolean protection;

		private String departName;

		private Boolean labelsec;

		private Float riskScore;

		private Long riskLevelId;

		private Integer s3Count;

		private Integer s1Count;

		private String productId;

		private String name;

		private Integer s2Count;

		private String engineType;

		private Integer totalCount;

		private String instanceDescription;

		private String ruleName;

		private String regionId;

		private Boolean sensitive;

		private String sensLevelName;

		private String regionName;

		private Float lastRiskScore;

		private String riskLevelName;

		private String odpsRiskLevelName;

		private Integer sensitiveCount;

		private Long id;

		private String productCode;

		public Long getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(Long creationTime) {
			this.creationTime = creationTime;
		}

		public String getAcl() {
			return this.acl;
		}

		public void setAcl(String acl) {
			this.acl = acl;
		}

		public Long getLastFinishTime() {
			return this.lastFinishTime;
		}

		public void setLastFinishTime(Long lastFinishTime) {
			this.lastFinishTime = lastFinishTime;
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

		public String getFileCountDetails() {
			return this.fileCountDetails;
		}

		public void setFileCountDetails(String fileCountDetails) {
			this.fileCountDetails = fileCountDetails;
		}

		public String getTenantName() {
			return this.tenantName;
		}

		public void setTenantName(String tenantName) {
			this.tenantName = tenantName;
		}

		public Boolean getProtection() {
			return this.protection;
		}

		public void setProtection(Boolean protection) {
			this.protection = protection;
		}

		public String getDepartName() {
			return this.departName;
		}

		public void setDepartName(String departName) {
			this.departName = departName;
		}

		public Boolean getLabelsec() {
			return this.labelsec;
		}

		public void setLabelsec(Boolean labelsec) {
			this.labelsec = labelsec;
		}

		public Float getRiskScore() {
			return this.riskScore;
		}

		public void setRiskScore(Float riskScore) {
			this.riskScore = riskScore;
		}

		public Long getRiskLevelId() {
			return this.riskLevelId;
		}

		public void setRiskLevelId(Long riskLevelId) {
			this.riskLevelId = riskLevelId;
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

		public String getEngineType() {
			return this.engineType;
		}

		public void setEngineType(String engineType) {
			this.engineType = engineType;
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

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
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

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public Float getLastRiskScore() {
			return this.lastRiskScore;
		}

		public void setLastRiskScore(Float lastRiskScore) {
			this.lastRiskScore = lastRiskScore;
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
	}

	@Override
	public DescribeInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
