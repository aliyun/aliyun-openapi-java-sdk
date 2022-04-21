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
public class PutResourceMetricRulesRequest extends RpcAcsRequest<PutResourceMetricRulesResponse> {
	   

	private List<Rules> ruless;
	public PutResourceMetricRulesRequest() {
		super("Cms", "2019-01-01", "PutResourceMetricRules", "cms");
		setMethod(MethodType.POST);
	}

	public List<Rules> getRuless() {
		return this.ruless;
	}

	public void setRuless(List<Rules> ruless) {
		this.ruless = ruless;	
		if (ruless != null) {
			for (int depth1 = 0; depth1 < ruless.size(); depth1++) {
				putQueryParameter("Rules." + (depth1 + 1) + ".Webhook" , ruless.get(depth1).getWebhook());
				putQueryParameter("Rules." + (depth1 + 1) + ".Escalations.Warn.ComparisonOperator" , ruless.get(depth1).getEscalationsWarnComparisonOperator());
				putQueryParameter("Rules." + (depth1 + 1) + ".DynamicAlertSensitivity" , ruless.get(depth1).getDynamicAlertSensitivity());
				putQueryParameter("Rules." + (depth1 + 1) + ".RuleName" , ruless.get(depth1).getRuleName());
				putQueryParameter("Rules." + (depth1 + 1) + ".Escalations.Info.Statistics" , ruless.get(depth1).getEscalationsInfoStatistics());
				putQueryParameter("Rules." + (depth1 + 1) + ".EffectiveInterval" , ruless.get(depth1).getEffectiveInterval());
				putQueryParameter("Rules." + (depth1 + 1) + ".DynamicAlertHistoryDataRange" , ruless.get(depth1).getDynamicAlertHistoryDataRange());
				putQueryParameter("Rules." + (depth1 + 1) + ".Escalations.Warn.PreCondition" , ruless.get(depth1).getEscalationsWarnPreCondition());
				putQueryParameter("Rules." + (depth1 + 1) + ".Escalations.Info.ComparisonOperator" , ruless.get(depth1).getEscalationsInfoComparisonOperator());
				putQueryParameter("Rules." + (depth1 + 1) + ".NoDataPolicy" , ruless.get(depth1).getNoDataPolicy());
				putQueryParameter("Rules." + (depth1 + 1) + ".NoEffectiveInterval" , ruless.get(depth1).getNoEffectiveInterval());
				putQueryParameter("Rules." + (depth1 + 1) + ".EmailSubject" , ruless.get(depth1).getEmailSubject());
				putQueryParameter("Rules." + (depth1 + 1) + ".Options" , ruless.get(depth1).getOptions());
				putQueryParameter("Rules." + (depth1 + 1) + ".SilenceTime" , ruless.get(depth1).getSilenceTime());
				putQueryParameter("Rules." + (depth1 + 1) + ".Prometheus" , ruless.get(depth1).getPrometheus());
				putQueryParameter("Rules." + (depth1 + 1) + ".Escalations.Info.PreCondition" , ruless.get(depth1).getEscalationsInfoPreCondition());
				putQueryParameter("Rules." + (depth1 + 1) + ".MetricName" , ruless.get(depth1).getMetricName());
				putQueryParameter("Rules." + (depth1 + 1) + ".Escalations.Warn.Times" , ruless.get(depth1).getEscalationsWarnTimes());
				putQueryParameter("Rules." + (depth1 + 1) + ".CompositeExpression" , ruless.get(depth1).getCompositeExpression());
				putQueryParameter("Rules." + (depth1 + 1) + ".Escalations.Warn.Threshold" , ruless.get(depth1).getEscalationsWarnThreshold());
				putQueryParameter("Rules." + (depth1 + 1) + ".Period" , ruless.get(depth1).getPeriod());
				putQueryParameter("Rules." + (depth1 + 1) + ".ContactGroups" , ruless.get(depth1).getContactGroups());
				putQueryParameter("Rules." + (depth1 + 1) + ".Escalations.Critical.Statistics" , ruless.get(depth1).getEscalationsCriticalStatistics());
				putQueryParameter("Rules." + (depth1 + 1) + ".RuleType" , ruless.get(depth1).getRuleType());
				putQueryParameter("Rules." + (depth1 + 1) + ".GroupId" , ruless.get(depth1).getGroupId());
				putQueryParameter("Rules." + (depth1 + 1) + ".Escalations.Info.Times" , ruless.get(depth1).getEscalationsInfoTimes());
				putQueryParameter("Rules." + (depth1 + 1) + ".Resources" , ruless.get(depth1).getResources());
				if (ruless.get(depth1).getLabelss() != null) {
					for (int depth2 = 0; depth2 < ruless.get(depth1).getLabelss().size(); depth2++) {
						putQueryParameter("Rules." + (depth1 + 1) + ".Labels." + (depth2 + 1) + ".Value" , ruless.get(depth1).getLabelss().get(depth2).getValue());
						putQueryParameter("Rules." + (depth1 + 1) + ".Labels." + (depth2 + 1) + ".Key" , ruless.get(depth1).getLabelss().get(depth2).getKey());
					}
				}
				putQueryParameter("Rules." + (depth1 + 1) + ".Escalations.Critical.Times" , ruless.get(depth1).getEscalationsCriticalTimes());
				putQueryParameter("Rules." + (depth1 + 1) + ".Escalations.Info.Threshold" , ruless.get(depth1).getEscalationsInfoThreshold());
				putQueryParameter("Rules." + (depth1 + 1) + ".Escalations.Warn.Statistics" , ruless.get(depth1).getEscalationsWarnStatistics());
				putQueryParameter("Rules." + (depth1 + 1) + ".Namespace" , ruless.get(depth1).getNamespace());
				putQueryParameter("Rules." + (depth1 + 1) + ".Interval" , ruless.get(depth1).getInterval());
				putQueryParameter("Rules." + (depth1 + 1) + ".RuleId" , ruless.get(depth1).getRuleId());
				putQueryParameter("Rules." + (depth1 + 1) + ".Escalations.Critical.ComparisonOperator" , ruless.get(depth1).getEscalationsCriticalComparisonOperator());
				putQueryParameter("Rules." + (depth1 + 1) + ".Escalations.Critical.PreCondition" , ruless.get(depth1).getEscalationsCriticalPreCondition());
				putQueryParameter("Rules." + (depth1 + 1) + ".Escalations.Critical.Threshold" , ruless.get(depth1).getEscalationsCriticalThreshold());
			}
		}	
	}

