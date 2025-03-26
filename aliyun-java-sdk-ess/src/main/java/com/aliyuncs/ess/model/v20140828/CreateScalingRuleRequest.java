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
import com.aliyuncs.ess.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateScalingRuleRequest extends RpcAcsRequest<CreateScalingRuleResponse> {
	   

	private String metricType;

	private List<AlarmDimension> alarmDimensions;

	private List<StepAdjustment> stepAdjustments;

	private String scalingGroupId;

	private Boolean disableScaleIn;

	private Integer initialMaxSize;

	private String scalingRuleName;

	private String hybridMonitorNamespace;

	private Integer cooldown;

	private String predictiveValueBehavior;

	private Integer scaleInEvaluationCount;

	private String scalingRuleType;

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

	private List<HybridMetrics> hybridMetricss;

	private Integer scaleOutEvaluationCount;

	private Integer minAdjustmentMagnitude;

	private Float targetValue;
	public CreateScalingRuleRequest() {
		super("Ess", "2014-08-28", "CreateScalingRule", "ess");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMetricType() {
		return this.metricType;
	}

	public void setMetricType(String metricType) {
		this.metricType = metricType;
		if(metricType != null){
			putQueryParameter("MetricType", metricType);
		}
	}

	public List<AlarmDimension> getAlarmDimensions() {
		return this.alarmDimensions;
	}

	public void setAlarmDimensions(List<AlarmDimension> alarmDimensions) {
		this.alarmDimensions = alarmDimensions;	
		if (alarmDimensions != null) {
			for (int depth1 = 0; depth1 < alarmDimensions.size(); depth1++) {
				putQueryParameter("AlarmDimension." + (depth1 + 1) + ".DimensionValue" , alarmDimensions.get(depth1).getDimensionValue());
				putQueryParameter("AlarmDimension." + (depth1 + 1) + ".DimensionKey" , alarmDimensions.get(depth1).getDimensionKey());
			}
		}	
	}

	public List<StepAdjustment> getStepAdjustments() {
		return this.stepAdjustments;
	}

	public void setStepAdjustments(List<StepAdjustment> stepAdjustments) {
		this.stepAdjustments = stepAdjustments;	
		if (stepAdjustments != null) {
			for (int depth1 = 0; depth1 < stepAdjustments.size(); depth1++) {
				putQueryParameter("StepAdjustment." + (depth1 + 1) + ".MetricIntervalUpperBound" , stepAdjustments.get(depth1).getMetricIntervalUpperBound());
				putQueryParameter("StepAdjustment." + (depth1 + 1) + ".MetricIntervalLowerBound" , stepAdjustments.get(depth1).getMetricIntervalLowerBound());
				putQueryParameter("StepAdjustment." + (depth1 + 1) + ".ScalingAdjustment" , stepAdjustments.get(depth1).getScalingAdjustment());
			}
		}	
	}

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
		if(scalingGroupId != null){
			putQueryParameter("ScalingGroupId", scalingGroupId);
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

	public String getHybridMonitorNamespace() {
		return this.hybridMonitorNamespace;
	}

	public void setHybridMonitorNamespace(String hybridMonitorNamespace) {
		this.hybridMonitorNamespace = hybridMonitorNamespace;
		if(hybridMonitorNamespace != null){
			putQueryParameter("HybridMonitorNamespace", hybridMonitorNamespace);
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

	public Integer getScaleInEvaluationCount() {
		return this.scaleInEvaluationCount;
	}

	public void setScaleInEvaluationCount(Integer scaleInEvaluationCount) {
		this.scaleInEvaluationCount = scaleInEvaluationCount;
		if(scaleInEvaluationCount != null){
			putQueryParameter("ScaleInEvaluationCount", scaleInEvaluationCount.toString());
		}
	}

	public String getScalingRuleType() {
		return this.scalingRuleType;
	}

	public void setScalingRuleType(String scalingRuleType) {
		this.scalingRuleType = scalingRuleType;
		if(scalingRuleType != null){
			putQueryParameter("ScalingRuleType", scalingRuleType);
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

	public List<HybridMetrics> getHybridMetricss() {
		return this.hybridMetricss;
	}

	public void setHybridMetricss(List<HybridMetrics> hybridMetricss) {
		this.hybridMetricss = hybridMetricss;	
		if (hybridMetricss != null) {
			for (int depth1 = 0; depth1 < hybridMetricss.size(); depth1++) {
				putQueryParameter("HybridMetrics." + (depth1 + 1) + ".Statistic" , hybridMetricss.get(depth1).getStatistic());
				putQueryParameter("HybridMetrics." + (depth1 + 1) + ".Expression" , hybridMetricss.get(depth1).getExpression());
				putQueryParameter("HybridMetrics." + (depth1 + 1) + ".Id" , hybridMetricss.get(depth1).getId());
				putQueryParameter("HybridMetrics." + (depth1 + 1) + ".MetricName" , hybridMetricss.get(depth1).getMetricName());
				if (hybridMetricss.get(depth1).getDimensionss() != null) {
					for (int depth2 = 0; depth2 < hybridMetricss.get(depth1).getDimensionss().size(); depth2++) {
						putQueryParameter("HybridMetrics." + (depth1 + 1) + ".Dimensions." + (depth2 + 1) + ".DimensionValue" , hybridMetricss.get(depth1).getDimensionss().get(depth2).getDimensionValue());
						putQueryParameter("HybridMetrics." + (depth1 + 1) + ".Dimensions." + (depth2 + 1) + ".DimensionKey" , hybridMetricss.get(depth1).getDimensionss().get(depth2).getDimensionKey());
					}
				}
			}
		}	
	}

	public Integer getScaleOutEvaluationCount() {
		return this.scaleOutEvaluationCount;
	}

	public void setScaleOutEvaluationCount(Integer scaleOutEvaluationCount) {
		this.scaleOutEvaluationCount = scaleOutEvaluationCount;
		if(scaleOutEvaluationCount != null){
			putQueryParameter("ScaleOutEvaluationCount", scaleOutEvaluationCount.toString());
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

	public static class AlarmDimension {

		private String dimensionValue;

		private String dimensionKey;

		public String getDimensionValue() {
			return this.dimensionValue;
		}

		public void setDimensionValue(String dimensionValue) {
			this.dimensionValue = dimensionValue;
		}

		public String getDimensionKey() {
			return this.dimensionKey;
		}

		public void setDimensionKey(String dimensionKey) {
			this.dimensionKey = dimensionKey;
		}
	}

	public static class StepAdjustment {

		private Float metricIntervalUpperBound;

		private Float metricIntervalLowerBound;

		private Integer scalingAdjustment;

		public Float getMetricIntervalUpperBound() {
			return this.metricIntervalUpperBound;
		}

		public void setMetricIntervalUpperBound(Float metricIntervalUpperBound) {
			this.metricIntervalUpperBound = metricIntervalUpperBound;
		}

		public Float getMetricIntervalLowerBound() {
			return this.metricIntervalLowerBound;
		}

		public void setMetricIntervalLowerBound(Float metricIntervalLowerBound) {
			this.metricIntervalLowerBound = metricIntervalLowerBound;
		}

		public Integer getScalingAdjustment() {
			return this.scalingAdjustment;
		}

		public void setScalingAdjustment(Integer scalingAdjustment) {
			this.scalingAdjustment = scalingAdjustment;
		}
	}

	public static class HybridMetrics {

		private String statistic;

		private String expression;

		private String id;

		private String metricName;

		private List<Dimensions> dimensionss;

		public String getStatistic() {
			return this.statistic;
		}

		public void setStatistic(String statistic) {
			this.statistic = statistic;
		}

		public String getExpression() {
			return this.expression;
		}

		public void setExpression(String expression) {
			this.expression = expression;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public List<Dimensions> getDimensionss() {
			return this.dimensionss;
		}

		public void setDimensionss(List<Dimensions> dimensionss) {
			this.dimensionss = dimensionss;
		}

		public static class Dimensions {

			private String dimensionValue;

			private String dimensionKey;

			public String getDimensionValue() {
				return this.dimensionValue;
			}

			public void setDimensionValue(String dimensionValue) {
				this.dimensionValue = dimensionValue;
			}

			public String getDimensionKey() {
				return this.dimensionKey;
			}

			public void setDimensionKey(String dimensionKey) {
				this.dimensionKey = dimensionKey;
			}
		}
	}

	@Override
	public Class<CreateScalingRuleResponse> getResponseClass() {
		return CreateScalingRuleResponse.class;
	}

}
