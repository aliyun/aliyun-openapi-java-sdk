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

package com.aliyuncs.idaas_doraemon.model.v20210520;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.idaas_doraemon.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class VerifyIdTokenRequest extends RpcAcsRequest<VerifyIdTokenResponse> {
	   

	private String jwtIdToken;

	private String applicationExternalId;
	public VerifyIdTokenRequest() {
		super("idaas-doraemon", "2021-05-20", "VerifyIdToken");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getJwtIdToken() {
		return this.jwtIdToken;
	}

	public void setJwtIdToken(String jwtIdToken) {
		this.jwtIdToken = jwtIdToken;
		if(jwtIdToken != null){
			putQueryParameter("JwtIdToken", jwtIdToken);
		}
	}

	public String getApplicationExternalId() {
		return this.applicationExternalId;
	}

	public void setApplicationExternalId(String applicationExternalId) {
		this.applicationExternalId = applicationExternalId;
		if(applicationExternalId != null){
			putQueryParameter("ApplicationExternalId", applicationExternalId);
		}
	}

	@Override
	public Class<VerifyIdTokenResponse> getResponseClass() {
		return VerifyIdTokenResponse.class;
	}

}
