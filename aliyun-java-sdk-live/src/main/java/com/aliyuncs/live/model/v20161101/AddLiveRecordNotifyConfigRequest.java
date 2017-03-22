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
package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class AddLiveRecordNotifyConfigRequest extends RpcAcsRequest<AddLiveRecordNotifyConfigResponse> {
	
	public AddLiveRecordNotifyConfigRequest() {
		super("live", "2016-11-01", "AddLiveRecordNotifyConfig", "live");
	}

	private String securityToken;

	private Long ownerId;

	private String domainName;

	private String notifyUrl;

	private Boolean needStatusNotify;

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

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		putQueryParameter("DomainName", domainName);
	}

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
		putQueryParameter("NotifyUrl", notifyUrl);
	}

	public Boolean getNeedStatusNotify() {
		return this.needStatusNotify;
	}

	public void setNeedStatusNotify(Boolean needStatusNotify) {
		this.needStatusNotify = needStatusNotify;
		putQueryParameter("NeedStatusNotify", needStatusNotify);
	}

	@Override
	public Class<AddLiveRecordNotifyConfigResponse> getResponseClass() {
		return AddLiveRecordNotifyConfigResponse.class;
	}

}
