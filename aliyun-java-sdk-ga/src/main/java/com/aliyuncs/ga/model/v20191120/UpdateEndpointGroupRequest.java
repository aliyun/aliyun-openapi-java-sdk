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
public class UpdateEndpointGroupRequest extends RpcAcsRequest<UpdateEndpointGroupResponse> {
	   

	private String clientToken;

	private Integer healthCheckIntervalSeconds;

	private Integer trafficPercentage;

	private String description;

	private String healthCheckProtocol;

	private Integer healthCheckPort;

	private Integer thresholdCount;

	private String healthCheckPath;

	private List<EndpointConfigurations> endpointConfigurationss;

	private String endpointGroupRegion;

	private String name;

	private String endpointGroupId;
	public UpdateEndpointGroupRequest() {
		super("Ga", "2019-11-20", "UpdateEndpointGroup", "gaplus");
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

	public Integer getHealthCheckIntervalSeconds() {
		return this.healthCheckIntervalSeconds;
	}

	public void setHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
		this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
		if(healthCheckIntervalSeconds != null){
			putQueryParameter("HealthCheckIntervalSeconds", healthCheckIntervalSeconds.toString());
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
				putQueryParameter("EndpointConfigurations." + (depth1 + 1) + ".Endpoint" , endpointConfigurationss.get(depth1).getEndpoint());
				putQueryParameter("EndpointConfigurations." + (depth1 + 1) + ".Weight" , endpointConfigurationss.get(depth1).getWeight());
				putQueryParameter("EndpointConfigurations." + (depth1 + 1) + ".Type" , endpointConfigurationss.get(depth1).getType());
			}
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

	public String getEndpointGroupId() {
		return this.endpointGroupId;
	}

	public void setEndpointGroupId(String endpointGroupId) {
		this.endpointGroupId = endpointGroupId;
		if(endpointGroupId != null){
			putQueryParameter("EndpointGroupId", endpointGroupId);
		}
	}

	public static class EndpointConfigurations {

		private String endpoint;

		private Integer weight;

		private String type;

		public String getEndpoint() {
			return this.endpoint;
		}

		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public Class<UpdateEndpointGroupResponse> getResponseClass() {
		return UpdateEndpointGroupResponse.class;
	}

}
