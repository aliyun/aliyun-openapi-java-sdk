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
public class CreateCustomRoutingEndpointsRequest extends RpcAcsRequest<CreateCustomRoutingEndpointsResponse> {
	   

	private String clientToken;

	private List<EndpointConfigurations> endpointConfigurationss;

	private String endpointGroupId;
	public CreateCustomRoutingEndpointsRequest() {
		super("Ga", "2019-11-20", "CreateCustomRoutingEndpoints", "gaplus");
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

	public List<EndpointConfigurations> getEndpointConfigurationss() {
		return this.endpointConfigurationss;
	}

	public void setEndpointConfigurationss(List<EndpointConfigurations> endpointConfigurationss) {
		this.endpointConfigurationss = endpointConfigurationss;	
		if (endpointConfigurationss != null) {
			for (int depth1 = 0; depth1 < endpointConfigurationss.size(); depth1++) {
				putQueryParameter("EndpointConfigurations." + (depth1 + 1) + ".Type" , endpointConfigurationss.get(depth1).getType());
				putQueryParameter("EndpointConfigurations." + (depth1 + 1) + ".Endpoint" , endpointConfigurationss.get(depth1).getEndpoint());
				putQueryParameter("EndpointConfigurations." + (depth1 + 1) + ".TrafficToEndpointPolicy" , endpointConfigurationss.get(depth1).getTrafficToEndpointPolicy());
				if (endpointConfigurationss.get(depth1).getPolicyConfigurationss() != null) {
					for (int depth2 = 0; depth2 < endpointConfigurationss.get(depth1).getPolicyConfigurationss().size(); depth2++) {
						putQueryParameter("EndpointConfigurations." + (depth1 + 1) + ".PolicyConfigurations." + (depth2 + 1) + ".Address" , endpointConfigurationss.get(depth1).getPolicyConfigurationss().get(depth2).getAddress());
						if (endpointConfigurationss.get(depth1).getPolicyConfigurationss().get(depth2).getPortRangess() != null) {
							for (int depth3 = 0; depth3 < endpointConfigurationss.get(depth1).getPolicyConfigurationss().get(depth2).getPortRangess().size(); depth3++) {
								putQueryParameter("EndpointConfigurations." + (depth1 + 1) + ".PolicyConfigurations." + (depth2 + 1) + ".PortRanges." + (depth3 + 1) + ".FromPort" , endpointConfigurationss.get(depth1).getPolicyConfigurationss().get(depth2).getPortRangess().get(depth3).getFromPort());
								putQueryParameter("EndpointConfigurations." + (depth1 + 1) + ".PolicyConfigurations." + (depth2 + 1) + ".PortRanges." + (depth3 + 1) + ".ToPort" , endpointConfigurationss.get(depth1).getPolicyConfigurationss().get(depth2).getPortRangess().get(depth3).getToPort());
							}
						}
					}
				}
			}
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

		private String type;

		private String endpoint;

		private String trafficToEndpointPolicy;

		private List<PolicyConfigurations> policyConfigurationss;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getEndpoint() {
			return this.endpoint;
		}

		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}

		public String getTrafficToEndpointPolicy() {
			return this.trafficToEndpointPolicy;
		}

		public void setTrafficToEndpointPolicy(String trafficToEndpointPolicy) {
			this.trafficToEndpointPolicy = trafficToEndpointPolicy;
		}

		public List<PolicyConfigurations> getPolicyConfigurationss() {
			return this.policyConfigurationss;
		}

		public void setPolicyConfigurationss(List<PolicyConfigurations> policyConfigurationss) {
			this.policyConfigurationss = policyConfigurationss;
		}

		public static class PolicyConfigurations {

			private String address;

			private List<PortRanges> portRangess;

			public String getAddress() {
				return this.address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public List<PortRanges> getPortRangess() {
				return this.portRangess;
			}

			public void setPortRangess(List<PortRanges> portRangess) {
				this.portRangess = portRangess;
			}

			public static class PortRanges {

				private Integer fromPort;

				private Integer toPort;

				public Integer getFromPort() {
					return this.fromPort;
				}

				public void setFromPort(Integer fromPort) {
					this.fromPort = fromPort;
				}

				public Integer getToPort() {
					return this.toPort;
				}

				public void setToPort(Integer toPort) {
					this.toPort = toPort;
				}
			}
		}
	}

	@Override
	public Class<CreateCustomRoutingEndpointsResponse> getResponseClass() {
		return CreateCustomRoutingEndpointsResponse.class;
	}

}
