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

package com.aliyuncs.scdn.model.v20171115;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.scdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BatchStopScdnDomainRequest extends RpcAcsRequest<BatchStopScdnDomainResponse> {
	   

	private String domainNames;

	private Long ownerId;

	private String securityToken;
	public BatchStopScdnDomainRequest() {
		super("scdn", "2017-11-15", "BatchStopScdnDomain");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDomainNames() {
		return this.domainNames;
	}

	public void setDomainNames(String domainNames) {
		this.domainNames = domainNames;
		if(domainNames != null){
			putQueryParameter("DomainNames", domainNames);
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

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	@Override
	public Class<BatchStopScdnDomainResponse> getResponseClass() {
		return BatchStopScdnDomainResponse.class;
	}

}
