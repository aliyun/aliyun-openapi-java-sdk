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

package com.aliyuncs.mpaas.model.v20201028;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20201028.CreateMcubeWhitelistForIdeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateMcubeWhitelistForIdeResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private CreateWhitelistForIdeResult createWhitelistForIdeResult;

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

	public CreateWhitelistForIdeResult getCreateWhitelistForIdeResult() {
		return this.createWhitelistForIdeResult;
	}

	public void setCreateWhitelistForIdeResult(CreateWhitelistForIdeResult createWhitelistForIdeResult) {
		this.createWhitelistForIdeResult = createWhitelistForIdeResult;
	}

	public static class CreateWhitelistForIdeResult {

		private String resultMsg;

		private Boolean success;

		private String whitelistId;

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

		public String getWhitelistId() {
			return this.whitelistId;
		}

		public void setWhitelistId(String whitelistId) {
			this.whitelistId = whitelistId;
		}
	}

	@Override
	public CreateMcubeWhitelistForIdeResponse getInstance(UnmarshallerContext context) {
		return	CreateMcubeWhitelistForIdeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
