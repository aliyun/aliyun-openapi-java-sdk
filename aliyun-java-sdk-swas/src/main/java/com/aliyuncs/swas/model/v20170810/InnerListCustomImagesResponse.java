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

package com.aliyuncs.swas.model.v20170810;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas.transform.v20170810.InnerListCustomImagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerListCustomImagesResponse extends AcsResponse {

	private Boolean isSuccess;

	private String requestId;

	private String code;

	private Long pageNumber;

	private Long pageSize;

	private Long totalCount;

	private List<CustomImageInfo> customImageInfos;

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
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

	public List<CustomImageInfo> getCustomImageInfos() {
		return this.customImageInfos;
	}

	public void setCustomImageInfos(List<CustomImageInfo> customImageInfos) {
		this.customImageInfos = customImageInfos;
	}

	public static class CustomImageInfo {

		private Long creationTime;

		private String dataSnapshotName;

		private String systemSnapshotId;

		private Integer inShare;

		private String instanceId;

		private String dataSnapshotId;

		private String regionId;

		private String serverName;

		private String systemSnapshotName;

		private String description;

		private String name;

		private String imageId;

		private Long status;

		private String resourceImageName;

		private String resourceImageVersion;

		public Long getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(Long creationTime) {
			this.creationTime = creationTime;
		}

		public String getDataSnapshotName() {
			return this.dataSnapshotName;
		}

		public void setDataSnapshotName(String dataSnapshotName) {
			this.dataSnapshotName = dataSnapshotName;
		}

		public String getSystemSnapshotId() {
			return this.systemSnapshotId;
		}

		public void setSystemSnapshotId(String systemSnapshotId) {
			this.systemSnapshotId = systemSnapshotId;
		}

		public Integer getInShare() {
			return this.inShare;
		}

		public void setInShare(Integer inShare) {
			this.inShare = inShare;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getDataSnapshotId() {
			return this.dataSnapshotId;
		}

		public void setDataSnapshotId(String dataSnapshotId) {
			this.dataSnapshotId = dataSnapshotId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getServerName() {
			return this.serverName;
		}

		public void setServerName(String serverName) {
			this.serverName = serverName;
		}

		public String getSystemSnapshotName() {
			return this.systemSnapshotName;
		}

		public void setSystemSnapshotName(String systemSnapshotName) {
			this.systemSnapshotName = systemSnapshotName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public String getResourceImageName() {
			return this.resourceImageName;
		}

		public void setResourceImageName(String resourceImageName) {
			this.resourceImageName = resourceImageName;
		}

		public String getResourceImageVersion() {
			return this.resourceImageVersion;
		}

		public void setResourceImageVersion(String resourceImageVersion) {
			this.resourceImageVersion = resourceImageVersion;
		}
	}

	@Override
	public InnerListCustomImagesResponse getInstance(UnmarshallerContext context) {
		return	InnerListCustomImagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
