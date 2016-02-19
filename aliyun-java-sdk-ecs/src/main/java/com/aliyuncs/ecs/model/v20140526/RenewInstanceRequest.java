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
public class RenewInstanceRequest extends RpcAcsRequest<RenewInstanceResponse> {
	
	public RenewInstanceRequest() {
		super("Ecs", "2014-05-26", "RenewInstance");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String ownerAccount;

	private String instanceId;

	private String instanceType;

	private Integer internetMaxBandwidthOut;

	private String internetChargeType;

	private Integer period;

	private String rebootTime;

	private String covertDiskPortable1DiskId;

	private String covertDiskPortable2DiskId;

	private String covertDiskPortable3DiskId;

	private String covertDiskPortable4DiskId;

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

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		putQueryParameter("InstanceId", instanceId);
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		putQueryParameter("InstanceType", instanceType);
	}

	public Integer getInternetMaxBandwidthOut() {
		return this.internetMaxBandwidthOut;
	}

	public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
		this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
		putQueryParameter("InternetChargeType", internetChargeType);
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		putQueryParameter("Period", period);
	}

	public String getRebootTime() {
		return this.rebootTime;
	}

	public void setRebootTime(String rebootTime) {
		this.rebootTime = rebootTime;
		putQueryParameter("RebootTime", rebootTime);
	}

	public String getCovertDiskPortable1DiskId() {
		return this.covertDiskPortable1DiskId;
	}

	public void setCovertDiskPortable1DiskId(String covertDiskPortable1DiskId) {
		this.covertDiskPortable1DiskId = covertDiskPortable1DiskId;
		putQueryParameter("CovertDiskPortable.1.DiskId", covertDiskPortable1DiskId);
	}

	public String getCovertDiskPortable2DiskId() {
		return this.covertDiskPortable2DiskId;
	}

	public void setCovertDiskPortable2DiskId(String covertDiskPortable2DiskId) {
		this.covertDiskPortable2DiskId = covertDiskPortable2DiskId;
		putQueryParameter("CovertDiskPortable.2.DiskId", covertDiskPortable2DiskId);
	}

	public String getCovertDiskPortable3DiskId() {
		return this.covertDiskPortable3DiskId;
	}

	public void setCovertDiskPortable3DiskId(String covertDiskPortable3DiskId) {
		this.covertDiskPortable3DiskId = covertDiskPortable3DiskId;
		putQueryParameter("CovertDiskPortable.3.DiskId", covertDiskPortable3DiskId);
	}

	public String getCovertDiskPortable4DiskId() {
		return this.covertDiskPortable4DiskId;
	}

	public void setCovertDiskPortable4DiskId(String covertDiskPortable4DiskId) {
		this.covertDiskPortable4DiskId = covertDiskPortable4DiskId;
		putQueryParameter("CovertDiskPortable.4.DiskId", covertDiskPortable4DiskId);
	}

	@Override
	public Class<RenewInstanceResponse> getResponseClass() {
		return RenewInstanceResponse.class;
	}

}
