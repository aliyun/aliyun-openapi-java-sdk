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

package com.aliyuncs.mpaas.model.v20200710;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20200710.CreateMcubeNebulaTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateMcubeNebulaTaskResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private CreateMcubeNebulaTaskResult createMcubeNebulaTaskResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public CreateMcubeNebulaTaskResult getCreateMcubeNebulaTaskResult() {
		return this.createMcubeNebulaTaskResult;
	}

	public void setCreateMcubeNebulaTaskResult(CreateMcubeNebulaTaskResult createMcubeNebulaTaskResult) {
		this.createMcubeNebulaTaskResult = createMcubeNebulaTaskResult;
	}

	public static class CreateMcubeNebulaTaskResult {

		private String errorCode;

		private String resultMsg;

		private String nebulaTaskId;

		private Boolean success;

		private String requestId;

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getResultMsg() {
			return this.resultMsg;
		}

		public void setResultMsg(String resultMsg) {
			this.resultMsg = resultMsg;
		}

		public String getNebulaTaskId() {
			return this.nebulaTaskId;
		}

		public void setNebulaTaskId(String nebulaTaskId) {
			this.nebulaTaskId = nebulaTaskId;
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
	}

	@Override
	public CreateMcubeNebulaTaskResponse getInstance(UnmarshallerContext context) {
		return	CreateMcubeNebulaTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
