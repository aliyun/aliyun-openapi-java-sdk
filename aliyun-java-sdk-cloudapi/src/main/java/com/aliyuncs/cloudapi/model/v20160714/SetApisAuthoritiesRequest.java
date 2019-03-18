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
package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SetApisAuthoritiesRequest extends RpcAcsRequest<SetApisAuthoritiesResponse> {
	
	public SetApisAuthoritiesRequest() {
		super("CloudAPI", "2016-07-14", "SetApisAuthorities", "apigateway");
	}

	private String groupId;

	private Long appId;

	private String stageName;

	private String apiIds;

	private String description;

	private String authValidTime;

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		putQueryParameter("GroupId", groupId);
	}

	public Long getAppId() {
		return this.appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
		putQueryParameter("AppId", appId);
	}

	public String getStageName() {
		return this.stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
		putQueryParameter("StageName", stageName);
	}

	public String getApiIds() {
		return this.apiIds;
	}

	public void setApiIds(String apiIds) {
		this.apiIds = apiIds;
		putQueryParameter("ApiIds", apiIds);
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		putQueryParameter("Description", description);
	}

	public String getAuthValidTime() {
		return authValidTime;
	}

	public void setAuthValidTime(String authValidTime) {
		this.authValidTime = authValidTime;
		putQueryParameter("AuthValidTime", authValidTime);
	}

	@Override
	public Class<SetApisAuthoritiesResponse> getResponseClass() {
		return SetApisAuthoritiesResponse.class;
	}

}
