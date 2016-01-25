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
public class DeviceRevokeByIdRequest extends RpcAcsRequest<DeviceRevokeByIdResponse> {
	
	public DeviceRevokeByIdRequest() {
		super("Iot", "2016-01-04", "DeviceRevokeById");
	}

	private Long appKey;

	private Long ruleId;

	private String deviceId;

	public Long getAppKey() {
		return this.appKey;
	}

	public void setAppKey(Long appKey) {
		this.appKey = appKey;
		putQueryParameter("AppKey", appKey);
	}

	public Long getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
		putQueryParameter("RuleId", ruleId);
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		putQueryParameter("DeviceId", deviceId);
	}

	@Override
	public Class<DeviceRevokeByIdResponse> getResponseClass() {
		return DeviceRevokeByIdResponse.class;
	}

}
