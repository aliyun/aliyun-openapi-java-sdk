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

package com.aliyuncs.dcdn.model.v20180115;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateDcdnDomainRequest extends RpcAcsRequest<UpdateDcdnDomainResponse> {
	
	public UpdateDcdnDomainRequest() {
		super("dcdn", "2018-01-15", "UpdateDcdnDomain", "dcdn");
	}

	private String topLevelDomain;

	private String resourceGroupId;

	private String sources;

	private String securityToken;

	private String domainName;

	private Long ownerId;

	public String getTopLevelDomain() {
		return this.topLevelDomain;
	}

	public void setTopLevelDomain(String topLevelDomain) {
		this.topLevelDomain = topLevelDomain;
		if(topLevelDomain != null){
			putQueryParameter("TopLevelDomain", topLevelDomain);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getSources() {
		return this.sources;
	}

	public void setSources(String sources) {
		this.sources = sources;
		if(sources != null){
			putQueryParameter("Sources", sources);
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
	public Class<UpdateDcdnDomainResponse> getResponseClass() {
		return UpdateDcdnDomainResponse.class;
	}

}
