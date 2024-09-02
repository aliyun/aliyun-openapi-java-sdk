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

package com.aliyuncs.oceanbasepro.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeRestorableTenantsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRestorableTenantsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<Data> tenants;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getTenants() {
		return this.tenants;
	}

	public void setTenants(List<Data> tenants) {
		this.tenants = tenants;
	}

	public static class Data {

		private String tenantName;

		private String method;

		private String tenantId;

		private String clusterId;

		private String obRpmVersion;

		private String obVersion;

		private String sourceRegion;

		private String tenantAlias;

		private Long cpuNum;

		private Long memoryNum;

		private String backupBucketName;

		private String obTenantId;

		private String clusterName;

		private Long usedDisk;

		private Long unitNum;

		private String tenantMode;

		private Integer tenantDataBackupRemainDays;

		private List<TimeIntervalListItem> timeIntervalList;

		private List<BackupSetsItem> backupSets;

		public String getTenantName() {
			return this.tenantName;
		}

		public void setTenantName(String tenantName) {
			this.tenantName = tenantName;
		}

		public String getBizMethod() {
			return this.method;
		}

		public void setBizMethod(String method) {
			this.method = method;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getObRpmVersion() {
			return this.obRpmVersion;
		}

		public void setObRpmVersion(String obRpmVersion) {
			this.obRpmVersion = obRpmVersion;
		}

		public String getObVersion() {
			return this.obVersion;
		}

		public void setObVersion(String obVersion) {
			this.obVersion = obVersion;
		}

		public String getSourceRegion() {
			return this.sourceRegion;
		}

		public void setSourceRegion(String sourceRegion) {
			this.sourceRegion = sourceRegion;
		}

		public String getTenantAlias() {
			return this.tenantAlias;
		}

		public void setTenantAlias(String tenantAlias) {
			this.tenantAlias = tenantAlias;
		}

		public Long getCpuNum() {
			return this.cpuNum;
		}

		public void setCpuNum(Long cpuNum) {
			this.cpuNum = cpuNum;
		}

		public Long getMemoryNum() {
			return this.memoryNum;
		}

		public void setMemoryNum(Long memoryNum) {
			this.memoryNum = memoryNum;
		}

		public String getBackupBucketName() {
			return this.backupBucketName;
		}

		public void setBackupBucketName(String backupBucketName) {
			this.backupBucketName = backupBucketName;
		}

		public String getObTenantId() {
			return this.obTenantId;
		}

		public void setObTenantId(String obTenantId) {
			this.obTenantId = obTenantId;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public Long getUsedDisk() {
			return this.usedDisk;
		}

		public void setUsedDisk(Long usedDisk) {
			this.usedDisk = usedDisk;
		}

		public Long getUnitNum() {
			return this.unitNum;
		}

		public void setUnitNum(Long unitNum) {
			this.unitNum = unitNum;
		}

		public String getTenantMode() {
			return this.tenantMode;
		}

		public void setTenantMode(String tenantMode) {
			this.tenantMode = tenantMode;
		}

		public Integer getTenantDataBackupRemainDays() {
			return this.tenantDataBackupRemainDays;
		}

		public void setTenantDataBackupRemainDays(Integer tenantDataBackupRemainDays) {
			this.tenantDataBackupRemainDays = tenantDataBackupRemainDays;
		}

		public List<TimeIntervalListItem> getTimeIntervalList() {
			return this.timeIntervalList;
		}

		public void setTimeIntervalList(List<TimeIntervalListItem> timeIntervalList) {
			this.timeIntervalList = timeIntervalList;
		}

		public List<BackupSetsItem> getBackupSets() {
			return this.backupSets;
		}

		public void setBackupSets(List<BackupSetsItem> backupSets) {
			this.backupSets = backupSets;
		}

		public static class TimeIntervalListItem {

			private String startTime;

			private String endTime;

			private Boolean fromArchive;

			private String storageType;

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public Boolean getFromArchive() {
				return this.fromArchive;
			}

			public void setFromArchive(Boolean fromArchive) {
				this.fromArchive = fromArchive;
			}

			public String getStorageType() {
				return this.storageType;
			}

			public void setStorageType(String storageType) {
				this.storageType = storageType;
			}
		}

		public static class BackupSetsItem {

			private String checkpoint;

			private String setId;

			private String backupSetId;

			private String tenantId;

			public String getCheckpoint() {
				return this.checkpoint;
			}

			public void setCheckpoint(String checkpoint) {
				this.checkpoint = checkpoint;
			}

			public String getSetId() {
				return this.setId;
			}

			public void setSetId(String setId) {
				this.setId = setId;
			}

			public String getBackupSetId() {
				return this.backupSetId;
			}

			public void setBackupSetId(String backupSetId) {
				this.backupSetId = backupSetId;
			}

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}
		}
	}

	@Override
	public DescribeRestorableTenantsResponse getInstance(UnmarshallerContext context) {
		return	DescribeRestorableTenantsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
