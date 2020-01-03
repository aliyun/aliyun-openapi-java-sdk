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
import com.aliyuncs.ehpc.transform.v20180412.ListCpfsFileSystemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCpfsFileSystemsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<FileSystems> fileSystemList;

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

	public List<FileSystems> getFileSystemList() {
		return this.fileSystemList;
	}

	public void setFileSystemList(List<FileSystems> fileSystemList) {
		this.fileSystemList = fileSystemList;
	}

	public static class FileSystems {

		private String regionId;

		private String zoneId;

		private String fileSystemId;

		private String createTime;

		private String destription;

		private String protocolType;

		private String capacity;

		private List<MountTargets> mountTargetList;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getFileSystemId() {
			return this.fileSystemId;
		}

		public void setFileSystemId(String fileSystemId) {
			this.fileSystemId = fileSystemId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDestription() {
			return this.destription;
		}

		public void setDestription(String destription) {
			this.destription = destription;
		}

		public String getProtocolType() {
			return this.protocolType;
		}

		public void setProtocolType(String protocolType) {
			this.protocolType = protocolType;
		}

		public String getCapacity() {
			return this.capacity;
		}

		public void setCapacity(String capacity) {
			this.capacity = capacity;
		}

		public List<MountTargets> getMountTargetList() {
			return this.mountTargetList;
		}

		public void setMountTargetList(List<MountTargets> mountTargetList) {
			this.mountTargetList = mountTargetList;
		}

		public static class MountTargets {

			private String mountTargetDomain;

			private String status;

			private String networkType;

			private String vswId;

			private String vpcId;

			public String getMountTargetDomain() {
				return this.mountTargetDomain;
			}

			public void setMountTargetDomain(String mountTargetDomain) {
				this.mountTargetDomain = mountTargetDomain;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}

			public String getVswId() {
				return this.vswId;
			}

			public void setVswId(String vswId) {
				this.vswId = vswId;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}
		}
	}

	@Override
	public ListCpfsFileSystemsResponse getInstance(UnmarshallerContext context) {
		return	ListCpfsFileSystemsResponseUnmarshaller.unmarshall(this, context);
	}
}
