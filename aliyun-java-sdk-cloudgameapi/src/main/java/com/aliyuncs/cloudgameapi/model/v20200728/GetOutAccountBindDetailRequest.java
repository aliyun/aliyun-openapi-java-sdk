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

package com.aliyuncs.cloudgameapi.model.v20200728;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudgameapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetOutAccountBindDetailRequest extends RpcAcsRequest<GetOutAccountBindDetailResponse> {
	   

	private String accountDomain;

	private String outAccountType;

	private String accountId;
	public GetOutAccountBindDetailRequest() {
		super("CloudGameAPI", "2020-07-28", "GetOutAccountBindDetail");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAccountDomain() {
		return this.accountDomain;
	}

	public void setAccountDomain(String accountDomain) {
		this.accountDomain = accountDomain;
		if(accountDomain != null){
			putQueryParameter("AccountDomain", accountDomain);
		}
	}

	public String getOutAccountType() {
		return this.outAccountType;
	}

	public void setOutAccountType(String outAccountType) {
		this.outAccountType = outAccountType;
		if(outAccountType != null){
			putQueryParameter("OutAccountType", outAccountType);
		}
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
		if(accountId != null){
			putQueryParameter("AccountId", accountId);
		}
	}

	@Override
	public Class<GetOutAccountBindDetailResponse> getResponseClass() {
		return GetOutAccountBindDetailResponse.class;
	}

}
