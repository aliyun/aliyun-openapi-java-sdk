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

/**
 * @author auto create
 * @version 
 */
public class CreateScalingRuleRequest extends RpcAcsRequest<CreateScalingRuleResponse> {
	
	public CreateScalingRuleRequest() {
		super("Emr", "2016-04-08", "CreateScalingRule");
	}

	private String launchTime;

	private Long resourceOwnerId;

	private String ruleCategory;

	private Integer adjustmentValue;

	private String adjustmentType;

	private String ruleName;

	private String clusterId;

	private Integer launchExpirationTime;

	private String recurrenceValue;

	private String recurrenceEndTime;

	private String hostGroupId;

	private Integer cooldown;

	private String recurrenceType;

	public String getLaunchTime() {
		return this.launchTime;
	}

	public void setLaunchTime(String launchTime) {
		this.launchTime = launchTime;
		if(launchTime != null){
			putQueryParameter("LaunchTime", launchTime);
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

	public String getRuleCategory() {
		return this.ruleCategory;
	}

	public void setRuleCategory(String ruleCategory) {
		this.ruleCategory = ruleCategory;
		if(ruleCategory != null){
			putQueryParameter("RuleCategory", ruleCategory);
		}
	}

	public Integer getAdjustmentValue() {
		return this.adjustmentValue;
	}

	public void setAdjustmentValue(Integer adjustmentValue) {
		this.adjustmentValue = adjustmentValue;
		if(adjustmentValue != null){
			putQueryParameter("AdjustmentValue", adjustmentValue.toString());
		}
	}

	public String getAdjustmentType() {
		return this.adjustmentType;
	}

	public void setAdjustmentType(String adjustmentType) {
		this.adjustmentType = adjustmentType;
		if(adjustmentType != null){
			putQueryParameter("AdjustmentType", adjustmentType);
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

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public Integer getLaunchExpirationTime() {
		return this.launchExpirationTime;
	}

	public void setLaunchExpirationTime(Integer launchExpirationTime) {
		this.launchExpirationTime = launchExpirationTime;
		if(launchExpirationTime != null){
			putQueryParameter("LaunchExpirationTime", launchExpirationTime.toString());
		}
	}

	public String getRecurrenceValue() {
		return this.recurrenceValue;
	}

	public void setRecurrenceValue(String recurrenceValue) {
		this.recurrenceValue = recurrenceValue;
		if(recurrenceValue != null){
			putQueryParameter("RecurrenceValue", recurrenceValue);
		}
	}

	public String getRecurrenceEndTime() {
		return this.recurrenceEndTime;
	}

	public void setRecurrenceEndTime(String recurrenceEndTime) {
		this.recurrenceEndTime = recurrenceEndTime;
		if(recurrenceEndTime != null){
			putQueryParameter("RecurrenceEndTime", recurrenceEndTime);
		}
	}

	public String getHostGroupId() {
		return this.hostGroupId;
	}

	public void setHostGroupId(String hostGroupId) {
		this.hostGroupId = hostGroupId;
		if(hostGroupId != null){
			putQueryParameter("HostGroupId", hostGroupId);
		}
	}

	public Integer getCooldown() {
		return this.cooldown;
	}

	public void setCooldown(Integer cooldown) {
		this.cooldown = cooldown;
		if(cooldown != null){
			putQueryParameter("Cooldown", cooldown.toString());
		}
	}

	public String getRecurrenceType() {
		return this.recurrenceType;
	}

	public void setRecurrenceType(String recurrenceType) {
		this.recurrenceType = recurrenceType;
		if(recurrenceType != null){
			putQueryParameter("RecurrenceType", recurrenceType);
		}
	}

	@Override
	public Class<CreateScalingRuleResponse> getResponseClass() {
		return CreateScalingRuleResponse.class;
	}

}
