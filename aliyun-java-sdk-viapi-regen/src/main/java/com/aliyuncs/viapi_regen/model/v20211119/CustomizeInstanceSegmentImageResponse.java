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

package com.aliyuncs.viapi_regen.model.v20211119;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.viapi_regen.transform.v20211119.CustomizeInstanceSegmentImageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CustomizeInstanceSegmentImageResponse extends AcsResponse {

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

		private List<ElementsItem> elements;

		public List<ElementsItem> getElements() {
			return this.elements;
		}

		public void setElements(List<ElementsItem> elements) {
			this.elements = elements;
		}

		public static class ElementsItem {

			private Float score;

			private String category;

			private List<ContoursItem> contours;

			private Boxes boxes;

			private Mask mask;

			public Float getScore() {
				return this.score;
			}

			public void setScore(Float score) {
				this.score = score;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public List<ContoursItem> getContours() {
				return this.contours;
			}

			public void setContours(List<ContoursItem> contours) {
				this.contours = contours;
			}

			public Boxes getBoxes() {
				return this.boxes;
			}

			public void setBoxes(Boxes boxes) {
				this.boxes = boxes;
			}

			public Mask getMask() {
				return this.mask;
			}

			public void setMask(Mask mask) {
				this.mask = mask;
			}

			public static class ContoursItem {

				private Integer x;

				private Integer y;

				public Integer getX() {
					return this.x;
				}

				public void setX(Integer x) {
					this.x = x;
				}

				public Integer getY() {
					return this.y;
				}

				public void setY(Integer y) {
					this.y = y;
				}
			}

			public static class Boxes {

				private Integer x;

				private Integer y;

				private Integer width;

				private Integer height;

				public Integer getX() {
					return this.x;
				}

				public void setX(Integer x) {
					this.x = x;
				}

				public Integer getY() {
					return this.y;
				}

				public void setY(Integer y) {
					this.y = y;
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

			public static class Mask {

				private String counts;

				private List<Integer> sizes;

				public String getCounts() {
					return this.counts;
				}

				public void setCounts(String counts) {
					this.counts = counts;
				}

				public List<Integer> getSizes() {
					return this.sizes;
				}

				public void setSizes(List<Integer> sizes) {
					this.sizes = sizes;
				}
			}
		}
	}

	@Override
	public CustomizeInstanceSegmentImageResponse getInstance(UnmarshallerContext context) {
		return	CustomizeInstanceSegmentImageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
