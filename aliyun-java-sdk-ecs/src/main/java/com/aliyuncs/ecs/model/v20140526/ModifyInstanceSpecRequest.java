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
public class ModifyInstanceSpecRequest extends RpcAcsRequest<ModifyInstanceSpecResponse> {
	
	public ModifyInstanceSpecRequest() {
		super("Ecs", "2014-05-26", "ModifyInstanceSpec", "ecs");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String instanceId;

	private String instanceType;

	private Integer internetMaxBandwidthOut;

	private Integer internetMaxBandwidthIn;

	private String ownerAccount;

	private String temporaryStartTime;

	private String temporaryEndTime;

	private Integer temporaryInternetMaxBandwidthOut;

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

	public Integer getInternetMaxBandwidthIn() {
		return this.internetMaxBandwidthIn;
	}

	public void setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
		this.internetMaxBandwidthIn = internetMaxBandwidthIn;
		putQueryParameter("InternetMaxBandwidthIn", internetMaxBandwidthIn);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	public String getTemporaryStartTime() {
		return this.temporaryStartTime;
	}

	public void setTemporaryStartTime(String temporaryStartTime) {
		this.temporaryStartTime = temporaryStartTime;
		putQueryParameter("Temporary.StartTime", temporaryStartTime);
	}

	public String getTemporaryEndTime() {
		return this.temporaryEndTime;
	}

	public void setTemporaryEndTime(String temporaryEndTime) {
		this.temporaryEndTime = temporaryEndTime;
		putQueryParameter("Temporary.EndTime", temporaryEndTime);
	}

	public Integer getTemporaryInternetMaxBandwidthOut() {
		return this.temporaryInternetMaxBandwidthOut;
	}

	public void setTemporaryInternetMaxBandwidthOut(Integer temporaryInternetMaxBandwidthOut) {
		this.temporaryInternetMaxBandwidthOut = temporaryInternetMaxBandwidthOut;
		putQueryParameter("Temporary.InternetMaxBandwidthOut", temporaryInternetMaxBandwidthOut);
	}

	@Override
	public Class<ModifyInstanceSpecResponse> getResponseClass() {
		return ModifyInstanceSpecResponse.class;
	}

}
