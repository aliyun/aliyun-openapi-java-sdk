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
import com.aliyuncs.mpaas.transform.v20201028.CreateMcubeWhitelistResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateMcubeWhitelistResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String requestId;

	private CreateWhitelistResult createWhitelistResult;

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public CreateWhitelistResult getCreateWhitelistResult() {
		return this.createWhitelistResult;
	}

	public void setCreateWhitelistResult(CreateWhitelistResult createWhitelistResult) {
		this.createWhitelistResult = createWhitelistResult;
	}

	public static class CreateWhitelistResult {

		private Boolean success;

		private String resultMsg;

		private String whitelistId;

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getResultMsg() {
			return this.resultMsg;
		}

		public void setResultMsg(String resultMsg) {
			this.resultMsg = resultMsg;
		}

		public String getWhitelistId() {
			return this.whitelistId;
		}

		public void setWhitelistId(String whitelistId) {
			this.whitelistId = whitelistId;
		}
	}

	@Override
	public CreateMcubeWhitelistResponse getInstance(UnmarshallerContext context) {
		return	CreateMcubeWhitelistResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
