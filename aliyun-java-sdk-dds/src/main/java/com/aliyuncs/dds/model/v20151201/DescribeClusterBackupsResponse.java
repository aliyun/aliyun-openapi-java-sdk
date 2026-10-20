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

package com.aliyuncs.dds.model.v20151201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeClusterBackupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterBackupsResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer maxResults;

	private List<ClusterBackup> clusterBackups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<ClusterBackup> getClusterBackups() {
		return this.clusterBackups;
	}

	public void setClusterBackups(List<ClusterBackup> clusterBackups) {
		this.clusterBackups = clusterBackups;
	}

	public static class ClusterBackup {

		private String clusterBackupId;

		private String clusterBackupStartTime;

		private String progress;

		private String attachLogStatus;

		private String engineVersion;

		private String clusterBackupSize;

		private String clusterBackupMode;

		private Integer isAvail;

		private String clusterBackupStatus;

		private String backupExpireTime;

		private String clusterBackupEndTime;

		private List<Backup> backups;

		private ExtraInfo extraInfo;

		public String getClusterBackupId() {
			return this.clusterBackupId;
		}

		public void setClusterBackupId(String clusterBackupId) {
			this.clusterBackupId = clusterBackupId;
		}

		public String getClusterBackupStartTime() {
			return this.clusterBackupStartTime;
		}

		public void setClusterBackupStartTime(String clusterBackupStartTime) {
			this.clusterBackupStartTime = clusterBackupStartTime;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public String getAttachLogStatus() {
			return this.attachLogStatus;
		}

		public void setAttachLogStatus(String attachLogStatus) {
			this.attachLogStatus = attachLogStatus;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getClusterBackupSize() {
			return this.clusterBackupSize;
		}

		public void setClusterBackupSize(String clusterBackupSize) {
			this.clusterBackupSize = clusterBackupSize;
		}

		public String getClusterBackupMode() {
			return this.clusterBackupMode;
		}

		public void setClusterBackupMode(String clusterBackupMode) {
			this.clusterBackupMode = clusterBackupMode;
		}

		public Integer getIsAvail() {
			return this.isAvail;
		}

		public void setIsAvail(Integer isAvail) {
			this.isAvail = isAvail;
		}

		public String getClusterBackupStatus() {
			return this.clusterBackupStatus;
		}

		public void setClusterBackupStatus(String clusterBackupStatus) {
			this.clusterBackupStatus = clusterBackupStatus;
		}

		public String getBackupExpireTime() {
			return this.backupExpireTime;
		}

		public void setBackupExpireTime(String backupExpireTime) {
			this.backupExpireTime = backupExpireTime;
		}

		public String getClusterBackupEndTime() {
			return this.clusterBackupEndTime;
		}

		public void setClusterBackupEndTime(String clusterBackupEndTime) {
			this.clusterBackupEndTime = clusterBackupEndTime;
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

			private String instanceName;

			private String backupDownloadURL;

			private String backupIntranetDownloadURL;

			private String backupEndTime;

			private String backupSize;

			private String backupStartTime;

			private String backupId;

			private String isAvail;

			private String backupStatus;

			private String backupName;

			private ExtraInfo1 extraInfo1;

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

			public String getBackupStartTime() {
				return this.backupStartTime;
			}

			public void setBackupStartTime(String backupStartTime) {
				this.backupStartTime = backupStartTime;
			}

			public String getBackupId() {
				return this.backupId;
			}

			public void setBackupId(String backupId) {
				this.backupId = backupId;
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

			public ExtraInfo1 getExtraInfo1() {
				return this.extraInfo1;
			}

			public void setExtraInfo1(ExtraInfo1 extraInfo1) {
				this.extraInfo1 = extraInfo1;
			}

			public static class ExtraInfo1 {

				private String nodeType;

				private String nodeId;

				private String storageSize;

				private String instanceClass;

				public String getNodeType() {
					return this.nodeType;
				}

				public void setNodeType(String nodeType) {
					this.nodeType = nodeType;
				}

				public String getNodeId() {
					return this.nodeId;
				}

				public void setNodeId(String nodeId) {
					this.nodeId = nodeId;
				}

				public String getStorageSize() {
					return this.storageSize;
				}

				public void setStorageSize(String storageSize) {
					this.storageSize = storageSize;
				}

				public String getInstanceClass() {
					return this.instanceClass;
				}

				public void setInstanceClass(String instanceClass) {
					this.instanceClass = instanceClass;
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
	public DescribeClusterBackupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterBackupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
