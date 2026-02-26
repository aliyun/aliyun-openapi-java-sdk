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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeStorageVolumeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStorageVolumeResponse extends AcsResponse {

	private String requestId;

	private String pageNumber;

	private String pageSize;

	private String totalCount;

	private List<StorageVolumesItem> storageVolumes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<StorageVolumesItem> getStorageVolumes() {
		return this.storageVolumes;
	}

	public void setStorageVolumes(List<StorageVolumesItem> storageVolumes) {
		this.storageVolumes = storageVolumes;
	}

	public static class StorageVolumesItem {

		private String storageVolumeId;

		private String storageVolumeName;

		private String storageGatewayId;

		private String storageId;

		private String creationTime;

		private Integer isEnable;

		private Integer isAuth;

		private String description;

		private String targetName;

		private String status;

		private String authProtocol;

		private String ensRegionId;

		public String getStorageVolumeId() {
			return this.storageVolumeId;
		}

		public void setStorageVolumeId(String storageVolumeId) {
			this.storageVolumeId = storageVolumeId;
		}

		public String getStorageVolumeName() {
			return this.storageVolumeName;
		}

		public void setStorageVolumeName(String storageVolumeName) {
			this.storageVolumeName = storageVolumeName;
		}

		public String getStorageGatewayId() {
			return this.storageGatewayId;
		}

		public void setStorageGatewayId(String storageGatewayId) {
			this.storageGatewayId = storageGatewayId;
		}

		public String getStorageId() {
			return this.storageId;
		}

		public void setStorageId(String storageId) {
			this.storageId = storageId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Integer getIsEnable() {
			return this.isEnable;
		}

		public void setIsEnable(Integer isEnable) {
			this.isEnable = isEnable;
		}

		public Integer getIsAuth() {
			return this.isAuth;
		}

		public void setIsAuth(Integer isAuth) {
			this.isAuth = isAuth;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getTargetName() {
			return this.targetName;
		}

		public void setTargetName(String targetName) {
			this.targetName = targetName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getAuthProtocol() {
			return this.authProtocol;
		}

		public void setAuthProtocol(String authProtocol) {
			this.authProtocol = authProtocol;
		}

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}
	}

	@Override
	public DescribeStorageVolumeResponse getInstance(UnmarshallerContext context) {
		return	DescribeStorageVolumeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
