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
import com.aliyuncs.hbr.transform.v20170908.DescribeVaultsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVaultsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<Vault> vaults;

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

	public List<Vault> getVaults() {
		return this.vaults;
	}

	public void setVaults(List<Vault> vaults) {
		this.vaults = vaults;
	}

	public static class Vault {

		private String status;

		private String vaultId;

		private String chargeType;

		private String vaultType;

		private Boolean dedup;

		private String replicationSourceVaultId;

		private Long indexUpdateTime;

		private String description;

		private String vaultStorageClass;

		private Long retention;

		private Long createdTime;

		private String indexLevel;

		private String vaultName;

		private Long storageSize;

		private Long latestReplicationTime;

		private String vaultStatusMessage;

		private Boolean replication;

		private String replicationSourceRegionId;

		private String vaultRegionId;

		private Long updatedTime;

		private String resourceGroupId;

		private String bucketName;

		private Boolean searchEnabled;

		private Boolean indexAvailable;

		private Long bytesDone;

		private String encryptType;

		private Boolean wormEnabled;

		private Long snapshotCount;

		private String compressionAlgorithm;

		private String redundancyType;

		private String kmsKeyId;

		private Long chargedStorageSize;

		private Long archiveStorageSize;

		private Long archiveBytesDone;

		private Boolean replicationSourceVault;

		private List<Tag> tags;

		private List<String> sourceTypes;

		private ReplicationProgress replicationProgress;

		private BackupPlanStatistics backupPlanStatistics;

		private TrialInfo trialInfo;

		private Endpoint endpoint;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getVaultId() {
			return this.vaultId;
		}

		public void setVaultId(String vaultId) {
			this.vaultId = vaultId;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getVaultType() {
			return this.vaultType;
		}

		public void setVaultType(String vaultType) {
			this.vaultType = vaultType;
		}

		public Boolean getDedup() {
			return this.dedup;
		}

		public void setDedup(Boolean dedup) {
			this.dedup = dedup;
		}

		public String getReplicationSourceVaultId() {
			return this.replicationSourceVaultId;
		}

		public void setReplicationSourceVaultId(String replicationSourceVaultId) {
			this.replicationSourceVaultId = replicationSourceVaultId;
		}

		public Long getIndexUpdateTime() {
			return this.indexUpdateTime;
		}

		public void setIndexUpdateTime(Long indexUpdateTime) {
			this.indexUpdateTime = indexUpdateTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getVaultStorageClass() {
			return this.vaultStorageClass;
		}

		public void setVaultStorageClass(String vaultStorageClass) {
			this.vaultStorageClass = vaultStorageClass;
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

		public String getIndexLevel() {
			return this.indexLevel;
		}

		public void setIndexLevel(String indexLevel) {
			this.indexLevel = indexLevel;
		}

		public String getVaultName() {
			return this.vaultName;
		}

		public void setVaultName(String vaultName) {
			this.vaultName = vaultName;
		}

		public Long getStorageSize() {
			return this.storageSize;
		}

		public void setStorageSize(Long storageSize) {
			this.storageSize = storageSize;
		}

		public Long getLatestReplicationTime() {
			return this.latestReplicationTime;
		}

		public void setLatestReplicationTime(Long latestReplicationTime) {
			this.latestReplicationTime = latestReplicationTime;
		}

		public String getVaultStatusMessage() {
			return this.vaultStatusMessage;
		}

		public void setVaultStatusMessage(String vaultStatusMessage) {
			this.vaultStatusMessage = vaultStatusMessage;
		}

		public Boolean getReplication() {
			return this.replication;
		}

		public void setReplication(Boolean replication) {
			this.replication = replication;
		}

		public String getReplicationSourceRegionId() {
			return this.replicationSourceRegionId;
		}

		public void setReplicationSourceRegionId(String replicationSourceRegionId) {
			this.replicationSourceRegionId = replicationSourceRegionId;
		}

		public String getVaultRegionId() {
			return this.vaultRegionId;
		}

		public void setVaultRegionId(String vaultRegionId) {
			this.vaultRegionId = vaultRegionId;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getBucketName() {
			return this.bucketName;
		}

		public void setBucketName(String bucketName) {
			this.bucketName = bucketName;
		}

		public Boolean getSearchEnabled() {
			return this.searchEnabled;
		}

		public void setSearchEnabled(Boolean searchEnabled) {
			this.searchEnabled = searchEnabled;
		}

		public Boolean getIndexAvailable() {
			return this.indexAvailable;
		}

		public void setIndexAvailable(Boolean indexAvailable) {
			this.indexAvailable = indexAvailable;
		}

		public Long getBytesDone() {
			return this.bytesDone;
		}

		public void setBytesDone(Long bytesDone) {
			this.bytesDone = bytesDone;
		}

		public String getEncryptType() {
			return this.encryptType;
		}

		public void setEncryptType(String encryptType) {
			this.encryptType = encryptType;
		}

		public Boolean getWormEnabled() {
			return this.wormEnabled;
		}

		public void setWormEnabled(Boolean wormEnabled) {
			this.wormEnabled = wormEnabled;
		}

		public Long getSnapshotCount() {
			return this.snapshotCount;
		}

		public void setSnapshotCount(Long snapshotCount) {
			this.snapshotCount = snapshotCount;
		}

		public String getCompressionAlgorithm() {
			return this.compressionAlgorithm;
		}

		public void setCompressionAlgorithm(String compressionAlgorithm) {
			this.compressionAlgorithm = compressionAlgorithm;
		}

		public String getRedundancyType() {
			return this.redundancyType;
		}

		public void setRedundancyType(String redundancyType) {
			this.redundancyType = redundancyType;
		}

		public String getKmsKeyId() {
			return this.kmsKeyId;
		}

		public void setKmsKeyId(String kmsKeyId) {
			this.kmsKeyId = kmsKeyId;
		}

		public Long getChargedStorageSize() {
			return this.chargedStorageSize;
		}

		public void setChargedStorageSize(Long chargedStorageSize) {
			this.chargedStorageSize = chargedStorageSize;
		}

		public Long getArchiveStorageSize() {
			return this.archiveStorageSize;
		}

		public void setArchiveStorageSize(Long archiveStorageSize) {
			this.archiveStorageSize = archiveStorageSize;
		}

		public Long getArchiveBytesDone() {
			return this.archiveBytesDone;
		}

		public void setArchiveBytesDone(Long archiveBytesDone) {
			this.archiveBytesDone = archiveBytesDone;
		}

		public Boolean getReplicationSourceVault() {
			return this.replicationSourceVault;
		}

		public void setReplicationSourceVault(Boolean replicationSourceVault) {
			this.replicationSourceVault = replicationSourceVault;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getSourceTypes() {
			return this.sourceTypes;
		}

		public void setSourceTypes(List<String> sourceTypes) {
			this.sourceTypes = sourceTypes;
		}

		public ReplicationProgress getReplicationProgress() {
			return this.replicationProgress;
		}

		public void setReplicationProgress(ReplicationProgress replicationProgress) {
			this.replicationProgress = replicationProgress;
		}

		public BackupPlanStatistics getBackupPlanStatistics() {
			return this.backupPlanStatistics;
		}

		public void setBackupPlanStatistics(BackupPlanStatistics backupPlanStatistics) {
			this.backupPlanStatistics = backupPlanStatistics;
		}

		public TrialInfo getTrialInfo() {
			return this.trialInfo;
		}

		public void setTrialInfo(TrialInfo trialInfo) {
			this.trialInfo = trialInfo;
		}

		public Endpoint getEndpoint() {
			return this.endpoint;
		}

		public void setEndpoint(Endpoint endpoint) {
			this.endpoint = endpoint;
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class ReplicationProgress {

			private Integer historicalReplicationProgress;

			private Long newReplicationProgress;

			public Integer getHistoricalReplicationProgress() {
				return this.historicalReplicationProgress;
			}

			public void setHistoricalReplicationProgress(Integer historicalReplicationProgress) {
				this.historicalReplicationProgress = historicalReplicationProgress;
			}

			public Long getNewReplicationProgress() {
				return this.newReplicationProgress;
			}

			public void setNewReplicationProgress(Long newReplicationProgress) {
				this.newReplicationProgress = newReplicationProgress;
			}
		}

		public static class BackupPlanStatistics {

			private Integer oracle;

			private Integer localFile;

			private Integer nas;

			private Integer commonNas;

			private Integer isilon;

			private Integer oss;

			private Integer sqlServer;

			private Integer csg;

			private Integer ecsFile;

			private Integer mySql;

			private Integer ecsHana;

			private Integer localVm;

			private Integer ots;

			public Integer getOracle() {
				return this.oracle;
			}

			public void setOracle(Integer oracle) {
				this.oracle = oracle;
			}

			public Integer getLocalFile() {
				return this.localFile;
			}

			public void setLocalFile(Integer localFile) {
				this.localFile = localFile;
			}

			public Integer getNas() {
				return this.nas;
			}

			public void setNas(Integer nas) {
				this.nas = nas;
			}

			public Integer getCommonNas() {
				return this.commonNas;
			}

			public void setCommonNas(Integer commonNas) {
				this.commonNas = commonNas;
			}

			public Integer getIsilon() {
				return this.isilon;
			}

			public void setIsilon(Integer isilon) {
				this.isilon = isilon;
			}

			public Integer getOss() {
				return this.oss;
			}

			public void setOss(Integer oss) {
				this.oss = oss;
			}

			public Integer getSqlServer() {
				return this.sqlServer;
			}

			public void setSqlServer(Integer sqlServer) {
				this.sqlServer = sqlServer;
			}

			public Integer getCsg() {
				return this.csg;
			}

			public void setCsg(Integer csg) {
				this.csg = csg;
			}

			public Integer getEcsFile() {
				return this.ecsFile;
			}

			public void setEcsFile(Integer ecsFile) {
				this.ecsFile = ecsFile;
			}

			public Integer getMySql() {
				return this.mySql;
			}

			public void setMySql(Integer mySql) {
				this.mySql = mySql;
			}

			public Integer getEcsHana() {
				return this.ecsHana;
			}

			public void setEcsHana(Integer ecsHana) {
				this.ecsHana = ecsHana;
			}

			public Integer getLocalVm() {
				return this.localVm;
			}

			public void setLocalVm(Integer localVm) {
				this.localVm = localVm;
			}

			public Integer getOts() {
				return this.ots;
			}

			public void setOts(Integer ots) {
				this.ots = ots;
			}
		}

		public static class TrialInfo {

			private Long trialStartTime;

			private Long trialVaultReleaseTime;

			private Long trialExpireTime;

			private Boolean keepAfterTrialExpiration;

			public Long getTrialStartTime() {
				return this.trialStartTime;
			}

			public void setTrialStartTime(Long trialStartTime) {
				this.trialStartTime = trialStartTime;
			}

			public Long getTrialVaultReleaseTime() {
				return this.trialVaultReleaseTime;
			}

			public void setTrialVaultReleaseTime(Long trialVaultReleaseTime) {
				this.trialVaultReleaseTime = trialVaultReleaseTime;
			}

			public Long getTrialExpireTime() {
				return this.trialExpireTime;
			}

			public void setTrialExpireTime(Long trialExpireTime) {
				this.trialExpireTime = trialExpireTime;
			}

			public Boolean getKeepAfterTrialExpiration() {
				return this.keepAfterTrialExpiration;
			}

			public void setKeepAfterTrialExpiration(Boolean keepAfterTrialExpiration) {
				this.keepAfterTrialExpiration = keepAfterTrialExpiration;
			}
		}

		public static class Endpoint {

			private String vpc;

			private String classic;

			private String pub;

			public String getVpc() {
				return this.vpc;
			}

			public void setVpc(String vpc) {
				this.vpc = vpc;
			}

			public String getClassic() {
				return this.classic;
			}

			public void setClassic(String classic) {
				this.classic = classic;
			}

			public String getPub() {
				return this.pub;
			}

			public void setPub(String pub) {
				this.pub = pub;
			}
		}
	}

	@Override
	public DescribeVaultsResponse getInstance(UnmarshallerContext context) {
		return	DescribeVaultsResponseUnmarshaller.unmarshall(this, context);
	}
}
