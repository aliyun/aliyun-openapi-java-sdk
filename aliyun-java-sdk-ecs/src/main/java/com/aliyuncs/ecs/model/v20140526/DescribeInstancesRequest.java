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
public class DescribeInstancesRequest extends RpcAcsRequest<DescribeInstancesResponse> {
	
	public DescribeInstancesRequest() {
		super("Ecs", "2014-05-26", "DescribeInstances", "ecs");
	}

	private String tag4Value;

	private String innerIpAddresses;

	private Long resourceOwnerId;

	private String tag2Key;

	private String privateIpAddresses;

	private String hpcClusterId;

	private String filter2Value;

	private String tag3Key;

	private String keyPairName;

	private String tag1Value;

	private String resourceGroupId;

	private String lockReason;

	private String filter1Key;

	private Boolean deviceAvailable;

	private String filter3Value;

	private Boolean dryRun;

	private String tag5Key;

	private String filter1Value;

	private Long ownerId;

	private String vSwitchId;

	private String instanceName;

	private String instanceIds;

	private String internetChargeType;

	private String zoneId;

	private String tag4Key;

	private String instanceNetworkType;

	private String status;

	private String imageId;

	private String filter4Value;

	private Boolean ioOptimized;

	private String securityGroupId;

	private String filter4Key;

	private Integer pageNumber;

	private String rdmaIpAddresses;

	private Integer pageSize;

	private String publicIpAddresses;

	private String instanceType;

	private String instanceChargeType;

	private String tag3Value;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String instanceTypeFamily;

	private String filter2Key;

	private String tag5Value;

	private String tag1Key;

	private String eipAddresses;

	private String vpcId;

	private String tag2Value;

	private String filter3Key;

	public String getTag4Value() {
		return this.tag4Value;
	}

	public void setTag4Value(String tag4Value) {
		this.tag4Value = tag4Value;
		if(tag4Value != null){
			putQueryParameter("Tag.4.Value", tag4Value);
		}
	}

	public String getInnerIpAddresses() {
		return this.innerIpAddresses;
	}

