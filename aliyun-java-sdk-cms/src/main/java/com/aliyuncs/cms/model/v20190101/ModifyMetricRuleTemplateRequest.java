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
public class ModifyMetricRuleTemplateRequest extends RpcAcsRequest<ModifyMetricRuleTemplateResponse> {
	
	public ModifyMetricRuleTemplateRequest() {
		super("Cms", "2019-01-01", "ModifyMetricRuleTemplate", "cms");
	}

	private String name;

	private Long restVersion;

	private String description;

	private List<AlertTemplates> alertTemplatess;

	private Long templateId;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Long getRestVersion() {
		return this.restVersion;
	}

	public void setRestVersion(Long restVersion) {
		this.restVersion = restVersion;
		if(restVersion != null){
			putQueryParameter("RestVersion", restVersion.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public List<AlertTemplates> getAlertTemplatess() {
		return this.alertTemplatess;
	}

	public void setAlertTemplatess(List<AlertTemplates> alertTemplatess) {
		this.alertTemplatess = alertTemplatess;	
		if (alertTemplatess != null) {
			for (int depth1 = 0; depth1 < alertTemplatess.size(); depth1++) {
				putQueryParameter("AlertTemplates." + (depth1 + 1) + ".Period" , alertTemplatess.get(depth1).getPeriod());
				putQueryParameter("AlertTemplates." + (depth1 + 1) + ".Escalations.Warn.Threshold" , alertTemplatess.get(depth1).getEscalationsWarnThreshold());
				putQueryParameter("AlertTemplates." + (depth1 + 1) + ".Escalations.Warn.ComparisonOperator" , alertTemplatess.get(depth1).getEscalationsWarnComparisonOperator());
				putQueryParameter("AlertTemplates." + (depth1 + 1) + ".Escalations.Critical.Statistics" , alertTemplatess.get(depth1).getEscalationsCriticalStatistics());
				putQueryParameter("AlertTemplates." + (depth1 + 1) + ".Escalations.Info.Times" , alertTemplatess.get(depth1).getEscalationsInfoTimes());
				putQueryParameter("AlertTemplates." + (depth1 + 1) + ".RuleName" , alertTemplatess.get(depth1).getRuleName());
				putQueryParameter("AlertTemplates." + (depth1 + 1) + ".Escalations.Info.Statistics" , alertTemplatess.get(depth1).getEscalationsInfoStatistics());
				putQueryParameter("AlertTemplates." + (depth1 + 1) + ".Escalations.Critical.Times" , alertTemplatess.get(depth1).getEscalationsCriticalTimes());
				putQueryParameter("AlertTemplates." + (depth1 + 1) + ".Escalations.Info.ComparisonOperator" , alertTemplatess.get(depth1).getEscalationsInfoComparisonOperator());
				putQueryParameter("AlertTemplates." + (depth1 + 1) + ".Escalations.Warn.Statistics" , alertTemplatess.get(depth1).getEscalationsWarnStatistics());
				putQueryParameter("AlertTemplates." + (depth1 + 1) + ".Escalations.Info.Threshold" , alertTemplatess.get(depth1).getEscalationsInfoThreshold());
				putQueryParameter("AlertTemplates." + (depth1 + 1) + ".Namespace" , alertTemplatess.get(depth1).getNamespace());
				putQueryParameter("AlertTemplates." + (depth1 + 1) + ".Selector" , alertTemplatess.get(depth1).getSelector());
				putQueryParameter("AlertTemplates." + (depth1 + 1) + ".MetricName" , alertTemplatess.get(depth1).getMetricName());
				putQueryParameter("AlertTemplates." + (depth1 + 1) + ".Category" , alertTemplatess.get(depth1).getCategory());
				putQueryParameter("AlertTemplates." + (depth1 + 1) + ".Escalations.Critical.ComparisonOperator" , alertTemplatess.get(depth1).getEscalationsCriticalComparisonOperator());
				putQueryParameter("AlertTemplates." + (depth1 + 1) + ".Escalations.Warn.Times" , alertTemplatess.get(depth1).getEscalationsWarnTimes());
				putQueryParameter("AlertTemplates." + (depth1 + 1) + ".Escalations.Critical.Threshold" , alertTemplatess.get(depth1).getEscalationsCriticalThreshold());
			}
		}	
	}

	public Long getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putQueryParameter("TemplateId", templateId.toString());
		}
	}

	public static class AlertTemplates {

		private Integer period;

		private String escalationsWarnThreshold;

		private String escalationsWarnComparisonOperator;

		private String escalationsCriticalStatistics;

		private Integer escalationsInfoTimes;

		private String ruleName;

		private String escalationsInfoStatistics;

		private Integer escalationsCriticalTimes;

		private String escalationsInfoComparisonOperator;

		private String escalationsWarnStatistics;

		private String escalationsInfoThreshold;

		private String namespace;

		private String selector;

		private String metricName;

		private String category;

		private String escalationsCriticalComparisonOperator;

		private Integer escalationsWarnTimes;

		private String escalationsCriticalThreshold;

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
		}

		public String getEscalationsWarnThreshold() {
			return this.escalationsWarnThreshold;
		}

		public void setEscalationsWarnThreshold(String escalationsWarnThreshold) {
			this.escalationsWarnThreshold = escalationsWarnThreshold;
		}

		public String getEscalationsWarnComparisonOperator() {
			return this.escalationsWarnComparisonOperator;
		}

		public void setEscalationsWarnComparisonOperator(String escalationsWarnComparisonOperator) {
			this.escalationsWarnComparisonOperator = escalationsWarnComparisonOperator;
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

		public Integer getEscalationsCriticalTimes() {
			return this.escalationsCriticalTimes;
		}

		public void setEscalationsCriticalTimes(Integer escalationsCriticalTimes) {
			this.escalationsCriticalTimes = escalationsCriticalTimes;
		}

		public String getEscalationsInfoComparisonOperator() {
			return this.escalationsInfoComparisonOperator;
		}

		public void setEscalationsInfoComparisonOperator(String escalationsInfoComparisonOperator) {
			this.escalationsInfoComparisonOperator = escalationsInfoComparisonOperator;
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

		public String getSelector() {
			return this.selector;
		}

		public void setSelector(String selector) {
			this.selector = selector;
		}

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
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

		public Integer getEscalationsWarnTimes() {
			return this.escalationsWarnTimes;
		}

		public void setEscalationsWarnTimes(Integer escalationsWarnTimes) {
			this.escalationsWarnTimes = escalationsWarnTimes;
		}

		public String getEscalationsCriticalThreshold() {
			return this.escalationsCriticalThreshold;
		}

		public void setEscalationsCriticalThreshold(String escalationsCriticalThreshold) {
			this.escalationsCriticalThreshold = escalationsCriticalThreshold;
		}
	}

	@Override
	public Class<ModifyMetricRuleTemplateResponse> getResponseClass() {
		return ModifyMetricRuleTemplateResponse.class;
	}

}
