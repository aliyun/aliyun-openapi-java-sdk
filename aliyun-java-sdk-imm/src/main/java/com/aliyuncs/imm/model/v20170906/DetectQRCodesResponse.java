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

package com.aliyuncs.imm.model.v20170906;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.DetectQRCodesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectQRCodesResponse extends AcsResponse {

	private String requestId;

	private List<SuccessDetailsItem> successDetails;

	private List<FailDetailsItem> failDetails;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SuccessDetailsItem> getSuccessDetails() {
		return this.successDetails;
	}

	public void setSuccessDetails(List<SuccessDetailsItem> successDetails) {
		this.successDetails = successDetails;
	}

	public List<FailDetailsItem> getFailDetails() {
		return this.failDetails;
	}

	public void setFailDetails(List<FailDetailsItem> failDetails) {
		this.failDetails = failDetails;
	}

	public static class SuccessDetailsItem {

		private String srcUri;

		private List<QRCodesItem> qRCodes;

		public String getSrcUri() {
			return this.srcUri;
		}

		public void setSrcUri(String srcUri) {
			this.srcUri = srcUri;
		}

		public List<QRCodesItem> getQRCodes() {
			return this.qRCodes;
		}

		public void setQRCodes(List<QRCodesItem> qRCodes) {
			this.qRCodes = qRCodes;
		}

		public static class QRCodesItem {

			private String content;

			private QRCodesRectangle qRCodesRectangle;

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public QRCodesRectangle getQRCodesRectangle() {
				return this.qRCodesRectangle;
			}

			public void setQRCodesRectangle(QRCodesRectangle qRCodesRectangle) {
				this.qRCodesRectangle = qRCodesRectangle;
			}

			public static class QRCodesRectangle {

				private String left;

				private String top;

				private String width;

				private String height;

				public String getLeft() {
					return this.left;
				}

				public void setLeft(String left) {
					this.left = left;
				}

				public String getTop() {
					return this.top;
				}

				public void setTop(String top) {
					this.top = top;
				}

				public String getWidth() {
					return this.width;
				}

				public void setWidth(String width) {
					this.width = width;
				}

				public String getHeight() {
					return this.height;
				}

				public void setHeight(String height) {
					this.height = height;
				}
			}
		}
	}

	public static class FailDetailsItem {

		private String srcUri;

		private String errorCode;

		private String errorMessage;

		public String getSrcUri() {
			return this.srcUri;
		}

		public void setSrcUri(String srcUri) {
			this.srcUri = srcUri;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}
	}

	@Override
	public DetectQRCodesResponse getInstance(UnmarshallerContext context) {
		return	DetectQRCodesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
