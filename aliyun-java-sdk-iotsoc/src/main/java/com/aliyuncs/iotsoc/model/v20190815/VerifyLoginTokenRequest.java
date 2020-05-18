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

package com.aliyuncs.iotsoc.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iotsoc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class VerifyLoginTokenRequest extends RpcAcsRequest<VerifyLoginTokenResponse> {
	   

	private String attestationToken;

	private String loginToken;
	public VerifyLoginTokenRequest() {
		super("Iotsoc", "2019-08-15", "VerifyLoginToken", "Iotsoc");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAttestationToken() {
		return this.attestationToken;
	}

	public void setAttestationToken(String attestationToken) {
		this.attestationToken = attestationToken;
		if(attestationToken != null){
			putBodyParameter("AttestationToken", attestationToken);
		}
	}

	public String getLoginToken() {
		return this.loginToken;
	}

	public void setLoginToken(String loginToken) {
		this.loginToken = loginToken;
		if(loginToken != null){
			putBodyParameter("LoginToken", loginToken);
		}
	}

	@Override
	public Class<VerifyLoginTokenResponse> getResponseClass() {
		return VerifyLoginTokenResponse.class;
	}

}
