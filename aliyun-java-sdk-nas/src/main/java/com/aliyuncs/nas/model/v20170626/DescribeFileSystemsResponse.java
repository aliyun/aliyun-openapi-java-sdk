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

package com.aliyuncs.nas.model.v20170626;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.DescribeFileSystemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFileSystemsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<FileSystem> fileSystems;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<FileSystem> getFileSystems() {
		return this.fileSystems;
	}

	public void setFileSystems(List<FileSystem> fileSystems) {
		this.fileSystems = fileSystems;
	}

	public static class FileSystem {

		private Integer secondaryBandwidth;

		private Long mountTargetCountLimit;

		private String description;

		private String kMSKeyId;

		private Integer nodeNum;

		private String resourceGroupId;

		private String vscTarget;

		private String hpnZone;

		private Long meteredSize;

		private Long capacity;

		private String version;

		private Long bandwidth;

		private String expiredTime;

		private String fileSystemId;

		private Long meteredArchiveSize;

		private String quorumVswId;

		private String status;

		private String accessPointCount;

		private String storageType;

		private String zoneId;

		private String nasNamespaceId;

		private Long meteredIASize;

		private String createTime;

		private String redundancyType;

		private String autoSnapshotPolicyId;

		private Integer encryptType;

		private String vpcId;

		private String chargeType;

		private String protocolType;

		private String fileSystemType;

		private Long secondaryCapacity;

		private String regionId;

		private List<_Package> packages;

		private List<Tag> tags;

		private List<MountTarget> mountTargets;

		private List<String> vswIds;

		private List<String> redundancyVSwitchIds;

		private List<String> supportedFeatures;

		private Options options;

		private GuiInfo guiInfo;

		private Ldap ldap;

		public Integer getSecondaryBandwidth() {
			return this.secondaryBandwidth;
		}

		public void setSecondaryBandwidth(Integer secondaryBandwidth) {
			this.secondaryBandwidth = secondaryBandwidth;
		}

		public Long getMountTargetCountLimit() {
			return this.mountTargetCountLimit;
		}

		public void setMountTargetCountLimit(Long mountTargetCountLimit) {
			this.mountTargetCountLimit = mountTargetCountLimit;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getKMSKeyId() {
			return this.kMSKeyId;
		}

		public void setKMSKeyId(String kMSKeyId) {
			this.kMSKeyId = kMSKeyId;
		}

		public Integer getNodeNum() {
			return this.nodeNum;
		}

		public void setNodeNum(Integer nodeNum) {
			this.nodeNum = nodeNum;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getVscTarget() {
			return this.vscTarget;
		}

		public void setVscTarget(String vscTarget) {
			this.vscTarget = vscTarget;
		}

		public String getHpnZone() {
			return this.hpnZone;
		}

		public void setHpnZone(String hpnZone) {
			this.hpnZone = hpnZone;
		}

		public Long getMeteredSize() {
			return this.meteredSize;
		}

		public void setMeteredSize(Long meteredSize) {
			this.meteredSize = meteredSize;
		}

		public Long getCapacity() {
			return this.capacity;
		}

		public void setCapacity(Long capacity) {
			this.capacity = capacity;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public Long getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Long bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getFileSystemId() {
			return this.fileSystemId;
		}

		public void setFileSystemId(String fileSystemId) {
			this.fileSystemId = fileSystemId;
		}

		public Long getMeteredArchiveSize() {
			return this.meteredArchiveSize;
		}

		public void setMeteredArchiveSize(Long meteredArchiveSize) {
			this.meteredArchiveSize = meteredArchiveSize;
		}

		public String getQuorumVswId() {
			return this.quorumVswId;
		}

		public void setQuorumVswId(String quorumVswId) {
			this.quorumVswId = quorumVswId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getAccessPointCount() {
			return this.accessPointCount;
		}

		public void setAccessPointCount(String accessPointCount) {
			this.accessPointCount = accessPointCount;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getNasNamespaceId() {
			return this.nasNamespaceId;
		}

		public void setNasNamespaceId(String nasNamespaceId) {
			this.nasNamespaceId = nasNamespaceId;
		}

		public Long getMeteredIASize() {
			return this.meteredIASize;
		}

		public void setMeteredIASize(Long meteredIASize) {
			this.meteredIASize = meteredIASize;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getRedundancyType() {
			return this.redundancyType;
		}

		public void setRedundancyType(String redundancyType) {
			this.redundancyType = redundancyType;
		}

		public String getAutoSnapshotPolicyId() {
			return this.autoSnapshotPolicyId;
		}

		public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
			this.autoSnapshotPolicyId = autoSnapshotPolicyId;
		}

		public Integer getEncryptType() {
			return this.encryptType;
		}

		public void setEncryptType(Integer encryptType) {
			this.encryptType = encryptType;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getProtocolType() {
			return this.protocolType;
		}

		public void setProtocolType(String protocolType) {
			this.protocolType = protocolType;
		}

		public String getFileSystemType() {
			return this.fileSystemType;
		}

		public void setFileSystemType(String fileSystemType) {
			this.fileSystemType = fileSystemType;
		}

		public Long getSecondaryCapacity() {
			return this.secondaryCapacity;
		}

		public void setSecondaryCapacity(Long secondaryCapacity) {
			this.secondaryCapacity = secondaryCapacity;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public List<_Package> getPackages() {
			return this.packages;
		}

		public void setPackages(List<_Package> packages) {
			this.packages = packages;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<MountTarget> getMountTargets() {
			return this.mountTargets;
		}

		public void setMountTargets(List<MountTarget> mountTargets) {
			this.mountTargets = mountTargets;
		}

		public List<String> getVswIds() {
			return this.vswIds;
		}

		public void setVswIds(List<String> vswIds) {
			this.vswIds = vswIds;
		}

		public List<String> getRedundancyVSwitchIds() {
			return this.redundancyVSwitchIds;
		}

		public void setRedundancyVSwitchIds(List<String> redundancyVSwitchIds) {
			this.redundancyVSwitchIds = redundancyVSwitchIds;
		}

		public List<String> getSupportedFeatures() {
			return this.supportedFeatures;
		}

		public void setSupportedFeatures(List<String> supportedFeatures) {
			this.supportedFeatures = supportedFeatures;
		}

		public Options getOptions() {
			return this.options;
		}

		public void setOptions(Options options) {
			this.options = options;
		}

		public GuiInfo getGuiInfo() {
			return this.guiInfo;
		}

		public void setGuiInfo(GuiInfo guiInfo) {
			this.guiInfo = guiInfo;
		}

		public Ldap getLdap() {
			return this.ldap;
		}

		public void setLdap(Ldap ldap) {
			this.ldap = ldap;
		}

		public static class _Package {

			private Long size;

			private String expiredTime;

			private String packageType;

			private String startTime;

			private String packageId;

			public Long getSize() {
				return this.size;
			}

			public void setSize(Long size) {
				this.size = size;
			}

			public String getExpiredTime() {
				return this.expiredTime;
			}

			public void setExpiredTime(String expiredTime) {
				this.expiredTime = expiredTime;
			}

			public String getPackageType() {
				return this.packageType;
			}

			public void setPackageType(String packageType) {
				this.packageType = packageType;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getPackageId() {
				return this.packageId;
			}

			public void setPackageId(String packageId) {
				this.packageId = packageId;
			}
		}

		public static class Tag {

			private String value;

			private String key;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}

		public static class MountTarget {

			private String status;

			private String vpcId;

			private String dualStackMountTargetDomain;

			private String vswId;

			private String mountTargetDomain;

			private String networkType;

			private String accessGroupName;

			private String mountTargetIp;

			private Boolean accessPointAccessOnly;

			private List<ClientMasterNode> clientMasterNodes;

			private List<Tag2> tags1;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getDualStackMountTargetDomain() {
				return this.dualStackMountTargetDomain;
			}

			public void setDualStackMountTargetDomain(String dualStackMountTargetDomain) {
				this.dualStackMountTargetDomain = dualStackMountTargetDomain;
			}

			public String getVswId() {
				return this.vswId;
			}

			public void setVswId(String vswId) {
				this.vswId = vswId;
			}

			public String getMountTargetDomain() {
				return this.mountTargetDomain;
			}

			public void setMountTargetDomain(String mountTargetDomain) {
				this.mountTargetDomain = mountTargetDomain;
			}

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}

			public String getAccessGroupName() {
				return this.accessGroupName;
			}

			public void setAccessGroupName(String accessGroupName) {
				this.accessGroupName = accessGroupName;
			}

			public String getMountTargetIp() {
				return this.mountTargetIp;
			}

			public void setMountTargetIp(String mountTargetIp) {
				this.mountTargetIp = mountTargetIp;
			}

			public Boolean getAccessPointAccessOnly() {
				return this.accessPointAccessOnly;
			}

			public void setAccessPointAccessOnly(Boolean accessPointAccessOnly) {
				this.accessPointAccessOnly = accessPointAccessOnly;
			}

			public List<ClientMasterNode> getClientMasterNodes() {
				return this.clientMasterNodes;
			}

			public void setClientMasterNodes(List<ClientMasterNode> clientMasterNodes) {
				this.clientMasterNodes = clientMasterNodes;
			}

			public List<Tag2> getTags1() {
				return this.tags1;
			}

			public void setTags1(List<Tag2> tags1) {
				this.tags1 = tags1;
			}

			public static class ClientMasterNode {

				private String ecsIp;

				private String ecsId;

				private String defaultPasswd;

				public String getEcsIp() {
					return this.ecsIp;
				}

				public void setEcsIp(String ecsIp) {
					this.ecsIp = ecsIp;
				}

				public String getEcsId() {
					return this.ecsId;
				}

				public void setEcsId(String ecsId) {
					this.ecsId = ecsId;
				}

				public String getDefaultPasswd() {
					return this.defaultPasswd;
				}

				public void setDefaultPasswd(String defaultPasswd) {
					this.defaultPasswd = defaultPasswd;
				}
			}

			public static class Tag2 {

				private String value;

				private String key;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}
			}
		}

		public static class Options {

			private Boolean enableOplock;

			private Boolean vscAccessPointAccessOnly;

			private Boolean enableABE;

			private Boolean enableDataInsight;

			public Boolean getEnableOplock() {
				return this.enableOplock;
			}

			public void setEnableOplock(Boolean enableOplock) {
				this.enableOplock = enableOplock;
			}

			public Boolean getVscAccessPointAccessOnly() {
				return this.vscAccessPointAccessOnly;
			}

			public void setVscAccessPointAccessOnly(Boolean vscAccessPointAccessOnly) {
				this.vscAccessPointAccessOnly = vscAccessPointAccessOnly;
			}

			public Boolean getEnableABE() {
				return this.enableABE;
			}

			public void setEnableABE(Boolean enableABE) {
				this.enableABE = enableABE;
			}

			public Boolean getEnableDataInsight() {
				return this.enableDataInsight;
			}

			public void setEnableDataInsight(Boolean enableDataInsight) {
				this.enableDataInsight = enableDataInsight;
			}
		}

		public static class GuiInfo {

			private String user;

			private String endpoint;

			private String password;

			public String getUser() {
				return this.user;
			}

			public void setUser(String user) {
				this.user = user;
			}

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getPassword() {
				return this.password;
			}

			public void setPassword(String password) {
				this.password = password;
			}
		}

		public static class Ldap {

			private String searchBase;

			private String bindDN;

			private String uRI;

			public String getSearchBase() {
				return this.searchBase;
			}

			public void setSearchBase(String searchBase) {
				this.searchBase = searchBase;
			}

			public String getBindDN() {
				return this.bindDN;
			}

			public void setBindDN(String bindDN) {
				this.bindDN = bindDN;
			}

			public String getURI() {
				return this.uRI;
			}

			public void setURI(String uRI) {
				this.uRI = uRI;
			}
		}
	}

	@Override
	public DescribeFileSystemsResponse getInstance(UnmarshallerContext context) {
		return	DescribeFileSystemsResponseUnmarshaller.unmarshall(this, context);
	}
}
