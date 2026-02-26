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
import com.aliyuncs.schedulerx3.transform.v20240624.ListJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListJobsResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

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

			private Long jobId;

			private String name;

			private String description;

			private String jobType;

			private Integer status;

			private String parameters;

			private Integer maxConcurrency;

			private Integer maxAttempt;

			private Integer attemptInterval;

			private String jobHandler;

			private Integer priority;

			private Integer timeType;

			private String timeExpression;

			private String timeZone;

			private String calendar;

			private Integer dataOffset;

			private String cleanMode;

			private String creator;

			private String updater;

			private String xattrs;

			private String noticeConfig;

			private String noticeContacts;

			private Integer routeStrategy;

			private String appName;

			private Long startTime;

			private String timezone;

			private String executorBlockStrategy;

			private String lastExecuteEndTime;

			private Integer lastExecuteStatus;

			private Integer currentExecuteStatus;

			public Long getJobId() {
				return this.jobId;
			}

			public void setJobId(Long jobId) {
				this.jobId = jobId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getJobType() {
				return this.jobType;
			}

			public void setJobType(String jobType) {
				this.jobType = jobType;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getParameters() {
				return this.parameters;
			}

			public void setParameters(String parameters) {
				this.parameters = parameters;
			}

			public Integer getMaxConcurrency() {
				return this.maxConcurrency;
			}

			public void setMaxConcurrency(Integer maxConcurrency) {
				this.maxConcurrency = maxConcurrency;
			}

			public Integer getMaxAttempt() {
				return this.maxAttempt;
			}

			public void setMaxAttempt(Integer maxAttempt) {
				this.maxAttempt = maxAttempt;
			}

			public Integer getAttemptInterval() {
				return this.attemptInterval;
			}

			public void setAttemptInterval(Integer attemptInterval) {
				this.attemptInterval = attemptInterval;
			}

			public String getJobHandler() {
				return this.jobHandler;
			}

			public void setJobHandler(String jobHandler) {
				this.jobHandler = jobHandler;
			}

			public Integer getPriority() {
				return this.priority;
			}

			public void setPriority(Integer priority) {
				this.priority = priority;
			}

			public Integer getTimeType() {
				return this.timeType;
			}

			public void setTimeType(Integer timeType) {
				this.timeType = timeType;
			}

			public String getTimeExpression() {
				return this.timeExpression;
			}

			public void setTimeExpression(String timeExpression) {
				this.timeExpression = timeExpression;
			}

			public String getTimeZone() {
				return this.timeZone;
			}

			public void setTimeZone(String timeZone) {
				this.timeZone = timeZone;
			}

			public String getCalendar() {
				return this.calendar;
			}

			public void setCalendar(String calendar) {
				this.calendar = calendar;
			}

			public Integer getDataOffset() {
				return this.dataOffset;
			}

			public void setDataOffset(Integer dataOffset) {
				this.dataOffset = dataOffset;
			}

			public String getCleanMode() {
				return this.cleanMode;
			}

			public void setCleanMode(String cleanMode) {
				this.cleanMode = cleanMode;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getUpdater() {
				return this.updater;
			}

			public void setUpdater(String updater) {
				this.updater = updater;
			}

			public String getXattrs() {
				return this.xattrs;
			}

			public void setXattrs(String xattrs) {
				this.xattrs = xattrs;
			}

			public String getNoticeConfig() {
				return this.noticeConfig;
			}

			public void setNoticeConfig(String noticeConfig) {
				this.noticeConfig = noticeConfig;
			}

			public String getNoticeContacts() {
				return this.noticeContacts;
			}

			public void setNoticeContacts(String noticeContacts) {
				this.noticeContacts = noticeContacts;
			}

			public Integer getRouteStrategy() {
				return this.routeStrategy;
			}

			public void setRouteStrategy(Integer routeStrategy) {
				this.routeStrategy = routeStrategy;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public String getTimezone() {
				return this.timezone;
			}

			public void setTimezone(String timezone) {
				this.timezone = timezone;
			}

			public String getExecutorBlockStrategy() {
				return this.executorBlockStrategy;
			}

			public void setExecutorBlockStrategy(String executorBlockStrategy) {
				this.executorBlockStrategy = executorBlockStrategy;
			}

			public String getLastExecuteEndTime() {
				return this.lastExecuteEndTime;
			}

			public void setLastExecuteEndTime(String lastExecuteEndTime) {
				this.lastExecuteEndTime = lastExecuteEndTime;
			}

			public Integer getLastExecuteStatus() {
				return this.lastExecuteStatus;
			}

			public void setLastExecuteStatus(Integer lastExecuteStatus) {
				this.lastExecuteStatus = lastExecuteStatus;
			}

			public Integer getCurrentExecuteStatus() {
				return this.currentExecuteStatus;
			}

			public void setCurrentExecuteStatus(Integer currentExecuteStatus) {
				this.currentExecuteStatus = currentExecuteStatus;
			}
		}
	}

	@Override
	public ListJobsResponse getInstance(UnmarshallerContext context) {
		return	ListJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
