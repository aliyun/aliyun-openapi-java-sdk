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

package com.aliyuncs.aas.model.v20150701;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAccessKeyForAccountRequest extends RpcAcsRequest<CreateAccessKeyForAccountResponse> {
	   

	private String aKSecret;

	private String pK;
	public CreateAccessKeyForAccountRequest() {
		super("Aas", "2015-07-01", "CreateAccessKeyForAccount");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAKSecret() {
		return this.aKSecret;
	}

	public void setAKSecret(String aKSecret) {
		this.aKSecret = aKSecret;
		if(aKSecret != null){
			putQueryParameter("AKSecret", aKSecret);
		}
	}

	public String getPK() {
		return this.pK;
	}

	public void setPK(String pK) {
		this.pK = pK;
		if(pK != null){
			putQueryParameter("PK", pK);
		}
	}

	@Override
	public Class<CreateAccessKeyForAccountResponse> getResponseClass() {
		return CreateAccessKeyForAccountResponse.class;
	}

}
