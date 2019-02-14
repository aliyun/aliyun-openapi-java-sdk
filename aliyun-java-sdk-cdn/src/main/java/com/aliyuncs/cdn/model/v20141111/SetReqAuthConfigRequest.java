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
public class SetReqAuthConfigRequest extends RpcAcsRequest<SetReqAuthConfigResponse> {
	
	public SetReqAuthConfigRequest() {
		super("Cdn", "2014-11-11", "SetReqAuthConfig");
	}

	private String key1;

	private String key2;

	private String authRemoteDesc;

	private String securityToken;

	private String domainName;

	private Long ownerId;

	private String timeOut;

	private String authType;

	public String getKey1() {
		return this.key1;
	}

	public void setKey1(String key1) {
		this.key1 = key1;
		if(key1 != null){
			putQueryParameter("Key1", key1);
		}
	}

	public String getKey2() {
		return this.key2;
	}

	public void setKey2(String key2) {
		this.key2 = key2;
		if(key2 != null){
			putQueryParameter("Key2", key2);
		}
	}

	public String getAuthRemoteDesc() {
		return this.authRemoteDesc;
	}

	public void setAuthRemoteDesc(String authRemoteDesc) {
		this.authRemoteDesc = authRemoteDesc;
		if(authRemoteDesc != null){
			putQueryParameter("AuthRemoteDesc", authRemoteDesc);
		}
	}

	public String getBizSecurityToken() {
		return this.securityToken;
	}

	public void setBizSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	/**
	 * @deprecated use getBizSecurityToken instead of this.
	 */
	@Deprecated
	public String getSecurityToken() {
		return this.securityToken;
	}

	/**
	 * @deprecated use setBizSecurityToken instead of this.
	 */
	@Deprecated
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
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

	@Override
	public Class<SetReqAuthConfigResponse> getResponseClass() {
		return SetReqAuthConfigResponse.class;
	}

}
