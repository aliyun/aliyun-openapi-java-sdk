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
import com.aliyuncs.ecd.transform.v20200930.DescribeNASFileSystemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNASFileSystemsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<FileSystem> fileSystems;

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

	public List<FileSystem> getFileSystems() {
		return this.fileSystems;
	}

	public void setFileSystems(List<FileSystem> fileSystems) {
		this.fileSystems = fileSystems;
	}

	public static class FileSystem {

		private Long capacity;

		private String mountTargetStatus;

		private String createTime;

		private String officeSiteId;

		private Boolean supportAcl;

		private String storageType;

		private String officeSiteName;

		private String regionId;

		private String fileSystemId;

		private String fileSystemType;

		private String fileSystemName;

		private Long meteredSize;

		private String mountTargetDomain;

		private String description;

		private String zoneId;

		private String fileSystemStatus;

		public Long getCapacity() {
			return this.capacity;
		}

		public void setCapacity(Long capacity) {
			this.capacity = capacity;
		}

		public String getMountTargetStatus() {
			return this.mountTargetStatus;
		}

		public void setMountTargetStatus(String mountTargetStatus) {
			this.mountTargetStatus = mountTargetStatus;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getOfficeSiteId() {
			return this.officeSiteId;
		}

		public void setOfficeSiteId(String officeSiteId) {
			this.officeSiteId = officeSiteId;
		}

		public Boolean getSupportAcl() {
			return this.supportAcl;
		}

		public void setSupportAcl(Boolean supportAcl) {
			this.supportAcl = supportAcl;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getOfficeSiteName() {
			return this.officeSiteName;
		}

		public void setOfficeSiteName(String officeSiteName) {
			this.officeSiteName = officeSiteName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getFileSystemId() {
			return this.fileSystemId;
		}

		public void setFileSystemId(String fileSystemId) {
			this.fileSystemId = fileSystemId;
		}

		public String getFileSystemType() {
			return this.fileSystemType;
		}

		public void setFileSystemType(String fileSystemType) {
			this.fileSystemType = fileSystemType;
		}

		public String getFileSystemName() {
			return this.fileSystemName;
		}

		public void setFileSystemName(String fileSystemName) {
			this.fileSystemName = fileSystemName;
		}

		public Long getMeteredSize() {
			return this.meteredSize;
		}

		public void setMeteredSize(Long meteredSize) {
			this.meteredSize = meteredSize;
		}

		public String getMountTargetDomain() {
			return this.mountTargetDomain;
		}

		public void setMountTargetDomain(String mountTargetDomain) {
			this.mountTargetDomain = mountTargetDomain;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getFileSystemStatus() {
			return this.fileSystemStatus;
		}

		public void setFileSystemStatus(String fileSystemStatus) {
			this.fileSystemStatus = fileSystemStatus;
		}
	}

	@Override
	public DescribeNASFileSystemsResponse getInstance(UnmarshallerContext context) {
		return	DescribeNASFileSystemsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
