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
import com.aliyuncs.imm.transform.v20170906.DetectImageQRCodesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectImageQRCodesResponse extends AcsResponse {

	private String requestId;

	private String imageUri;

	private List<QRCodesItem> qRCodes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getImageUri() {
		return this.imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

	public List<QRCodesItem> getQRCodes() {
		return this.qRCodes;
	}

	public void setQRCodes(List<QRCodesItem> qRCodes) {
		this.qRCodes = qRCodes;
	}

	public static class QRCodesItem {

		private String content;

		private QRCodeBoundary qRCodeBoundary;

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public QRCodeBoundary getQRCodeBoundary() {
			return this.qRCodeBoundary;
		}

		public void setQRCodeBoundary(QRCodeBoundary qRCodeBoundary) {
			this.qRCodeBoundary = qRCodeBoundary;
		}

		public static class QRCodeBoundary {

			private Integer top;

			private Integer left;

			private Integer width;

			private Integer height;

			public Integer getTop() {
				return this.top;
			}

			public void setTop(Integer top) {
				this.top = top;
			}

			public Integer getLeft() {
				return this.left;
			}

			public void setLeft(Integer left) {
				this.left = left;
			}

			public Integer getWidth() {
				return this.width;
			}

			public void setWidth(Integer width) {
				this.width = width;
			}

			public Integer getHeight() {
				return this.height;
			}

			public void setHeight(Integer height) {
				this.height = height;
			}
		}
	}

	@Override
	public DetectImageQRCodesResponse getInstance(UnmarshallerContext context) {
		return	DetectImageQRCodesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
