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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.GetOnlineDDLProgressResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOnlineDDLProgressResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private OnlineDDLTaskDetail onlineDDLTaskDetail;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public OnlineDDLTaskDetail getOnlineDDLTaskDetail() {
		return this.onlineDDLTaskDetail;
	}

	public void setOnlineDDLTaskDetail(OnlineDDLTaskDetail onlineDDLTaskDetail) {
		this.onlineDDLTaskDetail = onlineDDLTaskDetail;
	}

	public static class OnlineDDLTaskDetail {

		private String jobStatus;

		private String statusDesc;

		private Long delaySeconds;

		private Long copyTotal;

		private Long copyCount;

		private String progressRatio;

		private Long cutoverLockTimeSeconds;

		private Long cutoverFailRetryTimes;

		private String cleanStrategy;

		private Long copyChunkSize;

		private String copyChunkMode;

		private String cutoverWindowStartTime;

		private String cutoverWindowEndTime;

		public String getJobStatus() {
			return this.jobStatus;
		}

		public void setJobStatus(String jobStatus) {
			this.jobStatus = jobStatus;
		}

		public String getStatusDesc() {
			return this.statusDesc;
		}

		public void setStatusDesc(String statusDesc) {
			this.statusDesc = statusDesc;
		}

		public Long getDelaySeconds() {
			return this.delaySeconds;
		}

		public void setDelaySeconds(Long delaySeconds) {
			this.delaySeconds = delaySeconds;
		}

		public Long getCopyTotal() {
			return this.copyTotal;
		}

		public void setCopyTotal(Long copyTotal) {
			this.copyTotal = copyTotal;
		}

		public Long getCopyCount() {
			return this.copyCount;
		}

		public void setCopyCount(Long copyCount) {
			this.copyCount = copyCount;
		}

		public String getProgressRatio() {
			return this.progressRatio;
		}

		public void setProgressRatio(String progressRatio) {
			this.progressRatio = progressRatio;
		}

		public Long getCutoverLockTimeSeconds() {
			return this.cutoverLockTimeSeconds;
		}

		public void setCutoverLockTimeSeconds(Long cutoverLockTimeSeconds) {
			this.cutoverLockTimeSeconds = cutoverLockTimeSeconds;
		}

		public Long getCutoverFailRetryTimes() {
			return this.cutoverFailRetryTimes;
		}

		public void setCutoverFailRetryTimes(Long cutoverFailRetryTimes) {
			this.cutoverFailRetryTimes = cutoverFailRetryTimes;
		}

		public String getCleanStrategy() {
			return this.cleanStrategy;
		}

		public void setCleanStrategy(String cleanStrategy) {
			this.cleanStrategy = cleanStrategy;
		}

		public Long getCopyChunkSize() {
			return this.copyChunkSize;
		}

		public void setCopyChunkSize(Long copyChunkSize) {
			this.copyChunkSize = copyChunkSize;
		}

		public String getCopyChunkMode() {
			return this.copyChunkMode;
		}

		public void setCopyChunkMode(String copyChunkMode) {
			this.copyChunkMode = copyChunkMode;
		}

		public String getCutoverWindowStartTime() {
			return this.cutoverWindowStartTime;
		}

		public void setCutoverWindowStartTime(String cutoverWindowStartTime) {
			this.cutoverWindowStartTime = cutoverWindowStartTime;
		}

		public String getCutoverWindowEndTime() {
			return this.cutoverWindowEndTime;
		}

		public void setCutoverWindowEndTime(String cutoverWindowEndTime) {
			this.cutoverWindowEndTime = cutoverWindowEndTime;
		}
	}

	@Override
	public GetOnlineDDLProgressResponse getInstance(UnmarshallerContext context) {
		return	GetOnlineDDLProgressResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
