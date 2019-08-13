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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListHpHostResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListHpHostResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<HpHost> hpHostList;

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

	public List<HpHost> getHpHostList() {
		return this.hpHostList;
	}

	public void setHpHostList(List<HpHost> hpHostList) {
		this.hpHostList = hpHostList;
	}

	public static class HpHost {

		private String bizId;

		private String hostName;

		private String innerIp;

		private String role;

		private String status;

		private String description;

		private Integer cpuCore;

		private Integer memSize;

		private String vpcId;

		private String vswitchId;

		private String securityGroupId;

		private String externalIp;

		private String externalKey;

		private List<Disk> diskList;

		private List<String> installedComponents;

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getInnerIp() {
			return this.innerIp;
		}

		public void setInnerIp(String innerIp) {
			this.innerIp = innerIp;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getCpuCore() {
			return this.cpuCore;
		}

		public void setCpuCore(Integer cpuCore) {
			this.cpuCore = cpuCore;
		}

		public Integer getMemSize() {
			return this.memSize;
		}

		public void setMemSize(Integer memSize) {
			this.memSize = memSize;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVswitchId() {
			return this.vswitchId;
		}

		public void setVswitchId(String vswitchId) {
			this.vswitchId = vswitchId;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getExternalIp() {
			return this.externalIp;
		}

		public void setExternalIp(String externalIp) {
			this.externalIp = externalIp;
		}

		public String getExternalKey() {
			return this.externalKey;
		}

		public void setExternalKey(String externalKey) {
			this.externalKey = externalKey;
		}

		public List<Disk> getDiskList() {
			return this.diskList;
		}

		public void setDiskList(List<Disk> diskList) {
			this.diskList = diskList;
		}

		public List<String> getInstalledComponents() {
			return this.installedComponents;
		}

		public void setInstalledComponents(List<String> installedComponents) {
			this.installedComponents = installedComponents;
		}

		public static class Disk {

			private String diskDevice;

			private Integer diskSize;

			private String mountPath;

			public String getDiskDevice() {
				return this.diskDevice;
			}

			public void setDiskDevice(String diskDevice) {
				this.diskDevice = diskDevice;
			}

			public Integer getDiskSize() {
				return this.diskSize;
			}

			public void setDiskSize(Integer diskSize) {
				this.diskSize = diskSize;
			}

			public String getMountPath() {
				return this.mountPath;
			}

			public void setMountPath(String mountPath) {
				this.mountPath = mountPath;
			}
		}
	}

	@Override
	public ListHpHostResponse getInstance(UnmarshallerContext context) {
		return	ListHpHostResponseUnmarshaller.unmarshall(this, context);
	}
}
