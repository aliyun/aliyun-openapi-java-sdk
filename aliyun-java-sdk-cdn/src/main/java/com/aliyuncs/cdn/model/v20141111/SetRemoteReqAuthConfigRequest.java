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

package com.aliyuncs.cdn.model.v20141111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SetRemoteReqAuthConfigRequest extends RpcAcsRequest<SetRemoteReqAuthConfigResponse> {
	
	public SetRemoteReqAuthConfigRequest() {
		super("Cdn", "2014-11-11", "SetRemoteReqAuthConfig");
	}

	private String authPath;

	private String domainName;

	private String authEnable;

	private Long ownerId;

	private String timeOut;

	private String authType;

	private String authProvider;

	private String securityToken;

	private String authCrash;

	private String authAddr;

	private String authFileType;

	public String getAuthPath() {
		return this.authPath;
	}

	public void setAuthPath(String authPath) {
		this.authPath = authPath;
		if(authPath != null){
			putQueryParameter("AuthPath", authPath);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public String getAuthEnable() {
		return this.authEnable;
	}

	public void setAuthEnable(String authEnable) {
		this.authEnable = authEnable;
		if(authEnable != null){
			putQueryParameter("AuthEnable", authEnable);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getTimeOut() {
		return this.timeOut;
	}

	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
		if(timeOut != null){
			putQueryParameter("TimeOut", timeOut);
		}
	}

	public String getAuthType() {
		return this.authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
		if(authType != null){
			putQueryParameter("AuthType", authType);
		}
	}

	public String getAuthProvider() {
		return this.authProvider;
	}

	public void setAuthProvider(String authProvider) {
		this.authProvider = authProvider;
		if(authProvider != null){
			putQueryParameter("AuthProvider", authProvider);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getAuthCrash() {
		return this.authCrash;
	}

	public void setAuthCrash(String authCrash) {
		this.authCrash = authCrash;
		if(authCrash != null){
			putQueryParameter("AuthCrash", authCrash);
		}
	}

	public String getAuthAddr() {
		return this.authAddr;
	}

	public void setAuthAddr(String authAddr) {
		this.authAddr = authAddr;
		if(authAddr != null){
			putQueryParameter("AuthAddr", authAddr);
		}
	}

	public String getAuthFileType() {
		return this.authFileType;
	}

	public void setAuthFileType(String authFileType) {
		this.authFileType = authFileType;
		if(authFileType != null){
			putQueryParameter("AuthFileType", authFileType);
		}
	}

	@Override
	public Class<SetRemoteReqAuthConfigResponse> getResponseClass() {
		return SetRemoteReqAuthConfigResponse.class;
	}

}
