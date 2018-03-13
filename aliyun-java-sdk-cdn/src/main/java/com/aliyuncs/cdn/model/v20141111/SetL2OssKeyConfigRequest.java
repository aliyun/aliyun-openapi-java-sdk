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
public class SetL2OssKeyConfigRequest extends RpcAcsRequest<SetL2OssKeyConfigResponse> {
	
	public SetL2OssKeyConfigRequest() {
		super("Cdn", "2014-11-11", "SetL2OssKeyConfig");
	}

	private String securityToken;

	private String domainName;

	private Long ownerId;

	private String privateOssAuth;

	public String getSecurityToken() {
		return this.securityToken;
	}

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

	public String getPrivateOssAuth() {
		return this.privateOssAuth;
	}

	public void setPrivateOssAuth(String privateOssAuth) {
		this.privateOssAuth = privateOssAuth;
		if(privateOssAuth != null){
			putQueryParameter("PrivateOssAuth", privateOssAuth);
		}
	}

	@Override
	public Class<SetL2OssKeyConfigResponse> getResponseClass() {
		return SetL2OssKeyConfigResponse.class;
	}

}
