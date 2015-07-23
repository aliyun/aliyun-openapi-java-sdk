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
public class DescribeDisksRequest extends RpcAcsRequest<DescribeDisksResponse> {
	
	public DescribeDisksRequest() {
		super("Ecs", "2014-05-26", "DescribeDisks");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String zoneId;

	private String diskIds;

	private String instanceId;

	private String diskType;

	private String category;

	private String status;

	private String snapshotId;

	private Boolean portable;

	private Boolean deleteWithInstance;

	private Boolean deleteAutoSnapshot;

	private Integer pageNumber;

	private Integer pageSize;

	private String ownerAccount;

	private String diskName;

	private Boolean enableAutoSnapshot;

	private String diskChargeType;

	private String lockReason;

	private String filter1Key;

	private String filter2Key;

	private String filter1Value;

	private String filter2Value;

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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		putQueryParameter("ZoneId", zoneId);
	}

	public String getDiskIds() {
		return this.diskIds;
	}

	public void setDiskIds(String diskIds) {
		this.diskIds = diskIds;
		putQueryParameter("DiskIds", diskIds);
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		putQueryParameter("InstanceId", instanceId);
	}

	public String getDiskType() {
		return this.diskType;
	}

	public void setDiskType(String diskType) {
		this.diskType = diskType;
		putQueryParameter("DiskType", diskType);
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		putQueryParameter("Category", category);
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		putQueryParameter("Status", status);
	}

	public String getSnapshotId() {
		return this.snapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
		putQueryParameter("SnapshotId", snapshotId);
	}

	public Boolean getPortable() {
		return this.portable;
	}

	public void setPortable(Boolean portable) {
		this.portable = portable;
		putQueryParameter("Portable", String.valueOf(portable));
	}

	public Boolean getDeleteWithInstance() {
		return this.deleteWithInstance;
	}

	public void setDeleteWithInstance(Boolean deleteWithInstance) {
		this.deleteWithInstance = deleteWithInstance;
		putQueryParameter("DeleteWithInstance", String.valueOf(deleteWithInstance));
	}

	public Boolean getDeleteAutoSnapshot() {
		return this.deleteAutoSnapshot;
	}

	public void setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
		this.deleteAutoSnapshot = deleteAutoSnapshot;
		putQueryParameter("DeleteAutoSnapshot", String.valueOf(deleteAutoSnapshot));
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

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	public String getDiskName() {
		return this.diskName;
	}

	public void setDiskName(String diskName) {
		this.diskName = diskName;
		putQueryParameter("DiskName", diskName);
	}

	public Boolean getEnableAutoSnapshot() {
		return this.enableAutoSnapshot;
	}

	public void setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
		this.enableAutoSnapshot = enableAutoSnapshot;
		putQueryParameter("EnableAutoSnapshot", String.valueOf(enableAutoSnapshot));
	}

	public String getDiskChargeType() {
		return this.diskChargeType;
	}

	public void setDiskChargeType(String diskChargeType) {
		this.diskChargeType = diskChargeType;
		putQueryParameter("DiskChargeType", diskChargeType);
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

	@Override
	public Class<DescribeDisksResponse> getResponseClass() {
		return DescribeDisksResponse.class;
	}

}
