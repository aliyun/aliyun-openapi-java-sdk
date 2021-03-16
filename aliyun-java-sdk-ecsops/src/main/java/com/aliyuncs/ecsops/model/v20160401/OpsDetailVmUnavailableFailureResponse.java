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
import com.aliyuncs.ecsops.transform.v20160401.OpsDetailVmUnavailableFailureResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDetailVmUnavailableFailureResponse extends AcsResponse {

	private String requestId;

	private Integer totalCnt;

	private Integer pageNumber;

	private Integer pageSize;

	private List<DetailNc> detailImpactNcs;

	private List<DetailVm> detailImpactVms;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCnt() {
		return this.totalCnt;
	}

	public void setTotalCnt(Integer totalCnt) {
		this.totalCnt = totalCnt;
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

	public List<DetailNc> getDetailImpactNcs() {
		return this.detailImpactNcs;
	}

	public void setDetailImpactNcs(List<DetailNc> detailImpactNcs) {
		this.detailImpactNcs = detailImpactNcs;
	}

	public List<DetailVm> getDetailImpactVms() {
		return this.detailImpactVms;
	}

	public void setDetailImpactVms(List<DetailVm> detailImpactVms) {
		this.detailImpactVms = detailImpactVms;
	}

	public static class DetailNc {

		private String ncIp;

		private String regionId;

		private String zoneId;

		private String clusterId;

		private String houyiNcState;

		private Boolean pingState;

		private Boolean sshState;

		private Boolean isLocalDisk;

		private String exceptionTime;

		private String firstExceptionTime;

		private String recoverTime;

		private String reason;

		private String failureTypes;

		public String getNcIp() {
			return this.ncIp;
		}

		public void setNcIp(String ncIp) {
			this.ncIp = ncIp;
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

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getHouyiNcState() {
			return this.houyiNcState;
		}

		public void setHouyiNcState(String houyiNcState) {
			this.houyiNcState = houyiNcState;
		}

		public Boolean getPingState() {
			return this.pingState;
		}

		public void setPingState(Boolean pingState) {
			this.pingState = pingState;
		}

		public Boolean getSshState() {
			return this.sshState;
		}

		public void setSshState(Boolean sshState) {
			this.sshState = sshState;
		}

		public Boolean getIsLocalDisk() {
			return this.isLocalDisk;
		}

		public void setIsLocalDisk(Boolean isLocalDisk) {
			this.isLocalDisk = isLocalDisk;
		}

		public String getExceptionTime() {
			return this.exceptionTime;
		}

		public void setExceptionTime(String exceptionTime) {
			this.exceptionTime = exceptionTime;
		}

		public String getFirstExceptionTime() {
			return this.firstExceptionTime;
		}

		public void setFirstExceptionTime(String firstExceptionTime) {
			this.firstExceptionTime = firstExceptionTime;
		}

		public String getRecoverTime() {
			return this.recoverTime;
		}

		public void setRecoverTime(String recoverTime) {
			this.recoverTime = recoverTime;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getFailureTypes() {
			return this.failureTypes;
		}

		public void setFailureTypes(String failureTypes) {
			this.failureTypes = failureTypes;
		}
	}

	public static class DetailVm {

		private String instanceId;

		private String tag;

		private String vmCurrentNcIp;

		private String aliuid;

		private String bid;

		private String ncIp;

		private Integer cpu;

		private String gcLevel;

		private String clusterId;

		private String zoneId;

		private String regionId;

		private String idc;

		private Float gocCores;

		private String vcpuMod;

		private Boolean isLocalDisk;

		private String instanceType;

		private String houyiVmState;

		private Boolean isVmDownRecover;

		private String networkState;

		private String storageState;

		private String exceptionTime;

		private String firstExceptionTime;

		private String migrateRecoverTime;

		private String networkRecoverTime;

		private String storageRecoverTime;

		private String overallRecoverTime;

		private String controllerRecoverTime;

		private String reason;

		private String failureTypes;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getVmCurrentNcIp() {
			return this.vmCurrentNcIp;
		}

		public void setVmCurrentNcIp(String vmCurrentNcIp) {
			this.vmCurrentNcIp = vmCurrentNcIp;
		}

		public String getAliuid() {
			return this.aliuid;
		}

		public void setAliuid(String aliuid) {
			this.aliuid = aliuid;
		}

		public String getBid() {
			return this.bid;
		}

		public void setBid(String bid) {
			this.bid = bid;
		}

		public String getNcIp() {
			return this.ncIp;
		}

		public void setNcIp(String ncIp) {
			this.ncIp = ncIp;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public String getGcLevel() {
			return this.gcLevel;
		}

		public void setGcLevel(String gcLevel) {
			this.gcLevel = gcLevel;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getIdc() {
			return this.idc;
		}

		public void setIdc(String idc) {
			this.idc = idc;
		}

		public Float getGocCores() {
			return this.gocCores;
		}

		public void setGocCores(Float gocCores) {
			this.gocCores = gocCores;
		}

		public String getVcpuMod() {
			return this.vcpuMod;
		}

		public void setVcpuMod(String vcpuMod) {
			this.vcpuMod = vcpuMod;
		}

		public Boolean getIsLocalDisk() {
			return this.isLocalDisk;
		}

		public void setIsLocalDisk(Boolean isLocalDisk) {
			this.isLocalDisk = isLocalDisk;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getHouyiVmState() {
			return this.houyiVmState;
		}

		public void setHouyiVmState(String houyiVmState) {
			this.houyiVmState = houyiVmState;
		}

		public Boolean getIsVmDownRecover() {
			return this.isVmDownRecover;
		}

		public void setIsVmDownRecover(Boolean isVmDownRecover) {
			this.isVmDownRecover = isVmDownRecover;
		}

		public String getNetworkState() {
			return this.networkState;
		}

		public void setNetworkState(String networkState) {
			this.networkState = networkState;
		}

		public String getStorageState() {
			return this.storageState;
		}

		public void setStorageState(String storageState) {
			this.storageState = storageState;
		}

		public String getExceptionTime() {
			return this.exceptionTime;
		}

		public void setExceptionTime(String exceptionTime) {
			this.exceptionTime = exceptionTime;
		}

		public String getFirstExceptionTime() {
			return this.firstExceptionTime;
		}

		public void setFirstExceptionTime(String firstExceptionTime) {
			this.firstExceptionTime = firstExceptionTime;
		}

		public String getMigrateRecoverTime() {
			return this.migrateRecoverTime;
		}

		public void setMigrateRecoverTime(String migrateRecoverTime) {
			this.migrateRecoverTime = migrateRecoverTime;
		}

		public String getNetworkRecoverTime() {
			return this.networkRecoverTime;
		}

		public void setNetworkRecoverTime(String networkRecoverTime) {
			this.networkRecoverTime = networkRecoverTime;
		}

		public String getStorageRecoverTime() {
			return this.storageRecoverTime;
		}

		public void setStorageRecoverTime(String storageRecoverTime) {
			this.storageRecoverTime = storageRecoverTime;
		}

		public String getOverallRecoverTime() {
			return this.overallRecoverTime;
		}

		public void setOverallRecoverTime(String overallRecoverTime) {
			this.overallRecoverTime = overallRecoverTime;
		}

		public String getControllerRecoverTime() {
			return this.controllerRecoverTime;
		}

		public void setControllerRecoverTime(String controllerRecoverTime) {
			this.controllerRecoverTime = controllerRecoverTime;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getFailureTypes() {
			return this.failureTypes;
		}

		public void setFailureTypes(String failureTypes) {
			this.failureTypes = failureTypes;
		}
	}

	@Override
	public OpsDetailVmUnavailableFailureResponse getInstance(UnmarshallerContext context) {
		return	OpsDetailVmUnavailableFailureResponseUnmarshaller.unmarshall(this, context);
	}
}
