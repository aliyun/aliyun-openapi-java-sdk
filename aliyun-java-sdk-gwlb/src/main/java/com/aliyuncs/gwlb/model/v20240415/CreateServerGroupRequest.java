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

package com.aliyuncs.gwlb.model.v20240415;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateServerGroupRequest extends RpcAcsRequest<CreateServerGroupResponse> {
	   

	private String serverGroupName;

	private String clientToken;

	private HealthCheckConfig healthCheckConfig;

	private String scheduler;

	private String resourceGroupId;

	private String protocol;

	private List<Tag> tag;

	private Boolean dryRun;

	private ConnectionDrainConfig connectionDrainConfig;

	private String serverGroupType;

	private String vpcId;
	public CreateServerGroupRequest() {
		super("Gwlb", "2024-04-15", "CreateServerGroup");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
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

	public HealthCheckConfig getHealthCheckConfig() {
		return this.healthCheckConfig;
	}

	public void setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
		this.healthCheckConfig = healthCheckConfig;	
		if (healthCheckConfig != null) {
			
				putBodyParameter("HealthCheckConfig.HealthCheckConnectPort" , healthCheckConfig.getHealthCheckConnectPort());
				putBodyParameter("HealthCheckConfig.HealthCheckConnectTimeout" , healthCheckConfig.getHealthCheckConnectTimeout());
				putBodyParameter("HealthCheckConfig.HealthCheckDomain" , healthCheckConfig.getHealthCheckDomain());
				putBodyParameter("HealthCheckConfig.HealthCheckEnabled" , healthCheckConfig.getHealthCheckEnabled());
				if (healthCheckConfig.getHealthCheckHttpCode() != null) {
					for (int depth1 = 0; depth1 < healthCheckConfig.getHealthCheckHttpCode().size(); depth1++) {
						putBodyParameter("HealthCheckConfig.HealthCheckHttpCode." + (depth1 + 1) , healthCheckConfig.getHealthCheckHttpCode().get(depth1));
					}
				}
				putBodyParameter("HealthCheckConfig.HealthCheckInterval" , healthCheckConfig.getHealthCheckInterval());
				putBodyParameter("HealthCheckConfig.HealthCheckPath" , healthCheckConfig.getHealthCheckPath());
				putBodyParameter("HealthCheckConfig.HealthCheckProtocol" , healthCheckConfig.getHealthCheckProtocol());
				putBodyParameter("HealthCheckConfig.HealthyThreshold" , healthCheckConfig.getHealthyThreshold());
				putBodyParameter("HealthCheckConfig.UnhealthyThreshold" , healthCheckConfig.getUnhealthyThreshold());
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

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putBodyParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
		if(protocol != null){
			putBodyParameter("Protocol", protocol);
		}
	}

	public List<Tag> getTag() {
		return this.tag;
	}

	public void setTag(List<Tag> tag) {
		this.tag = tag;	
		if (tag != null) {
			for (int depth1 = 0; depth1 < tag.size(); depth1++) {
				if (tag.get(depth1) != null) {
					
						putBodyParameter("Tag." + (depth1 + 1) + ".Key" , tag.get(depth1).getKey());
						putBodyParameter("Tag." + (depth1 + 1) + ".Value" , tag.get(depth1).getValue());
				}
			}
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

	public ConnectionDrainConfig getConnectionDrainConfig() {
		return this.connectionDrainConfig;
	}

	public void setConnectionDrainConfig(ConnectionDrainConfig connectionDrainConfig) {
		this.connectionDrainConfig = connectionDrainConfig;	
		if (connectionDrainConfig != null) {
			
				putBodyParameter("ConnectionDrainConfig.ConnectionDrainEnabled" , connectionDrainConfig.getConnectionDrainEnabled());
				putBodyParameter("ConnectionDrainConfig.ConnectionDrainTimeout" , connectionDrainConfig.getConnectionDrainTimeout());
		}	
	}

	public String getServerGroupType() {
		return this.serverGroupType;
	}

	public void setServerGroupType(String serverGroupType) {
		this.serverGroupType = serverGroupType;
		if(serverGroupType != null){
			putBodyParameter("ServerGroupType", serverGroupType);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putBodyParameter("VpcId", vpcId);
		}
	}

	public static class HealthCheckConfig {

		private Integer healthCheckConnectPort;

		private Integer healthCheckConnectTimeout;

		private String healthCheckDomain;

		private Boolean healthCheckEnabled;

		private List<String> healthCheckHttpCode;

		private Integer healthCheckInterval;

		private String healthCheckPath;

		private String healthCheckProtocol;

		private Integer healthyThreshold;

		private Integer unhealthyThreshold;

		public Integer getHealthCheckConnectPort() {
			return this.healthCheckConnectPort;
		}

		public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
			this.healthCheckConnectPort = healthCheckConnectPort;
		}

		public Integer getHealthCheckConnectTimeout() {
			return this.healthCheckConnectTimeout;
		}

		public void setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
			this.healthCheckConnectTimeout = healthCheckConnectTimeout;
		}

		public String getHealthCheckDomain() {
			return this.healthCheckDomain;
		}

		public void setHealthCheckDomain(String healthCheckDomain) {
			this.healthCheckDomain = healthCheckDomain;
		}

		public Boolean getHealthCheckEnabled() {
			return this.healthCheckEnabled;
		}

		public void setHealthCheckEnabled(Boolean healthCheckEnabled) {
			this.healthCheckEnabled = healthCheckEnabled;
		}

		public List<String> getHealthCheckHttpCode() {
			return this.healthCheckHttpCode;
		}

		public void setHealthCheckHttpCode(List<String> healthCheckHttpCode) {
			this.healthCheckHttpCode = healthCheckHttpCode;
		}

		public Integer getHealthCheckInterval() {
			return this.healthCheckInterval;
		}

		public void setHealthCheckInterval(Integer healthCheckInterval) {
			this.healthCheckInterval = healthCheckInterval;
		}

		public String getHealthCheckPath() {
			return this.healthCheckPath;
		}

		public void setHealthCheckPath(String healthCheckPath) {
			this.healthCheckPath = healthCheckPath;
		}

		public String getHealthCheckProtocol() {
			return this.healthCheckProtocol;
		}

		public void setHealthCheckProtocol(String healthCheckProtocol) {
			this.healthCheckProtocol = healthCheckProtocol;
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
	}

	public static class Tag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
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

	@Override
	public Class<CreateServerGroupResponse> getResponseClass() {
		return CreateServerGroupResponse.class;
	}

}
