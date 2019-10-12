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

package com.aliyuncs.efc_service.model.v20190318;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.efc_service.transform.v20190318.VerifyRdOperationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class VerifyRdOperationResponse extends AcsResponse {

	private String requestId;

	private RdOprationCheckResult rdOprationCheckResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public RdOprationCheckResult getRdOprationCheckResult() {
		return this.rdOprationCheckResult;
	}

	public void setRdOprationCheckResult(RdOprationCheckResult rdOprationCheckResult) {
		this.rdOprationCheckResult = rdOprationCheckResult;
	}

	public static class RdOprationCheckResult {

		private Boolean success;

		private String bizType;

		private String failCode;

		private String failMessage;

		private String extraData;

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public String getFailCode() {
			return this.failCode;
		}

		public void setFailCode(String failCode) {
			this.failCode = failCode;
		}

		public String getFailMessage() {
			return this.failMessage;
		}

		public void setFailMessage(String failMessage) {
			this.failMessage = failMessage;
		}

		public String getExtraData() {
			return this.extraData;
		}

		public void setExtraData(String extraData) {
			this.extraData = extraData;
		}
	}

	@Override
	public VerifyRdOperationResponse getInstance(UnmarshallerContext context) {
		return	VerifyRdOperationResponseUnmarshaller.unmarshall(this, context);
	}
}
