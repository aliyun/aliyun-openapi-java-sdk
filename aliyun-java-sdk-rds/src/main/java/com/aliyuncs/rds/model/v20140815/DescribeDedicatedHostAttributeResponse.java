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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeDedicatedHostAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDedicatedHostAttributeResponse extends AcsResponse {

	private String requestId;

	private String dedicatedHostGroupId;

	private String dedicatedHostId;

	private String regionId;

	private String zoneId;

	private String vPCId;

	private String vSwitchId;

	private String iPAddress;

	private String hostName;

	private String hostStatus;

	private String hostClass;

	private Integer hostCPU;

	private Integer hostMem;

	private Integer hostStorage;

	private String cPUAllocationRatio;

	private String memAllocationRatio;

	private String diskAllocationRatio;

	private Integer instanceNumber;

	private Integer instanceNumberMaster;

	private Integer instanceNumberSlave;

	private Integer instanceNumberROMaster;

	private Integer instanceNumberROSlave;

	private String createdTime;

	private String expiredTime;

	private String autoRenew;

	private String allocationStatus;

	private String cpuUsed;

	private String memoryUsed;

	private String storageUsed;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public String getBizRegionId() {
		return this.regionId;
	}

	public void setBizRegionId(String regionId) {
		this.regionId = regionId;
	}

	/**
	 * @deprecated use getBizRegionId instead of this.
	 */
	@Deprecated
	public String getRegionId() {
		return this.regionId;
	}

	/**
	 * @deprecated use setBizRegionId instead of this.
	 */
	@Deprecated
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
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

	public String getIPAddress() {
		return this.iPAddress;
	}

	public void setIPAddress(String iPAddress) {
		this.iPAddress = iPAddress;
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

	public String getHostClass() {
		return this.hostClass;
	}

	public void setHostClass(String hostClass) {
		this.hostClass = hostClass;
	}

	public Integer getHostCPU() {
		return this.hostCPU;
	}

	public void setHostCPU(Integer hostCPU) {
		this.hostCPU = hostCPU;
	}

	public Integer getHostMem() {
		return this.hostMem;
	}

	public void setHostMem(Integer hostMem) {
		this.hostMem = hostMem;
	}

	public Integer getHostStorage() {
		return this.hostStorage;
	}

	public void setHostStorage(Integer hostStorage) {
		this.hostStorage = hostStorage;
	}

	public String getCPUAllocationRatio() {
		return this.cPUAllocationRatio;
	}

	public void setCPUAllocationRatio(String cPUAllocationRatio) {
		this.cPUAllocationRatio = cPUAllocationRatio;
	}

	public String getMemAllocationRatio() {
		return this.memAllocationRatio;
	}

	public void setMemAllocationRatio(String memAllocationRatio) {
		this.memAllocationRatio = memAllocationRatio;
	}

	public String getDiskAllocationRatio() {
		return this.diskAllocationRatio;
	}

	public void setDiskAllocationRatio(String diskAllocationRatio) {
		this.diskAllocationRatio = diskAllocationRatio;
	}

	public Integer getInstanceNumber() {
		return this.instanceNumber;
	}

	public void setInstanceNumber(Integer instanceNumber) {
		this.instanceNumber = instanceNumber;
	}

	public Integer getInstanceNumberMaster() {
		return this.instanceNumberMaster;
	}

	public void setInstanceNumberMaster(Integer instanceNumberMaster) {
		this.instanceNumberMaster = instanceNumberMaster;
	}

	public Integer getInstanceNumberSlave() {
		return this.instanceNumberSlave;
	}

	public void setInstanceNumberSlave(Integer instanceNumberSlave) {
		this.instanceNumberSlave = instanceNumberSlave;
	}

	public Integer getInstanceNumberROMaster() {
		return this.instanceNumberROMaster;
	}

	public void setInstanceNumberROMaster(Integer instanceNumberROMaster) {
		this.instanceNumberROMaster = instanceNumberROMaster;
	}

	public Integer getInstanceNumberROSlave() {
		return this.instanceNumberROSlave;
	}

	public void setInstanceNumberROSlave(Integer instanceNumberROSlave) {
		this.instanceNumberROSlave = instanceNumberROSlave;
	}

	public String getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getExpiredTime() {
		return this.expiredTime;
	}

	public void setExpiredTime(String expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(String autoRenew) {
		this.autoRenew = autoRenew;
	}

	public String getAllocationStatus() {
		return this.allocationStatus;
	}

	public void setAllocationStatus(String allocationStatus) {
		this.allocationStatus = allocationStatus;
	}

	public String getCpuUsed() {
		return this.cpuUsed;
	}

	public void setCpuUsed(String cpuUsed) {
		this.cpuUsed = cpuUsed;
	}

	public String getMemoryUsed() {
		return this.memoryUsed;
	}

	public void setMemoryUsed(String memoryUsed) {
		this.memoryUsed = memoryUsed;
	}

	public String getStorageUsed() {
		return this.storageUsed;
	}

	public void setStorageUsed(String storageUsed) {
		this.storageUsed = storageUsed;
	}

	@Override
	public DescribeDedicatedHostAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeDedicatedHostAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
