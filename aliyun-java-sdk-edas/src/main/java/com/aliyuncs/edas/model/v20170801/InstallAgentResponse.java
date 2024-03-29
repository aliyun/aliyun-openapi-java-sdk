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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.InstallAgentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InstallAgentResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<ExecutionResult> executionResultList;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
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

	public List<ExecutionResult> getExecutionResultList() {
		return this.executionResultList;
	}

	public void setExecutionResultList(List<ExecutionResult> executionResultList) {
		this.executionResultList = executionResultList;
	}

	public static class ExecutionResult {

		private String status;

		private String finishedTime;

		private String instanceId;

		private String invokeRecordStatus;

		private Boolean success;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getFinishedTime() {
			return this.finishedTime;
		}

		public void setFinishedTime(String finishedTime) {
			this.finishedTime = finishedTime;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInvokeRecordStatus() {
			return this.invokeRecordStatus;
		}

		public void setInvokeRecordStatus(String invokeRecordStatus) {
			this.invokeRecordStatus = invokeRecordStatus;
		}

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}

	@Override
	public InstallAgentResponse getInstance(UnmarshallerContext context) {
		return	InstallAgentResponseUnmarshaller.unmarshall(this, context);
	}
}
