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

		private String status;

		private Long meteredIASize;

		private Long capacity;

		private Long mountTargetCountLimit;

		private String createTime;

		private String chargeType;

		private String storageType;

		private Long meteredSize;

		private String description;

		private Long bandwidth;

		private String version;

		private String nasNamespaceId;

		private String protocolType;

		private String kMSKeyId;

		private String autoSnapshotPolicyId;

		private String regionId;

		private String fileSystemType;

		private String fileSystemId;

		private Integer encryptType;

		private String expiredTime;

		private String zoneId;

		private String vpcId;

		private List<Tag> tags;

		private List<MountTarget> mountTargets;

		private List<_Package> packages;

		private List<String> supportedFeatures;

		private List<String> vswIds;

		private Ldap ldap;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getMeteredIASize() {
			return this.meteredIASize;
		}

		public void setMeteredIASize(Long meteredIASize) {
			this.meteredIASize = meteredIASize;
		}

		public Long getCapacity() {
			return this.capacity;
		}

		public void setCapacity(Long capacity) {
			this.capacity = capacity;
		}

		public Long getMountTargetCountLimit() {
			return this.mountTargetCountLimit;
		}

		public void setMountTargetCountLimit(Long mountTargetCountLimit) {
			this.mountTargetCountLimit = mountTargetCountLimit;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public Long getMeteredSize() {
			return this.meteredSize;
		}

		public void setMeteredSize(Long meteredSize) {
			this.meteredSize = meteredSize;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Long bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getNasNamespaceId() {
			return this.nasNamespaceId;
		}

		public void setNasNamespaceId(String nasNamespaceId) {
			this.nasNamespaceId = nasNamespaceId;
		}

		public String getProtocolType() {
			return this.protocolType;
		}

		public void setProtocolType(String protocolType) {
			this.protocolType = protocolType;
		}

		public String getKMSKeyId() {
			return this.kMSKeyId;
		}

		public void setKMSKeyId(String kMSKeyId) {
			this.kMSKeyId = kMSKeyId;
		}

		public String getAutoSnapshotPolicyId() {
			return this.autoSnapshotPolicyId;
		}

		public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
			this.autoSnapshotPolicyId = autoSnapshotPolicyId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getFileSystemType() {
			return this.fileSystemType;
		}

		public void setFileSystemType(String fileSystemType) {
			this.fileSystemType = fileSystemType;
		}

		public String getFileSystemId() {
			return this.fileSystemId;
		}

		public void setFileSystemId(String fileSystemId) {
			this.fileSystemId = fileSystemId;
		}

		public Integer getEncryptType() {
			return this.encryptType;
		}

		public void setEncryptType(Integer encryptType) {
			this.encryptType = encryptType;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
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

		public List<_Package> getPackages() {
			return this.packages;
		}

		public void setPackages(List<_Package> packages) {
			this.packages = packages;
		}

		public List<String> getSupportedFeatures() {
			return this.supportedFeatures;
		}

		public void setSupportedFeatures(List<String> supportedFeatures) {
			this.supportedFeatures = supportedFeatures;
		}

		public List<String> getVswIds() {
			return this.vswIds;
		}

		public void setVswIds(List<String> vswIds) {
			this.vswIds = vswIds;
		}

		public Ldap getLdap() {
			return this.ldap;
		}

		public void setLdap(Ldap ldap) {
			this.ldap = ldap;
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class MountTarget {

			private String vpcId;

			private String status;

			private String mountTargetDomain;

			private String accessGroupName;

			private String dualStackMountTargetDomain;

			private String vswId;

			private String networkType;

			private List<ClientMasterNode> clientMasterNodes;

			private List<Tag2> tags1;

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getMountTargetDomain() {
				return this.mountTargetDomain;
			}

			public void setMountTargetDomain(String mountTargetDomain) {
				this.mountTargetDomain = mountTargetDomain;
			}

			public String getAccessGroupName() {
				return this.accessGroupName;
			}

			public void setAccessGroupName(String accessGroupName) {
				this.accessGroupName = accessGroupName;
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

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
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

				private String ecsId;

				private String defaultPasswd;

				private String ecsIp;

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

				public String getEcsIp() {
					return this.ecsIp;
				}

				public void setEcsIp(String ecsIp) {
					this.ecsIp = ecsIp;
				}
			}

			public static class Tag2 {

				private String key;

				private String value;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class _Package {

			private String startTime;

			private String expiredTime;

			private Long size;

			private String packageId;

			private String packageType;

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getExpiredTime() {
				return this.expiredTime;
			}

			public void setExpiredTime(String expiredTime) {
				this.expiredTime = expiredTime;
			}

			public Long getSize() {
				return this.size;
			}

			public void setSize(Long size) {
				this.size = size;
			}

			public String getPackageId() {
				return this.packageId;
			}

			public void setPackageId(String packageId) {
				this.packageId = packageId;
			}

			public String getPackageType() {
				return this.packageType;
			}

			public void setPackageType(String packageType) {
				this.packageType = packageType;
			}
		}

		public static class Ldap {

			private String bindDN;

			private String searchBase;

			private String uRI;

			public String getBindDN() {
				return this.bindDN;
			}

			public void setBindDN(String bindDN) {
				this.bindDN = bindDN;
			}

			public String getSearchBase() {
				return this.searchBase;
			}

			public void setSearchBase(String searchBase) {
				this.searchBase = searchBase;
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
