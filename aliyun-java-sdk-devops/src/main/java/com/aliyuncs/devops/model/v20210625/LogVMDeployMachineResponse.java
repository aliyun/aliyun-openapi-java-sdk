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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.LogVMDeployMachineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class LogVMDeployMachineResponse extends AcsResponse {

	private String requestId;

	private String errorMessage;

	private Boolean success;

	private String errorCode;

	private DeployMachineLog deployMachineLog;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public DeployMachineLog getDeployMachineLog() {
		return this.deployMachineLog;
	}

	public void setDeployMachineLog(DeployMachineLog deployMachineLog) {
		this.deployMachineLog = deployMachineLog;
	}

	public static class DeployMachineLog {

		private String deployLog;

		private String aliyunRegion;

		private String deployLogPath;

		private Long deployBeginTime;

		private Long deployEndTime;

		public String getDeployLog() {
			return this.deployLog;
		}

		public void setDeployLog(String deployLog) {
			this.deployLog = deployLog;
		}

		public String getAliyunRegion() {
			return this.aliyunRegion;
		}

		public void setAliyunRegion(String aliyunRegion) {
			this.aliyunRegion = aliyunRegion;
		}

		public String getDeployLogPath() {
			return this.deployLogPath;
		}

		public void setDeployLogPath(String deployLogPath) {
			this.deployLogPath = deployLogPath;
		}

		public Long getDeployBeginTime() {
			return this.deployBeginTime;
		}

		public void setDeployBeginTime(Long deployBeginTime) {
			this.deployBeginTime = deployBeginTime;
		}

		public Long getDeployEndTime() {
			return this.deployEndTime;
		}

		public void setDeployEndTime(Long deployEndTime) {
			this.deployEndTime = deployEndTime;
		}
	}

	@Override
	public LogVMDeployMachineResponse getInstance(UnmarshallerContext context) {
		return	LogVMDeployMachineResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
