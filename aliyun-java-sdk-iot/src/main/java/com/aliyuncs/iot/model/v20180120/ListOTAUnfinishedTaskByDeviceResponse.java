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

package com.aliyuncs.iot.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.ListOTAUnfinishedTaskByDeviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListOTAUnfinishedTaskByDeviceResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private List<SimpleOTATaskInfo> data;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<SimpleOTATaskInfo> getData() {
		return this.data;
	}

	public void setData(List<SimpleOTATaskInfo> data) {
		this.data = data;
	}

	public static class SimpleOTATaskInfo {

		private String taskId;

		private String utcModified;

		private String productKey;

		private String taskStatus;

		private String jobId;

		private String productName;

		private String deviceName;

		private String srcVersion;

		private String destVersion;

		private String iotId;

		private String utcCreate;

		private String moduleName;

		private String firmwareId;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getUtcModified() {
			return this.utcModified;
		}

		public void setUtcModified(String utcModified) {
			this.utcModified = utcModified;
		}

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public String getSrcVersion() {
			return this.srcVersion;
		}

		public void setSrcVersion(String srcVersion) {
			this.srcVersion = srcVersion;
		}

		public String getDestVersion() {
			return this.destVersion;
		}

		public void setDestVersion(String destVersion) {
			this.destVersion = destVersion;
		}

		public String getIotId() {
			return this.iotId;
		}

		public void setIotId(String iotId) {
			this.iotId = iotId;
		}

		public String getUtcCreate() {
			return this.utcCreate;
		}

		public void setUtcCreate(String utcCreate) {
			this.utcCreate = utcCreate;
		}

		public String getModuleName() {
			return this.moduleName;
		}

		public void setModuleName(String moduleName) {
			this.moduleName = moduleName;
		}

		public String getFirmwareId() {
			return this.firmwareId;
		}

		public void setFirmwareId(String firmwareId) {
			this.firmwareId = firmwareId;
		}
	}

	@Override
	public ListOTAUnfinishedTaskByDeviceResponse getInstance(UnmarshallerContext context) {
		return	ListOTAUnfinishedTaskByDeviceResponseUnmarshaller.unmarshall(this, context);
	}
}
