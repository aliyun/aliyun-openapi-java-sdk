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

		private Long accountId;

		private String configRuleArn;

		private String configRuleId;

		private String configRuleName;

		private String configRuleState;

		private String configRuleTriggerTypes;

		private Long createTimestamp;

		private String description;

		private String excludeRegionIdsScope;

		private String excludeResourceGroupIdsScope;

		private String excludeResourceIdsScope;

		private Map<Object,Object> inputParameters;

		private String maximumExecutionFrequency;

		private Long modifiedTimestamp;

		private String regionIdsScope;

		private String resourceGroupIdsScope;

		private String resourceIdsScope;

		private String resourceTypesScope;

		private Integer riskLevel;

		private String serviceChannel;

		private String tagKeyLogicScope;

		private String tagKeyScope;

		private String tagValueScope;

		private String resourceNameScope;

		private String extendContent;

		private List<ComplianceExcludeTagsScope> excludeTagsScope;

		private List<TagsScopeItem> tagsScope;

		private List<TagsItem> tags;

		private Compliance compliance;

		private ConfigRuleEvaluationStatus configRuleEvaluationStatus;

		private CreateBy createBy;

		private ManagedRule managedRule;

		private Scope scope;

		private Source source;

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

		public String getConfigRuleTriggerTypes() {
			return this.configRuleTriggerTypes;
		}

		public void setConfigRuleTriggerTypes(String configRuleTriggerTypes) {
			this.configRuleTriggerTypes = configRuleTriggerTypes;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getExcludeRegionIdsScope() {
			return this.excludeRegionIdsScope;
		}

		public void setExcludeRegionIdsScope(String excludeRegionIdsScope) {
			this.excludeRegionIdsScope = excludeRegionIdsScope;
		}

		public String getExcludeResourceGroupIdsScope() {
			return this.excludeResourceGroupIdsScope;
		}

		public void setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
			this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
		}

		public String getExcludeResourceIdsScope() {
			return this.excludeResourceIdsScope;
		}

		public void setExcludeResourceIdsScope(String excludeResourceIdsScope) {
			this.excludeResourceIdsScope = excludeResourceIdsScope;
		}

		public Map<Object,Object> getInputParameters() {
			return this.inputParameters;
		}

		public void setInputParameters(Map<Object,Object> inputParameters) {
			this.inputParameters = inputParameters;
		}

		public String getMaximumExecutionFrequency() {
			return this.maximumExecutionFrequency;
		}

		public void setMaximumExecutionFrequency(String maximumExecutionFrequency) {
			this.maximumExecutionFrequency = maximumExecutionFrequency;
		}

		public Long getModifiedTimestamp() {
			return this.modifiedTimestamp;
		}

		public void setModifiedTimestamp(Long modifiedTimestamp) {
			this.modifiedTimestamp = modifiedTimestamp;
		}

		public String getRegionIdsScope() {
			return this.regionIdsScope;
		}

		public void setRegionIdsScope(String regionIdsScope) {
			this.regionIdsScope = regionIdsScope;
		}

		public String getResourceGroupIdsScope() {
			return this.resourceGroupIdsScope;
		}

		public void setResourceGroupIdsScope(String resourceGroupIdsScope) {
			this.resourceGroupIdsScope = resourceGroupIdsScope;
		}

		public String getResourceIdsScope() {
			return this.resourceIdsScope;
		}

		public void setResourceIdsScope(String resourceIdsScope) {
			this.resourceIdsScope = resourceIdsScope;
		}

		public String getResourceTypesScope() {
			return this.resourceTypesScope;
		}

		public void setResourceTypesScope(String resourceTypesScope) {
			this.resourceTypesScope = resourceTypesScope;
		}

		public Integer getRiskLevel() {
			return this.riskLevel;
		}

		public void setRiskLevel(Integer riskLevel) {
			this.riskLevel = riskLevel;
		}

		public String getServiceChannel() {
			return this.serviceChannel;
		}

		public void setServiceChannel(String serviceChannel) {
			this.serviceChannel = serviceChannel;
		}

		public String getTagKeyLogicScope() {
			return this.tagKeyLogicScope;
		}

		public void setTagKeyLogicScope(String tagKeyLogicScope) {
			this.tagKeyLogicScope = tagKeyLogicScope;
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

		public String getResourceNameScope() {
			return this.resourceNameScope;
		}

		public void setResourceNameScope(String resourceNameScope) {
			this.resourceNameScope = resourceNameScope;
		}

		public String getExtendContent() {
			return this.extendContent;
		}

		public void setExtendContent(String extendContent) {
			this.extendContent = extendContent;
		}

		public List<ComplianceExcludeTagsScope> getExcludeTagsScope() {
			return this.excludeTagsScope;
		}

		public void setExcludeTagsScope(List<ComplianceExcludeTagsScope> excludeTagsScope) {
			this.excludeTagsScope = excludeTagsScope;
		}

		public List<TagsScopeItem> getTagsScope() {
			return this.tagsScope;
		}

		public void setTagsScope(List<TagsScopeItem> tagsScope) {
			this.tagsScope = tagsScope;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public Compliance getCompliance() {
			return this.compliance;
		}

		public void setCompliance(Compliance compliance) {
			this.compliance = compliance;
		}

		public ConfigRuleEvaluationStatus getConfigRuleEvaluationStatus() {
			return this.configRuleEvaluationStatus;
		}

		public void setConfigRuleEvaluationStatus(ConfigRuleEvaluationStatus configRuleEvaluationStatus) {
			this.configRuleEvaluationStatus = configRuleEvaluationStatus;
		}

		public CreateBy getCreateBy() {
			return this.createBy;
		}

		public void setCreateBy(CreateBy createBy) {
			this.createBy = createBy;
		}

		public ManagedRule getManagedRule() {
			return this.managedRule;
		}

		public void setManagedRule(ManagedRule managedRule) {
			this.managedRule = managedRule;
		}

		public Scope getScope() {
			return this.scope;
		}

		public void setScope(Scope scope) {
			this.scope = scope;
		}

		public Source getSource() {
			return this.source;
		}

		public void setSource(Source source) {
			this.source = source;
		}

		public static class ComplianceExcludeTagsScope {

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

		public static class ConfigRuleEvaluationStatus {

			private Long firstActivatedTimestamp;

			private Boolean firstEvaluationStarted;

			private String lastErrorCode;

			private String lastErrorMessage;

			private Long lastFailedEvaluationTimestamp;

			private Long lastFailedInvocationTimestamp;

			private Long lastSuccessfulEvaluationTimestamp;

			private Long lastSuccessfulInvocationTimestamp;

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

			public String getLastErrorCode() {
				return this.lastErrorCode;
			}

			public void setLastErrorCode(String lastErrorCode) {
				this.lastErrorCode = lastErrorCode;
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

			public Long getLastSuccessfulEvaluationTimestamp() {
				return this.lastSuccessfulEvaluationTimestamp;
			}

			public void setLastSuccessfulEvaluationTimestamp(Long lastSuccessfulEvaluationTimestamp) {
				this.lastSuccessfulEvaluationTimestamp = lastSuccessfulEvaluationTimestamp;
			}

			public Long getLastSuccessfulInvocationTimestamp() {
				return this.lastSuccessfulInvocationTimestamp;
			}

			public void setLastSuccessfulInvocationTimestamp(Long lastSuccessfulInvocationTimestamp) {
				this.lastSuccessfulInvocationTimestamp = lastSuccessfulInvocationTimestamp;
			}
		}

		public static class CreateBy {

			private String aggregatorId;

			private String aggregatorName;

			private String compliancePackId;

			private String compliancePackName;

			private String creatorId;

			private String creatorName;

			private String creatorType;

			public String getAggregatorId() {
				return this.aggregatorId;
			}

			public void setAggregatorId(String aggregatorId) {
				this.aggregatorId = aggregatorId;
			}

			public String getAggregatorName() {
				return this.aggregatorName;
			}

			public void setAggregatorName(String aggregatorName) {
				this.aggregatorName = aggregatorName;
			}

			public String getCompliancePackId() {
				return this.compliancePackId;
			}

			public void setCompliancePackId(String compliancePackId) {
				this.compliancePackId = compliancePackId;
			}

			public String getCompliancePackName() {
				return this.compliancePackName;
			}

			public void setCompliancePackName(String compliancePackName) {
				this.compliancePackName = compliancePackName;
			}

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
		}

		public static class ManagedRule {

			private Map<Object,Object> compulsoryInputParameterDetails;

			private String description;

			private String helpUrl;

			private String identifier;

			private String managedRuleName;

			private Map<Object,Object> optionalInputParameterDetails;

			private List<SourceDetailsItem> sourceDetails;

			private List<String> labels;

			public Map<Object,Object> getCompulsoryInputParameterDetails() {
				return this.compulsoryInputParameterDetails;
			}

			public void setCompulsoryInputParameterDetails(Map<Object,Object> compulsoryInputParameterDetails) {
				this.compulsoryInputParameterDetails = compulsoryInputParameterDetails;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getHelpUrl() {
				return this.helpUrl;
			}

			public void setHelpUrl(String helpUrl) {
				this.helpUrl = helpUrl;
			}

			public String getIdentifier() {
				return this.identifier;
			}

			public void setIdentifier(String identifier) {
				this.identifier = identifier;
			}

			public String getManagedRuleName() {
				return this.managedRuleName;
			}

			public void setManagedRuleName(String managedRuleName) {
				this.managedRuleName = managedRuleName;
			}

			public Map<Object,Object> getOptionalInputParameterDetails() {
				return this.optionalInputParameterDetails;
			}

			public void setOptionalInputParameterDetails(Map<Object,Object> optionalInputParameterDetails) {
				this.optionalInputParameterDetails = optionalInputParameterDetails;
			}

			public List<SourceDetailsItem> getSourceDetails() {
				return this.sourceDetails;
			}

			public void setSourceDetails(List<SourceDetailsItem> sourceDetails) {
				this.sourceDetails = sourceDetails;
			}

			public List<String> getLabels() {
				return this.labels;
			}

			public void setLabels(List<String> labels) {
				this.labels = labels;
			}

			public static class SourceDetailsItem {

				private String eventSource;

				private String maximumExecutionFrequency;

				private String messageType;

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

				public String getMessageType() {
					return this.messageType;
				}

				public void setMessageType(String messageType) {
					this.messageType = messageType;
				}
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

		public static class Source {

			private String conditions;

			private String identifier;

			private String owner;

			private List<SourceDetailsItem2> sourceDetails1;

			private List<Map<Object,Object>> sourceConditions;

			public String getConditions() {
				return this.conditions;
			}

			public void setConditions(String conditions) {
				this.conditions = conditions;
			}

			public String getIdentifier() {
				return this.identifier;
			}

			public void setIdentifier(String identifier) {
				this.identifier = identifier;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public List<SourceDetailsItem2> getSourceDetails1() {
				return this.sourceDetails1;
			}

			public void setSourceDetails1(List<SourceDetailsItem2> sourceDetails1) {
				this.sourceDetails1 = sourceDetails1;
			}

			public List<Map<Object,Object>> getSourceConditions() {
				return this.sourceConditions;
			}

			public void setSourceConditions(List<Map<Object,Object>> sourceConditions) {
				this.sourceConditions = sourceConditions;
			}

			public static class SourceDetailsItem2 {

				private String eventSource;

				private String maximumExecutionFrequency;

				private String messageType;

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

				public String getMessageType() {
					return this.messageType;
				}

				public void setMessageType(String messageType) {
					this.messageType = messageType;
				}
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
