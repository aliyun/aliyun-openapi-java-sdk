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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class UpdateETLJobRequest extends RpcAcsRequest<UpdateETLJobResponse> {
	
	public UpdateETLJobRequest() {
		super("Emr", "2016-04-08", "UpdateETLJob");
	}

	private Long resourceOwnerId;

	private List<StageConnection> stageConnections;

	private String clusterConfig;

	private List<TriggerRule> triggerRules;

	private List<Stage> stages;

	private String alertConfig;

	private String name;

	private String description;

	private String id;

	private Boolean check;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public List<StageConnection> getStageConnections() {
		return this.stageConnections;
	}

	public void setStageConnections(List<StageConnection> stageConnections) {
		this.stageConnections = stageConnections;	
		if (stageConnections != null) {
			for (int depth1 = 0; depth1 < stageConnections.size(); depth1++) {
				putQueryParameter("StageConnection." + (depth1 + 1) + ".Port" , stageConnections.get(depth1).getPort());
				putQueryParameter("StageConnection." + (depth1 + 1) + ".From" , stageConnections.get(depth1).getFrom());
				putQueryParameter("StageConnection." + (depth1 + 1) + ".To" , stageConnections.get(depth1).getTo());
			}
		}	
	}

	public String getClusterConfig() {
		return this.clusterConfig;
	}

	public void setClusterConfig(String clusterConfig) {
		this.clusterConfig = clusterConfig;
		if(clusterConfig != null){
			putQueryParameter("ClusterConfig", clusterConfig);
		}
	}

	public List<TriggerRule> getTriggerRules() {
		return this.triggerRules;
	}

	public void setTriggerRules(List<TriggerRule> triggerRules) {
		this.triggerRules = triggerRules;	
		if (triggerRules != null) {
			for (int depth1 = 0; depth1 < triggerRules.size(); depth1++) {
				putQueryParameter("TriggerRule." + (depth1 + 1) + ".CronExpr" , triggerRules.get(depth1).getCronExpr());
				putQueryParameter("TriggerRule." + (depth1 + 1) + ".EndTime" , triggerRules.get(depth1).getEndTime());
				putQueryParameter("TriggerRule." + (depth1 + 1) + ".StartTime" , triggerRules.get(depth1).getStartTime());
				putQueryParameter("TriggerRule." + (depth1 + 1) + ".Enabled" , triggerRules.get(depth1).getEnabled());
			}
		}	
	}

	public List<Stage> getStages() {
		return this.stages;
	}

	public void setStages(List<Stage> stages) {
		this.stages = stages;	
		if (stages != null) {
			for (int depth1 = 0; depth1 < stages.size(); depth1++) {
				putQueryParameter("Stage." + (depth1 + 1) + ".StageName" , stages.get(depth1).getStageName());
				putQueryParameter("Stage." + (depth1 + 1) + ".StageConf" , stages.get(depth1).getStageConf());
				putQueryParameter("Stage." + (depth1 + 1) + ".StageType" , stages.get(depth1).getStageType());
				putQueryParameter("Stage." + (depth1 + 1) + ".StagePlugin" , stages.get(depth1).getStagePlugin());
			}
		}	
	}

	public String getAlertConfig() {
		return this.alertConfig;
	}

	public void setAlertConfig(String alertConfig) {
		this.alertConfig = alertConfig;
		if(alertConfig != null){
			putQueryParameter("AlertConfig", alertConfig);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public Boolean getCheck() {
		return this.check;
	}

	public void setCheck(Boolean check) {
		this.check = check;
		if(check != null){
			putQueryParameter("Check", check.toString());
		}
	}

	public static class StageConnection {

		private String port;

		private String from;

		private String to;

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getFrom() {
			return this.from;
		}

		public void setFrom(String from) {
			this.from = from;
		}

		public String getTo() {
			return this.to;
		}

		public void setTo(String to) {
			this.to = to;
		}
	}

	public static class TriggerRule {

		private String cronExpr;

		private Long endTime;

		private Long startTime;

		private Boolean enabled;

		public String getCronExpr() {
			return this.cronExpr;
		}

		public void setCronExpr(String cronExpr) {
			this.cronExpr = cronExpr;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}
	}

	public static class Stage {

		private String stageName;

		private String stageConf;

		private String stageType;

		private String stagePlugin;

		public String getStageName() {
			return this.stageName;
		}

		public void setStageName(String stageName) {
			this.stageName = stageName;
		}

		public String getStageConf() {
			return this.stageConf;
		}

		public void setStageConf(String stageConf) {
			this.stageConf = stageConf;
		}

		public String getStageType() {
			return this.stageType;
		}

		public void setStageType(String stageType) {
			this.stageType = stageType;
		}

		public String getStagePlugin() {
			return this.stagePlugin;
		}

		public void setStagePlugin(String stagePlugin) {
			this.stagePlugin = stagePlugin;
		}
	}

	@Override
	public Class<UpdateETLJobResponse> getResponseClass() {
		return UpdateETLJobResponse.class;
	}

}
