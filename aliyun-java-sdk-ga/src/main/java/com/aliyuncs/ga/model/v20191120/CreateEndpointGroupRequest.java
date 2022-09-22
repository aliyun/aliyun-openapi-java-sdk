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
public class CreateEndpointGroupRequest extends RpcAcsRequest<CreateEndpointGroupResponse> {
	   

	private List<PortOverrides> portOverridess;

	private Boolean healthCheckEnabled;

	private String clientToken;

	private Integer healthCheckIntervalSeconds;

	private String description;

	private String healthCheckProtocol;

	private String endpointRequestProtocol;

	private String listenerId;

	private String healthCheckPath;

	private List<EndpointConfigurations> endpointConfigurationss;

	private String endpointGroupType;

	private String acceleratorId;

	private Integer trafficPercentage;

	private Integer healthCheckPort;

	private Integer thresholdCount;

	private String endpointGroupRegion;

	private String name;
	public CreateEndpointGroupRequest() {
		super("Ga", "2019-11-20", "CreateEndpointGroup", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<PortOverrides> getPortOverridess() {
		return this.portOverridess;
	}

	public void setPortOverridess(List<PortOverrides> portOverridess) {
		this.portOverridess = portOverridess;	
		if (portOverridess != null) {
			for (int depth1 = 0; depth1 < portOverridess.size(); depth1++) {
				putQueryParameter("PortOverrides." + (depth1 + 1) + ".ListenerPort" , portOverridess.get(depth1).getListenerPort());
				putQueryParameter("PortOverrides." + (depth1 + 1) + ".EndpointPort" , portOverridess.get(depth1).getEndpointPort());
			}
		}	
	}

	public Boolean getHealthCheckEnabled() {
		return this.healthCheckEnabled;
	}

	public void setHealthCheckEnabled(Boolean healthCheckEnabled) {
		this.healthCheckEnabled = healthCheckEnabled;
		if(healthCheckEnabled != null){
			putQueryParameter("HealthCheckEnabled", healthCheckEnabled.toString());
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

	public Integer getHealthCheckIntervalSeconds() {
		return this.healthCheckIntervalSeconds;
	}

	public void setHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
		this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
		if(healthCheckIntervalSeconds != null){
			putQueryParameter("HealthCheckIntervalSeconds", healthCheckIntervalSeconds.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getHealthCheckProtocol() {
		return this.healthCheckProtocol;
	}

	public void setHealthCheckProtocol(String healthCheckProtocol) {
		this.healthCheckProtocol = healthCheckProtocol;
		if(healthCheckProtocol != null){
			putQueryParameter("HealthCheckProtocol", healthCheckProtocol);
		}
	}

	public String getEndpointRequestProtocol() {
		return this.endpointRequestProtocol;
	}

	public void setEndpointRequestProtocol(String endpointRequestProtocol) {
		this.endpointRequestProtocol = endpointRequestProtocol;
		if(endpointRequestProtocol != null){
			putQueryParameter("EndpointRequestProtocol", endpointRequestProtocol);
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

	public String getHealthCheckPath() {
		return this.healthCheckPath;
	}

	public void setHealthCheckPath(String healthCheckPath) {
		this.healthCheckPath = healthCheckPath;
		if(healthCheckPath != null){
			putQueryParameter("HealthCheckPath", healthCheckPath);
		}
	}

	public List<EndpointConfigurations> getEndpointConfigurationss() {
		return this.endpointConfigurationss;
	}

	public void setEndpointConfigurationss(List<EndpointConfigurations> endpointConfigurationss) {
		this.endpointConfigurationss = endpointConfigurationss;	
		if (endpointConfigurationss != null) {
			for (int depth1 = 0; depth1 < endpointConfigurationss.size(); depth1++) {
				putQueryParameter("EndpointConfigurations." + (depth1 + 1) + ".Type" , endpointConfigurationss.get(depth1).getType());
				putQueryParameter("EndpointConfigurations." + (depth1 + 1) + ".EnableClientIPPreservation" , endpointConfigurationss.get(depth1).getEnableClientIPPreservation());
				putQueryParameter("EndpointConfigurations." + (depth1 + 1) + ".Weight" , endpointConfigurationss.get(depth1).getWeight());
				putQueryParameter("EndpointConfigurations." + (depth1 + 1) + ".EnableProxyProtocol" , endpointConfigurationss.get(depth1).getEnableProxyProtocol());
				putQueryParameter("EndpointConfigurations." + (depth1 + 1) + ".Endpoint" , endpointConfigurationss.get(depth1).getEndpoint());
			}
		}	
	}

	public String getEndpointGroupType() {
		return this.endpointGroupType;
	}

	public void setEndpointGroupType(String endpointGroupType) {
		this.endpointGroupType = endpointGroupType;
		if(endpointGroupType != null){
			putQueryParameter("EndpointGroupType", endpointGroupType);
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

	public Integer getTrafficPercentage() {
		return this.trafficPercentage;
	}

	public void setTrafficPercentage(Integer trafficPercentage) {
		this.trafficPercentage = trafficPercentage;
		if(trafficPercentage != null){
			putQueryParameter("TrafficPercentage", trafficPercentage.toString());
		}
	}

	public Integer getHealthCheckPort() {
		return this.healthCheckPort;
	}

	public void setHealthCheckPort(Integer healthCheckPort) {
		this.healthCheckPort = healthCheckPort;
		if(healthCheckPort != null){
			putQueryParameter("HealthCheckPort", healthCheckPort.toString());
		}
	}

	public Integer getThresholdCount() {
		return this.thresholdCount;
	}

	public void setThresholdCount(Integer thresholdCount) {
		this.thresholdCount = thresholdCount;
		if(thresholdCount != null){
			putQueryParameter("ThresholdCount", thresholdCount.toString());
		}
	}

	public String getEndpointGroupRegion() {
		return this.endpointGroupRegion;
	}

	public void setEndpointGroupRegion(String endpointGroupRegion) {
		this.endpointGroupRegion = endpointGroupRegion;
		if(endpointGroupRegion != null){
			putQueryParameter("EndpointGroupRegion", endpointGroupRegion);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public static class PortOverrides {

		private Integer listenerPort;

		private Integer endpointPort;

		public Integer getListenerPort() {
			return this.listenerPort;
		}

		public void setListenerPort(Integer listenerPort) {
			this.listenerPort = listenerPort;
		}

		public Integer getEndpointPort() {
			return this.endpointPort;
		}

		public void setEndpointPort(Integer endpointPort) {
			this.endpointPort = endpointPort;
		}
	}

	public static class EndpointConfigurations {

		private String type;

		private Boolean enableClientIPPreservation;

		private Integer weight;

		private Boolean enableProxyProtocol;

		private String endpoint;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Boolean getEnableClientIPPreservation() {
			return this.enableClientIPPreservation;
		}

		public void setEnableClientIPPreservation(Boolean enableClientIPPreservation) {
			this.enableClientIPPreservation = enableClientIPPreservation;
		}

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public Boolean getEnableProxyProtocol() {
			return this.enableProxyProtocol;
		}

		public void setEnableProxyProtocol(Boolean enableProxyProtocol) {
			this.enableProxyProtocol = enableProxyProtocol;
		}

		public String getEndpoint() {
			return this.endpoint;
		}

		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}
	}

	@Override
	public Class<CreateEndpointGroupResponse> getResponseClass() {
		return CreateEndpointGroupResponse.class;
	}

}
