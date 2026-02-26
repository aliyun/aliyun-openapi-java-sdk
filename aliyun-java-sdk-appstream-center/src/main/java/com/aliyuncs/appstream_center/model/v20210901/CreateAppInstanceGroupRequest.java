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

package com.aliyuncs.appstream_center.model.v20210901;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateAppInstanceGroupRequest extends RpcAcsRequest<CreateAppInstanceGroupResponse> {
	   

	@SerializedName("runtimePolicy")
	private RuntimePolicy runtimePolicy;

	private String bizRegionId;

	private String productType;

	@SerializedName("network")
	private Network network;

	private Integer sessionTimeout;

	private String chargeResourceMode;

	private String appCenterImageId;

	@SerializedName("userInfo")
	private UserInfo userInfo;

	private String preOpenAppId;

	private Integer period;

	private Boolean autoPay;

	@SerializedName("nodePool")
	private NodePool nodePool;

	private String promotionId;

	private List<String> userss;

	private String appInstanceGroupName;

	private String periodUnit;

	private Boolean autoRenew;

	private String chargeType;
	public CreateAppInstanceGroupRequest() {
		super("appstream-center", "2021-09-01", "CreateAppInstanceGroup");
		setMethod(MethodType.POST);
	}

	public RuntimePolicy getRuntimePolicy() {
		return this.runtimePolicy;
	}

	public void setRuntimePolicy(RuntimePolicy runtimePolicy) {
		this.runtimePolicy = runtimePolicy;	
		if (runtimePolicy != null) {
			putBodyParameter("RuntimePolicy" , new Gson().toJson(runtimePolicy));
		}	
	}

	public String getBizRegionId() {
		return this.bizRegionId;
	}

	public void setBizRegionId(String bizRegionId) {
		this.bizRegionId = bizRegionId;
		if(bizRegionId != null){
			putBodyParameter("BizRegionId", bizRegionId);
		}
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
		if(productType != null){
			putBodyParameter("ProductType", productType);
		}
	}

	public Network getNetwork() {
		return this.network;
	}

	public void setNetwork(Network network) {
		this.network = network;	
		if (network != null) {
			putBodyParameter("Network" , new Gson().toJson(network));
		}	
	}

	public Integer getSessionTimeout() {
		return this.sessionTimeout;
	}

	public void setSessionTimeout(Integer sessionTimeout) {
		this.sessionTimeout = sessionTimeout;
		if(sessionTimeout != null){
			putBodyParameter("SessionTimeout", sessionTimeout.toString());
		}
	}

	public String getChargeResourceMode() {
		return this.chargeResourceMode;
	}

	public void setChargeResourceMode(String chargeResourceMode) {
		this.chargeResourceMode = chargeResourceMode;
		if(chargeResourceMode != null){
			putBodyParameter("ChargeResourceMode", chargeResourceMode);
		}
	}

	public String getAppCenterImageId() {
		return this.appCenterImageId;
	}

	public void setAppCenterImageId(String appCenterImageId) {
		this.appCenterImageId = appCenterImageId;
		if(appCenterImageId != null){
			putBodyParameter("AppCenterImageId", appCenterImageId);
		}
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;	
		if (userInfo != null) {
			putBodyParameter("UserInfo" , new Gson().toJson(userInfo));
		}	
	}

	public String getPreOpenAppId() {
		return this.preOpenAppId;
	}

	public void setPreOpenAppId(String preOpenAppId) {
		this.preOpenAppId = preOpenAppId;
		if(preOpenAppId != null){
			putBodyParameter("PreOpenAppId", preOpenAppId);
		}
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putBodyParameter("Period", period.toString());
		}
	}

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putBodyParameter("AutoPay", autoPay.toString());
		}
	}

	public NodePool getNodePool() {
		return this.nodePool;
	}

	public void setNodePool(NodePool nodePool) {
		this.nodePool = nodePool;	
		if (nodePool != null) {
			putBodyParameter("NodePool" , new Gson().toJson(nodePool));
		}	
	}

	public String getPromotionId() {
		return this.promotionId;
	}

	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
		if(promotionId != null){
			putBodyParameter("PromotionId", promotionId);
		}
	}

	public List<String> getUserss() {
		return this.userss;
	}

	public void setUserss(List<String> userss) {
		this.userss = userss;	
		if (userss != null) {
			for (int i = 0; i < userss.size(); i++) {
				putBodyParameter("Users." + (i + 1) , userss.get(i));
			}
		}	
	}

	public String getAppInstanceGroupName() {
		return this.appInstanceGroupName;
	}

	public void setAppInstanceGroupName(String appInstanceGroupName) {
		this.appInstanceGroupName = appInstanceGroupName;
		if(appInstanceGroupName != null){
			putBodyParameter("AppInstanceGroupName", appInstanceGroupName);
		}
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
		if(periodUnit != null){
			putBodyParameter("PeriodUnit", periodUnit);
		}
	}

	public Boolean getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(Boolean autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putBodyParameter("AutoRenew", autoRenew.toString());
		}
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
		if(chargeType != null){
			putBodyParameter("ChargeType", chargeType);
		}
	}

	public static class RuntimePolicy {

		@SerializedName("SessionType")
		private String sessionType;

		@SerializedName("DebugMode")
		private String debugMode;

		public String getSessionType() {
			return this.sessionType;
		}

		public void setSessionType(String sessionType) {
			this.sessionType = sessionType;
		}

		public String getDebugMode() {
			return this.debugMode;
		}

		public void setDebugMode(String debugMode) {
			this.debugMode = debugMode;
		}
	}

	public static class Network {

		@SerializedName("Routes")
		private List<RoutesItem> routes;

		@SerializedName("StrategyType")
		private String strategyType;

		public List<RoutesItem> getRoutes() {
			return this.routes;
		}

		public void setRoutes(List<RoutesItem> routes) {
			this.routes = routes;
		}

		public String getStrategyType() {
			return this.strategyType;
		}

		public void setStrategyType(String strategyType) {
			this.strategyType = strategyType;
		}

		public static class RoutesItem {

			@SerializedName("Mode")
			private String mode;

			@SerializedName("Destination")
			private String destination;

			public String getMode() {
				return this.mode;
			}

			public void setMode(String mode) {
				this.mode = mode;
			}

			public String getDestination() {
				return this.destination;
			}

			public void setDestination(String destination) {
				this.destination = destination;
			}
		}
	}

	public static class UserInfo {

		@SerializedName("Type")
		private String type;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	public static class NodePool {

		@SerializedName("RecurrenceSchedules")
		private List<RecurrenceSchedulesItem> recurrenceSchedules;

		@SerializedName("NodeAmount")
		private Integer nodeAmount;

		@SerializedName("ScalingStep")
		private Integer scalingStep;

		@SerializedName("StrategyDisableDate")
		private String strategyDisableDate;

		@SerializedName("NodeInstanceType")
		private String nodeInstanceType;

		@SerializedName("ScalingDownAfterIdleMinutes")
		private Integer scalingDownAfterIdleMinutes;

		@SerializedName("StrategyType")
		private String strategyType;

		@SerializedName("MaxScalingAmount")
		private Integer maxScalingAmount;

		@SerializedName("WarmUp")
		private Boolean warmUp;

		@SerializedName("ScalingUsageThreshold")
		private String scalingUsageThreshold;

		@SerializedName("NodeCapacity")
		private Integer nodeCapacity;

		@SerializedName("StrategyEnableDate")
		private String strategyEnableDate;

		public List<RecurrenceSchedulesItem> getRecurrenceSchedules() {
			return this.recurrenceSchedules;
		}

		public void setRecurrenceSchedules(List<RecurrenceSchedulesItem> recurrenceSchedules) {
			this.recurrenceSchedules = recurrenceSchedules;
		}

		public Integer getNodeAmount() {
			return this.nodeAmount;
		}

		public void setNodeAmount(Integer nodeAmount) {
			this.nodeAmount = nodeAmount;
		}

		public Integer getScalingStep() {
			return this.scalingStep;
		}

		public void setScalingStep(Integer scalingStep) {
			this.scalingStep = scalingStep;
		}

		public String getStrategyDisableDate() {
			return this.strategyDisableDate;
		}

		public void setStrategyDisableDate(String strategyDisableDate) {
			this.strategyDisableDate = strategyDisableDate;
		}

		public String getNodeInstanceType() {
			return this.nodeInstanceType;
		}

		public void setNodeInstanceType(String nodeInstanceType) {
			this.nodeInstanceType = nodeInstanceType;
		}

		public Integer getScalingDownAfterIdleMinutes() {
			return this.scalingDownAfterIdleMinutes;
		}

		public void setScalingDownAfterIdleMinutes(Integer scalingDownAfterIdleMinutes) {
			this.scalingDownAfterIdleMinutes = scalingDownAfterIdleMinutes;
		}

		public String getStrategyType() {
			return this.strategyType;
		}

		public void setStrategyType(String strategyType) {
			this.strategyType = strategyType;
		}

		public Integer getMaxScalingAmount() {
			return this.maxScalingAmount;
		}

		public void setMaxScalingAmount(Integer maxScalingAmount) {
			this.maxScalingAmount = maxScalingAmount;
		}

		public Boolean getWarmUp() {
			return this.warmUp;
		}

		public void setWarmUp(Boolean warmUp) {
			this.warmUp = warmUp;
		}

		public String getScalingUsageThreshold() {
			return this.scalingUsageThreshold;
		}

		public void setScalingUsageThreshold(String scalingUsageThreshold) {
			this.scalingUsageThreshold = scalingUsageThreshold;
		}

		public Integer getNodeCapacity() {
			return this.nodeCapacity;
		}

		public void setNodeCapacity(Integer nodeCapacity) {
			this.nodeCapacity = nodeCapacity;
		}

		public String getStrategyEnableDate() {
			return this.strategyEnableDate;
		}

		public void setStrategyEnableDate(String strategyEnableDate) {
			this.strategyEnableDate = strategyEnableDate;
		}

		public static class RecurrenceSchedulesItem {

			@SerializedName("RecurrenceValues")
			private List<Integer> recurrenceValues;

			@SerializedName("RecurrenceType")
			private String recurrenceType;

			@SerializedName("TimerPeriods")
			private List<TimerPeriodsItem> timerPeriods;

			public List<Integer> getRecurrenceValues() {
				return this.recurrenceValues;
			}

			public void setRecurrenceValues(List<Integer> recurrenceValues) {
				this.recurrenceValues = recurrenceValues;
			}

			public String getRecurrenceType() {
				return this.recurrenceType;
			}

			public void setRecurrenceType(String recurrenceType) {
				this.recurrenceType = recurrenceType;
			}

			public List<TimerPeriodsItem> getTimerPeriods() {
				return this.timerPeriods;
			}

			public void setTimerPeriods(List<TimerPeriodsItem> timerPeriods) {
				this.timerPeriods = timerPeriods;
			}

			public static class TimerPeriodsItem {

				@SerializedName("Amount")
				private Integer amount;

				@SerializedName("EndTime")
				private String endTime;

				@SerializedName("StartTime")
				private String startTime;

				public Integer getAmount() {
					return this.amount;
				}

				public void setAmount(Integer amount) {
					this.amount = amount;
				}

				public String getEndTime() {
					return this.endTime;
				}

				public void setEndTime(String endTime) {
					this.endTime = endTime;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}
			}
		}
	}

	@Override
	public Class<CreateAppInstanceGroupResponse> getResponseClass() {
		return CreateAppInstanceGroupResponse.class;
	}

}
