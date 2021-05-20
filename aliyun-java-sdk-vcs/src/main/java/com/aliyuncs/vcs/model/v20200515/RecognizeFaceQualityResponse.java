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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.RecognizeFaceQualityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeFaceQualityResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String description;

		private String qualityScore;

		private Attributes attributes;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getQualityScore() {
			return this.qualityScore;
		}

		public void setQualityScore(String qualityScore) {
			this.qualityScore = qualityScore;
		}

		public Attributes getAttributes() {
			return this.attributes;
		}

		public void setAttributes(Attributes attributes) {
			this.attributes = attributes;
		}

		public static class Attributes {

			private String faceQuality;

			private Integer rightBottomX;

			private String faceStyle;

			private Integer rightBottomY;

			private Integer leftTopY;

			private String targetImageStoragePath;

			private Integer leftTopX;

			private String faceScore;

			public String getFaceQuality() {
				return this.faceQuality;
			}

			public void setFaceQuality(String faceQuality) {
				this.faceQuality = faceQuality;
			}

			public Integer getRightBottomX() {
				return this.rightBottomX;
			}

			public void setRightBottomX(Integer rightBottomX) {
				this.rightBottomX = rightBottomX;
			}

			public String getFaceStyle() {
				return this.faceStyle;
			}

			public void setFaceStyle(String faceStyle) {
				this.faceStyle = faceStyle;
			}

			public Integer getRightBottomY() {
				return this.rightBottomY;
			}

			public void setRightBottomY(Integer rightBottomY) {
				this.rightBottomY = rightBottomY;
			}

			public Integer getLeftTopY() {
				return this.leftTopY;
			}

			public void setLeftTopY(Integer leftTopY) {
				this.leftTopY = leftTopY;
			}

			public String getTargetImageStoragePath() {
				return this.targetImageStoragePath;
			}

			public void setTargetImageStoragePath(String targetImageStoragePath) {
				this.targetImageStoragePath = targetImageStoragePath;
			}

			public Integer getLeftTopX() {
				return this.leftTopX;
			}

			public void setLeftTopX(Integer leftTopX) {
				this.leftTopX = leftTopX;
			}

			public String getFaceScore() {
				return this.faceScore;
			}

			public void setFaceScore(String faceScore) {
				this.faceScore = faceScore;
			}
		}
	}

	@Override
	public RecognizeFaceQualityResponse getInstance(UnmarshallerContext context) {
		return	RecognizeFaceQualityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
