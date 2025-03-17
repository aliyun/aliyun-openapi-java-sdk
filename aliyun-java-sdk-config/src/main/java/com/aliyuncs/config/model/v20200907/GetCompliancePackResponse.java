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
import com.aliyuncs.config.transform.v20200907.GetCompliancePackResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCompliancePackResponse extends AcsResponse {

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

		private String compliancePackId;

		private Integer riskLevel;

		private String description;

		private String templateContent;

		private String compliancePackName;

		private Long accountId;

		private String compliancePackTemplateId;

		private Long createTimestamp;

		private List<ConfigRulesItem> configRules;

		private List<TagsItem> tags;

		private Scope scope;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCompliancePackId() {
			return this.compliancePackId;
		}

		public void setCompliancePackId(String compliancePackId) {
			this.compliancePackId = compliancePackId;
		}

		public Integer getRiskLevel() {
			return this.riskLevel;
		}

		public void setRiskLevel(Integer riskLevel) {
			this.riskLevel = riskLevel;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getTemplateContent() {
			return this.templateContent;
		}

		public void setTemplateContent(String templateContent) {
			this.templateContent = templateContent;
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

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
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

			private String resourceTypesScope;

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

			public String getResourceTypesScope() {
				return this.resourceTypesScope;
			}

			public void setResourceTypesScope(String resourceTypesScope) {
				this.resourceTypesScope = resourceTypesScope;
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

		public static class Scope {

			private String excludeRegionIdsScope;

			private String resourceIdsScope;

			private String excludeResourceGroupIdsScope;

			private String tagKeyScope;

			private String tagValueScope;

			private String regionIdsScope;

			private String excludeResourceIdsScope;

			private String resourceGroupIdsScope;

			private List<TagsScopeItem> tagsScope;

			private List<ExcludeTagsScopeItem> excludeTagsScope;

			public String getExcludeRegionIdsScope() {
				return this.excludeRegionIdsScope;
			}

			public void setExcludeRegionIdsScope(String excludeRegionIdsScope) {
				this.excludeRegionIdsScope = excludeRegionIdsScope;
			}

			public String getResourceIdsScope() {
				return this.resourceIdsScope;
			}

			public void setResourceIdsScope(String resourceIdsScope) {
				this.resourceIdsScope = resourceIdsScope;
			}

			public String getExcludeResourceGroupIdsScope() {
				return this.excludeResourceGroupIdsScope;
			}

			public void setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
				this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
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

			public List<TagsScopeItem> getTagsScope() {
				return this.tagsScope;
			}

			public void setTagsScope(List<TagsScopeItem> tagsScope) {
				this.tagsScope = tagsScope;
			}

			public List<ExcludeTagsScopeItem> getExcludeTagsScope() {
				return this.excludeTagsScope;
			}

			public void setExcludeTagsScope(List<ExcludeTagsScopeItem> excludeTagsScope) {
				this.excludeTagsScope = excludeTagsScope;
			}

			public static class TagsScopeItem {

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

			public static class ExcludeTagsScopeItem {

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
	public GetCompliancePackResponse getInstance(UnmarshallerContext context) {
		return	GetCompliancePackResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
