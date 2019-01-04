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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.DescribeFileSystemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFileSystemsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<FileSystem> fileSystems;

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

		private String fileSystemId;

		private String destription;

		private String createTime;

		private String regionId;

		private String protocolType;

		private String storageType;

		private Long meteredSize;

		private List<MountTarget> mountTargets;

		private List<_Package> packages;

		public String getFileSystemId() {
			return this.fileSystemId;
		}

		public void setFileSystemId(String fileSystemId) {
			this.fileSystemId = fileSystemId;
		}

		public String getDestription() {
			return this.destription;
		}

		public void setDestription(String destription) {
			this.destription = destription;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getProtocolType() {
			return this.protocolType;
		}

		public void setProtocolType(String protocolType) {
			this.protocolType = protocolType;
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

		public static class MountTarget {

			private String mountTargetDomain;

			public String getMountTargetDomain() {
				return this.mountTargetDomain;
			}

			public void setMountTargetDomain(String mountTargetDomain) {
				this.mountTargetDomain = mountTargetDomain;
			}
		}

		public static class _Package {

			private String packageId;

			public String getPackageId() {
				return this.packageId;
			}

			public void setPackageId(String packageId) {
				this.packageId = packageId;
			}
		}
	}

	@Override
	public DescribeFileSystemsResponse getInstance(UnmarshallerContext context) {
		return	DescribeFileSystemsResponseUnmarshaller.unmarshall(this, context);
	}
}
