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

package com.aliyuncs.bdrc.model.v20230808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bdrc.transform.v20230808.DescribeTopRiskyResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTopRiskyResourcesResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String nextToken;

		private Integer maxResults;

		private Long totalCount;

		private List<ContentItem> content;

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public Integer getMaxResults() {
			return this.maxResults;
		}

		public void setMaxResults(Integer maxResults) {
			this.maxResults = maxResults;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<ContentItem> getContent() {
			return this.content;
		}

		public void setContent(List<ContentItem> content) {
			this.content = content;
		}

		public static class ContentItem {

			private String resourceArn;

			private String productType;

			private String resourceType;

			private String resourceId;

			private String resourceName;

			private String regionId;

			private String zoneId;

			private String vpcId;

			private String vSwitchId;

			private Long createTime;

			private String status;

			private Long totalDataSize;

			private Long standardDataSize;

			private Long iaDataSize;

			private Long archiveDataSize;

			private Long coldArchiveDataSize;

			private String resourceAttr;

			private Boolean enableCheck;

			private Integer protectionScore;

			private Long protectionScoreUpdatedTime;

			private Long riskCount;

			private Long checkFailedCount;

			public String getResourceArn() {
				return this.resourceArn;
			}

			public void setResourceArn(String resourceArn) {
				this.resourceArn = resourceArn;
			}

			public String getProductType() {
				return this.productType;
			}

			public void setProductType(String productType) {
				this.productType = productType;
			}

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public String getResourceId() {
				return this.resourceId;
			}

			public void setResourceId(String resourceId) {
				this.resourceId = resourceId;
			}

			public String getResourceName() {
				return this.resourceName;
			}

			public void setResourceName(String resourceName) {
				this.resourceName = resourceName;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Long getTotalDataSize() {
				return this.totalDataSize;
			}

			public void setTotalDataSize(Long totalDataSize) {
				this.totalDataSize = totalDataSize;
			}

			public Long getStandardDataSize() {
				return this.standardDataSize;
			}

			public void setStandardDataSize(Long standardDataSize) {
				this.standardDataSize = standardDataSize;
			}

			public Long getIaDataSize() {
				return this.iaDataSize;
			}

			public void setIaDataSize(Long iaDataSize) {
				this.iaDataSize = iaDataSize;
			}

			public Long getArchiveDataSize() {
				return this.archiveDataSize;
			}

			public void setArchiveDataSize(Long archiveDataSize) {
				this.archiveDataSize = archiveDataSize;
			}

			public Long getColdArchiveDataSize() {
				return this.coldArchiveDataSize;
			}

			public void setColdArchiveDataSize(Long coldArchiveDataSize) {
				this.coldArchiveDataSize = coldArchiveDataSize;
			}

			public String getResourceAttr() {
				return this.resourceAttr;
			}

			public void setResourceAttr(String resourceAttr) {
				this.resourceAttr = resourceAttr;
			}

			public Boolean getEnableCheck() {
				return this.enableCheck;
			}

			public void setEnableCheck(Boolean enableCheck) {
				this.enableCheck = enableCheck;
			}

			public Integer getProtectionScore() {
				return this.protectionScore;
			}

			public void setProtectionScore(Integer protectionScore) {
				this.protectionScore = protectionScore;
			}

			public Long getProtectionScoreUpdatedTime() {
				return this.protectionScoreUpdatedTime;
			}

			public void setProtectionScoreUpdatedTime(Long protectionScoreUpdatedTime) {
				this.protectionScoreUpdatedTime = protectionScoreUpdatedTime;
			}

			public Long getRiskCount() {
				return this.riskCount;
			}

			public void setRiskCount(Long riskCount) {
				this.riskCount = riskCount;
			}

			public Long getCheckFailedCount() {
				return this.checkFailedCount;
			}

			public void setCheckFailedCount(Long checkFailedCount) {
				this.checkFailedCount = checkFailedCount;
			}
		}
	}

	@Override
	public DescribeTopRiskyResourcesResponse getInstance(UnmarshallerContext context) {
		return	DescribeTopRiskyResourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
