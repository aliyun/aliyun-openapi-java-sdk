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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20181221.DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Boolean success;

	private String httpStatusCode;

	private String code;

	private String message;

	private Result result;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String antChainId;

		private String transactionHash;

		private String base64QRCodePNG;

		private String qRCodeContent;

		public String getAntChainId() {
			return this.antChainId;
		}

		public void setAntChainId(String antChainId) {
			this.antChainId = antChainId;
		}

		public String getTransactionHash() {
			return this.transactionHash;
		}

		public void setTransactionHash(String transactionHash) {
			this.transactionHash = transactionHash;
		}

		public String getBase64QRCodePNG() {
			return this.base64QRCodePNG;
		}

		public void setBase64QRCodePNG(String base64QRCodePNG) {
			this.base64QRCodePNG = base64QRCodePNG;
		}

		public String getQRCodeContent() {
			return this.qRCodeContent;
		}

		public void setQRCodeContent(String qRCodeContent) {
			this.qRCodeContent = qRCodeContent;
		}
	}

	@Override
	public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse getInstance(UnmarshallerContext context) {
		return	DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
