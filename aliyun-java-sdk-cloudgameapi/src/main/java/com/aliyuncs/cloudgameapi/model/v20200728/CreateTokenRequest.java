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
public class CreateTokenRequest extends RpcAcsRequest<CreateTokenResponse> {
	   

	private String clientToken;

	private String session;

	private String currentToken;
	public CreateTokenRequest() {
		super("CloudGameAPI", "2020-07-28", "CreateToken");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getSession() {
		return this.session;
	}

	public void setSession(String session) {
		this.session = session;
		if(session != null){
			putQueryParameter("Session", session);
		}
	}

	public String getCurrentToken() {
		return this.currentToken;
	}

	public void setCurrentToken(String currentToken) {
		this.currentToken = currentToken;
		if(currentToken != null){
			putQueryParameter("CurrentToken", currentToken);
		}
	}

	@Override
	public Class<CreateTokenResponse> getResponseClass() {
		return CreateTokenResponse.class;
	}

}
