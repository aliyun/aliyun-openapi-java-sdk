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
import com.aliyuncs.hbr.transform.v20170908.DescribeVmMigrationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVmMigrationsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Long totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Migration> migrations;

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

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
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

	public List<Migration> getMigrations() {
		return this.migrations;
	}

	public void setMigrations(List<Migration> migrations) {
		this.migrations = migrations;
	}

	public static class Migration {

		private String vmId;

		private String backupPlanId;

		private String serverType;

		private String vmName;

		private String extra;

		private String hypervisorId;

		private String serverId;

		private String vmSnapshotId;

		private String vSwitchId;

		private String instanceType;

		private String privateIpAddress;

		private String diskCategory;

		private String securityGroup;

		private Boolean allocationPublicIp;

		private Boolean createImage;

		private Boolean bootAfterMigration;

		private String restoreId;

		private Integer progress;

		private String ecsInstanceId;

		private String errorMessage;

		private String imageId;

		private Long createdTime;

		private Long updatedTime;

		private String vmInfo;

		private Boolean forceSilentSnapshot;

		private String incrementalSyncState;

		private String garbageImageIds;

		private Boolean testRestore;

		private String clientId;

		private String clientName;

		private Boolean pendingRestore;

		public String getVmId() {
			return this.vmId;
		}

		public void setVmId(String vmId) {
			this.vmId = vmId;
		}

		public String getBackupPlanId() {
			return this.backupPlanId;
		}

		public void setBackupPlanId(String backupPlanId) {
			this.backupPlanId = backupPlanId;
		}

		public String getServerType() {
			return this.serverType;
		}

		public void setServerType(String serverType) {
			this.serverType = serverType;
		}

		public String getVmName() {
			return this.vmName;
		}

		public void setVmName(String vmName) {
			this.vmName = vmName;
		}

		public String getExtra() {
			return this.extra;
		}

		public void setExtra(String extra) {
			this.extra = extra;
		}

		public String getHypervisorId() {
			return this.hypervisorId;
		}

		public void setHypervisorId(String hypervisorId) {
			this.hypervisorId = hypervisorId;
		}

		public String getServerId() {
			return this.serverId;
		}

		public void setServerId(String serverId) {
			this.serverId = serverId;
		}

		public String getVmSnapshotId() {
			return this.vmSnapshotId;
		}

		public void setVmSnapshotId(String vmSnapshotId) {
			this.vmSnapshotId = vmSnapshotId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getPrivateIpAddress() {
			return this.privateIpAddress;
		}

		public void setPrivateIpAddress(String privateIpAddress) {
			this.privateIpAddress = privateIpAddress;
		}

		public String getDiskCategory() {
			return this.diskCategory;
		}

		public void setDiskCategory(String diskCategory) {
			this.diskCategory = diskCategory;
		}

		public String getSecurityGroup() {
			return this.securityGroup;
		}

		public void setSecurityGroup(String securityGroup) {
			this.securityGroup = securityGroup;
		}

		public Boolean getAllocationPublicIp() {
			return this.allocationPublicIp;
		}

		public void setAllocationPublicIp(Boolean allocationPublicIp) {
			this.allocationPublicIp = allocationPublicIp;
		}

		public Boolean getCreateImage() {
			return this.createImage;
		}

		public void setCreateImage(Boolean createImage) {
			this.createImage = createImage;
		}

		public Boolean getBootAfterMigration() {
			return this.bootAfterMigration;
		}

		public void setBootAfterMigration(Boolean bootAfterMigration) {
			this.bootAfterMigration = bootAfterMigration;
		}

		public String getRestoreId() {
			return this.restoreId;
		}

		public void setRestoreId(String restoreId) {
			this.restoreId = restoreId;
		}

		public Integer getProgress() {
			return this.progress;
		}

		public void setProgress(Integer progress) {
			this.progress = progress;
		}

		public String getEcsInstanceId() {
			return this.ecsInstanceId;
		}

		public void setEcsInstanceId(String ecsInstanceId) {
			this.ecsInstanceId = ecsInstanceId;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}

		public String getVmInfo() {
			return this.vmInfo;
		}

		public void setVmInfo(String vmInfo) {
			this.vmInfo = vmInfo;
		}

		public Boolean getForceSilentSnapshot() {
			return this.forceSilentSnapshot;
		}

		public void setForceSilentSnapshot(Boolean forceSilentSnapshot) {
			this.forceSilentSnapshot = forceSilentSnapshot;
		}

		public String getIncrementalSyncState() {
			return this.incrementalSyncState;
		}

		public void setIncrementalSyncState(String incrementalSyncState) {
			this.incrementalSyncState = incrementalSyncState;
		}

		public String getGarbageImageIds() {
			return this.garbageImageIds;
		}

		public void setGarbageImageIds(String garbageImageIds) {
			this.garbageImageIds = garbageImageIds;
		}

		public Boolean getTestRestore() {
			return this.testRestore;
		}

		public void setTestRestore(Boolean testRestore) {
			this.testRestore = testRestore;
		}

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}

		public String getClientName() {
			return this.clientName;
		}

		public void setClientName(String clientName) {
			this.clientName = clientName;
		}

		public Boolean getPendingRestore() {
			return this.pendingRestore;
		}

		public void setPendingRestore(Boolean pendingRestore) {
			this.pendingRestore = pendingRestore;
		}
	}

	@Override
	public DescribeVmMigrationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeVmMigrationsResponseUnmarshaller.unmarshall(this, context);
	}
}
