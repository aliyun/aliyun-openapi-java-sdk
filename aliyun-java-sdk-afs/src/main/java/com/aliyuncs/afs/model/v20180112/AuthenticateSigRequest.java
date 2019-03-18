/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.afs.model.v20180112;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class AuthenticateSigRequest extends RpcAcsRequest<AuthenticateSigResponse> {
	
	public AuthenticateSigRequest() {
		super("afs", "2018-01-12", "AuthenticateSig", "afs");
	}

	private String sig;

	private String remoteIp;

	private String sourceIp;

	private String appKey;

	private String sessionId;

	private String token;

	private String scene;

	public String getSig() {
		return this.sig;
	}

	public void setSig(String sig) {
		this.sig = sig;
		if(sig != null){
			putQueryParameter("Sig", sig);
		}
	}

	public String getRemoteIp() {
		return this.remoteIp;
	}

	public void setRemoteIp(String remoteIp) {
		this.remoteIp = remoteIp;
		if(remoteIp != null){
			putQueryParameter("RemoteIp", remoteIp);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
		if(appKey != null){
			putQueryParameter("AppKey", appKey);
		}
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
		if(sessionId != null){
			putQueryParameter("SessionId", sessionId);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public String getScene() {
		return this.scene;
	}

	public void setScene(String scene) {
		this.scene = scene;
		if(scene != null){
			putQueryParameter("Scene", scene);
		}
	}

	@Override
	public Class<AuthenticateSigResponse> getResponseClass() {
		return AuthenticateSigResponse.class;
	}

}
