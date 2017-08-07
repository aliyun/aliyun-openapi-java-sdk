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
package com.aliyuncs.push.model.v20160801;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UnbindAliasRequest extends RpcAcsRequest<UnbindAliasResponse> {
	
	public UnbindAliasRequest() {
		super("Push", "2016-08-01", "UnbindAlias");
	}

	private String aliasName;

	private Long appKey;

	private String deviceId;

	private Boolean unbindAll;

	public String getAliasName() {
		return this.aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
		if(aliasName != null){
			putQueryParameter("AliasName", aliasName);
		}
	}

	public Long getAppKey() {
		return this.appKey;
	}

	public void setAppKey(Long appKey) {
		this.appKey = appKey;
		if(appKey != null){
			putQueryParameter("AppKey", appKey.toString());
		}
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		if(deviceId != null){
			putQueryParameter("DeviceId", deviceId);
		}
	}

	public Boolean getUnbindAll() {
		return this.unbindAll;
	}

	public void setUnbindAll(Boolean unbindAll) {
		this.unbindAll = unbindAll;
		if(unbindAll != null){
			putQueryParameter("UnbindAll", unbindAll.toString());
		}
	}

	@Override
	public Class<UnbindAliasResponse> getResponseClass() {
		return UnbindAliasResponse.class;
	}

}
