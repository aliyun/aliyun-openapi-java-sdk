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

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCalculationRequest extends RpcAcsRequest<CreateCalculationResponse> {
	   

	private String cloudCodeUserId;

	private String clientToken;

	private String queryString;
	public CreateCalculationRequest() {
		super("UniMkt", "2018-12-12", "CreateCalculation", "1.0.0");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCloudCodeUserId() {
		return this.cloudCodeUserId;
	}

	public void setCloudCodeUserId(String cloudCodeUserId) {
		this.cloudCodeUserId = cloudCodeUserId;
		if(cloudCodeUserId != null){
			putQueryParameter("CloudCodeUserId", cloudCodeUserId);
		}
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

	public String getQueryString() {
		return this.queryString;
	}

	public void setQueryString(String queryString) {
		this.queryString = queryString;
		if(queryString != null){
			putQueryParameter("QueryString", queryString);
		}
	}

	@Override
	public Class<CreateCalculationResponse> getResponseClass() {
		return CreateCalculationResponse.class;
	}

}
