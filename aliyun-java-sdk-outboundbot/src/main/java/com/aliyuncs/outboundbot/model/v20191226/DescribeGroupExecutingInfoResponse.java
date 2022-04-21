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

package com.aliyuncs.outboundbot.model.v20191226;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.DescribeGroupExecutingInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGroupExecutingInfoResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String requestId;

	private String groupId;

	private Boolean success;

	private String code;

	private String message;

	private String instanceId;

	private ExecutingInfo executingInfo;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public ExecutingInfo getExecutingInfo() {
		return this.executingInfo;
	}

	public void setExecutingInfo(ExecutingInfo executingInfo) {
		this.executingInfo = executingInfo;
	}

	public static class ExecutingInfo {

		private Long endTime;

		private Long startTime;

		private Integer hangUpByClientNum;

		private String creatorName;

		private Integer transferByNoAnswer;

		private Integer finishedNum;

		private Integer transferByIntentNum;

		private Integer callNum;

		private Integer callFailedNum;

		private JobsProgress jobsProgress;

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Integer getHangUpByClientNum() {
			return this.hangUpByClientNum;
		}

		public void setHangUpByClientNum(Integer hangUpByClientNum) {
			this.hangUpByClientNum = hangUpByClientNum;
		}

		public String getCreatorName() {
			return this.creatorName;
		}

		public void setCreatorName(String creatorName) {
			this.creatorName = creatorName;
		}

		public Integer getTransferByNoAnswer() {
			return this.transferByNoAnswer;
		}

		public void setTransferByNoAnswer(Integer transferByNoAnswer) {
			this.transferByNoAnswer = transferByNoAnswer;
		}

		public Integer getFinishedNum() {
			return this.finishedNum;
		}

		public void setFinishedNum(Integer finishedNum) {
			this.finishedNum = finishedNum;
		}

		public Integer getTransferByIntentNum() {
			return this.transferByIntentNum;
		}

		public void setTransferByIntentNum(Integer transferByIntentNum) {
			this.transferByIntentNum = transferByIntentNum;
		}

		public Integer getCallNum() {
			return this.callNum;
		}

		public void setCallNum(Integer callNum) {
			this.callNum = callNum;
		}

		public Integer getCallFailedNum() {
			return this.callFailedNum;
		}

		public void setCallFailedNum(Integer callFailedNum) {
			this.callFailedNum = callFailedNum;
		}

		public JobsProgress getJobsProgress() {
			return this.jobsProgress;
		}

		public void setJobsProgress(JobsProgress jobsProgress) {
			this.jobsProgress = jobsProgress;
		}

		public static class JobsProgress {

			private Integer schedulingNum;

			private Integer totalCompletedNum;

			private Integer failedNum;

			private Integer pausedNum;

			private Integer cancelledNum;

			private Integer totalJobs;

			private Integer totalNotAnsweredNum;

			private Integer executingNum;

			public Integer getSchedulingNum() {
				return this.schedulingNum;
			}

			public void setSchedulingNum(Integer schedulingNum) {
				this.schedulingNum = schedulingNum;
			}

			public Integer getTotalCompletedNum() {
				return this.totalCompletedNum;
			}

			public void setTotalCompletedNum(Integer totalCompletedNum) {
				this.totalCompletedNum = totalCompletedNum;
			}

			public Integer getFailedNum() {
				return this.failedNum;
			}

			public void setFailedNum(Integer failedNum) {
				this.failedNum = failedNum;
			}

			public Integer getPausedNum() {
				return this.pausedNum;
			}

			public void setPausedNum(Integer pausedNum) {
				this.pausedNum = pausedNum;
			}

			public Integer getCancelledNum() {
				return this.cancelledNum;
			}

			public void setCancelledNum(Integer cancelledNum) {
				this.cancelledNum = cancelledNum;
			}

			public Integer getTotalJobs() {
				return this.totalJobs;
			}

			public void setTotalJobs(Integer totalJobs) {
				this.totalJobs = totalJobs;
			}

			public Integer getTotalNotAnsweredNum() {
				return this.totalNotAnsweredNum;
			}

			public void setTotalNotAnsweredNum(Integer totalNotAnsweredNum) {
				this.totalNotAnsweredNum = totalNotAnsweredNum;
			}

			public Integer getExecutingNum() {
				return this.executingNum;
			}

			public void setExecutingNum(Integer executingNum) {
				this.executingNum = executingNum;
			}
		}
	}

	@Override
	public DescribeGroupExecutingInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeGroupExecutingInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
