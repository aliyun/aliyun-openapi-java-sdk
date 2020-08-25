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
import com.aliyuncs.sofa.transform.v20190815.DescribeBuildpackResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBuildpackResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long currentPage;

	private Long pageSize;

	private Long totalCount;

	private List<BuildpacksItem> buildpacks;

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

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<BuildpacksItem> getBuildpacks() {
		return this.buildpacks;
	}

	public void setBuildpacks(List<BuildpacksItem> buildpacks) {
		this.buildpacks = buildpacks;
	}

	public static class BuildpacksItem {

		private Long appServiceCount;

		private String buildCommand;

		private String contactInfo;

		private String createdFrom;

		private String creationTime;

		private Boolean debugMode;

		private String depracationNote;

		private String description;

		private String extraInfo;

		private String fullVersion;

		private String id;

		private String industryLabel;

		private Long majorVersion;

		private Long minorVersion;

		private String modificationTime;

		private String originType;

		private Long patchVersion;

		private String publicationTime;

		private String publicationTimeDate;

		private String scope;

		private String status;

		private Long techstackId;

		private String tenantId;

		private List<SupportedOsItem> supportedOs;

		private List<SupportedRegionsListItem> supportedRegionsList;

		private List<String> availableTenantNames;

		private List<String> creationChain;

		private List<String> supportedRegions;

		private Techstack techstack;

		public Long getAppServiceCount() {
			return this.appServiceCount;
		}

		public void setAppServiceCount(Long appServiceCount) {
			this.appServiceCount = appServiceCount;
		}

		public String getBuildCommand() {
			return this.buildCommand;
		}

		public void setBuildCommand(String buildCommand) {
			this.buildCommand = buildCommand;
		}

		public String getContactInfo() {
			return this.contactInfo;
		}

		public void setContactInfo(String contactInfo) {
			this.contactInfo = contactInfo;
		}

		public String getCreatedFrom() {
			return this.createdFrom;
		}

		public void setCreatedFrom(String createdFrom) {
			this.createdFrom = createdFrom;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Boolean getDebugMode() {
			return this.debugMode;
		}

		public void setDebugMode(Boolean debugMode) {
			this.debugMode = debugMode;
		}

		public String getDepracationNote() {
			return this.depracationNote;
		}

		public void setDepracationNote(String depracationNote) {
			this.depracationNote = depracationNote;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getExtraInfo() {
			return this.extraInfo;
		}

		public void setExtraInfo(String extraInfo) {
			this.extraInfo = extraInfo;
		}

		public String getFullVersion() {
			return this.fullVersion;
		}

		public void setFullVersion(String fullVersion) {
			this.fullVersion = fullVersion;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getIndustryLabel() {
			return this.industryLabel;
		}

		public void setIndustryLabel(String industryLabel) {
			this.industryLabel = industryLabel;
		}

		public Long getMajorVersion() {
			return this.majorVersion;
		}

		public void setMajorVersion(Long majorVersion) {
			this.majorVersion = majorVersion;
		}

		public Long getMinorVersion() {
			return this.minorVersion;
		}

		public void setMinorVersion(Long minorVersion) {
			this.minorVersion = minorVersion;
		}

		public String getModificationTime() {
			return this.modificationTime;
		}

		public void setModificationTime(String modificationTime) {
			this.modificationTime = modificationTime;
		}

		public String getOriginType() {
			return this.originType;
		}

		public void setOriginType(String originType) {
			this.originType = originType;
		}

		public Long getPatchVersion() {
			return this.patchVersion;
		}

		public void setPatchVersion(Long patchVersion) {
			this.patchVersion = patchVersion;
		}

		public String getPublicationTime() {
			return this.publicationTime;
		}

		public void setPublicationTime(String publicationTime) {
			this.publicationTime = publicationTime;
		}

		public String getPublicationTimeDate() {
			return this.publicationTimeDate;
		}

		public void setPublicationTimeDate(String publicationTimeDate) {
			this.publicationTimeDate = publicationTimeDate;
		}

		public String getScope() {
			return this.scope;
		}

		public void setScope(String scope) {
			this.scope = scope;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getTechstackId() {
			return this.techstackId;
		}

		public void setTechstackId(Long techstackId) {
			this.techstackId = techstackId;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public List<SupportedOsItem> getSupportedOs() {
			return this.supportedOs;
		}

		public void setSupportedOs(List<SupportedOsItem> supportedOs) {
			this.supportedOs = supportedOs;
		}

		public List<SupportedRegionsListItem> getSupportedRegionsList() {
			return this.supportedRegionsList;
		}

		public void setSupportedRegionsList(List<SupportedRegionsListItem> supportedRegionsList) {
			this.supportedRegionsList = supportedRegionsList;
		}

		public List<String> getAvailableTenantNames() {
			return this.availableTenantNames;
		}

		public void setAvailableTenantNames(List<String> availableTenantNames) {
			this.availableTenantNames = availableTenantNames;
		}

		public List<String> getCreationChain() {
			return this.creationChain;
		}

		public void setCreationChain(List<String> creationChain) {
			this.creationChain = creationChain;
		}

		public List<String> getSupportedRegions() {
			return this.supportedRegions;
		}

		public void setSupportedRegions(List<String> supportedRegions) {
			this.supportedRegions = supportedRegions;
		}

		public Techstack getTechstack() {
			return this.techstack;
		}

		public void setTechstack(Techstack techstack) {
			this.techstack = techstack;
		}

		public static class SupportedOsItem {

			private String creationTime;

			private String description;

			private String extraInfo;

			private String fullName;

			private Long id;

			private String modificationTime;

			private String name;

			private Long osBit;

			private Long osBitNum;

			private String version;

			private List<String> supportedCloudDisplayNames;

			private List<String> supportedCloudNames;

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

			public String getExtraInfo() {
				return this.extraInfo;
			}

			public void setExtraInfo(String extraInfo) {
				this.extraInfo = extraInfo;
			}

			public String getFullName() {
				return this.fullName;
			}

			public void setFullName(String fullName) {
				this.fullName = fullName;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getModificationTime() {
				return this.modificationTime;
			}

			public void setModificationTime(String modificationTime) {
				this.modificationTime = modificationTime;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Long getOsBit() {
				return this.osBit;
			}

			public void setOsBit(Long osBit) {
				this.osBit = osBit;
			}

			public Long getOsBitNum() {
				return this.osBitNum;
			}

			public void setOsBitNum(Long osBitNum) {
				this.osBitNum = osBitNum;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public List<String> getSupportedCloudDisplayNames() {
				return this.supportedCloudDisplayNames;
			}

			public void setSupportedCloudDisplayNames(List<String> supportedCloudDisplayNames) {
				this.supportedCloudDisplayNames = supportedCloudDisplayNames;
			}

			public List<String> getSupportedCloudNames() {
				return this.supportedCloudNames;
			}

			public void setSupportedCloudNames(List<String> supportedCloudNames) {
				this.supportedCloudNames = supportedCloudNames;
			}
		}

		public static class SupportedRegionsListItem {

			private String buildpackId;

			private String buildpackTenantId;

			private String creationTime;

			private String fileChecksum;

			private String fileLocation;

			private Long fileSize;

			private String fileStatus;

			private String fromRegionId;

			private String id;

			private String modificationTime;

			private String objectName;

			private String originalFileName;

			private String readableFileSize;

			private Region region;

			public String getBuildpackId() {
				return this.buildpackId;
			}

			public void setBuildpackId(String buildpackId) {
				this.buildpackId = buildpackId;
			}

			public String getBuildpackTenantId() {
				return this.buildpackTenantId;
			}

			public void setBuildpackTenantId(String buildpackTenantId) {
				this.buildpackTenantId = buildpackTenantId;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getFileChecksum() {
				return this.fileChecksum;
			}

			public void setFileChecksum(String fileChecksum) {
				this.fileChecksum = fileChecksum;
			}

			public String getFileLocation() {
				return this.fileLocation;
			}

			public void setFileLocation(String fileLocation) {
				this.fileLocation = fileLocation;
			}

			public Long getFileSize() {
				return this.fileSize;
			}

			public void setFileSize(Long fileSize) {
				this.fileSize = fileSize;
			}

			public String getFileStatus() {
				return this.fileStatus;
			}

			public void setFileStatus(String fileStatus) {
				this.fileStatus = fileStatus;
			}

			public String getFromRegionId() {
				return this.fromRegionId;
			}

			public void setFromRegionId(String fromRegionId) {
				this.fromRegionId = fromRegionId;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getModificationTime() {
				return this.modificationTime;
			}

			public void setModificationTime(String modificationTime) {
				this.modificationTime = modificationTime;
			}

			public String getObjectName() {
				return this.objectName;
			}

			public void setObjectName(String objectName) {
				this.objectName = objectName;
			}

			public String getOriginalFileName() {
				return this.originalFileName;
			}

			public void setOriginalFileName(String originalFileName) {
				this.originalFileName = originalFileName;
			}

			public String getReadableFileSize() {
				return this.readableFileSize;
			}

			public void setReadableFileSize(String readableFileSize) {
				this.readableFileSize = readableFileSize;
			}

			public Region getRegion() {
				return this.region;
			}

			public void setRegion(Region region) {
				this.region = region;
			}

			public static class Region {

				private String buildpackId;

				private String buildpackTenantId;

				private String creationTime;

				private String description;

				private String fileChecksum;

				private String fileLocation;

				private Long fileSize;

				private String fileStatus;

				private String fromRegionId;

				private String iaasProviderId;

				private String id;

				private String identity;

				private String modificationTime;

				private String name;

				private String networkType;

				private String objectName;

				private String originalFileName;

				private String readableFileSize;

				private String state;

				private String utcCreate;

				private String utcModified;

				private String zoneDtos;

				public String getBuildpackId() {
					return this.buildpackId;
				}

				public void setBuildpackId(String buildpackId) {
					this.buildpackId = buildpackId;
				}

				public String getBuildpackTenantId() {
					return this.buildpackTenantId;
				}

				public void setBuildpackTenantId(String buildpackTenantId) {
					this.buildpackTenantId = buildpackTenantId;
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

				public String getFileChecksum() {
					return this.fileChecksum;
				}

				public void setFileChecksum(String fileChecksum) {
					this.fileChecksum = fileChecksum;
				}

				public String getFileLocation() {
					return this.fileLocation;
				}

				public void setFileLocation(String fileLocation) {
					this.fileLocation = fileLocation;
				}

				public Long getFileSize() {
					return this.fileSize;
				}

				public void setFileSize(Long fileSize) {
					this.fileSize = fileSize;
				}

				public String getFileStatus() {
					return this.fileStatus;
				}

				public void setFileStatus(String fileStatus) {
					this.fileStatus = fileStatus;
				}

				public String getFromRegionId() {
					return this.fromRegionId;
				}

				public void setFromRegionId(String fromRegionId) {
					this.fromRegionId = fromRegionId;
				}

				public String getIaasProviderId() {
					return this.iaasProviderId;
				}

				public void setIaasProviderId(String iaasProviderId) {
					this.iaasProviderId = iaasProviderId;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getIdentity() {
					return this.identity;
				}

				public void setIdentity(String identity) {
					this.identity = identity;
				}

				public String getModificationTime() {
					return this.modificationTime;
				}

				public void setModificationTime(String modificationTime) {
					this.modificationTime = modificationTime;
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

				public String getObjectName() {
					return this.objectName;
				}

				public void setObjectName(String objectName) {
					this.objectName = objectName;
				}

				public String getOriginalFileName() {
					return this.originalFileName;
				}

				public void setOriginalFileName(String originalFileName) {
					this.originalFileName = originalFileName;
				}

				public String getReadableFileSize() {
					return this.readableFileSize;
				}

				public void setReadableFileSize(String readableFileSize) {
					this.readableFileSize = readableFileSize;
				}

				public String getState() {
					return this.state;
				}

				public void setState(String state) {
					this.state = state;
				}

				public String getUtcCreate() {
					return this.utcCreate;
				}

				public void setUtcCreate(String utcCreate) {
					this.utcCreate = utcCreate;
				}

				public String getUtcModified() {
					return this.utcModified;
				}

				public void setUtcModified(String utcModified) {
					this.utcModified = utcModified;
				}

				public String getZoneDtos() {
					return this.zoneDtos;
				}

				public void setZoneDtos(String zoneDtos) {
					this.zoneDtos = zoneDtos;
				}
			}
		}

		public static class Techstack {

			private String description;

			private String extraInfo;

			private String id;

			private String identity;

			private String name;

			private String scope;

			private String status;

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getExtraInfo() {
				return this.extraInfo;
			}

			public void setExtraInfo(String extraInfo) {
				this.extraInfo = extraInfo;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getIdentity() {
				return this.identity;
			}

			public void setIdentity(String identity) {
				this.identity = identity;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getScope() {
				return this.scope;
			}

			public void setScope(String scope) {
				this.scope = scope;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public DescribeBuildpackResponse getInstance(UnmarshallerContext context) {
		return	DescribeBuildpackResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
