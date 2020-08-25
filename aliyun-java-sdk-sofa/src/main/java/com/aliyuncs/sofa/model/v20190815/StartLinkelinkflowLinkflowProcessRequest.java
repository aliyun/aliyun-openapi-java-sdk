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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class StartLinkelinkflowLinkflowProcessRequest extends RpcAcsRequest<StartLinkelinkflowLinkflowProcessResponse> {
	   

	private String tenantId;

	private String outcome;

	private String params;

	private String bizId;

	private String name;

	private String definitionKey;

	private String startUserId;
	public StartLinkelinkflowLinkflowProcessRequest() {
		super("SOFA", "2019-08-15", "StartLinkelinkflowLinkflowProcess", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getOutcome() {
		return this.outcome;
	}

	public void setOutcome(String outcome) {
		this.outcome = outcome;
		if(outcome != null){
			putBodyParameter("Outcome", outcome);
		}
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
		if(params != null){
			putBodyParameter("Params", params);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putBodyParameter("BizId", bizId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getDefinitionKey() {
		return this.definitionKey;
	}

	public void setDefinitionKey(String definitionKey) {
		this.definitionKey = definitionKey;
		if(definitionKey != null){
			putBodyParameter("DefinitionKey", definitionKey);
		}
	}

	public String getStartUserId() {
		return this.startUserId;
	}

	public void setStartUserId(String startUserId) {
		this.startUserId = startUserId;
		if(startUserId != null){
			putBodyParameter("StartUserId", startUserId);
		}
	}

	@Override
	public Class<StartLinkelinkflowLinkflowProcessResponse> getResponseClass() {
		return StartLinkelinkflowLinkflowProcessResponse.class;
	}

}
