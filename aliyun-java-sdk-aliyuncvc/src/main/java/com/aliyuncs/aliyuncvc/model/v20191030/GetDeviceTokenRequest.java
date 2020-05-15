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

package com.aliyuncs.aliyuncvc.model.v20191030;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aliyuncvc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceTokenRequest extends RpcAcsRequest<GetDeviceTokenResponse> {
	   

	private String token;

	private String sN;
	public GetDeviceTokenRequest() {
		super("aliyuncvc", "2019-10-30", "GetDeviceToken", "aliyuncvc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getSN() {
		return this.sN;
	}

	public void setSN(String sN) {
		this.sN = sN;
		if(sN != null){
			putQueryParameter("SN", sN);
		}
	}

	@Override
	public Class<GetDeviceTokenResponse> getResponseClass() {
		return GetDeviceTokenResponse.class;
	}

}
