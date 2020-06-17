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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeSagHaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSagHaResponse extends AcsResponse {

	private String requestId;

	private String mode;

	private List<Port> ports;

	private List<TaskState> taskStates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public List<Port> getPorts() {
		return this.ports;
	}

	public void setPorts(List<Port> ports) {
		this.ports = ports;
	}

	public List<TaskState> getTaskStates() {
		return this.taskStates;
	}

	public void setTaskStates(List<TaskState> taskStates) {
		this.taskStates = taskStates;
	}

	public static class Port {

		private String portName;

		private String virtualIp;

		public String getPortName() {
			return this.portName;
		}

		public void setPortName(String portName) {
			this.portName = portName;
		}

		public String getVirtualIp() {
			return this.virtualIp;
		}

		public void setVirtualIp(String virtualIp) {
			this.virtualIp = virtualIp;
		}
	}

	public static class TaskState {

		private String state;

		private String errorCode;

		private String errorMessage;

		private String createTime;

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

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

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public DescribeSagHaResponse getInstance(UnmarshallerContext context) {
		return	DescribeSagHaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
