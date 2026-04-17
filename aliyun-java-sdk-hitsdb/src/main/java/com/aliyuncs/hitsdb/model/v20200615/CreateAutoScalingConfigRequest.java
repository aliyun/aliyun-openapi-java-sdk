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

package com.aliyuncs.hitsdb.model.v20200615;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hitsdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAutoScalingConfigRequest extends RpcAcsRequest<CreateAutoScalingConfigResponse> {
	   

	private String specId;

	private Long resourceOwnerId;

	private Boolean enabled;

	private String securityToken;

	private String engine;

	private String configName;

	@SerializedName("scaleRuleList")
	private List<ScaleRuleList> scaleRuleList;

	private String scaleType;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String effectiveTimeEnd;

	private Long storageCapacityMax;

	private Long ownerId;

	private Integer nodesMax;

	private String instanceId;

	private String effectiveTimeStart;

	private Integer nodesMin;
	public CreateAutoScalingConfigRequest() {
		super("hitsdb", "2020-06-15", "CreateAutoScalingConfig", "hitsdb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSpecId() {
		return this.specId;
	}

	public void setSpecId(String specId) {
		this.specId = specId;
		if(specId != null){
			putQueryParameter("SpecId", specId);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		if(enabled != null){
			putQueryParameter("Enabled", enabled.toString());
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
		if(engine != null){
			putQueryParameter("Engine", engine);
		}
	}

	public String getConfigName() {
		return this.configName;
	}

	public void setConfigName(String configName) {
		this.configName = configName;
		if(configName != null){
			putQueryParameter("ConfigName", configName);
		}
	}

	public List<ScaleRuleList> getScaleRuleList() {
		return this.scaleRuleList;
	}

	public void setScaleRuleList(List<ScaleRuleList> scaleRuleList) {
		this.scaleRuleList = scaleRuleList;	
		if (scaleRuleList != null) {
			putQueryParameter("ScaleRuleList" , new Gson().toJson(scaleRuleList));
		}	
	}

	public String getScaleType() {
		return this.scaleType;
	}

	public void setScaleType(String scaleType) {
		this.scaleType = scaleType;
		if(scaleType != null){
			putQueryParameter("ScaleType", scaleType);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getEffectiveTimeEnd() {
		return this.effectiveTimeEnd;
	}

	public void setEffectiveTimeEnd(String effectiveTimeEnd) {
		this.effectiveTimeEnd = effectiveTimeEnd;
		if(effectiveTimeEnd != null){
			putQueryParameter("EffectiveTimeEnd", effectiveTimeEnd);
		}
	}

	public Long getStorageCapacityMax() {
		return this.storageCapacityMax;
	}

	public void setStorageCapacityMax(Long storageCapacityMax) {
		this.storageCapacityMax = storageCapacityMax;
		if(storageCapacityMax != null){
			putQueryParameter("StorageCapacityMax", storageCapacityMax.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Integer getNodesMax() {
		return this.nodesMax;
	}

	public void setNodesMax(Integer nodesMax) {
		this.nodesMax = nodesMax;
		if(nodesMax != null){
			putQueryParameter("NodesMax", nodesMax.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getEffectiveTimeStart() {
		return this.effectiveTimeStart;
	}

	public void setEffectiveTimeStart(String effectiveTimeStart) {
		this.effectiveTimeStart = effectiveTimeStart;
		if(effectiveTimeStart != null){
			putQueryParameter("EffectiveTimeStart", effectiveTimeStart);
		}
	}

	public Integer getNodesMin() {
		return this.nodesMin;
	}

	public void setNodesMin(Integer nodesMin) {
		this.nodesMin = nodesMin;
		if(nodesMin != null){
			putQueryParameter("NodesMin", nodesMin.toString());
		}
	}

	public static class ScaleRuleList {

		@SerializedName("RuleType")
		private String ruleType;

		@SerializedName("EndTime")
		private String endTime;

		@SerializedName("RuleName")
		private String ruleName;

		@SerializedName("OperationType")
		private String operationType;

		@SerializedName("ScaleOutStep")
		private Integer scaleOutStep;

		@SerializedName("StartTime")
		private String startTime;

		@SerializedName("ScaleInStep")
		private Integer scaleInStep;

		@SerializedName("Enabled")
		private Boolean enabled;

		@SerializedName("TargetNodes")
		private Integer targetNodes;

		@SerializedName("TargetMetric")
		private String targetMetric;

		@SerializedName("InstanceId")
		private String instanceId;

		@SerializedName("ConfigId")
		private String configId;

		@SerializedName("ObservationWindow")
		private Integer observationWindow;

		@SerializedName("SilenceTime")
		private Integer silenceTime;

		@SerializedName("TriggerCronExpr")
		private String triggerCronExpr;

		@SerializedName("RuleId")
		private String ruleId;

		@SerializedName("ThresholdLower")
		private Integer thresholdLower;

		@SerializedName("ThresholdUpper")
		private Integer thresholdUpper;

		public String getRuleType() {
			return this.ruleType;
		}

		public void setRuleType(String ruleType) {
			this.ruleType = ruleType;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getOperationType() {
			return this.operationType;
		}

		public void setOperationType(String operationType) {
			this.operationType = operationType;
		}

		public Integer getScaleOutStep() {
			return this.scaleOutStep;
		}

		public void setScaleOutStep(Integer scaleOutStep) {
			this.scaleOutStep = scaleOutStep;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public Integer getScaleInStep() {
			return this.scaleInStep;
		}

		public void setScaleInStep(Integer scaleInStep) {
			this.scaleInStep = scaleInStep;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public Integer getTargetNodes() {
			return this.targetNodes;
		}

		public void setTargetNodes(Integer targetNodes) {
			this.targetNodes = targetNodes;
		}

		public String getTargetMetric() {
			return this.targetMetric;
		}

		public void setTargetMetric(String targetMetric) {
			this.targetMetric = targetMetric;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getConfigId() {
			return this.configId;
		}

		public void setConfigId(String configId) {
			this.configId = configId;
		}

		public Integer getObservationWindow() {
			return this.observationWindow;
		}

		public void setObservationWindow(Integer observationWindow) {
			this.observationWindow = observationWindow;
		}

		public Integer getSilenceTime() {
			return this.silenceTime;
		}

		public void setSilenceTime(Integer silenceTime) {
			this.silenceTime = silenceTime;
		}

		public String getTriggerCronExpr() {
			return this.triggerCronExpr;
		}

		public void setTriggerCronExpr(String triggerCronExpr) {
			this.triggerCronExpr = triggerCronExpr;
		}

		public String getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(String ruleId) {
			this.ruleId = ruleId;
		}

		public Integer getThresholdLower() {
			return this.thresholdLower;
		}

		public void setThresholdLower(Integer thresholdLower) {
			this.thresholdLower = thresholdLower;
		}

		public Integer getThresholdUpper() {
			return this.thresholdUpper;
		}

		public void setThresholdUpper(Integer thresholdUpper) {
			this.thresholdUpper = thresholdUpper;
		}
	}

	@Override
	public Class<CreateAutoScalingConfigResponse> getResponseClass() {
		return CreateAutoScalingConfigResponse.class;
	}

}
