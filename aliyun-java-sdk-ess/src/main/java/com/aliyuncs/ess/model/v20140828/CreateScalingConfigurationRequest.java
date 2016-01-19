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

/**
 * @author auto create
 * @version 
 */
public class CreateScalingConfigurationRequest extends RpcAcsRequest<CreateScalingConfigurationResponse> {
	
	public CreateScalingConfigurationRequest() {
		super("Ess", "2014-08-28", "CreateScalingConfiguration");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String scalingGroupId;

	private String imageId;

	private String instanceType;

	private String securityGroupId;

	private String ioOptimized;

	private String internetChargeType;

	private Integer internetMaxBandwidthIn;

	private Integer internetMaxBandwidthOut;

	private String systemDiskCategory;

	private String scalingConfigurationName;

	private Integer dataDisk1Size;

	private Integer dataDisk2Size;

	private Integer dataDisk3Size;

	private Integer dataDisk4Size;

	private String dataDisk1Category;

	private String dataDisk2Category;

	private String dataDisk3Category;

	private String dataDisk4Category;

	private String dataDisk1SnapshotId;

	private String dataDisk2SnapshotId;

	private String dataDisk3SnapshotId;

	private String dataDisk4SnapshotId;

	private String dataDisk1Device;

	private String dataDisk2Device;

	private String dataDisk3Device;

	private String dataDisk4Device;

	private String dataDisk1DeleteWithInstance;

	private String dataDisk2DeleteWithInstance;

	private String dataDisk3DeleteWithInstance;

	private String dataDisk4DeleteWithInstance;

	private String ownerAccount;

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", ownerId);
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		putQueryParameter("ResourceOwnerId", resourceOwnerId);
	}

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
		putQueryParameter("ScalingGroupId", scalingGroupId);
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		putQueryParameter("ImageId", imageId);
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		putQueryParameter("InstanceType", instanceType);
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		putQueryParameter("SecurityGroupId", securityGroupId);
	}

	public String getIoOptimized() {
		return this.ioOptimized;
	}

	public void setIoOptimized(String ioOptimized) {
		this.ioOptimized = ioOptimized;
		putQueryParameter("IoOptimized", ioOptimized);
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
		putQueryParameter("InternetChargeType", internetChargeType);
	}

	public Integer getInternetMaxBandwidthIn() {
		return this.internetMaxBandwidthIn;
	}

	public void setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
		this.internetMaxBandwidthIn = internetMaxBandwidthIn;
		putQueryParameter("InternetMaxBandwidthIn", internetMaxBandwidthIn);
	}

	public Integer getInternetMaxBandwidthOut() {
		return this.internetMaxBandwidthOut;
	}

	public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
		this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
	}

	public String getSystemDiskCategory() {
		return this.systemDiskCategory;
	}

	public void setSystemDiskCategory(String systemDiskCategory) {
		this.systemDiskCategory = systemDiskCategory;
		putQueryParameter("SystemDisk.Category", systemDiskCategory);
	}

	public String getScalingConfigurationName() {
		return this.scalingConfigurationName;
	}

	public void setScalingConfigurationName(String scalingConfigurationName) {
		this.scalingConfigurationName = scalingConfigurationName;
		putQueryParameter("ScalingConfigurationName", scalingConfigurationName);
	}

	public Integer getDataDisk1Size() {
		return this.dataDisk1Size;
	}

	public void setDataDisk1Size(Integer dataDisk1Size) {
		this.dataDisk1Size = dataDisk1Size;
		putQueryParameter("DataDisk.1.Size", dataDisk1Size);
	}

	public Integer getDataDisk2Size() {
		return this.dataDisk2Size;
	}

	public void setDataDisk2Size(Integer dataDisk2Size) {
		this.dataDisk2Size = dataDisk2Size;
		putQueryParameter("DataDisk.2.Size", dataDisk2Size);
	}

	public Integer getDataDisk3Size() {
		return this.dataDisk3Size;
	}

	public void setDataDisk3Size(Integer dataDisk3Size) {
		this.dataDisk3Size = dataDisk3Size;
		putQueryParameter("DataDisk.3.Size", dataDisk3Size);
	}

	public Integer getDataDisk4Size() {
		return this.dataDisk4Size;
	}

	public void setDataDisk4Size(Integer dataDisk4Size) {
		this.dataDisk4Size = dataDisk4Size;
		putQueryParameter("DataDisk.4.Size", dataDisk4Size);
	}

	public String getDataDisk1Category() {
		return this.dataDisk1Category;
	}

	public void setDataDisk1Category(String dataDisk1Category) {
		this.dataDisk1Category = dataDisk1Category;
		putQueryParameter("DataDisk.1.Category", dataDisk1Category);
	}

	public String getDataDisk2Category() {
		return this.dataDisk2Category;
	}

	public void setDataDisk2Category(String dataDisk2Category) {
		this.dataDisk2Category = dataDisk2Category;
		putQueryParameter("DataDisk.2.Category", dataDisk2Category);
	}

	public String getDataDisk3Category() {
		return this.dataDisk3Category;
	}

	public void setDataDisk3Category(String dataDisk3Category) {
		this.dataDisk3Category = dataDisk3Category;
		putQueryParameter("DataDisk.3.Category", dataDisk3Category);
	}

	public String getDataDisk4Category() {
		return this.dataDisk4Category;
	}

	public void setDataDisk4Category(String dataDisk4Category) {
		this.dataDisk4Category = dataDisk4Category;
		putQueryParameter("DataDisk.4.Category", dataDisk4Category);
	}

	public String getDataDisk1SnapshotId() {
		return this.dataDisk1SnapshotId;
	}

	public void setDataDisk1SnapshotId(String dataDisk1SnapshotId) {
		this.dataDisk1SnapshotId = dataDisk1SnapshotId;
		putQueryParameter("DataDisk.1.SnapshotId", dataDisk1SnapshotId);
	}

	public String getDataDisk2SnapshotId() {
		return this.dataDisk2SnapshotId;
	}

	public void setDataDisk2SnapshotId(String dataDisk2SnapshotId) {
		this.dataDisk2SnapshotId = dataDisk2SnapshotId;
		putQueryParameter("DataDisk.2.SnapshotId", dataDisk2SnapshotId);
	}

	public String getDataDisk3SnapshotId() {
		return this.dataDisk3SnapshotId;
	}

	public void setDataDisk3SnapshotId(String dataDisk3SnapshotId) {
		this.dataDisk3SnapshotId = dataDisk3SnapshotId;
		putQueryParameter("DataDisk.3.SnapshotId", dataDisk3SnapshotId);
	}

	public String getDataDisk4SnapshotId() {
		return this.dataDisk4SnapshotId;
	}

	public void setDataDisk4SnapshotId(String dataDisk4SnapshotId) {
		this.dataDisk4SnapshotId = dataDisk4SnapshotId;
		putQueryParameter("DataDisk.4.SnapshotId", dataDisk4SnapshotId);
	}

	public String getDataDisk1Device() {
		return this.dataDisk1Device;
	}

	public void setDataDisk1Device(String dataDisk1Device) {
		this.dataDisk1Device = dataDisk1Device;
		putQueryParameter("DataDisk.1.Device", dataDisk1Device);
	}

	public String getDataDisk2Device() {
		return this.dataDisk2Device;
	}

	public void setDataDisk2Device(String dataDisk2Device) {
		this.dataDisk2Device = dataDisk2Device;
		putQueryParameter("DataDisk.2.Device", dataDisk2Device);
	}

	public String getDataDisk3Device() {
		return this.dataDisk3Device;
	}

	public void setDataDisk3Device(String dataDisk3Device) {
		this.dataDisk3Device = dataDisk3Device;
		putQueryParameter("DataDisk.3.Device", dataDisk3Device);
	}

	public String getDataDisk4Device() {
		return this.dataDisk4Device;
	}

	public void setDataDisk4Device(String dataDisk4Device) {
		this.dataDisk4Device = dataDisk4Device;
		putQueryParameter("DataDisk.4.Device", dataDisk4Device);
	}

	public String getDataDisk1DeleteWithInstance() {
		return this.dataDisk1DeleteWithInstance;
	}

	public void setDataDisk1DeleteWithInstance(String dataDisk1DeleteWithInstance) {
		this.dataDisk1DeleteWithInstance = dataDisk1DeleteWithInstance;
		putQueryParameter("DataDisk.1.DeleteWithInstance", dataDisk1DeleteWithInstance);
	}

	public String getDataDisk2DeleteWithInstance() {
		return this.dataDisk2DeleteWithInstance;
	}

	public void setDataDisk2DeleteWithInstance(String dataDisk2DeleteWithInstance) {
		this.dataDisk2DeleteWithInstance = dataDisk2DeleteWithInstance;
		putQueryParameter("DataDisk.2.DeleteWithInstance", dataDisk2DeleteWithInstance);
	}

	public String getDataDisk3DeleteWithInstance() {
		return this.dataDisk3DeleteWithInstance;
	}

	public void setDataDisk3DeleteWithInstance(String dataDisk3DeleteWithInstance) {
		this.dataDisk3DeleteWithInstance = dataDisk3DeleteWithInstance;
		putQueryParameter("DataDisk.3.DeleteWithInstance", dataDisk3DeleteWithInstance);
	}

	public String getDataDisk4DeleteWithInstance() {
		return this.dataDisk4DeleteWithInstance;
	}

	public void setDataDisk4DeleteWithInstance(String dataDisk4DeleteWithInstance) {
		this.dataDisk4DeleteWithInstance = dataDisk4DeleteWithInstance;
		putQueryParameter("DataDisk.4.DeleteWithInstance", dataDisk4DeleteWithInstance);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	@Override
	public Class<CreateScalingConfigurationResponse> getResponseClass() {
		return CreateScalingConfigurationResponse.class;
	}

}
