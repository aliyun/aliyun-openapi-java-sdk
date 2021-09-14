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

package com.aliyuncs.emas_dmp.model.v20210402;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.emas_dmp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTargetAudienceByTagRequest extends RpcAcsRequest<CreateTargetAudienceByTagResponse> {
	   

	private String accountId;

	private String clientToken;

	private String accountType;

	private String name;

	private String unTags;

	private String businessScenario;

	private String tags;
	public CreateTargetAudienceByTagRequest() {
		super("emas-dmp", "2021-04-02", "CreateTargetAudienceByTag");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
		if(accountId != null){
			putBodyParameter("AccountId", accountId);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
		if(accountType != null){
			putBodyParameter("AccountType", accountType);
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

	public String getUnTags() {
		return this.unTags;
	}

	public void setUnTags(String unTags) {
		this.unTags = unTags;
		if(unTags != null){
			putBodyParameter("UnTags", unTags);
		}
	}

	public String getBusinessScenario() {
		return this.businessScenario;
	}

	public void setBusinessScenario(String businessScenario) {
		this.businessScenario = businessScenario;
		if(businessScenario != null){
			putBodyParameter("BusinessScenario", businessScenario);
		}
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putBodyParameter("Tags", tags);
		}
	}

	@Override
	public Class<CreateTargetAudienceByTagResponse> getResponseClass() {
		return CreateTargetAudienceByTagResponse.class;
	}

}
