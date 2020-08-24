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
public class GetAIActionConfigRequest extends RpcAcsRequest<GetAIActionConfigResponse> {
	   

	private String algoAction;

	private String algo;
	public GetAIActionConfigRequest() {
		super("Linkvisual", "2018-01-20", "GetAIActionConfig", "Linkvisual");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAlgoAction() {
		return this.algoAction;
	}

	public void setAlgoAction(String algoAction) {
		this.algoAction = algoAction;
		if(algoAction != null){
			putQueryParameter("AlgoAction", algoAction);
		}
	}

	public String getAlgo() {
		return this.algo;
	}

	public void setAlgo(String algo) {
		this.algo = algo;
		if(algo != null){
			putQueryParameter("Algo", algo);
		}
	}

	@Override
	public Class<GetAIActionConfigResponse> getResponseClass() {
		return GetAIActionConfigResponse.class;
	}

}
