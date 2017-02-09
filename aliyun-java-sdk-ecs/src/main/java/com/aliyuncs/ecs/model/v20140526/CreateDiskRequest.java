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
public class CreateDiskRequest extends RpcAcsRequest<CreateDiskResponse> {
	
	public CreateDiskRequest() {
		super("Ecs", "2014-05-26", "CreateDisk", "ecs");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String zoneId;

	private String snapshotId;

	private String diskName;

	private Integer size;

	private String diskCategory;

	private String description;

	private String clientToken;

	private String ownerAccount;

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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		putQueryParameter("ZoneId", zoneId);
	}

	public String getSnapshotId() {
		return this.snapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
		putQueryParameter("SnapshotId", snapshotId);
	}

	public String getDiskName() {
		return this.diskName;
	}

	public void setDiskName(String diskName) {
		this.diskName = diskName;
		putQueryParameter("DiskName", diskName);
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
		putQueryParameter("Size", size);
	}

	public String getDiskCategory() {
		return this.diskCategory;
	}

	public void setDiskCategory(String diskCategory) {
		this.diskCategory = diskCategory;
		putQueryParameter("DiskCategory", diskCategory);
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		putQueryParameter("Description", description);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		putQueryParameter("ClientToken", clientToken);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
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
	public Class<CreateDiskResponse> getResponseClass() {
		return CreateDiskResponse.class;
	}

}
