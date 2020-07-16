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
public class ListDeployedAlgorithmModelsRequest extends RoaAcsRequest<ListDeployedAlgorithmModelsResponse> {
	   

	private String algorithmType;

	private Boolean inServiceOnly;

	private String appGroupIdentity;
	public ListDeployedAlgorithmModelsRequest() {
		super("OpenSearch", "2017-12-25", "ListDeployedAlgorithmModels", "opensearch");
		setUriPattern("/v4/openapi/app-groups/[appGroupIdentity]/deployed-algorithm-models");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAlgorithmType() {
		return this.algorithmType;
	}

	public void setAlgorithmType(String algorithmType) {
		this.algorithmType = algorithmType;
		if(algorithmType != null){
			putQueryParameter("algorithmType", algorithmType);
		}
	}

	public Boolean getInServiceOnly() {
		return this.inServiceOnly;
	}

	public void setInServiceOnly(Boolean inServiceOnly) {
		this.inServiceOnly = inServiceOnly;
		if(inServiceOnly != null){
			putQueryParameter("inServiceOnly", inServiceOnly.toString());
		}
	}

	public String getAppGroupIdentity() {
		return this.appGroupIdentity;
	}

	public void setAppGroupIdentity(String appGroupIdentity) {
		this.appGroupIdentity = appGroupIdentity;
		if(appGroupIdentity != null){
			putPathParameter("appGroupIdentity", appGroupIdentity);
		}
	}

	@Override
	public Class<ListDeployedAlgorithmModelsResponse> getResponseClass() {
		return ListDeployedAlgorithmModelsResponse.class;
	}

}
