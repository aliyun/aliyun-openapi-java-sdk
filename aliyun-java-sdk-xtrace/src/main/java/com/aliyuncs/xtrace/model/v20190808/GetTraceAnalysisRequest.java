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

package com.aliyuncs.xtrace.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.xtrace.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetTraceAnalysisRequest extends RpcAcsRequest<GetTraceAnalysisResponse> {
	   

	private String query;

	private String api;

	private String proxyUserId;
	public GetTraceAnalysisRequest() {
		super("xtrace", "2019-08-08", "GetTraceAnalysis");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
		if(query != null){
			putQueryParameter("Query", query);
		}
	}

	public String getApi() {
		return this.api;
	}

	public void setApi(String api) {
		this.api = api;
		if(api != null){
			putQueryParameter("Api", api);
		}
	}

	public String getProxyUserId() {
		return this.proxyUserId;
	}

	public void setProxyUserId(String proxyUserId) {
		this.proxyUserId = proxyUserId;
		if(proxyUserId != null){
			putQueryParameter("ProxyUserId", proxyUserId);
		}
	}

	@Override
	public Class<GetTraceAnalysisResponse> getResponseClass() {
		return GetTraceAnalysisResponse.class;
	}

}
