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
import com.aliyuncs.facebody.transform.v20191230.DetectInfraredLivingFaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectInfraredLivingFaceResponse extends AcsResponse {

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

			private Long faceNumber;

			private String imageURL;

			private List<ResultsItem> results;

			public Long getFaceNumber() {
				return this.faceNumber;
			}

			public void setFaceNumber(Long faceNumber) {
				this.faceNumber = faceNumber;
			}

			public String getImageURL() {
				return this.imageURL;
			}

			public void setImageURL(String imageURL) {
				this.imageURL = imageURL;
			}

			public List<ResultsItem> getResults() {
				return this.results;
			}

			public void setResults(List<ResultsItem> results) {
				this.results = results;
			}

			public static class ResultsItem {

				private String label;

				private Float rate;

				private String suggestion;

				private String messageTips;

				private Rect rect;

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

				public String getSuggestion() {
					return this.suggestion;
				}

				public void setSuggestion(String suggestion) {
					this.suggestion = suggestion;
				}

				public String getMessageTips() {
					return this.messageTips;
				}

				public void setMessageTips(String messageTips) {
					this.messageTips = messageTips;
				}

				public Rect getRect() {
					return this.rect;
				}

				public void setRect(Rect rect) {
					this.rect = rect;
				}

				public static class Rect {

					private Long height;

					private Long width;

					private Long top;

					private Long left;

					public Long getHeight() {
						return this.height;
					}

					public void setHeight(Long height) {
						this.height = height;
					}

					public Long getWidth() {
						return this.width;
					}

					public void setWidth(Long width) {
						this.width = width;
					}

					public Long getTop() {
						return this.top;
					}

					public void setTop(Long top) {
						this.top = top;
					}

					public Long getLeft() {
						return this.left;
					}

					public void setLeft(Long left) {
						this.left = left;
					}
				}
			}
		}
	}

	@Override
	public DetectInfraredLivingFaceResponse getInstance(UnmarshallerContext context) {
		return	DetectInfraredLivingFaceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
