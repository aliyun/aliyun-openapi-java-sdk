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
package com.aliyuncs.push.model.v20150827;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class PushByteMessageRequest extends RpcAcsRequest<PushByteMessageResponse> {
	
	public PushByteMessageRequest() {
		super("Push", "2015-08-27", "PushByteMessage");
	}

	private Long appId;

	private Integer sendType;

	private String accounts;

	private String deviceIds;

	private String pushContent;

	public Long getAppId() {
		return this.appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
		putQueryParameter("AppId", appId);
	}

	public Integer getSendType() {
		return this.sendType;
	}

	public void setSendType(Integer sendType) {
		this.sendType = sendType;
		putQueryParameter("SendType", sendType);
	}

	public String getAccounts() {
		return this.accounts;
	}

	public void setAccounts(String accounts) {
		this.accounts = accounts;
		putQueryParameter("Accounts", accounts);
	}

	public String getDeviceIds() {
		return this.deviceIds;
	}

	public void setDeviceIds(String deviceIds) {
		this.deviceIds = deviceIds;
		putQueryParameter("DeviceIds", deviceIds);
	}

	public String getPushContent() {
		return this.pushContent;
	}

	public void setPushContent(String pushContent) {
		this.pushContent = pushContent;
		putQueryParameter("PushContent", pushContent);
	}

	@Override
	public Class<PushByteMessageResponse> getResponseClass() {
		return PushByteMessageResponse.class;
	}

}
