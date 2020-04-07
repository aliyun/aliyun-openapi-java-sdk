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

package com.aliyuncs.hbr.model.v20170908;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ActivateEcsClientRequest extends RpcAcsRequest<ActivateEcsClientResponse> {
	   

	private String clientId;

	private String vaultId;

	private String akId;

	private String token;

	private String akSecret;
	public ActivateEcsClientRequest() {
		super("hbr", "2017-09-08", "ActivateEcsClient", "hbr");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
		if(clientId != null){
			putQueryParameter("ClientId", clientId);
		}
	}

	public String getVaultId() {
		return this.vaultId;
	}

	public void setVaultId(String vaultId) {
		this.vaultId = vaultId;
		if(vaultId != null){
			putQueryParameter("VaultId", vaultId);
		}
	}

	public String getAkId() {
		return this.akId;
	}

	public void setAkId(String akId) {
		this.akId = akId;
		if(akId != null){
			putQueryParameter("AkId", akId);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public String getAkSecret() {
		return this.akSecret;
	}

	public void setAkSecret(String akSecret) {
		this.akSecret = akSecret;
		if(akSecret != null){
			putQueryParameter("AkSecret", akSecret);
		}
	}

	@Override
	public Class<ActivateEcsClientResponse> getResponseClass() {
		return ActivateEcsClientResponse.class;
	}

}
