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
public class ModifyGroupMonitoringAgentProcessRequest extends RpcAcsRequest<ModifyGroupMonitoringAgentProcessResponse> {
	   

	private List<AlertConfig> alertConfigs;

	private String groupId;

	private String matchExpressFilterRelation;

	private String id;
	public ModifyGroupMonitoringAgentProcessRequest() {
		super("Cms", "2019-01-01", "ModifyGroupMonitoringAgentProcess", "cms");
		setMethod(MethodType.POST);
	}

	public List<AlertConfig> getAlertConfigs() {
		return this.alertConfigs;
	}

	public void setAlertConfigs(List<AlertConfig> alertConfigs) {
		this.alertConfigs = alertConfigs;	
		if (alertConfigs != null) {
			for (int depth1 = 0; depth1 < alertConfigs.size(); depth1++) {
				putQueryParameter("AlertConfig." + (depth1 + 1) + ".Times" , alertConfigs.get(depth1).getTimes());
				putQueryParameter("AlertConfig." + (depth1 + 1) + ".NoEffectiveInterval" , alertConfigs.get(depth1).getNoEffectiveInterval());
				putQueryParameter("AlertConfig." + (depth1 + 1) + ".Webhook" , alertConfigs.get(depth1).getWebhook());
				putQueryParameter("AlertConfig." + (depth1 + 1) + ".SilenceTime" , alertConfigs.get(depth1).getSilenceTime());
				putQueryParameter("AlertConfig." + (depth1 + 1) + ".Threshold" , alertConfigs.get(depth1).getThreshold());
				putQueryParameter("AlertConfig." + (depth1 + 1) + ".EffectiveInterval" , alertConfigs.get(depth1).getEffectiveInterval());
				putQueryParameter("AlertConfig." + (depth1 + 1) + ".ComparisonOperator" , alertConfigs.get(depth1).getComparisonOperator());
				putQueryParameter("AlertConfig." + (depth1 + 1) + ".EscalationsLevel" , alertConfigs.get(depth1).getEscalationsLevel());
				putQueryParameter("AlertConfig." + (depth1 + 1) + ".Statistics" , alertConfigs.get(depth1).getStatistics());
			}
		}	
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getMatchExpressFilterRelation() {
		return this.matchExpressFilterRelation;
	}

	public void setMatchExpressFilterRelation(String matchExpressFilterRelation) {
		this.matchExpressFilterRelation = matchExpressFilterRelation;
		if(matchExpressFilterRelation != null){
			putQueryParameter("MatchExpressFilterRelation", matchExpressFilterRelation);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public static class AlertConfig {

		private String times;

		private String noEffectiveInterval;

		private String webhook;

		private String silenceTime;

		private String threshold;

		private String effectiveInterval;

		private String comparisonOperator;

		private String escalationsLevel;

		private String statistics;

		public String getTimes() {
			return this.times;
		}

		public void setTimes(String times) {
			this.times = times;
		}

		public String getNoEffectiveInterval() {
			return this.noEffectiveInterval;
		}

		public void setNoEffectiveInterval(String noEffectiveInterval) {
			this.noEffectiveInterval = noEffectiveInterval;
		}

		public String getWebhook() {
			return this.webhook;
		}

		public void setWebhook(String webhook) {
			this.webhook = webhook;
		}

		public String getSilenceTime() {
			return this.silenceTime;
		}

		public void setSilenceTime(String silenceTime) {
			this.silenceTime = silenceTime;
		}

		public String getThreshold() {
			return this.threshold;
		}

		public void setThreshold(String threshold) {
			this.threshold = threshold;
		}

		public String getEffectiveInterval() {
			return this.effectiveInterval;
		}

		public void setEffectiveInterval(String effectiveInterval) {
			this.effectiveInterval = effectiveInterval;
		}

		public String getComparisonOperator() {
			return this.comparisonOperator;
		}

		public void setComparisonOperator(String comparisonOperator) {
			this.comparisonOperator = comparisonOperator;
		}

		public String getEscalationsLevel() {
			return this.escalationsLevel;
		}

		public void setEscalationsLevel(String escalationsLevel) {
			this.escalationsLevel = escalationsLevel;
		}

		public String getStatistics() {
			return this.statistics;
		}

		public void setStatistics(String statistics) {
			this.statistics = statistics;
		}
	}

	@Override
	public Class<ModifyGroupMonitoringAgentProcessResponse> getResponseClass() {
		return ModifyGroupMonitoringAgentProcessResponse.class;
	}

}
