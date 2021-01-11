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

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Boolean success;

	private List<Items> data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public List<Items> getData() {
		return this.data;
	}

	public void setData(List<Items> data) {
		this.data = data;
	}

	public static class Items {

		private String action;

		private String args;

		private Long gmtCreate;

		private Long gmtModified;

		private String dBClusterId;

		private Integer maxRetryTime;

		private String mutex;

		private String orderId;

		private Long plannedEndTime;

		private Long plannedStartTime;

		private Long plannedTime;

		private String productCode;

		private String region;

		private String response;

		private Integer retryTime;

		private String status;

		private String taskId;

		private Integer type;

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getArgs() {
			return this.args;
		}

		public void setArgs(String args) {
			this.args = args;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getDBClusterId() {
			return this.dBClusterId;
		}

		public void setDBClusterId(String dBClusterId) {
			this.dBClusterId = dBClusterId;
		}

		public Integer getMaxRetryTime() {
			return this.maxRetryTime;
		}

		public void setMaxRetryTime(Integer maxRetryTime) {
			this.maxRetryTime = maxRetryTime;
		}

		public String getMutex() {
			return this.mutex;
		}

		public void setMutex(String mutex) {
			this.mutex = mutex;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public Long getPlannedEndTime() {
			return this.plannedEndTime;
		}

		public void setPlannedEndTime(Long plannedEndTime) {
			this.plannedEndTime = plannedEndTime;
		}

		public Long getPlannedStartTime() {
			return this.plannedStartTime;
		}

		public void setPlannedStartTime(Long plannedStartTime) {
			this.plannedStartTime = plannedStartTime;
		}

		public Long getPlannedTime() {
			return this.plannedTime;
		}

		public void setPlannedTime(Long plannedTime) {
			this.plannedTime = plannedTime;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getResponse() {
			return this.response;
		}

		public void setResponse(String response) {
			this.response = response;
		}

		public Integer getRetryTime() {
			return this.retryTime;
		}

		public void setRetryTime(Integer retryTime) {
			this.retryTime = retryTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
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
