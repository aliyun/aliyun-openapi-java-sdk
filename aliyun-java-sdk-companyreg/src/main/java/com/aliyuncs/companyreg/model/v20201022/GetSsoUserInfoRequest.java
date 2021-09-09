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

package com.aliyuncs.companyreg.model.v20201022;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.companyreg.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetSsoUserInfoRequest extends RpcAcsRequest<GetSsoUserInfoResponse> {
	   

	private String opsAppKey;

	private String token;
	public GetSsoUserInfoRequest() {
		super("companyreg", "2020-10-22", "GetSsoUserInfo", "companyreg");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOpsAppKey() {
		return this.opsAppKey;
	}

	public void setOpsAppKey(String opsAppKey) {
		this.opsAppKey = opsAppKey;
		if(opsAppKey != null){
			putQueryParameter("OpsAppKey", opsAppKey);
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

	@Override
	public Class<GetSsoUserInfoResponse> getResponseClass() {
		return GetSsoUserInfoResponse.class;
	}

}
