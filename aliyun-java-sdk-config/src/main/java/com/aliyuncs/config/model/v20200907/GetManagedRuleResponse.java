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
import com.aliyuncs.config.transform.v20200907.GetManagedRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetManagedRuleResponse extends AcsResponse {

	private String requestId;

	private ManagedRule managedRule;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ManagedRule getManagedRule() {
		return this.managedRule;
	}

	public void setManagedRule(ManagedRule managedRule) {
		this.managedRule = managedRule;
	}

	public static class ManagedRule {

		private Integer riskLevel;

		private String helpHint;

		private String defaultName;

		private Map<Object,Object> optionalInputParameterDetails;

		private String identifier;

		private Map<Object,Object> compulsoryInputParameterDetails;

		private String regionId;

		private String description;

		private String functionName;

		private String configRuleName;

		private String helpDoc;

		private String helpUrls;

		private String serviceName;

		private Long createTimestamp;

		private List<SourceDetailsItem> sourceDetails;

		private List<String> labels;

		private List<Map<Object,Object>> sourceConditions;

		private Scope scope;

		public Integer getRiskLevel() {
			return this.riskLevel;
		}

		public void setRiskLevel(Integer riskLevel) {
			this.riskLevel = riskLevel;
		}

		public String getHelpHint() {
			return this.helpHint;
		}

		public void setHelpHint(String helpHint) {
			this.helpHint = helpHint;
		}

		public String getDefaultName() {
			return this.defaultName;
		}

		public void setDefaultName(String defaultName) {
			this.defaultName = defaultName;
		}

		public Map<Object,Object> getOptionalInputParameterDetails() {
			return this.optionalInputParameterDetails;
		}

		public void setOptionalInputParameterDetails(Map<Object,Object> optionalInputParameterDetails) {
			this.optionalInputParameterDetails = optionalInputParameterDetails;
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

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getFunctionName() {
			return this.functionName;
		}

		public void setFunctionName(String functionName) {
			this.functionName = functionName;
		}

		public String getConfigRuleName() {
			return this.configRuleName;
		}

		public void setConfigRuleName(String configRuleName) {
			this.configRuleName = configRuleName;
		}

		public String getHelpDoc() {
			return this.helpDoc;
		}

		public void setHelpDoc(String helpDoc) {
			this.helpDoc = helpDoc;
		}

		public String getHelpUrls() {
			return this.helpUrls;
		}

		public void setHelpUrls(String helpUrls) {
			this.helpUrls = helpUrls;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
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

		public List<Map<Object,Object>> getSourceConditions() {
			return this.sourceConditions;
		}

		public void setSourceConditions(List<Map<Object,Object>> sourceConditions) {
			this.sourceConditions = sourceConditions;
		}

		public Scope getScope() {
			return this.scope;
		}

		public void setScope(Scope scope) {
			this.scope = scope;
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

		public static class Scope {

			private List<String> complianceResourceTypes;

			public List<String> getComplianceResourceTypes() {
				return this.complianceResourceTypes;
			}

			public void setComplianceResourceTypes(List<String> complianceResourceTypes) {
				this.complianceResourceTypes = complianceResourceTypes;
			}
		}
	}

	@Override
	public GetManagedRuleResponse getInstance(UnmarshallerContext context) {
		return	GetManagedRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
