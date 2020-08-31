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

package com.aliyuncs.config.model.v20190108;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20190108.ListConfigRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListConfigRulesResponse extends AcsResponse {

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

		private Integer pageNumber;

		private Integer pageSize;

		private Long totalCount;

		private List<ConfigRule> configRuleList;

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
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

			private Long accountId;

			private String configRuleArn;

			private String configRuleId;

			private String configRuleName;

			private String configRuleState;

			private String description;

			private Integer riskLevel;

			private String sourceIdentifier;

			private String sourceOwner;

			private String automationType;

			private Compliance compliance;

			private CreateBy createBy;

			public Long getAccountId() {
				return this.accountId;
			}

			public void setAccountId(Long accountId) {
				this.accountId = accountId;
			}

			public String getConfigRuleArn() {
				return this.configRuleArn;
			}

			public void setConfigRuleArn(String configRuleArn) {
				this.configRuleArn = configRuleArn;
			}

			public String getConfigRuleId() {
				return this.configRuleId;
			}

			public void setConfigRuleId(String configRuleId) {
				this.configRuleId = configRuleId;
			}

			public String getConfigRuleName() {
				return this.configRuleName;
			}

			public void setConfigRuleName(String configRuleName) {
				this.configRuleName = configRuleName;
			}

			public String getConfigRuleState() {
				return this.configRuleState;
			}

			public void setConfigRuleState(String configRuleState) {
				this.configRuleState = configRuleState;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Integer getRiskLevel() {
				return this.riskLevel;
			}

			public void setRiskLevel(Integer riskLevel) {
				this.riskLevel = riskLevel;
			}

			public String getSourceIdentifier() {
				return this.sourceIdentifier;
			}

			public void setSourceIdentifier(String sourceIdentifier) {
				this.sourceIdentifier = sourceIdentifier;
			}

			public String getSourceOwner() {
				return this.sourceOwner;
			}

			public void setSourceOwner(String sourceOwner) {
				this.sourceOwner = sourceOwner;
			}

			public String getAutomationType() {
				return this.automationType;
			}

			public void setAutomationType(String automationType) {
				this.automationType = automationType;
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

				private String creatorId;

				private String creatorName;

				private String creatorType;

				private String configRuleSceneId;

				private String configRuleSceneName;

				public String getCreatorId() {
					return this.creatorId;
				}

				public void setCreatorId(String creatorId) {
					this.creatorId = creatorId;
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

				public String getConfigRuleSceneId() {
					return this.configRuleSceneId;
				}

				public void setConfigRuleSceneId(String configRuleSceneId) {
					this.configRuleSceneId = configRuleSceneId;
				}

				public String getConfigRuleSceneName() {
					return this.configRuleSceneName;
				}

				public void setConfigRuleSceneName(String configRuleSceneName) {
					this.configRuleSceneName = configRuleSceneName;
				}
			}
		}
	}

	@Override
	public ListConfigRulesResponse getInstance(UnmarshallerContext context) {
		return	ListConfigRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