	public void setInnerIpAddresses(String innerIpAddresses) {
		this.innerIpAddresses = innerIpAddresses;
		if(innerIpAddresses != null){
			putQueryParameter("InnerIpAddresses", innerIpAddresses);
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

	public String getTag2Key() {
		return this.tag2Key;
	}

	public void setTag2Key(String tag2Key) {
		this.tag2Key = tag2Key;
		if(tag2Key != null){
			putQueryParameter("Tag.2.Key", tag2Key);
		}
	}

	public String getPrivateIpAddresses() {
		return this.privateIpAddresses;
	}

	public void setPrivateIpAddresses(String privateIpAddresses) {
		this.privateIpAddresses = privateIpAddresses;
		if(privateIpAddresses != null){
			putQueryParameter("PrivateIpAddresses", privateIpAddresses);
		}
	}

	public String getHpcClusterId() {
		return this.hpcClusterId;
	}

	public void setHpcClusterId(String hpcClusterId) {
		this.hpcClusterId = hpcClusterId;
		if(hpcClusterId != null){
			putQueryParameter("HpcClusterId", hpcClusterId);
		}
	}

	public String getFilter2Value() {
		return this.filter2Value;
	}

	public void setFilter2Value(String filter2Value) {
		this.filter2Value = filter2Value;
		if(filter2Value != null){
			putQueryParameter("Filter.2.Value", filter2Value);
		}
	}

	public String getTag3Key() {
		return this.tag3Key;
	}

	public void setTag3Key(String tag3Key) {
		this.tag3Key = tag3Key;
		if(tag3Key != null){
			putQueryParameter("Tag.3.Key", tag3Key);
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

	public String getTag1Value() {
		return this.tag1Value;
	}

	public void setTag1Value(String tag1Value) {
		this.tag1Value = tag1Value;
		if(tag1Value != null){
			putQueryParameter("Tag.1.Value", tag1Value);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getLockReason() {
		return this.lockReason;
	}

	public void setLockReason(String lockReason) {
		this.lockReason = lockReason;
		if(lockReason != null){
			putQueryParameter("LockReason", lockReason);
		}
	}

	public String getFilter1Key() {
		return this.filter1Key;
	}

	public void setFilter1Key(String filter1Key) {
		this.filter1Key = filter1Key;
		if(filter1Key != null){
			putQueryParameter("Filter.1.Key", filter1Key);
		}
	}

	public Boolean getDeviceAvailable() {
		return this.deviceAvailable;
	}

	public void setDeviceAvailable(Boolean deviceAvailable) {
		this.deviceAvailable = deviceAvailable;
		if(deviceAvailable != null){
			putQueryParameter("DeviceAvailable", deviceAvailable.toString());
		}
	}

	public String getFilter3Value() {
		return this.filter3Value;
	}

	public void setFilter3Value(String filter3Value) {
		this.filter3Value = filter3Value;
		if(filter3Value != null){
			putQueryParameter("Filter.3.Value", filter3Value);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getTag5Key() {
		return this.tag5Key;
	}

	public void setTag5Key(String tag5Key) {
		this.tag5Key = tag5Key;
		if(tag5Key != null){
			putQueryParameter("Tag.5.Key", tag5Key);
		}
	}

	public String getFilter1Value() {
		return this.filter1Value;
	}

	public void setFilter1Value(String filter1Value) {
		this.filter1Value = filter1Value;
		if(filter1Value != null){
			putQueryParameter("Filter.1.Value", filter1Value);
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

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
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

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		if(instanceIds != null){
			putQueryParameter("InstanceIds", instanceIds);
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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public String getTag4Key() {
		return this.tag4Key;
	}

	public void setTag4Key(String tag4Key) {
		this.tag4Key = tag4Key;
		if(tag4Key != null){
			putQueryParameter("Tag.4.Key", tag4Key);
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
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

	public String getFilter4Value() {
		return this.filter4Value;
	}

	public void setFilter4Value(String filter4Value) {
		this.filter4Value = filter4Value;
		if(filter4Value != null){
			putQueryParameter("Filter.4.Value", filter4Value);
		}
	}

	public Boolean getIoOptimized() {
		return this.ioOptimized;
	}

	public void setIoOptimized(Boolean ioOptimized) {
		this.ioOptimized = ioOptimized;
		if(ioOptimized != null){
			putQueryParameter("IoOptimized", ioOptimized.toString());
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

	public String getFilter4Key() {
		return this.filter4Key;
	}

	public void setFilter4Key(String filter4Key) {
		this.filter4Key = filter4Key;
		if(filter4Key != null){
			putQueryParameter("Filter.4.Key", filter4Key);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getRdmaIpAddresses() {
		return this.rdmaIpAddresses;
	}

	public void setRdmaIpAddresses(String rdmaIpAddresses) {
		this.rdmaIpAddresses = rdmaIpAddresses;
		if(rdmaIpAddresses != null){
			putQueryParameter("RdmaIpAddresses", rdmaIpAddresses);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getPublicIpAddresses() {
		return this.publicIpAddresses;
	}

	public void setPublicIpAddresses(String publicIpAddresses) {
		this.publicIpAddresses = publicIpAddresses;
		if(publicIpAddresses != null){
			putQueryParameter("PublicIpAddresses", publicIpAddresses);
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

	public String getTag3Value() {
		return this.tag3Value;
	}

	public void setTag3Value(String tag3Value) {
		this.tag3Value = tag3Value;
		if(tag3Value != null){
			putQueryParameter("Tag.3.Value", tag3Value);
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

	public String getInstanceTypeFamily() {
		return this.instanceTypeFamily;
	}

	public void setInstanceTypeFamily(String instanceTypeFamily) {
		this.instanceTypeFamily = instanceTypeFamily;
		if(instanceTypeFamily != null){
			putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
		}
	}

	public String getFilter2Key() {
		return this.filter2Key;
	}

	public void setFilter2Key(String filter2Key) {
		this.filter2Key = filter2Key;
		if(filter2Key != null){
			putQueryParameter("Filter.2.Key", filter2Key);
		}
	}

	public String getTag5Value() {
		return this.tag5Value;
	}

	public void setTag5Value(String tag5Value) {
		this.tag5Value = tag5Value;
		if(tag5Value != null){
			putQueryParameter("Tag.5.Value", tag5Value);
		}
	}

	public String getTag1Key() {
		return this.tag1Key;
	}

	public void setTag1Key(String tag1Key) {
		this.tag1Key = tag1Key;
		if(tag1Key != null){
			putQueryParameter("Tag.1.Key", tag1Key);
		}
	}

	public String getEipAddresses() {
		return this.eipAddresses;
	}

	public void setEipAddresses(String eipAddresses) {
		this.eipAddresses = eipAddresses;
		if(eipAddresses != null){
			putQueryParameter("EipAddresses", eipAddresses);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public String getTag2Value() {
		return this.tag2Value;
	}

	public void setTag2Value(String tag2Value) {
		this.tag2Value = tag2Value;
		if(tag2Value != null){
			putQueryParameter("Tag.2.Value", tag2Value);
		}
	}

	public String getFilter3Key() {
		return this.filter3Key;
	}

	public void setFilter3Key(String filter3Key) {
		this.filter3Key = filter3Key;
		if(filter3Key != null){
			putQueryParameter("Filter.3.Key", filter3Key);
		}
	}

	@Override
	public Class<DescribeInstancesResponse> getResponseClass() {
		return DescribeInstancesResponse.class;
	}

}
