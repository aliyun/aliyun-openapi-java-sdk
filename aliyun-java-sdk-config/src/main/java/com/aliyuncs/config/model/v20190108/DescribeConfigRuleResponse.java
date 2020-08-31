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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20190108.DescribeConfigRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeConfigRuleResponse extends AcsResponse {

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

		private String configRuleArn;

		private String configRuleId;

		private String configRuleName;

		private String configRuleState;

		private Long createTimestamp;

		private String description;

		private Map<Object,Object> inputParameters;

		private Long modifiedTimestamp;

		private Integer riskLevel;

		private CreateBy createBy;

		private ConfigRuleEvaluationStatus configRuleEvaluationStatus;

		private ManagedRule managedRule;

		private Source source;

		private Scope scope;

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

		public Map<Object,Object> getInputParameters() {
			return this.inputParameters;
		}

		public void setInputParameters(Map<Object,Object> inputParameters) {
			this.inputParameters = inputParameters;
		}

		public Long getModifiedTimestamp() {
			return this.modifiedTimestamp;
		}

		public void setModifiedTimestamp(Long modifiedTimestamp) {
			this.modifiedTimestamp = modifiedTimestamp;
		}

		public Integer getRiskLevel() {
			return this.riskLevel;
		}

		public void setRiskLevel(Integer riskLevel) {
			this.riskLevel = riskLevel;
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

		public ManagedRule getManagedRule() {
			return this.managedRule;
		}

		public void setManagedRule(ManagedRule managedRule) {
			this.managedRule = managedRule;
		}

		public Source getSource() {
			return this.source;
		}

		public void setSource(Source source) {
			this.source = source;
		}

		public Scope getScope() {
			return this.scope;
		}

		public void setScope(Scope scope) {
			this.scope = scope;
		}

		public static class CreateBy {

			private String creatorType;

			private String creatorId;

			private String creatorName;

			private String configRuleSceneId;

			private String configRuleSceneName;

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

			public String getCreatorName() {
				return this.creatorName;
			}

			public void setCreatorName(String creatorName) {
				this.creatorName = creatorName;
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

		public static class ManagedRule {

			private String managedRuleName;

			private String description;

			private String identifier;

			private Map<Object,Object> compulsoryInputParameterDetails;

			private Map<Object,Object> optionalInputParameterDetails;

			private String helpUrl;

			private List<SourceDetailsItem> sourceDetails;

			private List<String> labels;

			public String getManagedRuleName() {
				return this.managedRuleName;
			}

			public void setManagedRuleName(String managedRuleName) {
				this.managedRuleName = managedRuleName;
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

			public Map<Object,Object> getCompulsoryInputParameterDetails() {
				return this.compulsoryInputParameterDetails;
			}

			public void setCompulsoryInputParameterDetails(Map<Object,Object> compulsoryInputParameterDetails) {
				this.compulsoryInputParameterDetails = compulsoryInputParameterDetails;
			}

			public Map<Object,Object> getOptionalInputParameterDetails() {
				return this.optionalInputParameterDetails;
			}

			public void setOptionalInputParameterDetails(Map<Object,Object> optionalInputParameterDetails) {
				this.optionalInputParameterDetails = optionalInputParameterDetails;
			}

			public String getHelpUrl() {
				return this.helpUrl;
			}

			public void setHelpUrl(String helpUrl) {
				this.helpUrl = helpUrl;
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

		public static class Source {

			private String identifier;

			private String owner;

			private List<SourceConditionsItem> sourceConditions;

			private List<SourceDetailsItem2> sourceDetails1;

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

			public List<SourceConditionsItem> getSourceConditions() {
				return this.sourceConditions;
			}

			public void setSourceConditions(List<SourceConditionsItem> sourceConditions) {
				this.sourceConditions = sourceConditions;
			}

			public List<SourceDetailsItem2> getSourceDetails1() {
				return this.sourceDetails1;
			}

			public void setSourceDetails1(List<SourceDetailsItem2> sourceDetails1) {
				this.sourceDetails1 = sourceDetails1;
			}

			public static class SourceConditionsItem {

				private String desiredValue;

				private String name;

				private String operator;

				private Boolean required;

				private String selectPath;

				private String tips;

				public String getDesiredValue() {
					return this.desiredValue;
				}

				public void setDesiredValue(String desiredValue) {
					this.desiredValue = desiredValue;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getOperator() {
					return this.operator;
				}

				public void setOperator(String operator) {
					this.operator = operator;
				}

				public Boolean getRequired() {
					return this.required;
				}

				public void setRequired(Boolean required) {
					this.required = required;
				}

				public String getSelectPath() {
					return this.selectPath;
				}

				public void setSelectPath(String selectPath) {
					this.selectPath = selectPath;
				}

				public String getTips() {
					return this.tips;
				}

				public void setTips(String tips) {
					this.tips = tips;
				}
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

		public static class Scope {

			private String complianceResourceId;

			private List<String> complianceResourceTypes;

			public String getComplianceResourceId() {
				return this.complianceResourceId;
			}

			public void setComplianceResourceId(String complianceResourceId) {
				this.complianceResourceId = complianceResourceId;
			}

			public List<String> getComplianceResourceTypes() {
				return this.complianceResourceTypes;
			}

			public void setComplianceResourceTypes(List<String> complianceResourceTypes) {
				this.complianceResourceTypes = complianceResourceTypes;
			}
		}
	}

	@Override
	public DescribeConfigRuleResponse getInstance(UnmarshallerContext context) {
		return	DescribeConfigRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
