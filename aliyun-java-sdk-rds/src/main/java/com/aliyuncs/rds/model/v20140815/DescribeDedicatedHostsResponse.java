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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeDedicatedHostsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDedicatedHostsResponse extends AcsResponse {

	private String dedicatedHostGroupId;

	private String requestId;

	private List<DedicatedHostsItem> dedicatedHosts;

	public String getDedicatedHostGroupId() {
		return this.dedicatedHostGroupId;
	}

	public void setDedicatedHostGroupId(String dedicatedHostGroupId) {
		this.dedicatedHostGroupId = dedicatedHostGroupId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DedicatedHostsItem> getDedicatedHosts() {
		return this.dedicatedHosts;
	}

	public void setDedicatedHosts(List<DedicatedHostsItem> dedicatedHosts) {
		this.dedicatedHosts = dedicatedHosts;
	}

	public static class DedicatedHostsItem {

		private String accountName;

		private String allocationStatus;

		private String bastionInstanceId;

		private String cPUAllocationRatio;

		private String cpuUsed;

		private String createdTime;

		private String dedicatedHostGroupId;

		private String dedicatedHostId;

		private String diskAllocationRatio;

		private String endTime;

		private String engine;

		private String hostCPU;

		private String hostClass;

		private String hostMem;

		private String hostName;

		private String hostStatus;

		private String hostStorage;

		private String hostType;

		private String iPAddress;

		private String imageCategory;

		private String instanceNumber;

		private String memAllocationRatio;

		private String memoryUsed;

		private String openPermission;

		private String storageUsed;

		private String vPCId;

		private String vSwitchId;

		private String zoneId;

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public String getAllocationStatus() {
			return this.allocationStatus;
		}

		public void setAllocationStatus(String allocationStatus) {
			this.allocationStatus = allocationStatus;
		}

		public String getBastionInstanceId() {
			return this.bastionInstanceId;
		}

		public void setBastionInstanceId(String bastionInstanceId) {
			this.bastionInstanceId = bastionInstanceId;
		}

		public String getCPUAllocationRatio() {
			return this.cPUAllocationRatio;
		}

		public void setCPUAllocationRatio(String cPUAllocationRatio) {
			this.cPUAllocationRatio = cPUAllocationRatio;
		}

		public String getCpuUsed() {
			return this.cpuUsed;
		}

		public void setCpuUsed(String cpuUsed) {
			this.cpuUsed = cpuUsed;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getDedicatedHostGroupId() {
			return this.dedicatedHostGroupId;
		}

		public void setDedicatedHostGroupId(String dedicatedHostGroupId) {
			this.dedicatedHostGroupId = dedicatedHostGroupId;
		}

		public String getDedicatedHostId() {
			return this.dedicatedHostId;
		}

		public void setDedicatedHostId(String dedicatedHostId) {
			this.dedicatedHostId = dedicatedHostId;
		}

		public String getDiskAllocationRatio() {
			return this.diskAllocationRatio;
		}

		public void setDiskAllocationRatio(String diskAllocationRatio) {
			this.diskAllocationRatio = diskAllocationRatio;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getHostCPU() {
			return this.hostCPU;
		}

		public void setHostCPU(String hostCPU) {
			this.hostCPU = hostCPU;
		}

		public String getHostClass() {
			return this.hostClass;
		}

		public void setHostClass(String hostClass) {
			this.hostClass = hostClass;
		}

		public String getHostMem() {
			return this.hostMem;
		}

		public void setHostMem(String hostMem) {
			this.hostMem = hostMem;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getHostStatus() {
			return this.hostStatus;
		}

		public void setHostStatus(String hostStatus) {
			this.hostStatus = hostStatus;
		}

		public String getHostStorage() {
			return this.hostStorage;
		}

		public void setHostStorage(String hostStorage) {
			this.hostStorage = hostStorage;
		}

		public String getHostType() {
			return this.hostType;
		}

		public void setHostType(String hostType) {
			this.hostType = hostType;
		}

		public String getIPAddress() {
			return this.iPAddress;
		}

		public void setIPAddress(String iPAddress) {
			this.iPAddress = iPAddress;
		}

		public String getImageCategory() {
			return this.imageCategory;
		}

		public void setImageCategory(String imageCategory) {
			this.imageCategory = imageCategory;
		}

		public String getInstanceNumber() {
			return this.instanceNumber;
		}

		public void setInstanceNumber(String instanceNumber) {
			this.instanceNumber = instanceNumber;
		}

		public String getMemAllocationRatio() {
			return this.memAllocationRatio;
		}

		public void setMemAllocationRatio(String memAllocationRatio) {
			this.memAllocationRatio = memAllocationRatio;
		}

		public String getMemoryUsed() {
			return this.memoryUsed;
		}

		public void setMemoryUsed(String memoryUsed) {
			this.memoryUsed = memoryUsed;
		}

		public String getOpenPermission() {
			return this.openPermission;
		}

		public void setOpenPermission(String openPermission) {
			this.openPermission = openPermission;
		}

		public String getStorageUsed() {
			return this.storageUsed;
		}

		public void setStorageUsed(String storageUsed) {
			this.storageUsed = storageUsed;
		}

		public String getVPCId() {
			return this.vPCId;
		}

		public void setVPCId(String vPCId) {
			this.vPCId = vPCId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}
	}

	@Override
	public DescribeDedicatedHostsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDedicatedHostsResponseUnmarshaller.unmarshall(this, context);
	}
}
