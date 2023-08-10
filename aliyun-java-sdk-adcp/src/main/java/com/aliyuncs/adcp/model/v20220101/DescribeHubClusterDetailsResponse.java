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

package com.aliyuncs.adcp.model.v20220101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adcp.transform.v20220101.DescribeHubClusterDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHubClusterDetailsResponse extends AcsResponse {

	private String requestId;

	private Cluster cluster;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Cluster getCluster() {
		return this.cluster;
	}

	public void setCluster(Cluster cluster) {
		this.cluster = cluster;
	}

	public static class Cluster {

		private List<Condition> conditions;

		private Endpoints endpoints;

		private ClusterInfo clusterInfo;

		private Network network;

		private ApiServer apiServer;

		private MeshConfig meshConfig;

		private LogConfig logConfig;

		private WorkflowConfig workflowConfig;

		public List<Condition> getConditions() {
			return this.conditions;
		}

		public void setConditions(List<Condition> conditions) {
			this.conditions = conditions;
		}

		public Endpoints getEndpoints() {
			return this.endpoints;
		}

		public void setEndpoints(Endpoints endpoints) {
			this.endpoints = endpoints;
		}

		public ClusterInfo getClusterInfo() {
			return this.clusterInfo;
		}

		public void setClusterInfo(ClusterInfo clusterInfo) {
			this.clusterInfo = clusterInfo;
		}

		public Network getNetwork() {
			return this.network;
		}

		public void setNetwork(Network network) {
			this.network = network;
		}

		public ApiServer getApiServer() {
			return this.apiServer;
		}

		public void setApiServer(ApiServer apiServer) {
			this.apiServer = apiServer;
		}

		public MeshConfig getMeshConfig() {
			return this.meshConfig;
		}

		public void setMeshConfig(MeshConfig meshConfig) {
			this.meshConfig = meshConfig;
		}

		public LogConfig getLogConfig() {
			return this.logConfig;
		}

		public void setLogConfig(LogConfig logConfig) {
			this.logConfig = logConfig;
		}

		public WorkflowConfig getWorkflowConfig() {
			return this.workflowConfig;
		}

		public void setWorkflowConfig(WorkflowConfig workflowConfig) {
			this.workflowConfig = workflowConfig;
		}

		public static class Condition {

			private String type;

			private String status;

			private String reason;

			private String message;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getReason() {
				return this.reason;
			}

			public void setReason(String reason) {
				this.reason = reason;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}
		}

		public static class Endpoints {

			private String intranetApiServerEndpoint;

			private String publicApiServerEndpoint;

			public String getIntranetApiServerEndpoint() {
				return this.intranetApiServerEndpoint;
			}

			public void setIntranetApiServerEndpoint(String intranetApiServerEndpoint) {
				this.intranetApiServerEndpoint = intranetApiServerEndpoint;
			}

			public String getPublicApiServerEndpoint() {
				return this.publicApiServerEndpoint;
			}

			public void setPublicApiServerEndpoint(String publicApiServerEndpoint) {
				this.publicApiServerEndpoint = publicApiServerEndpoint;
			}
		}

		public static class ClusterInfo {

			private String profile;

			private String creationTime;

			private String updateTime;

			private String errorMessage;

			private String version;

			private String state;

			private String clusterId;

			private String name;

			private String regionId;

			private String clusterSpec;

			public String getProfile() {
				return this.profile;
			}

			public void setProfile(String profile) {
				this.profile = profile;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(String updateTime) {
				this.updateTime = updateTime;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
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

			public String getClusterSpec() {
				return this.clusterSpec;
			}

			public void setClusterSpec(String clusterSpec) {
				this.clusterSpec = clusterSpec;
			}
		}

		public static class Network {

			private String vpcId;

			private String iPStack;

			private String clusterDomain;

			private List<String> vSwitches;

			private List<String> securityGroupIDs;

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getIPStack() {
				return this.iPStack;
			}

			public void setIPStack(String iPStack) {
				this.iPStack = iPStack;
			}

			public String getClusterDomain() {
				return this.clusterDomain;
			}

			public void setClusterDomain(String clusterDomain) {
				this.clusterDomain = clusterDomain;
			}

			public List<String> getVSwitches() {
				return this.vSwitches;
			}

			public void setVSwitches(List<String> vSwitches) {
				this.vSwitches = vSwitches;
			}

			public List<String> getSecurityGroupIDs() {
				return this.securityGroupIDs;
			}

			public void setSecurityGroupIDs(List<String> securityGroupIDs) {
				this.securityGroupIDs = securityGroupIDs;
			}
		}

		public static class ApiServer {

			private Boolean enabledPublic;

			private String loadBalancerId;

			private String apiServerEipId;

			public Boolean getEnabledPublic() {
				return this.enabledPublic;
			}

			public void setEnabledPublic(Boolean enabledPublic) {
				this.enabledPublic = enabledPublic;
			}

			public String getLoadBalancerId() {
				return this.loadBalancerId;
			}

			public void setLoadBalancerId(String loadBalancerId) {
				this.loadBalancerId = loadBalancerId;
			}

			public String getApiServerEipId() {
				return this.apiServerEipId;
			}

			public void setApiServerEipId(String apiServerEipId) {
				this.apiServerEipId = apiServerEipId;
			}
		}

		public static class MeshConfig {

			private Boolean enableMesh;

			private String meshId;

			public Boolean getEnableMesh() {
				return this.enableMesh;
			}

			public void setEnableMesh(Boolean enableMesh) {
				this.enableMesh = enableMesh;
			}

			public String getMeshId() {
				return this.meshId;
			}

			public void setMeshId(String meshId) {
				this.meshId = meshId;
			}
		}

		public static class LogConfig {

			private Boolean enableLog;

			private String logProject;

			private String logStoreTTL;

			public Boolean getEnableLog() {
				return this.enableLog;
			}

			public void setEnableLog(Boolean enableLog) {
				this.enableLog = enableLog;
			}

			public String getLogProject() {
				return this.logProject;
			}

			public void setLogProject(String logProject) {
				this.logProject = logProject;
			}

			public String getLogStoreTTL() {
				return this.logStoreTTL;
			}

			public void setLogStoreTTL(String logStoreTTL) {
				this.logStoreTTL = logStoreTTL;
			}
		}

		public static class WorkflowConfig {

			private Boolean argoServerEnabled;

			private String workflowScheduleMode;

			private String priceLimit;

			private List<WorkflowUnit> workflowUnits;

			public Boolean getArgoServerEnabled() {
				return this.argoServerEnabled;
			}

			public void setArgoServerEnabled(Boolean argoServerEnabled) {
				this.argoServerEnabled = argoServerEnabled;
			}

			public String getWorkflowScheduleMode() {
				return this.workflowScheduleMode;
			}

			public void setWorkflowScheduleMode(String workflowScheduleMode) {
				this.workflowScheduleMode = workflowScheduleMode;
			}

			public String getPriceLimit() {
				return this.priceLimit;
			}

			public void setPriceLimit(String priceLimit) {
				this.priceLimit = priceLimit;
			}

			public List<WorkflowUnit> getWorkflowUnits() {
				return this.workflowUnits;
			}

			public void setWorkflowUnits(List<WorkflowUnit> workflowUnits) {
				this.workflowUnits = workflowUnits;
			}

			public static class WorkflowUnit {

				private String regionId;

				private String vpcId;

				private List<VSwitch> vSwitches1;

				public String getRegionId() {
					return this.regionId;
				}

				public void setRegionId(String regionId) {
					this.regionId = regionId;
				}

				public String getVpcId() {
					return this.vpcId;
				}

				public void setVpcId(String vpcId) {
					this.vpcId = vpcId;
				}

				public List<VSwitch> getVSwitches1() {
					return this.vSwitches1;
				}

				public void setVSwitches1(List<VSwitch> vSwitches1) {
					this.vSwitches1 = vSwitches1;
				}

				public static class VSwitch {

					private String vswitchId;

					private String zoneId;

					public String getVswitchId() {
						return this.vswitchId;
					}

					public void setVswitchId(String vswitchId) {
						this.vswitchId = vswitchId;
					}

					public String getZoneId() {
						return this.zoneId;
					}

					public void setZoneId(String zoneId) {
						this.zoneId = zoneId;
					}
				}
			}
		}
	}

	@Override
	public DescribeHubClusterDetailsResponse getInstance(UnmarshallerContext context) {
		return	DescribeHubClusterDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
