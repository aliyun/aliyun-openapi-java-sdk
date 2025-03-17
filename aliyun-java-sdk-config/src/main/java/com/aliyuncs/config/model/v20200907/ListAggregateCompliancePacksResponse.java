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

package com.aliyuncs.config.model.v20200907;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20200907.ListAggregateCompliancePacksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAggregateCompliancePacksResponse extends AcsResponse {

	private String requestId;

	private CompliancePacksResult compliancePacksResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public CompliancePacksResult getCompliancePacksResult() {
		return this.compliancePacksResult;
	}

	public void setCompliancePacksResult(CompliancePacksResult compliancePacksResult) {
		this.compliancePacksResult = compliancePacksResult;
	}

	public static class CompliancePacksResult {

		private Integer pageSize;

		private Integer pageNumber;

		private Long totalCount;

		private List<CompliancePacksItem> compliancePacks;

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<CompliancePacksItem> getCompliancePacks() {
			return this.compliancePacks;
		}

		public void setCompliancePacks(List<CompliancePacksItem> compliancePacks) {
			this.compliancePacks = compliancePacks;
		}

		public static class CompliancePacksItem {

			private String status;

			private Integer riskLevel;

			private String compliancePackId;

			private String description;

			private String compliancePackName;

			private Long accountId;

			private String aggregatorId;

			private String compliancePackTemplateId;

			private Long createTimestamp;

			private List<TagsItem> tags;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Integer getRiskLevel() {
				return this.riskLevel;
			}

			public void setRiskLevel(Integer riskLevel) {
				this.riskLevel = riskLevel;
			}

			public String getCompliancePackId() {
				return this.compliancePackId;
			}

			public void setCompliancePackId(String compliancePackId) {
				this.compliancePackId = compliancePackId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getCompliancePackName() {
				return this.compliancePackName;
			}

			public void setCompliancePackName(String compliancePackName) {
				this.compliancePackName = compliancePackName;
			}

			public Long getAccountId() {
				return this.accountId;
			}

			public void setAccountId(Long accountId) {
				this.accountId = accountId;
			}

			public String getAggregatorId() {
				return this.aggregatorId;
			}

			public void setAggregatorId(String aggregatorId) {
				this.aggregatorId = aggregatorId;
			}

			public String getCompliancePackTemplateId() {
				return this.compliancePackTemplateId;
			}

			public void setCompliancePackTemplateId(String compliancePackTemplateId) {
				this.compliancePackTemplateId = compliancePackTemplateId;
			}

			public Long getCreateTimestamp() {
				return this.createTimestamp;
			}

			public void setCreateTimestamp(Long createTimestamp) {
				this.createTimestamp = createTimestamp;
			}

			public List<TagsItem> getTags() {
				return this.tags;
			}

			public void setTags(List<TagsItem> tags) {
				this.tags = tags;
			}

			public static class TagsItem {

				private String tagKey;

				private String tagValue;

				public String getTagKey() {
					return this.tagKey;
				}

				public void setTagKey(String tagKey) {
					this.tagKey = tagKey;
				}

				public String getTagValue() {
					return this.tagValue;
				}

				public void setTagValue(String tagValue) {
					this.tagValue = tagValue;
				}
			}
		}
	}

	@Override
	public ListAggregateCompliancePacksResponse getInstance(UnmarshallerContext context) {
		return	ListAggregateCompliancePacksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
