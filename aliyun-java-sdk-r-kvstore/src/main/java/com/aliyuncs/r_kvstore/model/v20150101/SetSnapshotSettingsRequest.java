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
package com.aliyuncs.r_kvstore.model.v20150101;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SetSnapshotSettingsRequest extends RpcAcsRequest<SetSnapshotSettingsResponse> {
	
	public SetSnapshotSettingsRequest() {
		super("R-kvstore", "2015-01-01", "SetSnapshotSettings", "redisa");
	}

	private Long resourceOwnerId;

	private Integer endHour;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Integer dayList;

	private Long ownerId;

	private String instanceId;

	private Integer retentionDay;

	private Integer maxManualSnapshots;

	private Integer maxAutoSnapshots;

	private Integer beginHour;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Integer getEndHour() {
		return this.endHour;
	}

	public void setEndHour(Integer endHour) {
		this.endHour = endHour;
		if(endHour != null){
			putDomainParameter("EndHour", endHour.toString());
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

	public Integer getDayList() {
		return this.dayList;
	}

	public void setDayList(Integer dayList) {
		this.dayList = dayList;
		if(dayList != null){
			putDomainParameter("DayList", dayList.toString());
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putDomainParameter("InstanceId", instanceId);
		}
	}

	public Integer getRetentionDay() {
		return this.retentionDay;
	}

	public void setRetentionDay(Integer retentionDay) {
		this.retentionDay = retentionDay;
		if(retentionDay != null){
			putDomainParameter("RetentionDay", retentionDay.toString());
		}
	}

	public Integer getMaxManualSnapshots() {
		return this.maxManualSnapshots;
	}

	public void setMaxManualSnapshots(Integer maxManualSnapshots) {
		this.maxManualSnapshots = maxManualSnapshots;
		if(maxManualSnapshots != null){
			putDomainParameter("MaxManualSnapshots", maxManualSnapshots.toString());
		}
	}

	public Integer getMaxAutoSnapshots() {
		return this.maxAutoSnapshots;
	}

	public void setMaxAutoSnapshots(Integer maxAutoSnapshots) {
		this.maxAutoSnapshots = maxAutoSnapshots;
		if(maxAutoSnapshots != null){
			putDomainParameter("MaxAutoSnapshots", maxAutoSnapshots.toString());
		}
	}

	public Integer getBeginHour() {
		return this.beginHour;
	}

	public void setBeginHour(Integer beginHour) {
		this.beginHour = beginHour;
		if(beginHour != null){
			putDomainParameter("BeginHour", beginHour.toString());
		}
	}

	@Override
	public Class<SetSnapshotSettingsResponse> getResponseClass() {
		return SetSnapshotSettingsResponse.class;
	}

}
