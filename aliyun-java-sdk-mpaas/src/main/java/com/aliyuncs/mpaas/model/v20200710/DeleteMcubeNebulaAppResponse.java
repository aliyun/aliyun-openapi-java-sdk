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
import com.aliyuncs.mpaas.transform.v20200710.DeleteMcubeNebulaAppResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DeleteMcubeNebulaAppResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private DeleteMcubeNebulaAppResult deleteMcubeNebulaAppResult;

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

	public DeleteMcubeNebulaAppResult getDeleteMcubeNebulaAppResult() {
		return this.deleteMcubeNebulaAppResult;
	}

	public void setDeleteMcubeNebulaAppResult(DeleteMcubeNebulaAppResult deleteMcubeNebulaAppResult) {
		this.deleteMcubeNebulaAppResult = deleteMcubeNebulaAppResult;
	}

	public static class DeleteMcubeNebulaAppResult {

		private String errorCode;

		private String resultMsg;

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
	public DeleteMcubeNebulaAppResponse getInstance(UnmarshallerContext context) {
		return	DeleteMcubeNebulaAppResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
