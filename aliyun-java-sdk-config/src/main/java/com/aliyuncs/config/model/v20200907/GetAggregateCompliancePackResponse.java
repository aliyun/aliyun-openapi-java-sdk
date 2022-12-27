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
import com.aliyuncs.config.transform.v20200907.GetAggregateCompliancePackResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAggregateCompliancePackResponse extends AcsResponse {

	private String requestId;

	private CompliancePack compliancePack;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public CompliancePack getCompliancePack() {
		return this.compliancePack;
	}

	public void setCompliancePack(CompliancePack compliancePack) {
		this.compliancePack = compliancePack;
	}

	public static class CompliancePack {

		private String status;

		private Integer riskLevel;

		private String compliancePackId;

		private String description;

		private String compliancePackName;

		private Long accountId;

		private String aggregatorId;

		private String compliancePackTemplateId;

		private Long createTimestamp;

		private List<ConfigRulesItem> configRules;

		private Scope scope;

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

		public List<ConfigRulesItem> getConfigRules() {
			return this.configRules;
		}

		public void setConfigRules(List<ConfigRulesItem> configRules) {
			this.configRules = configRules;
		}

		public Scope getScope() {
			return this.scope;
		}

		public void setScope(Scope scope) {
			this.scope = scope;
		}

		public static class ConfigRulesItem {

			private String managedRuleIdentifier;

			private String configRuleName;

			private String configRuleId;

			private String description;

			private Integer riskLevel;

			private List<ConfigRuleParametersItem> configRuleParameters;

			public String getManagedRuleIdentifier() {
				return this.managedRuleIdentifier;
			}

			public void setManagedRuleIdentifier(String managedRuleIdentifier) {
				this.managedRuleIdentifier = managedRuleIdentifier;
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

			public List<ConfigRuleParametersItem> getConfigRuleParameters() {
				return this.configRuleParameters;
			}

			public void setConfigRuleParameters(List<ConfigRuleParametersItem> configRuleParameters) {
				this.configRuleParameters = configRuleParameters;
			}

			public static class ConfigRuleParametersItem {

				private Boolean required;

				private String parameterName;

				private String parameterValue;

				public Boolean getRequired() {
					return this.required;
				}

				public void setRequired(Boolean required) {
					this.required = required;
				}

				public String getParameterName() {
					return this.parameterName;
				}

				public void setParameterName(String parameterName) {
					this.parameterName = parameterName;
				}

				public String getParameterValue() {
					return this.parameterValue;
				}

				public void setParameterValue(String parameterValue) {
					this.parameterValue = parameterValue;
				}
			}
		}

		public static class Scope {

			private String regionIdsScope;

			private String excludeResourceIdsScope;

			private String resourceGroupIdsScope;

			private String tagKeyScope;

			private String tagValueScope;

			public String getRegionIdsScope() {
				return this.regionIdsScope;
			}

			public void setRegionIdsScope(String regionIdsScope) {
				this.regionIdsScope = regionIdsScope;
			}

			public String getExcludeResourceIdsScope() {
				return this.excludeResourceIdsScope;
			}

			public void setExcludeResourceIdsScope(String excludeResourceIdsScope) {
				this.excludeResourceIdsScope = excludeResourceIdsScope;
			}

			public String getResourceGroupIdsScope() {
				return this.resourceGroupIdsScope;
			}

			public void setResourceGroupIdsScope(String resourceGroupIdsScope) {
				this.resourceGroupIdsScope = resourceGroupIdsScope;
			}

			public String getTagKeyScope() {
				return this.tagKeyScope;
			}

			public void setTagKeyScope(String tagKeyScope) {
				this.tagKeyScope = tagKeyScope;
			}

			public String getTagValueScope() {
				return this.tagValueScope;
			}

			public void setTagValueScope(String tagValueScope) {
				this.tagValueScope = tagValueScope;
			}
		}
	}

	@Override
	public GetAggregateCompliancePackResponse getInstance(UnmarshallerContext context) {
		return	GetAggregateCompliancePackResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
