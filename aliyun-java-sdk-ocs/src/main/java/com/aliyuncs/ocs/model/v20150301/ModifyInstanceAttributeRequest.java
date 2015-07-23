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
package com.aliyuncs.ocs.model.v20150301;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyInstanceAttributeRequest extends RpcAcsRequest<ModifyInstanceAttributeResponse> {
	
	public ModifyInstanceAttributeRequest() {
		super("Ocs", "2015-03-01", "ModifyInstanceAttribute");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String ownerAccount;

	private String ocsInstanceId;

	private String ocsInstanceName;

	private String oldPassword;

	private String newPassword;

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

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	public String getOcsInstanceId() {
		return this.ocsInstanceId;
	}

	public void setOcsInstanceId(String ocsInstanceId) {
		this.ocsInstanceId = ocsInstanceId;
		putQueryParameter("OcsInstanceId", ocsInstanceId);
	}

	public String getOcsInstanceName() {
		return this.ocsInstanceName;
	}

	public void setOcsInstanceName(String ocsInstanceName) {
		this.ocsInstanceName = ocsInstanceName;
		putQueryParameter("OcsInstanceName", ocsInstanceName);
	}

	public String getOldPassword() {
		return this.oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
		putQueryParameter("OldPassword", oldPassword);
	}

	public String getNewPassword() {
		return this.newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
		putQueryParameter("NewPassword", newPassword);
	}

	@Override
	public Class<ModifyInstanceAttributeResponse> getResponseClass() {
		return ModifyInstanceAttributeResponse.class;
	}

}
