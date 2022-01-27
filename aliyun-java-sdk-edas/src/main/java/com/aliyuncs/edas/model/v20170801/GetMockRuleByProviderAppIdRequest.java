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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetMockRuleByProviderAppIdRequest extends RoaAcsRequest<GetMockRuleByProviderAppIdResponse> {
	   

	private String providerAppId;

	private String region;
	public GetMockRuleByProviderAppIdRequest() {
		super("Edas", "2017-08-01", "GetMockRuleByProviderAppId", "Edas");
		setUriPattern("/pop/sp/api/mock/getMockRuleByProviderAppId");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProviderAppId() {
		return this.providerAppId;
	}

	public void setProviderAppId(String providerAppId) {
		this.providerAppId = providerAppId;
		if(providerAppId != null){
			putQueryParameter("ProviderAppId", providerAppId);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	@Override
	public Class<GetMockRuleByProviderAppIdResponse> getResponseClass() {
		return GetMockRuleByProviderAppIdResponse.class;
	}

}
