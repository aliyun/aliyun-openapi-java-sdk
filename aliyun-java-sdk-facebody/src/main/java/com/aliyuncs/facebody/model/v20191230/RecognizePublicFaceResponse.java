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
import com.aliyuncs.facebody.transform.v20191230.RecognizePublicFaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizePublicFaceResponse extends AcsResponse {

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

			private String taskId;

			private String imageURL;

			private List<Result> results;

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public String getImageURL() {
				return this.imageURL;
			}

			public void setImageURL(String imageURL) {
				this.imageURL = imageURL;
			}

			public List<Result> getResults() {
				return this.results;
			}

			public void setResults(List<Result> results) {
				this.results = results;
			}

			public static class Result {

				private String label;

				private String suggestion;

				private Float rate;

				private List<SubResult> subResults;

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public String getSuggestion() {
					return this.suggestion;
				}

				public void setSuggestion(String suggestion) {
					this.suggestion = suggestion;
				}

				public Float getRate() {
					return this.rate;
				}

				public void setRate(Float rate) {
					this.rate = rate;
				}

				public List<SubResult> getSubResults() {
					return this.subResults;
				}

				public void setSubResults(List<SubResult> subResults) {
					this.subResults = subResults;
				}

				public static class SubResult {

					private Float h;

					private Float w;

					private Float x;

					private Float y;

					private List<Face> faces;

					public Float getH() {
						return this.h;
					}

					public void setH(Float h) {
						this.h = h;
					}

					public Float getW() {
						return this.w;
					}

					public void setW(Float w) {
						this.w = w;
					}

					public Float getX() {
						return this.x;
					}

					public void setX(Float x) {
						this.x = x;
					}

					public Float getY() {
						return this.y;
					}

					public void setY(Float y) {
						this.y = y;
					}

					public List<Face> getFaces() {
						return this.faces;
					}

					public void setFaces(List<Face> faces) {
						this.faces = faces;
					}

					public static class Face {

						private String id;

						private String name;

						private Float rate;

						public String getId() {
							return this.id;
						}

						public void setId(String id) {
							this.id = id;
						}

						public String getName() {
							return this.name;
						}

						public void setName(String name) {
							this.name = name;
						}

						public Float getRate() {
							return this.rate;
						}

						public void setRate(Float rate) {
							this.rate = rate;
						}
					}
				}
			}
		}
	}

	@Override
	public RecognizePublicFaceResponse getInstance(UnmarshallerContext context) {
		return	RecognizePublicFaceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
