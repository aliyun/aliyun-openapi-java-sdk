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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeDesktopsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDesktopsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer totalCount;

	private List<Desktop> desktops;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Desktop> getDesktops() {
		return this.desktops;
	}

	public void setDesktops(List<Desktop> desktops) {
		this.desktops = desktops;
	}

	public static class Desktop {

		private String creationTime;

		private String chargeType;

		private String desktopName;

		private String policyGroupName;

		private Integer systemDiskSize;

		private String policyGroupId;

		private String desktopStatus;

		private String desktopType;

		private Float gpuCount;

		private String protocolType;

		private Long memory;

		private String gpuSpec;

		private String imageId;

		private String directoryId;

		private String managementFlag;

		private String dataDiskCategory;

		private String systemDiskCategory;

		private String networkInterfaceId;

		private String officeSiteId;

		private String dataDiskSize;

		private String desktopGroupId;

		private String desktopId;

		private String officeSiteName;

		private String startTime;

		private String directoryType;

		private Integer cpu;

		private String networkInterfaceIp;

		private String expiredTime;

		private String osType;

		private String connectionStatus;

		private String bundleId;

		private String bundleName;

		private String officeSiteType;

		private String hostName;

		private Long downgradeQuota;

		private Long downgradedTimes;

		private Long gpuCategory;

		private String gpuDriverVersion;

		private String zoneType;

		private String progress;

		private Boolean volumeEncryptionEnabled;

		private String volumeEncryptionKey;

		private String officeSiteVpcType;

		private String platform;

		private String sessionType;

		private List<Disk> disks;

		private List<Tag> tags;

		private List<Session> sessions;

		private List<String> endUserIds;

		private FotaUpdate fotaUpdate;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getDesktopName() {
			return this.desktopName;
		}

		public void setDesktopName(String desktopName) {
			this.desktopName = desktopName;
		}

		public String getPolicyGroupName() {
			return this.policyGroupName;
		}

		public void setPolicyGroupName(String policyGroupName) {
			this.policyGroupName = policyGroupName;
		}

		public Integer getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Integer systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public String getPolicyGroupId() {
			return this.policyGroupId;
		}

		public void setPolicyGroupId(String policyGroupId) {
			this.policyGroupId = policyGroupId;
		}

		public String getDesktopStatus() {
			return this.desktopStatus;
		}

		public void setDesktopStatus(String desktopStatus) {
			this.desktopStatus = desktopStatus;
		}

		public String getDesktopType() {
			return this.desktopType;
		}

		public void setDesktopType(String desktopType) {
			this.desktopType = desktopType;
		}

		public Float getGpuCount() {
			return this.gpuCount;
		}

		public void setGpuCount(Float gpuCount) {
			this.gpuCount = gpuCount;
		}

		public String getProtocolType() {
			return this.protocolType;
		}

		public void setProtocolType(String protocolType) {
			this.protocolType = protocolType;
		}

		public Long getMemory() {
			return this.memory;
		}

		public void setMemory(Long memory) {
			this.memory = memory;
		}

		public String getGpuSpec() {
			return this.gpuSpec;
		}

		public void setGpuSpec(String gpuSpec) {
			this.gpuSpec = gpuSpec;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getDirectoryId() {
			return this.directoryId;
		}

		public void setDirectoryId(String directoryId) {
			this.directoryId = directoryId;
		}

		public String getManagementFlag() {
			return this.managementFlag;
		}

		public void setManagementFlag(String managementFlag) {
			this.managementFlag = managementFlag;
		}

		public String getDataDiskCategory() {
			return this.dataDiskCategory;
		}

		public void setDataDiskCategory(String dataDiskCategory) {
			this.dataDiskCategory = dataDiskCategory;
		}

		public String getSystemDiskCategory() {
			return this.systemDiskCategory;
		}

		public void setSystemDiskCategory(String systemDiskCategory) {
			this.systemDiskCategory = systemDiskCategory;
		}

		public String getNetworkInterfaceId() {
			return this.networkInterfaceId;
		}

		public void setNetworkInterfaceId(String networkInterfaceId) {
			this.networkInterfaceId = networkInterfaceId;
		}

		public String getOfficeSiteId() {
			return this.officeSiteId;
		}

		public void setOfficeSiteId(String officeSiteId) {
			this.officeSiteId = officeSiteId;
		}

		public String getDataDiskSize() {
			return this.dataDiskSize;
		}

		public void setDataDiskSize(String dataDiskSize) {
			this.dataDiskSize = dataDiskSize;
		}

		public String getDesktopGroupId() {
			return this.desktopGroupId;
		}

		public void setDesktopGroupId(String desktopGroupId) {
			this.desktopGroupId = desktopGroupId;
		}

		public String getDesktopId() {
			return this.desktopId;
		}

		public void setDesktopId(String desktopId) {
			this.desktopId = desktopId;
		}

		public String getOfficeSiteName() {
			return this.officeSiteName;
		}

		public void setOfficeSiteName(String officeSiteName) {
			this.officeSiteName = officeSiteName;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getDirectoryType() {
			return this.directoryType;
		}

		public void setDirectoryType(String directoryType) {
			this.directoryType = directoryType;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public String getNetworkInterfaceIp() {
			return this.networkInterfaceIp;
		}

		public void setNetworkInterfaceIp(String networkInterfaceIp) {
			this.networkInterfaceIp = networkInterfaceIp;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getOsType() {
			return this.osType;
		}

		public void setOsType(String osType) {
			this.osType = osType;
		}

		public String getConnectionStatus() {
			return this.connectionStatus;
		}

		public void setConnectionStatus(String connectionStatus) {
			this.connectionStatus = connectionStatus;
		}

		public String getBundleId() {
			return this.bundleId;
		}

		public void setBundleId(String bundleId) {
			this.bundleId = bundleId;
		}

		public String getBundleName() {
			return this.bundleName;
		}

		public void setBundleName(String bundleName) {
			this.bundleName = bundleName;
		}

		public String getOfficeSiteType() {
			return this.officeSiteType;
		}

		public void setOfficeSiteType(String officeSiteType) {
			this.officeSiteType = officeSiteType;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public Long getDowngradeQuota() {
			return this.downgradeQuota;
		}

		public void setDowngradeQuota(Long downgradeQuota) {
			this.downgradeQuota = downgradeQuota;
		}

		public Long getDowngradedTimes() {
			return this.downgradedTimes;
		}

		public void setDowngradedTimes(Long downgradedTimes) {
			this.downgradedTimes = downgradedTimes;
		}

		public Long getGpuCategory() {
			return this.gpuCategory;
		}

		public void setGpuCategory(Long gpuCategory) {
			this.gpuCategory = gpuCategory;
		}

		public String getGpuDriverVersion() {
			return this.gpuDriverVersion;
		}

		public void setGpuDriverVersion(String gpuDriverVersion) {
			this.gpuDriverVersion = gpuDriverVersion;
		}

		public String getZoneType() {
			return this.zoneType;
		}

		public void setZoneType(String zoneType) {
			this.zoneType = zoneType;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public Boolean getVolumeEncryptionEnabled() {
			return this.volumeEncryptionEnabled;
		}

		public void setVolumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
			this.volumeEncryptionEnabled = volumeEncryptionEnabled;
		}

		public String getVolumeEncryptionKey() {
			return this.volumeEncryptionKey;
		}

		public void setVolumeEncryptionKey(String volumeEncryptionKey) {
			this.volumeEncryptionKey = volumeEncryptionKey;
		}

		public String getOfficeSiteVpcType() {
			return this.officeSiteVpcType;
		}

		public void setOfficeSiteVpcType(String officeSiteVpcType) {
			this.officeSiteVpcType = officeSiteVpcType;
		}

		public String getPlatform() {
			return this.platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}

		public String getSessionType() {
			return this.sessionType;
		}

		public void setSessionType(String sessionType) {
			this.sessionType = sessionType;
		}

		public List<Disk> getDisks() {
			return this.disks;
		}

		public void setDisks(List<Disk> disks) {
			this.disks = disks;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<Session> getSessions() {
			return this.sessions;
		}

		public void setSessions(List<Session> sessions) {
			this.sessions = sessions;
		}

		public List<String> getEndUserIds() {
			return this.endUserIds;
		}

		public void setEndUserIds(List<String> endUserIds) {
			this.endUserIds = endUserIds;
		}

		public FotaUpdate getFotaUpdate() {
			return this.fotaUpdate;
		}

		public void setFotaUpdate(FotaUpdate fotaUpdate) {
			this.fotaUpdate = fotaUpdate;
		}

		public static class Disk {

			private String diskType;

			private String diskId;

			private Integer diskSize;

			private String performanceLevel;

			public String getDiskType() {
				return this.diskType;
			}

			public void setDiskType(String diskType) {
				this.diskType = diskType;
			}

			public String getDiskId() {
				return this.diskId;
			}

			public void setDiskId(String diskId) {
				this.diskId = diskId;
			}

			public Integer getDiskSize() {
				return this.diskSize;
			}

			public void setDiskSize(Integer diskSize) {
				this.diskSize = diskSize;
			}

			public String getPerformanceLevel() {
				return this.performanceLevel;
			}

			public void setPerformanceLevel(String performanceLevel) {
				this.performanceLevel = performanceLevel;
			}
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

		public static class Session {

			private String endUserId;

			private String establishmentTime;

			private String externalUserName;

			public String getEndUserId() {
				return this.endUserId;
			}

			public void setEndUserId(String endUserId) {
				this.endUserId = endUserId;
			}

			public String getEstablishmentTime() {
				return this.establishmentTime;
			}

			public void setEstablishmentTime(String establishmentTime) {
				this.establishmentTime = establishmentTime;
			}

			public String getExternalUserName() {
				return this.externalUserName;
			}

			public void setExternalUserName(String externalUserName) {
				this.externalUserName = externalUserName;
			}
		}

		public static class FotaUpdate {

			private String currentAppVersion;

			private String newAppVersion;

			private String releaseNote;

			private Long size;

			public String getCurrentAppVersion() {
				return this.currentAppVersion;
			}

			public void setCurrentAppVersion(String currentAppVersion) {
				this.currentAppVersion = currentAppVersion;
			}

			public String getNewAppVersion() {
				return this.newAppVersion;
			}

			public void setNewAppVersion(String newAppVersion) {
				this.newAppVersion = newAppVersion;
			}

			public String getReleaseNote() {
				return this.releaseNote;
			}

			public void setReleaseNote(String releaseNote) {
				this.releaseNote = releaseNote;
			}

			public Long getSize() {
				return this.size;
			}

			public void setSize(Long size) {
				this.size = size;
			}
		}
	}

	@Override
	public DescribeDesktopsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDesktopsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
