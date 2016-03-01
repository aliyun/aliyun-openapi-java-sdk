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
package com.aliyuncs.iot.model.v20160104;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class PushByteMessageRequest extends RpcAcsRequest<PushByteMessageResponse> {
	
	public PushByteMessageRequest() {
		super("Iot", "2016-01-04", "PushByteMessage");
	}

	private Long appKey;

	private String deviceIds;

	private String pushContent;

	public Long getAppKey() {
		return this.appKey;
	}

	public void setAppKey(Long appKey) {
		this.appKey = appKey;
		putQueryParameter("AppKey", appKey);
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
