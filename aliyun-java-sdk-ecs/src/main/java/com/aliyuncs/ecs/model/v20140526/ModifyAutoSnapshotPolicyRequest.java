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
public class ModifyAutoSnapshotPolicyRequest extends RpcAcsRequest<ModifyAutoSnapshotPolicyResponse> {
	
	public ModifyAutoSnapshotPolicyRequest() {
		super("Ecs", "2014-05-26", "ModifyAutoSnapshotPolicy");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private Boolean systemDiskPolicyEnabled;

	private Integer systemDiskPolicyTimePeriod;

	private Integer systemDiskPolicyRetentionDays;

	private Boolean systemDiskPolicyRetentionLastWeek;

	private Boolean dataDiskPolicyEnabled;

	private Integer dataDiskPolicyTimePeriod;

	private Integer dataDiskPolicyRetentionDays;

	private Boolean dataDiskPolicyRetentionLastWeek;

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

	public Boolean getSystemDiskPolicyEnabled() {
		return this.systemDiskPolicyEnabled;
	}

	public void setSystemDiskPolicyEnabled(Boolean systemDiskPolicyEnabled) {
		this.systemDiskPolicyEnabled = systemDiskPolicyEnabled;
		putQueryParameter("SystemDiskPolicyEnabled", String.valueOf(systemDiskPolicyEnabled));
	}

	public Integer getSystemDiskPolicyTimePeriod() {
		return this.systemDiskPolicyTimePeriod;
	}

	public void setSystemDiskPolicyTimePeriod(Integer systemDiskPolicyTimePeriod) {
		this.systemDiskPolicyTimePeriod = systemDiskPolicyTimePeriod;
		putQueryParameter("SystemDiskPolicyTimePeriod", String.valueOf(systemDiskPolicyTimePeriod));
	}

	public Integer getSystemDiskPolicyRetentionDays() {
		return this.systemDiskPolicyRetentionDays;
	}

	public void setSystemDiskPolicyRetentionDays(Integer systemDiskPolicyRetentionDays) {
		this.systemDiskPolicyRetentionDays = systemDiskPolicyRetentionDays;
		putQueryParameter("SystemDiskPolicyRetentionDays", String.valueOf(systemDiskPolicyRetentionDays));
	}

	public Boolean getSystemDiskPolicyRetentionLastWeek() {
		return this.systemDiskPolicyRetentionLastWeek;
	}

	public void setSystemDiskPolicyRetentionLastWeek(Boolean systemDiskPolicyRetentionLastWeek) {
		this.systemDiskPolicyRetentionLastWeek = systemDiskPolicyRetentionLastWeek;
		putQueryParameter("SystemDiskPolicyRetentionLastWeek", String.valueOf(systemDiskPolicyRetentionLastWeek));
	}

	public Boolean getDataDiskPolicyEnabled() {
		return this.dataDiskPolicyEnabled;
	}

	public void setDataDiskPolicyEnabled(Boolean dataDiskPolicyEnabled) {
		this.dataDiskPolicyEnabled = dataDiskPolicyEnabled;
		putQueryParameter("DataDiskPolicyEnabled", String.valueOf(dataDiskPolicyEnabled));
	}

	public Integer getDataDiskPolicyTimePeriod() {
		return this.dataDiskPolicyTimePeriod;
	}

	public void setDataDiskPolicyTimePeriod(Integer dataDiskPolicyTimePeriod) {
		this.dataDiskPolicyTimePeriod = dataDiskPolicyTimePeriod;
		putQueryParameter("DataDiskPolicyTimePeriod", String.valueOf(dataDiskPolicyTimePeriod));
	}

	public Integer getDataDiskPolicyRetentionDays() {
		return this.dataDiskPolicyRetentionDays;
	}

	public void setDataDiskPolicyRetentionDays(Integer dataDiskPolicyRetentionDays) {
		this.dataDiskPolicyRetentionDays = dataDiskPolicyRetentionDays;
		putQueryParameter("DataDiskPolicyRetentionDays", String.valueOf(dataDiskPolicyRetentionDays));
	}

	public Boolean getDataDiskPolicyRetentionLastWeek() {
		return this.dataDiskPolicyRetentionLastWeek;
	}

	public void setDataDiskPolicyRetentionLastWeek(Boolean dataDiskPolicyRetentionLastWeek) {
		this.dataDiskPolicyRetentionLastWeek = dataDiskPolicyRetentionLastWeek;
		putQueryParameter("DataDiskPolicyRetentionLastWeek", String.valueOf(dataDiskPolicyRetentionLastWeek));
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	@Override
	public Class<ModifyAutoSnapshotPolicyResponse> getResponseClass() {
		return ModifyAutoSnapshotPolicyResponse.class;
	}

}
