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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeRestoreJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRestoreJobsResponse extends AcsResponse {

	private String requestId;

	private List<RestoreJob> restoreJobs;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RestoreJob> getRestoreJobs() {
		return this.restoreJobs;
	}

	public void setRestoreJobs(List<RestoreJob> restoreJobs) {
		this.restoreJobs = restoreJobs;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class RestoreJob {

		private String status;

		private String snapshotHash;

		private String sourceClientId;

		private String errorFileUrl;

		private String includes;

		private String restoreName;

		private String internetIp;

		private String vaultId;

		private Long actualBytes;

		private String message;

		private Integer percentage;

		private String gmtModified;

		private String restoreType;

		private String exitCode;

		private String clientId;

		private Long itemsDone;

		private Long bytesTotal;

		private String requestId;

		private String instanceName;

		private Long completeTime;

		private String errorType;

		private String snapshotVersion;

		private String target;

		private Long createdTime;

		private String instanceId;

		private String source;

		private String intranetIp;

		private String errorFile;

		private String uuid;

		private String excludes;

		private Long speed;

		private String snapshotId;

		private Long updatedTime;

		private String restoreId;

		private String gmtCreate;

		private Long eta;

		private Long duration;

		private Long errorCount;

		private Long itemsTotal;

		private Long bytesDone;

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

		public String getSourceClientId() {
			return this.sourceClientId;
		}

		public void setSourceClientId(String sourceClientId) {
			this.sourceClientId = sourceClientId;
		}

		public String getErrorFileUrl() {
			return this.errorFileUrl;
		}

		public void setErrorFileUrl(String errorFileUrl) {
			this.errorFileUrl = errorFileUrl;
		}

		public String getIncludes() {
			return this.includes;
		}

		public void setIncludes(String includes) {
			this.includes = includes;
		}

		public String getRestoreName() {
			return this.restoreName;
		}

		public void setRestoreName(String restoreName) {
			this.restoreName = restoreName;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
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

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Integer getPercentage() {
			return this.percentage;
		}

		public void setPercentage(Integer percentage) {
			this.percentage = percentage;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getRestoreType() {
			return this.restoreType;
		}

		public void setRestoreType(String restoreType) {
			this.restoreType = restoreType;
		}

		public String getExitCode() {
			return this.exitCode;
		}

		public void setExitCode(String exitCode) {
			this.exitCode = exitCode;
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

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public Long getCompleteTime() {
			return this.completeTime;
		}

		public void setCompleteTime(Long completeTime) {
			this.completeTime = completeTime;
		}

		public String getErrorType() {
			return this.errorType;
		}

		public void setErrorType(String errorType) {
			this.errorType = errorType;
		}

		public String getSnapshotVersion() {
			return this.snapshotVersion;
		}

		public void setSnapshotVersion(String snapshotVersion) {
			this.snapshotVersion = snapshotVersion;
		}

		public String getTarget() {
			return this.target;
		}

		public void setTarget(String target) {
			this.target = target;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public String getErrorFile() {
			return this.errorFile;
		}

		public void setErrorFile(String errorFile) {
			this.errorFile = errorFile;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getExcludes() {
			return this.excludes;
		}

		public void setExcludes(String excludes) {
			this.excludes = excludes;
		}

		public Long getSpeed() {
			return this.speed;
		}

		public void setSpeed(Long speed) {
			this.speed = speed;
		}

		public String getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(String snapshotId) {
			this.snapshotId = snapshotId;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}

		public String getRestoreId() {
			return this.restoreId;
		}

		public void setRestoreId(String restoreId) {
			this.restoreId = restoreId;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getEta() {
			return this.eta;
		}

		public void setEta(Long eta) {
			this.eta = eta;
		}

		public Long getDuration() {
			return this.duration;
		}

		public void setDuration(Long duration) {
			this.duration = duration;
		}

		public Long getErrorCount() {
			return this.errorCount;
		}

		public void setErrorCount(Long errorCount) {
			this.errorCount = errorCount;
		}

		public Long getItemsTotal() {
			return this.itemsTotal;
		}

		public void setItemsTotal(Long itemsTotal) {
			this.itemsTotal = itemsTotal;
		}

		public Long getBytesDone() {
			return this.bytesDone;
		}

		public void setBytesDone(Long bytesDone) {
			this.bytesDone = bytesDone;
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
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

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public DescribeRestoreJobsResponse getInstance(UnmarshallerContext context) {
		return	DescribeRestoreJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
