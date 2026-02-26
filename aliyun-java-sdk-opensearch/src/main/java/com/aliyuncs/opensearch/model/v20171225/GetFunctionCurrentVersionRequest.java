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

package com.aliyuncs.opensearch.model.v20171225;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.opensearch.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetFunctionCurrentVersionRequest extends RoaAcsRequest<GetFunctionCurrentVersionResponse> {
	   

	private String modelType;

	private String functionName;

	private String domain;

	private String functionType;

	private String category;
	public GetFunctionCurrentVersionRequest() {
		super("OpenSearch", "2017-12-25", "GetFunctionCurrentVersion");
		setUriPattern("/v4/openapi/functions/[functionName]/current-version");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getModelType() {
		return this.modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
		if(modelType != null){
			putQueryParameter("modelType", modelType);
		}
	}

	public String getFunctionName() {
		return this.functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
		if(functionName != null){
			putPathParameter("functionName", functionName);
		}
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("domain", domain);
		}
	}

	public String getFunctionType() {
		return this.functionType;
	}

	public void setFunctionType(String functionType) {
		this.functionType = functionType;
		if(functionType != null){
			putQueryParameter("functionType", functionType);
		}
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putQueryParameter("category", category);
		}
	}

	@Override
	public Class<GetFunctionCurrentVersionResponse> getResponseClass() {
		return GetFunctionCurrentVersionResponse.class;
	}

}
