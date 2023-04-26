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
public class DescribeResourceAllocationRequest extends RpcAcsRequest<DescribeResourceAllocationResponse> {
	   

	private Long resourceOwnerId;

	private String networkType;

	private Integer postPaidBaseCapacity;

	private Integer cores;

	private String systemDiskCategory;

	private String defaultTargetCapacityType;

	private Float maxPrice;

	private Integer spotBaseCapacity;

	private Long ownerId;

	private String spotStrategy;

	private String instanceFamilyLevel;

	private Boolean instanceTypeSupportIPv6;

	private List<String> zoneIds;

	private List<InstanceTypeModel> instanceTypeModels;

	private Boolean strictSatisfiedTargetCapacity;

	private Float memory;

	private String ioOptimized;

	private String resourceAmountType;

	private List<String> dataDiskCategorys;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Integer spotInstancePools;

	private Integer spotDuration;

	private String priorityStrategy;

	private Integer targetCapacity;
	public DescribeResourceAllocationRequest() {
		super("Ecs", "2016-03-14", "DescribeResourceAllocation", "ecs");
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

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putQueryParameter("NetworkType", networkType);
		}
	}

	public Integer getPostPaidBaseCapacity() {
		return this.postPaidBaseCapacity;
	}

	public void setPostPaidBaseCapacity(Integer postPaidBaseCapacity) {
		this.postPaidBaseCapacity = postPaidBaseCapacity;
		if(postPaidBaseCapacity != null){
			putQueryParameter("PostPaidBaseCapacity", postPaidBaseCapacity.toString());
		}
	}

	public Integer getCores() {
		return this.cores;
	}

	public void setCores(Integer cores) {
		this.cores = cores;
		if(cores != null){
			putQueryParameter("Cores", cores.toString());
		}
	}

	public String getSystemDiskCategory() {
		return this.systemDiskCategory;
	}

	public void setSystemDiskCategory(String systemDiskCategory) {
		this.systemDiskCategory = systemDiskCategory;
		if(systemDiskCategory != null){
			putQueryParameter("SystemDiskCategory", systemDiskCategory);
		}
	}

	public String getDefaultTargetCapacityType() {
		return this.defaultTargetCapacityType;
	}

	public void setDefaultTargetCapacityType(String defaultTargetCapacityType) {
		this.defaultTargetCapacityType = defaultTargetCapacityType;
		if(defaultTargetCapacityType != null){
			putQueryParameter("DefaultTargetCapacityType", defaultTargetCapacityType);
		}
	}

	public Float getMaxPrice() {
		return this.maxPrice;
	}

	public void setMaxPrice(Float maxPrice) {
		this.maxPrice = maxPrice;
		if(maxPrice != null){
			putQueryParameter("MaxPrice", maxPrice.toString());
		}
	}

	public Integer getSpotBaseCapacity() {
		return this.spotBaseCapacity;
	}

	public void setSpotBaseCapacity(Integer spotBaseCapacity) {
		this.spotBaseCapacity = spotBaseCapacity;
		if(spotBaseCapacity != null){
			putQueryParameter("SpotBaseCapacity", spotBaseCapacity.toString());
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

	public String getSpotStrategy() {
		return this.spotStrategy;
	}

	public void setSpotStrategy(String spotStrategy) {
		this.spotStrategy = spotStrategy;
		if(spotStrategy != null){
			putQueryParameter("SpotStrategy", spotStrategy);
		}
	}

	public String getInstanceFamilyLevel() {
		return this.instanceFamilyLevel;
	}

	public void setInstanceFamilyLevel(String instanceFamilyLevel) {
		this.instanceFamilyLevel = instanceFamilyLevel;
		if(instanceFamilyLevel != null){
			putQueryParameter("InstanceFamilyLevel", instanceFamilyLevel);
		}
	}

	public Boolean getInstanceTypeSupportIPv6() {
		return this.instanceTypeSupportIPv6;
	}

	public void setInstanceTypeSupportIPv6(Boolean instanceTypeSupportIPv6) {
		this.instanceTypeSupportIPv6 = instanceTypeSupportIPv6;
		if(instanceTypeSupportIPv6 != null){
			putQueryParameter("InstanceTypeSupportIPv6", instanceTypeSupportIPv6.toString());
		}
	}

	public List<String> getZoneIds() {
		return this.zoneIds;
	}

	public void setZoneIds(List<String> zoneIds) {
		this.zoneIds = zoneIds;	
		if (zoneIds != null) {
			for (int i = 0; i < zoneIds.size(); i++) {
				putQueryParameter("ZoneId." + (i + 1) , zoneIds.get(i));
			}
		}	
	}

	public List<InstanceTypeModel> getInstanceTypeModels() {
		return this.instanceTypeModels;
	}

	public void setInstanceTypeModels(List<InstanceTypeModel> instanceTypeModels) {
		this.instanceTypeModels = instanceTypeModels;	
		if (instanceTypeModels != null) {
			for (int depth1 = 0; depth1 < instanceTypeModels.size(); depth1++) {
				putQueryParameter("InstanceTypeModel." + (depth1 + 1) + ".SpotStrategy" , instanceTypeModels.get(depth1).getSpotStrategy());
				putQueryParameter("InstanceTypeModel." + (depth1 + 1) + ".MaxPrice" , instanceTypeModels.get(depth1).getMaxPrice());
				putQueryParameter("InstanceTypeModel." + (depth1 + 1) + ".WeightedCapacity" , instanceTypeModels.get(depth1).getWeightedCapacity());
				putQueryParameter("InstanceTypeModel." + (depth1 + 1) + ".InstanceType" , instanceTypeModels.get(depth1).getInstanceType());
			}
		}	
	}

	public Boolean getStrictSatisfiedTargetCapacity() {
		return this.strictSatisfiedTargetCapacity;
	}

	public void setStrictSatisfiedTargetCapacity(Boolean strictSatisfiedTargetCapacity) {
		this.strictSatisfiedTargetCapacity = strictSatisfiedTargetCapacity;
		if(strictSatisfiedTargetCapacity != null){
			putQueryParameter("StrictSatisfiedTargetCapacity", strictSatisfiedTargetCapacity.toString());
		}
	}

	public Float getMemory() {
		return this.memory;
	}

	public void setMemory(Float memory) {
		this.memory = memory;
		if(memory != null){
			putQueryParameter("Memory", memory.toString());
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

	public String getResourceAmountType() {
		return this.resourceAmountType;
	}

	public void setResourceAmountType(String resourceAmountType) {
		this.resourceAmountType = resourceAmountType;
		if(resourceAmountType != null){
			putQueryParameter("ResourceAmountType", resourceAmountType);
		}
	}

	public List<String> getDataDiskCategorys() {
		return this.dataDiskCategorys;
	}

	public void setDataDiskCategorys(List<String> dataDiskCategorys) {
		this.dataDiskCategorys = dataDiskCategorys;	
		if (dataDiskCategorys != null) {
			for (int i = 0; i < dataDiskCategorys.size(); i++) {
				putQueryParameter("DataDiskCategory." + (i + 1) , dataDiskCategorys.get(i));
			}
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

	public Integer getSpotInstancePools() {
		return this.spotInstancePools;
	}

	public void setSpotInstancePools(Integer spotInstancePools) {
		this.spotInstancePools = spotInstancePools;
		if(spotInstancePools != null){
			putQueryParameter("SpotInstancePools", spotInstancePools.toString());
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

	public String getPriorityStrategy() {
		return this.priorityStrategy;
	}

	public void setPriorityStrategy(String priorityStrategy) {
		this.priorityStrategy = priorityStrategy;
		if(priorityStrategy != null){
			putQueryParameter("PriorityStrategy", priorityStrategy);
		}
	}

	public Integer getTargetCapacity() {
		return this.targetCapacity;
	}

	public void setTargetCapacity(Integer targetCapacity) {
		this.targetCapacity = targetCapacity;
		if(targetCapacity != null){
			putQueryParameter("TargetCapacity", targetCapacity.toString());
		}
	}

	public static class InstanceTypeModel {

		private String spotStrategy;

		private Float maxPrice;

		private Float weightedCapacity;

		private String instanceType;

		public String getSpotStrategy() {
			return this.spotStrategy;
		}

		public void setSpotStrategy(String spotStrategy) {
			this.spotStrategy = spotStrategy;
		}

		public Float getMaxPrice() {
			return this.maxPrice;
		}

		public void setMaxPrice(Float maxPrice) {
			this.maxPrice = maxPrice;
		}

		public Float getWeightedCapacity() {
			return this.weightedCapacity;
		}

		public void setWeightedCapacity(Float weightedCapacity) {
			this.weightedCapacity = weightedCapacity;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}
	}

	@Override
	public Class<DescribeResourceAllocationResponse> getResponseClass() {
		return DescribeResourceAllocationResponse.class;
	}

}
