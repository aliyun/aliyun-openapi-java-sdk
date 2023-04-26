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

package com.aliyuncs.ecs.model.v20160314;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyReservationDemandRequest extends RpcAcsRequest<ModifyReservationDemandResponse> {
	   

	private Long resourceOwnerId;

	private String savingPlanPayMode;

	private String couponType;

	private Boolean couponAuto;

	private String startTime;

	private String productType;

	private List<PrivatePoolOptions> privatePoolOptionss;

	private List<Tag> tags;

	private Integer period;

	private String savingPlanInstanceTypeFamilyGroup;

	private String savingPlanDescription;

	private Integer instanceCpuCoreCount;

	private String periodUnit;

	private String name;

	private Integer instanceAmount;

	private String resourceSupplyType;

	private String clientToken;

	private String instanceTypes;

	private String phoneNumber;

	private String description;

	private String platform;

	private String reservedInstanceDescription;

	private String reservedInstanceGroupId;

	private String zoneIds;

	private String savingPlanName;

	private String savingPlanSavingType;

	private Float savingPlanHourFee;

	private String instanceChargeType;

	private String reservedInstanceOfferingType;

	private String instanceTypeFamily;

	private String matchCriteria;

	private String confirmType;

	private String demandId;

	private String reservedInstanceScope;

	private String reservedInstanceName;

	private String savingPlanId;
	public ModifyReservationDemandRequest() {
		super("Ecs", "2016-03-14", "ModifyReservationDemand", "ecs");
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

	public String getSavingPlanPayMode() {
		return this.savingPlanPayMode;
	}

	public void setSavingPlanPayMode(String savingPlanPayMode) {
		this.savingPlanPayMode = savingPlanPayMode;
		if(savingPlanPayMode != null){
			putQueryParameter("SavingPlanPayMode", savingPlanPayMode);
		}
	}

	public String getCouponType() {
		return this.couponType;
	}

	public void setCouponType(String couponType) {
		this.couponType = couponType;
		if(couponType != null){
			putQueryParameter("CouponType", couponType);
		}
	}

	public Boolean getCouponAuto() {
		return this.couponAuto;
	}

	public void setCouponAuto(Boolean couponAuto) {
		this.couponAuto = couponAuto;
		if(couponAuto != null){
			putQueryParameter("CouponAuto", couponAuto.toString());
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

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
		if(productType != null){
			putQueryParameter("ProductType", productType);
		}
	}

	public List<PrivatePoolOptions> getPrivatePoolOptionss() {
		return this.privatePoolOptionss;
	}

	public void setPrivatePoolOptionss(List<PrivatePoolOptions> privatePoolOptionss) {
		this.privatePoolOptionss = privatePoolOptionss;	
		if (privatePoolOptionss != null) {
			for (int depth1 = 0; depth1 < privatePoolOptionss.size(); depth1++) {
				putQueryParameter("PrivatePoolOptions." + (depth1 + 1) + ".MatchCriteria" , privatePoolOptionss.get(depth1).getMatchCriteria());
				putQueryParameter("PrivatePoolOptions." + (depth1 + 1) + ".ZoneId" , privatePoolOptionss.get(depth1).getZoneId());
				putQueryParameter("PrivatePoolOptions." + (depth1 + 1) + ".InstanceType" , privatePoolOptionss.get(depth1).getInstanceType());
				putQueryParameter("PrivatePoolOptions." + (depth1 + 1) + ".InstanceAmount" , privatePoolOptionss.get(depth1).getInstanceAmount());
				putQueryParameter("PrivatePoolOptions." + (depth1 + 1) + ".PlanId" , privatePoolOptionss.get(depth1).getPlanId());
				putQueryParameter("PrivatePoolOptions." + (depth1 + 1) + ".StartTime" , privatePoolOptionss.get(depth1).getStartTime());
			}
		}	
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
			}
		}	
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public String getSavingPlanInstanceTypeFamilyGroup() {
		return this.savingPlanInstanceTypeFamilyGroup;
	}

	public void setSavingPlanInstanceTypeFamilyGroup(String savingPlanInstanceTypeFamilyGroup) {
		this.savingPlanInstanceTypeFamilyGroup = savingPlanInstanceTypeFamilyGroup;
		if(savingPlanInstanceTypeFamilyGroup != null){
			putQueryParameter("SavingPlanInstanceTypeFamilyGroup", savingPlanInstanceTypeFamilyGroup);
		}
	}

	public String getSavingPlanDescription() {
		return this.savingPlanDescription;
	}

	public void setSavingPlanDescription(String savingPlanDescription) {
		this.savingPlanDescription = savingPlanDescription;
		if(savingPlanDescription != null){
			putQueryParameter("SavingPlanDescription", savingPlanDescription);
		}
	}

	public Integer getInstanceCpuCoreCount() {
		return this.instanceCpuCoreCount;
	}

	public void setInstanceCpuCoreCount(Integer instanceCpuCoreCount) {
		this.instanceCpuCoreCount = instanceCpuCoreCount;
		if(instanceCpuCoreCount != null){
			putQueryParameter("InstanceCpuCoreCount", instanceCpuCoreCount.toString());
		}
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
		if(periodUnit != null){
			putQueryParameter("PeriodUnit", periodUnit);
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

	public Integer getInstanceAmount() {
		return this.instanceAmount;
	}

	public void setInstanceAmount(Integer instanceAmount) {
		this.instanceAmount = instanceAmount;
		if(instanceAmount != null){
			putQueryParameter("InstanceAmount", instanceAmount.toString());
		}
	}

	public String getResourceSupplyType() {
		return this.resourceSupplyType;
	}

	public void setResourceSupplyType(String resourceSupplyType) {
		this.resourceSupplyType = resourceSupplyType;
		if(resourceSupplyType != null){
			putQueryParameter("ResourceSupplyType", resourceSupplyType);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getInstanceTypes() {
		return this.instanceTypes;
	}

	public void setInstanceTypes(String instanceTypes) {
		this.instanceTypes = instanceTypes;
		if(instanceTypes != null){
			putQueryParameter("InstanceTypes", instanceTypes);
		}
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		if(phoneNumber != null){
			putQueryParameter("PhoneNumber", phoneNumber);
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

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
		if(platform != null){
			putQueryParameter("Platform", platform);
		}
	}

	public String getReservedInstanceDescription() {
		return this.reservedInstanceDescription;
	}

	public void setReservedInstanceDescription(String reservedInstanceDescription) {
		this.reservedInstanceDescription = reservedInstanceDescription;
		if(reservedInstanceDescription != null){
			putQueryParameter("ReservedInstanceDescription", reservedInstanceDescription);
		}
	}

	public String getReservedInstanceGroupId() {
		return this.reservedInstanceGroupId;
	}

	public void setReservedInstanceGroupId(String reservedInstanceGroupId) {
		this.reservedInstanceGroupId = reservedInstanceGroupId;
		if(reservedInstanceGroupId != null){
			putQueryParameter("ReservedInstanceGroupId", reservedInstanceGroupId);
		}
	}

	public String getZoneIds() {
		return this.zoneIds;
	}

	public void setZoneIds(String zoneIds) {
		this.zoneIds = zoneIds;
		if(zoneIds != null){
			putQueryParameter("ZoneIds", zoneIds);
		}
	}

	public String getSavingPlanName() {
		return this.savingPlanName;
	}

	public void setSavingPlanName(String savingPlanName) {
		this.savingPlanName = savingPlanName;
		if(savingPlanName != null){
			putQueryParameter("SavingPlanName", savingPlanName);
		}
	}

	public String getSavingPlanSavingType() {
		return this.savingPlanSavingType;
	}

	public void setSavingPlanSavingType(String savingPlanSavingType) {
		this.savingPlanSavingType = savingPlanSavingType;
		if(savingPlanSavingType != null){
			putQueryParameter("SavingPlanSavingType", savingPlanSavingType);
		}
	}

	public Float getSavingPlanHourFee() {
		return this.savingPlanHourFee;
	}

	public void setSavingPlanHourFee(Float savingPlanHourFee) {
		this.savingPlanHourFee = savingPlanHourFee;
		if(savingPlanHourFee != null){
			putQueryParameter("SavingPlanHourFee", savingPlanHourFee.toString());
		}
	}

	public String getInstanceChargeType() {
		return this.instanceChargeType;
	}

	public void setInstanceChargeType(String instanceChargeType) {
		this.instanceChargeType = instanceChargeType;
		if(instanceChargeType != null){
			putQueryParameter("InstanceChargeType", instanceChargeType);
		}
	}

	public String getReservedInstanceOfferingType() {
		return this.reservedInstanceOfferingType;
	}

	public void setReservedInstanceOfferingType(String reservedInstanceOfferingType) {
		this.reservedInstanceOfferingType = reservedInstanceOfferingType;
		if(reservedInstanceOfferingType != null){
			putQueryParameter("ReservedInstanceOfferingType", reservedInstanceOfferingType);
		}
	}

	public String getInstanceTypeFamily() {
		return this.instanceTypeFamily;
	}

	public void setInstanceTypeFamily(String instanceTypeFamily) {
		this.instanceTypeFamily = instanceTypeFamily;
		if(instanceTypeFamily != null){
			putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
		}
	}

	public String getMatchCriteria() {
		return this.matchCriteria;
	}

	public void setMatchCriteria(String matchCriteria) {
		this.matchCriteria = matchCriteria;
		if(matchCriteria != null){
			putQueryParameter("MatchCriteria", matchCriteria);
		}
	}

	public String getConfirmType() {
		return this.confirmType;
	}

	public void setConfirmType(String confirmType) {
		this.confirmType = confirmType;
		if(confirmType != null){
			putQueryParameter("ConfirmType", confirmType);
		}
	}

	public String getDemandId() {
		return this.demandId;
	}

	public void setDemandId(String demandId) {
		this.demandId = demandId;
		if(demandId != null){
			putQueryParameter("DemandId", demandId);
		}
	}

	public String getReservedInstanceScope() {
		return this.reservedInstanceScope;
	}

	public void setReservedInstanceScope(String reservedInstanceScope) {
		this.reservedInstanceScope = reservedInstanceScope;
		if(reservedInstanceScope != null){
			putQueryParameter("ReservedInstanceScope", reservedInstanceScope);
		}
	}

	public String getReservedInstanceName() {
		return this.reservedInstanceName;
	}

	public void setReservedInstanceName(String reservedInstanceName) {
		this.reservedInstanceName = reservedInstanceName;
		if(reservedInstanceName != null){
			putQueryParameter("ReservedInstanceName", reservedInstanceName);
		}
	}

	public String getSavingPlanId() {
		return this.savingPlanId;
	}

	public void setSavingPlanId(String savingPlanId) {
		this.savingPlanId = savingPlanId;
		if(savingPlanId != null){
			putQueryParameter("SavingPlanId", savingPlanId);
		}
	}

	public static class PrivatePoolOptions {

		private String matchCriteria;

		private String zoneId;

		private String instanceType;

		private Integer instanceAmount;

		private String planId;

		private String startTime;

		public String getMatchCriteria() {
			return this.matchCriteria;
		}

		public void setMatchCriteria(String matchCriteria) {
			this.matchCriteria = matchCriteria;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public Integer getInstanceAmount() {
			return this.instanceAmount;
		}

		public void setInstanceAmount(Integer instanceAmount) {
			this.instanceAmount = instanceAmount;
		}

		public String getPlanId() {
			return this.planId;
		}

		public void setPlanId(String planId) {
			this.planId = planId;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}
	}

	public static class Tag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<ModifyReservationDemandResponse> getResponseClass() {
		return ModifyReservationDemandResponse.class;
	}

}
