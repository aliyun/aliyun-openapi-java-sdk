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
import com.aliyuncs.emr.transform.v20160408.DescribeClusterV2ResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterV2Response extends AcsResponse {

	private String requestId;

	private ClusterInfo clusterInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ClusterInfo getClusterInfo() {
		return this.clusterInfo;
	}

	public void setClusterInfo(ClusterInfo clusterInfo) {
		this.clusterInfo = clusterInfo;
	}

	public static class ClusterInfo {

		private String id;

		private String regionId;

		private String depositType;

		private String zoneId;

		private String name;

		private String relateClusterId;

		private String gatewayClusterIds;

		private String createType;

		private Long startTime;

		private Long expiredTime;

		private Long stopTime;

		private Boolean logEnable;

		private String logPath;

		private String userId;

		private String status;

		private Boolean highAvailabilityEnable;

		private Boolean localMetaDb;

		private String chargeType;

		private Integer period;

		private Integer runningTime;

		private Integer masterNodeTotal;

		private Integer masterNodeInService;

		private Integer coreNodeTotal;

		private Integer coreNodeInService;

		private Integer taskNodeTotal;

		private Integer taskNodeInService;

		private Boolean showSoftwareInterface;

		private String createResource;

		private String vpcId;

		private String vSwitchId;

		private String netType;

		private String userDefinedEmrEcsRole;

		private Boolean ioOptimized;

		private String instanceGeneration;

		private String imageId;

		private String securityGroupId;

		private String securityGroupName;

		private Boolean bootstrapFailed;

		private String configurations;

		private Boolean easEnable;

		private Boolean autoScalingEnable;

		private Boolean autoScalingAllowed;

		private Boolean autoScalingSpotWithLimitAllowed;

		private Boolean autoScalingByLoadAllowed;

		private Boolean resizeDiskEnable;

		private List<GatewayClusterInfo> gatewayClusterInfoList;

		private List<HostGroup> hostGroupList;

		private List<BootstrapAction> bootstrapActionList;

		private RelateClusterInfo relateClusterInfo;

		private FailReason failReason;

		private SoftwareInfo softwareInfo;

		private AccessInfo accessInfo;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(String regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public String getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getDepositType() {
			return this.depositType;
		}

		public void setDepositType(String depositType) {
			this.depositType = depositType;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRelateClusterId() {
			return this.relateClusterId;
		}

		public void setRelateClusterId(String relateClusterId) {
			this.relateClusterId = relateClusterId;
		}

		public String getGatewayClusterIds() {
			return this.gatewayClusterIds;
		}

		public void setGatewayClusterIds(String gatewayClusterIds) {
			this.gatewayClusterIds = gatewayClusterIds;
		}

		public String getCreateType() {
			return this.createType;
		}

		public void setCreateType(String createType) {
			this.createType = createType;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(Long expiredTime) {
			this.expiredTime = expiredTime;
		}

		public Long getStopTime() {
			return this.stopTime;
		}

		public void setStopTime(Long stopTime) {
			this.stopTime = stopTime;
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

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getHighAvailabilityEnable() {
			return this.highAvailabilityEnable;
		}

		public void setHighAvailabilityEnable(Boolean highAvailabilityEnable) {
			this.highAvailabilityEnable = highAvailabilityEnable;
		}

		public Boolean getLocalMetaDb() {
			return this.localMetaDb;
		}

		public void setLocalMetaDb(Boolean localMetaDb) {
			this.localMetaDb = localMetaDb;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
		}

		public Integer getRunningTime() {
			return this.runningTime;
		}

		public void setRunningTime(Integer runningTime) {
			this.runningTime = runningTime;
		}

		public Integer getMasterNodeTotal() {
			return this.masterNodeTotal;
		}

		public void setMasterNodeTotal(Integer masterNodeTotal) {
			this.masterNodeTotal = masterNodeTotal;
		}

		public Integer getMasterNodeInService() {
			return this.masterNodeInService;
		}

		public void setMasterNodeInService(Integer masterNodeInService) {
			this.masterNodeInService = masterNodeInService;
		}

		public Integer getCoreNodeTotal() {
			return this.coreNodeTotal;
		}

		public void setCoreNodeTotal(Integer coreNodeTotal) {
			this.coreNodeTotal = coreNodeTotal;
		}

		public Integer getCoreNodeInService() {
			return this.coreNodeInService;
		}

		public void setCoreNodeInService(Integer coreNodeInService) {
			this.coreNodeInService = coreNodeInService;
		}

		public Integer getTaskNodeTotal() {
			return this.taskNodeTotal;
		}

		public void setTaskNodeTotal(Integer taskNodeTotal) {
			this.taskNodeTotal = taskNodeTotal;
		}

		public Integer getTaskNodeInService() {
			return this.taskNodeInService;
		}

		public void setTaskNodeInService(Integer taskNodeInService) {
			this.taskNodeInService = taskNodeInService;
		}

		public Boolean getShowSoftwareInterface() {
			return this.showSoftwareInterface;
		}

		public void setShowSoftwareInterface(Boolean showSoftwareInterface) {
			this.showSoftwareInterface = showSoftwareInterface;
		}

		public String getCreateResource() {
			return this.createResource;
		}

		public void setCreateResource(String createResource) {
			this.createResource = createResource;
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

		public String getUserDefinedEmrEcsRole() {
			return this.userDefinedEmrEcsRole;
		}

		public void setUserDefinedEmrEcsRole(String userDefinedEmrEcsRole) {
			this.userDefinedEmrEcsRole = userDefinedEmrEcsRole;
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

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getSecurityGroupName() {
			return this.securityGroupName;
		}

		public void setSecurityGroupName(String securityGroupName) {
			this.securityGroupName = securityGroupName;
		}

		public Boolean getBootstrapFailed() {
			return this.bootstrapFailed;
		}

		public void setBootstrapFailed(Boolean bootstrapFailed) {
			this.bootstrapFailed = bootstrapFailed;
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

		public Boolean getAutoScalingEnable() {
			return this.autoScalingEnable;
		}

		public void setAutoScalingEnable(Boolean autoScalingEnable) {
			this.autoScalingEnable = autoScalingEnable;
		}

		public Boolean getAutoScalingAllowed() {
			return this.autoScalingAllowed;
		}

		public void setAutoScalingAllowed(Boolean autoScalingAllowed) {
			this.autoScalingAllowed = autoScalingAllowed;
		}

		public Boolean getAutoScalingSpotWithLimitAllowed() {
			return this.autoScalingSpotWithLimitAllowed;
		}

		public void setAutoScalingSpotWithLimitAllowed(Boolean autoScalingSpotWithLimitAllowed) {
			this.autoScalingSpotWithLimitAllowed = autoScalingSpotWithLimitAllowed;
		}

		public Boolean getAutoScalingByLoadAllowed() {
			return this.autoScalingByLoadAllowed;
		}

		public void setAutoScalingByLoadAllowed(Boolean autoScalingByLoadAllowed) {
			this.autoScalingByLoadAllowed = autoScalingByLoadAllowed;
		}

		public Boolean getResizeDiskEnable() {
			return this.resizeDiskEnable;
		}

		public void setResizeDiskEnable(Boolean resizeDiskEnable) {
			this.resizeDiskEnable = resizeDiskEnable;
		}

		public List<GatewayClusterInfo> getGatewayClusterInfoList() {
			return this.gatewayClusterInfoList;
		}

		public void setGatewayClusterInfoList(List<GatewayClusterInfo> gatewayClusterInfoList) {
			this.gatewayClusterInfoList = gatewayClusterInfoList;
		}

		public List<HostGroup> getHostGroupList() {
			return this.hostGroupList;
		}

		public void setHostGroupList(List<HostGroup> hostGroupList) {
			this.hostGroupList = hostGroupList;
		}

		public List<BootstrapAction> getBootstrapActionList() {
			return this.bootstrapActionList;
		}

		public void setBootstrapActionList(List<BootstrapAction> bootstrapActionList) {
			this.bootstrapActionList = bootstrapActionList;
		}

		public RelateClusterInfo getRelateClusterInfo() {
			return this.relateClusterInfo;
		}

		public void setRelateClusterInfo(RelateClusterInfo relateClusterInfo) {
			this.relateClusterInfo = relateClusterInfo;
		}

		public FailReason getFailReason() {
			return this.failReason;
		}

		public void setFailReason(FailReason failReason) {
			this.failReason = failReason;
		}

		public SoftwareInfo getSoftwareInfo() {
			return this.softwareInfo;
		}

		public void setSoftwareInfo(SoftwareInfo softwareInfo) {
			this.softwareInfo = softwareInfo;
		}

		public AccessInfo getAccessInfo() {
			return this.accessInfo;
		}

		public void setAccessInfo(AccessInfo accessInfo) {
			this.accessInfo = accessInfo;
		}

		public static class GatewayClusterInfo {

			private String clusterId;

			private String clusterName;

			private String status;

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

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class HostGroup {

			private String hostGroupId;

			private String hostGroupName;

			private String hostGroupType;

			private String hostGroupSubType;

			private String hostGroupChangeType;

			private String hostGroupChangeStatus;

			private String chargeType;

			private String period;

			private Integer nodeCount;

			private String instanceType;

			private Integer cpuCore;

			private Integer memoryCapacity;

			private String diskType;

			private Integer diskCapacity;

			private Integer diskCount;

			private String bandWidth;

			private String lockType;

			private String lockReason;

			private List<Node> nodes;

			public String getHostGroupId() {
				return this.hostGroupId;
			}

			public void setHostGroupId(String hostGroupId) {
				this.hostGroupId = hostGroupId;
			}

			public String getHostGroupName() {
				return this.hostGroupName;
			}

			public void setHostGroupName(String hostGroupName) {
				this.hostGroupName = hostGroupName;
			}

			public String getHostGroupType() {
				return this.hostGroupType;
			}

			public void setHostGroupType(String hostGroupType) {
				this.hostGroupType = hostGroupType;
			}

			public String getHostGroupSubType() {
				return this.hostGroupSubType;
			}

			public void setHostGroupSubType(String hostGroupSubType) {
				this.hostGroupSubType = hostGroupSubType;
			}

			public String getHostGroupChangeType() {
				return this.hostGroupChangeType;
			}

			public void setHostGroupChangeType(String hostGroupChangeType) {
				this.hostGroupChangeType = hostGroupChangeType;
			}

			public String getHostGroupChangeStatus() {
				return this.hostGroupChangeStatus;
			}

			public void setHostGroupChangeStatus(String hostGroupChangeStatus) {
				this.hostGroupChangeStatus = hostGroupChangeStatus;
			}

			public String getChargeType() {
				return this.chargeType;
			}

			public void setChargeType(String chargeType) {
				this.chargeType = chargeType;
			}

			public String getPeriod() {
				return this.period;
			}

			public void setPeriod(String period) {
				this.period = period;
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

			public Integer getCpuCore() {
				return this.cpuCore;
			}

			public void setCpuCore(Integer cpuCore) {
				this.cpuCore = cpuCore;
			}

			public Integer getMemoryCapacity() {
				return this.memoryCapacity;
			}

			public void setMemoryCapacity(Integer memoryCapacity) {
				this.memoryCapacity = memoryCapacity;
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

			public Integer getDiskCount() {
				return this.diskCount;
			}

			public void setDiskCount(Integer diskCount) {
				this.diskCount = diskCount;
			}

			public String getBandWidth() {
				return this.bandWidth;
			}

			public void setBandWidth(String bandWidth) {
				this.bandWidth = bandWidth;
			}

			public String getLockType() {
				return this.lockType;
			}

			public void setLockType(String lockType) {
				this.lockType = lockType;
			}

			public String getLockReason() {
				return this.lockReason;
			}

			public void setLockReason(String lockReason) {
				this.lockReason = lockReason;
			}

			public List<Node> getNodes() {
				return this.nodes;
			}

			public void setNodes(List<Node> nodes) {
				this.nodes = nodes;
			}

			public static class Node {

				private String zoneId;

				private String instanceId;

				private String status;

				private String pubIp;

				private String innerIp;

				private String expiredTime;

				private String createTime;

				private String emrExpiredTime;

				private Boolean supportIpV6;

				private List<DaemonInfo> daemonInfos;

				private List<DiskInfo> diskInfos;

				public String getZoneId() {
					return this.zoneId;
				}

				public void setZoneId(String zoneId) {
					this.zoneId = zoneId;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getPubIp() {
					return this.pubIp;
				}

				public void setPubIp(String pubIp) {
					this.pubIp = pubIp;
				}

				public String getInnerIp() {
					return this.innerIp;
				}

				public void setInnerIp(String innerIp) {
					this.innerIp = innerIp;
				}

				public String getExpiredTime() {
					return this.expiredTime;
				}

				public void setExpiredTime(String expiredTime) {
					this.expiredTime = expiredTime;
				}

				public String getCreateTime() {
					return this.createTime;
				}

				public void setCreateTime(String createTime) {
					this.createTime = createTime;
				}

				public String getEmrExpiredTime() {
					return this.emrExpiredTime;
				}

				public void setEmrExpiredTime(String emrExpiredTime) {
					this.emrExpiredTime = emrExpiredTime;
				}

				public Boolean getSupportIpV6() {
					return this.supportIpV6;
				}

				public void setSupportIpV6(Boolean supportIpV6) {
					this.supportIpV6 = supportIpV6;
				}

				public List<DaemonInfo> getDaemonInfos() {
					return this.daemonInfos;
				}

				public void setDaemonInfos(List<DaemonInfo> daemonInfos) {
					this.daemonInfos = daemonInfos;
				}

				public List<DiskInfo> getDiskInfos() {
					return this.diskInfos;
				}

				public void setDiskInfos(List<DiskInfo> diskInfos) {
					this.diskInfos = diskInfos;
				}

				public static class DaemonInfo {

					private String name;

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}
				}

				public static class DiskInfo {

					private String device;

					private String diskName;

					private String diskId;

					private String type;

					private Integer size;

					public String getDevice() {
						return this.device;
					}

					public void setDevice(String device) {
						this.device = device;
					}

					public String getDiskName() {
						return this.diskName;
					}

					public void setDiskName(String diskName) {
						this.diskName = diskName;
					}

					public String getDiskId() {
						return this.diskId;
					}

					public void setDiskId(String diskId) {
						this.diskId = diskId;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public Integer getSize() {
						return this.size;
					}

					public void setSize(Integer size) {
						this.size = size;
					}
				}
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

		public static class RelateClusterInfo {

			private String clusterId;

			private String clusterName;

			private String status;

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

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class FailReason {

			private String errorCode;

			private String errorMsg;

			private String requestId;

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public String getErrorMsg() {
				return this.errorMsg;
			}

			public void setErrorMsg(String errorMsg) {
				this.errorMsg = errorMsg;
			}

			public String getRequestId() {
				return this.requestId;
			}

			public void setRequestId(String requestId) {
				this.requestId = requestId;
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

				public String getBizVersion() {
					return this.version;
				}

				public void setBizVersion(String version) {
					this.version = version;
				}

				/**
				 * @deprecated use getBizVersion instead of this.
				 */
				@Deprecated
				public String getVersion() {
					return this.version;
				}

				/**
				 * @deprecated use setBizVersion instead of this.
				 */
				@Deprecated
				public void setVersion(String version) {
					this.version = version;
				}
			}
		}

		public static class AccessInfo {

			private List<ZKLink> zKLinks;

			public List<ZKLink> getZKLinks() {
				return this.zKLinks;
			}

			public void setZKLinks(List<ZKLink> zKLinks) {
				this.zKLinks = zKLinks;
			}

			public static class ZKLink {

				private String link;

				private String port;

				public String getLink() {
					return this.link;
				}

				public void setLink(String link) {
					this.link = link;
				}

				public String getPort() {
					return this.port;
				}

				public void setPort(String port) {
					this.port = port;
				}
			}
		}
	}

	@Override
	public DescribeClusterV2Response getInstance(UnmarshallerContext context) {
		return	DescribeClusterV2ResponseUnmarshaller.unmarshall(this, context);
	}
}
