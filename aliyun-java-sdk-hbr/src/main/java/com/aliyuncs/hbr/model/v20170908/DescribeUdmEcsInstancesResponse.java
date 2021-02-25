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

package com.aliyuncs.hbr.model.v20170908;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbr.transform.v20170908.DescribeUdmEcsInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUdmEcsInstancesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<UdmEcsInstance> udmEcsInstances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public List<UdmEcsInstance> getUdmEcsInstances() {
		return this.udmEcsInstances;
	}

	public void setUdmEcsInstances(List<UdmEcsInstance> udmEcsInstances) {
		this.udmEcsInstances = udmEcsInstances;
	}

	public static class UdmEcsInstance {

		private String instanceId;

		private String vaultId;

		private String instanceName;

		private String zoneId;

		private String vpcId;

		private String vswitchId;

		private Long planCount;

		private Long nativeSnapshotCount;

		private Long backupCount;

		private Long runningJobCount;

		private Long completeJobCount;

		private Long failedJobCount;

		private Boolean doBackup;

		private String publicIpAddress;

		private String privateIpAddress;

		private String innerIpAddress;

		private String eipAddress;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getVaultId() {
			return this.vaultId;
		}

		public void setVaultId(String vaultId) {
			this.vaultId = vaultId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
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

		public String getVswitchId() {
			return this.vswitchId;
		}

		public void setVswitchId(String vswitchId) {
			this.vswitchId = vswitchId;
		}

		public Long getPlanCount() {
			return this.planCount;
		}

		public void setPlanCount(Long planCount) {
			this.planCount = planCount;
		}

		public Long getNativeSnapshotCount() {
			return this.nativeSnapshotCount;
		}

		public void setNativeSnapshotCount(Long nativeSnapshotCount) {
			this.nativeSnapshotCount = nativeSnapshotCount;
		}

		public Long getBackupCount() {
			return this.backupCount;
		}

		public void setBackupCount(Long backupCount) {
			this.backupCount = backupCount;
		}

		public Long getRunningJobCount() {
			return this.runningJobCount;
		}

		public void setRunningJobCount(Long runningJobCount) {
			this.runningJobCount = runningJobCount;
		}

		public Long getCompleteJobCount() {
			return this.completeJobCount;
		}

		public void setCompleteJobCount(Long completeJobCount) {
			this.completeJobCount = completeJobCount;
		}

		public Long getFailedJobCount() {
			return this.failedJobCount;
		}

		public void setFailedJobCount(Long failedJobCount) {
			this.failedJobCount = failedJobCount;
		}

		public Boolean getDoBackup() {
			return this.doBackup;
		}

		public void setDoBackup(Boolean doBackup) {
			this.doBackup = doBackup;
		}

		public String getPublicIpAddress() {
			return this.publicIpAddress;
		}

		public void setPublicIpAddress(String publicIpAddress) {
			this.publicIpAddress = publicIpAddress;
		}

		public String getPrivateIpAddress() {
			return this.privateIpAddress;
		}

		public void setPrivateIpAddress(String privateIpAddress) {
			this.privateIpAddress = privateIpAddress;
		}

		public String getInnerIpAddress() {
			return this.innerIpAddress;
		}

		public void setInnerIpAddress(String innerIpAddress) {
			this.innerIpAddress = innerIpAddress;
		}

		public String getEipAddress() {
			return this.eipAddress;
		}

		public void setEipAddress(String eipAddress) {
			this.eipAddress = eipAddress;
		}
	}

	@Override
	public DescribeUdmEcsInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeUdmEcsInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
