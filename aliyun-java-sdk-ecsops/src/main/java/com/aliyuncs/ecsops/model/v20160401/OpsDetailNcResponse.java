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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDetailNcResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDetailNcResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String success;

	private String ncId;

	private String ncIp;

	private String sn;

	private String houyiZoneNo;

	private String houyiClusterNo;

	private String rackId;

	private Integer totalCpu;

	private Integer totalMem;

	private Integer availableCpu;

	private Integer availableMem;

	private Integer totalDiskIo1;

	private Integer totalDiskIo2;

	private Integer avaliableDiskIo1;

	private Integer avaliableDiskIo2;

	private Integer totalEcu;

	private Integer avaliableEcu;

	private Integer totalGpu;

	private Integer avaliableGpu;

	private Long totalBps;

	private Long availableBps;

	private Long totalPps;

	private Long availablePps;

	private Integer realCpu;

	private Integer realEcu;

	private String ncType;

	private String cpuModel;

	private String podId;

	private String aswId;

	private Boolean canRecover;

	private String hostname;

	private String ncVirtVersion;

	private String lockType;

	private String lockReason;

	private String bizStatus;

	private String status;

	private String grayBizType;

	private String grayBizTagA;

	private String ncResourceType;

	private String dedicatedHostId;

	private List<VmInfo> vmInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getNcId() {
		return this.ncId;
	}

	public void setNcId(String ncId) {
		this.ncId = ncId;
	}

	public String getNcIp() {
		return this.ncIp;
	}

	public void setNcIp(String ncIp) {
		this.ncIp = ncIp;
	}

	public String getSn() {
		return this.sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getHouyiZoneNo() {
		return this.houyiZoneNo;
	}

	public void setHouyiZoneNo(String houyiZoneNo) {
		this.houyiZoneNo = houyiZoneNo;
	}

	public String getHouyiClusterNo() {
		return this.houyiClusterNo;
	}

	public void setHouyiClusterNo(String houyiClusterNo) {
		this.houyiClusterNo = houyiClusterNo;
	}

	public String getRackId() {
		return this.rackId;
	}

	public void setRackId(String rackId) {
		this.rackId = rackId;
	}

	public Integer getTotalCpu() {
		return this.totalCpu;
	}

	public void setTotalCpu(Integer totalCpu) {
		this.totalCpu = totalCpu;
	}

	public Integer getTotalMem() {
		return this.totalMem;
	}

	public void setTotalMem(Integer totalMem) {
		this.totalMem = totalMem;
	}

	public Integer getAvailableCpu() {
		return this.availableCpu;
	}

	public void setAvailableCpu(Integer availableCpu) {
		this.availableCpu = availableCpu;
	}

	public Integer getAvailableMem() {
		return this.availableMem;
	}

	public void setAvailableMem(Integer availableMem) {
		this.availableMem = availableMem;
	}

	public Integer getTotalDiskIo1() {
		return this.totalDiskIo1;
	}

	public void setTotalDiskIo1(Integer totalDiskIo1) {
		this.totalDiskIo1 = totalDiskIo1;
	}

	public Integer getTotalDiskIo2() {
		return this.totalDiskIo2;
	}

	public void setTotalDiskIo2(Integer totalDiskIo2) {
		this.totalDiskIo2 = totalDiskIo2;
	}

	public Integer getAvaliableDiskIo1() {
		return this.avaliableDiskIo1;
	}

	public void setAvaliableDiskIo1(Integer avaliableDiskIo1) {
		this.avaliableDiskIo1 = avaliableDiskIo1;
	}

	public Integer getAvaliableDiskIo2() {
		return this.avaliableDiskIo2;
	}

	public void setAvaliableDiskIo2(Integer avaliableDiskIo2) {
		this.avaliableDiskIo2 = avaliableDiskIo2;
	}

	public Integer getTotalEcu() {
		return this.totalEcu;
	}

	public void setTotalEcu(Integer totalEcu) {
		this.totalEcu = totalEcu;
	}

	public Integer getAvaliableEcu() {
		return this.avaliableEcu;
	}

	public void setAvaliableEcu(Integer avaliableEcu) {
		this.avaliableEcu = avaliableEcu;
	}

	public Integer getTotalGpu() {
		return this.totalGpu;
	}

	public void setTotalGpu(Integer totalGpu) {
		this.totalGpu = totalGpu;
	}

	public Integer getAvaliableGpu() {
		return this.avaliableGpu;
	}

	public void setAvaliableGpu(Integer avaliableGpu) {
		this.avaliableGpu = avaliableGpu;
	}

	public Long getTotalBps() {
		return this.totalBps;
	}

	public void setTotalBps(Long totalBps) {
		this.totalBps = totalBps;
	}

	public Long getAvailableBps() {
		return this.availableBps;
	}

	public void setAvailableBps(Long availableBps) {
		this.availableBps = availableBps;
	}

	public Long getTotalPps() {
		return this.totalPps;
	}

	public void setTotalPps(Long totalPps) {
		this.totalPps = totalPps;
	}

	public Long getAvailablePps() {
		return this.availablePps;
	}

	public void setAvailablePps(Long availablePps) {
		this.availablePps = availablePps;
	}

	public Integer getRealCpu() {
		return this.realCpu;
	}

	public void setRealCpu(Integer realCpu) {
		this.realCpu = realCpu;
	}

	public Integer getRealEcu() {
		return this.realEcu;
	}

	public void setRealEcu(Integer realEcu) {
		this.realEcu = realEcu;
	}

	public String getNcType() {
		return this.ncType;
	}

	public void setNcType(String ncType) {
		this.ncType = ncType;
	}

	public String getCpuModel() {
		return this.cpuModel;
	}

	public void setCpuModel(String cpuModel) {
		this.cpuModel = cpuModel;
	}

	public String getPodId() {
		return this.podId;
	}

	public void setPodId(String podId) {
		this.podId = podId;
	}

	public String getAswId() {
		return this.aswId;
	}

	public void setAswId(String aswId) {
		this.aswId = aswId;
	}

	public Boolean getCanRecover() {
		return this.canRecover;
	}

	public void setCanRecover(Boolean canRecover) {
		this.canRecover = canRecover;
	}

	public String getHostname() {
		return this.hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getNcVirtVersion() {
		return this.ncVirtVersion;
	}

	public void setNcVirtVersion(String ncVirtVersion) {
		this.ncVirtVersion = ncVirtVersion;
	}

	public String getLockType() {
		return this.lockType;
	}

	public void setLockType(String lockType) {
		this.lockType = lockType;
	}

	public String getLockReason() {
		return this.lockReason;
	}

	public void setLockReason(String lockReason) {
		this.lockReason = lockReason;
	}

	public String getBizStatus() {
		return this.bizStatus;
	}

	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGrayBizType() {
		return this.grayBizType;
	}

	public void setGrayBizType(String grayBizType) {
		this.grayBizType = grayBizType;
	}

	public String getGrayBizTagA() {
		return this.grayBizTagA;
	}

	public void setGrayBizTagA(String grayBizTagA) {
		this.grayBizTagA = grayBizTagA;
	}

	public String getNcResourceType() {
		return this.ncResourceType;
	}

	public void setNcResourceType(String ncResourceType) {
		this.ncResourceType = ncResourceType;
	}

	public String getDedicatedHostId() {
		return this.dedicatedHostId;
	}

	public void setDedicatedHostId(String dedicatedHostId) {
		this.dedicatedHostId = dedicatedHostId;
	}

	public List<VmInfo> getVmInfos() {
		return this.vmInfos;
	}

	public void setVmInfos(List<VmInfo> vmInfos) {
		this.vmInfos = vmInfos;
	}

	public static class VmInfo {

		private String instanceId;

		private String hostName;

		private String ecsInstanceStatus;

		private String expectStatus;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getEcsInstanceStatus() {
			return this.ecsInstanceStatus;
		}

		public void setEcsInstanceStatus(String ecsInstanceStatus) {
			this.ecsInstanceStatus = ecsInstanceStatus;
		}

		public String getExpectStatus() {
			return this.expectStatus;
		}

		public void setExpectStatus(String expectStatus) {
			this.expectStatus = expectStatus;
		}
	}

	@Override
	public OpsDetailNcResponse getInstance(UnmarshallerContext context) {
		return	OpsDetailNcResponseUnmarshaller.unmarshall(this, context);
	}
}
