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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateK8sApplicationConfigRequest extends RoaAcsRequest<UpdateK8sApplicationConfigResponse> {
	   

	private String memoryRequest;

	private String appId;

	private String cpuRequest;

	private String memoryLimit;

	private String clusterId;

	private String cpuLimit;

	private String mcpuLimit;

	private String mcpuRequest;

	private Integer timeout;
	public UpdateK8sApplicationConfigRequest() {
		super("Edas", "2017-08-01", "UpdateK8sApplicationConfig", "edas");
		setUriPattern("/pop/v5/k8s/acs/k8s_app_configuration");
		setMethod(MethodType.PUT);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMemoryRequest() {
		return this.memoryRequest;
	}

	public void setMemoryRequest(String memoryRequest) {
		this.memoryRequest = memoryRequest;
		if(memoryRequest != null){
			putQueryParameter("MemoryRequest", memoryRequest);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getCpuRequest() {
		return this.cpuRequest;
	}

	public void setCpuRequest(String cpuRequest) {
		this.cpuRequest = cpuRequest;
		if(cpuRequest != null){
			putQueryParameter("CpuRequest", cpuRequest);
		}
	}

	public String getMemoryLimit() {
		return this.memoryLimit;
	}

	public void setMemoryLimit(String memoryLimit) {
		this.memoryLimit = memoryLimit;
		if(memoryLimit != null){
			putQueryParameter("MemoryLimit", memoryLimit);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getCpuLimit() {
		return this.cpuLimit;
	}

	public void setCpuLimit(String cpuLimit) {
		this.cpuLimit = cpuLimit;
		if(cpuLimit != null){
			putQueryParameter("CpuLimit", cpuLimit);
		}
	}

	public String getMcpuLimit() {
		return this.mcpuLimit;
	}

	public void setMcpuLimit(String mcpuLimit) {
		this.mcpuLimit = mcpuLimit;
		if(mcpuLimit != null){
			putQueryParameter("McpuLimit", mcpuLimit);
		}
	}

	public String getMcpuRequest() {
		return this.mcpuRequest;
	}

	public void setMcpuRequest(String mcpuRequest) {
		this.mcpuRequest = mcpuRequest;
		if(mcpuRequest != null){
			putQueryParameter("McpuRequest", mcpuRequest);
		}
	}

	public Integer getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
		if(timeout != null){
			putQueryParameter("Timeout", timeout.toString());
		}
	}

	@Override
	public Class<UpdateK8sApplicationConfigResponse> getResponseClass() {
		return UpdateK8sApplicationConfigResponse.class;
	}

}
