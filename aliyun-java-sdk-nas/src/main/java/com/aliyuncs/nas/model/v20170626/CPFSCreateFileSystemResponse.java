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

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.CPFSCreateFileSystemResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CPFSCreateFileSystemResponse extends AcsResponse {

	private String requestId;

	private FileSystem fileSystem;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public FileSystem getFileSystem() {
		return this.fileSystem;
	}

	public void setFileSystem(FileSystem fileSystem) {
		this.fileSystem = fileSystem;
	}

	public static class FileSystem {

		private String fsId;

		private String fsDesc;

		private String fsSpec;

		private Long bandwidth;

		private Long capacity;

		private Long meteredSize;

		private String createTime;

		private String networkType;

		private String mountTargets;

		private String regionId;

		private String zoneId;

		private String vpcId;

		private String vSwitchId;

		public String getFsId() {
			return this.fsId;
		}

		public void setFsId(String fsId) {
			this.fsId = fsId;
		}

		public String getFsDesc() {
			return this.fsDesc;
		}

		public void setFsDesc(String fsDesc) {
			this.fsDesc = fsDesc;
		}

		public String getFsSpec() {
			return this.fsSpec;
		}

		public void setFsSpec(String fsSpec) {
			this.fsSpec = fsSpec;
		}

		public Long getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Long bandwidth) {
			this.bandwidth = bandwidth;
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

		public String getMountTargets() {
			return this.mountTargets;
		}

		public void setMountTargets(String mountTargets) {
			this.mountTargets = mountTargets;
		}

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

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}
	}

	@Override
	public CPFSCreateFileSystemResponse getInstance(UnmarshallerContext context) {
		return	CPFSCreateFileSystemResponseUnmarshaller.unmarshall(this, context);
	}
}
