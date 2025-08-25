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
import com.aliyuncs.mpaas.transform.v20200710.UpdateMcubeWhitelistResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateMcubeWhitelistResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String requestId;

	private AddWhitelistResult addWhitelistResult;

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

	public AddWhitelistResult getAddWhitelistResult() {
		return this.addWhitelistResult;
	}

	public void setAddWhitelistResult(AddWhitelistResult addWhitelistResult) {
		this.addWhitelistResult = addWhitelistResult;
	}

	public static class AddWhitelistResult {

		private Boolean success;

		private String resultMsg;

		private AddWhitelistInfo addWhitelistInfo;

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

		public AddWhitelistInfo getAddWhitelistInfo() {
			return this.addWhitelistInfo;
		}

		public void setAddWhitelistInfo(AddWhitelistInfo addWhitelistInfo) {
			this.addWhitelistInfo = addWhitelistInfo;
		}

		public static class AddWhitelistInfo {

			private String failUserIds;

			private Long failNum;

			private Long successNum;

			public String getFailUserIds() {
				return this.failUserIds;
			}

			public void setFailUserIds(String failUserIds) {
				this.failUserIds = failUserIds;
			}

			public Long getFailNum() {
				return this.failNum;
			}

			public void setFailNum(Long failNum) {
				this.failNum = failNum;
			}

			public Long getSuccessNum() {
				return this.successNum;
			}

			public void setSuccessNum(Long successNum) {
				this.successNum = successNum;
			}
		}
	}

	@Override
	public UpdateMcubeWhitelistResponse getInstance(UnmarshallerContext context) {
		return	UpdateMcubeWhitelistResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
