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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dcdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDcdnWafPolicyDomainsRequest extends RpcAcsRequest<ModifyDcdnWafPolicyDomainsResponse> {
	   

	private Long policyId;

	private String bindDomains;

	private String unbindDomains;

	private Long ownerId;
	public ModifyDcdnWafPolicyDomainsRequest() {
		super("dcdn", "2018-01-15", "ModifyDcdnWafPolicyDomains");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getPolicyId() {
		return this.policyId;
	}

	public void setPolicyId(Long policyId) {
		this.policyId = policyId;
		if(policyId != null){
			putBodyParameter("PolicyId", policyId.toString());
		}
	}

	public String getBindDomains() {
		return this.bindDomains;
	}

	public void setBindDomains(String bindDomains) {
		this.bindDomains = bindDomains;
		if(bindDomains != null){
			putBodyParameter("BindDomains", bindDomains);
		}
	}

	public String getUnbindDomains() {
		return this.unbindDomains;
	}

	public void setUnbindDomains(String unbindDomains) {
		this.unbindDomains = unbindDomains;
		if(unbindDomains != null){
			putBodyParameter("UnbindDomains", unbindDomains);
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
	public Class<ModifyDcdnWafPolicyDomainsResponse> getResponseClass() {
		return ModifyDcdnWafPolicyDomainsResponse.class;
	}

}
