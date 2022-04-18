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
import com.aliyuncs.sddp.transform.v20190103.DescribeDataAssetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataAssetsResponse extends AcsResponse {

	private Integer currentPage;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<Asset> items;

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

	public List<Asset> getItems() {
		return this.items;
	}

	public void setItems(List<Asset> items) {
		this.items = items;
	}

	public static class Asset {

		private String acl;

		private Long creationTime;

		private String dataType;

		private String owner;

		private String sensitiveRatio;

		private Boolean protection;

		private String departName;

		private Boolean labelsec;

		private Integer totalCount;

		private Long riskLevelId;

		private String ruleName;

		private Boolean sensitive;

		private String objectKey;

		private String riskLevelName;

		private String odpsRiskLevelName;

		private String productId;

		private String name;

		private Integer sensitiveCount;

		private String id;

		private String productCode;

		public String getAcl() {
			return this.acl;
		}

		public void setAcl(String acl) {
			this.acl = acl;
		}

		public Long getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(Long creationTime) {
			this.creationTime = creationTime;
		}

		public String getDataType() {
			return this.dataType;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getSensitiveRatio() {
			return this.sensitiveRatio;
		}

		public void setSensitiveRatio(String sensitiveRatio) {
			this.sensitiveRatio = sensitiveRatio;
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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
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

		public Boolean getSensitive() {
			return this.sensitive;
		}

		public void setSensitive(Boolean sensitive) {
			this.sensitive = sensitive;
		}

		public String getObjectKey() {
			return this.objectKey;
		}

		public void setObjectKey(String objectKey) {
			this.objectKey = objectKey;
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

		public Integer getSensitiveCount() {
			return this.sensitiveCount;
		}

		public void setSensitiveCount(Integer sensitiveCount) {
			this.sensitiveCount = sensitiveCount;
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
	}

	@Override
	public DescribeDataAssetsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataAssetsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