	public static class Rules {

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

		private String options;

		private Integer silenceTime;

		private String prometheus;

		private String escalationsInfoPreCondition;

		private String metricName;

		private Integer escalationsWarnTimes;

		private String compositeExpression;

		private String escalationsWarnThreshold;

		private String period;

		private String contactGroups;

		private String escalationsCriticalStatistics;

		private String ruleType;

		private String groupId;

		private Integer escalationsInfoTimes;

		private String resources;

		private List<Labels> labelss;

		private Integer escalationsCriticalTimes;

		private String escalationsInfoThreshold;

		private String escalationsWarnStatistics;

		private String namespace;

		private String interval;

		private String ruleId;

		private String escalationsCriticalComparisonOperator;

		private String escalationsCriticalPreCondition;

		private String escalationsCriticalThreshold;

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

		public String getOptions() {
			return this.options;
		}

		public void setOptions(String options) {
			this.options = options;
		}

		public Integer getSilenceTime() {
			return this.silenceTime;
		}

		public void setSilenceTime(Integer silenceTime) {
			this.silenceTime = silenceTime;
		}

		public String getPrometheus() {
			return this.prometheus;
		}

		public void setPrometheus(String prometheus) {
			this.prometheus = prometheus;
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

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public Integer getEscalationsInfoTimes() {
			return this.escalationsInfoTimes;
		}

		public void setEscalationsInfoTimes(Integer escalationsInfoTimes) {
			this.escalationsInfoTimes = escalationsInfoTimes;
		}

		public String getResources() {
			return this.resources;
		}

		public void setResources(String resources) {
			this.resources = resources;
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
	public Class<PutResourceMetricRulesResponse> getResponseClass() {
		return PutResourceMetricRulesResponse.class;
	}

}
