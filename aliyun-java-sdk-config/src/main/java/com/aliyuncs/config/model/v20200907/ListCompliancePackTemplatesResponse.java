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
import com.aliyuncs.config.transform.v20200907.ListCompliancePackTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCompliancePackTemplatesResponse extends AcsResponse {

	private String requestId;

	private CompliancePackTemplatesResult compliancePackTemplatesResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public CompliancePackTemplatesResult getCompliancePackTemplatesResult() {
		return this.compliancePackTemplatesResult;
	}

	public void setCompliancePackTemplatesResult(CompliancePackTemplatesResult compliancePackTemplatesResult) {
		this.compliancePackTemplatesResult = compliancePackTemplatesResult;
	}

	public static class CompliancePackTemplatesResult {

		private Integer pageSize;

		private Integer pageNumber;

		private Long totalCount;

		private List<CompliancePackTemplate> compliancePackTemplates;

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

		public List<CompliancePackTemplate> getCompliancePackTemplates() {
			return this.compliancePackTemplates;
		}

		public void setCompliancePackTemplates(List<CompliancePackTemplate> compliancePackTemplates) {
			this.compliancePackTemplates = compliancePackTemplates;
		}

		public static class CompliancePackTemplate {

			private Integer riskLevel;

			private String description;

			private String automationHelpUrl;

			private String compliancePackTemplateName;

			private String compliancePackTemplateId;

			private List<ConfigRulesItem> configRules;

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

			public String getAutomationHelpUrl() {
				return this.automationHelpUrl;
			}

			public void setAutomationHelpUrl(String automationHelpUrl) {
				this.automationHelpUrl = automationHelpUrl;
			}

			public String getCompliancePackTemplateName() {
				return this.compliancePackTemplateName;
			}

			public void setCompliancePackTemplateName(String compliancePackTemplateName) {
				this.compliancePackTemplateName = compliancePackTemplateName;
			}

			public String getCompliancePackTemplateId() {
				return this.compliancePackTemplateId;
			}

			public void setCompliancePackTemplateId(String compliancePackTemplateId) {
				this.compliancePackTemplateId = compliancePackTemplateId;
			}

			public List<ConfigRulesItem> getConfigRules() {
				return this.configRules;
			}

			public void setConfigRules(List<ConfigRulesItem> configRules) {
				this.configRules = configRules;
			}

			public static class ConfigRulesItem {

				private String description;

				private String managedRuleIdentifier;

				private String managedRuleName;

				private Integer riskLevel;

				private List<ConfigRuleParametersItem> configRuleParameters;

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getManagedRuleIdentifier() {
					return this.managedRuleIdentifier;
				}

				public void setManagedRuleIdentifier(String managedRuleIdentifier) {
					this.managedRuleIdentifier = managedRuleIdentifier;
				}

				public String getManagedRuleName() {
					return this.managedRuleName;
				}

				public void setManagedRuleName(String managedRuleName) {
					this.managedRuleName = managedRuleName;
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
		}
	}

	@Override
	public ListCompliancePackTemplatesResponse getInstance(UnmarshallerContext context) {
		return	ListCompliancePackTemplatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
