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
public class CreateCustomRoutingEndpointGroupsRequest extends RpcAcsRequest<CreateCustomRoutingEndpointGroupsResponse> {
	   

	private Boolean dryRun;

	private String clientToken;

	private List<EndpointGroupConfigurations> endpointGroupConfigurationss;

	private String listenerId;

	private String acceleratorId;
	public CreateCustomRoutingEndpointGroupsRequest() {
		super("Ga", "2019-11-20", "CreateCustomRoutingEndpointGroups", "gaplus");
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
				putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EndpointGroupRegion" , endpointGroupConfigurationss.get(depth1).getEndpointGroupRegion());
				putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".Name" , endpointGroupConfigurationss.get(depth1).getName());
				putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".Description" , endpointGroupConfigurationss.get(depth1).getDescription());
				if (endpointGroupConfigurationss.get(depth1).getDestinationConfigurationss() != null) {
					for (int depth2 = 0; depth2 < endpointGroupConfigurationss.get(depth1).getDestinationConfigurationss().size(); depth2++) {
						if (endpointGroupConfigurationss.get(depth1).getDestinationConfigurationss().get(depth2).getProtocolss() != null) {
							for (int i = 0; i < endpointGroupConfigurationss.get(depth1).getDestinationConfigurationss().get(depth2).getProtocolss().size(); i++) {
								putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".DestinationConfigurations." + (depth2 + 1) + ".Protocols." + (i + 1) , endpointGroupConfigurationss.get(depth1).getDestinationConfigurationss().get(depth2).getProtocolss().get(i));
							}
						}
						putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".DestinationConfigurations." + (depth2 + 1) + ".FromPort" , endpointGroupConfigurationss.get(depth1).getDestinationConfigurationss().get(depth2).getFromPort());
						putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".DestinationConfigurations." + (depth2 + 1) + ".ToPort" , endpointGroupConfigurationss.get(depth1).getDestinationConfigurationss().get(depth2).getToPort());
					}
				}
				if (endpointGroupConfigurationss.get(depth1).getEndpointConfigurationss() != null) {
					for (int depth2 = 0; depth2 < endpointGroupConfigurationss.get(depth1).getEndpointConfigurationss().size(); depth2++) {
						putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EndpointConfigurations." + (depth2 + 1) + ".Type" , endpointGroupConfigurationss.get(depth1).getEndpointConfigurationss().get(depth2).getType());
						putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EndpointConfigurations." + (depth2 + 1) + ".Endpoint" , endpointGroupConfigurationss.get(depth1).getEndpointConfigurationss().get(depth2).getEndpoint());
						putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EndpointConfigurations." + (depth2 + 1) + ".TrafficToEndpointPolicy" , endpointGroupConfigurationss.get(depth1).getEndpointConfigurationss().get(depth2).getTrafficToEndpointPolicy());
						if (endpointGroupConfigurationss.get(depth1).getEndpointConfigurationss().get(depth2).getPolicyConfigurationss() != null) {
							for (int depth3 = 0; depth3 < endpointGroupConfigurationss.get(depth1).getEndpointConfigurationss().get(depth2).getPolicyConfigurationss().size(); depth3++) {
								putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EndpointConfigurations." + (depth2 + 1) + ".PolicyConfigurations." + (depth3 + 1) + ".Address" , endpointGroupConfigurationss.get(depth1).getEndpointConfigurationss().get(depth2).getPolicyConfigurationss().get(depth3).getAddress());
								if (endpointGroupConfigurationss.get(depth1).getEndpointConfigurationss().get(depth2).getPolicyConfigurationss().get(depth3).getPortRangess() != null) {
									for (int depth4 = 0; depth4 < endpointGroupConfigurationss.get(depth1).getEndpointConfigurationss().get(depth2).getPolicyConfigurationss().get(depth3).getPortRangess().size(); depth4++) {
										putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EndpointConfigurations." + (depth2 + 1) + ".PolicyConfigurations." + (depth3 + 1) + ".PortRanges." + (depth4 + 1) + ".FromPort" , endpointGroupConfigurationss.get(depth1).getEndpointConfigurationss().get(depth2).getPolicyConfigurationss().get(depth3).getPortRangess().get(depth4).getFromPort());
										putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EndpointConfigurations." + (depth2 + 1) + ".PolicyConfigurations." + (depth3 + 1) + ".PortRanges." + (depth4 + 1) + ".ToPort" , endpointGroupConfigurationss.get(depth1).getEndpointConfigurationss().get(depth2).getPolicyConfigurationss().get(depth3).getPortRangess().get(depth4).getToPort());
									}
								}
							}
						}
					}
				}
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

		private String endpointGroupRegion;

		private String name;

		private String description;

		private List<DestinationConfigurations> destinationConfigurationss;

		private List<EndpointConfigurations> endpointConfigurationss;

		public String getEndpointGroupRegion() {
			return this.endpointGroupRegion;
		}

		public void setEndpointGroupRegion(String endpointGroupRegion) {
			this.endpointGroupRegion = endpointGroupRegion;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<DestinationConfigurations> getDestinationConfigurationss() {
			return this.destinationConfigurationss;
		}

		public void setDestinationConfigurationss(List<DestinationConfigurations> destinationConfigurationss) {
			this.destinationConfigurationss = destinationConfigurationss;
		}

		public List<EndpointConfigurations> getEndpointConfigurationss() {
			return this.endpointConfigurationss;
		}

		public void setEndpointConfigurationss(List<EndpointConfigurations> endpointConfigurationss) {
			this.endpointConfigurationss = endpointConfigurationss;
		}

		public static class DestinationConfigurations {

			private List<String> protocolss;

			private Integer fromPort;

			private Integer toPort;

			public List<String> getProtocolss() {
				return this.protocolss;
			}

			public void setProtocolss(List<String> protocolss) {
				this.protocolss = protocolss;
			}

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
	}

	@Override
	public Class<CreateCustomRoutingEndpointGroupsResponse> getResponseClass() {
		return CreateCustomRoutingEndpointGroupsResponse.class;
	}

}
