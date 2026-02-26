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

package com.aliyuncs.nlb.model.v20220430;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nlb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateServerGroupAttributeRequest extends RpcAcsRequest<UpdateServerGroupAttributeResponse> {
	   

	private String serverGroupName;

	private String clientToken;

	private Boolean preserveClientIpEnabled;

	private HealthCheckConfig healthCheckConfig;

	private String serverGroupId;

	private String scheduler;

	private Boolean dryRun;

	private Boolean connectionDrainEnabled;

	private Integer connectionDrainTimeout;
	public UpdateServerGroupAttributeRequest() {
		super("Nlb", "2022-04-30", "UpdateServerGroupAttribute", "nlb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getServerGroupName() {
		return this.serverGroupName;
	}

	public void setServerGroupName(String serverGroupName) {
		this.serverGroupName = serverGroupName;
		if(serverGroupName != null){
			putBodyParameter("ServerGroupName", serverGroupName);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public Boolean getPreserveClientIpEnabled() {
		return this.preserveClientIpEnabled;
	}

	public void setPreserveClientIpEnabled(Boolean preserveClientIpEnabled) {
		this.preserveClientIpEnabled = preserveClientIpEnabled;
		if(preserveClientIpEnabled != null){
			putBodyParameter("PreserveClientIpEnabled", preserveClientIpEnabled.toString());
		}
	}

	public HealthCheckConfig getHealthCheckConfig() {
		return this.healthCheckConfig;
	}

	public void setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
		this.healthCheckConfig = healthCheckConfig;	
		if (healthCheckConfig != null) {
			
				putBodyParameter("HealthCheckConfig.HealthCheckEnabled" , healthCheckConfig.getHealthCheckEnabled());
				putBodyParameter("HealthCheckConfig.HealthCheckType" , healthCheckConfig.getHealthCheckType());
				putBodyParameter("HealthCheckConfig.HealthCheckConnectPort" , healthCheckConfig.getHealthCheckConnectPort());
				putBodyParameter("HealthCheckConfig.HealthyThreshold" , healthCheckConfig.getHealthyThreshold());
				putBodyParameter("HealthCheckConfig.UnhealthyThreshold" , healthCheckConfig.getUnhealthyThreshold());
				putBodyParameter("HealthCheckConfig.HealthCheckConnectTimeout" , healthCheckConfig.getHealthCheckConnectTimeout());
				putBodyParameter("HealthCheckConfig.HealthCheckInterval" , healthCheckConfig.getHealthCheckInterval());
				putBodyParameter("HealthCheckConfig.HealthCheckDomain" , healthCheckConfig.getHealthCheckDomain());
				putBodyParameter("HealthCheckConfig.HealthCheckUrl" , healthCheckConfig.getHealthCheckUrl());
				if (healthCheckConfig.getHealthCheckHttpCode() != null) {
					for (int depth1 = 0; depth1 < healthCheckConfig.getHealthCheckHttpCode().size(); depth1++) {
						putBodyParameter("HealthCheckConfig.HealthCheckHttpCode." + (depth1 + 1) , healthCheckConfig.getHealthCheckHttpCode().get(depth1));
					}
				}
				putBodyParameter("HealthCheckConfig.HttpCheckMethod" , healthCheckConfig.getHttpCheckMethod());
		}	
	}

	public String getServerGroupId() {
		return this.serverGroupId;
	}

	public void setServerGroupId(String serverGroupId) {
		this.serverGroupId = serverGroupId;
		if(serverGroupId != null){
			putBodyParameter("ServerGroupId", serverGroupId);
		}
	}

	public String getScheduler() {
		return this.scheduler;
	}

	public void setScheduler(String scheduler) {
		this.scheduler = scheduler;
		if(scheduler != null){
			putBodyParameter("Scheduler", scheduler);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putBodyParameter("DryRun", dryRun.toString());
		}
	}

	public Boolean getConnectionDrainEnabled() {
		return this.connectionDrainEnabled;
	}

	public void setConnectionDrainEnabled(Boolean connectionDrainEnabled) {
		this.connectionDrainEnabled = connectionDrainEnabled;
		if(connectionDrainEnabled != null){
			putBodyParameter("ConnectionDrainEnabled", connectionDrainEnabled.toString());
		}
	}

	public Integer getConnectionDrainTimeout() {
		return this.connectionDrainTimeout;
	}

	public void setConnectionDrainTimeout(Integer connectionDrainTimeout) {
		this.connectionDrainTimeout = connectionDrainTimeout;
		if(connectionDrainTimeout != null){
			putBodyParameter("ConnectionDrainTimeout", connectionDrainTimeout.toString());
		}
	}

	public static class HealthCheckConfig {

		private Boolean healthCheckEnabled;

		private String healthCheckType;

		private Integer healthCheckConnectPort;

		private Integer healthyThreshold;

		private Integer unhealthyThreshold;

		private Integer healthCheckConnectTimeout;

		private Integer healthCheckInterval;

		private String healthCheckDomain;

		private String healthCheckUrl;

		private List<String> healthCheckHttpCode;

		private String httpCheckMethod;

		public Boolean getHealthCheckEnabled() {
			return this.healthCheckEnabled;
		}

		public void setHealthCheckEnabled(Boolean healthCheckEnabled) {
			this.healthCheckEnabled = healthCheckEnabled;
		}

		public String getHealthCheckType() {
			return this.healthCheckType;
		}

		public void setHealthCheckType(String healthCheckType) {
			this.healthCheckType = healthCheckType;
		}

		public Integer getHealthCheckConnectPort() {
			return this.healthCheckConnectPort;
		}

		public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
			this.healthCheckConnectPort = healthCheckConnectPort;
		}

		public Integer getHealthyThreshold() {
			return this.healthyThreshold;
		}

		public void setHealthyThreshold(Integer healthyThreshold) {
			this.healthyThreshold = healthyThreshold;
		}

		public Integer getUnhealthyThreshold() {
			return this.unhealthyThreshold;
		}

		public void setUnhealthyThreshold(Integer unhealthyThreshold) {
			this.unhealthyThreshold = unhealthyThreshold;
		}

		public Integer getHealthCheckConnectTimeout() {
			return this.healthCheckConnectTimeout;
		}

		public void setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
			this.healthCheckConnectTimeout = healthCheckConnectTimeout;
		}

		public Integer getHealthCheckInterval() {
			return this.healthCheckInterval;
		}

		public void setHealthCheckInterval(Integer healthCheckInterval) {
			this.healthCheckInterval = healthCheckInterval;
		}

		public String getHealthCheckDomain() {
			return this.healthCheckDomain;
		}

		public void setHealthCheckDomain(String healthCheckDomain) {
			this.healthCheckDomain = healthCheckDomain;
		}

		public String getHealthCheckUrl() {
			return this.healthCheckUrl;
		}

		public void setHealthCheckUrl(String healthCheckUrl) {
			this.healthCheckUrl = healthCheckUrl;
		}

		public List<String> getHealthCheckHttpCode() {
			return this.healthCheckHttpCode;
		}

		public void setHealthCheckHttpCode(List<String> healthCheckHttpCode) {
			this.healthCheckHttpCode = healthCheckHttpCode;
		}

		public String getHttpCheckMethod() {
			return this.httpCheckMethod;
		}

		public void setHttpCheckMethod(String httpCheckMethod) {
			this.httpCheckMethod = httpCheckMethod;
		}
	}

	@Override
	public Class<UpdateServerGroupAttributeResponse> getResponseClass() {
		return UpdateServerGroupAttributeResponse.class;
	}

}
