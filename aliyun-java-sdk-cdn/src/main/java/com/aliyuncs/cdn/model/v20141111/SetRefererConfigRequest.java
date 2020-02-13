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
public class SetRefererConfigRequest extends RpcAcsRequest<SetRefererConfigResponse> {
	   

	private String referList;

	private String securityToken;

	private String referType;

	private String disableAst;

	private String domainName;

	private Long ownerId;

	private String allowEmpty;
	public SetRefererConfigRequest() {
		super("Cdn", "2014-11-11", "SetRefererConfig");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getReferList() {
		return this.referList;
	}

	public void setReferList(String referList) {
		this.referList = referList;
		if(referList != null){
			putQueryParameter("ReferList", referList);
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

	public String getReferType() {
		return this.referType;
	}

	public void setReferType(String referType) {
		this.referType = referType;
		if(referType != null){
			putQueryParameter("ReferType", referType);
		}
	}

	public String getDisableAst() {
		return this.disableAst;
	}

	public void setDisableAst(String disableAst) {
		this.disableAst = disableAst;
		if(disableAst != null){
			putQueryParameter("DisableAst", disableAst);
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

	public String getAllowEmpty() {
		return this.allowEmpty;
	}

	public void setAllowEmpty(String allowEmpty) {
		this.allowEmpty = allowEmpty;
		if(allowEmpty != null){
			putQueryParameter("AllowEmpty", allowEmpty);
		}
	}

	@Override
	public Class<SetRefererConfigResponse> getResponseClass() {
		return SetRefererConfigResponse.class;
	}

}
