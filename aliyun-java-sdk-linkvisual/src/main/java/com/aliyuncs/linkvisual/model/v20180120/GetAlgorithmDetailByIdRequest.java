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

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkvisual.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetAlgorithmDetailByIdRequest extends RpcAcsRequest<GetAlgorithmDetailByIdResponse> {
	   

	private Long algorithmId;
	public GetAlgorithmDetailByIdRequest() {
		super("Linkvisual", "2018-01-20", "GetAlgorithmDetailById", "Linkvisual");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getAlgorithmId() {
		return this.algorithmId;
	}

	public void setAlgorithmId(Long algorithmId) {
		this.algorithmId = algorithmId;
		if(algorithmId != null){
			putQueryParameter("AlgorithmId", algorithmId.toString());
		}
	}

	@Override
	public Class<GetAlgorithmDetailByIdResponse> getResponseClass() {
		return GetAlgorithmDetailByIdResponse.class;
	}

}
