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

package com.aliyuncs.mseap.model.v20210118;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mseap.transform.v20210118.PullTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PullTaskResponse extends AcsResponse {

	private Boolean allowRetry;

	private String requestId;

	private String errorMsg;

	private Integer httpStatusCode;

	private String dynamicCode;

	private String errorCode;

	private String dynamicMessage;

	private Boolean success;

	private String appName;

	private Module module;

	public Boolean getAllowRetry() {
		return this.allowRetry;
	}

	public void setAllowRetry(Boolean allowRetry) {
		this.allowRetry = allowRetry;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public static class Module {

		private String taskId;

		private String outTaskId;

		private String taskType;

		private String taskData;

		private String orderId;

		private String bizCode;

		private String principalKey;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getOutTaskId() {
			return this.outTaskId;
		}

		public void setOutTaskId(String outTaskId) {
			this.outTaskId = outTaskId;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getTaskData() {
			return this.taskData;
		}

		public void setTaskData(String taskData) {
			this.taskData = taskData;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getBizCode() {
			return this.bizCode;
		}

		public void setBizCode(String bizCode) {
			this.bizCode = bizCode;
		}

		public String getPrincipalKey() {
			return this.principalKey;
		}

		public void setPrincipalKey(String principalKey) {
			this.principalKey = principalKey;
		}
	}

	@Override
	public PullTaskResponse getInstance(UnmarshallerContext context) {
		return	PullTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
