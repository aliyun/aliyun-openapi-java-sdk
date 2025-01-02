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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dfs.transform.v20180620.GetMountPointResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMountPointResponse extends AcsResponse {

	private String requestId;

	private MountPoint mountPoint;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public MountPoint getMountPoint() {
		return this.mountPoint;
	}

	public void setMountPoint(MountPoint mountPoint) {
		this.mountPoint = mountPoint;
	}

	public static class MountPoint {

		private String status;

		private String vpcId;

		private String fileSystemId;

		private String vSwitchId;

		private String mountPointId;

		private String description;

		private String accessGroupId;

		private String createTime;

		private String networkType;

		private String mountPointDomain;

		private String regionId;

		private String mountPointAlias;

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

		public String getFileSystemId() {
			return this.fileSystemId;
		}

		public void setFileSystemId(String fileSystemId) {
			this.fileSystemId = fileSystemId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getMountPointId() {
			return this.mountPointId;
		}

		public void setMountPointId(String mountPointId) {
			this.mountPointId = mountPointId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getAccessGroupId() {
			return this.accessGroupId;
		}

		public void setAccessGroupId(String accessGroupId) {
			this.accessGroupId = accessGroupId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getMountPointDomain() {
			return this.mountPointDomain;
		}

		public void setMountPointDomain(String mountPointDomain) {
			this.mountPointDomain = mountPointDomain;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getMountPointAlias() {
			return this.mountPointAlias;
		}

		public void setMountPointAlias(String mountPointAlias) {
			this.mountPointAlias = mountPointAlias;
		}
	}

	@Override
	public GetMountPointResponse getInstance(UnmarshallerContext context) {
		return	GetMountPointResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
