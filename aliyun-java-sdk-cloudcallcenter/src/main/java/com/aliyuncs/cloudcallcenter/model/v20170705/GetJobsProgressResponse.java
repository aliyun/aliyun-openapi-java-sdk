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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.GetJobsProgressResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetJobsProgressResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private JobsProgress jobsProgress;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public JobsProgress getJobsProgress() {
		return this.jobsProgress;
	}

	public void setJobsProgress(JobsProgress jobsProgress) {
		this.jobsProgress = jobsProgress;
	}

	public static class JobsProgress {

		private String status;

		private Long startTime;

		private Integer duration;

		private Integer totalJobs;

		private Integer totalNotAnswered;

		private Integer totalCompleted;

		private Integer scheduling;

		private Integer executing;

		private Integer paused;

		private Integer failed;

		private Integer cancelled;

		private Integer repeatCall;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Integer getDuration() {
			return this.duration;
		}

		public void setDuration(Integer duration) {
			this.duration = duration;
		}

		public Integer getTotalJobs() {
			return this.totalJobs;
		}

		public void setTotalJobs(Integer totalJobs) {
			this.totalJobs = totalJobs;
		}

		public Integer getTotalNotAnswered() {
			return this.totalNotAnswered;
		}

		public void setTotalNotAnswered(Integer totalNotAnswered) {
			this.totalNotAnswered = totalNotAnswered;
		}

		public Integer getTotalCompleted() {
			return this.totalCompleted;
		}

		public void setTotalCompleted(Integer totalCompleted) {
			this.totalCompleted = totalCompleted;
		}

		public Integer getScheduling() {
			return this.scheduling;
		}

		public void setScheduling(Integer scheduling) {
			this.scheduling = scheduling;
		}

		public Integer getExecuting() {
			return this.executing;
		}

		public void setExecuting(Integer executing) {
			this.executing = executing;
		}

		public Integer getPaused() {
			return this.paused;
		}

		public void setPaused(Integer paused) {
			this.paused = paused;
		}

		public Integer getFailed() {
			return this.failed;
		}

		public void setFailed(Integer failed) {
			this.failed = failed;
		}

		public Integer getCancelled() {
			return this.cancelled;
		}

		public void setCancelled(Integer cancelled) {
			this.cancelled = cancelled;
		}

		public Integer getRepeatCall() {
			return this.repeatCall;
		}

		public void setRepeatCall(Integer repeatCall) {
			this.repeatCall = repeatCall;
		}
	}

	@Override
	public GetJobsProgressResponse getInstance(UnmarshallerContext context) {
		return	GetJobsProgressResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
