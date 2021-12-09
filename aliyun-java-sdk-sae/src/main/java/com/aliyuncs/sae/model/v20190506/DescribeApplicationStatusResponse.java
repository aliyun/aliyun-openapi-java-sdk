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

package com.aliyuncs.sae.model.v20190506;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.DescribeApplicationStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApplicationStatusResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String traceId;

	private String errorCode;

	private String code;

	private Boolean success;

	private Data data;

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

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String armsAdvancedEnabled;

		private String lastChangeOrderId;

		private String armsApmInfo;

		private String createTime;

		private String currentStatus;

		private String appId;

		private Boolean lastChangeOrderRunning;

		private Integer runningInstances;

		private String lastChangeOrderStatus;

		private String subStatus;

		private Boolean enableAgent;

		private Long fileSizeLimit;

		public String getArmsAdvancedEnabled() {
			return this.armsAdvancedEnabled;
		}

		public void setArmsAdvancedEnabled(String armsAdvancedEnabled) {
			this.armsAdvancedEnabled = armsAdvancedEnabled;
		}

		public String getLastChangeOrderId() {
			return this.lastChangeOrderId;
		}

		public void setLastChangeOrderId(String lastChangeOrderId) {
			this.lastChangeOrderId = lastChangeOrderId;
		}

		public String getArmsApmInfo() {
			return this.armsApmInfo;
		}

		public void setArmsApmInfo(String armsApmInfo) {
			this.armsApmInfo = armsApmInfo;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getCurrentStatus() {
			return this.currentStatus;
		}

		public void setCurrentStatus(String currentStatus) {
			this.currentStatus = currentStatus;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public Boolean getLastChangeOrderRunning() {
			return this.lastChangeOrderRunning;
		}

		public void setLastChangeOrderRunning(Boolean lastChangeOrderRunning) {
			this.lastChangeOrderRunning = lastChangeOrderRunning;
		}

		public Integer getRunningInstances() {
			return this.runningInstances;
		}

		public void setRunningInstances(Integer runningInstances) {
			this.runningInstances = runningInstances;
		}

		public String getLastChangeOrderStatus() {
			return this.lastChangeOrderStatus;
		}

		public void setLastChangeOrderStatus(String lastChangeOrderStatus) {
			this.lastChangeOrderStatus = lastChangeOrderStatus;
		}

		public String getSubStatus() {
			return this.subStatus;
		}

		public void setSubStatus(String subStatus) {
			this.subStatus = subStatus;
		}

		public Boolean getEnableAgent() {
			return this.enableAgent;
		}

		public void setEnableAgent(Boolean enableAgent) {
			this.enableAgent = enableAgent;
		}

		public Long getFileSizeLimit() {
			return this.fileSizeLimit;
		}

		public void setFileSizeLimit(Long fileSizeLimit) {
			this.fileSizeLimit = fileSizeLimit;
		}
	}

	@Override
	public DescribeApplicationStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeApplicationStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
