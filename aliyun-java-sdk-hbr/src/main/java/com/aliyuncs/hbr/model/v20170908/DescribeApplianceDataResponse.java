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
import com.aliyuncs.hbr.transform.v20170908.DescribeApplianceDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApplianceDataResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<BackupJob> backupJobList;

	private List<BackupHistory> backupHistoryList;

	private List<RestoreJob> restoreJobList;

	private List<RestoreHistory> restoreHistoryList;

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

	public List<BackupJob> getBackupJobList() {
		return this.backupJobList;
	}

	public void setBackupJobList(List<BackupJob> backupJobList) {
		this.backupJobList = backupJobList;
	}

	public List<BackupHistory> getBackupHistoryList() {
		return this.backupHistoryList;
	}

	public void setBackupHistoryList(List<BackupHistory> backupHistoryList) {
		this.backupHistoryList = backupHistoryList;
	}

	public List<RestoreJob> getRestoreJobList() {
		return this.restoreJobList;
	}

	public void setRestoreJobList(List<RestoreJob> restoreJobList) {
		this.restoreJobList = restoreJobList;
	}

	public List<RestoreHistory> getRestoreHistoryList() {
		return this.restoreHistoryList;
	}

	public void setRestoreHistoryList(List<RestoreHistory> restoreHistoryList) {
		this.restoreHistoryList = restoreHistoryList;
	}

	public static class BackupJob {

		private String applianceId;

		private String jobName;

		private String jobId;

		private String status;

		private String module;

		private String hostId;

		private String resourceId;

		private String schedule;

		private String source;

		private Long createdTime;

		private Long updatedTime;

		private String storageId;

		private String backupType;

		public String getApplianceId() {
			return this.applianceId;
		}

		public void setApplianceId(String applianceId) {
			this.applianceId = applianceId;
		}

		public String getJobName() {
			return this.jobName;
		}

		public void setJobName(String jobName) {
			this.jobName = jobName;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getModule() {
			return this.module;
		}

		public void setModule(String module) {
			this.module = module;
		}

		public String getHostId() {
			return this.hostId;
		}

		public void setHostId(String hostId) {
			this.hostId = hostId;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getSchedule() {
			return this.schedule;
		}

		public void setSchedule(String schedule) {
			this.schedule = schedule;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
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

		public String getStorageId() {
			return this.storageId;
		}

		public void setStorageId(String storageId) {
			this.storageId = storageId;
		}

		public String getBackupType() {
			return this.backupType;
		}

		public void setBackupType(String backupType) {
			this.backupType = backupType;
		}
	}

	public static class BackupHistory {

		private String tenantName;

		private String jobName;

		private String historyId;

		private String jobId;

		private String status;

		private String module;

		private String hostId;

		private Long createdTime;

		private Long updatedTime;

		private String resourceId;

		private String source;

		private String storageId;

		private Long startTime;

		private Long completeTime;

		private Long originSize;

		private Long storageSize;

		public String getTenantName() {
			return this.tenantName;
		}

		public void setTenantName(String tenantName) {
			this.tenantName = tenantName;
		}

		public String getJobName() {
			return this.jobName;
		}

		public void setJobName(String jobName) {
			this.jobName = jobName;
		}

		public String getHistoryId() {
			return this.historyId;
		}

		public void setHistoryId(String historyId) {
			this.historyId = historyId;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getModule() {
			return this.module;
		}

		public void setModule(String module) {
			this.module = module;
		}

		public String getHostId() {
			return this.hostId;
		}

		public void setHostId(String hostId) {
			this.hostId = hostId;
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

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getStorageId() {
			return this.storageId;
		}

		public void setStorageId(String storageId) {
			this.storageId = storageId;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getCompleteTime() {
			return this.completeTime;
		}

		public void setCompleteTime(Long completeTime) {
			this.completeTime = completeTime;
		}

		public Long getOriginSize() {
			return this.originSize;
		}

		public void setOriginSize(Long originSize) {
			this.originSize = originSize;
		}

		public Long getStorageSize() {
			return this.storageSize;
		}

		public void setStorageSize(Long storageSize) {
			this.storageSize = storageSize;
		}
	}

	public static class RestoreJob {

		private String tenantName;

		private String jobName;

		private String jobId;

		private String status;

		private String module;

		private String hostId;

		private String resourceId;

		private String schedule;

		private Long createdTime;

		private Long updatedTime;

		private String source;

		private String storageId;

		private String restoreType;

		public String getTenantName() {
			return this.tenantName;
		}

		public void setTenantName(String tenantName) {
			this.tenantName = tenantName;
		}

		public String getJobName() {
			return this.jobName;
		}

		public void setJobName(String jobName) {
			this.jobName = jobName;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getModule() {
			return this.module;
		}

		public void setModule(String module) {
			this.module = module;
		}

		public String getHostId() {
			return this.hostId;
		}

		public void setHostId(String hostId) {
			this.hostId = hostId;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getSchedule() {
			return this.schedule;
		}

		public void setSchedule(String schedule) {
			this.schedule = schedule;
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

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getStorageId() {
			return this.storageId;
		}

		public void setStorageId(String storageId) {
			this.storageId = storageId;
		}

		public String getRestoreType() {
			return this.restoreType;
		}

		public void setRestoreType(String restoreType) {
			this.restoreType = restoreType;
		}
	}

	public static class RestoreHistory {

		private String tenantName;

		private String jobName;

		private String historyId;

		private String jobId;

		private String module;

		private String hostId;

		private String resourceId;

		private String source;

		private String target;

		private Long startTime;

		private Long completeTime;

		private Long restoredSize;

		private Long createdTime;

		private Long updatedTime;

		private String status;

		public String getTenantName() {
			return this.tenantName;
		}

		public void setTenantName(String tenantName) {
			this.tenantName = tenantName;
		}

		public String getJobName() {
			return this.jobName;
		}

		public void setJobName(String jobName) {
			this.jobName = jobName;
		}

		public String getHistoryId() {
			return this.historyId;
		}

		public void setHistoryId(String historyId) {
			this.historyId = historyId;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getModule() {
			return this.module;
		}

		public void setModule(String module) {
			this.module = module;
		}

		public String getHostId() {
			return this.hostId;
		}

		public void setHostId(String hostId) {
			this.hostId = hostId;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getTarget() {
			return this.target;
		}

		public void setTarget(String target) {
			this.target = target;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getCompleteTime() {
			return this.completeTime;
		}

		public void setCompleteTime(Long completeTime) {
			this.completeTime = completeTime;
		}

		public Long getRestoredSize() {
			return this.restoredSize;
		}

		public void setRestoredSize(Long restoredSize) {
			this.restoredSize = restoredSize;
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

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public DescribeApplianceDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeApplianceDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
