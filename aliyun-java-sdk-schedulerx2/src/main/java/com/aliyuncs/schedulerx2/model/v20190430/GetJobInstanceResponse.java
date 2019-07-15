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

package com.aliyuncs.schedulerx2.model.v20190430;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.schedulerx2.transform.v20190430.GetJobInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetJobInstanceResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private JobInstanceDetail jobInstanceDetail;

		public JobInstanceDetail getJobInstanceDetail() {
			return this.jobInstanceDetail;
		}

		public void setJobInstanceDetail(JobInstanceDetail jobInstanceDetail) {
			this.jobInstanceDetail = jobInstanceDetail;
		}

		public static class JobInstanceDetail {

			private Long instanceId;

			private Long jobId;

			private Integer status;

			private String startTime;

			private String endTime;

			private String scheduleTime;

			private String dataTime;

			private String executor;

			private String workAddr;

			private String result;

			private String progress;

			private Integer timeType;

			private Integer triggerType;

			public Long getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(Long instanceId) {
				this.instanceId = instanceId;
			}

			public Long getJobId() {
				return this.jobId;
			}

			public void setJobId(Long jobId) {
				this.jobId = jobId;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

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

			public String getScheduleTime() {
				return this.scheduleTime;
			}

			public void setScheduleTime(String scheduleTime) {
				this.scheduleTime = scheduleTime;
			}

			public String getDataTime() {
				return this.dataTime;
			}

			public void setDataTime(String dataTime) {
				this.dataTime = dataTime;
			}

			public String getExecutor() {
				return this.executor;
			}

			public void setExecutor(String executor) {
				this.executor = executor;
			}

			public String getWorkAddr() {
				return this.workAddr;
			}

			public void setWorkAddr(String workAddr) {
				this.workAddr = workAddr;
			}

			public String getResult() {
				return this.result;
			}

			public void setResult(String result) {
				this.result = result;
			}

			public String getProgress() {
				return this.progress;
			}

			public void setProgress(String progress) {
				this.progress = progress;
			}

			public Integer getTimeType() {
				return this.timeType;
			}

			public void setTimeType(Integer timeType) {
				this.timeType = timeType;
			}

			public Integer getTriggerType() {
				return this.triggerType;
			}

			public void setTriggerType(Integer triggerType) {
				this.triggerType = triggerType;
			}
		}
	}

	@Override
	public GetJobInstanceResponse getInstance(UnmarshallerContext context) {
		return	GetJobInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
