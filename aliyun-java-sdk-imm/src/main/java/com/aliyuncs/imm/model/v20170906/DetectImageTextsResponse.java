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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.DetectImageTextsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectImageTextsResponse extends AcsResponse {

	private String requestId;

	private String imageUri;

	private List<OCRItem> oCR;

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

	public List<OCRItem> getOCR() {
		return this.oCR;
	}

	public void setOCR(List<OCRItem> oCR) {
		this.oCR = oCR;
	}

	public static class OCRItem {

		private String oCRContents;

		private Float oCRConfidence;

		private OCRBoundary oCRBoundary;

		public String getOCRContents() {
			return this.oCRContents;
		}

		public void setOCRContents(String oCRContents) {
			this.oCRContents = oCRContents;
		}

		public Float getOCRConfidence() {
			return this.oCRConfidence;
		}

		public void setOCRConfidence(Float oCRConfidence) {
			this.oCRConfidence = oCRConfidence;
		}

		public OCRBoundary getOCRBoundary() {
			return this.oCRBoundary;
		}

		public void setOCRBoundary(OCRBoundary oCRBoundary) {
			this.oCRBoundary = oCRBoundary;
		}

		public static class OCRBoundary {

			private Integer left;

			private Integer top;

			private Integer width;

			private Integer height;

			public Integer getLeft() {
				return this.left;
			}

			public void setLeft(Integer left) {
				this.left = left;
			}

			public Integer getTop() {
				return this.top;
			}

			public void setTop(Integer top) {
				this.top = top;
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
	public DetectImageTextsResponse getInstance(UnmarshallerContext context) {
		return	DetectImageTextsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
