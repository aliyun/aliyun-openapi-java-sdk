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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.baas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAntChainKmsAccountNewRequest extends RpcAcsRequest<CreateAntChainKmsAccountNewResponse> {
	   

	private String antChainId;

	private String account;
	public CreateAntChainKmsAccountNewRequest() {
		super("Baas", "2018-12-21", "CreateAntChainKmsAccountNew", "baas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAntChainId() {
		return this.antChainId;
	}

	public void setAntChainId(String antChainId) {
		this.antChainId = antChainId;
		if(antChainId != null){
			putBodyParameter("AntChainId", antChainId);
		}
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
		if(account != null){
			putBodyParameter("Account", account);
		}
	}

	@Override
	public Class<CreateAntChainKmsAccountNewResponse> getResponseClass() {
		return CreateAntChainKmsAccountNewResponse.class;
	}

}
