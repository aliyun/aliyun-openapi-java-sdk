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

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalCount;

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

	public List<BackupPlan> getBackupPlans() {
		return this.backupPlans;
	}

	public void setBackupPlans(List<BackupPlan> backupPlans) {
		this.backupPlans = backupPlans;
	}

	public static class BackupPlan {

		private String vaultId;

		private String backupType;

		private Long createTime;

		private String dataSourceId;

		private String sourceType;

		private Boolean disabled;

		private String prefix;

		private String options;

		private String clientId;

		private String exclude;

		private Long retention;

		private Long createdTime;

		private String clusterId;

		private String bucket;

		private String detail;

		private String schedule;

		private String speedLimit;

		private String instanceId;

		private String planId;

		private String backupSourceGroupId;

		private String fileSystemId;

		private String instanceName;

		private Long updatedTime;

		private String planName;

		private String include;

		private String instanceGroupId;

		private String crossAccountType;

		private Long crossAccountUserId;

		private String crossAccountRoleName;

		private Long keepLatestSnapshots;

		private String destSourceType;

		private String destDataSourceId;

		private String destDataSourceDetail;

		private String changeListPath;

		private List<Rule> rules;

		private List<Resource> resources;

		private List<String> paths;

		private OtsDetail otsDetail;

		private TrialInfo trialInfo;

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

		public String getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(String dataSourceId) {
			this.dataSourceId = dataSourceId;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public Boolean getDisabled() {
			return this.disabled;
		}

		public void setDisabled(Boolean disabled) {
			this.disabled = disabled;
		}

		public String getPrefix() {
			return this.prefix;
		}

		public void setPrefix(String prefix) {
			this.prefix = prefix;
		}

		public String getOptions() {
			return this.options;
		}

		public void setOptions(String options) {
			this.options = options;
		}

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}

		public String getExclude() {
			return this.exclude;
		}

		public void setExclude(String exclude) {
			this.exclude = exclude;
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

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getBucket() {
			return this.bucket;
		}

		public void setBucket(String bucket) {
			this.bucket = bucket;
		}

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}

		public String getSchedule() {
			return this.schedule;
		}

		public void setSchedule(String schedule) {
			this.schedule = schedule;
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

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}

		public String getPlanName() {
			return this.planName;
		}

		public void setPlanName(String planName) {
			this.planName = planName;
		}

		public String getInclude() {
			return this.include;
		}

		public void setInclude(String include) {
			this.include = include;
		}

		public String getInstanceGroupId() {
			return this.instanceGroupId;
		}

		public void setInstanceGroupId(String instanceGroupId) {
			this.instanceGroupId = instanceGroupId;
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

		public Long getKeepLatestSnapshots() {
			return this.keepLatestSnapshots;
		}

		public void setKeepLatestSnapshots(Long keepLatestSnapshots) {
			this.keepLatestSnapshots = keepLatestSnapshots;
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

		public List<Rule> getRules() {
			return this.rules;
		}

		public void setRules(List<Rule> rules) {
			this.rules = rules;
		}

		public List<Resource> getResources() {
			return this.resources;
		}

		public void setResources(List<Resource> resources) {
			this.resources = resources;
		}

		public List<String> getPaths() {
			return this.paths;
		}

		public void setPaths(List<String> paths) {
			this.paths = paths;
		}

		public OtsDetail getOtsDetail() {
			return this.otsDetail;
		}

		public void setOtsDetail(OtsDetail otsDetail) {
			this.otsDetail = otsDetail;
		}

		public TrialInfo getTrialInfo() {
			return this.trialInfo;
		}

		public void setTrialInfo(TrialInfo trialInfo) {
			this.trialInfo = trialInfo;
		}

		public static class Rule {

			private Long destinationRetention;

			private String schedule;

			private Long retention;

			private Boolean disabled;

			private Boolean doCopy;

			private String destinationRegionId;

			private String ruleId;

			private String ruleName;

			private String backupType;

			public Long getDestinationRetention() {
				return this.destinationRetention;
			}

			public void setDestinationRetention(Long destinationRetention) {
				this.destinationRetention = destinationRetention;
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

			public Boolean getDisabled() {
				return this.disabled;
			}

			public void setDisabled(Boolean disabled) {
				this.disabled = disabled;
			}

			public Boolean getDoCopy() {
				return this.doCopy;
			}

			public void setDoCopy(Boolean doCopy) {
				this.doCopy = doCopy;
			}

			public String getDestinationRegionId() {
				return this.destinationRegionId;
			}

			public void setDestinationRegionId(String destinationRegionId) {
				this.destinationRegionId = destinationRegionId;
			}

			public String getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(String ruleId) {
				this.ruleId = ruleId;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}

			public String getBackupType() {
				return this.backupType;
			}

			public void setBackupType(String backupType) {
				this.backupType = backupType;
			}
		}

		public static class Resource {

			private String sourceType;

			private String resourceId;

			private String extra;

			public String getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(String sourceType) {
				this.sourceType = sourceType;
			}

			public String getResourceId() {
				return this.resourceId;
			}

			public void setResourceId(String resourceId) {
				this.resourceId = resourceId;
			}

			public String getExtra() {
				return this.extra;
			}

			public void setExtra(String extra) {
				this.extra = extra;
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
	}

	@Override
	public DescribeBackupPlansResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupPlansResponseUnmarshaller.unmarshall(this, context);
	}
}
