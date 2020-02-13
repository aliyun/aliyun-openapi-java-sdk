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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetFileCacheExpiredConfigRequest extends RpcAcsRequest<SetFileCacheExpiredConfigResponse> {
	   

	private String securityToken;

	private String domainName;

	private String weight;

	private String cacheContent;

	private Long ownerId;

	private String tTL;
	public SetFileCacheExpiredConfigRequest() {
		super("Cdn", "2014-11-11", "SetFileCacheExpiredConfig");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
		if(weight != null){
			putQueryParameter("Weight", weight);
		}
	}

	public String getCacheContent() {
		return this.cacheContent;
	}

	public void setCacheContent(String cacheContent) {
		this.cacheContent = cacheContent;
		if(cacheContent != null){
			putQueryParameter("CacheContent", cacheContent);
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

	public String getTTL() {
		return this.tTL;
	}

	public void setTTL(String tTL) {
		this.tTL = tTL;
		if(tTL != null){
			putQueryParameter("TTL", tTL);
		}
	}

	@Override
	public Class<SetFileCacheExpiredConfigResponse> getResponseClass() {
		return SetFileCacheExpiredConfigResponse.class;
	}

}
