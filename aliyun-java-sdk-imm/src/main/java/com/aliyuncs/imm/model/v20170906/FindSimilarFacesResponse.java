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
import com.aliyuncs.imm.transform.v20170906.FindSimilarFacesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindSimilarFacesResponse extends AcsResponse {

	private String requestId;

	private List<FacesItem> faces;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FacesItem> getFaces() {
		return this.faces;
	}

	public void setFaces(List<FacesItem> faces) {
		this.faces = faces;
	}

	public static class FacesItem {

		private String faceId;

		private String imageUri;

		private Float similarity;

		private List<SimilarFacesItem> similarFaces;

		private FaceAttributes faceAttributes;

		public String getFaceId() {
			return this.faceId;
		}

		public void setFaceId(String faceId) {
			this.faceId = faceId;
		}

		public String getImageUri() {
			return this.imageUri;
		}

		public void setImageUri(String imageUri) {
			this.imageUri = imageUri;
		}

		public Float getSimilarity() {
			return this.similarity;
		}

		public void setSimilarity(Float similarity) {
			this.similarity = similarity;
		}

		public List<SimilarFacesItem> getSimilarFaces() {
			return this.similarFaces;
		}

		public void setSimilarFaces(List<SimilarFacesItem> similarFaces) {
			this.similarFaces = similarFaces;
		}

		public FaceAttributes getFaceAttributes() {
			return this.faceAttributes;
		}

		public void setFaceAttributes(FaceAttributes faceAttributes) {
			this.faceAttributes = faceAttributes;
		}

		public static class SimilarFacesItem {

			private String faceId;

			private String imageUri;

			private Float similarity;

			private FaceAttributes1 faceAttributes1;

			public String getFaceId() {
				return this.faceId;
			}

			public void setFaceId(String faceId) {
				this.faceId = faceId;
			}

			public String getImageUri() {
				return this.imageUri;
			}

			public void setImageUri(String imageUri) {
				this.imageUri = imageUri;
			}

			public Float getSimilarity() {
				return this.similarity;
			}

			public void setSimilarity(Float similarity) {
				this.similarity = similarity;
			}

			public FaceAttributes1 getFaceAttributes1() {
				return this.faceAttributes1;
			}

			public void setFaceAttributes1(FaceAttributes1 faceAttributes1) {
				this.faceAttributes1 = faceAttributes1;
			}

			public static class FaceAttributes1 {

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

		public static class FaceAttributes {

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
	public FindSimilarFacesResponse getInstance(UnmarshallerContext context) {
		return	FindSimilarFacesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
