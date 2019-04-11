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

/**
 * @author auto create
 * @version 
 */
public class CreateGroupMetricRulesRequest extends RpcAcsRequest<CreateGroupMetricRulesResponse> {
	
	public CreateGroupMetricRulesRequest() {
		super("Cms", "2019-01-01", "CreateGroupMetricRules", "cms");
	}

	private Long groupId;

	private List<GroupMetricRules> groupMetricRuless;

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
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".RuleName" , groupMetricRuless.get(depth1).getRuleName());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Info.Statistics" , groupMetricRuless.get(depth1).getEscalationsInfoStatistics());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".EffectiveInterval" , groupMetricRuless.get(depth1).getEffectiveInterval());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Info.ComparisonOperator" , groupMetricRuless.get(depth1).getEscalationsInfoComparisonOperator());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".NoEffectiveInterval" , groupMetricRuless.get(depth1).getNoEffectiveInterval());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".EmailSubject" , groupMetricRuless.get(depth1).getEmailSubject());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".SilenceTime" , groupMetricRuless.get(depth1).getSilenceTime());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".MetricName" , groupMetricRuless.get(depth1).getMetricName());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Warn.Times" , groupMetricRuless.get(depth1).getEscalationsWarnTimes());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Period" , groupMetricRuless.get(depth1).getPeriod());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Warn.Threshold" , groupMetricRuless.get(depth1).getEscalationsWarnThreshold());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Critical.Statistics" , groupMetricRuless.get(depth1).getEscalationsCriticalStatistics());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Info.Times" , groupMetricRuless.get(depth1).getEscalationsInfoTimes());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Critical.Times" , groupMetricRuless.get(depth1).getEscalationsCriticalTimes());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Warn.Statistics" , groupMetricRuless.get(depth1).getEscalationsWarnStatistics());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Info.Threshold" , groupMetricRuless.get(depth1).getEscalationsInfoThreshold());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Namespace" , groupMetricRuless.get(depth1).getNamespace());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Interval" , groupMetricRuless.get(depth1).getInterval());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Category" , groupMetricRuless.get(depth1).getCategory());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".RuleId" , groupMetricRuless.get(depth1).getRuleId());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Critical.ComparisonOperator" , groupMetricRuless.get(depth1).getEscalationsCriticalComparisonOperator());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Escalations.Critical.Threshold" , groupMetricRuless.get(depth1).getEscalationsCriticalThreshold());
				putQueryParameter("GroupMetricRules." + (depth1 + 1) + ".Dimensions" , groupMetricRuless.get(depth1).getDimensions());
			}
		}	
	}

	public static class GroupMetricRules {

		private String webhook;

		private String escalationsWarnComparisonOperator;

		private String ruleName;

		private String escalationsInfoStatistics;

		private String effectiveInterval;

		private String escalationsInfoComparisonOperator;

		private String noEffectiveInterval;

		private String emailSubject;

		private Integer silenceTime;

		private String metricName;

		private Integer escalationsWarnTimes;

		private String period;

		private String escalationsWarnThreshold;

		private String escalationsCriticalStatistics;

		private Integer escalationsInfoTimes;

		private Integer escalationsCriticalTimes;

		private String escalationsWarnStatistics;

		private String escalationsInfoThreshold;

		private String namespace;

		private String interval;

		private String category;

		private String ruleId;

		private String escalationsCriticalComparisonOperator;

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

		public String getEscalationsInfoComparisonOperator() {
			return this.escalationsInfoComparisonOperator;
		}

		public void setEscalationsInfoComparisonOperator(String escalationsInfoComparisonOperator) {
			this.escalationsInfoComparisonOperator = escalationsInfoComparisonOperator;
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

		public String getPeriod() {
			return this.period;
		}

		public void setPeriod(String period) {
			this.period = period;
		}

		public String getEscalationsWarnThreshold() {
			return this.escalationsWarnThreshold;
		}

		public void setEscalationsWarnThreshold(String escalationsWarnThreshold) {
			this.escalationsWarnThreshold = escalationsWarnThreshold;
		}

		public String getEscalationsCriticalStatistics() {
			return this.escalationsCriticalStatistics;
		}

		public void setEscalationsCriticalStatistics(String escalationsCriticalStatistics) {
			this.escalationsCriticalStatistics = escalationsCriticalStatistics;
		}

		public Integer getEscalationsInfoTimes() {
			return this.escalationsInfoTimes;
		}

		public void setEscalationsInfoTimes(Integer escalationsInfoTimes) {
			this.escalationsInfoTimes = escalationsInfoTimes;
		}

		public Integer getEscalationsCriticalTimes() {
			return this.escalationsCriticalTimes;
		}

		public void setEscalationsCriticalTimes(Integer escalationsCriticalTimes) {
			this.escalationsCriticalTimes = escalationsCriticalTimes;
		}

		public String getEscalationsWarnStatistics() {
			return this.escalationsWarnStatistics;
		}

		public void setEscalationsWarnStatistics(String escalationsWarnStatistics) {
			this.escalationsWarnStatistics = escalationsWarnStatistics;
		}

		public String getEscalationsInfoThreshold() {
			return this.escalationsInfoThreshold;
		}

		public void setEscalationsInfoThreshold(String escalationsInfoThreshold) {
			this.escalationsInfoThreshold = escalationsInfoThreshold;
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

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
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
	}

	@Override
	public Class<CreateGroupMetricRulesResponse> getResponseClass() {
		return CreateGroupMetricRulesResponse.class;
	}

}
