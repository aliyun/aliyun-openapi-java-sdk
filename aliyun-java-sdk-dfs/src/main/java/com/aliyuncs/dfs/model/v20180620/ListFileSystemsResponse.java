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

package com.aliyuncs.dfs.model.v20180620;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dfs.transform.v20180620.ListFileSystemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFileSystemsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private String nextToken;

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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<FileSystem> getFileSystems() {
		return this.fileSystems;
	}

	public void setFileSystems(List<FileSystem> fileSystems) {
		this.fileSystems = fileSystems;
	}

	public static class FileSystem {

		private String createTime;

		private Long provisionedThroughputInMiBps;

		private Long spaceCapacity;

		private String storageType;

		private Float usedSpaceSize;

		private String regionId;

		private String fileSystemId;

		private String fileSystemName;

		private String description;

		private Long mountPointCount;

		private String throughputMode;

		private String zoneId;

		private Long numberOfFiles;

		private String storagePackageId;

		private Long numberOfDirectories;

		private String protocolType;

		private String version;

		private Float meteringSpaceSize;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getProvisionedThroughputInMiBps() {
			return this.provisionedThroughputInMiBps;
		}

		public void setProvisionedThroughputInMiBps(Long provisionedThroughputInMiBps) {
			this.provisionedThroughputInMiBps = provisionedThroughputInMiBps;
		}

		public Long getSpaceCapacity() {
			return this.spaceCapacity;
		}

		public void setSpaceCapacity(Long spaceCapacity) {
			this.spaceCapacity = spaceCapacity;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public Float getUsedSpaceSize() {
			return this.usedSpaceSize;
		}

		public void setUsedSpaceSize(Float usedSpaceSize) {
			this.usedSpaceSize = usedSpaceSize;
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

		public String getFileSystemName() {
			return this.fileSystemName;
		}

		public void setFileSystemName(String fileSystemName) {
			this.fileSystemName = fileSystemName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getMountPointCount() {
			return this.mountPointCount;
		}

		public void setMountPointCount(Long mountPointCount) {
			this.mountPointCount = mountPointCount;
		}

		public String getThroughputMode() {
			return this.throughputMode;
		}

		public void setThroughputMode(String throughputMode) {
			this.throughputMode = throughputMode;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public Long getNumberOfFiles() {
			return this.numberOfFiles;
		}

		public void setNumberOfFiles(Long numberOfFiles) {
			this.numberOfFiles = numberOfFiles;
		}

		public String getStoragePackageId() {
			return this.storagePackageId;
		}

		public void setStoragePackageId(String storagePackageId) {
			this.storagePackageId = storagePackageId;
		}

		public Long getNumberOfDirectories() {
			return this.numberOfDirectories;
		}

		public void setNumberOfDirectories(Long numberOfDirectories) {
			this.numberOfDirectories = numberOfDirectories;
		}

		public String getProtocolType() {
			return this.protocolType;
		}

		public void setProtocolType(String protocolType) {
			this.protocolType = protocolType;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public Float getMeteringSpaceSize() {
			return this.meteringSpaceSize;
		}

		public void setMeteringSpaceSize(Float meteringSpaceSize) {
			this.meteringSpaceSize = meteringSpaceSize;
		}
	}

	@Override
	public ListFileSystemsResponse getInstance(UnmarshallerContext context) {
		return	ListFileSystemsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
