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
import com.aliyuncs.sofa.transform.v20190815.DescribeBuildpackIdVersionPairsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBuildpackIdVersionPairsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long currentPage;

	private Long pageSize;

	private Long totalCount;

	private List<BuildpackCompositeVOsItem> buildpackCompositeVOs;

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

	public List<BuildpackCompositeVOsItem> getBuildpackCompositeVOs() {
		return this.buildpackCompositeVOs;
	}

	public void setBuildpackCompositeVOs(List<BuildpackCompositeVOsItem> buildpackCompositeVOs) {
		this.buildpackCompositeVOs = buildpackCompositeVOs;
	}

	public static class BuildpackCompositeVOsItem {

		private Long appServiceCount;

		private String description;

		private String fullVersion;

		private String id;

		private String originType;

		private List<SupportedOSItem> supportedOS;

		private List<SupportedRegionsItem> supportedRegions;

		private Creator creator;

		private Publisher publisher;

		private Techstack techstack;

		public Long getAppServiceCount() {
			return this.appServiceCount;
		}

		public void setAppServiceCount(Long appServiceCount) {
			this.appServiceCount = appServiceCount;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
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

		public String getOriginType() {
			return this.originType;
		}

		public void setOriginType(String originType) {
			this.originType = originType;
		}

		public List<SupportedOSItem> getSupportedOS() {
			return this.supportedOS;
		}

		public void setSupportedOS(List<SupportedOSItem> supportedOS) {
			this.supportedOS = supportedOS;
		}

		public List<SupportedRegionsItem> getSupportedRegions() {
			return this.supportedRegions;
		}

		public void setSupportedRegions(List<SupportedRegionsItem> supportedRegions) {
			this.supportedRegions = supportedRegions;
		}

		public Creator getCreator() {
			return this.creator;
		}

		public void setCreator(Creator creator) {
			this.creator = creator;
		}

		public Publisher getPublisher() {
			return this.publisher;
		}

		public void setPublisher(Publisher publisher) {
			this.publisher = publisher;
		}

		public Techstack getTechstack() {
			return this.techstack;
		}

		public void setTechstack(Techstack techstack) {
			this.techstack = techstack;
		}

		public static class SupportedOSItem {

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

		public static class SupportedRegionsItem {

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

				private String id;

				private String name;

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
			}
		}

		public static class Creator {

			private String customerId;

			private String name;

			private String realName;

			private String type;

			public String getCustomerId() {
				return this.customerId;
			}

			public void setCustomerId(String customerId) {
				this.customerId = customerId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getRealName() {
				return this.realName;
			}

			public void setRealName(String realName) {
				this.realName = realName;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}

		public static class Publisher {

			private String customerId;

			private String name;

			private String realName;

			private String type;

			public String getCustomerId() {
				return this.customerId;
			}

			public void setCustomerId(String customerId) {
				this.customerId = customerId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getRealName() {
				return this.realName;
			}

			public void setRealName(String realName) {
				this.realName = realName;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
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
	public DescribeBuildpackIdVersionPairsResponse getInstance(UnmarshallerContext context) {
		return	DescribeBuildpackIdVersionPairsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
