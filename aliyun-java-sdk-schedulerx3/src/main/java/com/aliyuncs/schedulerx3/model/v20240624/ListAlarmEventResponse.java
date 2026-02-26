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
import com.aliyuncs.schedulerx3.transform.v20240624.ListAlarmEventResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAlarmEventResponse extends AcsResponse {

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

		private Integer pageNumber;

		private Integer pageSize;

		private Long total;

		private List<Record> records;

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

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<Record> getRecords() {
			return this.records;
		}

		public void setRecords(List<Record> records) {
			this.records = records;
		}

		public static class Record {

			private String appName;

			private String jobName;

			private String alarmType;

			private String alarmChannel;

			private String alarmContacts;

			private String alarmStatus;

			private String alarmMessage;

			private String time;

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getJobName() {
				return this.jobName;
			}

			public void setJobName(String jobName) {
				this.jobName = jobName;
			}

			public String getAlarmType() {
				return this.alarmType;
			}

			public void setAlarmType(String alarmType) {
				this.alarmType = alarmType;
			}

			public String getAlarmChannel() {
				return this.alarmChannel;
			}

			public void setAlarmChannel(String alarmChannel) {
				this.alarmChannel = alarmChannel;
			}

			public String getAlarmContacts() {
				return this.alarmContacts;
			}

			public void setAlarmContacts(String alarmContacts) {
				this.alarmContacts = alarmContacts;
			}

			public String getAlarmStatus() {
				return this.alarmStatus;
			}

			public void setAlarmStatus(String alarmStatus) {
				this.alarmStatus = alarmStatus;
			}

			public String getAlarmMessage() {
				return this.alarmMessage;
			}

			public void setAlarmMessage(String alarmMessage) {
				this.alarmMessage = alarmMessage;
			}

			public String getTime() {
				return this.time;
			}

			public void setTime(String time) {
				this.time = time;
			}
		}
	}

	@Override
	public ListAlarmEventResponse getInstance(UnmarshallerContext context) {
		return	ListAlarmEventResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
