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

package com.aliyuncs.ddoscoo.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ddoscoo.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyHealthCheckConfigRequest extends RpcAcsRequest<ModifyHealthCheckConfigResponse> {
	   

	private String healthCheck;

	private String instanceId;

	private Integer frontendPort;

	private String forwardProtocol;
	public ModifyHealthCheckConfigRequest() {
		super("ddoscoo", "2020-01-01", "ModifyHealthCheckConfig");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getHealthCheck() {
		return this.healthCheck;
	}

	public void setHealthCheck(String healthCheck) {
		this.healthCheck = healthCheck;
		if(healthCheck != null){
			putQueryParameter("HealthCheck", healthCheck);
		}
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

	public Integer getFrontendPort() {
		return this.frontendPort;
	}

	public void setFrontendPort(Integer frontendPort) {
		this.frontendPort = frontendPort;
		if(frontendPort != null){
			putQueryParameter("FrontendPort", frontendPort.toString());
		}
	}

	public String getForwardProtocol() {
		return this.forwardProtocol;
	}

	public void setForwardProtocol(String forwardProtocol) {
		this.forwardProtocol = forwardProtocol;
		if(forwardProtocol != null){
			putQueryParameter("ForwardProtocol", forwardProtocol);
		}
	}

	@Override
	public Class<ModifyHealthCheckConfigResponse> getResponseClass() {
		return ModifyHealthCheckConfigResponse.class;
	}

}
