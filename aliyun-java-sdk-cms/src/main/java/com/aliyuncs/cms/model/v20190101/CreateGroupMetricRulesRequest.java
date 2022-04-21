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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateGroupMetricRulesRequest extends RpcAcsRequest<CreateGroupMetricRulesResponse> {
	   

	private Long groupId;

	private List<GroupMetricRules> groupMetricRuless;
	public CreateGroupMetricRulesRequest() {
		super("Cms", "2019-01-01", "CreateGroupMetricRules", "cms");
		setMethod(MethodType.POST);
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId.toString());
		}
	}

	public List<GroupMetricRules> getGroupMetricRuless() {
		return this.groupMetricRuless;
	}

	public void setGroupMetricRuless(List<GroupMetricRules> groupMetricRuless) {
		this.groupMetricRuless = groupMetricRuless;	
		if (groupMetricRuless != null) {
			for (int depth1 = 0; depth1 < groupMetricRuless.size(); depth1++) {
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Webhook" , groupMetricRuless.get(depth1).getWebhook());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Warn.ComparisonOperator" , groupMetricRuless.get(depth1).getEscalationsWarnComparisonOperator());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".DynamicAlertSensitivity" , groupMetricRuless.get(depth1).getDynamicAlertSensitivity());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".RuleName" , groupMetricRuless.get(depth1).getRuleName());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Info.Statistics" , groupMetricRuless.get(depth1).getEscalationsInfoStatistics());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".EffectiveInterval" , groupMetricRuless.get(depth1).getEffectiveInterval());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".DynamicAlertHistoryDataRange" , groupMetricRuless.get(depth1).getDynamicAlertHistoryDataRange());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Warn.PreCondition" , groupMetricRuless.get(depth1).getEscalationsWarnPreCondition());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Info.ComparisonOperator" , groupMetricRuless.get(depth1).getEscalationsInfoComparisonOperator());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".NoDataPolicy" , groupMetricRuless.get(depth1).getNoDataPolicy());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".NoEffectiveInterval" , groupMetricRuless.get(depth1).getNoEffectiveInterval());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".EmailSubject" , groupMetricRuless.get(depth1).getEmailSubject());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".SilenceTime" , groupMetricRuless.get(depth1).getSilenceTime());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Info.PreCondition" , groupMetricRuless.get(depth1).getEscalationsInfoPreCondition());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".MetricName" , groupMetricRuless.get(depth1).getMetricName());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Warn.Times" , groupMetricRuless.get(depth1).getEscalationsWarnTimes());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".CompositeExpression" , groupMetricRuless.get(depth1).getCompositeExpression());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Warn.Threshold" , groupMetricRuless.get(depth1).getEscalationsWarnThreshold());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Period" , groupMetricRuless.get(depth1).getPeriod());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".ContactGroups" , groupMetricRuless.get(depth1).getContactGroups());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Critical.Statistics" , groupMetricRuless.get(depth1).getEscalationsCriticalStatistics());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".RuleType" , groupMetricRuless.get(depth1).getRuleType());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Info.Times" , groupMetricRuless.get(depth1).getEscalationsInfoTimes());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".ExtraDimensionJson" , groupMetricRuless.get(depth1).getExtraDimensionJson());
				if (groupMetricRuless.get(depth1).getLabelss() != null) {
					for (int depth2 = 0; depth2 < groupMetricRuless.get(depth1).getLabelss().size(); depth2++) {
						putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Labels." + (depth2 + 1) + ".Value" , groupMetricRuless.get(depth1).getLabelss().get(depth2).getValue());
						putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Labels." + (depth2 + 1) + ".Key" , groupMetricRuless.get(depth1).getLabelss().get(depth2).getKey());
					}
				}
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Critical.Times" , groupMetricRuless.get(depth1).getEscalationsCriticalTimes());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Info.Threshold" , groupMetricRuless.get(depth1).getEscalationsInfoThreshold());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Warn.Statistics" , groupMetricRuless.get(depth1).getEscalationsWarnStatistics());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Namespace" , groupMetricRuless.get(depth1).getNamespace());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Interval" , groupMetricRuless.get(depth1).getInterval());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".RuleId" , groupMetricRuless.get(depth1).getRuleId());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Category" , groupMetricRuless.get(depth1).getCategory());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Critical.ComparisonOperator" , groupMetricRuless.get(depth1).getEscalationsCriticalComparisonOperator());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Critical.PreCondition" , groupMetricRuless.get(depth1).getEscalationsCriticalPreCondition());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Critical.Threshold" , groupMetricRuless.get(depth1).getEscalationsCriticalThreshold());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Dimensions" , groupMetricRuless.get(depth1).getDimensions());
			}
		}	
	}

	public static class GroupMetricRules {

		private String webhook;

		private String escalationsWarnComparisonOperator;

		private String dynamicAlertSensitivity;

		private String ruleName;

		private String escalationsInfoStatistics;

		private String effectiveInterval;

		private String dynamicAlertHistoryDataRange;

		private String escalationsWarnPreCondition;

		private String escalationsInfoComparisonOperator;

		private String noDataPolicy;

		private String noEffectiveInterval;

		private String emailSubject;

		private Integer silenceTime;

		private String escalationsInfoPreCondition;

		private String metricName;

		private Integer escalationsWarnTimes;

		private String compositeExpression;

		private String escalationsWarnThreshold;

		private String period;

		private String contactGroups;

		private String escalationsCriticalStatistics;

		private String ruleType;

		private Integer escalationsInfoTimes;

		private String extraDimensionJson;

		private List<Labels> labelss;

		private Integer escalationsCriticalTimes;

		private String escalationsInfoThreshold;

		private String escalationsWarnStatistics;

		private String namespace;

		private String interval;

		private String ruleId;

		private String category;

		private String escalationsCriticalComparisonOperator;

		private String escalationsCriticalPreCondition;

		private String escalationsCriticalThreshold;

		private String dimensions;

		public String getWebhook() {
			return this.webhook;
		}

		public void setWebhook(String webhook) {
			this.webhook = webhook;
		}

		public String getEscalationsWarnComparisonOperator() {
			return this.escalationsWarnComparisonOperator;
		}

		public void setEscalationsWarnComparisonOperator(String escalationsWarnComparisonOperator) {
			this.escalationsWarnComparisonOperator = escalationsWarnComparisonOperator;
		}

		public String getDynamicAlertSensitivity() {
			return this.dynamicAlertSensitivity;
		}

		public void setDynamicAlertSensitivity(String dynamicAlertSensitivity) {
			this.dynamicAlertSensitivity = dynamicAlertSensitivity;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getEscalationsInfoStatistics() {
			return this.escalationsInfoStatistics;
		}

		public void setEscalationsInfoStatistics(String escalationsInfoStatistics) {
			this.escalationsInfoStatistics = escalationsInfoStatistics;
		}

		public String getEffectiveInterval() {
			return this.effectiveInterval;
		}

		public void setEffectiveInterval(String effectiveInterval) {
			this.effectiveInterval = effectiveInterval;
		}

		public String getDynamicAlertHistoryDataRange() {
			return this.dynamicAlertHistoryDataRange;
		}

		public void setDynamicAlertHistoryDataRange(String dynamicAlertHistoryDataRange) {
			this.dynamicAlertHistoryDataRange = dynamicAlertHistoryDataRange;
		}

		public String getEscalationsWarnPreCondition() {
			return this.escalationsWarnPreCondition;
		}

		public void setEscalationsWarnPreCondition(String escalationsWarnPreCondition) {
			this.escalationsWarnPreCondition = escalationsWarnPreCondition;
		}

		public String getEscalationsInfoComparisonOperator() {
			return this.escalationsInfoComparisonOperator;
		}

		public void setEscalationsInfoComparisonOperator(String escalationsInfoComparisonOperator) {
			this.escalationsInfoComparisonOperator = escalationsInfoComparisonOperator;
		}

		public String getNoDataPolicy() {
			return this.noDataPolicy;
		}

		public void setNoDataPolicy(String noDataPolicy) {
			this.noDataPolicy = noDataPolicy;
		}

		public String getNoEffectiveInterval() {
			return this.noEffectiveInterval;
		}

		public void setNoEffectiveInterval(String noEffectiveInterval) {
			this.noEffectiveInterval = noEffectiveInterval;
		}

		public String getEmailSubject() {
			return this.emailSubject;
		}

		public void setEmailSubject(String emailSubject) {
			this.emailSubject = emailSubject;
		}

		public Integer getSilenceTime() {
			return this.silenceTime;
		}

		public void setSilenceTime(Integer silenceTime) {
			this.silenceTime = silenceTime;
		}

		public String getEscalationsInfoPreCondition() {
			return this.escalationsInfoPreCondition;
		}

		public void setEscalationsInfoPreCondition(String escalationsInfoPreCondition) {
			this.escalationsInfoPreCondition = escalationsInfoPreCondition;
		}

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public Integer getEscalationsWarnTimes() {
			return this.escalationsWarnTimes;
		}

		public void setEscalationsWarnTimes(Integer escalationsWarnTimes) {
			this.escalationsWarnTimes = escalationsWarnTimes;
		}

		public String getCompositeExpression() {
			return this.compositeExpression;
		}

		public void setCompositeExpression(String compositeExpression) {
			this.compositeExpression = compositeExpression;
		}

		public String getEscalationsWarnThreshold() {
			return this.escalationsWarnThreshold;
		}

		public void setEscalationsWarnThreshold(String escalationsWarnThreshold) {
			this.escalationsWarnThreshold = escalationsWarnThreshold;
		}

		public String getPeriod() {
			return this.period;
		}

		public void setPeriod(String period) {
			this.period = period;
		}

		public String getContactGroups() {
			return this.contactGroups;
		}

		public void setContactGroups(String contactGroups) {
			this.contactGroups = contactGroups;
		}

		public String getEscalationsCriticalStatistics() {
			return this.escalationsCriticalStatistics;
		}

		public void setEscalationsCriticalStatistics(String escalationsCriticalStatistics) {
			this.escalationsCriticalStatistics = escalationsCriticalStatistics;
		}

		public String getRuleType() {
			return this.ruleType;
		}

		public void setRuleType(String ruleType) {
			this.ruleType = ruleType;
		}

		public Integer getEscalationsInfoTimes() {
			return this.escalationsInfoTimes;
		}

		public void setEscalationsInfoTimes(Integer escalationsInfoTimes) {
			this.escalationsInfoTimes = escalationsInfoTimes;
		}

		public String getExtraDimensionJson() {
			return this.extraDimensionJson;
		}

		public void setExtraDimensionJson(String extraDimensionJson) {
			this.extraDimensionJson = extraDimensionJson;
		}

		public List<Labels> getLabelss() {
			return this.labelss;
		}

		public void setLabelss(List<Labels> labelss) {
			this.labelss = labelss;
		}

		public Integer getEscalationsCriticalTimes() {
			return this.escalationsCriticalTimes;
		}

		public void setEscalationsCriticalTimes(Integer escalationsCriticalTimes) {
			this.escalationsCriticalTimes = escalationsCriticalTimes;
		}

		public String getEscalationsInfoThreshold() {
			return this.escalationsInfoThreshold;
		}

		public void setEscalationsInfoThreshold(String escalationsInfoThreshold) {
			this.escalationsInfoThreshold = escalationsInfoThreshold;
		}

		public String getEscalationsWarnStatistics() {
			return this.escalationsWarnStatistics;
		}

		public void setEscalationsWarnStatistics(String escalationsWarnStatistics) {
			this.escalationsWarnStatistics = escalationsWarnStatistics;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getInterval() {
			return this.interval;
		}

		public void setInterval(String interval) {
			this.interval = interval;
		}

		public String getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(String ruleId) {
			this.ruleId = ruleId;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getEscalationsCriticalComparisonOperator() {
			return this.escalationsCriticalComparisonOperator;
		}

		public void setEscalationsCriticalComparisonOperator(String escalationsCriticalComparisonOperator) {
			this.escalationsCriticalComparisonOperator = escalationsCriticalComparisonOperator;
		}

		public String getEscalationsCriticalPreCondition() {
			return this.escalationsCriticalPreCondition;
		}

		public void setEscalationsCriticalPreCondition(String escalationsCriticalPreCondition) {
			this.escalationsCriticalPreCondition = escalationsCriticalPreCondition;
		}

		public String getEscalationsCriticalThreshold() {
			return this.escalationsCriticalThreshold;
		}

		public void setEscalationsCriticalThreshold(String escalationsCriticalThreshold) {
			this.escalationsCriticalThreshold = escalationsCriticalThreshold;
		}

		public String getDimensions() {
			return this.dimensions;
		}

		public void setDimensions(String dimensions) {
			this.dimensions = dimensions;
		}

		public static class Labels {

			private String value;

			private String key;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}
	}

	@Override
	public Class<CreateGroupMetricRulesResponse> getResponseClass() {
		return CreateGroupMetricRulesResponse.class;
	}

}
