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

package com.aliyuncs.governance.model.v20210120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.governance.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteAccountFactoryBaselineRequest extends RpcAcsRequest<DeleteAccountFactoryBaselineResponse> {
	   

	private String baselineId;
	public DeleteAccountFactoryBaselineRequest() {
		super("governance", "2021-01-20", "DeleteAccountFactoryBaseline", "governance");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBaselineId() {
		return this.baselineId;
	}

	public void setBaselineId(String baselineId) {
		this.baselineId = baselineId;
		if(baselineId != null){
			putQueryParameter("BaselineId", baselineId);
		}
	}

	@Override
	public Class<DeleteAccountFactoryBaselineResponse> getResponseClass() {
		return DeleteAccountFactoryBaselineResponse.class;
	}

}
