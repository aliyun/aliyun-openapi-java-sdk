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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbr.transform.v20170908.DescribeUdmSnapshotsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUdmSnapshotsResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Long totalCount;

	private Boolean success;

	private List<Snapshot> snapshots;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Snapshot> getSnapshots() {
		return this.snapshots;
	}

	public void setSnapshots(List<Snapshot> snapshots) {
		this.snapshots = snapshots;
	}

	public static class Snapshot {

		private String status;

		private String snapshotHash;

		private String vaultId;

		private String backupType;

		private Long createTime;

		private String actualBytes;

		private String sourceType;

		private String prefix;

		private String diskId;

		private Long bytesTotal;

		private String nativeSnapshotInfo;

		private Long completeTime;

		private Long retention;

		private Long createdTime;

		private String bucket;

		private Long realSnapshotTime;

		private String parentSnapshotHash;

		private String instanceId;

		private String fileSystemId;

		private Long startTime;

		private Long updatedTime;

		private String snapshotId;

		private String jobId;

		private String nativeSnapshotId;

		private String instanceGroupId;

		private String advancedRetentionType;

		private Long expireTime;

		private List<String> paths;

		private Detail detail;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSnapshotHash() {
			return this.snapshotHash;
		}

		public void setSnapshotHash(String snapshotHash) {
			this.snapshotHash = snapshotHash;
		}

		public String getVaultId() {
			return this.vaultId;
		}

		public void setVaultId(String vaultId) {
			this.vaultId = vaultId;
		}

		public String getBackupType() {
			return this.backupType;
		}

		public void setBackupType(String backupType) {
			this.backupType = backupType;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getActualBytes() {
			return this.actualBytes;
		}

		public void setActualBytes(String actualBytes) {
			this.actualBytes = actualBytes;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getPrefix() {
			return this.prefix;
		}

		public void setPrefix(String prefix) {
			this.prefix = prefix;
		}

		public String getDiskId() {
			return this.diskId;
		}

		public void setDiskId(String diskId) {
			this.diskId = diskId;
		}

		public Long getBytesTotal() {
			return this.bytesTotal;
		}

		public void setBytesTotal(Long bytesTotal) {
			this.bytesTotal = bytesTotal;
		}

		public String getNativeSnapshotInfo() {
			return this.nativeSnapshotInfo;
		}

		public void setNativeSnapshotInfo(String nativeSnapshotInfo) {
			this.nativeSnapshotInfo = nativeSnapshotInfo;
		}

		public Long getCompleteTime() {
			return this.completeTime;
		}

		public void setCompleteTime(Long completeTime) {
			this.completeTime = completeTime;
		}

		public Long getRetention() {
			return this.retention;
		}

		public void setRetention(Long retention) {
			this.retention = retention;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public String getBucket() {
			return this.bucket;
		}

		public void setBucket(String bucket) {
			this.bucket = bucket;
		}

		public Long getRealSnapshotTime() {
			return this.realSnapshotTime;
		}

		public void setRealSnapshotTime(Long realSnapshotTime) {
			this.realSnapshotTime = realSnapshotTime;
		}

		public String getParentSnapshotHash() {
			return this.parentSnapshotHash;
		}

		public void setParentSnapshotHash(String parentSnapshotHash) {
			this.parentSnapshotHash = parentSnapshotHash;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getFileSystemId() {
			return this.fileSystemId;
		}

		public void setFileSystemId(String fileSystemId) {
			this.fileSystemId = fileSystemId;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}

		public String getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(String snapshotId) {
			this.snapshotId = snapshotId;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getNativeSnapshotId() {
			return this.nativeSnapshotId;
		}

		public void setNativeSnapshotId(String nativeSnapshotId) {
			this.nativeSnapshotId = nativeSnapshotId;
		}

		public String getInstanceGroupId() {
			return this.instanceGroupId;
		}

		public void setInstanceGroupId(String instanceGroupId) {
			this.instanceGroupId = instanceGroupId;
		}

		public String getAdvancedRetentionType() {
			return this.advancedRetentionType;
		}

		public void setAdvancedRetentionType(String advancedRetentionType) {
			this.advancedRetentionType = advancedRetentionType;
		}

		public Long getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(Long expireTime) {
			this.expireTime = expireTime;
		}

		public List<String> getPaths() {
			return this.paths;
		}

		public void setPaths(List<String> paths) {
			this.paths = paths;
		}

		public Detail getDetail() {
			return this.detail;
		}

		public void setDetail(Detail detail) {
			this.detail = detail;
		}

		public static class Detail {

			private String diskDevName;

			private String downgradeReason;

			private String osDiskId;

			private String osName;

			private Boolean containOsDisk;

			private String consistentLevel;

			private String vmName;

			private Map<Object,Object> diskHbrBackupSnapshotIdWithDeviceMap;

			private String nativeSnapshotInfo;

			private Map<Object,Object> diskHbrSnapshotIdWithDeviceMap;

			private Map<Object,Object> instanceIdWithDiskIdListMap;

			private String instanceName;

			private String osType;

			private String platform;

			private String osNameEn;

			private String hostName;

			private Boolean systemDisk;

			private String snapshotGroupId;

			private String instanceType;

			private String diskCategory;

			private String performanceLevel;

			private Boolean instantAccess;

			private List<String> diskIdList;

			private List<String> nativeSnapshotIdList;

			public String getDiskDevName() {
				return this.diskDevName;
			}

			public void setDiskDevName(String diskDevName) {
				this.diskDevName = diskDevName;
			}

			public String getDowngradeReason() {
				return this.downgradeReason;
			}

			public void setDowngradeReason(String downgradeReason) {
				this.downgradeReason = downgradeReason;
			}

			public String getOsDiskId() {
				return this.osDiskId;
			}

			public void setOsDiskId(String osDiskId) {
				this.osDiskId = osDiskId;
			}

			public String getOsName() {
				return this.osName;
			}

			public void setOsName(String osName) {
				this.osName = osName;
			}

			public Boolean getContainOsDisk() {
				return this.containOsDisk;
			}

			public void setContainOsDisk(Boolean containOsDisk) {
				this.containOsDisk = containOsDisk;
			}

			public String getConsistentLevel() {
				return this.consistentLevel;
			}

			public void setConsistentLevel(String consistentLevel) {
				this.consistentLevel = consistentLevel;
			}

			public String getVmName() {
				return this.vmName;
			}

			public void setVmName(String vmName) {
				this.vmName = vmName;
			}

			public Map<Object,Object> getDiskHbrBackupSnapshotIdWithDeviceMap() {
				return this.diskHbrBackupSnapshotIdWithDeviceMap;
			}

			public void setDiskHbrBackupSnapshotIdWithDeviceMap(Map<Object,Object> diskHbrBackupSnapshotIdWithDeviceMap) {
				this.diskHbrBackupSnapshotIdWithDeviceMap = diskHbrBackupSnapshotIdWithDeviceMap;
			}

			public String getNativeSnapshotInfo() {
				return this.nativeSnapshotInfo;
			}

			public void setNativeSnapshotInfo(String nativeSnapshotInfo) {
				this.nativeSnapshotInfo = nativeSnapshotInfo;
			}

			public Map<Object,Object> getDiskHbrSnapshotIdWithDeviceMap() {
				return this.diskHbrSnapshotIdWithDeviceMap;
			}

			public void setDiskHbrSnapshotIdWithDeviceMap(Map<Object,Object> diskHbrSnapshotIdWithDeviceMap) {
				this.diskHbrSnapshotIdWithDeviceMap = diskHbrSnapshotIdWithDeviceMap;
			}

			public Map<Object,Object> getInstanceIdWithDiskIdListMap() {
				return this.instanceIdWithDiskIdListMap;
			}

			public void setInstanceIdWithDiskIdListMap(Map<Object,Object> instanceIdWithDiskIdListMap) {
				this.instanceIdWithDiskIdListMap = instanceIdWithDiskIdListMap;
			}

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public String getOsType() {
				return this.osType;
			}

			public void setOsType(String osType) {
				this.osType = osType;
			}

			public String getPlatform() {
				return this.platform;
			}

			public void setPlatform(String platform) {
				this.platform = platform;
			}

			public String getOsNameEn() {
				return this.osNameEn;
			}

			public void setOsNameEn(String osNameEn) {
				this.osNameEn = osNameEn;
			}

			public String getHostName() {
				return this.hostName;
			}

			public void setHostName(String hostName) {
				this.hostName = hostName;
			}

			public Boolean getSystemDisk() {
				return this.systemDisk;
			}

			public void setSystemDisk(Boolean systemDisk) {
				this.systemDisk = systemDisk;
			}

			public String getSnapshotGroupId() {
				return this.snapshotGroupId;
			}

			public void setSnapshotGroupId(String snapshotGroupId) {
				this.snapshotGroupId = snapshotGroupId;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getDiskCategory() {
				return this.diskCategory;
			}

			public void setDiskCategory(String diskCategory) {
				this.diskCategory = diskCategory;
			}

			public String getPerformanceLevel() {
				return this.performanceLevel;
			}

			public void setPerformanceLevel(String performanceLevel) {
				this.performanceLevel = performanceLevel;
			}

			public Boolean getInstantAccess() {
				return this.instantAccess;
			}

			public void setInstantAccess(Boolean instantAccess) {
				this.instantAccess = instantAccess;
			}

			public List<String> getDiskIdList() {
				return this.diskIdList;
			}

			public void setDiskIdList(List<String> diskIdList) {
				this.diskIdList = diskIdList;
			}

			public List<String> getNativeSnapshotIdList() {
				return this.nativeSnapshotIdList;
			}

			public void setNativeSnapshotIdList(List<String> nativeSnapshotIdList) {
				this.nativeSnapshotIdList = nativeSnapshotIdList;
			}
		}
	}

	@Override
	public DescribeUdmSnapshotsResponse getInstance(UnmarshallerContext context) {
		return	DescribeUdmSnapshotsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
