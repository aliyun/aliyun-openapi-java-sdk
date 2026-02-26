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

package com.aliyuncs.cams.model.v20200606;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cams.transform.v20200606.UpdatePhoneMessageQrdlResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdatePhoneMessageQrdlResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String phoneNumber;

		private String qrdlCode;

		private String generateQrImage;

		private String prefilledMessage;

		private String deepLinkUrl;

		private String qrImageUrl;

		public String getPhoneNumber() {
			return this.phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getQrdlCode() {
			return this.qrdlCode;
		}

		public void setQrdlCode(String qrdlCode) {
			this.qrdlCode = qrdlCode;
		}

		public String getGenerateQrImage() {
			return this.generateQrImage;
		}

		public void setGenerateQrImage(String generateQrImage) {
			this.generateQrImage = generateQrImage;
		}

		public String getPrefilledMessage() {
			return this.prefilledMessage;
		}

		public void setPrefilledMessage(String prefilledMessage) {
			this.prefilledMessage = prefilledMessage;
		}

		public String getDeepLinkUrl() {
			return this.deepLinkUrl;
		}

		public void setDeepLinkUrl(String deepLinkUrl) {
			this.deepLinkUrl = deepLinkUrl;
		}

		public String getQrImageUrl() {
			return this.qrImageUrl;
		}

		public void setQrImageUrl(String qrImageUrl) {
			this.qrImageUrl = qrImageUrl;
		}
	}

	@Override
	public UpdatePhoneMessageQrdlResponse getInstance(UnmarshallerContext context) {
		return	UpdatePhoneMessageQrdlResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
