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
import com.aliyuncs.baas.transform.v20181221.DescribeAntChainMiniAppBrowserTransactionQRCodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAntChainMiniAppBrowserTransactionQRCodeResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String antChainId;

		private String base64QRCodePNG;

		private String qRCodeContent;

		private String transactionHash;

		public String getAntChainId() {
			return this.antChainId;
		}

		public void setAntChainId(String antChainId) {
			this.antChainId = antChainId;
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

		public String getTransactionHash() {
			return this.transactionHash;
		}

		public void setTransactionHash(String transactionHash) {
			this.transactionHash = transactionHash;
		}
	}

	@Override
	public DescribeAntChainMiniAppBrowserTransactionQRCodeResponse getInstance(UnmarshallerContext context) {
		return	DescribeAntChainMiniAppBrowserTransactionQRCodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
