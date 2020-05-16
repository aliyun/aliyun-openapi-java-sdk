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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.RecognizeImageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeImageResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Data data;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<Body> bodyList;

		private List<Face> faceList;

		public List<Body> getBodyList() {
			return this.bodyList;
		}

		public void setBodyList(List<Body> bodyList) {
			this.bodyList = bodyList;
		}

		public List<Face> getFaceList() {
			return this.faceList;
		}

		public void setFaceList(List<Face> faceList) {
			this.faceList = faceList;
		}

		public static class Body {

			private String feature;

			private String fileName;

			private String imageBaseSixFour;

			private String leftTopX;

			private String leftTopY;

			private String localFeature;

			private String respiratorColor;

			private String rightBottomX;

			private String rightBottomY;

			public String getFeature() {
				return this.feature;
			}

			public void setFeature(String feature) {
				this.feature = feature;
			}

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public String getImageBaseSixFour() {
				return this.imageBaseSixFour;
			}

			public void setImageBaseSixFour(String imageBaseSixFour) {
				this.imageBaseSixFour = imageBaseSixFour;
			}

			public String getLeftTopX() {
				return this.leftTopX;
			}

			public void setLeftTopX(String leftTopX) {
				this.leftTopX = leftTopX;
			}

			public String getLeftTopY() {
				return this.leftTopY;
			}

			public void setLeftTopY(String leftTopY) {
				this.leftTopY = leftTopY;
			}

			public String getLocalFeature() {
				return this.localFeature;
			}

			public void setLocalFeature(String localFeature) {
				this.localFeature = localFeature;
			}

			public String getRespiratorColor() {
				return this.respiratorColor;
			}

			public void setRespiratorColor(String respiratorColor) {
				this.respiratorColor = respiratorColor;
			}

			public String getRightBottomX() {
				return this.rightBottomX;
			}

			public void setRightBottomX(String rightBottomX) {
				this.rightBottomX = rightBottomX;
			}

			public String getRightBottomY() {
				return this.rightBottomY;
			}

			public void setRightBottomY(String rightBottomY) {
				this.rightBottomY = rightBottomY;
			}
		}

		public static class Face {

			private String feature;

			private String fileName;

			private String imageBaseSixFour;

			private String leftTopX;

			private String leftTopY;

			private String localFeature;

			private String respiratorColor;

			private String rightBottomX;

			private String rightBottomY;

			public String getFeature() {
				return this.feature;
			}

			public void setFeature(String feature) {
				this.feature = feature;
			}

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public String getImageBaseSixFour() {
				return this.imageBaseSixFour;
			}

			public void setImageBaseSixFour(String imageBaseSixFour) {
				this.imageBaseSixFour = imageBaseSixFour;
			}

			public String getLeftTopX() {
				return this.leftTopX;
			}

			public void setLeftTopX(String leftTopX) {
				this.leftTopX = leftTopX;
			}

			public String getLeftTopY() {
				return this.leftTopY;
			}

			public void setLeftTopY(String leftTopY) {
				this.leftTopY = leftTopY;
			}

			public String getLocalFeature() {
				return this.localFeature;
			}

			public void setLocalFeature(String localFeature) {
				this.localFeature = localFeature;
			}

			public String getRespiratorColor() {
				return this.respiratorColor;
			}

			public void setRespiratorColor(String respiratorColor) {
				this.respiratorColor = respiratorColor;
			}

			public String getRightBottomX() {
				return this.rightBottomX;
			}

			public void setRightBottomX(String rightBottomX) {
				this.rightBottomX = rightBottomX;
			}

			public String getRightBottomY() {
				return this.rightBottomY;
			}

			public void setRightBottomY(String rightBottomY) {
				this.rightBottomY = rightBottomY;
			}
		}
	}

	@Override
	public RecognizeImageResponse getInstance(UnmarshallerContext context) {
		return	RecognizeImageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
