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

package com.aliyuncs.ess.model.v20140828;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyScalingRuleRequest extends RpcAcsRequest<ModifyScalingRuleResponse> {
	   

	private Long resourceOwnerId;

	private List<StepAdjustment> stepAdjustments;

	private Boolean disableScaleIn;

	private String scalingRuleId;

	private Integer initialMaxSize;

	private String scalingRuleName;

	private Integer cooldown;

	private String predictiveValueBehavior;

	private String metricName;

	private String predictiveScalingMode;

	private String resourceOwnerAccount;

	private Integer adjustmentValue;

	private Integer estimatedInstanceWarmup;

	private String ownerAccount;

	private Integer predictiveTaskBufferTime;

	private String adjustmentType;

	private Long ownerId;

	private Integer predictiveValueBuffer;

	private Integer minAdjustmentMagnitude;

	private Float targetValue;
	public ModifyScalingRuleRequest() {
		super("Ess", "2014-08-28", "ModifyScalingRule", "ess");
		setMethod(MethodType.POST);
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

	public List<StepAdjustment> getStepAdjustments() {
		return this.stepAdjustments;
	}

	public void setStepAdjustments(List<StepAdjustment> stepAdjustments) {
		this.stepAdjustments = stepAdjustments;	
		if (stepAdjustments != null) {
			for (int depth1 = 0; depth1 < stepAdjustments.size(); depth1++) {
				putQueryParameter("StepAdjustment." + (depth1 + 1) + ".MetricIntervalLowerBound" , stepAdjustments.get(depth1).getMetricIntervalLowerBound());
				putQueryParameter("StepAdjustment." + (depth1 + 1) + ".MetricIntervalUpperBound" , stepAdjustments.get(depth1).getMetricIntervalUpperBound());
				putQueryParameter("StepAdjustment." + (depth1 + 1) + ".ScalingAdjustment" , stepAdjustments.get(depth1).getScalingAdjustment());
			}
		}	
	}

	public Boolean getDisableScaleIn() {
		return this.disableScaleIn;
	}

	public void setDisableScaleIn(Boolean disableScaleIn) {
		this.disableScaleIn = disableScaleIn;
		if(disableScaleIn != null){
			putQueryParameter("DisableScaleIn", disableScaleIn.toString());
		}
	}

	public String getScalingRuleId() {
		return this.scalingRuleId;
	}

	public void setScalingRuleId(String scalingRuleId) {
		this.scalingRuleId = scalingRuleId;
		if(scalingRuleId != null){
			putQueryParameter("ScalingRuleId", scalingRuleId);
		}
	}

	public Integer getInitialMaxSize() {
		return this.initialMaxSize;
	}

	public void setInitialMaxSize(Integer initialMaxSize) {
		this.initialMaxSize = initialMaxSize;
		if(initialMaxSize != null){
			putQueryParameter("InitialMaxSize", initialMaxSize.toString());
		}
	}

	public String getScalingRuleName() {
		return this.scalingRuleName;
	}

	public void setScalingRuleName(String scalingRuleName) {
		this.scalingRuleName = scalingRuleName;
		if(scalingRuleName != null){
			putQueryParameter("ScalingRuleName", scalingRuleName);
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

	public String getPredictiveValueBehavior() {
		return this.predictiveValueBehavior;
	}

	public void setPredictiveValueBehavior(String predictiveValueBehavior) {
		this.predictiveValueBehavior = predictiveValueBehavior;
		if(predictiveValueBehavior != null){
			putQueryParameter("PredictiveValueBehavior", predictiveValueBehavior);
		}
	}

	public String getMetricName() {
		return this.metricName;
	}

	public void setMetricName(String metricName) {
		this.metricName = metricName;
		if(metricName != null){
			putQueryParameter("MetricName", metricName);
		}
	}

	public String getPredictiveScalingMode() {
		return this.predictiveScalingMode;
	}

	public void setPredictiveScalingMode(String predictiveScalingMode) {
		this.predictiveScalingMode = predictiveScalingMode;
		if(predictiveScalingMode != null){
			putQueryParameter("PredictiveScalingMode", predictiveScalingMode);
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

	public Integer getAdjustmentValue() {
		return this.adjustmentValue;
	}

	public void setAdjustmentValue(Integer adjustmentValue) {
		this.adjustmentValue = adjustmentValue;
		if(adjustmentValue != null){
			putQueryParameter("AdjustmentValue", adjustmentValue.toString());
		}
	}

	public Integer getEstimatedInstanceWarmup() {
		return this.estimatedInstanceWarmup;
	}

	public void setEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
		this.estimatedInstanceWarmup = estimatedInstanceWarmup;
		if(estimatedInstanceWarmup != null){
			putQueryParameter("EstimatedInstanceWarmup", estimatedInstanceWarmup.toString());
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

	public Integer getPredictiveTaskBufferTime() {
		return this.predictiveTaskBufferTime;
	}

	public void setPredictiveTaskBufferTime(Integer predictiveTaskBufferTime) {
		this.predictiveTaskBufferTime = predictiveTaskBufferTime;
		if(predictiveTaskBufferTime != null){
			putQueryParameter("PredictiveTaskBufferTime", predictiveTaskBufferTime.toString());
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Integer getPredictiveValueBuffer() {
		return this.predictiveValueBuffer;
	}

	public void setPredictiveValueBuffer(Integer predictiveValueBuffer) {
		this.predictiveValueBuffer = predictiveValueBuffer;
		if(predictiveValueBuffer != null){
			putQueryParameter("PredictiveValueBuffer", predictiveValueBuffer.toString());
		}
	}

	public Integer getMinAdjustmentMagnitude() {
		return this.minAdjustmentMagnitude;
	}

	public void setMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
		this.minAdjustmentMagnitude = minAdjustmentMagnitude;
		if(minAdjustmentMagnitude != null){
			putQueryParameter("MinAdjustmentMagnitude", minAdjustmentMagnitude.toString());
		}
	}

	public Float getTargetValue() {
		return this.targetValue;
	}

	public void setTargetValue(Float targetValue) {
		this.targetValue = targetValue;
		if(targetValue != null){
			putQueryParameter("TargetValue", targetValue.toString());
		}
	}

	public static class StepAdjustment {

		private Float metricIntervalLowerBound;

		private Float metricIntervalUpperBound;

		private Integer scalingAdjustment;

		public Float getMetricIntervalLowerBound() {
			return this.metricIntervalLowerBound;
		}

		public void setMetricIntervalLowerBound(Float metricIntervalLowerBound) {
			this.metricIntervalLowerBound = metricIntervalLowerBound;
		}

		public Float getMetricIntervalUpperBound() {
			return this.metricIntervalUpperBound;
		}

		public void setMetricIntervalUpperBound(Float metricIntervalUpperBound) {
			this.metricIntervalUpperBound = metricIntervalUpperBound;
		}

		public Integer getScalingAdjustment() {
			return this.scalingAdjustment;
		}

		public void setScalingAdjustment(Integer scalingAdjustment) {
			this.scalingAdjustment = scalingAdjustment;
		}
	}

	@Override
	public Class<ModifyScalingRuleResponse> getResponseClass() {
		return ModifyScalingRuleResponse.class;
	}

}
