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

package com.aliyuncs.swas_open.model.v20200601;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas_open.transform.v20200601.DescribeInvocationResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInvocationResultResponse extends AcsResponse {

	private String requestId;

	private InvocationResult invocationResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public InvocationResult getInvocationResult() {
		return this.invocationResult;
	}

	public void setInvocationResult(InvocationResult invocationResult) {
		this.invocationResult = invocationResult;
	}

	public static class InvocationResult {

		private String startTime;

		private String finishedTime;

		private String invocationStatus;

		private Long exitCode;

		private String errorInfo;

		private String errorCode;

		private String invokeId;

		private String invokeRecordStatus;

		private String invokeUser;

		private String output;

		private String instanceId;

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getFinishedTime() {
			return this.finishedTime;
		}

		public void setFinishedTime(String finishedTime) {
			this.finishedTime = finishedTime;
		}

		public String getInvocationStatus() {
			return this.invocationStatus;
		}

		public void setInvocationStatus(String invocationStatus) {
			this.invocationStatus = invocationStatus;
		}

		public Long getExitCode() {
			return this.exitCode;
		}

		public void setExitCode(Long exitCode) {
			this.exitCode = exitCode;
		}

		public String getErrorInfo() {
			return this.errorInfo;
		}

		public void setErrorInfo(String errorInfo) {
			this.errorInfo = errorInfo;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getInvokeId() {
			return this.invokeId;
		}

		public void setInvokeId(String invokeId) {
			this.invokeId = invokeId;
		}

		public String getInvokeRecordStatus() {
			return this.invokeRecordStatus;
		}

		public void setInvokeRecordStatus(String invokeRecordStatus) {
			this.invokeRecordStatus = invokeRecordStatus;
		}

		public String getInvokeUser() {
			return this.invokeUser;
		}

		public void setInvokeUser(String invokeUser) {
			this.invokeUser = invokeUser;
		}

		public String getOutput() {
			return this.output;
		}

		public void setOutput(String output) {
			this.output = output;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
	}

	@Override
	public DescribeInvocationResultResponse getInstance(UnmarshallerContext context) {
		return	DescribeInvocationResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
