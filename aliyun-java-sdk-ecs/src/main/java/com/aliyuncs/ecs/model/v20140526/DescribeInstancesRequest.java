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
		super("Ecs", "2014-05-26", "DescribeInstances");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String vpcId;

	private String vSwitchId;

	private String zoneId;

	private String instanceNetworkType;

	private String securityGroupId;

	private String instanceIds;

	private Integer pageNumber;

	private Integer pageSize;

	private String innerIpAddresses;

	private String privateIpAddresses;

	private String publicIpAddresses;

	private String ownerAccount;

	private String instanceChargeType;

	private String internetChargeType;

	private String instanceName;

	private String imageId;

	private String status;

	private String lockReason;

	private String filter1Key;

	private String filter2Key;

	private String filter3Key;

	private String filter4Key;

	private String filter1Value;

	private String filter2Value;

	private String filter3Value;

	private String filter4Value;

	private Boolean deviceAvailable;

	private Boolean ioOptimized;

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

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		putQueryParameter("VpcId", vpcId);
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		putQueryParameter("VSwitchId", vSwitchId);
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		putQueryParameter("ZoneId", zoneId);
	}

	public String getInstanceNetworkType() {
		return this.instanceNetworkType;
	}

	public void setInstanceNetworkType(String instanceNetworkType) {
		this.instanceNetworkType = instanceNetworkType;
		putQueryParameter("InstanceNetworkType", instanceNetworkType);
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		putQueryParameter("SecurityGroupId", securityGroupId);
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		putQueryParameter("InstanceIds", instanceIds);
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		putQueryParameter("PageNumber", String.valueOf(pageNumber));
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		putQueryParameter("PageSize", String.valueOf(pageSize));
	}

	public String getInnerIpAddresses() {
		return this.innerIpAddresses;
	}

	public void setInnerIpAddresses(String innerIpAddresses) {
		this.innerIpAddresses = innerIpAddresses;
		putQueryParameter("InnerIpAddresses", innerIpAddresses);
	}

	public String getPrivateIpAddresses() {
		return this.privateIpAddresses;
	}

	public void setPrivateIpAddresses(String privateIpAddresses) {
		this.privateIpAddresses = privateIpAddresses;
		putQueryParameter("PrivateIpAddresses", privateIpAddresses);
	}

	public String getPublicIpAddresses() {
		return this.publicIpAddresses;
	}

	public void setPublicIpAddresses(String publicIpAddresses) {
		this.publicIpAddresses = publicIpAddresses;
		putQueryParameter("PublicIpAddresses", publicIpAddresses);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	public String getInstanceChargeType() {
		return this.instanceChargeType;
	}

	public void setInstanceChargeType(String instanceChargeType) {
		this.instanceChargeType = instanceChargeType;
		putQueryParameter("InstanceChargeType", instanceChargeType);
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
		putQueryParameter("InternetChargeType", internetChargeType);
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		putQueryParameter("InstanceName", instanceName);
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		putQueryParameter("ImageId", imageId);
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		putQueryParameter("Status", status);
	}

	public String getLockReason() {
		return this.lockReason;
	}

	public void setLockReason(String lockReason) {
		this.lockReason = lockReason;
		putQueryParameter("LockReason", lockReason);
	}

	public String getFilter1Key() {
		return this.filter1Key;
	}

	public void setFilter1Key(String filter1Key) {
		this.filter1Key = filter1Key;
		putQueryParameter("Filter.1.Key", filter1Key);
	}

	public String getFilter2Key() {
		return this.filter2Key;
	}

	public void setFilter2Key(String filter2Key) {
		this.filter2Key = filter2Key;
		putQueryParameter("Filter.2.Key", filter2Key);
	}

	public String getFilter3Key() {
		return this.filter3Key;
	}

	public void setFilter3Key(String filter3Key) {
		this.filter3Key = filter3Key;
		putQueryParameter("Filter.3.Key", filter3Key);
	}

	public String getFilter4Key() {
		return this.filter4Key;
	}

	public void setFilter4Key(String filter4Key) {
		this.filter4Key = filter4Key;
		putQueryParameter("Filter.4.Key", filter4Key);
	}

	public String getFilter1Value() {
		return this.filter1Value;
	}

	public void setFilter1Value(String filter1Value) {
		this.filter1Value = filter1Value;
		putQueryParameter("Filter.1.Value", filter1Value);
	}

	public String getFilter2Value() {
		return this.filter2Value;
	}

	public void setFilter2Value(String filter2Value) {
		this.filter2Value = filter2Value;
		putQueryParameter("Filter.2.Value", filter2Value);
	}

	public String getFilter3Value() {
		return this.filter3Value;
	}

	public void setFilter3Value(String filter3Value) {
		this.filter3Value = filter3Value;
		putQueryParameter("Filter.3.Value", filter3Value);
	}

	public String getFilter4Value() {
		return this.filter4Value;
	}

	public void setFilter4Value(String filter4Value) {
		this.filter4Value = filter4Value;
		putQueryParameter("Filter.4.Value", filter4Value);
	}

	public Boolean getDeviceAvailable() {
		return this.deviceAvailable;
	}

	public void setDeviceAvailable(Boolean deviceAvailable) {
		this.deviceAvailable = deviceAvailable;
		putQueryParameter("DeviceAvailable", String.valueOf(deviceAvailable));
	}

	public Boolean getIoOptimized() {
		return this.ioOptimized;
	}

	public void setIoOptimized(Boolean ioOptimized) {
		this.ioOptimized = ioOptimized;
		putQueryParameter("IoOptimized", String.valueOf(ioOptimized));
	}

	@Override
	public Class<DescribeInstancesResponse> getResponseClass() {
		return DescribeInstancesResponse.class;
	}

}
