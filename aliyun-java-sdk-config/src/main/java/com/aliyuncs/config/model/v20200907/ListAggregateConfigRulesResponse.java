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
import com.aliyuncs.config.transform.v20200907.ListAggregateConfigRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAggregateConfigRulesResponse extends AcsResponse {

	private String requestId;

	private ConfigRules configRules;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ConfigRules getConfigRules() {
		return this.configRules;
	}

	public void setConfigRules(ConfigRules configRules) {
		this.configRules = configRules;
	}

	public static class ConfigRules {

		private Integer pageSize;

		private Integer pageNumber;

		private Long totalCount;

		private List<ConfigRule> configRuleList;

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

		public List<ConfigRule> getConfigRuleList() {
			return this.configRuleList;
		}

		public void setConfigRuleList(List<ConfigRule> configRuleList) {
			this.configRuleList = configRuleList;
		}

		public static class ConfigRule {

			private Integer riskLevel;

			private String sourceOwner;

			private Long accountId;

			private String configRuleState;

			private String sourceIdentifier;

			private String configRuleArn;

			private String description;

			private String automationType;

			private String configRuleName;

			private String configRuleId;

			private List<Tag> tags;

			private Compliance compliance;

			private CreateBy createBy;

			public Integer getRiskLevel() {
				return this.riskLevel;
			}

			public void setRiskLevel(Integer riskLevel) {
				this.riskLevel = riskLevel;
			}

			public String getSourceOwner() {
				return this.sourceOwner;
			}

			public void setSourceOwner(String sourceOwner) {
				this.sourceOwner = sourceOwner;
			}

			public Long getAccountId() {
				return this.accountId;
			}

			public void setAccountId(Long accountId) {
				this.accountId = accountId;
			}

			public String getConfigRuleState() {
				return this.configRuleState;
			}

			public void setConfigRuleState(String configRuleState) {
				this.configRuleState = configRuleState;
			}

			public String getSourceIdentifier() {
				return this.sourceIdentifier;
			}

			public void setSourceIdentifier(String sourceIdentifier) {
				this.sourceIdentifier = sourceIdentifier;
			}

			public String getConfigRuleArn() {
				return this.configRuleArn;
			}

			public void setConfigRuleArn(String configRuleArn) {
				this.configRuleArn = configRuleArn;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getAutomationType() {
				return this.automationType;
			}

			public void setAutomationType(String automationType) {
				this.automationType = automationType;
			}

			public String getConfigRuleName() {
				return this.configRuleName;
			}

			public void setConfigRuleName(String configRuleName) {
				this.configRuleName = configRuleName;
			}

			public String getConfigRuleId() {
				return this.configRuleId;
			}

			public void setConfigRuleId(String configRuleId) {
				this.configRuleId = configRuleId;
			}

			public List<Tag> getTags() {
				return this.tags;
			}

			public void setTags(List<Tag> tags) {
				this.tags = tags;
			}

			public Compliance getCompliance() {
				return this.compliance;
			}

			public void setCompliance(Compliance compliance) {
				this.compliance = compliance;
			}

			public CreateBy getCreateBy() {
				return this.createBy;
			}

			public void setCreateBy(CreateBy createBy) {
				this.createBy = createBy;
			}

			public static class Tag {

				private String key;

				private String value;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Compliance {

				private String complianceType;

				private Integer count;

				public String getComplianceType() {
					return this.complianceType;
				}

				public void setComplianceType(String complianceType) {
					this.complianceType = complianceType;
				}

				public Integer getCount() {
					return this.count;
				}

				public void setCount(Integer count) {
					this.count = count;
				}
			}

			public static class CreateBy {

				private String compliancePackId;

				private String aggregatorName;

				private String compliancePackName;

				private String creatorName;

				private String creatorType;

				private String creatorId;

				private String aggregatorId;

				public String getCompliancePackId() {
					return this.compliancePackId;
				}

				public void setCompliancePackId(String compliancePackId) {
					this.compliancePackId = compliancePackId;
				}

				public String getAggregatorName() {
					return this.aggregatorName;
				}

				public void setAggregatorName(String aggregatorName) {
					this.aggregatorName = aggregatorName;
				}

				public String getCompliancePackName() {
					return this.compliancePackName;
				}

				public void setCompliancePackName(String compliancePackName) {
					this.compliancePackName = compliancePackName;
				}

				public String getCreatorName() {
					return this.creatorName;
				}

				public void setCreatorName(String creatorName) {
					this.creatorName = creatorName;
				}

				public String getCreatorType() {
					return this.creatorType;
				}

				public void setCreatorType(String creatorType) {
					this.creatorType = creatorType;
				}

				public String getCreatorId() {
					return this.creatorId;
				}

				public void setCreatorId(String creatorId) {
					this.creatorId = creatorId;
				}

				public String getAggregatorId() {
					return this.aggregatorId;
				}

				public void setAggregatorId(String aggregatorId) {
					this.aggregatorId = aggregatorId;
				}
			}
		}
	}

	@Override
	public ListAggregateConfigRulesResponse getInstance(UnmarshallerContext context) {
		return	ListAggregateConfigRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
