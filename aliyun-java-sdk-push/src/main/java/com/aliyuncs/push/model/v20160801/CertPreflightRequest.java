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
public class CertPreflightRequest extends RpcAcsRequest<CertPreflightResponse> {
	
	public CertPreflightRequest() {
		super("Push", "2016-08-01", "CertPreflight");
	}

	private Long appKey;

	private String deviceToken;

	private String pass;

	private String body;

	private Boolean isDevCert;

	public Long getAppKey() {
		return this.appKey;
	}

	public void setAppKey(Long appKey) {
		this.appKey = appKey;
		putQueryParameter("AppKey", appKey);
	}

	public String getDeviceToken() {
		return this.deviceToken;
	}

	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
		putQueryParameter("DeviceToken", deviceToken);
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
		putQueryParameter("Pass", pass);
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		putQueryParameter("Body", body);
	}

	public Boolean getIsDevCert() {
		return this.isDevCert;
	}

	public void setIsDevCert(Boolean isDevCert) {
		this.isDevCert = isDevCert;
		putQueryParameter("IsDevCert", isDevCert);
	}

	@Override
	public Class<CertPreflightResponse> getResponseClass() {
		return CertPreflightResponse.class;
	}

}
