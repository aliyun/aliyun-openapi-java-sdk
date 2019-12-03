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

package com.aliyuncs.aligreen.model.v20191115;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aligreen.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetAddVideoDnaResultsRequest extends RoaAcsRequest<GetAddVideoDnaResultsResponse> {
	   

	private String clientInfo;
	public GetAddVideoDnaResultsRequest() {
		super("aligreen", "2019-11-15", "GetAddVideoDnaResults");
		setUriPattern("/green/video/dna/add/results");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientInfo() {
		return this.clientInfo;
	}

	public void setClientInfo(String clientInfo) {
		this.clientInfo = clientInfo;
		if(clientInfo != null){
			putQueryParameter("ClientInfo", clientInfo);
		}
	}

	@Override
	public Class<GetAddVideoDnaResultsResponse> getResponseClass() {
		return GetAddVideoDnaResultsResponse.class;
	}

}
