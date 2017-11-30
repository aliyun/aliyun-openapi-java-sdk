/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ess.model.v20140828;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class CreateScalingConfigurationRequest extends RpcAcsRequest<CreateScalingConfigurationResponse> {
	
	public CreateScalingConfigurationRequest() {
		super("Ess", "2014-08-28", "CreateScalingConfiguration", "ess");
	}

	private Integer dataDisk3Size;

	private String imageId;

	private String dataDisk1SnapshotId;

	private String dataDisk3Category;

	private String dataDisk1Device;

	private String scalingGroupId;

	private String dataDisk2Device;

	private List<String> instanceTypess;

	private String ioOptimized;

	private String securityGroupId;

	private Integer internetMaxBandwidthOut;

	private String securityEnhancementStrategy;

	private String keyPairName;

	private String systemDiskCategory;

	private String userData;

	private String dataDisk4Category;

	private String dataDisk2SnapshotId;

	private Integer dataDisk4Size;

	private String instanceType;

	private String dataDisk2Category;

	private Integer dataDisk1Size;

	private String dataDisk3SnapshotId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Integer dataDisk2Size;

	private String ramRoleName;

	private Long ownerId;

	private String scalingConfigurationName;

	private String tags;

	private String dataDisk2DeleteWithInstance;

	private String dataDisk1Category;

	private String dataDisk3DeleteWithInstance;

	private Integer loadBalancerWeight;

	private String instanceName;

	private Integer systemDiskSize;

	private String dataDisk4SnapshotId;

	private String dataDisk4Device;

	private String internetChargeType;

	private String dataDisk3Device;

	private String dataDisk4DeleteWithInstance;

	private Integer internetMaxBandwidthIn;

	private String dataDisk1DeleteWithInstance;

	public Integer getDataDisk3Size() {
		return this.dataDisk3Size;
	}

	public void setDataDisk3Size(Integer dataDisk3Size) {
		this.dataDisk3Size = dataDisk3Size;
		if(dataDisk3Size != null){
			putQueryParameter("DataDisk.3.Size", dataDisk3Size.toString());
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

	public String getDataDisk1SnapshotId() {
		return this.dataDisk1SnapshotId;
	}

	public void setDataDisk1SnapshotId(String dataDisk1SnapshotId) {
		this.dataDisk1SnapshotId = dataDisk1SnapshotId;
		if(dataDisk1SnapshotId != null){
			putQueryParameter("DataDisk.1.SnapshotId", dataDisk1SnapshotId);
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

	public String getDataDisk1Device() {
		return this.dataDisk1Device;
	}

	public void setDataDisk1Device(String dataDisk1Device) {
		this.dataDisk1Device = dataDisk1Device;
		if(dataDisk1Device != null){
			putQueryParameter("DataDisk.1.Device", dataDisk1Device);
		}
	}

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
		if(scalingGroupId != null){
			putQueryParameter("ScalingGroupId", scalingGroupId);
		}
	}

	public String getDataDisk2Device() {
		return this.dataDisk2Device;
	}

	public void setDataDisk2Device(String dataDisk2Device) {
		this.dataDisk2Device = dataDisk2Device;
		if(dataDisk2Device != null){
			putQueryParameter("DataDisk.2.Device", dataDisk2Device);
		}
	}

	public List<String> getInstanceTypess() {
		return this.instanceTypess;
	}

	public void setInstanceTypess(List<String> instanceTypess) {
		this.instanceTypess = instanceTypess;	
		if (instanceTypess != null) {
			for (int i = 0; i < instanceTypess.size(); i++) {
				putQueryParameter("InstanceTypes." + (i + 1) , instanceTypess.get(i));
			}
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

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if(securityGroupId != null){
			putQueryParameter("SecurityGroupId", securityGroupId);
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

	public String getSecurityEnhancementStrategy() {
		return this.securityEnhancementStrategy;
	}

	public void setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
		this.securityEnhancementStrategy = securityEnhancementStrategy;
		if(securityEnhancementStrategy != null){
			putQueryParameter("SecurityEnhancementStrategy", securityEnhancementStrategy);
		}
	}

	public String getKeyPairName() {
		return this.keyPairName;
	}

	public void setKeyPairName(String keyPairName) {
		this.keyPairName = keyPairName;
		if(keyPairName != null){
			putQueryParameter("KeyPairName", keyPairName);
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

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
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

	public String getDataDisk2SnapshotId() {
		return this.dataDisk2SnapshotId;
	}

	public void setDataDisk2SnapshotId(String dataDisk2SnapshotId) {
		this.dataDisk2SnapshotId = dataDisk2SnapshotId;
		if(dataDisk2SnapshotId != null){
			putQueryParameter("DataDisk.2.SnapshotId", dataDisk2SnapshotId);
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

	public String getDataDisk3SnapshotId() {
		return this.dataDisk3SnapshotId;
	}

	public void setDataDisk3SnapshotId(String dataDisk3SnapshotId) {
		this.dataDisk3SnapshotId = dataDisk3SnapshotId;
		if(dataDisk3SnapshotId != null){
			putQueryParameter("DataDisk.3.SnapshotId", dataDisk3SnapshotId);
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

	public String getRamRoleName() {
		return this.ramRoleName;
	}

	public void setRamRoleName(String ramRoleName) {
		this.ramRoleName = ramRoleName;
		if(ramRoleName != null){
			putQueryParameter("RamRoleName", ramRoleName);
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

	public String getScalingConfigurationName() {
		return this.scalingConfigurationName;
	}

	public void setScalingConfigurationName(String scalingConfigurationName) {
		this.scalingConfigurationName = scalingConfigurationName;
		if(scalingConfigurationName != null){
			putQueryParameter("ScalingConfigurationName", scalingConfigurationName);
		}
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", tags);
		}
	}

	public String getDataDisk2DeleteWithInstance() {
		return this.dataDisk2DeleteWithInstance;
	}

	public void setDataDisk2DeleteWithInstance(String dataDisk2DeleteWithInstance) {
		this.dataDisk2DeleteWithInstance = dataDisk2DeleteWithInstance;
		if(dataDisk2DeleteWithInstance != null){
			putQueryParameter("DataDisk.2.DeleteWithInstance", dataDisk2DeleteWithInstance);
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

	public String getDataDisk3DeleteWithInstance() {
		return this.dataDisk3DeleteWithInstance;
	}

	public void setDataDisk3DeleteWithInstance(String dataDisk3DeleteWithInstance) {
		this.dataDisk3DeleteWithInstance = dataDisk3DeleteWithInstance;
		if(dataDisk3DeleteWithInstance != null){
			putQueryParameter("DataDisk.3.DeleteWithInstance", dataDisk3DeleteWithInstance);
		}
	}

	public Integer getLoadBalancerWeight() {
		return this.loadBalancerWeight;
	}

	public void setLoadBalancerWeight(Integer loadBalancerWeight) {
		this.loadBalancerWeight = loadBalancerWeight;
		if(loadBalancerWeight != null){
			putQueryParameter("LoadBalancerWeight", loadBalancerWeight.toString());
		}
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
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

	public String getDataDisk4SnapshotId() {
		return this.dataDisk4SnapshotId;
	}

	public void setDataDisk4SnapshotId(String dataDisk4SnapshotId) {
		this.dataDisk4SnapshotId = dataDisk4SnapshotId;
		if(dataDisk4SnapshotId != null){
			putQueryParameter("DataDisk.4.SnapshotId", dataDisk4SnapshotId);
		}
	}

	public String getDataDisk4Device() {
		return this.dataDisk4Device;
	}

	public void setDataDisk4Device(String dataDisk4Device) {
		this.dataDisk4Device = dataDisk4Device;
		if(dataDisk4Device != null){
			putQueryParameter("DataDisk.4.Device", dataDisk4Device);
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

	public String getDataDisk3Device() {
		return this.dataDisk3Device;
	}

	public void setDataDisk3Device(String dataDisk3Device) {
		this.dataDisk3Device = dataDisk3Device;
		if(dataDisk3Device != null){
			putQueryParameter("DataDisk.3.Device", dataDisk3Device);
		}
	}

	public String getDataDisk4DeleteWithInstance() {
		return this.dataDisk4DeleteWithInstance;
	}

	public void setDataDisk4DeleteWithInstance(String dataDisk4DeleteWithInstance) {
		this.dataDisk4DeleteWithInstance = dataDisk4DeleteWithInstance;
		if(dataDisk4DeleteWithInstance != null){
			putQueryParameter("DataDisk.4.DeleteWithInstance", dataDisk4DeleteWithInstance);
		}
	}

	public Integer getInternetMaxBandwidthIn() {
		return this.internetMaxBandwidthIn;
	}

	public void setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
		this.internetMaxBandwidthIn = internetMaxBandwidthIn;
		if(internetMaxBandwidthIn != null){
			putQueryParameter("InternetMaxBandwidthIn", internetMaxBandwidthIn.toString());
		}
	}

	public String getDataDisk1DeleteWithInstance() {
		return this.dataDisk1DeleteWithInstance;
	}

	public void setDataDisk1DeleteWithInstance(String dataDisk1DeleteWithInstance) {
		this.dataDisk1DeleteWithInstance = dataDisk1DeleteWithInstance;
		if(dataDisk1DeleteWithInstance != null){
			putQueryParameter("DataDisk.1.DeleteWithInstance", dataDisk1DeleteWithInstance);
		}
	}

	@Override
	public Class<CreateScalingConfigurationResponse> getResponseClass() {
		return CreateScalingConfigurationResponse.class;
	}

}
