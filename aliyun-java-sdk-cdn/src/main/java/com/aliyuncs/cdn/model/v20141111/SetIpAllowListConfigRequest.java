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
public class SetIpAllowListConfigRequest extends RpcAcsRequest<SetIpAllowListConfigResponse> {
	
	public SetIpAllowListConfigRequest() {
		super("Cdn", "2014-11-11", "SetIpAllowListConfig");
	}

	private String allowIps;

	private String securityToken;

	private String domainName;

	private Long ownerId;

	public String getAllowIps() {
		return this.allowIps;
	}

	public void setAllowIps(String allowIps) {
		this.allowIps = allowIps;
		if(allowIps != null){
			putQueryParameter("AllowIps", allowIps);
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

	@Override
	public Class<SetIpAllowListConfigResponse> getResponseClass() {
		return SetIpAllowListConfigResponse.class;
	}

}
