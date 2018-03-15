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
public class SetSourceHostConfigRequest extends RpcAcsRequest<SetSourceHostConfigResponse> {
	
	public SetSourceHostConfigRequest() {
		super("Cdn", "2014-11-11", "SetSourceHostConfig");
	}

	private String securityToken;

	private String enable;

	private String domainName;

	private Long ownerId;

	private String backSrcDomain;

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getEnable() {
		return this.enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
		if(enable != null){
			putQueryParameter("Enable", enable);
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

	public String getBackSrcDomain() {
		return this.backSrcDomain;
	}

	public void setBackSrcDomain(String backSrcDomain) {
		this.backSrcDomain = backSrcDomain;
		if(backSrcDomain != null){
			putQueryParameter("BackSrcDomain", backSrcDomain);
		}
	}

	@Override
	public Class<SetSourceHostConfigResponse> getResponseClass() {
		return SetSourceHostConfigResponse.class;
	}

}
