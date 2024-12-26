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
import com.aliyuncs.schedulerx3.transform.v20240624.ListAppsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAppsResponse extends AcsResponse {

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

			private Long id;

			private String appName;

			private String accessToken;

			private String title;

			private String creator;

			private String updater;

			private String leader;

			private String calendar;

			private Integer maxJobs;

			private Integer maxConcurrency;

			private String noticeConfig;

			private String noticeContacts;

			private Integer jobNum;

			private Long executorNum;

			private Boolean enableLog;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getAccessToken() {
				return this.accessToken;
			}

			public void setAccessToken(String accessToken) {
				this.accessToken = accessToken;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
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

			public String getLeader() {
				return this.leader;
			}

			public void setLeader(String leader) {
				this.leader = leader;
			}

			public String getCalendar() {
				return this.calendar;
			}

			public void setCalendar(String calendar) {
				this.calendar = calendar;
			}

			public Integer getMaxJobs() {
				return this.maxJobs;
			}

			public void setMaxJobs(Integer maxJobs) {
				this.maxJobs = maxJobs;
			}

			public Integer getMaxConcurrency() {
				return this.maxConcurrency;
			}

			public void setMaxConcurrency(Integer maxConcurrency) {
				this.maxConcurrency = maxConcurrency;
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

			public Integer getJobNum() {
				return this.jobNum;
			}

			public void setJobNum(Integer jobNum) {
				this.jobNum = jobNum;
			}

			public Long getExecutorNum() {
				return this.executorNum;
			}

			public void setExecutorNum(Long executorNum) {
				this.executorNum = executorNum;
			}

			public Boolean getEnableLog() {
				return this.enableLog;
			}

			public void setEnableLog(Boolean enableLog) {
				this.enableLog = enableLog;
			}
		}
	}

	@Override
	public ListAppsResponse getInstance(UnmarshallerContext context) {
		return	ListAppsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
