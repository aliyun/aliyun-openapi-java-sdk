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
import com.aliyuncs.config.transform.v20200907.ListAggregatorsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAggregatorsResponse extends AcsResponse {

	private String requestId;

	private AggregatorsResult aggregatorsResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AggregatorsResult getAggregatorsResult() {
		return this.aggregatorsResult;
	}

	public void setAggregatorsResult(AggregatorsResult aggregatorsResult) {
		this.aggregatorsResult = aggregatorsResult;
	}

	public static class AggregatorsResult {

		private String nextToken;

		private Integer maxResults;

		private List<AggregatorsItem> aggregators;

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

		public List<AggregatorsItem> getAggregators() {
			return this.aggregators;
		}

		public void setAggregators(List<AggregatorsItem> aggregators) {
			this.aggregators = aggregators;
		}

		public static class AggregatorsItem {

			private Long aggregatorCreateTimestamp;

			private Long aggregatorAccountCount;

			private String description;

			private String aggregatorName;

			private Integer aggregatorStatus;

			private String aggregatorType;

			private Long accountId;

			private String aggregatorId;

			private String folderId;

			private List<TagsItem> tags;

			public Long getAggregatorCreateTimestamp() {
				return this.aggregatorCreateTimestamp;
			}

			public void setAggregatorCreateTimestamp(Long aggregatorCreateTimestamp) {
				this.aggregatorCreateTimestamp = aggregatorCreateTimestamp;
			}

			public Long getAggregatorAccountCount() {
				return this.aggregatorAccountCount;
			}

			public void setAggregatorAccountCount(Long aggregatorAccountCount) {
				this.aggregatorAccountCount = aggregatorAccountCount;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getAggregatorName() {
				return this.aggregatorName;
			}

			public void setAggregatorName(String aggregatorName) {
				this.aggregatorName = aggregatorName;
			}

			public Integer getAggregatorStatus() {
				return this.aggregatorStatus;
			}

			public void setAggregatorStatus(Integer aggregatorStatus) {
				this.aggregatorStatus = aggregatorStatus;
			}

			public String getAggregatorType() {
				return this.aggregatorType;
			}

			public void setAggregatorType(String aggregatorType) {
				this.aggregatorType = aggregatorType;
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

			public String getFolderId() {
				return this.folderId;
			}

			public void setFolderId(String folderId) {
				this.folderId = folderId;
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
	public ListAggregatorsResponse getInstance(UnmarshallerContext context) {
		return	ListAggregatorsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
