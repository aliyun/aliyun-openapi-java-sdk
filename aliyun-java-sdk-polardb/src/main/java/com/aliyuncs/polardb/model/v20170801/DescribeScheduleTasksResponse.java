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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeScheduleTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScheduleTasksResponse extends AcsResponse {

	private String message;

	private String code;

	private Boolean success;

	private String requestId;

	private Data data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer totalRecordCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<TimerInfosItem> timerInfos;

		public Integer getTotalRecordCount() {
			return this.totalRecordCount;
		}

		public void setTotalRecordCount(Integer totalRecordCount) {
			this.totalRecordCount = totalRecordCount;
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

		public List<TimerInfosItem> getTimerInfos() {
			return this.timerInfos;
		}

		public void setTimerInfos(List<TimerInfosItem> timerInfos) {
			this.timerInfos = timerInfos;
		}

		public static class TimerInfosItem {

			private String status;

			private String action;

			private String plannedEndTime;

			private String plannedTime;

			private String dBClusterId;

			private String region;

			private String plannedStartTime;

			private String taskId;

			private String orderId;

			private String dbClusterStatus;

			private String dbClusterDescription;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getAction() {
				return this.action;
			}

			public void setAction(String action) {
				this.action = action;
			}

			public String getPlannedEndTime() {
				return this.plannedEndTime;
			}

			public void setPlannedEndTime(String plannedEndTime) {
				this.plannedEndTime = plannedEndTime;
			}

			public String getPlannedTime() {
				return this.plannedTime;
			}

			public void setPlannedTime(String plannedTime) {
				this.plannedTime = plannedTime;
			}

			public String getDBClusterId() {
				return this.dBClusterId;
			}

			public void setDBClusterId(String dBClusterId) {
				this.dBClusterId = dBClusterId;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getPlannedStartTime() {
				return this.plannedStartTime;
			}

			public void setPlannedStartTime(String plannedStartTime) {
				this.plannedStartTime = plannedStartTime;
			}

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public String getOrderId() {
				return this.orderId;
			}

			public void setOrderId(String orderId) {
				this.orderId = orderId;
			}

			public String getDbClusterStatus() {
				return this.dbClusterStatus;
			}

			public void setDbClusterStatus(String dbClusterStatus) {
				this.dbClusterStatus = dbClusterStatus;
			}

			public String getDbClusterDescription() {
				return this.dbClusterDescription;
			}

			public void setDbClusterDescription(String dbClusterDescription) {
				this.dbClusterDescription = dbClusterDescription;
			}
		}
	}

	@Override
	public DescribeScheduleTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeScheduleTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
