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

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.CompareImageFacesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CompareImageFacesResponse extends AcsResponse {

	private String requestId;

	private String setId;

	private Float similarity;

	private FaceA faceA;

	private FaceB faceB;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSetId() {
		return this.setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
	}

	public Float getSimilarity() {
		return this.similarity;
	}

	public void setSimilarity(Float similarity) {
		this.similarity = similarity;
	}

	public FaceA getFaceA() {
		return this.faceA;
	}

	public void setFaceA(FaceA faceA) {
		this.faceA = faceA;
	}

	public FaceB getFaceB() {
		return this.faceB;
	}

	public void setFaceB(FaceB faceB) {
		this.faceB = faceB;
	}

	public static class FaceA {

		private String faceId;

		private FaceAttributes faceAttributes;

		public String getFaceId() {
			return this.faceId;
		}

		public void setFaceId(String faceId) {
			this.faceId = faceId;
		}

		public FaceAttributes getFaceAttributes() {
			return this.faceAttributes;
		}

		public void setFaceAttributes(FaceAttributes faceAttributes) {
			this.faceAttributes = faceAttributes;
		}

		public static class FaceAttributes {

			private FaceBoundary faceBoundary;

			public FaceBoundary getFaceBoundary() {
				return this.faceBoundary;
			}

			public void setFaceBoundary(FaceBoundary faceBoundary) {
				this.faceBoundary = faceBoundary;
			}

			public static class FaceBoundary {

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
	}

	public static class FaceB {

		private String faceId;

		private FaceAttributes1 faceAttributes1;

		public String getFaceId() {
			return this.faceId;
		}

		public void setFaceId(String faceId) {
			this.faceId = faceId;
		}

		public FaceAttributes1 getFaceAttributes1() {
			return this.faceAttributes1;
		}

		public void setFaceAttributes1(FaceAttributes1 faceAttributes1) {
			this.faceAttributes1 = faceAttributes1;
		}

		public static class FaceAttributes1 {

			private FaceBoundary2 faceBoundary2;

			public FaceBoundary2 getFaceBoundary2() {
				return this.faceBoundary2;
			}

			public void setFaceBoundary2(FaceBoundary2 faceBoundary2) {
				this.faceBoundary2 = faceBoundary2;
			}

			public static class FaceBoundary2 {

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
	}

	@Override
	public CompareImageFacesResponse getInstance(UnmarshallerContext context) {
		return	CompareImageFacesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
