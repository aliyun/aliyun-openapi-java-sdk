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
public class DescribeRecommendInstanceTypeRequest extends RpcAcsRequest<DescribeRecommendInstanceTypeResponse> {
	   

	private Long resourceOwnerId;

	private Float memory;

	private String ioOptimized;

	private String networkType;

	private String scene;

	private Integer cores;

	private String systemDiskCategory;

	private String instanceType;

	private String instanceChargeType;

	private Float maxPrice;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private List<String> instanceTypeFamilys;

	private Long ownerId;

	private String spotStrategy;

	private String priorityStrategy;

	private String instanceFamilyLevel;

	private String zoneId;
	public DescribeRecommendInstanceTypeRequest() {
		super("Ecs", "2014-05-26", "DescribeRecommendInstanceType", "ecs");
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

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putQueryParameter("NetworkType", networkType);
		}
	}

	public String getScene() {
		return this.scene;
	}

	public void setScene(String scene) {
		this.scene = scene;
		if(scene != null){
			putQueryParameter("Scene", scene);
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

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
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

	public Float getMaxPrice() {
		return this.maxPrice;
	}

	public void setMaxPrice(Float maxPrice) {
		this.maxPrice = maxPrice;
		if(maxPrice != null){
			putQueryParameter("MaxPrice", maxPrice.toString());
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

	public List<String> getInstanceTypeFamilys() {
		return this.instanceTypeFamilys;
	}

	public void setInstanceTypeFamilys(List<String> instanceTypeFamilys) {
		this.instanceTypeFamilys = instanceTypeFamilys;	
		if (instanceTypeFamilys != null) {
			for (int i = 0; i < instanceTypeFamilys.size(); i++) {
				putQueryParameter("InstanceTypeFamily." + (i + 1) , instanceTypeFamilys.get(i));
			}
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

	public String getPriorityStrategy() {
		return this.priorityStrategy;
	}

	public void setPriorityStrategy(String priorityStrategy) {
		this.priorityStrategy = priorityStrategy;
		if(priorityStrategy != null){
			putQueryParameter("PriorityStrategy", priorityStrategy);
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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	@Override
	public Class<DescribeRecommendInstanceTypeResponse> getResponseClass() {
		return DescribeRecommendInstanceTypeResponse.class;
	}

}
