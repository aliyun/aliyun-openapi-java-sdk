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

	private Integer dataDisk4Size;

	private String priceUnit;

	private Integer period;

	private String dataDisk1PerformanceLevel;

	private Long ownerId;

	private String internetChargeType;

	private String instanceNetworkType;

	private Integer instanceAmount;

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

	private String instanceType;

	private String dataDisk2Category;

	private Integer dataDisk1Size;

	private Integer amount;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Integer dataDisk2Size;

	private String resourceType;

	private String dataDisk1Category;

	private String dataDisk2PerformanceLevel;

	private Integer systemDiskSize;

	private String offeringType;
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
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

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
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

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
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

	@Override
	public Class<DescribePriceResponse> getResponseClass() {
		return DescribePriceResponse.class;
	}

}
