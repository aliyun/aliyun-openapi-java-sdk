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
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeRecommendProductRequest extends RpcAcsRequest<OpsDescribeRecommendProductResponse> {
	   

	private Long resourceOwnerId;

	private String networkType;

	private Integer cores;

	private String systemDiskCategory;

	private Float maxPrice;

	private String resourcePoolType;

	private Long ownerId;

	private String spotStrategy;

	private String instanceFamilyLevel;

	private String zoneId;

	private Float memory;

	private String ioOptimized;

	private Boolean needFilterZone;

	private String instanceType;

	private Long aliUid;

	private String instanceChargeType;

	private Integer amount;

	private String resourceOwnerAccount;

	private String zoneMatchMode;

	private String ownerAccount;

	private List<String> instanceTypeFamilys;

	private String priorityStrategy;

	private String bid;

	private String auditParamStr;
	public OpsDescribeRecommendProductRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeRecommendProduct", "ecs");
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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
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

	public Boolean getNeedFilterZone() {
		return this.needFilterZone;
	}

	public void setNeedFilterZone(Boolean needFilterZone) {
		this.needFilterZone = needFilterZone;
		if(needFilterZone != null){
			putQueryParameter("NeedFilterZone", needFilterZone.toString());
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

	public String getZoneMatchMode() {
		return this.zoneMatchMode;
	}

	public void setZoneMatchMode(String zoneMatchMode) {
		this.zoneMatchMode = zoneMatchMode;
		if(zoneMatchMode != null){
			putQueryParameter("ZoneMatchMode", zoneMatchMode);
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

	public String getPriorityStrategy() {
		return this.priorityStrategy;
	}

	public void setPriorityStrategy(String priorityStrategy) {
		this.priorityStrategy = priorityStrategy;
		if(priorityStrategy != null){
			putQueryParameter("PriorityStrategy", priorityStrategy);
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

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsDescribeRecommendProductResponse> getResponseClass() {
		return OpsDescribeRecommendProductResponse.class;
	}

}
