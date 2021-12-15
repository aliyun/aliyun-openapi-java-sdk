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

package com.aliyuncs.ocr.model.v20191230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ocr.transform.v20191230.RecognizeVideoCharacterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeVideoCharacterResponse extends AcsResponse {

	private String requestId;

	private Data data;

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

		private Long width;

		private Long height;

		private String inputFile;

		private List<Frame> frames;

		public Long getWidth() {
			return this.width;
		}

		public void setWidth(Long width) {
			this.width = width;
		}

		public Long getHeight() {
			return this.height;
		}

		public void setHeight(Long height) {
			this.height = height;
		}

		public String getInputFile() {
			return this.inputFile;
		}

		public void setInputFile(String inputFile) {
			this.inputFile = inputFile;
		}

		public List<Frame> getFrames() {
			return this.frames;
		}

		public void setFrames(List<Frame> frames) {
			this.frames = frames;
		}

		public static class Frame {

			private Long timestamp;

			private List<Element> elements;

			public Long getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(Long timestamp) {
				this.timestamp = timestamp;
			}

			public List<Element> getElements() {
				return this.elements;
			}

			public void setElements(List<Element> elements) {
				this.elements = elements;
			}

			public static class Element {

				private Float score;

				private String text;

				private List<TextRectangle> textRectangles;

				public Float getScore() {
					return this.score;
				}

				public void setScore(Float score) {
					this.score = score;
				}

				public String getText() {
					return this.text;
				}

				public void setText(String text) {
					this.text = text;
				}

				public List<TextRectangle> getTextRectangles() {
					return this.textRectangles;
				}

				public void setTextRectangles(List<TextRectangle> textRectangles) {
					this.textRectangles = textRectangles;
				}

				public static class TextRectangle {

					private Long angle;

					private Long left;

					private Long top;

					private Long width;

					private Long height;

					public Long getAngle() {
						return this.angle;
					}

					public void setAngle(Long angle) {
						this.angle = angle;
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

					public Long getHeight() {
						return this.height;
					}

					public void setHeight(Long height) {
						this.height = height;
					}
				}
			}
		}
	}

	@Override
	public RecognizeVideoCharacterResponse getInstance(UnmarshallerContext context) {
		return	RecognizeVideoCharacterResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
