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

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Vault> getVaults() {
		return this.vaults;
	}

	public void setVaults(List<Vault> vaults) {
		this.vaults = vaults;
	}

	public static class Vault {

		private String vaultId;

		private Long createdTime;

		private String vaultRegionId;

		private String vaultName;

		private String description;

		private String status;

		private Long updatedTime;

		private Long storageSize;

		private String vaultType;

		private Long bytesDone;

		private Boolean searchEnabled;

		private String vaultStorageClass;

		private String replicationSourceVaultId;

		private String replicationSourceRegionId;

		private String vaultStatusMessage;

		private String chargeType;

		private Boolean replication;

		private String bucketName;

		private List<String> sourceTypes;

		private ReplicationProgress replicationProgress;

		private BackupPlanStatistics backupPlanStatistics;

		private TrialInfo trialInfo;

		private Endpoint endpoint;

		public String getVaultId() {
			return this.vaultId;
		}

		public void setVaultId(String vaultId) {
			this.vaultId = vaultId;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public String getVaultRegionId() {
			return this.vaultRegionId;
		}

		public void setVaultRegionId(String vaultRegionId) {
			this.vaultRegionId = vaultRegionId;
		}

		public String getVaultName() {
			return this.vaultName;
		}

		public void setVaultName(String vaultName) {
			this.vaultName = vaultName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}

		public Long getStorageSize() {
			return this.storageSize;
		}

		public void setStorageSize(Long storageSize) {
			this.storageSize = storageSize;
		}

		public String getVaultType() {
			return this.vaultType;
		}

		public void setVaultType(String vaultType) {
			this.vaultType = vaultType;
		}

		public Long getBytesDone() {
			return this.bytesDone;
		}

		public void setBytesDone(Long bytesDone) {
			this.bytesDone = bytesDone;
		}

		public Boolean getSearchEnabled() {
			return this.searchEnabled;
		}

		public void setSearchEnabled(Boolean searchEnabled) {
			this.searchEnabled = searchEnabled;
		}

		public String getVaultStorageClass() {
			return this.vaultStorageClass;
		}

		public void setVaultStorageClass(String vaultStorageClass) {
			this.vaultStorageClass = vaultStorageClass;
		}

		public String getReplicationSourceVaultId() {
			return this.replicationSourceVaultId;
		}

		public void setReplicationSourceVaultId(String replicationSourceVaultId) {
			this.replicationSourceVaultId = replicationSourceVaultId;
		}

		public String getReplicationSourceRegionId() {
			return this.replicationSourceRegionId;
		}

		public void setReplicationSourceRegionId(String replicationSourceRegionId) {
			this.replicationSourceRegionId = replicationSourceRegionId;
		}

		public String getVaultStatusMessage() {
			return this.vaultStatusMessage;
		}

		public void setVaultStatusMessage(String vaultStatusMessage) {
			this.vaultStatusMessage = vaultStatusMessage;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public Boolean getReplication() {
			return this.replication;
		}

		public void setReplication(Boolean replication) {
			this.replication = replication;
		}

		public String getBucketName() {
			return this.bucketName;
		}

		public void setBucketName(String bucketName) {
			this.bucketName = bucketName;
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

			private Integer localFile;

			private Integer localVm;

			private Integer ecsFile;

			private Integer ecsHana;

			private Integer sqlServer;

			private Integer csg;

			private Integer oss;

			private Integer nas;

			private Integer isilon;

			private Integer commonNas;

			public Integer getLocalFile() {
				return this.localFile;
			}

			public void setLocalFile(Integer localFile) {
				this.localFile = localFile;
			}

			public Integer getLocalVm() {
				return this.localVm;
			}

			public void setLocalVm(Integer localVm) {
				this.localVm = localVm;
			}

			public Integer getEcsFile() {
				return this.ecsFile;
			}

			public void setEcsFile(Integer ecsFile) {
				this.ecsFile = ecsFile;
			}

			public Integer getEcsHana() {
				return this.ecsHana;
			}

			public void setEcsHana(Integer ecsHana) {
				this.ecsHana = ecsHana;
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

			public Integer getOss() {
				return this.oss;
			}

			public void setOss(Integer oss) {
				this.oss = oss;
			}

			public Integer getNas() {
				return this.nas;
			}

			public void setNas(Integer nas) {
				this.nas = nas;
			}

			public Integer getIsilon() {
				return this.isilon;
			}

			public void setIsilon(Integer isilon) {
				this.isilon = isilon;
			}

			public Integer getCommonNas() {
				return this.commonNas;
			}

			public void setCommonNas(Integer commonNas) {
				this.commonNas = commonNas;
			}
		}

		public static class TrialInfo {

			private Long trialStartTime;

			private Long trialExpireTime;

			private Boolean keepAfterTrialExpiration;

			private Long trialVaultReleaseTime;

			public Long getTrialStartTime() {
				return this.trialStartTime;
			}

			public void setTrialStartTime(Long trialStartTime) {
				this.trialStartTime = trialStartTime;
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

			public Long getTrialVaultReleaseTime() {
				return this.trialVaultReleaseTime;
			}

			public void setTrialVaultReleaseTime(Long trialVaultReleaseTime) {
				this.trialVaultReleaseTime = trialVaultReleaseTime;
			}
		}

		public static class Endpoint {

			private String pub;

			private String vpc;

			private String classic;

			public String getPub() {
				return this.pub;
			}

			public void setPub(String pub) {
				this.pub = pub;
			}

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
		}
	}

	@Override
	public DescribeVaultsResponse getInstance(UnmarshallerContext context) {
		return	DescribeVaultsResponseUnmarshaller.unmarshall(this, context);
	}
}
