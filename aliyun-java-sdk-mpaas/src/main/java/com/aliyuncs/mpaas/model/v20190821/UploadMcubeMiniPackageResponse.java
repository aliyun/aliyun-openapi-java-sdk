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

package com.aliyuncs.mpaas.model.v20190821;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20190821.UploadMcubeMiniPackageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UploadMcubeMiniPackageResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private UploadMiniPackageResult uploadMiniPackageResult;

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

	public UploadMiniPackageResult getUploadMiniPackageResult() {
		return this.uploadMiniPackageResult;
	}

	public void setUploadMiniPackageResult(UploadMiniPackageResult uploadMiniPackageResult) {
		this.uploadMiniPackageResult = uploadMiniPackageResult;
	}

	public static class UploadMiniPackageResult {

		private String resultMsg;

		private Boolean success;

		private ReturnPackageResult returnPackageResult;

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

		public ReturnPackageResult getReturnPackageResult() {
			return this.returnPackageResult;
		}

		public void setReturnPackageResult(ReturnPackageResult returnPackageResult) {
			this.returnPackageResult = returnPackageResult;
		}

		public static class ReturnPackageResult {

			private String debugUrl;

			private String packageId;

			private String userId;

			public String getDebugUrl() {
				return this.debugUrl;
			}

			public void setDebugUrl(String debugUrl) {
				this.debugUrl = debugUrl;
			}

			public String getPackageId() {
				return this.packageId;
			}

			public void setPackageId(String packageId) {
				this.packageId = packageId;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}
		}
	}

	@Override
	public UploadMcubeMiniPackageResponse getInstance(UnmarshallerContext context) {
		return	UploadMcubeMiniPackageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
