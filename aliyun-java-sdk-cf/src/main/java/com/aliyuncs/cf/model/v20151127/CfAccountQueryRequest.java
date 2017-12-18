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
package com.aliyuncs.cf.model.v20151127;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class CfAccountQueryRequest extends RpcAcsRequest<CfAccountQueryResponse> {
	
	public CfAccountQueryRequest() {
		super("CF", "2015-11-27", "CfAccountQuery");
		setProtocol(ProtocolType.HTTPS);
	}

	private String appKey;

	private String sceneId;

	private String ip;

	private String phoneNumber;

	private String trans;

	private String cFTimestamp;

	private String appToken;

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
		putQueryParameter("AppKey", appKey);
	}

	public String getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
		putQueryParameter("SceneId", sceneId);
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		putQueryParameter("Ip", ip);
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		putQueryParameter("PhoneNumber", phoneNumber);
	}

	public String getTrans() {
		return this.trans;
	}

	public void setTrans(String trans) {
		this.trans = trans;
		putQueryParameter("Trans", trans);
	}

	public String getCFTimestamp() {
		return this.cFTimestamp;
	}

	public void setCFTimestamp(String cFTimestamp) {
		this.cFTimestamp = cFTimestamp;
		putQueryParameter("CFTimestamp", cFTimestamp);
	}

	public String getAppToken() {
		return this.appToken;
	}

	public void setAppToken(String appToken) {
		this.appToken = appToken;
		putQueryParameter("AppToken", appToken);
	}

	@Override
	public Class<CfAccountQueryResponse> getResponseClass() {
		return CfAccountQueryResponse.class;
	}

}
