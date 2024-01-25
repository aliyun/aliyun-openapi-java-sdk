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
import com.aliyuncs.hbr.transform.v20170908.DescribeBackupJobs2ResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupJobs2Response extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private String diskId;

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalCount;

	private List<BackupJob> backupJobs;

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

	public String getDiskId() {
		return this.diskId;
	}

	public void setDiskId(String diskId) {
		this.diskId = diskId;
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

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<BackupJob> getBackupJobs() {
		return this.backupJobs;
	}

	public void setBackupJobs(List<BackupJob> backupJobs) {
		this.backupJobs = backupJobs;
	}

	public static class BackupJob {

		private String status;

		private String errorMessage;

		private Long actualItems;

		private String vaultId;

		private Long actualBytes;

		private String dataSourceId;

		private Long createTime;

		private String backupType;

		private String prefix;

		private String sourceType;

		private String options;

		private String diskId;

		private String clientId;

		private Long itemsDone;

		private Long bytesTotal;

		private String exclude;

		private String parentId;

		private String jobName;

		private String databaseName;

		private Long completeTime;

		private Long createdTime;

		private String bucket;

		private String clusterId;

		private Integer progress;

		private String speedLimit;

		private String instanceId;

		private String planId;

		private String backupSourceGroupId;

		private String fileSystemId;

		private String errorFile;

		private Long startTime;

		private Long updatedTime;

		private String jobId;

		private Long itemsTotal;

		private String include;

		private Long bytesDone;

		private String instanceName;

		private Long speed;

		private String tableName;

		private String crossAccountType;

		private Long crossAccountUserId;

		private String crossAccountRoleName;

		private String identifier;

		private String destSourceType;

		private String destDataSourceId;

		private String destDataSourceDetail;

		private String changeListPath;

		private Long filesTotal;

		private Long filesDone;

		private Long actualFiles;

		private List<Source> sources;

		private List<String> paths;

		private Detail detail;

		private OtsDetail otsDetail;

		private Report report;

		private SnapshotCopyDetail snapshotCopyDetail;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public Long getActualItems() {
			return this.actualItems;
		}

		public void setActualItems(Long actualItems) {
			this.actualItems = actualItems;
		}

		public String getVaultId() {
			return this.vaultId;
		}

		public void setVaultId(String vaultId) {
			this.vaultId = vaultId;
		}

		public Long getActualBytes() {
			return this.actualBytes;
		}

		public void setActualBytes(Long actualBytes) {
			this.actualBytes = actualBytes;
		}

		public String getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(String dataSourceId) {
			this.dataSourceId = dataSourceId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getBackupType() {
			return this.backupType;
		}

		public void setBackupType(String backupType) {
			this.backupType = backupType;
		}

		public String getPrefix() {
			return this.prefix;
		}

		public void setPrefix(String prefix) {
			this.prefix = prefix;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getOptions() {
			return this.options;
		}

		public void setOptions(String options) {
			this.options = options;
		}

		public String getDiskId() {
			return this.diskId;
		}

		public void setDiskId(String diskId) {
			this.diskId = diskId;
		}

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}

		public Long getItemsDone() {
			return this.itemsDone;
		}

		public void setItemsDone(Long itemsDone) {
			this.itemsDone = itemsDone;
		}

		public Long getBytesTotal() {
			return this.bytesTotal;
		}

		public void setBytesTotal(Long bytesTotal) {
			this.bytesTotal = bytesTotal;
		}

		public String getExclude() {
			return this.exclude;
		}

		public void setExclude(String exclude) {
			this.exclude = exclude;
		}

		public String getParentId() {
			return this.parentId;
		}

		public void setParentId(String parentId) {
			this.parentId = parentId;
		}

		public String getJobName() {
			return this.jobName;
		}

		public void setJobName(String jobName) {
			this.jobName = jobName;
		}

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
		}

		public Long getCompleteTime() {
			return this.completeTime;
		}

		public void setCompleteTime(Long completeTime) {
			this.completeTime = completeTime;
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

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public Integer getProgress() {
			return this.progress;
		}

		public void setProgress(Integer progress) {
			this.progress = progress;
		}

		public String getSpeedLimit() {
			return this.speedLimit;
		}

		public void setSpeedLimit(String speedLimit) {
			this.speedLimit = speedLimit;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getPlanId() {
			return this.planId;
		}

		public void setPlanId(String planId) {
			this.planId = planId;
		}

		public String getBackupSourceGroupId() {
			return this.backupSourceGroupId;
		}

		public void setBackupSourceGroupId(String backupSourceGroupId) {
			this.backupSourceGroupId = backupSourceGroupId;
		}

		public String getFileSystemId() {
			return this.fileSystemId;
		}

		public void setFileSystemId(String fileSystemId) {
			this.fileSystemId = fileSystemId;
		}

		public String getErrorFile() {
			return this.errorFile;
		}

		public void setErrorFile(String errorFile) {
			this.errorFile = errorFile;
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

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public Long getItemsTotal() {
			return this.itemsTotal;
		}

		public void setItemsTotal(Long itemsTotal) {
			this.itemsTotal = itemsTotal;
		}

		public String getInclude() {
			return this.include;
		}

		public void setInclude(String include) {
			this.include = include;
		}

		public Long getBytesDone() {
			return this.bytesDone;
		}

		public void setBytesDone(Long bytesDone) {
			this.bytesDone = bytesDone;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public Long getSpeed() {
			return this.speed;
		}

		public void setSpeed(Long speed) {
			this.speed = speed;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getCrossAccountType() {
			return this.crossAccountType;
		}

		public void setCrossAccountType(String crossAccountType) {
			this.crossAccountType = crossAccountType;
		}

		public Long getCrossAccountUserId() {
			return this.crossAccountUserId;
		}

		public void setCrossAccountUserId(Long crossAccountUserId) {
			this.crossAccountUserId = crossAccountUserId;
		}

		public String getCrossAccountRoleName() {
			return this.crossAccountRoleName;
		}

		public void setCrossAccountRoleName(String crossAccountRoleName) {
			this.crossAccountRoleName = crossAccountRoleName;
		}

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public String getDestSourceType() {
			return this.destSourceType;
		}

		public void setDestSourceType(String destSourceType) {
			this.destSourceType = destSourceType;
		}

		public String getDestDataSourceId() {
			return this.destDataSourceId;
		}

		public void setDestDataSourceId(String destDataSourceId) {
			this.destDataSourceId = destDataSourceId;
		}

		public String getDestDataSourceDetail() {
			return this.destDataSourceDetail;
		}

		public void setDestDataSourceDetail(String destDataSourceDetail) {
			this.destDataSourceDetail = destDataSourceDetail;
		}

		public String getChangeListPath() {
			return this.changeListPath;
		}

		public void setChangeListPath(String changeListPath) {
			this.changeListPath = changeListPath;
		}

		public Long getFilesTotal() {
			return this.filesTotal;
		}

		public void setFilesTotal(Long filesTotal) {
			this.filesTotal = filesTotal;
		}

		public Long getFilesDone() {
			return this.filesDone;
		}

		public void setFilesDone(Long filesDone) {
			this.filesDone = filesDone;
		}

		public Long getActualFiles() {
			return this.actualFiles;
		}

		public void setActualFiles(Long actualFiles) {
			this.actualFiles = actualFiles;
		}

		public List<Source> getSources() {
			return this.sources;
		}

		public void setSources(List<Source> sources) {
			this.sources = sources;
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

		public OtsDetail getOtsDetail() {
			return this.otsDetail;
		}

		public void setOtsDetail(OtsDetail otsDetail) {
			this.otsDetail = otsDetail;
		}

		public Report getReport() {
			return this.report;
		}

		public void setReport(Report report) {
			this.report = report;
		}

		public SnapshotCopyDetail getSnapshotCopyDetail() {
			return this.snapshotCopyDetail;
		}

		public void setSnapshotCopyDetail(SnapshotCopyDetail snapshotCopyDetail) {
			this.snapshotCopyDetail = snapshotCopyDetail;
		}

		public static class Source {

			private String resourceType;

			private String backupMethod;

			private String resourceId;

			private String resourceInfo;

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public String getBackupMethod() {
				return this.backupMethod;
			}

			public void setBackupMethod(String backupMethod) {
				this.backupMethod = backupMethod;
			}

			public String getResourceId() {
				return this.resourceId;
			}

			public void setResourceId(String resourceId) {
				this.resourceId = resourceId;
			}

			public String getResourceInfo() {
				return this.resourceInfo;
			}

			public void setResourceInfo(String resourceInfo) {
				this.resourceInfo = resourceInfo;
			}
		}

		public static class Detail {

			private String downgradeReason;

			private String backupVaultId;

			private String osName;

			private Boolean groupSnapshot;

			private Boolean doCopy;

			private String udmEcsDiskSnapshotId;

			private String destinationRegionId;

			private Long nativeSnapshotRetention;

			private Boolean doBackup;

			private String instanceName;

			private String jobDetail;

			private String platform;

			private String osNameEn;

			private String destinationNativeSnapshotId;

			private Integer destinationNativeSnapshotProgress;

			private String udmEcsDiskHbrSnapshotId;

			private String diskDevName;

			private String stage;

			private String snapshotGroupId;

			private String destinationNativeSnapshotStatus;

			private Long diskSize;

			private String consistentLevel;

			private Long backupRetention;

			private Long destinationRetention;

			private Long startTime;

			private String destinationSnapshotId;

			private Map<Object,Object> diskHbrSnapshotIdWithDeviceMap;

			private String osType;

			private String destinationNativeSnapshotErrorMessage;

			private String hbrSnapshotId;

			private String nativeSnapshotId;

			private Boolean systemDisk;

			private String nativeSnapshotStatus;

			private Map<Object,Object> instanceInfos;

			private List<String> diskHbrSnapshotIdList;

			private List<String> diskIdList;

			private List<String> diskNativeSnapshotIdList;

			private List<String> excludeDiskIdList;

			public String getDowngradeReason() {
				return this.downgradeReason;
			}

			public void setDowngradeReason(String downgradeReason) {
				this.downgradeReason = downgradeReason;
			}

			public String getBackupVaultId() {
				return this.backupVaultId;
			}

			public void setBackupVaultId(String backupVaultId) {
				this.backupVaultId = backupVaultId;
			}

			public String getOsName() {
				return this.osName;
			}

			public void setOsName(String osName) {
				this.osName = osName;
			}

			public Boolean getGroupSnapshot() {
				return this.groupSnapshot;
			}

			public void setGroupSnapshot(Boolean groupSnapshot) {
				this.groupSnapshot = groupSnapshot;
			}

			public Boolean getDoCopy() {
				return this.doCopy;
			}

			public void setDoCopy(Boolean doCopy) {
				this.doCopy = doCopy;
			}

			public String getUdmEcsDiskSnapshotId() {
				return this.udmEcsDiskSnapshotId;
			}

			public void setUdmEcsDiskSnapshotId(String udmEcsDiskSnapshotId) {
				this.udmEcsDiskSnapshotId = udmEcsDiskSnapshotId;
			}

			public String getDestinationRegionId() {
				return this.destinationRegionId;
			}

			public void setDestinationRegionId(String destinationRegionId) {
				this.destinationRegionId = destinationRegionId;
			}

			public Long getNativeSnapshotRetention() {
				return this.nativeSnapshotRetention;
			}

			public void setNativeSnapshotRetention(Long nativeSnapshotRetention) {
				this.nativeSnapshotRetention = nativeSnapshotRetention;
			}

			public Boolean getDoBackup() {
				return this.doBackup;
			}

			public void setDoBackup(Boolean doBackup) {
				this.doBackup = doBackup;
			}

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public String getJobDetail() {
				return this.jobDetail;
			}

			public void setJobDetail(String jobDetail) {
				this.jobDetail = jobDetail;
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

			public String getDestinationNativeSnapshotId() {
				return this.destinationNativeSnapshotId;
			}

			public void setDestinationNativeSnapshotId(String destinationNativeSnapshotId) {
				this.destinationNativeSnapshotId = destinationNativeSnapshotId;
			}

			public Integer getDestinationNativeSnapshotProgress() {
				return this.destinationNativeSnapshotProgress;
			}

			public void setDestinationNativeSnapshotProgress(Integer destinationNativeSnapshotProgress) {
				this.destinationNativeSnapshotProgress = destinationNativeSnapshotProgress;
			}

			public String getUdmEcsDiskHbrSnapshotId() {
				return this.udmEcsDiskHbrSnapshotId;
			}

			public void setUdmEcsDiskHbrSnapshotId(String udmEcsDiskHbrSnapshotId) {
				this.udmEcsDiskHbrSnapshotId = udmEcsDiskHbrSnapshotId;
			}

			public String getDiskDevName() {
				return this.diskDevName;
			}

			public void setDiskDevName(String diskDevName) {
				this.diskDevName = diskDevName;
			}

			public String getStage() {
				return this.stage;
			}

			public void setStage(String stage) {
				this.stage = stage;
			}

			public String getSnapshotGroupId() {
				return this.snapshotGroupId;
			}

			public void setSnapshotGroupId(String snapshotGroupId) {
				this.snapshotGroupId = snapshotGroupId;
			}

			public String getDestinationNativeSnapshotStatus() {
				return this.destinationNativeSnapshotStatus;
			}

			public void setDestinationNativeSnapshotStatus(String destinationNativeSnapshotStatus) {
				this.destinationNativeSnapshotStatus = destinationNativeSnapshotStatus;
			}

			public Long getDiskSize() {
				return this.diskSize;
			}

			public void setDiskSize(Long diskSize) {
				this.diskSize = diskSize;
			}

			public String getConsistentLevel() {
				return this.consistentLevel;
			}

			public void setConsistentLevel(String consistentLevel) {
				this.consistentLevel = consistentLevel;
			}

			public Long getBackupRetention() {
				return this.backupRetention;
			}

			public void setBackupRetention(Long backupRetention) {
				this.backupRetention = backupRetention;
			}

			public Long getDestinationRetention() {
				return this.destinationRetention;
			}

			public void setDestinationRetention(Long destinationRetention) {
				this.destinationRetention = destinationRetention;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public String getDestinationSnapshotId() {
				return this.destinationSnapshotId;
			}

			public void setDestinationSnapshotId(String destinationSnapshotId) {
				this.destinationSnapshotId = destinationSnapshotId;
			}

			public Map<Object,Object> getDiskHbrSnapshotIdWithDeviceMap() {
				return this.diskHbrSnapshotIdWithDeviceMap;
			}

			public void setDiskHbrSnapshotIdWithDeviceMap(Map<Object,Object> diskHbrSnapshotIdWithDeviceMap) {
				this.diskHbrSnapshotIdWithDeviceMap = diskHbrSnapshotIdWithDeviceMap;
			}

			public String getOsType() {
				return this.osType;
			}

			public void setOsType(String osType) {
				this.osType = osType;
			}

			public String getDestinationNativeSnapshotErrorMessage() {
				return this.destinationNativeSnapshotErrorMessage;
			}

			public void setDestinationNativeSnapshotErrorMessage(String destinationNativeSnapshotErrorMessage) {
				this.destinationNativeSnapshotErrorMessage = destinationNativeSnapshotErrorMessage;
			}

			public String getHbrSnapshotId() {
				return this.hbrSnapshotId;
			}

			public void setHbrSnapshotId(String hbrSnapshotId) {
				this.hbrSnapshotId = hbrSnapshotId;
			}

			public String getNativeSnapshotId() {
				return this.nativeSnapshotId;
			}

			public void setNativeSnapshotId(String nativeSnapshotId) {
				this.nativeSnapshotId = nativeSnapshotId;
			}

			public Boolean getSystemDisk() {
				return this.systemDisk;
			}

			public void setSystemDisk(Boolean systemDisk) {
				this.systemDisk = systemDisk;
			}

			public String getNativeSnapshotStatus() {
				return this.nativeSnapshotStatus;
			}

			public void setNativeSnapshotStatus(String nativeSnapshotStatus) {
				this.nativeSnapshotStatus = nativeSnapshotStatus;
			}

			public Map<Object,Object> getInstanceInfos() {
				return this.instanceInfos;
			}

			public void setInstanceInfos(Map<Object,Object> instanceInfos) {
				this.instanceInfos = instanceInfos;
			}

			public List<String> getDiskHbrSnapshotIdList() {
				return this.diskHbrSnapshotIdList;
			}

			public void setDiskHbrSnapshotIdList(List<String> diskHbrSnapshotIdList) {
				this.diskHbrSnapshotIdList = diskHbrSnapshotIdList;
			}

			public List<String> getDiskIdList() {
				return this.diskIdList;
			}

			public void setDiskIdList(List<String> diskIdList) {
				this.diskIdList = diskIdList;
			}

			public List<String> getDiskNativeSnapshotIdList() {
				return this.diskNativeSnapshotIdList;
			}

			public void setDiskNativeSnapshotIdList(List<String> diskNativeSnapshotIdList) {
				this.diskNativeSnapshotIdList = diskNativeSnapshotIdList;
			}

			public List<String> getExcludeDiskIdList() {
				return this.excludeDiskIdList;
			}

			public void setExcludeDiskIdList(List<String> excludeDiskIdList) {
				this.excludeDiskIdList = excludeDiskIdList;
			}
		}

		public static class OtsDetail {

			private List<String> tableNames;

			public List<String> getTableNames() {
				return this.tableNames;
			}

			public void setTableNames(List<String> tableNames) {
				this.tableNames = tableNames;
			}
		}

		public static class Report {

			private String totalFiles;

			private String successFiles;

			private String failedFiles;

			private String skippedFiles;

			private String reportTaskStatus;

			public String getTotalFiles() {
				return this.totalFiles;
			}

			public void setTotalFiles(String totalFiles) {
				this.totalFiles = totalFiles;
			}

			public String getSuccessFiles() {
				return this.successFiles;
			}

			public void setSuccessFiles(String successFiles) {
				this.successFiles = successFiles;
			}

			public String getFailedFiles() {
				return this.failedFiles;
			}

			public void setFailedFiles(String failedFiles) {
				this.failedFiles = failedFiles;
			}

			public String getSkippedFiles() {
				return this.skippedFiles;
			}

			public void setSkippedFiles(String skippedFiles) {
				this.skippedFiles = skippedFiles;
			}

			public String getReportTaskStatus() {
				return this.reportTaskStatus;
			}

			public void setReportTaskStatus(String reportTaskStatus) {
				this.reportTaskStatus = reportTaskStatus;
			}
		}

		public static class SnapshotCopyDetail {

			private String sourceSnapshotHash;

			private String sourceParentSnapshotHash;

			private String dataSourceId;

			private String originalSourceType;

			private String storageClass;

			private String snapshotId;

			private String path;

			private String source;

			private String sourceVaultId;

			private String parentSnapshotHash;

			private String snapshotTime;

			public String getSourceSnapshotHash() {
				return this.sourceSnapshotHash;
			}

			public void setSourceSnapshotHash(String sourceSnapshotHash) {
				this.sourceSnapshotHash = sourceSnapshotHash;
			}

			public String getSourceParentSnapshotHash() {
				return this.sourceParentSnapshotHash;
			}

			public void setSourceParentSnapshotHash(String sourceParentSnapshotHash) {
				this.sourceParentSnapshotHash = sourceParentSnapshotHash;
			}

			public String getDataSourceId() {
				return this.dataSourceId;
			}

			public void setDataSourceId(String dataSourceId) {
				this.dataSourceId = dataSourceId;
			}

			public String getOriginalSourceType() {
				return this.originalSourceType;
			}

			public void setOriginalSourceType(String originalSourceType) {
				this.originalSourceType = originalSourceType;
			}

			public String getStorageClass() {
				return this.storageClass;
			}

			public void setStorageClass(String storageClass) {
				this.storageClass = storageClass;
			}

			public String getSnapshotId() {
				return this.snapshotId;
			}

			public void setSnapshotId(String snapshotId) {
				this.snapshotId = snapshotId;
			}

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}

			public String getSourceVaultId() {
				return this.sourceVaultId;
			}

			public void setSourceVaultId(String sourceVaultId) {
				this.sourceVaultId = sourceVaultId;
			}

			public String getParentSnapshotHash() {
				return this.parentSnapshotHash;
			}

			public void setParentSnapshotHash(String parentSnapshotHash) {
				this.parentSnapshotHash = parentSnapshotHash;
			}

			public String getSnapshotTime() {
				return this.snapshotTime;
			}

			public void setSnapshotTime(String snapshotTime) {
				this.snapshotTime = snapshotTime;
			}
		}
	}

	@Override
	public DescribeBackupJobs2Response getInstance(UnmarshallerContext context) {
		return	DescribeBackupJobs2ResponseUnmarshaller.unmarshall(this, context);
	}
}
