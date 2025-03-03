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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribePriceRequest extends RpcAcsRequest<DescribePriceResponse> {
	   

	private Integer dataDisk3Size;

	private Long resourceOwnerId;

	private String dataDisk3Category;

	private String isp;

	private String startTime;

	private Integer dataDisk4Size;

	private String priceUnit;

	private Integer period;

	private String dataDisk1PerformanceLevel;

	private String assuranceTimes;

	private Long ownerId;

	private Integer instanceCpuCoreCount;

	private String spotStrategy;

	private String internetChargeType;

	private String zoneId;

	private String instanceNetworkType;

	private Integer instanceAmount;

	private List<String> instanceTypeLists;

	private String dataDisk3PerformanceLevel;

	private String imageId;

	private String ioOptimized;

	private Integer internetMaxBandwidthOut;

	private String systemDiskCategory;

	private String platform;

	private Integer capacity;

	private String systemDiskPerformanceLevel;

	private String dataDisk4Category;

	private String dataDisk4PerformanceLevel;

	private String scope;

	private String schedulerOptionsDedicatedHostId;

	private String instanceType;

	private String dedicatedHostType;

	private String dataDisk2Category;

	private Integer dataDisk1Size;

	private Integer amount;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Integer dataDisk2Size;

	private Integer spotDuration;

	private String resourceType;

	private List<DataDisk> dataDisks;

	private String dataDisk1Category;

	private String dataDisk2PerformanceLevel;

	private Integer systemDiskSize;

	private String offeringType;

	private List<RecurrenceRules> recurrenceRuless;
	public DescribePriceRequest() {
		super("Ecs", "2014-05-26", "DescribePrice", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getDataDisk3Size() {
		return this.dataDisk3Size;
	}

	public void setDataDisk3Size(Integer dataDisk3Size) {
		this.dataDisk3Size = dataDisk3Size;
		if(dataDisk3Size != null){
			putQueryParameter("DataDisk.3.Size", dataDisk3Size.toString());
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

	public String getDataDisk3Category() {
		return this.dataDisk3Category;
	}

	public void setDataDisk3Category(String dataDisk3Category) {
		this.dataDisk3Category = dataDisk3Category;
		if(dataDisk3Category != null){
			putQueryParameter("DataDisk.3.Category", dataDisk3Category);
		}
	}

	public String getIsp() {
		return this.isp;
	}

	public void setIsp(String isp) {
		this.isp = isp;
		if(isp != null){
			putQueryParameter("Isp", isp);
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

	public Integer getDataDisk4Size() {
		return this.dataDisk4Size;
	}

	public void setDataDisk4Size(Integer dataDisk4Size) {
		this.dataDisk4Size = dataDisk4Size;
		if(dataDisk4Size != null){
			putQueryParameter("DataDisk.4.Size", dataDisk4Size.toString());
		}
	}

	public String getPriceUnit() {
		return this.priceUnit;
	}

	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
		if(priceUnit != null){
			putQueryParameter("PriceUnit", priceUnit);
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

	public String getDataDisk1PerformanceLevel() {
		return this.dataDisk1PerformanceLevel;
	}

	public void setDataDisk1PerformanceLevel(String dataDisk1PerformanceLevel) {
		this.dataDisk1PerformanceLevel = dataDisk1PerformanceLevel;
		if(dataDisk1PerformanceLevel != null){
			putQueryParameter("DataDisk.1.PerformanceLevel", dataDisk1PerformanceLevel);
		}
	}

	public String getAssuranceTimes() {
		return this.assuranceTimes;
	}

	public void setAssuranceTimes(String assuranceTimes) {
		this.assuranceTimes = assuranceTimes;
		if(assuranceTimes != null){
			putQueryParameter("AssuranceTimes", assuranceTimes);
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

	public Integer getInstanceCpuCoreCount() {
		return this.instanceCpuCoreCount;
	}

	public void setInstanceCpuCoreCount(Integer instanceCpuCoreCount) {
		this.instanceCpuCoreCount = instanceCpuCoreCount;
		if(instanceCpuCoreCount != null){
			putQueryParameter("InstanceCpuCoreCount", instanceCpuCoreCount.toString());
		}
	}

	public String getSpotStrategy() {
		return this.spotStrategy;
	}

	public void setSpotStrategy(String spotStrategy) {
		this.spotStrategy = spotStrategy;
		if(spotStrategy != null){
			putQueryParameter("SpotStrategy", spotStrategy);
		}
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
		if(internetChargeType != null){
			putQueryParameter("InternetChargeType", internetChargeType);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public String getInstanceNetworkType() {
		return this.instanceNetworkType;
	}

	public void setInstanceNetworkType(String instanceNetworkType) {
		this.instanceNetworkType = instanceNetworkType;
		if(instanceNetworkType != null){
			putQueryParameter("InstanceNetworkType", instanceNetworkType);
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

	public List<String> getInstanceTypeLists() {
		return this.instanceTypeLists;
	}

	public void setInstanceTypeLists(List<String> instanceTypeLists) {
		this.instanceTypeLists = instanceTypeLists;	
		if (instanceTypeLists != null) {
			for (int i = 0; i < instanceTypeLists.size(); i++) {
				putQueryParameter("InstanceTypeList." + (i + 1) , instanceTypeLists.get(i));
			}
		}	
	}

	public String getDataDisk3PerformanceLevel() {
		return this.dataDisk3PerformanceLevel;
	}

	public void setDataDisk3PerformanceLevel(String dataDisk3PerformanceLevel) {
		this.dataDisk3PerformanceLevel = dataDisk3PerformanceLevel;
		if(dataDisk3PerformanceLevel != null){
			putQueryParameter("DataDisk.3.PerformanceLevel", dataDisk3PerformanceLevel);
		}
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public String getIoOptimized() {
		return this.ioOptimized;
	}

	public void setIoOptimized(String ioOptimized) {
		this.ioOptimized = ioOptimized;
		if(ioOptimized != null){
			putQueryParameter("IoOptimized", ioOptimized);
		}
	}

	public Integer getInternetMaxBandwidthOut() {
		return this.internetMaxBandwidthOut;
	}

	public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
		this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		if(internetMaxBandwidthOut != null){
			putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut.toString());
		}
	}

	public String getSystemDiskCategory() {
		return this.systemDiskCategory;
	}

	public void setSystemDiskCategory(String systemDiskCategory) {
		this.systemDiskCategory = systemDiskCategory;
		if(systemDiskCategory != null){
			putQueryParameter("SystemDisk.Category", systemDiskCategory);
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

	public Integer getCapacity() {
		return this.capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
		if(capacity != null){
			putQueryParameter("Capacity", capacity.toString());
		}
	}

	public String getSystemDiskPerformanceLevel() {
		return this.systemDiskPerformanceLevel;
	}

	public void setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
		this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
		if(systemDiskPerformanceLevel != null){
			putQueryParameter("SystemDisk.PerformanceLevel", systemDiskPerformanceLevel);
		}
	}

	public String getDataDisk4Category() {
		return this.dataDisk4Category;
	}

	public void setDataDisk4Category(String dataDisk4Category) {
		this.dataDisk4Category = dataDisk4Category;
		if(dataDisk4Category != null){
			putQueryParameter("DataDisk.4.Category", dataDisk4Category);
		}
	}

	public String getDataDisk4PerformanceLevel() {
		return this.dataDisk4PerformanceLevel;
	}

	public void setDataDisk4PerformanceLevel(String dataDisk4PerformanceLevel) {
		this.dataDisk4PerformanceLevel = dataDisk4PerformanceLevel;
		if(dataDisk4PerformanceLevel != null){
			putQueryParameter("DataDisk.4.PerformanceLevel", dataDisk4PerformanceLevel);
		}
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
		if(scope != null){
			putQueryParameter("Scope", scope);
		}
	}

	public String getSchedulerOptionsDedicatedHostId() {
		return this.schedulerOptionsDedicatedHostId;
	}

	public void setSchedulerOptionsDedicatedHostId(String schedulerOptionsDedicatedHostId) {
		this.schedulerOptionsDedicatedHostId = schedulerOptionsDedicatedHostId;
		if(schedulerOptionsDedicatedHostId != null){
			putQueryParameter("SchedulerOptions.DedicatedHostId", schedulerOptionsDedicatedHostId);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public String getDedicatedHostType() {
		return this.dedicatedHostType;
	}

	public void setDedicatedHostType(String dedicatedHostType) {
		this.dedicatedHostType = dedicatedHostType;
		if(dedicatedHostType != null){
			putQueryParameter("DedicatedHostType", dedicatedHostType);
		}
	}

	public String getDataDisk2Category() {
		return this.dataDisk2Category;
	}

	public void setDataDisk2Category(String dataDisk2Category) {
		this.dataDisk2Category = dataDisk2Category;
		if(dataDisk2Category != null){
			putQueryParameter("DataDisk.2.Category", dataDisk2Category);
		}
	}

	public Integer getDataDisk1Size() {
		return this.dataDisk1Size;
	}

	public void setDataDisk1Size(Integer dataDisk1Size) {
		this.dataDisk1Size = dataDisk1Size;
		if(dataDisk1Size != null){
			putQueryParameter("DataDisk.1.Size", dataDisk1Size.toString());
		}
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
		if(amount != null){
			putQueryParameter("Amount", amount.toString());
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

	public Integer getDataDisk2Size() {
		return this.dataDisk2Size;
	}

	public void setDataDisk2Size(Integer dataDisk2Size) {
		this.dataDisk2Size = dataDisk2Size;
		if(dataDisk2Size != null){
			putQueryParameter("DataDisk.2.Size", dataDisk2Size.toString());
		}
	}

	public Integer getSpotDuration() {
		return this.spotDuration;
	}

	public void setSpotDuration(Integer spotDuration) {
		this.spotDuration = spotDuration;
		if(spotDuration != null){
			putQueryParameter("SpotDuration", spotDuration.toString());
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public List<DataDisk> getDataDisks() {
		return this.dataDisks;
	}

	public void setDataDisks(List<DataDisk> dataDisks) {
		this.dataDisks = dataDisks;	
		if (dataDisks != null) {
			for (int depth1 = 0; depth1 < dataDisks.size(); depth1++) {
				putQueryParameter("DataDisk." + (depth1 + 1) + ".ProvisionedIops" , dataDisks.get(depth1).getProvisionedIops());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Size" , dataDisks.get(depth1).getSize());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".PerformanceLevel" , dataDisks.get(depth1).getPerformanceLevel());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Category" , dataDisks.get(depth1).getCategory());
			}
		}	
	}

	public String getDataDisk1Category() {
		return this.dataDisk1Category;
	}

	public void setDataDisk1Category(String dataDisk1Category) {
		this.dataDisk1Category = dataDisk1Category;
		if(dataDisk1Category != null){
			putQueryParameter("DataDisk.1.Category", dataDisk1Category);
		}
	}

	public String getDataDisk2PerformanceLevel() {
		return this.dataDisk2PerformanceLevel;
	}

	public void setDataDisk2PerformanceLevel(String dataDisk2PerformanceLevel) {
		this.dataDisk2PerformanceLevel = dataDisk2PerformanceLevel;
		if(dataDisk2PerformanceLevel != null){
			putQueryParameter("DataDisk.2.PerformanceLevel", dataDisk2PerformanceLevel);
		}
	}

	public Integer getSystemDiskSize() {
		return this.systemDiskSize;
	}

	public void setSystemDiskSize(Integer systemDiskSize) {
		this.systemDiskSize = systemDiskSize;
		if(systemDiskSize != null){
			putQueryParameter("SystemDisk.Size", systemDiskSize.toString());
		}
	}

	public String getOfferingType() {
		return this.offeringType;
	}

	public void setOfferingType(String offeringType) {
		this.offeringType = offeringType;
		if(offeringType != null){
			putQueryParameter("OfferingType", offeringType);
		}
	}

	public List<RecurrenceRules> getRecurrenceRuless() {
		return this.recurrenceRuless;
	}

	public void setRecurrenceRuless(List<RecurrenceRules> recurrenceRuless) {
		this.recurrenceRuless = recurrenceRuless;	
		if (recurrenceRuless != null) {
			for (int depth1 = 0; depth1 < recurrenceRuless.size(); depth1++) {
				putQueryParameter("RecurrenceRules." + (depth1 + 1) + ".EndHour" , recurrenceRuless.get(depth1).getEndHour());
				putQueryParameter("RecurrenceRules." + (depth1 + 1) + ".StartHour" , recurrenceRuless.get(depth1).getStartHour());
				putQueryParameter("RecurrenceRules." + (depth1 + 1) + ".RecurrenceValue" , recurrenceRuless.get(depth1).getRecurrenceValue());
				putQueryParameter("RecurrenceRules." + (depth1 + 1) + ".RecurrenceType" , recurrenceRuless.get(depth1).getRecurrenceType());
			}
		}	
	}

	public static class DataDisk {

		private Long provisionedIops;

		private Long size;

		private String performanceLevel;

		private String category;

		public Long getProvisionedIops() {
			return this.provisionedIops;
		}

		public void setProvisionedIops(Long provisionedIops) {
			this.provisionedIops = provisionedIops;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public String getPerformanceLevel() {
			return this.performanceLevel;
		}

		public void setPerformanceLevel(String performanceLevel) {
			this.performanceLevel = performanceLevel;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}
	}

	public static class RecurrenceRules {

		private Integer endHour;

		private Integer startHour;

		private String recurrenceValue;

		private String recurrenceType;

		public Integer getEndHour() {
			return this.endHour;
		}

		public void setEndHour(Integer endHour) {
			this.endHour = endHour;
		}

		public Integer getStartHour() {
			return this.startHour;
		}

		public void setStartHour(Integer startHour) {
			this.startHour = startHour;
		}

		public String getRecurrenceValue() {
			return this.recurrenceValue;
		}

		public void setRecurrenceValue(String recurrenceValue) {
			this.recurrenceValue = recurrenceValue;
		}

		public String getRecurrenceType() {
			return this.recurrenceType;
		}

		public void setRecurrenceType(String recurrenceType) {
			this.recurrenceType = recurrenceType;
		}
	}

	@Override
	public Class<DescribePriceResponse> getResponseClass() {
		return DescribePriceResponse.class;
	}

}
