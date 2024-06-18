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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateServerGroupAttributeRequest extends RpcAcsRequest<UpdateServerGroupAttributeResponse> {
	   

	private String serverGroupName;

	private String clientToken;

	private HealthCheckConfig healthCheckConfig;

	private SlowStartConfig slowStartConfig;

	private String scheduler;

	private String serverGroupId;

	private Boolean upstreamKeepaliveEnabled;

	private String serviceName;

	private StickySessionConfig stickySessionConfig;

	private Boolean dryRun;

	private ConnectionDrainConfig connectionDrainConfig;

	private UchConfig uchConfig;
	public UpdateServerGroupAttributeRequest() {
		super("Alb", "2020-06-16", "UpdateServerGroupAttribute", "alb");
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
			putQueryParameter("ServerGroupName", serverGroupName);
		}
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

	public HealthCheckConfig getHealthCheckConfig() {
		return this.healthCheckConfig;
	}

	public void setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
		this.healthCheckConfig = healthCheckConfig;	
		if (healthCheckConfig != null) {
			
				if (healthCheckConfig.getHealthCheckCodes() != null) {
					for (int depth1 = 0; depth1 < healthCheckConfig.getHealthCheckCodes().size(); depth1++) {
						putQueryParameter("HealthCheckConfig.HealthCheckCodes." + (depth1 + 1) , healthCheckConfig.getHealthCheckCodes().get(depth1));
					}
				}
				putQueryParameter("HealthCheckConfig.HealthCheckEnabled" , healthCheckConfig.getHealthCheckEnabled());
				putQueryParameter("HealthCheckConfig.HealthCheckTimeout" , healthCheckConfig.getHealthCheckTimeout());
				putQueryParameter("HealthCheckConfig.HealthCheckMethod" , healthCheckConfig.getHealthCheckMethod());
				putQueryParameter("HealthCheckConfig.HealthCheckHost" , healthCheckConfig.getHealthCheckHost());
				putQueryParameter("HealthCheckConfig.HealthCheckProtocol" , healthCheckConfig.getHealthCheckProtocol());
				putQueryParameter("HealthCheckConfig.UnhealthyThreshold" , healthCheckConfig.getUnhealthyThreshold());
				putQueryParameter("HealthCheckConfig.HealthyThreshold" , healthCheckConfig.getHealthyThreshold());
				putQueryParameter("HealthCheckConfig.HealthCheckTcpFastCloseEnabled" , healthCheckConfig.getHealthCheckTcpFastCloseEnabled());
				putQueryParameter("HealthCheckConfig.HealthCheckPath" , healthCheckConfig.getHealthCheckPath());
				putQueryParameter("HealthCheckConfig.HealthCheckInterval" , healthCheckConfig.getHealthCheckInterval());
				if (healthCheckConfig.getHealthCheckHttpCodes() != null) {
					for (int depth1 = 0; depth1 < healthCheckConfig.getHealthCheckHttpCodes().size(); depth1++) {
						putQueryParameter("HealthCheckConfig.HealthCheckHttpCodes." + (depth1 + 1) , healthCheckConfig.getHealthCheckHttpCodes().get(depth1));
					}
				}
				putQueryParameter("HealthCheckConfig.HealthCheckHttpVersion" , healthCheckConfig.getHealthCheckHttpVersion());
				putQueryParameter("HealthCheckConfig.HealthCheckConnectPort" , healthCheckConfig.getHealthCheckConnectPort());
		}	
	}

	public SlowStartConfig getSlowStartConfig() {
		return this.slowStartConfig;
	}

	public void setSlowStartConfig(SlowStartConfig slowStartConfig) {
		this.slowStartConfig = slowStartConfig;	
		if (slowStartConfig != null) {
			
				putQueryParameter("SlowStartConfig.SlowStartDuration" , slowStartConfig.getSlowStartDuration());
				putQueryParameter("SlowStartConfig.SlowStartEnabled" , slowStartConfig.getSlowStartEnabled());
		}	
	}

	public String getScheduler() {
		return this.scheduler;
	}

	public void setScheduler(String scheduler) {
		this.scheduler = scheduler;
		if(scheduler != null){
			putQueryParameter("Scheduler", scheduler);
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

	public Boolean getUpstreamKeepaliveEnabled() {
		return this.upstreamKeepaliveEnabled;
	}

	public void setUpstreamKeepaliveEnabled(Boolean upstreamKeepaliveEnabled) {
		this.upstreamKeepaliveEnabled = upstreamKeepaliveEnabled;
		if(upstreamKeepaliveEnabled != null){
			putQueryParameter("UpstreamKeepaliveEnabled", upstreamKeepaliveEnabled.toString());
		}
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putQueryParameter("ServiceName", serviceName);
		}
	}

	public StickySessionConfig getStickySessionConfig() {
		return this.stickySessionConfig;
	}

	public void setStickySessionConfig(StickySessionConfig stickySessionConfig) {
		this.stickySessionConfig = stickySessionConfig;	
		if (stickySessionConfig != null) {
			
				putQueryParameter("StickySessionConfig.StickySessionEnabled" , stickySessionConfig.getStickySessionEnabled());
				putQueryParameter("StickySessionConfig.Cookie" , stickySessionConfig.getCookie());
				putQueryParameter("StickySessionConfig.CookieTimeout" , stickySessionConfig.getCookieTimeout());
				putQueryParameter("StickySessionConfig.StickySessionType" , stickySessionConfig.getStickySessionType());
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

	public ConnectionDrainConfig getConnectionDrainConfig() {
		return this.connectionDrainConfig;
	}

	public void setConnectionDrainConfig(ConnectionDrainConfig connectionDrainConfig) {
		this.connectionDrainConfig = connectionDrainConfig;	
		if (connectionDrainConfig != null) {
			
				putQueryParameter("ConnectionDrainConfig.ConnectionDrainEnabled" , connectionDrainConfig.getConnectionDrainEnabled());
				putQueryParameter("ConnectionDrainConfig.ConnectionDrainTimeout" , connectionDrainConfig.getConnectionDrainTimeout());
		}	
	}

	public UchConfig getUchConfig() {
		return this.uchConfig;
	}

	public void setUchConfig(UchConfig uchConfig) {
		this.uchConfig = uchConfig;	
		if (uchConfig != null) {
			
				putQueryParameter("UchConfig.Type" , uchConfig.getType());
				putQueryParameter("UchConfig.Value" , uchConfig.getValue());
		}	
	}

	public static class HealthCheckConfig {

		private List<String> healthCheckCodes;

		private Boolean healthCheckEnabled;

		private Integer healthCheckTimeout;

		private String healthCheckMethod;

		private String healthCheckHost;

		private String healthCheckProtocol;

		private Integer unhealthyThreshold;

		private Integer healthyThreshold;

		private Boolean healthCheckTcpFastCloseEnabled;

		private String healthCheckPath;

		private Integer healthCheckInterval;

		private List<String> healthCheckHttpCodes;

		private String healthCheckHttpVersion;

		private Integer healthCheckConnectPort;

		public List<String> getHealthCheckCodes() {
			return this.healthCheckCodes;
		}

		public void setHealthCheckCodes(List<String> healthCheckCodes) {
			this.healthCheckCodes = healthCheckCodes;
		}

		public Boolean getHealthCheckEnabled() {
			return this.healthCheckEnabled;
		}

		public void setHealthCheckEnabled(Boolean healthCheckEnabled) {
			this.healthCheckEnabled = healthCheckEnabled;
		}

		public Integer getHealthCheckTimeout() {
			return this.healthCheckTimeout;
		}

		public void setHealthCheckTimeout(Integer healthCheckTimeout) {
			this.healthCheckTimeout = healthCheckTimeout;
		}

		public String getHealthCheckMethod() {
			return this.healthCheckMethod;
		}

		public void setHealthCheckMethod(String healthCheckMethod) {
			this.healthCheckMethod = healthCheckMethod;
		}

		public String getHealthCheckHost() {
			return this.healthCheckHost;
		}

		public void setHealthCheckHost(String healthCheckHost) {
			this.healthCheckHost = healthCheckHost;
		}

		public String getHealthCheckProtocol() {
			return this.healthCheckProtocol;
		}

		public void setHealthCheckProtocol(String healthCheckProtocol) {
			this.healthCheckProtocol = healthCheckProtocol;
		}

		public Integer getUnhealthyThreshold() {
			return this.unhealthyThreshold;
		}

		public void setUnhealthyThreshold(Integer unhealthyThreshold) {
			this.unhealthyThreshold = unhealthyThreshold;
		}

		public Integer getHealthyThreshold() {
			return this.healthyThreshold;
		}

		public void setHealthyThreshold(Integer healthyThreshold) {
			this.healthyThreshold = healthyThreshold;
		}

		public Boolean getHealthCheckTcpFastCloseEnabled() {
			return this.healthCheckTcpFastCloseEnabled;
		}

		public void setHealthCheckTcpFastCloseEnabled(Boolean healthCheckTcpFastCloseEnabled) {
			this.healthCheckTcpFastCloseEnabled = healthCheckTcpFastCloseEnabled;
		}

		public String getHealthCheckPath() {
			return this.healthCheckPath;
		}

		public void setHealthCheckPath(String healthCheckPath) {
			this.healthCheckPath = healthCheckPath;
		}

		public Integer getHealthCheckInterval() {
			return this.healthCheckInterval;
		}

		public void setHealthCheckInterval(Integer healthCheckInterval) {
			this.healthCheckInterval = healthCheckInterval;
		}

		public List<String> getHealthCheckHttpCodes() {
			return this.healthCheckHttpCodes;
		}

		public void setHealthCheckHttpCodes(List<String> healthCheckHttpCodes) {
			this.healthCheckHttpCodes = healthCheckHttpCodes;
		}

		public String getHealthCheckHttpVersion() {
			return this.healthCheckHttpVersion;
		}

		public void setHealthCheckHttpVersion(String healthCheckHttpVersion) {
			this.healthCheckHttpVersion = healthCheckHttpVersion;
		}

		public Integer getHealthCheckConnectPort() {
			return this.healthCheckConnectPort;
		}

		public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
			this.healthCheckConnectPort = healthCheckConnectPort;
		}
	}

	public static class SlowStartConfig {

		private Integer slowStartDuration;

		private Boolean slowStartEnabled;

		public Integer getSlowStartDuration() {
			return this.slowStartDuration;
		}

		public void setSlowStartDuration(Integer slowStartDuration) {
			this.slowStartDuration = slowStartDuration;
		}

		public Boolean getSlowStartEnabled() {
			return this.slowStartEnabled;
		}

		public void setSlowStartEnabled(Boolean slowStartEnabled) {
			this.slowStartEnabled = slowStartEnabled;
		}
	}

	public static class StickySessionConfig {

		private Boolean stickySessionEnabled;

		private String cookie;

		private Integer cookieTimeout;

		private String stickySessionType;

		public Boolean getStickySessionEnabled() {
			return this.stickySessionEnabled;
		}

		public void setStickySessionEnabled(Boolean stickySessionEnabled) {
			this.stickySessionEnabled = stickySessionEnabled;
		}

		public String getCookie() {
			return this.cookie;
		}

		public void setCookie(String cookie) {
			this.cookie = cookie;
		}

		public Integer getCookieTimeout() {
			return this.cookieTimeout;
		}

		public void setCookieTimeout(Integer cookieTimeout) {
			this.cookieTimeout = cookieTimeout;
		}

		public String getStickySessionType() {
			return this.stickySessionType;
		}

		public void setStickySessionType(String stickySessionType) {
			this.stickySessionType = stickySessionType;
		}
	}

	public static class ConnectionDrainConfig {

		private Boolean connectionDrainEnabled;

		private Integer connectionDrainTimeout;

		public Boolean getConnectionDrainEnabled() {
			return this.connectionDrainEnabled;
		}

		public void setConnectionDrainEnabled(Boolean connectionDrainEnabled) {
			this.connectionDrainEnabled = connectionDrainEnabled;
		}

		public Integer getConnectionDrainTimeout() {
			return this.connectionDrainTimeout;
		}

		public void setConnectionDrainTimeout(Integer connectionDrainTimeout) {
			this.connectionDrainTimeout = connectionDrainTimeout;
		}
	}

	public static class UchConfig {

		private String type;

		private String value;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<UpdateServerGroupAttributeResponse> getResponseClass() {
		return UpdateServerGroupAttributeResponse.class;
	}

}
