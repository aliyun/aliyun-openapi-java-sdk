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

package com.aliyuncs.servicemesh.model.v20200111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.servicemesh.transform.v20200111.DescribeServiceMeshDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeServiceMeshDetailResponse extends AcsResponse {

	private String requestId;

	private ServiceMesh serviceMesh;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ServiceMesh getServiceMesh() {
		return this.serviceMesh;
	}

	public void setServiceMesh(ServiceMesh serviceMesh) {
		this.serviceMesh = serviceMesh;
	}

	public static class ServiceMesh {

		private List<String> clusters;

		private Endpoints endpoints;

		private ServiceMeshInfo serviceMeshInfo;

		private Spec spec;

		public List<String> getClusters() {
			return this.clusters;
		}

		public void setClusters(List<String> clusters) {
			this.clusters = clusters;
		}

		public Endpoints getEndpoints() {
			return this.endpoints;
		}

		public void setEndpoints(Endpoints endpoints) {
			this.endpoints = endpoints;
		}

		public ServiceMeshInfo getServiceMeshInfo() {
			return this.serviceMeshInfo;
		}

		public void setServiceMeshInfo(ServiceMeshInfo serviceMeshInfo) {
			this.serviceMeshInfo = serviceMeshInfo;
		}

		public Spec getSpec() {
			return this.spec;
		}

		public void setSpec(Spec spec) {
			this.spec = spec;
		}

		public static class Endpoints {

			private String intranetApiServerEndpoint;

			private String intranetPilotEndpoint;

			private String publicApiServerEndpoint;

			private String publicPilotEndpoint;

			public String getIntranetApiServerEndpoint() {
				return this.intranetApiServerEndpoint;
			}

			public void setIntranetApiServerEndpoint(String intranetApiServerEndpoint) {
				this.intranetApiServerEndpoint = intranetApiServerEndpoint;
			}

			public String getIntranetPilotEndpoint() {
				return this.intranetPilotEndpoint;
			}

			public void setIntranetPilotEndpoint(String intranetPilotEndpoint) {
				this.intranetPilotEndpoint = intranetPilotEndpoint;
			}

			public String getPublicApiServerEndpoint() {
				return this.publicApiServerEndpoint;
			}

			public void setPublicApiServerEndpoint(String publicApiServerEndpoint) {
				this.publicApiServerEndpoint = publicApiServerEndpoint;
			}

			public String getPublicPilotEndpoint() {
				return this.publicPilotEndpoint;
			}

			public void setPublicPilotEndpoint(String publicPilotEndpoint) {
				this.publicPilotEndpoint = publicPilotEndpoint;
			}
		}

		public static class ServiceMeshInfo {

			private String creationTime;

			private String errorMessage;

			private String name;

			private String regionId;

			private String serviceMeshId;

			private String state;

			private String updateTime;

			private String version;

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getServiceMeshId() {
				return this.serviceMeshId;
			}

			public void setServiceMeshId(String serviceMeshId) {
				this.serviceMeshId = serviceMeshId;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(String updateTime) {
				this.updateTime = updateTime;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}
		}

		public static class Spec {

			private LoadBalancer loadBalancer;

			private MeshConfig meshConfig;

			private Network network;

			public LoadBalancer getLoadBalancer() {
				return this.loadBalancer;
			}

			public void setLoadBalancer(LoadBalancer loadBalancer) {
				this.loadBalancer = loadBalancer;
			}

			public MeshConfig getMeshConfig() {
				return this.meshConfig;
			}

			public void setMeshConfig(MeshConfig meshConfig) {
				this.meshConfig = meshConfig;
			}

			public Network getNetwork() {
				return this.network;
			}

			public void setNetwork(Network network) {
				this.network = network;
			}

			public static class LoadBalancer {

				private String apiServerLoadbalancerId;

				private Boolean apiServerPublicEip;

				private Boolean pilotPublicEip;

				private String pilotPublicLoadbalancerId;

				public String getApiServerLoadbalancerId() {
					return this.apiServerLoadbalancerId;
				}

				public void setApiServerLoadbalancerId(String apiServerLoadbalancerId) {
					this.apiServerLoadbalancerId = apiServerLoadbalancerId;
				}

				public Boolean getApiServerPublicEip() {
					return this.apiServerPublicEip;
				}

				public void setApiServerPublicEip(Boolean apiServerPublicEip) {
					this.apiServerPublicEip = apiServerPublicEip;
				}

				public Boolean getPilotPublicEip() {
					return this.pilotPublicEip;
				}

				public void setPilotPublicEip(Boolean pilotPublicEip) {
					this.pilotPublicEip = pilotPublicEip;
				}

				public String getPilotPublicLoadbalancerId() {
					return this.pilotPublicLoadbalancerId;
				}

				public void setPilotPublicLoadbalancerId(String pilotPublicLoadbalancerId) {
					this.pilotPublicLoadbalancerId = pilotPublicLoadbalancerId;
				}
			}

			public static class MeshConfig {

				private Boolean enableLocalityLB;

				private Boolean telemetry;

				private Boolean tracing;

				private Boolean customizedZipkin;

				private String outboundTrafficPolicy;

				private String includeIPRanges;

				private Pilot pilot;

				private OPA oPA;

				private Audit audit;

				private Proxy proxy;

				private SidecarInjector sidecarInjector;

				public Boolean getEnableLocalityLB() {
					return this.enableLocalityLB;
				}

				public void setEnableLocalityLB(Boolean enableLocalityLB) {
					this.enableLocalityLB = enableLocalityLB;
				}

				public Boolean getTelemetry() {
					return this.telemetry;
				}

				public void setTelemetry(Boolean telemetry) {
					this.telemetry = telemetry;
				}

				public Boolean getTracing() {
					return this.tracing;
				}

				public void setTracing(Boolean tracing) {
					this.tracing = tracing;
				}

				public Boolean getCustomizedZipkin() {
					return this.customizedZipkin;
				}

				public void setCustomizedZipkin(Boolean customizedZipkin) {
					this.customizedZipkin = customizedZipkin;
				}

				public String getOutboundTrafficPolicy() {
					return this.outboundTrafficPolicy;
				}

				public void setOutboundTrafficPolicy(String outboundTrafficPolicy) {
					this.outboundTrafficPolicy = outboundTrafficPolicy;
				}

				public String getIncludeIPRanges() {
					return this.includeIPRanges;
				}

				public void setIncludeIPRanges(String includeIPRanges) {
					this.includeIPRanges = includeIPRanges;
				}

				public Pilot getPilot() {
					return this.pilot;
				}

				public void setPilot(Pilot pilot) {
					this.pilot = pilot;
				}

				public OPA getOPA() {
					return this.oPA;
				}

				public void setOPA(OPA oPA) {
					this.oPA = oPA;
				}

				public Audit getAudit() {
					return this.audit;
				}

				public void setAudit(Audit audit) {
					this.audit = audit;
				}

				public Proxy getProxy() {
					return this.proxy;
				}

				public void setProxy(Proxy proxy) {
					this.proxy = proxy;
				}

				public SidecarInjector getSidecarInjector() {
					return this.sidecarInjector;
				}

				public void setSidecarInjector(SidecarInjector sidecarInjector) {
					this.sidecarInjector = sidecarInjector;
				}

				public static class Pilot {

					private Float traceSampling;

					private Boolean http10Enabled;

					public Float getTraceSampling() {
						return this.traceSampling;
					}

					public void setTraceSampling(Float traceSampling) {
						this.traceSampling = traceSampling;
					}

					public Boolean getHttp10Enabled() {
						return this.http10Enabled;
					}

					public void setHttp10Enabled(Boolean http10Enabled) {
						this.http10Enabled = http10Enabled;
					}
				}

				public static class OPA {

					private Boolean enabled;

					private String logLevel;

					private String requestCPU;

					private String requestMemory;

					private String limitCPU;

					private String limitMemory;

					public Boolean getEnabled() {
						return this.enabled;
					}

					public void setEnabled(Boolean enabled) {
						this.enabled = enabled;
					}

					public String getLogLevel() {
						return this.logLevel;
					}

					public void setLogLevel(String logLevel) {
						this.logLevel = logLevel;
					}

					public String getRequestCPU() {
						return this.requestCPU;
					}

					public void setRequestCPU(String requestCPU) {
						this.requestCPU = requestCPU;
					}

					public String getRequestMemory() {
						return this.requestMemory;
					}

					public void setRequestMemory(String requestMemory) {
						this.requestMemory = requestMemory;
					}

					public String getLimitCPU() {
						return this.limitCPU;
					}

					public void setLimitCPU(String limitCPU) {
						this.limitCPU = limitCPU;
					}

					public String getLimitMemory() {
						return this.limitMemory;
					}

					public void setLimitMemory(String limitMemory) {
						this.limitMemory = limitMemory;
					}
				}

				public static class Audit {

					private Boolean enabled;

					private String project;

					public Boolean getEnabled() {
						return this.enabled;
					}

					public void setEnabled(Boolean enabled) {
						this.enabled = enabled;
					}

					public String getProject() {
						return this.project;
					}

					public void setProject(String project) {
						this.project = project;
					}
				}

				public static class Proxy {

					private String clusterDomain;

					private String requestCPU;

					private String requestMemory;

					private String limitCPU;

					private String limitMemory;

					public String getClusterDomain() {
						return this.clusterDomain;
					}

					public void setClusterDomain(String clusterDomain) {
						this.clusterDomain = clusterDomain;
					}

					public String getRequestCPU() {
						return this.requestCPU;
					}

					public void setRequestCPU(String requestCPU) {
						this.requestCPU = requestCPU;
					}

					public String getRequestMemory() {
						return this.requestMemory;
					}

					public void setRequestMemory(String requestMemory) {
						this.requestMemory = requestMemory;
					}

					public String getLimitCPU() {
						return this.limitCPU;
					}

					public void setLimitCPU(String limitCPU) {
						this.limitCPU = limitCPU;
					}

					public String getLimitMemory() {
						return this.limitMemory;
					}

					public void setLimitMemory(String limitMemory) {
						this.limitMemory = limitMemory;
					}
				}

				public static class SidecarInjector {

					private Boolean enableNamespacesByDefault;

					private Boolean autoInjectionPolicyEnabled;

					private String requestCPU;

					private String requestMemory;

					private String limitCPU;

					private String limitMemory;

					private String sidecarInjectorWebhookAsYaml;

					private InitCNIConfiguration initCNIConfiguration;

					public Boolean getEnableNamespacesByDefault() {
						return this.enableNamespacesByDefault;
					}

					public void setEnableNamespacesByDefault(Boolean enableNamespacesByDefault) {
						this.enableNamespacesByDefault = enableNamespacesByDefault;
					}

					public Boolean getAutoInjectionPolicyEnabled() {
						return this.autoInjectionPolicyEnabled;
					}

					public void setAutoInjectionPolicyEnabled(Boolean autoInjectionPolicyEnabled) {
						this.autoInjectionPolicyEnabled = autoInjectionPolicyEnabled;
					}

					public String getRequestCPU() {
						return this.requestCPU;
					}

					public void setRequestCPU(String requestCPU) {
						this.requestCPU = requestCPU;
					}

					public String getRequestMemory() {
						return this.requestMemory;
					}

					public void setRequestMemory(String requestMemory) {
						this.requestMemory = requestMemory;
					}

					public String getLimitCPU() {
						return this.limitCPU;
					}

					public void setLimitCPU(String limitCPU) {
						this.limitCPU = limitCPU;
					}

					public String getLimitMemory() {
						return this.limitMemory;
					}

					public void setLimitMemory(String limitMemory) {
						this.limitMemory = limitMemory;
					}

					public String getSidecarInjectorWebhookAsYaml() {
						return this.sidecarInjectorWebhookAsYaml;
					}

					public void setSidecarInjectorWebhookAsYaml(String sidecarInjectorWebhookAsYaml) {
						this.sidecarInjectorWebhookAsYaml = sidecarInjectorWebhookAsYaml;
					}

					public InitCNIConfiguration getInitCNIConfiguration() {
						return this.initCNIConfiguration;
					}

					public void setInitCNIConfiguration(InitCNIConfiguration initCNIConfiguration) {
						this.initCNIConfiguration = initCNIConfiguration;
					}

					public static class InitCNIConfiguration {

						private Boolean enabled;

						private String excludeNamespaces;

						public Boolean getEnabled() {
							return this.enabled;
						}

						public void setEnabled(Boolean enabled) {
							this.enabled = enabled;
						}

						public String getExcludeNamespaces() {
							return this.excludeNamespaces;
						}

						public void setExcludeNamespaces(String excludeNamespaces) {
							this.excludeNamespaces = excludeNamespaces;
						}
					}
				}
			}

			public static class Network {

				private String securityGroupId;

				private String vpcId;

				private List<String> vSwitches;

				public String getSecurityGroupId() {
					return this.securityGroupId;
				}

				public void setSecurityGroupId(String securityGroupId) {
					this.securityGroupId = securityGroupId;
				}

				public String getVpcId() {
					return this.vpcId;
				}

				public void setVpcId(String vpcId) {
					this.vpcId = vpcId;
				}

				public List<String> getVSwitches() {
					return this.vSwitches;
				}

				public void setVSwitches(List<String> vSwitches) {
					this.vSwitches = vSwitches;
				}
			}
		}
	}

	@Override
	public DescribeServiceMeshDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeServiceMeshDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
