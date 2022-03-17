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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateOrUpdateSilencePolicyRequest extends RpcAcsRequest<CreateOrUpdateSilencePolicyResponse> {
	   

	private String name;

	private Long id;

	private String matchingRules;
	public CreateOrUpdateSilencePolicyRequest() {
		super("ARMS", "2019-08-08", "CreateOrUpdateSilencePolicy", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public String getMatchingRules() {
		return this.matchingRules;
	}

	public void setMatchingRules(String matchingRules) {
		this.matchingRules = matchingRules;
		if(matchingRules != null){
			putBodyParameter("MatchingRules", matchingRules);
		}
	}

	@Override
	public Class<CreateOrUpdateSilencePolicyResponse> getResponseClass() {
		return CreateOrUpdateSilencePolicyResponse.class;
	}

}
