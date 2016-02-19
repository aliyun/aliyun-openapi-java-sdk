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
package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateInstanceRequest extends RpcAcsRequest<CreateInstanceResponse> {
	
	public CreateInstanceRequest() {
		super("Ecs", "2014-05-26", "CreateInstance");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String imageId;

	private String instanceType;

	private String securityGroupId;

	private String instanceName;

	private String internetChargeType;

	private Integer internetMaxBandwidthIn;

	private Integer internetMaxBandwidthOut;

	private String hostName;

	private String password;

	private String zoneId;

	private String clusterId;

	private String clientToken;

	private String vlanId;

	private String innerIpAddress;

	private Integer systemDiskSize;

	private String systemDiskCategory;

	private String systemDiskDiskName;

	private String systemDiskDescription;

	private Integer dataDisk1Size;

	private String dataDisk1Category;

	private String dataDisk1SnapshotId;

	private String dataDisk1DiskName;

	private String dataDisk1Description;

	private String dataDisk1Device;

	private Boolean dataDisk1DeleteWithInstance;

	private Integer dataDisk2Size;

	private String dataDisk2Category;

	private String dataDisk2SnapshotId;

	private String dataDisk2DiskName;

	private String dataDisk2Description;

	private String dataDisk2Device;

	private Boolean dataDisk2DeleteWithInstance;

	private Integer dataDisk3Size;

	private String dataDisk3Category;

	private String dataDisk3SnapshotId;

	private String dataDisk3DiskName;

	private String dataDisk3Description;

	private String dataDisk3Device;

	private Boolean dataDisk3DeleteWithInstance;

	private Integer dataDisk4Size;

	private String dataDisk4Category;

	private String dataDisk4SnapshotId;

	private String dataDisk4DiskName;

	private String dataDisk4Description;

	private String dataDisk4Device;

	private Boolean dataDisk4DeleteWithInstance;

	private String nodeControllerId;

	private String description;

	private String vSwitchId;

	private String privateIpAddress;

	private String ioOptimized;

	private String ownerAccount;

	private Boolean useAdditionalService;

	private String instanceChargeType;

	private Integer period;

	private String tag1Key;

	private String tag2Key;

	private String tag3Key;

	private String tag4Key;

	private String tag5Key;

	private String tag1Value;

	private String tag2Value;

	private String tag3Value;

	private String tag4Value;

	private String tag5Value;

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

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		putQueryParameter("InstanceName", instanceName);
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

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
		putQueryParameter("HostName", hostName);
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		putQueryParameter("Password", password);
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		putQueryParameter("ZoneId", zoneId);
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		putQueryParameter("ClusterId", clusterId);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		putQueryParameter("ClientToken", clientToken);
	}

	public String getVlanId() {
		return this.vlanId;
	}

	public void setVlanId(String vlanId) {
		this.vlanId = vlanId;
		putQueryParameter("VlanId", vlanId);
	}

	public String getInnerIpAddress() {
		return this.innerIpAddress;
	}

	public void setInnerIpAddress(String innerIpAddress) {
		this.innerIpAddress = innerIpAddress;
		putQueryParameter("InnerIpAddress", innerIpAddress);
	}

	public Integer getSystemDiskSize() {
		return this.systemDiskSize;
	}

	public void setSystemDiskSize(Integer systemDiskSize) {
		this.systemDiskSize = systemDiskSize;
		putQueryParameter("SystemDisk.Size", systemDiskSize);
	}

	public String getSystemDiskCategory() {
		return this.systemDiskCategory;
	}

	public void setSystemDiskCategory(String systemDiskCategory) {
		this.systemDiskCategory = systemDiskCategory;
		putQueryParameter("SystemDisk.Category", systemDiskCategory);
	}

	public String getSystemDiskDiskName() {
		return this.systemDiskDiskName;
	}

	public void setSystemDiskDiskName(String systemDiskDiskName) {
		this.systemDiskDiskName = systemDiskDiskName;
		putQueryParameter("SystemDisk.DiskName", systemDiskDiskName);
	}

	public String getSystemDiskDescription() {
		return this.systemDiskDescription;
	}

	public void setSystemDiskDescription(String systemDiskDescription) {
		this.systemDiskDescription = systemDiskDescription;
		putQueryParameter("SystemDisk.Description", systemDiskDescription);
	}

	public Integer getDataDisk1Size() {
		return this.dataDisk1Size;
	}

	public void setDataDisk1Size(Integer dataDisk1Size) {
		this.dataDisk1Size = dataDisk1Size;
		putQueryParameter("DataDisk.1.Size", dataDisk1Size);
	}

	public String getDataDisk1Category() {
		return this.dataDisk1Category;
	}

	public void setDataDisk1Category(String dataDisk1Category) {
		this.dataDisk1Category = dataDisk1Category;
		putQueryParameter("DataDisk.1.Category", dataDisk1Category);
	}

	public String getDataDisk1SnapshotId() {
		return this.dataDisk1SnapshotId;
	}

	public void setDataDisk1SnapshotId(String dataDisk1SnapshotId) {
		this.dataDisk1SnapshotId = dataDisk1SnapshotId;
		putQueryParameter("DataDisk.1.SnapshotId", dataDisk1SnapshotId);
	}

	public String getDataDisk1DiskName() {
		return this.dataDisk1DiskName;
	}

	public void setDataDisk1DiskName(String dataDisk1DiskName) {
		this.dataDisk1DiskName = dataDisk1DiskName;
		putQueryParameter("DataDisk.1.DiskName", dataDisk1DiskName);
	}

	public String getDataDisk1Description() {
		return this.dataDisk1Description;
	}

	public void setDataDisk1Description(String dataDisk1Description) {
		this.dataDisk1Description = dataDisk1Description;
		putQueryParameter("DataDisk.1.Description", dataDisk1Description);
	}

	public String getDataDisk1Device() {
		return this.dataDisk1Device;
	}

	public void setDataDisk1Device(String dataDisk1Device) {
		this.dataDisk1Device = dataDisk1Device;
		putQueryParameter("DataDisk.1.Device", dataDisk1Device);
	}

	public Boolean getDataDisk1DeleteWithInstance() {
		return this.dataDisk1DeleteWithInstance;
	}

	public void setDataDisk1DeleteWithInstance(Boolean dataDisk1DeleteWithInstance) {
		this.dataDisk1DeleteWithInstance = dataDisk1DeleteWithInstance;
		putQueryParameter("DataDisk.1.DeleteWithInstance", dataDisk1DeleteWithInstance);
	}

	public Integer getDataDisk2Size() {
		return this.dataDisk2Size;
	}

	public void setDataDisk2Size(Integer dataDisk2Size) {
		this.dataDisk2Size = dataDisk2Size;
		putQueryParameter("DataDisk.2.Size", dataDisk2Size);
	}

	public String getDataDisk2Category() {
		return this.dataDisk2Category;
	}

	public void setDataDisk2Category(String dataDisk2Category) {
		this.dataDisk2Category = dataDisk2Category;
		putQueryParameter("DataDisk.2.Category", dataDisk2Category);
	}

	public String getDataDisk2SnapshotId() {
		return this.dataDisk2SnapshotId;
	}

	public void setDataDisk2SnapshotId(String dataDisk2SnapshotId) {
		this.dataDisk2SnapshotId = dataDisk2SnapshotId;
		putQueryParameter("DataDisk.2.SnapshotId", dataDisk2SnapshotId);
	}

	public String getDataDisk2DiskName() {
		return this.dataDisk2DiskName;
	}

	public void setDataDisk2DiskName(String dataDisk2DiskName) {
		this.dataDisk2DiskName = dataDisk2DiskName;
		putQueryParameter("DataDisk.2.DiskName", dataDisk2DiskName);
	}

	public String getDataDisk2Description() {
		return this.dataDisk2Description;
	}

	public void setDataDisk2Description(String dataDisk2Description) {
		this.dataDisk2Description = dataDisk2Description;
		putQueryParameter("DataDisk.2.Description", dataDisk2Description);
	}

	public String getDataDisk2Device() {
		return this.dataDisk2Device;
	}

	public void setDataDisk2Device(String dataDisk2Device) {
		this.dataDisk2Device = dataDisk2Device;
		putQueryParameter("DataDisk.2.Device", dataDisk2Device);
	}

	public Boolean getDataDisk2DeleteWithInstance() {
		return this.dataDisk2DeleteWithInstance;
	}

	public void setDataDisk2DeleteWithInstance(Boolean dataDisk2DeleteWithInstance) {
		this.dataDisk2DeleteWithInstance = dataDisk2DeleteWithInstance;
		putQueryParameter("DataDisk.2.DeleteWithInstance", dataDisk2DeleteWithInstance);
	}

	public Integer getDataDisk3Size() {
		return this.dataDisk3Size;
	}

	public void setDataDisk3Size(Integer dataDisk3Size) {
		this.dataDisk3Size = dataDisk3Size;
		putQueryParameter("DataDisk.3.Size", dataDisk3Size);
	}

	public String getDataDisk3Category() {
		return this.dataDisk3Category;
	}

	public void setDataDisk3Category(String dataDisk3Category) {
		this.dataDisk3Category = dataDisk3Category;
		putQueryParameter("DataDisk.3.Category", dataDisk3Category);
	}

	public String getDataDisk3SnapshotId() {
		return this.dataDisk3SnapshotId;
	}

	public void setDataDisk3SnapshotId(String dataDisk3SnapshotId) {
		this.dataDisk3SnapshotId = dataDisk3SnapshotId;
		putQueryParameter("DataDisk.3.SnapshotId", dataDisk3SnapshotId);
	}

	public String getDataDisk3DiskName() {
		return this.dataDisk3DiskName;
	}

	public void setDataDisk3DiskName(String dataDisk3DiskName) {
		this.dataDisk3DiskName = dataDisk3DiskName;
		putQueryParameter("DataDisk.3.DiskName", dataDisk3DiskName);
	}

	public String getDataDisk3Description() {
		return this.dataDisk3Description;
	}

	public void setDataDisk3Description(String dataDisk3Description) {
		this.dataDisk3Description = dataDisk3Description;
		putQueryParameter("DataDisk.3.Description", dataDisk3Description);
	}

	public String getDataDisk3Device() {
		return this.dataDisk3Device;
	}

	public void setDataDisk3Device(String dataDisk3Device) {
		this.dataDisk3Device = dataDisk3Device;
		putQueryParameter("DataDisk.3.Device", dataDisk3Device);
	}

	public Boolean getDataDisk3DeleteWithInstance() {
		return this.dataDisk3DeleteWithInstance;
	}

	public void setDataDisk3DeleteWithInstance(Boolean dataDisk3DeleteWithInstance) {
		this.dataDisk3DeleteWithInstance = dataDisk3DeleteWithInstance;
		putQueryParameter("DataDisk.3.DeleteWithInstance", dataDisk3DeleteWithInstance);
	}

	public Integer getDataDisk4Size() {
		return this.dataDisk4Size;
	}

	public void setDataDisk4Size(Integer dataDisk4Size) {
		this.dataDisk4Size = dataDisk4Size;
		putQueryParameter("DataDisk.4.Size", dataDisk4Size);
	}

	public String getDataDisk4Category() {
		return this.dataDisk4Category;
	}

	public void setDataDisk4Category(String dataDisk4Category) {
		this.dataDisk4Category = dataDisk4Category;
		putQueryParameter("DataDisk.4.Category", dataDisk4Category);
	}

	public String getDataDisk4SnapshotId() {
		return this.dataDisk4SnapshotId;
	}

	public void setDataDisk4SnapshotId(String dataDisk4SnapshotId) {
		this.dataDisk4SnapshotId = dataDisk4SnapshotId;
		putQueryParameter("DataDisk.4.SnapshotId", dataDisk4SnapshotId);
	}

	public String getDataDisk4DiskName() {
		return this.dataDisk4DiskName;
	}

	public void setDataDisk4DiskName(String dataDisk4DiskName) {
		this.dataDisk4DiskName = dataDisk4DiskName;
		putQueryParameter("DataDisk.4.DiskName", dataDisk4DiskName);
	}

	public String getDataDisk4Description() {
		return this.dataDisk4Description;
	}

	public void setDataDisk4Description(String dataDisk4Description) {
		this.dataDisk4Description = dataDisk4Description;
		putQueryParameter("DataDisk.4.Description", dataDisk4Description);
	}

	public String getDataDisk4Device() {
		return this.dataDisk4Device;
	}

	public void setDataDisk4Device(String dataDisk4Device) {
		this.dataDisk4Device = dataDisk4Device;
		putQueryParameter("DataDisk.4.Device", dataDisk4Device);
	}

	public Boolean getDataDisk4DeleteWithInstance() {
		return this.dataDisk4DeleteWithInstance;
	}

	public void setDataDisk4DeleteWithInstance(Boolean dataDisk4DeleteWithInstance) {
		this.dataDisk4DeleteWithInstance = dataDisk4DeleteWithInstance;
		putQueryParameter("DataDisk.4.DeleteWithInstance", dataDisk4DeleteWithInstance);
	}

	public String getNodeControllerId() {
		return this.nodeControllerId;
	}

	public void setNodeControllerId(String nodeControllerId) {
		this.nodeControllerId = nodeControllerId;
		putQueryParameter("NodeControllerId", nodeControllerId);
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		putQueryParameter("Description", description);
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		putQueryParameter("VSwitchId", vSwitchId);
	}

	public String getPrivateIpAddress() {
		return this.privateIpAddress;
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
		putQueryParameter("PrivateIpAddress", privateIpAddress);
	}

	public String getIoOptimized() {
		return this.ioOptimized;
	}

	public void setIoOptimized(String ioOptimized) {
		this.ioOptimized = ioOptimized;
		putQueryParameter("IoOptimized", ioOptimized);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	public Boolean getUseAdditionalService() {
		return this.useAdditionalService;
	}

	public void setUseAdditionalService(Boolean useAdditionalService) {
		this.useAdditionalService = useAdditionalService;
		putQueryParameter("UseAdditionalService", useAdditionalService);
	}

	public String getInstanceChargeType() {
		return this.instanceChargeType;
	}

	public void setInstanceChargeType(String instanceChargeType) {
		this.instanceChargeType = instanceChargeType;
		putQueryParameter("InstanceChargeType", instanceChargeType);
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		putQueryParameter("Period", period);
	}

	public String getTag1Key() {
		return this.tag1Key;
	}

	public void setTag1Key(String tag1Key) {
		this.tag1Key = tag1Key;
		putQueryParameter("Tag.1.Key", tag1Key);
	}

	public String getTag2Key() {
		return this.tag2Key;
	}

	public void setTag2Key(String tag2Key) {
		this.tag2Key = tag2Key;
		putQueryParameter("Tag.2.Key", tag2Key);
	}

	public String getTag3Key() {
		return this.tag3Key;
	}

	public void setTag3Key(String tag3Key) {
		this.tag3Key = tag3Key;
		putQueryParameter("Tag.3.Key", tag3Key);
	}

	public String getTag4Key() {
		return this.tag4Key;
	}

	public void setTag4Key(String tag4Key) {
		this.tag4Key = tag4Key;
		putQueryParameter("Tag.4.Key", tag4Key);
	}

	public String getTag5Key() {
		return this.tag5Key;
	}

	public void setTag5Key(String tag5Key) {
		this.tag5Key = tag5Key;
		putQueryParameter("Tag.5.Key", tag5Key);
	}

	public String getTag1Value() {
		return this.tag1Value;
	}

	public void setTag1Value(String tag1Value) {
		this.tag1Value = tag1Value;
		putQueryParameter("Tag.1.Value", tag1Value);
	}

	public String getTag2Value() {
		return this.tag2Value;
	}

	public void setTag2Value(String tag2Value) {
		this.tag2Value = tag2Value;
		putQueryParameter("Tag.2.Value", tag2Value);
	}

	public String getTag3Value() {
		return this.tag3Value;
	}

	public void setTag3Value(String tag3Value) {
		this.tag3Value = tag3Value;
		putQueryParameter("Tag.3.Value", tag3Value);
	}

	public String getTag4Value() {
		return this.tag4Value;
	}

	public void setTag4Value(String tag4Value) {
		this.tag4Value = tag4Value;
		putQueryParameter("Tag.4.Value", tag4Value);
	}

	public String getTag5Value() {
		return this.tag5Value;
	}

	public void setTag5Value(String tag5Value) {
		this.tag5Value = tag5Value;
		putQueryParameter("Tag.5.Value", tag5Value);
	}

	@Override
	public Class<CreateInstanceResponse> getResponseClass() {
		return CreateInstanceResponse.class;
	}

}
