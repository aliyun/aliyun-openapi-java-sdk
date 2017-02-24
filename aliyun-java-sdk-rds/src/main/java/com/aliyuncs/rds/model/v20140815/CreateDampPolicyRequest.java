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
package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateDampPolicyRequest extends RpcAcsRequest<CreateDampPolicyResponse> {
	
	public CreateDampPolicyRequest() {
		super("Rds", "2014-08-15", "CreateDampPolicy", "rds");
	}

	private String securityToken;

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String ownerAccount;

	private String dBInstanceId;

	private String policyName;

	private Integer priority;

	private String handlers;

	private String sourceRules;

	private String timeRules;

	private String actionRules;

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		putQueryParameter("SecurityToken", securityToken);
	}

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

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		putQueryParameter("DBInstanceId", dBInstanceId);
	}

	public String getPolicyName() {
		return this.policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
		putQueryParameter("PolicyName", policyName);
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
		putQueryParameter("Priority", priority);
	}

	public String getHandlers() {
		return this.handlers;
	}

	public void setHandlers(String handlers) {
		this.handlers = handlers;
		putQueryParameter("Handlers", handlers);
	}

	public String getSourceRules() {
		return this.sourceRules;
	}

	public void setSourceRules(String sourceRules) {
		this.sourceRules = sourceRules;
		putQueryParameter("SourceRules", sourceRules);
	}

	public String getTimeRules() {
		return this.timeRules;
	}

	public void setTimeRules(String timeRules) {
		this.timeRules = timeRules;
		putQueryParameter("TimeRules", timeRules);
	}

	public String getActionRules() {
		return this.actionRules;
	}

	public void setActionRules(String actionRules) {
		this.actionRules = actionRules;
		putQueryParameter("ActionRules", actionRules);
	}

	@Override
	public Class<CreateDampPolicyResponse> getResponseClass() {
		return CreateDampPolicyResponse.class;
	}

}
