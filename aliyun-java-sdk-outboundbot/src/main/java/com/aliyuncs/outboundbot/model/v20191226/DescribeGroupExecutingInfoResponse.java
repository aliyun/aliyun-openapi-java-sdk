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

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private String groupId;

	private String instanceId;

	private ExecutingInfo executingInfo;

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

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
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

		private Long startTime;

		private Long endTime;

		private Integer callFailedNum;

		private Integer callNum;

		private String creatorName;

		private Integer finishedNum;

		private Integer hangUpByClientNum;

		private Integer transferByIntentNum;

		private Integer transferByNoAnswer;

		private JobsProgress jobsProgress;

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Integer getCallFailedNum() {
			return this.callFailedNum;
		}

		public void setCallFailedNum(Integer callFailedNum) {
			this.callFailedNum = callFailedNum;
		}

		public Integer getCallNum() {
			return this.callNum;
		}

		public void setCallNum(Integer callNum) {
			this.callNum = callNum;
		}

		public String getCreatorName() {
			return this.creatorName;
		}

		public void setCreatorName(String creatorName) {
			this.creatorName = creatorName;
		}

		public Integer getFinishedNum() {
			return this.finishedNum;
		}

		public void setFinishedNum(Integer finishedNum) {
			this.finishedNum = finishedNum;
		}

		public Integer getHangUpByClientNum() {
			return this.hangUpByClientNum;
		}

		public void setHangUpByClientNum(Integer hangUpByClientNum) {
			this.hangUpByClientNum = hangUpByClientNum;
		}

		public Integer getTransferByIntentNum() {
			return this.transferByIntentNum;
		}

		public void setTransferByIntentNum(Integer transferByIntentNum) {
			this.transferByIntentNum = transferByIntentNum;
		}

		public Integer getTransferByNoAnswer() {
			return this.transferByNoAnswer;
		}

		public void setTransferByNoAnswer(Integer transferByNoAnswer) {
			this.transferByNoAnswer = transferByNoAnswer;
		}

		public JobsProgress getJobsProgress() {
			return this.jobsProgress;
		}

		public void setJobsProgress(JobsProgress jobsProgress) {
			this.jobsProgress = jobsProgress;
		}

		public static class JobsProgress {

			private Integer totalJobs;

			private Integer totalCompletedNum;

			private Integer failedNum;

			private Integer cancelledNum;

			private Integer totalNotAnsweredNum;

			private Integer executingNum;

			private Integer pausedNum;

			private Integer schedulingNum;

			public Integer getTotalJobs() {
				return this.totalJobs;
			}

			public void setTotalJobs(Integer totalJobs) {
				this.totalJobs = totalJobs;
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

			public Integer getCancelledNum() {
				return this.cancelledNum;
			}

			public void setCancelledNum(Integer cancelledNum) {
				this.cancelledNum = cancelledNum;
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

			public Integer getPausedNum() {
				return this.pausedNum;
			}

			public void setPausedNum(Integer pausedNum) {
				this.pausedNum = pausedNum;
			}

			public Integer getSchedulingNum() {
				return this.schedulingNum;
			}

			public void setSchedulingNum(Integer schedulingNum) {
				this.schedulingNum = schedulingNum;
			}
		}
	}

	@Override
	public DescribeGroupExecutingInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeGroupExecutingInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
