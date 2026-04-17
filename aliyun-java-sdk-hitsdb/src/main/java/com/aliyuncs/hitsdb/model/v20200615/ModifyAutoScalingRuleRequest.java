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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hitsdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyAutoScalingRuleRequest extends RpcAcsRequest<ModifyAutoScalingRuleResponse> {
	   

	private Long resourceOwnerId;

	private String ruleName;

	private Integer scaleOutStep;

	private String startTime;

	private Boolean enabled;

	private Integer targetNodes;

	private String targetMetric;

	private String securityToken;

	private Integer silenceTime;

	private String triggerCronExpr;

	private Integer thresholdLower;

	private String resourceOwnerAccount;

	private String ruleType;

	private String ownerAccount;

	private String endTime;

	private String operationType;

	private Long ownerId;

	private Integer scaleInStep;

	private String instanceId;

	private String configId;

	private Integer observationWindow;

	private String ruleId;

	private Integer thresholdUpper;
	public ModifyAutoScalingRuleRequest() {
		super("hitsdb", "2020-06-15", "ModifyAutoScalingRule", "hitsdb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putQueryParameter("RuleName", ruleName);
		}
	}

	public Integer getScaleOutStep() {
		return this.scaleOutStep;
	}

	public void setScaleOutStep(Integer scaleOutStep) {
		this.scaleOutStep = scaleOutStep;
		if(scaleOutStep != null){
			putQueryParameter("ScaleOutStep", scaleOutStep.toString());
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
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

	public Integer getTargetNodes() {
		return this.targetNodes;
	}

	public void setTargetNodes(Integer targetNodes) {
		this.targetNodes = targetNodes;
		if(targetNodes != null){
			putQueryParameter("TargetNodes", targetNodes.toString());
		}
	}

	public String getTargetMetric() {
		return this.targetMetric;
	}

	public void setTargetMetric(String targetMetric) {
		this.targetMetric = targetMetric;
		if(targetMetric != null){
			putQueryParameter("TargetMetric", targetMetric);
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

	public Integer getSilenceTime() {
		return this.silenceTime;
	}

	public void setSilenceTime(Integer silenceTime) {
		this.silenceTime = silenceTime;
		if(silenceTime != null){
			putQueryParameter("SilenceTime", silenceTime.toString());
		}
	}

	public String getTriggerCronExpr() {
		return this.triggerCronExpr;
	}

	public void setTriggerCronExpr(String triggerCronExpr) {
		this.triggerCronExpr = triggerCronExpr;
		if(triggerCronExpr != null){
			putQueryParameter("TriggerCronExpr", triggerCronExpr);
		}
	}

	public Integer getThresholdLower() {
		return this.thresholdLower;
	}

	public void setThresholdLower(Integer thresholdLower) {
		this.thresholdLower = thresholdLower;
		if(thresholdLower != null){
			putQueryParameter("ThresholdLower", thresholdLower.toString());
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

	public String getRuleType() {
		return this.ruleType;
	}

	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
		if(ruleType != null){
			putQueryParameter("RuleType", ruleType);
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

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getOperationType() {
		return this.operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
		if(operationType != null){
			putQueryParameter("OperationType", operationType);
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

	public Integer getScaleInStep() {
		return this.scaleInStep;
	}

	public void setScaleInStep(Integer scaleInStep) {
		this.scaleInStep = scaleInStep;
		if(scaleInStep != null){
			putQueryParameter("ScaleInStep", scaleInStep.toString());
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

	public String getConfigId() {
		return this.configId;
	}

	public void setConfigId(String configId) {
		this.configId = configId;
		if(configId != null){
			putQueryParameter("ConfigId", configId);
		}
	}

	public Integer getObservationWindow() {
		return this.observationWindow;
	}

	public void setObservationWindow(Integer observationWindow) {
		this.observationWindow = observationWindow;
		if(observationWindow != null){
			putQueryParameter("ObservationWindow", observationWindow.toString());
		}
	}

	public String getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
		if(ruleId != null){
			putQueryParameter("RuleId", ruleId);
		}
	}

	public Integer getThresholdUpper() {
		return this.thresholdUpper;
	}

	public void setThresholdUpper(Integer thresholdUpper) {
		this.thresholdUpper = thresholdUpper;
		if(thresholdUpper != null){
			putQueryParameter("ThresholdUpper", thresholdUpper.toString());
		}
	}

	@Override
	public Class<ModifyAutoScalingRuleResponse> getResponseClass() {
		return ModifyAutoScalingRuleResponse.class;
	}

}
