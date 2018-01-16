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
package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SubmitFacerecogJobRequest extends RpcAcsRequest<SubmitFacerecogJobResponse> {
	
	public SubmitFacerecogJobRequest() {
		super("Mts", "2014-06-18", "SubmitFacerecogJob", "mts");
	}

	private String input;

	private String userData;

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String facerecogConfig;

	private String pipelineId;

	public String getInput() {
		return this.input;
	}

	public void setInput(String input) {
		this.input = input;
		if(input != null){
			putQueryParameter("Input", input);
		}
	}

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getFacerecogConfig() {
		return this.facerecogConfig;
	}

	public void setFacerecogConfig(String facerecogConfig) {
		this.facerecogConfig = facerecogConfig;
		if(facerecogConfig != null){
			putQueryParameter("FacerecogConfig", facerecogConfig);
		}
	}

	public String getPipelineId() {
		return this.pipelineId;
	}

	public void setPipelineId(String pipelineId) {
		this.pipelineId = pipelineId;
		if(pipelineId != null){
			putQueryParameter("PipelineId", pipelineId);
		}
	}

	@Override
	public Class<SubmitFacerecogJobResponse> getResponseClass() {
		return SubmitFacerecogJobResponse.class;
	}

}
