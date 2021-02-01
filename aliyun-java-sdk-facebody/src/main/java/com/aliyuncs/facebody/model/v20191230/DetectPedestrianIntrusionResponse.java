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
import com.aliyuncs.facebody.transform.v20191230.DetectPedestrianIntrusionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectPedestrianIntrusionResponse extends AcsResponse {

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

		private Long imageHeight;

		private Long imageWidth;

		private List<ElementsItem> elements;

		public Long getImageHeight() {
			return this.imageHeight;
		}

		public void setImageHeight(Long imageHeight) {
			this.imageHeight = imageHeight;
		}

		public Long getImageWidth() {
			return this.imageWidth;
		}

		public void setImageWidth(Long imageWidth) {
			this.imageWidth = imageWidth;
		}

		public List<ElementsItem> getElements() {
			return this.elements;
		}

		public void setElements(List<ElementsItem> elements) {
			this.elements = elements;
		}

		public static class ElementsItem {

			private Long boxId;

			private String type;

			private Long score;

			private Boolean isIntrude;

			private Box box;

			public Long getBoxId() {
				return this.boxId;
			}

			public void setBoxId(Long boxId) {
				this.boxId = boxId;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getScore() {
				return this.score;
			}

			public void setScore(Long score) {
				this.score = score;
			}

			public Boolean getIsIntrude() {
				return this.isIntrude;
			}

			public void setIsIntrude(Boolean isIntrude) {
				this.isIntrude = isIntrude;
			}

			public Box getBox() {
				return this.box;
			}

			public void setBox(Box box) {
				this.box = box;
			}

			public static class Box {

				private Long left;

				private Long top;

				private Long right;

				private Long bottom;

				public Long getLeft() {
					return this.left;
				}

				public void setLeft(Long left) {
					this.left = left;
				}

				public Long getTop() {
					return this.top;
				}

				public void setTop(Long top) {
					this.top = top;
				}

				public Long getRight() {
					return this.right;
				}

				public void setRight(Long right) {
					this.right = right;
				}

				public Long getBottom() {
					return this.bottom;
				}

				public void setBottom(Long bottom) {
					this.bottom = bottom;
				}
			}
		}
	}

	@Override
	public DetectPedestrianIntrusionResponse getInstance(UnmarshallerContext context) {
		return	DetectPedestrianIntrusionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
