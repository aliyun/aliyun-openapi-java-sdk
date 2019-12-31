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

package com.aliyuncs.reid.model.v20190928;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.reid.transform.v20190928.DescribeDevicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDevicesResponse extends AcsResponse {

	private String errorCode;

	private String errorMessage;

	private String message;

	private String code;

	private String dynamicCode;

	private String requestId;

	private Boolean success;

	private String dynamicMessage;

	private List<Device> devices;

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

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

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
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

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public List<Device> getDevices() {
		return this.devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}

	public static class Device {

		private String agentStatus;

		private String ipcStatus;

		private String agentIp;

		private String ipcIp;

		private Long agentReceiveTime;

		private String agentMac;

		private Long ipcReceiveTime;

		public String getAgentStatus() {
			return this.agentStatus;
		}

		public void setAgentStatus(String agentStatus) {
			this.agentStatus = agentStatus;
		}

		public String getIpcStatus() {
			return this.ipcStatus;
		}

		public void setIpcStatus(String ipcStatus) {
			this.ipcStatus = ipcStatus;
		}

		public String getAgentIp() {
			return this.agentIp;
		}

		public void setAgentIp(String agentIp) {
			this.agentIp = agentIp;
		}

		public String getIpcIp() {
			return this.ipcIp;
		}

		public void setIpcIp(String ipcIp) {
			this.ipcIp = ipcIp;
		}

		public Long getAgentReceiveTime() {
			return this.agentReceiveTime;
		}

		public void setAgentReceiveTime(Long agentReceiveTime) {
			this.agentReceiveTime = agentReceiveTime;
		}

		public String getAgentMac() {
			return this.agentMac;
		}

		public void setAgentMac(String agentMac) {
			this.agentMac = agentMac;
		}

		public Long getIpcReceiveTime() {
			return this.ipcReceiveTime;
		}

		public void setIpcReceiveTime(Long ipcReceiveTime) {
			this.ipcReceiveTime = ipcReceiveTime;
		}
	}

	@Override
	public DescribeDevicesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDevicesResponseUnmarshaller.unmarshall(this, context);
	}
}
