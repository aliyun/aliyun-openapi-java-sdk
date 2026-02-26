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

package com.aliyuncs.ga.model.v20191120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ga.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateEndpointGroupsRequest extends RpcAcsRequest<CreateEndpointGroupsResponse> {
	   

	private Boolean dryRun;

	private String clientToken;

	private List<EndpointGroupConfigurations> endpointGroupConfigurationss;

	private String listenerId;

	private String acceleratorId;
	public CreateEndpointGroupsRequest() {
		super("Ga", "2019-11-20", "CreateEndpointGroups", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public List<EndpointGroupConfigurations> getEndpointGroupConfigurationss() {
		return this.endpointGroupConfigurationss;
	}

	public void setEndpointGroupConfigurationss(List<EndpointGroupConfigurations> endpointGroupConfigurationss) {
		this.endpointGroupConfigurationss = endpointGroupConfigurationss;	
		if (endpointGroupConfigurationss != null) {
			for (int depth1 = 0; depth1 < endpointGroupConfigurationss.size(); depth1++) {
				putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EndpointGroupName" , endpointGroupConfigurationss.get(depth1).getEndpointGroupName());
				putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EndpointGroupDescription" , endpointGroupConfigurationss.get(depth1).getEndpointGroupDescription());
				putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EndpointGroupRegion" , endpointGroupConfigurationss.get(depth1).getEndpointGroupRegion());
				putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".TrafficPercentage" , endpointGroupConfigurationss.get(depth1).getTrafficPercentage());
				putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".HealthCheckEnabled" , endpointGroupConfigurationss.get(depth1).getHealthCheckEnabled());
				putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".HealthCheckIntervalSeconds" , endpointGroupConfigurationss.get(depth1).getHealthCheckIntervalSeconds());
				putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".HealthCheckPath" , endpointGroupConfigurationss.get(depth1).getHealthCheckPath());
				putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".HealthCheckPort" , endpointGroupConfigurationss.get(depth1).getHealthCheckPort());
				putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".HealthCheckProtocol" , endpointGroupConfigurationss.get(depth1).getHealthCheckProtocol());
				putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".ThresholdCount" , endpointGroupConfigurationss.get(depth1).getThresholdCount());
				if (endpointGroupConfigurationss.get(depth1).getEndpointConfigurationss() != null) {
					for (int depth2 = 0; depth2 < endpointGroupConfigurationss.get(depth1).getEndpointConfigurationss().size(); depth2++) {
						putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EndpointConfigurations." + (depth2 + 1) + ".Type" , endpointGroupConfigurationss.get(depth1).getEndpointConfigurationss().get(depth2).getType());
						putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EndpointConfigurations." + (depth2 + 1) + ".Weight" , endpointGroupConfigurationss.get(depth1).getEndpointConfigurationss().get(depth2).getWeight());
						putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EndpointConfigurations." + (depth2 + 1) + ".Endpoint" , endpointGroupConfigurationss.get(depth1).getEndpointConfigurationss().get(depth2).getEndpoint());
					}
				}
				putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EndpointRequestProtocol" , endpointGroupConfigurationss.get(depth1).getEndpointRequestProtocol());
				putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EndpointGroupType" , endpointGroupConfigurationss.get(depth1).getEndpointGroupType());
				if (endpointGroupConfigurationss.get(depth1).getPortOverridess() != null) {
					for (int depth2 = 0; depth2 < endpointGroupConfigurationss.get(depth1).getPortOverridess().size(); depth2++) {
						putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".PortOverrides." + (depth2 + 1) + ".ListenerPort" , endpointGroupConfigurationss.get(depth1).getPortOverridess().get(depth2).getListenerPort());
						putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".PortOverrides." + (depth2 + 1) + ".EndpointPort" , endpointGroupConfigurationss.get(depth1).getPortOverridess().get(depth2).getEndpointPort());
					}
				}
				putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EnableClientIPPreservationToa" , endpointGroupConfigurationss.get(depth1).getEnableClientIPPreservationToa());
				putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EnableClientIPPreservationProxyProtocol" , endpointGroupConfigurationss.get(depth1).getEnableClientIPPreservationProxyProtocol());
			}
		}	
	}

	public String getListenerId() {
		return this.listenerId;
	}

	public void setListenerId(String listenerId) {
		this.listenerId = listenerId;
		if(listenerId != null){
			putQueryParameter("ListenerId", listenerId);
		}
	}

	public String getAcceleratorId() {
		return this.acceleratorId;
	}

	public void setAcceleratorId(String acceleratorId) {
		this.acceleratorId = acceleratorId;
		if(acceleratorId != null){
			putQueryParameter("AcceleratorId", acceleratorId);
		}
	}

	public static class EndpointGroupConfigurations {

		private String endpointGroupName;

		private String endpointGroupDescription;

		private String endpointGroupRegion;

		private Long trafficPercentage;

		private Boolean healthCheckEnabled;

		private Long healthCheckIntervalSeconds;

		private String healthCheckPath;

		private Long healthCheckPort;

		private String healthCheckProtocol;

		private Long thresholdCount;

		private List<EndpointConfigurations> endpointConfigurationss;

		private String endpointRequestProtocol;

		private String endpointGroupType;

		private List<PortOverrides> portOverridess;

		private Boolean enableClientIPPreservationToa;

		private Boolean enableClientIPPreservationProxyProtocol;

		public String getEndpointGroupName() {
			return this.endpointGroupName;
		}

		public void setEndpointGroupName(String endpointGroupName) {
			this.endpointGroupName = endpointGroupName;
		}

		public String getEndpointGroupDescription() {
			return this.endpointGroupDescription;
		}

		public void setEndpointGroupDescription(String endpointGroupDescription) {
			this.endpointGroupDescription = endpointGroupDescription;
		}

		public String getEndpointGroupRegion() {
			return this.endpointGroupRegion;
		}

		public void setEndpointGroupRegion(String endpointGroupRegion) {
			this.endpointGroupRegion = endpointGroupRegion;
		}

		public Long getTrafficPercentage() {
			return this.trafficPercentage;
		}

		public void setTrafficPercentage(Long trafficPercentage) {
			this.trafficPercentage = trafficPercentage;
		}

		public Boolean getHealthCheckEnabled() {
			return this.healthCheckEnabled;
		}

		public void setHealthCheckEnabled(Boolean healthCheckEnabled) {
			this.healthCheckEnabled = healthCheckEnabled;
		}

		public Long getHealthCheckIntervalSeconds() {
			return this.healthCheckIntervalSeconds;
		}

		public void setHealthCheckIntervalSeconds(Long healthCheckIntervalSeconds) {
			this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
		}

		public String getHealthCheckPath() {
			return this.healthCheckPath;
		}

		public void setHealthCheckPath(String healthCheckPath) {
			this.healthCheckPath = healthCheckPath;
		}

		public Long getHealthCheckPort() {
			return this.healthCheckPort;
		}

		public void setHealthCheckPort(Long healthCheckPort) {
			this.healthCheckPort = healthCheckPort;
		}

		public String getHealthCheckProtocol() {
			return this.healthCheckProtocol;
		}

		public void setHealthCheckProtocol(String healthCheckProtocol) {
			this.healthCheckProtocol = healthCheckProtocol;
		}

		public Long getThresholdCount() {
			return this.thresholdCount;
		}

		public void setThresholdCount(Long thresholdCount) {
			this.thresholdCount = thresholdCount;
		}

		public List<EndpointConfigurations> getEndpointConfigurationss() {
			return this.endpointConfigurationss;
		}

		public void setEndpointConfigurationss(List<EndpointConfigurations> endpointConfigurationss) {
			this.endpointConfigurationss = endpointConfigurationss;
		}

		public String getEndpointRequestProtocol() {
			return this.endpointRequestProtocol;
		}

		public void setEndpointRequestProtocol(String endpointRequestProtocol) {
			this.endpointRequestProtocol = endpointRequestProtocol;
		}

		public String getEndpointGroupType() {
			return this.endpointGroupType;
		}

		public void setEndpointGroupType(String endpointGroupType) {
			this.endpointGroupType = endpointGroupType;
		}

		public List<PortOverrides> getPortOverridess() {
			return this.portOverridess;
		}

		public void setPortOverridess(List<PortOverrides> portOverridess) {
			this.portOverridess = portOverridess;
		}

		public Boolean getEnableClientIPPreservationToa() {
			return this.enableClientIPPreservationToa;
		}

		public void setEnableClientIPPreservationToa(Boolean enableClientIPPreservationToa) {
			this.enableClientIPPreservationToa = enableClientIPPreservationToa;
		}

		public Boolean getEnableClientIPPreservationProxyProtocol() {
			return this.enableClientIPPreservationProxyProtocol;
		}

		public void setEnableClientIPPreservationProxyProtocol(Boolean enableClientIPPreservationProxyProtocol) {
			this.enableClientIPPreservationProxyProtocol = enableClientIPPreservationProxyProtocol;
		}

		public static class EndpointConfigurations {

			private String type;

			private Long weight;

			private String endpoint;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getWeight() {
				return this.weight;
			}

			public void setWeight(Long weight) {
				this.weight = weight;
			}

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}
		}

		public static class PortOverrides {

			private Long listenerPort;

			private Long endpointPort;

			public Long getListenerPort() {
				return this.listenerPort;
			}

			public void setListenerPort(Long listenerPort) {
				this.listenerPort = listenerPort;
			}

			public Long getEndpointPort() {
				return this.endpointPort;
			}

			public void setEndpointPort(Long endpointPort) {
				this.endpointPort = endpointPort;
			}
		}
	}

	@Override
	public Class<CreateEndpointGroupsResponse> getResponseClass() {
		return CreateEndpointGroupsResponse.class;
	}

}
