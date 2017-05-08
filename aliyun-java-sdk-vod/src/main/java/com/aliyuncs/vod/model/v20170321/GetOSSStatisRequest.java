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
package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetOSSStatisRequest extends RpcAcsRequest<GetOSSStatisResponse> {
	
	public GetOSSStatisRequest() {
		super("vod", "2017-03-21", "GetOSSStatis");
	}

	private String ownerId;

	private String resourceOwnerId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String startStatisTime;

	private String endStatisTime;

	private String level;

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", ownerId);
	}

	public String getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(String resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		putQueryParameter("ResourceOwnerId", resourceOwnerId);
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	public String getStartStatisTime() {
		return this.startStatisTime;
	}

	public void setStartStatisTime(String startStatisTime) {
		this.startStatisTime = startStatisTime;
		putQueryParameter("StartStatisTime", startStatisTime);
	}

	public String getEndStatisTime() {
		return this.endStatisTime;
	}

	public void setEndStatisTime(String endStatisTime) {
		this.endStatisTime = endStatisTime;
		putQueryParameter("EndStatisTime", endStatisTime);
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
		putQueryParameter("Level", level);
	}

	@Override
	public Class<GetOSSStatisResponse> getResponseClass() {
		return GetOSSStatisResponse.class;
	}

}
