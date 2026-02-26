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

package com.aliyuncs.facebody.model.v20191230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.facebody.transform.v20191230.AddFaceImageTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddFaceImageTemplateResponse extends AcsResponse {

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

		private String templateId;

		private List<FaceInfosItem> faceInfos;

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public List<FaceInfosItem> getFaceInfos() {
			return this.faceInfos;
		}

		public void setFaceInfos(List<FaceInfosItem> faceInfos) {
			this.faceInfos = faceInfos;
		}

		public static class FaceInfosItem {

			private String templateFaceID;

			private FaceRect faceRect;

			public String getTemplateFaceID() {
				return this.templateFaceID;
			}

			public void setTemplateFaceID(String templateFaceID) {
				this.templateFaceID = templateFaceID;
			}

			public FaceRect getFaceRect() {
				return this.faceRect;
			}

			public void setFaceRect(FaceRect faceRect) {
				this.faceRect = faceRect;
			}

			public static class FaceRect {

				private String x;

				private String y;

				private String height;

				private String width;

				public String getX() {
					return this.x;
				}

				public void setX(String x) {
					this.x = x;
				}

				public String getY() {
					return this.y;
				}

				public void setY(String y) {
					this.y = y;
				}

				public String getHeight() {
					return this.height;
				}

				public void setHeight(String height) {
					this.height = height;
				}

				public String getWidth() {
					return this.width;
				}

				public void setWidth(String width) {
					this.width = width;
				}
			}
		}
	}

	@Override
	public AddFaceImageTemplateResponse getInstance(UnmarshallerContext context) {
		return	AddFaceImageTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
