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
import com.aliyuncs.facebody.transform.v20191230.DetectLivingFaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectLivingFaceResponse extends AcsResponse {

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

		private List<Element> elements;

		public List<Element> getElements() {
			return this.elements;
		}

		public void setElements(List<Element> elements) {
			this.elements = elements;
		}

		public static class Element {

			private String imageURL;

			private String taskId;

			private Long faceNumber;

			private List<Result> results;

			public String getImageURL() {
				return this.imageURL;
			}

			public void setImageURL(String imageURL) {
				this.imageURL = imageURL;
			}

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public Long getFaceNumber() {
				return this.faceNumber;
			}

			public void setFaceNumber(Long faceNumber) {
				this.faceNumber = faceNumber;
			}

			public List<Result> getResults() {
				return this.results;
			}

			public void setResults(List<Result> results) {
				this.results = results;
			}

			public static class Result {

				private String suggestion;

				private String label;

				private Float rate;

				private String messageTips;

				private List<Frame> frames;

				private Rect rect;

				public String getSuggestion() {
					return this.suggestion;
				}

				public void setSuggestion(String suggestion) {
					this.suggestion = suggestion;
				}

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public Float getRate() {
					return this.rate;
				}

				public void setRate(Float rate) {
					this.rate = rate;
				}

				public String getMessageTips() {
					return this.messageTips;
				}

				public void setMessageTips(String messageTips) {
					this.messageTips = messageTips;
				}

				public List<Frame> getFrames() {
					return this.frames;
				}

				public void setFrames(List<Frame> frames) {
					this.frames = frames;
				}

				public Rect getRect() {
					return this.rect;
				}

				public void setRect(Rect rect) {
					this.rect = rect;
				}

				public static class Frame {

					private String url;

					private Float rate;

					public String getUrl() {
						return this.url;
					}

					public void setUrl(String url) {
						this.url = url;
					}

					public Float getRate() {
						return this.rate;
					}

					public void setRate(Float rate) {
						this.rate = rate;
					}
				}

				public static class Rect {

					private Long left;

					private Long top;

					private Long width;

					private Long height;

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
	public DetectLivingFaceResponse getInstance(UnmarshallerContext context) {
		return	DetectLivingFaceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
