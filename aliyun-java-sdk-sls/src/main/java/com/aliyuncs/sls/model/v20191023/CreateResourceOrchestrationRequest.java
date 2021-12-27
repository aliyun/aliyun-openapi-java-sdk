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

package com.aliyuncs.sls.model.v20191023;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sls.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateResourceOrchestrationRequest extends RpcAcsRequest<CreateResourceOrchestrationResponse> {
	   

	private String language;

	private String operationPolicy;

	private String tokens;

	private String assetsId;
	public CreateResourceOrchestrationRequest() {
		super("Sls", "2019-10-23", "CreateResourceOrchestration");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putQueryParameter("Language", language);
		}
	}

	public String getOperationPolicy() {
		return this.operationPolicy;
	}

	public void setOperationPolicy(String operationPolicy) {
		this.operationPolicy = operationPolicy;
		if(operationPolicy != null){
			putQueryParameter("OperationPolicy", operationPolicy);
		}
	}

	public String getTokens() {
		return this.tokens;
	}

	public void setTokens(String tokens) {
		this.tokens = tokens;
		if(tokens != null){
			putQueryParameter("Tokens", tokens);
		}
	}

	public String getAssetsId() {
		return this.assetsId;
	}

	public void setAssetsId(String assetsId) {
		this.assetsId = assetsId;
		if(assetsId != null){
			putQueryParameter("AssetsId", assetsId);
		}
	}

	@Override
	public Class<CreateResourceOrchestrationResponse> getResponseClass() {
		return CreateResourceOrchestrationResponse.class;
	}

}
