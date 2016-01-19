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
package com.aliyuncs.ess.model.v20140828;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateScheduledTaskRequest extends RpcAcsRequest<CreateScheduledTaskResponse> {
	
	public CreateScheduledTaskRequest() {
		super("Ess", "2014-08-28", "CreateScheduledTask");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String scheduledTaskName;

	private String description;

	private String scheduledAction;

	private String recurrenceEndTime;

	private String launchTime;

	private String recurrenceType;

	private String recurrenceValue;

	private Boolean taskEnabled;

	private Integer launchExpirationTime;

	private String ownerAccount;

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

	public String getScheduledTaskName() {
		return this.scheduledTaskName;
	}

	public void setScheduledTaskName(String scheduledTaskName) {
		this.scheduledTaskName = scheduledTaskName;
		putQueryParameter("ScheduledTaskName", scheduledTaskName);
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		putQueryParameter("Description", description);
	}

	public String getScheduledAction() {
		return this.scheduledAction;
	}

	public void setScheduledAction(String scheduledAction) {
		this.scheduledAction = scheduledAction;
		putQueryParameter("ScheduledAction", scheduledAction);
	}

	public String getRecurrenceEndTime() {
		return this.recurrenceEndTime;
	}

	public void setRecurrenceEndTime(String recurrenceEndTime) {
		this.recurrenceEndTime = recurrenceEndTime;
		putQueryParameter("RecurrenceEndTime", recurrenceEndTime);
	}

	public String getLaunchTime() {
		return this.launchTime;
	}

	public void setLaunchTime(String launchTime) {
		this.launchTime = launchTime;
		putQueryParameter("LaunchTime", launchTime);
	}

	public String getRecurrenceType() {
		return this.recurrenceType;
	}

	public void setRecurrenceType(String recurrenceType) {
		this.recurrenceType = recurrenceType;
		putQueryParameter("RecurrenceType", recurrenceType);
	}

	public String getRecurrenceValue() {
		return this.recurrenceValue;
	}

	public void setRecurrenceValue(String recurrenceValue) {
		this.recurrenceValue = recurrenceValue;
		putQueryParameter("RecurrenceValue", recurrenceValue);
	}

	public Boolean getTaskEnabled() {
		return this.taskEnabled;
	}

	public void setTaskEnabled(Boolean taskEnabled) {
		this.taskEnabled = taskEnabled;
		putQueryParameter("TaskEnabled", taskEnabled);
	}

	public Integer getLaunchExpirationTime() {
		return this.launchExpirationTime;
	}

	public void setLaunchExpirationTime(Integer launchExpirationTime) {
		this.launchExpirationTime = launchExpirationTime;
		putQueryParameter("LaunchExpirationTime", launchExpirationTime);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	@Override
	public Class<CreateScheduledTaskResponse> getResponseClass() {
		return CreateScheduledTaskResponse.class;
	}

}
