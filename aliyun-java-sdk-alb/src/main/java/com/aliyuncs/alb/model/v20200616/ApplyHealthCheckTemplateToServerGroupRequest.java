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

package com.aliyuncs.alb.model.v20200616;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ApplyHealthCheckTemplateToServerGroupRequest extends RpcAcsRequest<ApplyHealthCheckTemplateToServerGroupResponse> {
	   

	private String clientToken;

	private String serverGroupId;

	private Boolean dryRun;

	private String healthCheckTemplateId;
	public ApplyHealthCheckTemplateToServerGroupRequest() {
		super("Alb", "2020-06-16", "ApplyHealthCheckTemplateToServerGroup", "alb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getServerGroupId() {
		return this.serverGroupId;
	}

	public void setServerGroupId(String serverGroupId) {
		this.serverGroupId = serverGroupId;
		if(serverGroupId != null){
			putQueryParameter("ServerGroupId", serverGroupId);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getHealthCheckTemplateId() {
		return this.healthCheckTemplateId;
	}

	public void setHealthCheckTemplateId(String healthCheckTemplateId) {
		this.healthCheckTemplateId = healthCheckTemplateId;
		if(healthCheckTemplateId != null){
			putQueryParameter("HealthCheckTemplateId", healthCheckTemplateId);
		}
	}

	@Override
	public Class<ApplyHealthCheckTemplateToServerGroupResponse> getResponseClass() {
		return ApplyHealthCheckTemplateToServerGroupResponse.class;
	}

}
