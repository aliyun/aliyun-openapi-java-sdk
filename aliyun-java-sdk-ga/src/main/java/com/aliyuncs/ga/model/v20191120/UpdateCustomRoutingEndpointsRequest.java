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
public class UpdateCustomRoutingEndpointsRequest extends RpcAcsRequest<UpdateCustomRoutingEndpointsResponse> {
	   

	private String clientToken;

	private List<EndpointConfigurations> endpointConfigurationss;

	private String endpointGroupId;
	public UpdateCustomRoutingEndpointsRequest() {
		super("Ga", "2019-11-20", "UpdateCustomRoutingEndpoints", "gaplus");
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
				putQueryParameter("EndpointConfigurations." + (depth1 + 1) + ".TrafficToEndpointPolicy" , endpointConfigurationss.get(depth1).getTrafficToEndpointPolicy());
				putQueryParameter("EndpointConfigurations." + (depth1 + 1) + ".EndpointId" , endpointConfigurationss.get(depth1).getEndpointId());
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

		private String trafficToEndpointPolicy;

		private String endpointId;

		private List<PolicyConfigurations> policyConfigurationss;

		public String getTrafficToEndpointPolicy() {
			return this.trafficToEndpointPolicy;
		}

		public void setTrafficToEndpointPolicy(String trafficToEndpointPolicy) {
			this.trafficToEndpointPolicy = trafficToEndpointPolicy;
		}

		public String getEndpointId() {
			return this.endpointId;
		}

		public void setEndpointId(String endpointId) {
			this.endpointId = endpointId;
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

				private String fromPort;

				private String toPort;

				public String getFromPort() {
					return this.fromPort;
				}

				public void setFromPort(String fromPort) {
					this.fromPort = fromPort;
				}

				public String getToPort() {
					return this.toPort;
				}

				public void setToPort(String toPort) {
					this.toPort = toPort;
				}
			}
		}
	}

	@Override
	public Class<UpdateCustomRoutingEndpointsResponse> getResponseClass() {
		return UpdateCustomRoutingEndpointsResponse.class;
	}

}
