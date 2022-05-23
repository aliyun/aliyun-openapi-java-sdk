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
	   

	private Long resourceOwnerId;

	private String isp;

	private SystemDisk systemDisk;

	private String priceUnit;

	private Integer period;

	private String assuranceTimes;

	private Long ownerId;

	private Integer instanceCpuCoreCount;

	private String spotStrategy;

	private String internetChargeType;

	private String zoneId;

	private String instanceNetworkType;

	private Integer instanceAmount;

	private List<String> instanceTypeLists;

	private String imageId;

	private String ioOptimized;

	private Integer internetMaxBandwidthOut;

	private String platform;

	private Integer capacity;

	private String scope;

	private String instanceType;

	private String dedicatedHostType;

	private Integer amount;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Integer spotDuration;

	private String resourceType;

	private List<DataDisk> dataDisk;

	private String offeringType;
	public DescribePriceRequest() {
		super("Ecs", "2014-05-26", "DescribePrice", "ecs");
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

	public String getIsp() {
		return this.isp;
	}

	public void setIsp(String isp) {
		this.isp = isp;
		if(isp != null){
			putQueryParameter("Isp", isp);
		}
	}

	public SystemDisk getSystemDisk() {
		return this.systemDisk;
	}

	public void setSystemDisk(SystemDisk systemDisk) {
		this.systemDisk = systemDisk;	
		if (systemDisk != null) {
			
				putQueryParameter("SystemDisk.Size" , systemDisk.getSize());
				putQueryParameter("SystemDisk.PerformanceLevel" , systemDisk.getPerformanceLevel());
				putQueryParameter("SystemDisk.Category" , systemDisk.getCategory());
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

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
		if(scope != null){
			putQueryParameter("Scope", scope);
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

	public List<DataDisk> getDataDisk() {
		return this.dataDisk;
	}

	public void setDataDisk(List<DataDisk> dataDisk) {
		this.dataDisk = dataDisk;	
		if (dataDisk != null) {
			for (int depth1 = 0; depth1 < dataDisk.size(); depth1++) {
				if (dataDisk.get(depth1) != null) {
					
						putQueryParameter("DataDisk." + (depth1 + 1) + ".Size" , dataDisk.get(depth1).getSize());
						putQueryParameter("DataDisk." + (depth1 + 1) + ".PerformanceLevel" , dataDisk.get(depth1).getPerformanceLevel());
						putQueryParameter("DataDisk." + (depth1 + 1) + ".Category" , dataDisk.get(depth1).getCategory());
				}
			}
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

	public static class SystemDisk {

		private Integer size;

		private String performanceLevel;

		private String category;

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
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

	public static class DataDisk {

		private Integer size;

		private String performanceLevel;

		private String category;

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
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

	@Override
	public Class<DescribePriceResponse> getResponseClass() {
		return DescribePriceResponse.class;
	}

}
