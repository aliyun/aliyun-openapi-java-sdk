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
package com.aliyuncs.ecs.v20140526.model;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
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

    private String systemDiskCategory;

    private String systemDiskDiskName;

    private String systemDiskDescription;

    private Integer dataDisk1Size;

    private String dataDisk1Category;

    private String dataDisk1SnapshotId;

    private String dataDisk1DiskName;

    private String dataDisk1Description;

    private String dataDisk1Device;

    private Integer dataDisk2Size;

    private String dataDisk2Category;

    private String dataDisk2SnapshotId;

    private String dataDisk2DiskName;

    private String dataDisk2Description;

    private String dataDisk2Device;

    private Integer dataDisk3Size;

    private String dataDisk3Category;

    private String dataDisk3SnapshotId;

    private String dataDisk3DiskName;

    private String dataDisk3Description;

    private String dataDisk3Device;

    private Integer dataDisk4Size;

    private String dataDisk4Category;

    private String dataDisk4SnapshotId;

    private String dataDisk4DiskName;

    private String dataDisk4Description;

    private String dataDisk4Device;

    private String nodeControllerId;

    private String description;

    private String vSwitchId;

    private String privateIpAddress;

    private String ownerAccount;

    public Long getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        putQueryParameter("OwnerId", String.valueOf(ownerId));
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
        putQueryParameter("ResourceOwnerId", String.valueOf(resourceOwnerId));
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
        putQueryParameter("InternetMaxBandwidthIn", String.valueOf(internetMaxBandwidthIn));
    }

    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        putQueryParameter("InternetMaxBandwidthOut", String.valueOf(internetMaxBandwidthOut));
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

    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    public void setSystemDiskCategory(String systemDiskCategory) {
        this.systemDiskCategory = systemDiskCategory;
        putQueryParameter("SystemDiskCategory", systemDiskCategory);
    }

    public String getSystemDiskDiskName() {
        return this.systemDiskDiskName;
    }

    public void setSystemDiskDiskName(String systemDiskDiskName) {
        this.systemDiskDiskName = systemDiskDiskName;
        putQueryParameter("SystemDiskDiskName", systemDiskDiskName);
    }

    public String getSystemDiskDescription() {
        return this.systemDiskDescription;
    }

    public void setSystemDiskDescription(String systemDiskDescription) {
        this.systemDiskDescription = systemDiskDescription;
        putQueryParameter("SystemDiskDescription", systemDiskDescription);
    }

    public Integer getDataDisk1Size() {
        return this.dataDisk1Size;
    }

    public void setDataDisk1Size(Integer dataDisk1Size) {
        this.dataDisk1Size = dataDisk1Size;
        putQueryParameter("DataDisk1Size", String.valueOf(dataDisk1Size));
    }

    public String getDataDisk1Category() {
        return this.dataDisk1Category;
    }

    public void setDataDisk1Category(String dataDisk1Category) {
        this.dataDisk1Category = dataDisk1Category;
        putQueryParameter("DataDisk1Category", dataDisk1Category);
    }

    public String getDataDisk1SnapshotId() {
        return this.dataDisk1SnapshotId;
    }

    public void setDataDisk1SnapshotId(String dataDisk1SnapshotId) {
        this.dataDisk1SnapshotId = dataDisk1SnapshotId;
        putQueryParameter("DataDisk1SnapshotId", dataDisk1SnapshotId);
    }

    public String getDataDisk1DiskName() {
        return this.dataDisk1DiskName;
    }

    public void setDataDisk1DiskName(String dataDisk1DiskName) {
        this.dataDisk1DiskName = dataDisk1DiskName;
        putQueryParameter("DataDisk1DiskName", dataDisk1DiskName);
    }

    public String getDataDisk1Description() {
        return this.dataDisk1Description;
    }

    public void setDataDisk1Description(String dataDisk1Description) {
        this.dataDisk1Description = dataDisk1Description;
        putQueryParameter("DataDisk1Description", dataDisk1Description);
    }

    public String getDataDisk1Device() {
        return this.dataDisk1Device;
    }

    public void setDataDisk1Device(String dataDisk1Device) {
        this.dataDisk1Device = dataDisk1Device;
        putQueryParameter("DataDisk1Device", dataDisk1Device);
    }

    public Integer getDataDisk2Size() {
        return this.dataDisk2Size;
    }

    public void setDataDisk2Size(Integer dataDisk2Size) {
        this.dataDisk2Size = dataDisk2Size;
        putQueryParameter("DataDisk2Size", String.valueOf(dataDisk2Size));
    }

    public String getDataDisk2Category() {
        return this.dataDisk2Category;
    }

    public void setDataDisk2Category(String dataDisk2Category) {
        this.dataDisk2Category = dataDisk2Category;
        putQueryParameter("DataDisk2Category", dataDisk2Category);
    }

    public String getDataDisk2SnapshotId() {
        return this.dataDisk2SnapshotId;
    }

    public void setDataDisk2SnapshotId(String dataDisk2SnapshotId) {
        this.dataDisk2SnapshotId = dataDisk2SnapshotId;
        putQueryParameter("DataDisk2SnapshotId", dataDisk2SnapshotId);
    }

    public String getDataDisk2DiskName() {
        return this.dataDisk2DiskName;
    }

    public void setDataDisk2DiskName(String dataDisk2DiskName) {
        this.dataDisk2DiskName = dataDisk2DiskName;
        putQueryParameter("DataDisk2DiskName", dataDisk2DiskName);
    }

    public String getDataDisk2Description() {
        return this.dataDisk2Description;
    }

    public void setDataDisk2Description(String dataDisk2Description) {
        this.dataDisk2Description = dataDisk2Description;
        putQueryParameter("DataDisk2Description", dataDisk2Description);
    }

    public String getDataDisk2Device() {
        return this.dataDisk2Device;
    }

    public void setDataDisk2Device(String dataDisk2Device) {
        this.dataDisk2Device = dataDisk2Device;
        putQueryParameter("DataDisk2Device", dataDisk2Device);
    }

    public Integer getDataDisk3Size() {
        return this.dataDisk3Size;
    }

    public void setDataDisk3Size(Integer dataDisk3Size) {
        this.dataDisk3Size = dataDisk3Size;
        putQueryParameter("DataDisk3Size", String.valueOf(dataDisk3Size));
    }

    public String getDataDisk3Category() {
        return this.dataDisk3Category;
    }

    public void setDataDisk3Category(String dataDisk3Category) {
        this.dataDisk3Category = dataDisk3Category;
        putQueryParameter("DataDisk3Category", dataDisk3Category);
    }

    public String getDataDisk3SnapshotId() {
        return this.dataDisk3SnapshotId;
    }

    public void setDataDisk3SnapshotId(String dataDisk3SnapshotId) {
        this.dataDisk3SnapshotId = dataDisk3SnapshotId;
        putQueryParameter("DataDisk3SnapshotId", dataDisk3SnapshotId);
    }

    public String getDataDisk3DiskName() {
        return this.dataDisk3DiskName;
    }

    public void setDataDisk3DiskName(String dataDisk3DiskName) {
        this.dataDisk3DiskName = dataDisk3DiskName;
        putQueryParameter("DataDisk3DiskName", dataDisk3DiskName);
    }

    public String getDataDisk3Description() {
        return this.dataDisk3Description;
    }

    public void setDataDisk3Description(String dataDisk3Description) {
        this.dataDisk3Description = dataDisk3Description;
        putQueryParameter("DataDisk3Description", dataDisk3Description);
    }

    public String getDataDisk3Device() {
        return this.dataDisk3Device;
    }

    public void setDataDisk3Device(String dataDisk3Device) {
        this.dataDisk3Device = dataDisk3Device;
        putQueryParameter("DataDisk3Device", dataDisk3Device);
    }

    public Integer getDataDisk4Size() {
        return this.dataDisk4Size;
    }

    public void setDataDisk4Size(Integer dataDisk4Size) {
        this.dataDisk4Size = dataDisk4Size;
        putQueryParameter("DataDisk4Size", String.valueOf(dataDisk4Size));
    }

    public String getDataDisk4Category() {
        return this.dataDisk4Category;
    }

    public void setDataDisk4Category(String dataDisk4Category) {
        this.dataDisk4Category = dataDisk4Category;
        putQueryParameter("DataDisk4Category", dataDisk4Category);
    }

    public String getDataDisk4SnapshotId() {
        return this.dataDisk4SnapshotId;
    }

    public void setDataDisk4SnapshotId(String dataDisk4SnapshotId) {
        this.dataDisk4SnapshotId = dataDisk4SnapshotId;
        putQueryParameter("DataDisk4SnapshotId", dataDisk4SnapshotId);
    }

    public String getDataDisk4DiskName() {
        return this.dataDisk4DiskName;
    }

    public void setDataDisk4DiskName(String dataDisk4DiskName) {
        this.dataDisk4DiskName = dataDisk4DiskName;
        putQueryParameter("DataDisk4DiskName", dataDisk4DiskName);
    }

    public String getDataDisk4Description() {
        return this.dataDisk4Description;
    }

    public void setDataDisk4Description(String dataDisk4Description) {
        this.dataDisk4Description = dataDisk4Description;
        putQueryParameter("DataDisk4Description", dataDisk4Description);
    }

    public String getDataDisk4Device() {
        return this.dataDisk4Device;
    }

    public void setDataDisk4Device(String dataDisk4Device) {
        this.dataDisk4Device = dataDisk4Device;
        putQueryParameter("DataDisk4Device", dataDisk4Device);
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

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        putQueryParameter("OwnerAccount", ownerAccount);
    }

    @Override
    public Class<CreateInstanceResponse> getResponseClass() {
        return CreateInstanceResponse.class;
    }

}
