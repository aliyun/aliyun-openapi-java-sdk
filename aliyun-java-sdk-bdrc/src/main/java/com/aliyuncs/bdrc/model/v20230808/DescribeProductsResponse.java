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
import com.aliyuncs.bdrc.transform.v20230808.DescribeProductsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeProductsResponse extends AcsResponse {

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

			private String productType;

			private Boolean enableCheck;

			private Integer protectionScore;

			private Long protectionScoreUpdatedTime;

			private Long totalResourceCount;

			private Long riskyResourceCount;

			private Long checkFailedResourceCount;

			private Long disableCheckResourceCount;

			private Long riskCount;

			private Long checkFailedCount;

			private List<ProtectionScoreDistributionItem> protectionScoreDistribution;

			public String getProductType() {
				return this.productType;
			}

			public void setProductType(String productType) {
				this.productType = productType;
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

			public Long getTotalResourceCount() {
				return this.totalResourceCount;
			}

			public void setTotalResourceCount(Long totalResourceCount) {
				this.totalResourceCount = totalResourceCount;
			}

			public Long getRiskyResourceCount() {
				return this.riskyResourceCount;
			}

			public void setRiskyResourceCount(Long riskyResourceCount) {
				this.riskyResourceCount = riskyResourceCount;
			}

			public Long getCheckFailedResourceCount() {
				return this.checkFailedResourceCount;
			}

			public void setCheckFailedResourceCount(Long checkFailedResourceCount) {
				this.checkFailedResourceCount = checkFailedResourceCount;
			}

			public Long getDisableCheckResourceCount() {
				return this.disableCheckResourceCount;
			}

			public void setDisableCheckResourceCount(Long disableCheckResourceCount) {
				this.disableCheckResourceCount = disableCheckResourceCount;
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

			public List<ProtectionScoreDistributionItem> getProtectionScoreDistribution() {
				return this.protectionScoreDistribution;
			}

			public void setProtectionScoreDistribution(List<ProtectionScoreDistributionItem> protectionScoreDistribution) {
				this.protectionScoreDistribution = protectionScoreDistribution;
			}

			public static class ProtectionScoreDistributionItem {

				private Long count;

				private Range range;

				public Long getCount() {
					return this.count;
				}

				public void setCount(Long count) {
					this.count = count;
				}

				public Range getRange() {
					return this.range;
				}

				public void setRange(Range range) {
					this.range = range;
				}

				public static class Range {

					private Integer from;

					private Integer to;

					public Integer getFrom() {
						return this.from;
					}

					public void setFrom(Integer from) {
						this.from = from;
					}

					public Integer getTo() {
						return this.to;
					}

					public void setTo(Integer to) {
						this.to = to;
					}
				}
			}
		}
	}

	@Override
	public DescribeProductsResponse getInstance(UnmarshallerContext context) {
		return	DescribeProductsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
