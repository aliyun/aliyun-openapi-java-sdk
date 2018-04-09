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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.DescribeExecutionPlanResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeExecutionPlanResponse extends AcsResponse {

	private String requestId;

	private String id;

	private String name;

	private String status;

	private String strategy;

	private Integer timeInterval;

	private Long startTime;

	private String timeUnit;

	private String dayOfWeek;

	private String dayOfMonth;

	private Boolean createClusterOnDemand;

	private String clusterId;

	private String clusterName;

	private String workflowApp;

	private Long executionPlanVersion;

	private List<JobInfo> jobInfoList;

	private ClusterInfo clusterInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStrategy() {
		return this.strategy;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

	public Integer getTimeInterval() {
		return this.timeInterval;
	}

	public void setTimeInterval(Integer timeInterval) {
		this.timeInterval = timeInterval;
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public String getTimeUnit() {
		return this.timeUnit;
	}

	public void setTimeUnit(String timeUnit) {
		this.timeUnit = timeUnit;
	}

	public String getDayOfWeek() {
		return this.dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public String getDayOfMonth() {
		return this.dayOfMonth;
	}

	public void setDayOfMonth(String dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}

	public Boolean getCreateClusterOnDemand() {
		return this.createClusterOnDemand;
	}

	public void setCreateClusterOnDemand(Boolean createClusterOnDemand) {
		this.createClusterOnDemand = createClusterOnDemand;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}

	public String getWorkflowApp() {
		return this.workflowApp;
	}

	public void setWorkflowApp(String workflowApp) {
		this.workflowApp = workflowApp;
	}

	public Long getExecutionPlanVersion() {
		return this.executionPlanVersion;
	}

	public void setExecutionPlanVersion(Long executionPlanVersion) {
		this.executionPlanVersion = executionPlanVersion;
	}

	public List<JobInfo> getJobInfoList() {
		return this.jobInfoList;
	}

	public void setJobInfoList(List<JobInfo> jobInfoList) {
		this.jobInfoList = jobInfoList;
	}

	public ClusterInfo getClusterInfo() {
		return this.clusterInfo;
	}

	public void setClusterInfo(ClusterInfo clusterInfo) {
		this.clusterInfo = clusterInfo;
	}

	public static class JobInfo {

		private String id;

		private String name;

		private String type;

		private String runParameter;

		private String failAct;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getRunParameter() {
			return this.runParameter;
		}

		public void setRunParameter(String runParameter) {
			this.runParameter = runParameter;
		}

		public String getFailAct() {
			return this.failAct;
		}

		public void setFailAct(String failAct) {
			this.failAct = failAct;
		}
	}

	public static class ClusterInfo {

		private String name;

		private String zoneId;

		private Boolean logEnable;

		private String logPath;

		private String securityGroupId;

		private String emrVer;

		private String clusterType;

		private Boolean highAvailabilityEnable;

		private String vpcId;

		private String vSwitchId;

		private String netType;

		private Boolean ioOptimized;

		private String instanceGeneration;

		private String configurations;

		private Boolean easEnable;

		private String userDefinedEmrEcsRole;

		private List<EcsOrderInfo> ecsOrders;

		private List<BootstrapAction> bootstrapActionList;

		private SoftwareInfo softwareInfo;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public Boolean getLogEnable() {
			return this.logEnable;
		}

		public void setLogEnable(Boolean logEnable) {
			this.logEnable = logEnable;
		}

		public String getLogPath() {
			return this.logPath;
		}

		public void setLogPath(String logPath) {
			this.logPath = logPath;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getEmrVer() {
			return this.emrVer;
		}

		public void setEmrVer(String emrVer) {
			this.emrVer = emrVer;
		}

		public String getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(String clusterType) {
			this.clusterType = clusterType;
		}

		public Boolean getHighAvailabilityEnable() {
			return this.highAvailabilityEnable;
		}

		public void setHighAvailabilityEnable(Boolean highAvailabilityEnable) {
			this.highAvailabilityEnable = highAvailabilityEnable;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getNetType() {
			return this.netType;
		}

		public void setNetType(String netType) {
			this.netType = netType;
		}

		public Boolean getIoOptimized() {
			return this.ioOptimized;
		}

		public void setIoOptimized(Boolean ioOptimized) {
			this.ioOptimized = ioOptimized;
		}

		public String getInstanceGeneration() {
			return this.instanceGeneration;
		}

		public void setInstanceGeneration(String instanceGeneration) {
			this.instanceGeneration = instanceGeneration;
		}

		public String getConfigurations() {
			return this.configurations;
		}

		public void setConfigurations(String configurations) {
			this.configurations = configurations;
		}

		public Boolean getEasEnable() {
			return this.easEnable;
		}

		public void setEasEnable(Boolean easEnable) {
			this.easEnable = easEnable;
		}

		public String getUserDefinedEmrEcsRole() {
			return this.userDefinedEmrEcsRole;
		}

		public void setUserDefinedEmrEcsRole(String userDefinedEmrEcsRole) {
			this.userDefinedEmrEcsRole = userDefinedEmrEcsRole;
		}

		public List<EcsOrderInfo> getEcsOrders() {
			return this.ecsOrders;
		}

		public void setEcsOrders(List<EcsOrderInfo> ecsOrders) {
			this.ecsOrders = ecsOrders;
		}

		public List<BootstrapAction> getBootstrapActionList() {
			return this.bootstrapActionList;
		}

		public void setBootstrapActionList(List<BootstrapAction> bootstrapActionList) {
			this.bootstrapActionList = bootstrapActionList;
		}

		public SoftwareInfo getSoftwareInfo() {
			return this.softwareInfo;
		}

		public void setSoftwareInfo(SoftwareInfo softwareInfo) {
			this.softwareInfo = softwareInfo;
		}

		public static class EcsOrderInfo {

			private Integer index;

			private Integer nodeCount;

			private String instanceType;

			private String diskType;

			private Integer diskCapacity;

			private String nodeType;

			private Integer diskCount;

			public Integer getIndex() {
				return this.index;
			}

			public void setIndex(Integer index) {
				this.index = index;
			}

			public Integer getNodeCount() {
				return this.nodeCount;
			}

			public void setNodeCount(Integer nodeCount) {
				this.nodeCount = nodeCount;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getDiskType() {
				return this.diskType;
			}

			public void setDiskType(String diskType) {
				this.diskType = diskType;
			}

			public Integer getDiskCapacity() {
				return this.diskCapacity;
			}

			public void setDiskCapacity(Integer diskCapacity) {
				this.diskCapacity = diskCapacity;
			}

			public String getNodeType() {
				return this.nodeType;
			}

			public void setNodeType(String nodeType) {
				this.nodeType = nodeType;
			}

			public Integer getDiskCount() {
				return this.diskCount;
			}

			public void setDiskCount(Integer diskCount) {
				this.diskCount = diskCount;
			}
		}

		public static class BootstrapAction {

			private String name;

			private String path;

			private String arg;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public String getArg() {
				return this.arg;
			}

			public void setArg(String arg) {
				this.arg = arg;
			}
		}

		public static class SoftwareInfo {

			private String emrVer;

			private String clusterType;

			private List<Software> softwares;

			public String getEmrVer() {
				return this.emrVer;
			}

			public void setEmrVer(String emrVer) {
				this.emrVer = emrVer;
			}

			public String getClusterType() {
				return this.clusterType;
			}

			public void setClusterType(String clusterType) {
				this.clusterType = clusterType;
			}

			public List<Software> getSoftwares() {
				return this.softwares;
			}

			public void setSoftwares(List<Software> softwares) {
				this.softwares = softwares;
			}

			public static class Software {

				private String displayName;

				private String name;

				private Boolean onlyDisplay;

				private Integer startTpe;

				private String version;

				private Boolean optional;

				public String getDisplayName() {
					return this.displayName;
				}

				public void setDisplayName(String displayName) {
					this.displayName = displayName;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Boolean getOnlyDisplay() {
					return this.onlyDisplay;
				}

				public void setOnlyDisplay(Boolean onlyDisplay) {
					this.onlyDisplay = onlyDisplay;
				}

				public Integer getStartTpe() {
					return this.startTpe;
				}

				public void setStartTpe(Integer startTpe) {
					this.startTpe = startTpe;
				}

				public String getVersion() {
					return this.version;
				}

				public void setVersion(String version) {
					this.version = version;
				}

				public Boolean getOptional() {
					return this.optional;
				}

				public void setOptional(Boolean optional) {
					this.optional = optional;
				}
			}
		}
	}

	@Override
	public DescribeExecutionPlanResponse getInstance(UnmarshallerContext context) {
		return	DescribeExecutionPlanResponseUnmarshaller.unmarshall(this, context);
	}
}
