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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.AllCasLoadbalanceMountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AllCasLoadbalanceMountResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String domain;

		private String status;

		private Long weight;

		private Computer computer;

		private Loadbalancer loadbalancer;

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getWeight() {
			return this.weight;
		}

		public void setWeight(Long weight) {
			this.weight = weight;
		}

		public Computer getComputer() {
			return this.computer;
		}

		public void setComputer(Computer computer) {
			this.computer = computer;
		}

		public Loadbalancer getLoadbalancer() {
			return this.loadbalancer;
		}

		public void setLoadbalancer(Loadbalancer loadbalancer) {
			this.loadbalancer = loadbalancer;
		}

		public static class Computer {

			private String appId;

			private Long bandwidth;

			private Boolean commonImage;

			private Long cpu;

			private Boolean cpuShared;

			private String creationTime;

			private String description;

			private String elasticIp;

			private String expiredTime;

			private String id;

			private String imageIaasId;

			private String imageId;

			private String imageName;

			private Boolean initialized;

			private Boolean ioOptimized;

			private String lastOpsOrderId;

			private String lastOpsType;

			private Long memory;

			private String os;

			private Long osBit;

			private String osVersion;

			private String password;

			private String privateIp;

			private String publicIp;

			private String serialNumber;

			private String specIaasId;

			private String status;

			private Long threadsPerCore;

			private String workspaceId;

			private SystemDisk systemDisk;

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public Long getBandwidth() {
				return this.bandwidth;
			}

			public void setBandwidth(Long bandwidth) {
				this.bandwidth = bandwidth;
			}

			public Boolean getCommonImage() {
				return this.commonImage;
			}

			public void setCommonImage(Boolean commonImage) {
				this.commonImage = commonImage;
			}

			public Long getCpu() {
				return this.cpu;
			}

			public void setCpu(Long cpu) {
				this.cpu = cpu;
			}

			public Boolean getCpuShared() {
				return this.cpuShared;
			}

			public void setCpuShared(Boolean cpuShared) {
				this.cpuShared = cpuShared;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getElasticIp() {
				return this.elasticIp;
			}

			public void setElasticIp(String elasticIp) {
				this.elasticIp = elasticIp;
			}

			public String getExpiredTime() {
				return this.expiredTime;
			}

			public void setExpiredTime(String expiredTime) {
				this.expiredTime = expiredTime;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getImageIaasId() {
				return this.imageIaasId;
			}

			public void setImageIaasId(String imageIaasId) {
				this.imageIaasId = imageIaasId;
			}

			public String getImageId() {
				return this.imageId;
			}

			public void setImageId(String imageId) {
				this.imageId = imageId;
			}

			public String getImageName() {
				return this.imageName;
			}

			public void setImageName(String imageName) {
				this.imageName = imageName;
			}

			public Boolean getInitialized() {
				return this.initialized;
			}

			public void setInitialized(Boolean initialized) {
				this.initialized = initialized;
			}

			public Boolean getIoOptimized() {
				return this.ioOptimized;
			}

			public void setIoOptimized(Boolean ioOptimized) {
				this.ioOptimized = ioOptimized;
			}

			public String getLastOpsOrderId() {
				return this.lastOpsOrderId;
			}

			public void setLastOpsOrderId(String lastOpsOrderId) {
				this.lastOpsOrderId = lastOpsOrderId;
			}

			public String getLastOpsType() {
				return this.lastOpsType;
			}

			public void setLastOpsType(String lastOpsType) {
				this.lastOpsType = lastOpsType;
			}

			public Long getMemory() {
				return this.memory;
			}

			public void setMemory(Long memory) {
				this.memory = memory;
			}

			public String getOs() {
				return this.os;
			}

			public void setOs(String os) {
				this.os = os;
			}

			public Long getOsBit() {
				return this.osBit;
			}

			public void setOsBit(Long osBit) {
				this.osBit = osBit;
			}

			public String getOsVersion() {
				return this.osVersion;
			}

			public void setOsVersion(String osVersion) {
				this.osVersion = osVersion;
			}

			public String getPassword() {
				return this.password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public String getPrivateIp() {
				return this.privateIp;
			}

			public void setPrivateIp(String privateIp) {
				this.privateIp = privateIp;
			}

			public String getPublicIp() {
				return this.publicIp;
			}

			public void setPublicIp(String publicIp) {
				this.publicIp = publicIp;
			}

			public String getSerialNumber() {
				return this.serialNumber;
			}

			public void setSerialNumber(String serialNumber) {
				this.serialNumber = serialNumber;
			}

			public String getSpecIaasId() {
				return this.specIaasId;
			}

			public void setSpecIaasId(String specIaasId) {
				this.specIaasId = specIaasId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Long getThreadsPerCore() {
				return this.threadsPerCore;
			}

			public void setThreadsPerCore(Long threadsPerCore) {
				this.threadsPerCore = threadsPerCore;
			}

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}

			public SystemDisk getSystemDisk() {
				return this.systemDisk;
			}

			public void setSystemDisk(SystemDisk systemDisk) {
				this.systemDisk = systemDisk;
			}

			public static class SystemDisk {

				private String device;

				private Long size;

				private String snapshotSequence;

				private String specId;

				public String getDevice() {
					return this.device;
				}

				public void setDevice(String device) {
					this.device = device;
				}

				public Long getSize() {
					return this.size;
				}

				public void setSize(Long size) {
					this.size = size;
				}

				public String getSnapshotSequence() {
					return this.snapshotSequence;
				}

				public void setSnapshotSequence(String snapshotSequence) {
					this.snapshotSequence = snapshotSequence;
				}

				public String getSpecId() {
					return this.specId;
				}

				public void setSpecId(String specId) {
					this.specId = specId;
				}
			}
		}

		public static class Loadbalancer {

			private Long bandwidth;

			private String clusterId;

			private Boolean clusterMode;

			private String id;

			private String internetChargeType;

			private String name;

			private String networkType;

			private Boolean shareMode;

			private String status;

			private String vipAddressType;

			private String vipType;

			private String vpcId;

			private String vswitchIaasId;

			private String workspaceId;

			private List<String> domains;

			private List<String> vipAddresses;

			private Scope scope;

			public Long getBandwidth() {
				return this.bandwidth;
			}

			public void setBandwidth(Long bandwidth) {
				this.bandwidth = bandwidth;
			}

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
			}

			public Boolean getClusterMode() {
				return this.clusterMode;
			}

			public void setClusterMode(Boolean clusterMode) {
				this.clusterMode = clusterMode;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getInternetChargeType() {
				return this.internetChargeType;
			}

			public void setInternetChargeType(String internetChargeType) {
				this.internetChargeType = internetChargeType;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}

			public Boolean getShareMode() {
				return this.shareMode;
			}

			public void setShareMode(Boolean shareMode) {
				this.shareMode = shareMode;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getVipAddressType() {
				return this.vipAddressType;
			}

			public void setVipAddressType(String vipAddressType) {
				this.vipAddressType = vipAddressType;
			}

			public String getVipType() {
				return this.vipType;
			}

			public void setVipType(String vipType) {
				this.vipType = vipType;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getVswitchIaasId() {
				return this.vswitchIaasId;
			}

			public void setVswitchIaasId(String vswitchIaasId) {
				this.vswitchIaasId = vswitchIaasId;
			}

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}

			public List<String> getDomains() {
				return this.domains;
			}

			public void setDomains(List<String> domains) {
				this.domains = domains;
			}

			public List<String> getVipAddresses() {
				return this.vipAddresses;
			}

			public void setVipAddresses(List<String> vipAddresses) {
				this.vipAddresses = vipAddresses;
			}

			public Scope getScope() {
				return this.scope;
			}

			public void setScope(Scope scope) {
				this.scope = scope;
			}

			public static class Scope {

				private String cell;

				private String cluster;

				private String region;

				private String tenant;

				private String workspace;

				private String workspaceGroup;

				private String zone;

				public String getCell() {
					return this.cell;
				}

				public void setCell(String cell) {
					this.cell = cell;
				}

				public String getCluster() {
					return this.cluster;
				}

				public void setCluster(String cluster) {
					this.cluster = cluster;
				}

				public String getRegion() {
					return this.region;
				}

				public void setRegion(String region) {
					this.region = region;
				}

				public String getTenant() {
					return this.tenant;
				}

				public void setTenant(String tenant) {
					this.tenant = tenant;
				}

				public String getWorkspace() {
					return this.workspace;
				}

				public void setWorkspace(String workspace) {
					this.workspace = workspace;
				}

				public String getWorkspaceGroup() {
					return this.workspaceGroup;
				}

				public void setWorkspaceGroup(String workspaceGroup) {
					this.workspaceGroup = workspaceGroup;
				}

				public String getZone() {
					return this.zone;
				}

				public void setZone(String zone) {
					this.zone = zone;
				}
			}
		}
	}

	@Override
	public AllCasLoadbalanceMountResponse getInstance(UnmarshallerContext context) {
		return	AllCasLoadbalanceMountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
