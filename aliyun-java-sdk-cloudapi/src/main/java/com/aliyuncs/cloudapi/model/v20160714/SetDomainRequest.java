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

package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetDomainRequest extends RpcAcsRequest<SetDomainResponse> {
	   

	private String groupId;

	private String domainName;

	private Boolean isHttpRedirectToHttps;

	private String customDomainType;

	private String bindStageName;

	private Boolean isForce;
	public SetDomainRequest() {
		super("CloudAPI", "2016-07-14", "SetDomain", "apigateway");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
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

	public Boolean getIsHttpRedirectToHttps() {
		return this.isHttpRedirectToHttps;
	}

	public void setIsHttpRedirectToHttps(Boolean isHttpRedirectToHttps) {
		this.isHttpRedirectToHttps = isHttpRedirectToHttps;
		if(isHttpRedirectToHttps != null){
			putQueryParameter("IsHttpRedirectToHttps", isHttpRedirectToHttps.toString());
		}
	}

	public String getCustomDomainType() {
		return this.customDomainType;
	}

	public void setCustomDomainType(String customDomainType) {
		this.customDomainType = customDomainType;
		if(customDomainType != null){
			putQueryParameter("CustomDomainType", customDomainType);
		}
	}

	public String getBindStageName() {
		return this.bindStageName;
	}

	public void setBindStageName(String bindStageName) {
		this.bindStageName = bindStageName;
		if(bindStageName != null){
			putQueryParameter("BindStageName", bindStageName);
		}
	}

	public Boolean getIsForce() {
		return this.isForce;
	}

	public void setIsForce(Boolean isForce) {
		this.isForce = isForce;
		if(isForce != null){
			putQueryParameter("IsForce", isForce.toString());
		}
	}

	@Override
	public Class<SetDomainResponse> getResponseClass() {
		return SetDomainResponse.class;
	}

}
