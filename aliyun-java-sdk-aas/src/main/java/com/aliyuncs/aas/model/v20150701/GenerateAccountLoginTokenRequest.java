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
public class GenerateAccountLoginTokenRequest extends RpcAcsRequest<GenerateAccountLoginTokenResponse> {
	   

	private String targetPk;
	public GenerateAccountLoginTokenRequest() {
		super("Aas", "2015-07-01", "GenerateAccountLoginToken");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTargetPk() {
		return this.targetPk;
	}

	public void setTargetPk(String targetPk) {
		this.targetPk = targetPk;
		if(targetPk != null){
			putQueryParameter("TargetPk", targetPk);
		}
	}

	@Override
	public Class<GenerateAccountLoginTokenResponse> getResponseClass() {
		return GenerateAccountLoginTokenResponse.class;
	}

}
