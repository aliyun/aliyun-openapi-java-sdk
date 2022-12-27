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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20200907.GetConfigRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetConfigRuleResponse extends AcsResponse {

	private String requestId;

	private ConfigRule configRule;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ConfigRule getConfigRule() {
		return this.configRule;
	}

	public void setConfigRule(ConfigRule configRule) {
		this.configRule = configRule;
	}

	public static class ConfigRule {

		private Integer riskLevel;

		private Map<Object,Object> inputParameters;

		private String configRuleState;

		private String maximumExecutionFrequency;

		private String configRuleArn;

		private String description;

		private String configRuleName;

		private String configRuleId;

		private Long modifiedTimestamp;

		private Long createTimestamp;

		private String resourceTypesScope;

		private String regionIdsScope;

		private String excludeResourceIdsScope;

		private String resourceGroupIdsScope;

		private String tagKeyScope;

		private String tagValueScope;

		private String configRuleTriggerTypes;

		private String tagKeyLogicScope;

		private Long accountId;

		private Source source;

		private ManagedRule managedRule;

		private CreateBy createBy;

		private ConfigRuleEvaluationStatus configRuleEvaluationStatus;

		private Scope scope;

		private Compliance compliance;

		public Integer getRiskLevel() {
			return this.riskLevel;
		}

		public void setRiskLevel(Integer riskLevel) {
			this.riskLevel = riskLevel;
		}

		public Map<Object,Object> getInputParameters() {
			return this.inputParameters;
		}

		public void setInputParameters(Map<Object,Object> inputParameters) {
			this.inputParameters = inputParameters;
		}

		public String getConfigRuleState() {
			return this.configRuleState;
		}

		public void setConfigRuleState(String configRuleState) {
			this.configRuleState = configRuleState;
		}

		public String getMaximumExecutionFrequency() {
			return this.maximumExecutionFrequency;
		}

		public void setMaximumExecutionFrequency(String maximumExecutionFrequency) {
			this.maximumExecutionFrequency = maximumExecutionFrequency;
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

		public Long getModifiedTimestamp() {
			return this.modifiedTimestamp;
		}

		public void setModifiedTimestamp(Long modifiedTimestamp) {
			this.modifiedTimestamp = modifiedTimestamp;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}

		public String getResourceTypesScope() {
			return this.resourceTypesScope;
		}

		public void setResourceTypesScope(String resourceTypesScope) {
			this.resourceTypesScope = resourceTypesScope;
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

		public String getConfigRuleTriggerTypes() {
			return this.configRuleTriggerTypes;
		}

		public void setConfigRuleTriggerTypes(String configRuleTriggerTypes) {
			this.configRuleTriggerTypes = configRuleTriggerTypes;
		}

		public String getTagKeyLogicScope() {
			return this.tagKeyLogicScope;
		}

		public void setTagKeyLogicScope(String tagKeyLogicScope) {
			this.tagKeyLogicScope = tagKeyLogicScope;
		}

		public Long getAccountId() {
			return this.accountId;
		}

		public void setAccountId(Long accountId) {
			this.accountId = accountId;
		}

		public Source getSource() {
			return this.source;
		}

		public void setSource(Source source) {
			this.source = source;
		}

		public ManagedRule getManagedRule() {
			return this.managedRule;
		}

		public void setManagedRule(ManagedRule managedRule) {
			this.managedRule = managedRule;
		}

		public CreateBy getCreateBy() {
			return this.createBy;
		}

		public void setCreateBy(CreateBy createBy) {
			this.createBy = createBy;
		}

		public ConfigRuleEvaluationStatus getConfigRuleEvaluationStatus() {
			return this.configRuleEvaluationStatus;
		}

		public void setConfigRuleEvaluationStatus(ConfigRuleEvaluationStatus configRuleEvaluationStatus) {
			this.configRuleEvaluationStatus = configRuleEvaluationStatus;
		}

		public Scope getScope() {
			return this.scope;
		}

		public void setScope(Scope scope) {
			this.scope = scope;
		}

		public Compliance getCompliance() {
			return this.compliance;
		}

		public void setCompliance(Compliance compliance) {
			this.compliance = compliance;
		}

		public static class Source {

			private String owner;

			private String identifier;

			private List<SourceDetailsItem> sourceDetails;

			private List<Map<Object,Object>> sourceConditions;

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public String getIdentifier() {
				return this.identifier;
			}

			public void setIdentifier(String identifier) {
				this.identifier = identifier;
			}

			public List<SourceDetailsItem> getSourceDetails() {
				return this.sourceDetails;
			}

			public void setSourceDetails(List<SourceDetailsItem> sourceDetails) {
				this.sourceDetails = sourceDetails;
			}

			public List<Map<Object,Object>> getSourceConditions() {
				return this.sourceConditions;
			}

			public void setSourceConditions(List<Map<Object,Object>> sourceConditions) {
				this.sourceConditions = sourceConditions;
			}

			public static class SourceDetailsItem {

				private String messageType;

				private String eventSource;

				private String maximumExecutionFrequency;

				public String getMessageType() {
					return this.messageType;
				}

				public void setMessageType(String messageType) {
					this.messageType = messageType;
				}

				public String getEventSource() {
					return this.eventSource;
				}

				public void setEventSource(String eventSource) {
					this.eventSource = eventSource;
				}

				public String getMaximumExecutionFrequency() {
					return this.maximumExecutionFrequency;
				}

				public void setMaximumExecutionFrequency(String maximumExecutionFrequency) {
					this.maximumExecutionFrequency = maximumExecutionFrequency;
				}
			}
		}

		public static class ManagedRule {

			private String helpUrl;

			private String description;

			private String identifier;

			private Map<Object,Object> optionalInputParameterDetails;

			private String managedRuleName;

			private Map<Object,Object> compulsoryInputParameterDetails;

			private List<SourceDetailsItem2> sourceDetails1;

			private List<String> labels;

			public String getHelpUrl() {
				return this.helpUrl;
			}

			public void setHelpUrl(String helpUrl) {
				this.helpUrl = helpUrl;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getIdentifier() {
				return this.identifier;
			}

			public void setIdentifier(String identifier) {
				this.identifier = identifier;
			}

			public Map<Object,Object> getOptionalInputParameterDetails() {
				return this.optionalInputParameterDetails;
			}

			public void setOptionalInputParameterDetails(Map<Object,Object> optionalInputParameterDetails) {
				this.optionalInputParameterDetails = optionalInputParameterDetails;
			}

			public String getManagedRuleName() {
				return this.managedRuleName;
			}

			public void setManagedRuleName(String managedRuleName) {
				this.managedRuleName = managedRuleName;
			}

			public Map<Object,Object> getCompulsoryInputParameterDetails() {
				return this.compulsoryInputParameterDetails;
			}

			public void setCompulsoryInputParameterDetails(Map<Object,Object> compulsoryInputParameterDetails) {
				this.compulsoryInputParameterDetails = compulsoryInputParameterDetails;
			}

			public List<SourceDetailsItem2> getSourceDetails1() {
				return this.sourceDetails1;
			}

			public void setSourceDetails1(List<SourceDetailsItem2> sourceDetails1) {
				this.sourceDetails1 = sourceDetails1;
			}

			public List<String> getLabels() {
				return this.labels;
			}

			public void setLabels(List<String> labels) {
				this.labels = labels;
			}

			public static class SourceDetailsItem2 {

				private String messageType;

				private String eventSource;

				private String maximumExecutionFrequency;

				public String getMessageType() {
					return this.messageType;
				}

				public void setMessageType(String messageType) {
					this.messageType = messageType;
				}

				public String getEventSource() {
					return this.eventSource;
				}

				public void setEventSource(String eventSource) {
					this.eventSource = eventSource;
				}

				public String getMaximumExecutionFrequency() {
					return this.maximumExecutionFrequency;
				}

				public void setMaximumExecutionFrequency(String maximumExecutionFrequency) {
					this.maximumExecutionFrequency = maximumExecutionFrequency;
				}
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

		public static class ConfigRuleEvaluationStatus {

			private String lastErrorCode;

			private Long lastSuccessfulEvaluationTimestamp;

			private Long firstActivatedTimestamp;

			private Boolean firstEvaluationStarted;

			private Long lastSuccessfulInvocationTimestamp;

			private String lastErrorMessage;

			private Long lastFailedEvaluationTimestamp;

			private Long lastFailedInvocationTimestamp;

			public String getLastErrorCode() {
				return this.lastErrorCode;
			}

			public void setLastErrorCode(String lastErrorCode) {
				this.lastErrorCode = lastErrorCode;
			}

			public Long getLastSuccessfulEvaluationTimestamp() {
				return this.lastSuccessfulEvaluationTimestamp;
			}

			public void setLastSuccessfulEvaluationTimestamp(Long lastSuccessfulEvaluationTimestamp) {
				this.lastSuccessfulEvaluationTimestamp = lastSuccessfulEvaluationTimestamp;
			}

			public Long getFirstActivatedTimestamp() {
				return this.firstActivatedTimestamp;
			}

			public void setFirstActivatedTimestamp(Long firstActivatedTimestamp) {
				this.firstActivatedTimestamp = firstActivatedTimestamp;
			}

			public Boolean getFirstEvaluationStarted() {
				return this.firstEvaluationStarted;
			}

			public void setFirstEvaluationStarted(Boolean firstEvaluationStarted) {
				this.firstEvaluationStarted = firstEvaluationStarted;
			}

			public Long getLastSuccessfulInvocationTimestamp() {
				return this.lastSuccessfulInvocationTimestamp;
			}

			public void setLastSuccessfulInvocationTimestamp(Long lastSuccessfulInvocationTimestamp) {
				this.lastSuccessfulInvocationTimestamp = lastSuccessfulInvocationTimestamp;
			}

			public String getLastErrorMessage() {
				return this.lastErrorMessage;
			}

			public void setLastErrorMessage(String lastErrorMessage) {
				this.lastErrorMessage = lastErrorMessage;
			}

			public Long getLastFailedEvaluationTimestamp() {
				return this.lastFailedEvaluationTimestamp;
			}

			public void setLastFailedEvaluationTimestamp(Long lastFailedEvaluationTimestamp) {
				this.lastFailedEvaluationTimestamp = lastFailedEvaluationTimestamp;
			}

			public Long getLastFailedInvocationTimestamp() {
				return this.lastFailedInvocationTimestamp;
			}

			public void setLastFailedInvocationTimestamp(Long lastFailedInvocationTimestamp) {
				this.lastFailedInvocationTimestamp = lastFailedInvocationTimestamp;
			}
		}

		public static class Scope {

			private List<String> complianceResourceTypes;

			public List<String> getComplianceResourceTypes() {
				return this.complianceResourceTypes;
			}

			public void setComplianceResourceTypes(List<String> complianceResourceTypes) {
				this.complianceResourceTypes = complianceResourceTypes;
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
	}

	@Override
	public GetConfigRuleResponse getInstance(UnmarshallerContext context) {
		return	GetConfigRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
