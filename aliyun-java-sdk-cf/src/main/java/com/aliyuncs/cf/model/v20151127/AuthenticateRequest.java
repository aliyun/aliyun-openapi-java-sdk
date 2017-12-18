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
public class AuthenticateRequest extends RpcAcsRequest<AuthenticateResponse> {
	
	public AuthenticateRequest() {
		super("CF", "2015-11-27", "Authenticate");
		setProtocol(ProtocolType.HTTPS);
	}

	private String serno;

	private String token;

	private String sessionId;

	private String remoteIp;

	private String sig;

	private String appKey;

	private String sceneId;

	public String getSerno() {
		return this.serno;
	}

	public void setSerno(String serno) {
		this.serno = serno;
		putQueryParameter("Serno", serno);
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		putQueryParameter("Token", token);
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
		putQueryParameter("SessionId", sessionId);
	}

	public String getRemoteIp() {
		return this.remoteIp;
	}

	public void setRemoteIp(String remoteIp) {
		this.remoteIp = remoteIp;
		putQueryParameter("RemoteIp", remoteIp);
	}

	public String getSig() {
		return this.sig;
	}

	public void setSig(String sig) {
		this.sig = sig;
		putQueryParameter("Sig", sig);
	}

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

	@Override
	public Class<AuthenticateResponse> getResponseClass() {
		return AuthenticateResponse.class;
	}

}
