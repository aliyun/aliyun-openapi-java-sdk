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
public class CreateListenerRequest extends RpcAcsRequest<CreateListenerResponse> {
	   

	private String clientToken;

	private String description;

	private List<CustomRoutingEndpointGroupConfigurations> customRoutingEndpointGroupConfigurations;

	private String type;

	private String protocol;

	private String acceleratorId;

	private List<EndpointGroupConfigurations> endpointGroupConfigurations;

	private XForwardedForConfig xForwardedForConfig;

	private String securityPolicyId;

	private Boolean proxyProtocol;

	private List<PortRanges> portRangess;

	private List<Certificates> certificatess;

	private String name;

	private String clientAffinity;
	public CreateListenerRequest() {
		super("Ga", "2019-11-20", "CreateListener", "gaplus");
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public List<CustomRoutingEndpointGroupConfigurations> getCustomRoutingEndpointGroupConfigurations() {
		return this.customRoutingEndpointGroupConfigurations;
	}

	public void setCustomRoutingEndpointGroupConfigurations(List<CustomRoutingEndpointGroupConfigurations> customRoutingEndpointGroupConfigurations) {
		this.customRoutingEndpointGroupConfigurations = customRoutingEndpointGroupConfigurations;	
		if (customRoutingEndpointGroupConfigurations != null) {
			for (int depth1 = 0; depth1 < customRoutingEndpointGroupConfigurations.size(); depth1++) {
				if (customRoutingEndpointGroupConfigurations.get(depth1) != null) {
					
						putQueryParameter("CustomRoutingEndpointGroupConfigurations." + (depth1 + 1) + ".EndpointGroupRegion" , customRoutingEndpointGroupConfigurations.get(depth1).getEndpointGroupRegion());
						putQueryParameter("CustomRoutingEndpointGroupConfigurations." + (depth1 + 1) + ".Name" , customRoutingEndpointGroupConfigurations.get(depth1).getName());
						putQueryParameter("CustomRoutingEndpointGroupConfigurations." + (depth1 + 1) + ".Description" , customRoutingEndpointGroupConfigurations.get(depth1).getDescription());
						if (customRoutingEndpointGroupConfigurations.get(depth1).getDestinationConfigurations() != null) {
							for (int depth2 = 0; depth2 < customRoutingEndpointGroupConfigurations.get(depth1).getDestinationConfigurations().size(); depth2++) {
								if (customRoutingEndpointGroupConfigurations.get(depth1).getDestinationConfigurations().get(depth2) != null) {
									
										if (customRoutingEndpointGroupConfigurations.get(depth1).getDestinationConfigurations().get(depth2).getProtocols() != null) {
											for (int depth3 = 0; depth3 < customRoutingEndpointGroupConfigurations.get(depth1).getDestinationConfigurations().get(depth2).getProtocols().size(); depth3++) {
												putQueryParameter("CustomRoutingEndpointGroupConfigurations." + (depth1 + 1) + ".DestinationConfigurations." + (depth2 + 1) + ".Protocols." + (depth3 + 1) , customRoutingEndpointGroupConfigurations.get(depth1).getDestinationConfigurations().get(depth2).getProtocols().get(depth3));
											}
										}
										putQueryParameter("CustomRoutingEndpointGroupConfigurations." + (depth1 + 1) + ".DestinationConfigurations." + (depth2 + 1) + ".FromPort" , customRoutingEndpointGroupConfigurations.get(depth1).getDestinationConfigurations().get(depth2).getFromPort());
										putQueryParameter("CustomRoutingEndpointGroupConfigurations." + (depth1 + 1) + ".DestinationConfigurations." + (depth2 + 1) + ".ToPort" , customRoutingEndpointGroupConfigurations.get(depth1).getDestinationConfigurations().get(depth2).getToPort());
								}
							}
						}
						if (customRoutingEndpointGroupConfigurations.get(depth1).getEndpointConfigurations() != null) {
							for (int depth2 = 0; depth2 < customRoutingEndpointGroupConfigurations.get(depth1).getEndpointConfigurations().size(); depth2++) {
								if (customRoutingEndpointGroupConfigurations.get(depth1).getEndpointConfigurations().get(depth2) != null) {
									
										putQueryParameter("CustomRoutingEndpointGroupConfigurations." + (depth1 + 1) + ".EndpointConfigurations." + (depth2 + 1) + ".Type" , customRoutingEndpointGroupConfigurations.get(depth1).getEndpointConfigurations().get(depth2).getType());
										putQueryParameter("CustomRoutingEndpointGroupConfigurations." + (depth1 + 1) + ".EndpointConfigurations." + (depth2 + 1) + ".Endpoint" , customRoutingEndpointGroupConfigurations.get(depth1).getEndpointConfigurations().get(depth2).getEndpoint());
										putQueryParameter("CustomRoutingEndpointGroupConfigurations." + (depth1 + 1) + ".EndpointConfigurations." + (depth2 + 1) + ".TrafficToEndpointPolicy" , customRoutingEndpointGroupConfigurations.get(depth1).getEndpointConfigurations().get(depth2).getTrafficToEndpointPolicy());
										if (customRoutingEndpointGroupConfigurations.get(depth1).getEndpointConfigurations().get(depth2).getPolicyConfigurations() != null) {
											for (int depth3 = 0; depth3 < customRoutingEndpointGroupConfigurations.get(depth1).getEndpointConfigurations().get(depth2).getPolicyConfigurations().size(); depth3++) {
												if (customRoutingEndpointGroupConfigurations.get(depth1).getEndpointConfigurations().get(depth2).getPolicyConfigurations().get(depth3) != null) {
													
														putQueryParameter("CustomRoutingEndpointGroupConfigurations." + (depth1 + 1) + ".EndpointConfigurations." + (depth2 + 1) + ".PolicyConfigurations." + (depth3 + 1) + ".Address" , customRoutingEndpointGroupConfigurations.get(depth1).getEndpointConfigurations().get(depth2).getPolicyConfigurations().get(depth3).getAddress());
														if (customRoutingEndpointGroupConfigurations.get(depth1).getEndpointConfigurations().get(depth2).getPolicyConfigurations().get(depth3).getPortRanges() != null) {
															for (int depth4 = 0; depth4 < customRoutingEndpointGroupConfigurations.get(depth1).getEndpointConfigurations().get(depth2).getPolicyConfigurations().get(depth3).getPortRanges().size(); depth4++) {
																if (customRoutingEndpointGroupConfigurations.get(depth1).getEndpointConfigurations().get(depth2).getPolicyConfigurations().get(depth3).getPortRanges().get(depth4) != null) {
																	
																		putQueryParameter("CustomRoutingEndpointGroupConfigurations." + (depth1 + 1) + ".EndpointConfigurations." + (depth2 + 1) + ".PolicyConfigurations." + (depth3 + 1) + ".PortRanges." + (depth4 + 1) + ".FromPort" , customRoutingEndpointGroupConfigurations.get(depth1).getEndpointConfigurations().get(depth2).getPolicyConfigurations().get(depth3).getPortRanges().get(depth4).getFromPort());
																		putQueryParameter("CustomRoutingEndpointGroupConfigurations." + (depth1 + 1) + ".EndpointConfigurations." + (depth2 + 1) + ".PolicyConfigurations." + (depth3 + 1) + ".PortRanges." + (depth4 + 1) + ".ToPort" , customRoutingEndpointGroupConfigurations.get(depth1).getEndpointConfigurations().get(depth2).getPolicyConfigurations().get(depth3).getPortRanges().get(depth4).getToPort());
																}
															}
														}
												}
											}
										}
								}
							}
						}
				}
			}
		}	
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
		if(protocol != null){
			putQueryParameter("Protocol", protocol);
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

	public List<EndpointGroupConfigurations> getEndpointGroupConfigurations() {
		return this.endpointGroupConfigurations;
	}

	public void setEndpointGroupConfigurations(List<EndpointGroupConfigurations> endpointGroupConfigurations) {
		this.endpointGroupConfigurations = endpointGroupConfigurations;	
		if (endpointGroupConfigurations != null) {
			for (int depth1 = 0; depth1 < endpointGroupConfigurations.size(); depth1++) {
				if (endpointGroupConfigurations.get(depth1) != null) {
					
						putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EndpointGroupName" , endpointGroupConfigurations.get(depth1).getEndpointGroupName());
						putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EndpointGroupDescription" , endpointGroupConfigurations.get(depth1).getEndpointGroupDescription());
						putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EndpointGroupRegion" , endpointGroupConfigurations.get(depth1).getEndpointGroupRegion());
						putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".TrafficPercentage" , endpointGroupConfigurations.get(depth1).getTrafficPercentage());
						putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".HealthCheckEnabled" , endpointGroupConfigurations.get(depth1).getHealthCheckEnabled());
						putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".HealthCheckIntervalSeconds" , endpointGroupConfigurations.get(depth1).getHealthCheckIntervalSeconds());
						putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".HealthCheckPath" , endpointGroupConfigurations.get(depth1).getHealthCheckPath());
						putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".HealthCheckPort" , endpointGroupConfigurations.get(depth1).getHealthCheckPort());
						putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".HealthCheckProtocol" , endpointGroupConfigurations.get(depth1).getHealthCheckProtocol());
						putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".ThresholdCount" , endpointGroupConfigurations.get(depth1).getThresholdCount());
						if (endpointGroupConfigurations.get(depth1).getEndpointConfigurations() != null) {
							for (int depth2 = 0; depth2 < endpointGroupConfigurations.get(depth1).getEndpointConfigurations().size(); depth2++) {
								if (endpointGroupConfigurations.get(depth1).getEndpointConfigurations().get(depth2) != null) {
									
										putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EndpointConfigurations." + (depth2 + 1) + ".Type" , endpointGroupConfigurations.get(depth1).getEndpointConfigurations().get(depth2).getType());
										putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EndpointConfigurations." + (depth2 + 1) + ".Weight" , endpointGroupConfigurations.get(depth1).getEndpointConfigurations().get(depth2).getWeight());
										putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EndpointConfigurations." + (depth2 + 1) + ".Endpoint" , endpointGroupConfigurations.get(depth1).getEndpointConfigurations().get(depth2).getEndpoint());
								}
							}
						}
						putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EndpointRequestProtocol" , endpointGroupConfigurations.get(depth1).getEndpointRequestProtocol());
						putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EndpointGroupType" , endpointGroupConfigurations.get(depth1).getEndpointGroupType());
						if (endpointGroupConfigurations.get(depth1).getPortOverrides() != null) {
							for (int depth2 = 0; depth2 < endpointGroupConfigurations.get(depth1).getPortOverrides().size(); depth2++) {
								if (endpointGroupConfigurations.get(depth1).getPortOverrides().get(depth2) != null) {
									
										putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".PortOverrides." + (depth2 + 1) + ".ListenerPort" , endpointGroupConfigurations.get(depth1).getPortOverrides().get(depth2).getListenerPort());
										putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".PortOverrides." + (depth2 + 1) + ".EndpointPort" , endpointGroupConfigurations.get(depth1).getPortOverrides().get(depth2).getEndpointPort());
								}
							}
						}
						putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EnableClientIPPreservationToa" , endpointGroupConfigurations.get(depth1).getEnableClientIPPreservationToa());
						putQueryParameter("EndpointGroupConfigurations." + (depth1 + 1) + ".EnableClientIPPreservationProxyProtocol" , endpointGroupConfigurations.get(depth1).getEnableClientIPPreservationProxyProtocol());
				}
			}
		}	
	}

	public XForwardedForConfig getXForwardedForConfig() {
		return this.xForwardedForConfig;
	}

	public void setXForwardedForConfig(XForwardedForConfig xForwardedForConfig) {
		this.xForwardedForConfig = xForwardedForConfig;	
		if (xForwardedForConfig != null) {
			
				putQueryParameter("XForwardedForConfig.XForwardedForGaIdEnabled" , xForwardedForConfig.getXForwardedForGaIdEnabled());
				putQueryParameter("XForwardedForConfig.XForwardedForGaApEnabled" , xForwardedForConfig.getXForwardedForGaApEnabled());
				putQueryParameter("XForwardedForConfig.XForwardedForProtoEnabled" , xForwardedForConfig.getXForwardedForProtoEnabled());
				putQueryParameter("XForwardedForConfig.XForwardedForPortEnabled" , xForwardedForConfig.getXForwardedForPortEnabled());
				putQueryParameter("XForwardedForConfig.XRealIpEnabled" , xForwardedForConfig.getXRealIpEnabled());
		}	
	}

	public String getSecurityPolicyId() {
		return this.securityPolicyId;
	}

	public void setSecurityPolicyId(String securityPolicyId) {
		this.securityPolicyId = securityPolicyId;
		if(securityPolicyId != null){
			putQueryParameter("SecurityPolicyId", securityPolicyId);
		}
	}

	public Boolean getProxyProtocol() {
		return this.proxyProtocol;
	}

	public void setProxyProtocol(Boolean proxyProtocol) {
		this.proxyProtocol = proxyProtocol;
		if(proxyProtocol != null){
			putQueryParameter("ProxyProtocol", proxyProtocol.toString());
		}
	}

	public List<PortRanges> getPortRangess() {
		return this.portRangess;
	}

	public void setPortRangess(List<PortRanges> portRangess) {
		this.portRangess = portRangess;	
		if (portRangess != null) {
			for (int depth1 = 0; depth1 < portRangess.size(); depth1++) {
				putQueryParameter("PortRanges." + (depth1 + 1) + ".FromPort" , portRangess.get(depth1).getFromPort());
				putQueryParameter("PortRanges." + (depth1 + 1) + ".ToPort" , portRangess.get(depth1).getToPort());
			}
		}	
	}

	public List<Certificates> getCertificatess() {
		return this.certificatess;
	}

	public void setCertificatess(List<Certificates> certificatess) {
		this.certificatess = certificatess;	
		if (certificatess != null) {
			for (int depth1 = 0; depth1 < certificatess.size(); depth1++) {
				putQueryParameter("Certificates." + (depth1 + 1) + ".Id" , certificatess.get(depth1).getId());
			}
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

	public String getClientAffinity() {
		return this.clientAffinity;
	}

	public void setClientAffinity(String clientAffinity) {
		this.clientAffinity = clientAffinity;
		if(clientAffinity != null){
			putQueryParameter("ClientAffinity", clientAffinity);
		}
	}

	public static class CustomRoutingEndpointGroupConfigurations {

		private String endpointGroupRegion;

		private String name;

		private String description;

		private List<DestinationConfigurationsItem> destinationConfigurations;

		private List<EndpointConfigurationsItem> endpointConfigurations;

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

		public List<DestinationConfigurationsItem> getDestinationConfigurations() {
			return this.destinationConfigurations;
		}

		public void setDestinationConfigurations(List<DestinationConfigurationsItem> destinationConfigurations) {
			this.destinationConfigurations = destinationConfigurations;
		}

		public List<EndpointConfigurationsItem> getEndpointConfigurations() {
			return this.endpointConfigurations;
		}

		public void setEndpointConfigurations(List<EndpointConfigurationsItem> endpointConfigurations) {
			this.endpointConfigurations = endpointConfigurations;
		}

		public static class DestinationConfigurationsItem {

			private List<String> protocols;

			private Integer fromPort;

			private Integer toPort;

			public List<String> getProtocols() {
				return this.protocols;
			}

			public void setProtocols(List<String> protocols) {
				this.protocols = protocols;
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

		public static class EndpointConfigurationsItem {

			private String type;

			private String endpoint;

			private String trafficToEndpointPolicy;

			private List<PolicyConfigurationsItem> policyConfigurations;

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

			public List<PolicyConfigurationsItem> getPolicyConfigurations() {
				return this.policyConfigurations;
			}

			public void setPolicyConfigurations(List<PolicyConfigurationsItem> policyConfigurations) {
				this.policyConfigurations = policyConfigurations;
			}

			public static class PolicyConfigurationsItem {

				private String address;

				private List<PortRangesItem> portRanges;

				public String getAddress() {
					return this.address;
				}

				public void setAddress(String address) {
					this.address = address;
				}

				public List<PortRangesItem> getPortRanges() {
					return this.portRanges;
				}

				public void setPortRanges(List<PortRangesItem> portRanges) {
					this.portRanges = portRanges;
				}

				public static class PortRangesItem {

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

		private List<EndpointConfigurationsItem> endpointConfigurations;

		private String endpointRequestProtocol;

		private String endpointGroupType;

		private List<PortOverridesItem> portOverrides;

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

		public List<EndpointConfigurationsItem> getEndpointConfigurations() {
			return this.endpointConfigurations;
		}

		public void setEndpointConfigurations(List<EndpointConfigurationsItem> endpointConfigurations) {
			this.endpointConfigurations = endpointConfigurations;
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

		public List<PortOverridesItem> getPortOverrides() {
			return this.portOverrides;
		}

		public void setPortOverrides(List<PortOverridesItem> portOverrides) {
			this.portOverrides = portOverrides;
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

		public static class EndpointConfigurationsItem {

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

		public static class PortOverridesItem {

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

	public static class XForwardedForConfig {

		private Boolean xForwardedForGaIdEnabled;

		private Boolean xForwardedForGaApEnabled;

		private Boolean xForwardedForProtoEnabled;

		private Boolean xForwardedForPortEnabled;

		private Boolean xRealIpEnabled;

		public Boolean getXForwardedForGaIdEnabled() {
			return this.xForwardedForGaIdEnabled;
		}

		public void setXForwardedForGaIdEnabled(Boolean xForwardedForGaIdEnabled) {
			this.xForwardedForGaIdEnabled = xForwardedForGaIdEnabled;
		}

		public Boolean getXForwardedForGaApEnabled() {
			return this.xForwardedForGaApEnabled;
		}

		public void setXForwardedForGaApEnabled(Boolean xForwardedForGaApEnabled) {
			this.xForwardedForGaApEnabled = xForwardedForGaApEnabled;
		}

		public Boolean getXForwardedForProtoEnabled() {
			return this.xForwardedForProtoEnabled;
		}

		public void setXForwardedForProtoEnabled(Boolean xForwardedForProtoEnabled) {
			this.xForwardedForProtoEnabled = xForwardedForProtoEnabled;
		}

		public Boolean getXForwardedForPortEnabled() {
			return this.xForwardedForPortEnabled;
		}

		public void setXForwardedForPortEnabled(Boolean xForwardedForPortEnabled) {
			this.xForwardedForPortEnabled = xForwardedForPortEnabled;
		}

		public Boolean getXRealIpEnabled() {
			return this.xRealIpEnabled;
		}

		public void setXRealIpEnabled(Boolean xRealIpEnabled) {
			this.xRealIpEnabled = xRealIpEnabled;
		}
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

	public static class Certificates {

		private String id;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	@Override
	public Class<CreateListenerResponse> getResponseClass() {
		return CreateListenerResponse.class;
	}

}
