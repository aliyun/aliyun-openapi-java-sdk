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

package com.aliyuncs.objectdet.model.v20191230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.objectdet.transform.v20191230.DetectWorkwearResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectWorkwearResponse extends AcsResponse {

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

		private List<识别内容> elements;

		public List<识别内容> getElements() {
			return this.elements;
		}

		public void setElements(List<识别内容> elements) {
			this.elements = elements;
		}

		public static class 识别内容 {

			private Double score;

			private String type;

			private List<识别属性> property;

			private Rectangles rectangles;

			public Double getScore() {
				return this.score;
			}

			public void setScore(Double score) {
				this.score = score;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public List<识别属性> getProperty() {
				return this.property;
			}

			public void setProperty(List<识别属性> property) {
				this.property = property;
			}

			public Rectangles getRectangles() {
				return this.rectangles;
			}

			public void setRectangles(Rectangles rectangles) {
				this.rectangles = rectangles;
			}

			public static class 识别属性 {

				private String label;

				private Probability probability;

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public Probability getProbability() {
					return this.probability;
				}

				public void setProbability(Probability probability) {
					this.probability = probability;
				}

				public static class Probability {

					private Double no;

					private Long threshold;

					private Double unknown;

					private Double yes;

					public Double getNo() {
						return this.no;
					}

					public void setNo(Double no) {
						this.no = no;
					}

					public Long getThreshold() {
						return this.threshold;
					}

					public void setThreshold(Long threshold) {
						this.threshold = threshold;
					}

					public Double getUnknown() {
						return this.unknown;
					}

					public void setUnknown(Double unknown) {
						this.unknown = unknown;
					}

					public Double getYes() {
						return this.yes;
					}

					public void setYes(Double yes) {
						this.yes = yes;
					}
				}
			}

			public static class Rectangles {

				private Long height;

				private Long left;

				private Long top;

				private Long width;

				public Long getHeight() {
					return this.height;
				}

				public void setHeight(Long height) {
					this.height = height;
				}

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

				public Long getWidth() {
					return this.width;
				}

				public void setWidth(Long width) {
					this.width = width;
				}
			}
		}
	}

	@Override
	public DetectWorkwearResponse getInstance(UnmarshallerContext context) {
		return	DetectWorkwearResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
