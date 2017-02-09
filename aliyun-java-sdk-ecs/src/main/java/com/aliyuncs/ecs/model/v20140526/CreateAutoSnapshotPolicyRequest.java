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
public class CreateAutoSnapshotPolicyRequest extends RpcAcsRequest<CreateAutoSnapshotPolicyResponse> {
	
	public CreateAutoSnapshotPolicyRequest() {
		super("Ecs", "2014-05-26", "CreateAutoSnapshotPolicy", "ecs");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String autoSnapshotPolicyName;

	private String timePoints;

	private String repeatWeekdays;

	private Integer retentionDays;

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

	public String getautoSnapshotPolicyName() {
		return this.autoSnapshotPolicyName;
	}

	public void setautoSnapshotPolicyName(String autoSnapshotPolicyName) {
		this.autoSnapshotPolicyName = autoSnapshotPolicyName;
		putQueryParameter("autoSnapshotPolicyName", autoSnapshotPolicyName);
	}

	public String gettimePoints() {
		return this.timePoints;
	}

	public void settimePoints(String timePoints) {
		this.timePoints = timePoints;
		putQueryParameter("timePoints", timePoints);
	}

	public String getrepeatWeekdays() {
		return this.repeatWeekdays;
	}

	public void setrepeatWeekdays(String repeatWeekdays) {
		this.repeatWeekdays = repeatWeekdays;
		putQueryParameter("repeatWeekdays", repeatWeekdays);
	}

	public Integer getretentionDays() {
		return this.retentionDays;
	}

	public void setretentionDays(Integer retentionDays) {
		this.retentionDays = retentionDays;
		putQueryParameter("retentionDays", retentionDays);
	}

	@Override
	public Class<CreateAutoSnapshotPolicyResponse> getResponseClass() {
		return CreateAutoSnapshotPolicyResponse.class;
	}

}
