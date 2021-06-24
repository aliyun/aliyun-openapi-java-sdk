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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeResourceAllocationRequest extends RpcAcsRequest<OpsDescribeResourceAllocationResponse> {
	   

	private Long resourceOwnerId;

	private Boolean needCheckQuota;

	private String networkType;

	private Float cycleLevelRatio;

	private Integer postPaidBaseCapacity;

	private Integer cores;

	private String systemDiskCategory;

	private String defaultTargetCapacityType;

	private Float maxPrice;

	private Integer spotBaseCapacity;

	private String resourcePoolType;

	private Long ownerId;

	private String spotStrategy;

	private String instanceFamilyLevel;

	private List<String> zoneIds;

	private List<InstanceTypeModel> instanceTypeModels;

	private Boolean strictSatisfiedTargetCapacity;

	private Float memory;

	private String ioOptimized;

	private String demandResourceUsageMode;

	private Float elasticLevelRatio;

	private String resourceAmountType;

	private Boolean needCheckConstraint;

	private Long aliUid;

	private String instanceChargeType;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Integer spotInstancePools;

	private String priorityStrategy;

	private List<ResourceReservedModel> resourceReservedModels;

	private String bid;

	private Integer targetCapacity;

	private String auditParamStr;
	public OpsDescribeResourceAllocationRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeResourceAllocation", "ecsops");
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

	public Boolean getNeedCheckQuota() {
		return this.needCheckQuota;
	}

	public void setNeedCheckQuota(Boolean needCheckQuota) {
		this.needCheckQuota = needCheckQuota;
		if(needCheckQuota != null){
			putQueryParameter("NeedCheckQuota", needCheckQuota.toString());
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

	public Float getCycleLevelRatio() {
		return this.cycleLevelRatio;
	}

	public void setCycleLevelRatio(Float cycleLevelRatio) {
		this.cycleLevelRatio = cycleLevelRatio;
		if(cycleLevelRatio != null){
			putQueryParameter("CycleLevelRatio", cycleLevelRatio.toString());
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

	public String getResourcePoolType() {
		return this.resourcePoolType;
	}

	public void setResourcePoolType(String resourcePoolType) {
		this.resourcePoolType = resourcePoolType;
		if(resourcePoolType != null){
			putQueryParameter("ResourcePoolType", resourcePoolType);
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

	public String getDemandResourceUsageMode() {
		return this.demandResourceUsageMode;
	}

	public void setDemandResourceUsageMode(String demandResourceUsageMode) {
		this.demandResourceUsageMode = demandResourceUsageMode;
		if(demandResourceUsageMode != null){
			putQueryParameter("DemandResourceUsageMode", demandResourceUsageMode);
		}
	}

	public Float getElasticLevelRatio() {
		return this.elasticLevelRatio;
	}

	public void setElasticLevelRatio(Float elasticLevelRatio) {
		this.elasticLevelRatio = elasticLevelRatio;
		if(elasticLevelRatio != null){
			putQueryParameter("ElasticLevelRatio", elasticLevelRatio.toString());
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

	public Boolean getNeedCheckConstraint() {
		return this.needCheckConstraint;
	}

	public void setNeedCheckConstraint(Boolean needCheckConstraint) {
		this.needCheckConstraint = needCheckConstraint;
		if(needCheckConstraint != null){
			putQueryParameter("NeedCheckConstraint", needCheckConstraint.toString());
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
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

	public String getPriorityStrategy() {
		return this.priorityStrategy;
	}

	public void setPriorityStrategy(String priorityStrategy) {
		this.priorityStrategy = priorityStrategy;
		if(priorityStrategy != null){
			putQueryParameter("PriorityStrategy", priorityStrategy);
		}
	}

	public List<ResourceReservedModel> getResourceReservedModels() {
		return this.resourceReservedModels;
	}

	public void setResourceReservedModels(List<ResourceReservedModel> resourceReservedModels) {
		this.resourceReservedModels = resourceReservedModels;	
		if (resourceReservedModels != null) {
			for (int depth1 = 0; depth1 < resourceReservedModels.size(); depth1++) {
				putQueryParameter("ResourceReservedModel." + (depth1 + 1) + ".ReservedCores" , resourceReservedModels.get(depth1).getReservedCores());
				putQueryParameter("ResourceReservedModel." + (depth1 + 1) + ".ZoneId" , resourceReservedModels.get(depth1).getZoneId());
				putQueryParameter("ResourceReservedModel." + (depth1 + 1) + ".InstanceTypeFamily" , resourceReservedModels.get(depth1).getInstanceTypeFamily());
			}
		}	
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("Bid", bid);
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

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
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

	public static class ResourceReservedModel {

		private Integer reservedCores;

		private String zoneId;

		private String instanceTypeFamily;

		public Integer getReservedCores() {
			return this.reservedCores;
		}

		public void setReservedCores(Integer reservedCores) {
			this.reservedCores = reservedCores;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getInstanceTypeFamily() {
			return this.instanceTypeFamily;
		}

		public void setInstanceTypeFamily(String instanceTypeFamily) {
			this.instanceTypeFamily = instanceTypeFamily;
		}
	}

	@Override
	public Class<OpsDescribeResourceAllocationResponse> getResponseClass() {
		return OpsDescribeResourceAllocationResponse.class;
	}

}
