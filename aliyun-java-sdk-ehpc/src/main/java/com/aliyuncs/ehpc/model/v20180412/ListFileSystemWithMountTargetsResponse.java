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

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.ListFileSystemWithMountTargetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFileSystemWithMountTargetsResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<FileSystems> fileSystemList;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<FileSystems> getFileSystemList() {
		return this.fileSystemList;
	}

	public void setFileSystemList(List<FileSystems> fileSystemList) {
		this.fileSystemList = fileSystemList;
	}

	public static class FileSystems {

		private String status;

		private Integer capacity;

		private String createTime;

		private String storageType;

		private Integer bandWidth;

		private String regionId;

		private String fileSystemId;

		private String fileSystemType;

		private Integer meteredSize;

		private Integer encryptType;

		private String protocolType;

		private String destription;

		private String vpcId;

		private List<Packages> packageList;

		private List<MountTargets> mountTargetList;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getCapacity() {
			return this.capacity;
		}

		public void setCapacity(Integer capacity) {
			this.capacity = capacity;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public Integer getBandWidth() {
			return this.bandWidth;
		}

		public void setBandWidth(Integer bandWidth) {
			this.bandWidth = bandWidth;
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

		public Integer getMeteredSize() {
			return this.meteredSize;
		}

		public void setMeteredSize(Integer meteredSize) {
			this.meteredSize = meteredSize;
		}

		public Integer getEncryptType() {
			return this.encryptType;
		}

		public void setEncryptType(Integer encryptType) {
			this.encryptType = encryptType;
		}

		public String getProtocolType() {
			return this.protocolType;
		}

		public void setProtocolType(String protocolType) {
			this.protocolType = protocolType;
		}

		public String getDestription() {
			return this.destription;
		}

		public void setDestription(String destription) {
			this.destription = destription;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public List<Packages> getPackageList() {
			return this.packageList;
		}

		public void setPackageList(List<Packages> packageList) {
			this.packageList = packageList;
		}

		public List<MountTargets> getMountTargetList() {
			return this.mountTargetList;
		}

		public void setMountTargetList(List<MountTargets> mountTargetList) {
			this.mountTargetList = mountTargetList;
		}

		public static class Packages {

			private String packageId;

			public String getPackageId() {
				return this.packageId;
			}

			public void setPackageId(String packageId) {
				this.packageId = packageId;
			}
		}

		public static class MountTargets {

			private String status;

			private String vpcId;

			private String mountTargetDomain;

			private String accessGroup;

			private String vswId;

			private String networkType;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getMountTargetDomain() {
				return this.mountTargetDomain;
			}

			public void setMountTargetDomain(String mountTargetDomain) {
				this.mountTargetDomain = mountTargetDomain;
			}

			public String getAccessGroup() {
				return this.accessGroup;
			}

			public void setAccessGroup(String accessGroup) {
				this.accessGroup = accessGroup;
			}

			public String getVswId() {
				return this.vswId;
			}

			public void setVswId(String vswId) {
				this.vswId = vswId;
			}

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}
		}
	}

	@Override
	public ListFileSystemWithMountTargetsResponse getInstance(UnmarshallerContext context) {
		return	ListFileSystemWithMountTargetsResponseUnmarshaller.unmarshall(this, context);
	}
}
