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

		private String contactInfo;

		private Boolean debugMode;

		private String depracationNote;

		private String description;

		private String fullVersion;

		private String id;

		private String industryLabel;

		private Long majorVersion;

		private Long minorVersion;

		private String originType;

		private Long patchVersion;

		private String publicationTime;

		private String publicationTimeDate;

		private String scope;

		private String status;

		private Long techstackId;

		private List<SupportedOsItem> supportedOs;

		private List<SupportedRegionsListItem> supportedRegionsList;

		private List<String> availableTenantNames;

		private List<String> supportedRegions;

		private Techstack techstack;

		public Long getAppServiceCount() {
			return this.appServiceCount;
		}

		public void setAppServiceCount(Long appServiceCount) {
			this.appServiceCount = appServiceCount;
		}

		public String getContactInfo() {
			return this.contactInfo;
		}

		public void setContactInfo(String contactInfo) {
			this.contactInfo = contactInfo;
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
