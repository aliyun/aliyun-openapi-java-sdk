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
public class DescribeResourceSolutionsRequest extends RpcAcsRequest<DescribeResourceSolutionsResponse> {
	   

	private Long resourceOwnerId;

	private Integer cores;

	private String systemDiskCategory;

	private Float maxPrice;

	private Long ownerId;

	private String spotStrategy;

	private String instanceFamilyLevel;

	private Boolean instanceTypeSupportIPv6;

	private List<String> zoneIds;

	private List<InstanceTypeModel> instanceTypeModels;

	private Float memory;

	private String resourceAmountType;

	private Boolean matchOpenInstances;

	private String instanceChargeType;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Integer targetCapacity;
	public DescribeResourceSolutionsRequest() {
		super("Ecs", "2016-03-14", "DescribeResourceSolutions", "ecs");
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

	public Float getMaxPrice() {
		return this.maxPrice;
	}

	public void setMaxPrice(Float maxPrice) {
		this.maxPrice = maxPrice;
		if(maxPrice != null){
			putQueryParameter("MaxPrice", maxPrice.toString());
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
				putQueryParameter("InstanceTypeModel." + (depth1 + 1) + ".InstanceType" , instanceTypeModels.get(depth1).getInstanceType());
				putQueryParameter("InstanceTypeModel." + (depth1 + 1) + ".WeightedCapacity" , instanceTypeModels.get(depth1).getWeightedCapacity());
			}
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

	public String getResourceAmountType() {
		return this.resourceAmountType;
	}

	public void setResourceAmountType(String resourceAmountType) {
		this.resourceAmountType = resourceAmountType;
		if(resourceAmountType != null){
			putQueryParameter("ResourceAmountType", resourceAmountType);
		}
	}

	public Boolean getMatchOpenInstances() {
		return this.matchOpenInstances;
	}

	public void setMatchOpenInstances(Boolean matchOpenInstances) {
		this.matchOpenInstances = matchOpenInstances;
		if(matchOpenInstances != null){
			putQueryParameter("MatchOpenInstances", matchOpenInstances.toString());
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

		private String instanceType;

		private Float weightedCapacity;

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public Float getWeightedCapacity() {
			return this.weightedCapacity;
		}

		public void setWeightedCapacity(Float weightedCapacity) {
			this.weightedCapacity = weightedCapacity;
		}
	}

	@Override
	public Class<DescribeResourceSolutionsResponse> getResponseClass() {
		return DescribeResourceSolutionsResponse.class;
	}

}
