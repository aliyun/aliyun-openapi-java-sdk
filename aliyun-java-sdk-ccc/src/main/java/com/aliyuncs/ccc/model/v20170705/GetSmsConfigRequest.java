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

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetSmsConfigRequest extends RpcAcsRequest<GetSmsConfigResponse> {
	   

	private String instanceId;

	private List<Integer> scenarios;
	public GetSmsConfigRequest() {
		super("CCC", "2017-07-05", "GetSmsConfig");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public List<Integer> getScenarios() {
		return this.scenarios;
	}

	public void setScenarios(List<Integer> scenarios) {
		this.scenarios = scenarios;	
		if (scenarios != null) {
			for (int i = 0; i < scenarios.size(); i++) {
				putQueryParameter("Scenario." + (i + 1) , scenarios.get(i));
			}
		}	
	}

	@Override
	public Class<GetSmsConfigResponse> getResponseClass() {
		return GetSmsConfigResponse.class;
	}

}
