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
import com.aliyuncs.ens.transform.v20171110.DescribeFileSystemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFileSystemsResponse extends AcsResponse {

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private String requestId;

	private List<FileSystemsItem> fileSystems;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

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

	public List<FileSystemsItem> getFileSystems() {
		return this.fileSystems;
	}

	public void setFileSystems(List<FileSystemsItem> fileSystems) {
		this.fileSystems = fileSystems;
	}

	public static class FileSystemsItem {

		private String fileSystemId;

		private String fileSystemName;

		private String ensRegionId;

		private String storageType;

		private String protocolType;

		private Long capacity;

		private Long meteredSize;

		private String status;

		private String payType;

		private String creationTime;

		private String description;

		private List<MountTargetsItem> mountTargets;

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

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getProtocolType() {
			return this.protocolType;
		}

		public void setProtocolType(String protocolType) {
			this.protocolType = protocolType;
		}

		public Long getCapacity() {
			return this.capacity;
		}

		public void setCapacity(Long capacity) {
			this.capacity = capacity;
		}

		public Long getMeteredSize() {
			return this.meteredSize;
		}

		public void setMeteredSize(Long meteredSize) {
			this.meteredSize = meteredSize;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
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

		public List<MountTargetsItem> getMountTargets() {
			return this.mountTargets;
		}

		public void setMountTargets(List<MountTargetsItem> mountTargets) {
			this.mountTargets = mountTargets;
		}

		public static class MountTargetsItem {

			private String mountTargetDomain;

			private String mountTargetName;

			private String netWorkId;

			private String status;

			public String getMountTargetDomain() {
				return this.mountTargetDomain;
			}

			public void setMountTargetDomain(String mountTargetDomain) {
				this.mountTargetDomain = mountTargetDomain;
			}

			public String getMountTargetName() {
				return this.mountTargetName;
			}

			public void setMountTargetName(String mountTargetName) {
				this.mountTargetName = mountTargetName;
			}

			public String getNetWorkId() {
				return this.netWorkId;
			}

			public void setNetWorkId(String netWorkId) {
				this.netWorkId = netWorkId;
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
	public DescribeFileSystemsResponse getInstance(UnmarshallerContext context) {
		return	DescribeFileSystemsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
