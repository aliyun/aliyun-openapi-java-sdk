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

package com.aliyuncs.vcs.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.DescribeWatchTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWatchTasksResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long totalCount;

		private Long pageSize;

		private Long pageNumber;

		private List<Record> records;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Long pageNumber) {
			this.pageNumber = pageNumber;
		}

		public List<Record> getRecords() {
			return this.records;
		}

		public void setRecords(List<Record> records) {
			this.records = records;
		}

		public static class Record {

			private String watchTaskId;

			private String taskName;

			private String corpId;

			private String deviceList;

			private String scheduleType;

			private String scheduleCycleDates;

			private String scheduleTimes;

			private String watchPolicyIds;

			private String messageReceiver;

			private String description;

			public String getWatchTaskId() {
				return this.watchTaskId;
			}

			public void setWatchTaskId(String watchTaskId) {
				this.watchTaskId = watchTaskId;
			}

			public String getTaskName() {
				return this.taskName;
			}

			public void setTaskName(String taskName) {
				this.taskName = taskName;
			}

			public String getCorpId() {
				return this.corpId;
			}

			public void setCorpId(String corpId) {
				this.corpId = corpId;
			}

			public String getDeviceList() {
				return this.deviceList;
			}

			public void setDeviceList(String deviceList) {
				this.deviceList = deviceList;
			}

			public String getScheduleType() {
				return this.scheduleType;
			}

			public void setScheduleType(String scheduleType) {
				this.scheduleType = scheduleType;
			}

			public String getScheduleCycleDates() {
				return this.scheduleCycleDates;
			}

			public void setScheduleCycleDates(String scheduleCycleDates) {
				this.scheduleCycleDates = scheduleCycleDates;
			}

			public String getScheduleTimes() {
				return this.scheduleTimes;
			}

			public void setScheduleTimes(String scheduleTimes) {
				this.scheduleTimes = scheduleTimes;
			}

			public String getWatchPolicyIds() {
				return this.watchPolicyIds;
			}

			public void setWatchPolicyIds(String watchPolicyIds) {
				this.watchPolicyIds = watchPolicyIds;
			}

			public String getMessageReceiver() {
				return this.messageReceiver;
			}

			public void setMessageReceiver(String messageReceiver) {
				this.messageReceiver = messageReceiver;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}
	}

	@Override
	public DescribeWatchTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeWatchTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
