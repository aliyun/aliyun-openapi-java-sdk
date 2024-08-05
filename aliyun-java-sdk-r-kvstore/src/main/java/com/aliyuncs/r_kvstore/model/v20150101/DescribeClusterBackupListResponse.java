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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeClusterBackupListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterBackupListResponse extends AcsResponse {

	private String requestId;

	private Integer maxResults;

	private Integer pageNumber;

	private Integer pageSize;

	private Long fullStorageSize;

	private Long logStorageSize;

	private Long freeSize;

	private List<ClusterBackup> clusterBackups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
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

	public Long getFullStorageSize() {
		return this.fullStorageSize;
	}

	public void setFullStorageSize(Long fullStorageSize) {
		this.fullStorageSize = fullStorageSize;
	}

	public Long getLogStorageSize() {
		return this.logStorageSize;
	}

	public void setLogStorageSize(Long logStorageSize) {
		this.logStorageSize = logStorageSize;
	}

	public Long getFreeSize() {
		return this.freeSize;
	}

	public void setFreeSize(Long freeSize) {
		this.freeSize = freeSize;
	}

	public List<ClusterBackup> getClusterBackups() {
		return this.clusterBackups;
	}

	public void setClusterBackups(List<ClusterBackup> clusterBackups) {
		this.clusterBackups = clusterBackups;
	}

	public static class ClusterBackup {

		private Integer isAvail;

		private String clusterBackupId;

		private String clusterBackupStatus;

		private String clusterBackupSize;

		private String clusterBackupStartTime;

		private String clusterBackupEndTime;

		private String clusterBackupMode;

		private Integer shardClassMemory;

		private String progress;

		private List<Backup> backups;

		private ExtraInfo extraInfo;

		public Integer getIsAvail() {
			return this.isAvail;
		}

		public void setIsAvail(Integer isAvail) {
			this.isAvail = isAvail;
		}

		public String getClusterBackupId() {
			return this.clusterBackupId;
		}

		public void setClusterBackupId(String clusterBackupId) {
			this.clusterBackupId = clusterBackupId;
		}

		public String getClusterBackupStatus() {
			return this.clusterBackupStatus;
		}

		public void setClusterBackupStatus(String clusterBackupStatus) {
			this.clusterBackupStatus = clusterBackupStatus;
		}

		public String getClusterBackupSize() {
			return this.clusterBackupSize;
		}

		public void setClusterBackupSize(String clusterBackupSize) {
			this.clusterBackupSize = clusterBackupSize;
		}

		public String getClusterBackupStartTime() {
			return this.clusterBackupStartTime;
		}

		public void setClusterBackupStartTime(String clusterBackupStartTime) {
			this.clusterBackupStartTime = clusterBackupStartTime;
		}

		public String getClusterBackupEndTime() {
			return this.clusterBackupEndTime;
		}

		public void setClusterBackupEndTime(String clusterBackupEndTime) {
			this.clusterBackupEndTime = clusterBackupEndTime;
		}

		public String getClusterBackupMode() {
			return this.clusterBackupMode;
		}

		public void setClusterBackupMode(String clusterBackupMode) {
			this.clusterBackupMode = clusterBackupMode;
		}

		public Integer getShardClassMemory() {
			return this.shardClassMemory;
		}

		public void setShardClassMemory(Integer shardClassMemory) {
			this.shardClassMemory = shardClassMemory;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public List<Backup> getBackups() {
			return this.backups;
		}

		public void setBackups(List<Backup> backups) {
			this.backups = backups;
		}

		public ExtraInfo getExtraInfo() {
			return this.extraInfo;
		}

		public void setExtraInfo(ExtraInfo extraInfo) {
			this.extraInfo = extraInfo;
		}

		public static class Backup {

			private String backupId;

			private String instanceName;

			private String backupDownloadURL;

			private String backupIntranetDownloadURL;

			private String recoverConfigMode;

			private String backupStartTime;

			private String backupEndTime;

			private String backupSize;

			private String isAvail;

			private String backupStatus;

			private String backupName;

			private String engine;

			private ExtraInfo1 extraInfo1;

			public String getBackupId() {
				return this.backupId;
			}

			public void setBackupId(String backupId) {
				this.backupId = backupId;
			}

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public String getBackupDownloadURL() {
				return this.backupDownloadURL;
			}

			public void setBackupDownloadURL(String backupDownloadURL) {
				this.backupDownloadURL = backupDownloadURL;
			}

			public String getBackupIntranetDownloadURL() {
				return this.backupIntranetDownloadURL;
			}

			public void setBackupIntranetDownloadURL(String backupIntranetDownloadURL) {
				this.backupIntranetDownloadURL = backupIntranetDownloadURL;
			}

			public String getRecoverConfigMode() {
				return this.recoverConfigMode;
			}

			public void setRecoverConfigMode(String recoverConfigMode) {
				this.recoverConfigMode = recoverConfigMode;
			}

			public String getBackupStartTime() {
				return this.backupStartTime;
			}

			public void setBackupStartTime(String backupStartTime) {
				this.backupStartTime = backupStartTime;
			}

			public String getBackupEndTime() {
				return this.backupEndTime;
			}

			public void setBackupEndTime(String backupEndTime) {
				this.backupEndTime = backupEndTime;
			}

			public String getBackupSize() {
				return this.backupSize;
			}

			public void setBackupSize(String backupSize) {
				this.backupSize = backupSize;
			}

			public String getIsAvail() {
				return this.isAvail;
			}

			public void setIsAvail(String isAvail) {
				this.isAvail = isAvail;
			}

			public String getBackupStatus() {
				return this.backupStatus;
			}

			public void setBackupStatus(String backupStatus) {
				this.backupStatus = backupStatus;
			}

			public String getBackupName() {
				return this.backupName;
			}

			public void setBackupName(String backupName) {
				this.backupName = backupName;
			}

			public String getEngine() {
				return this.engine;
			}

			public void setEngine(String engine) {
				this.engine = engine;
			}

			public ExtraInfo1 getExtraInfo1() {
				return this.extraInfo1;
			}

			public void setExtraInfo1(ExtraInfo1 extraInfo1) {
				this.extraInfo1 = extraInfo1;
			}

			public static class ExtraInfo1 {

				private Integer custinsLevelId;

				private String custinsDbVersion;

				private String custinsName;

				private Integer custinsId;

				public Integer getCustinsLevelId() {
					return this.custinsLevelId;
				}

				public void setCustinsLevelId(Integer custinsLevelId) {
					this.custinsLevelId = custinsLevelId;
				}

				public String getCustinsDbVersion() {
					return this.custinsDbVersion;
				}

				public void setCustinsDbVersion(String custinsDbVersion) {
					this.custinsDbVersion = custinsDbVersion;
				}

				public String getCustinsName() {
					return this.custinsName;
				}

				public void setCustinsName(String custinsName) {
					this.custinsName = custinsName;
				}

				public Integer getCustinsId() {
					return this.custinsId;
				}

				public void setCustinsId(Integer custinsId) {
					this.custinsId = custinsId;
				}
			}
		}

		public static class ExtraInfo {

			private String registryFromHistory;

			public String getRegistryFromHistory() {
				return this.registryFromHistory;
			}

			public void setRegistryFromHistory(String registryFromHistory) {
				this.registryFromHistory = registryFromHistory;
			}
		}
	}

	@Override
	public DescribeClusterBackupListResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterBackupListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
