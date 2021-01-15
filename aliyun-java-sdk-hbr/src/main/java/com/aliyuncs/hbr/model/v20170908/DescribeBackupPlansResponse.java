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
import com.aliyuncs.hbr.transform.v20170908.DescribeBackupPlansResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupPlansResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Long totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<BackupPlan> backupPlans;

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

	public List<BackupPlan> getBackupPlans() {
		return this.backupPlans;
	}

	public void setBackupPlans(List<BackupPlan> backupPlans) {
		this.backupPlans = backupPlans;
	}

	public static class BackupPlan {

		private String vaultId;

		private String backupSourceGroupId;

		private String planId;

		private String planName;

		private String sourceType;

		private String backupType;

		private String schedule;

		private Long retention;

		private String clusterId;

		private Boolean disabled;

		private Long createdTime;

		private Long updatedTime;

		private String fileSystemId;

		private Long createTime;

		private String bucket;

		private String prefix;

		private String instanceId;

		private String detail;

		private String clientId;

		private String speedLimit;

		private String options;

		private String include;

		private String exclude;

		private String dataSourceId;

		private List<String> paths;

		private TrialInfo trialInfo;

		public String getVaultId() {
			return this.vaultId;
		}

		public void setVaultId(String vaultId) {
			this.vaultId = vaultId;
		}

		public String getBackupSourceGroupId() {
			return this.backupSourceGroupId;
		}

		public void setBackupSourceGroupId(String backupSourceGroupId) {
			this.backupSourceGroupId = backupSourceGroupId;
		}

		public String getPlanId() {
			return this.planId;
		}

		public void setPlanId(String planId) {
			this.planId = planId;
		}

		public String getPlanName() {
			return this.planName;
		}

		public void setPlanName(String planName) {
			this.planName = planName;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getBackupType() {
			return this.backupType;
		}

		public void setBackupType(String backupType) {
			this.backupType = backupType;
		}

		public String getSchedule() {
			return this.schedule;
		}

		public void setSchedule(String schedule) {
			this.schedule = schedule;
		}

		public Long getRetention() {
			return this.retention;
		}

		public void setRetention(Long retention) {
			this.retention = retention;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public Boolean getDisabled() {
			return this.disabled;
		}

		public void setDisabled(Boolean disabled) {
			this.disabled = disabled;
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

		public String getFileSystemId() {
			return this.fileSystemId;
		}

		public void setFileSystemId(String fileSystemId) {
			this.fileSystemId = fileSystemId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getBucket() {
			return this.bucket;
		}

		public void setBucket(String bucket) {
			this.bucket = bucket;
		}

		public String getPrefix() {
			return this.prefix;
		}

		public void setPrefix(String prefix) {
			this.prefix = prefix;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}

		public String getSpeedLimit() {
			return this.speedLimit;
		}

		public void setSpeedLimit(String speedLimit) {
			this.speedLimit = speedLimit;
		}

		public String getOptions() {
			return this.options;
		}

		public void setOptions(String options) {
			this.options = options;
		}

		public String getInclude() {
			return this.include;
		}

		public void setInclude(String include) {
			this.include = include;
		}

		public String getExclude() {
			return this.exclude;
		}

		public void setExclude(String exclude) {
			this.exclude = exclude;
		}

		public String getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(String dataSourceId) {
			this.dataSourceId = dataSourceId;
		}

		public List<String> getPaths() {
			return this.paths;
		}

		public void setPaths(List<String> paths) {
			this.paths = paths;
		}

		public TrialInfo getTrialInfo() {
			return this.trialInfo;
		}

		public void setTrialInfo(TrialInfo trialInfo) {
			this.trialInfo = trialInfo;
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
	}

	@Override
	public DescribeBackupPlansResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupPlansResponseUnmarshaller.unmarshall(this, context);
	}
}
