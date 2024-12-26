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

package com.aliyuncs.schedulerx3.model.v20240624;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.schedulerx3.transform.v20240624.ListJobExecutionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListJobExecutionsResponse extends AcsResponse {

	private Integer code;

	private String requestId;

	private String message;

	private Boolean success;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

		private Integer total;

		private Integer pageNumber;

		private Integer pageSize;

		private List<Record> records;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
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

		public List<Record> getRecords() {
			return this.records;
		}

		public void setRecords(List<Record> records) {
			this.records = records;
		}

		public static class Record {

			private String jobExecutionId;

			private Long jobId;

			private String jobName;

			private String jobType;

			private String parameters;

			private String scheduleTime;

			private String dataTime;

			private String startTime;

			private String endTime;

			private Long duration;

			private String executor;

			private String result;

			private Integer status;

			private Integer timeType;

			private Integer attempt;

			private String workAddr;

			private String appName;

			private Integer routeStrategy;

			private String serverIp;

			private Integer triggerType;

			public String getJobExecutionId() {
				return this.jobExecutionId;
			}

			public void setJobExecutionId(String jobExecutionId) {
				this.jobExecutionId = jobExecutionId;
			}

			public Long getJobId() {
				return this.jobId;
			}

			public void setJobId(Long jobId) {
				this.jobId = jobId;
			}

			public String getJobName() {
				return this.jobName;
			}

			public void setJobName(String jobName) {
				this.jobName = jobName;
			}

			public String getJobType() {
				return this.jobType;
			}

			public void setJobType(String jobType) {
				this.jobType = jobType;
			}

			public String getParameters() {
				return this.parameters;
			}

			public void setParameters(String parameters) {
				this.parameters = parameters;
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

			public Long getDuration() {
				return this.duration;
			}

			public void setDuration(Long duration) {
				this.duration = duration;
			}

			public String getExecutor() {
				return this.executor;
			}

			public void setExecutor(String executor) {
				this.executor = executor;
			}

			public String getResult() {
				return this.result;
			}

			public void setResult(String result) {
				this.result = result;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Integer getTimeType() {
				return this.timeType;
			}

			public void setTimeType(Integer timeType) {
				this.timeType = timeType;
			}

			public Integer getAttempt() {
				return this.attempt;
			}

			public void setAttempt(Integer attempt) {
				this.attempt = attempt;
			}

			public String getWorkAddr() {
				return this.workAddr;
			}

			public void setWorkAddr(String workAddr) {
				this.workAddr = workAddr;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public Integer getRouteStrategy() {
				return this.routeStrategy;
			}

			public void setRouteStrategy(Integer routeStrategy) {
				this.routeStrategy = routeStrategy;
			}

			public String getServerIp() {
				return this.serverIp;
			}

			public void setServerIp(String serverIp) {
				this.serverIp = serverIp;
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
	public ListJobExecutionsResponse getInstance(UnmarshallerContext context) {
		return	ListJobExecutionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
