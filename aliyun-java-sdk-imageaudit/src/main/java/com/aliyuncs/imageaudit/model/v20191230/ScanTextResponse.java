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

package com.aliyuncs.imageaudit.model.v20191230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imageaudit.transform.v20191230.ScanTextResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ScanTextResponse extends AcsResponse {

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

			private List<Result> results;

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
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

				private List<Detail> details;

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

				public List<Detail> getDetails() {
					return this.details;
				}

				public void setDetails(List<Detail> details) {
					this.details = details;
				}

				public static class Detail {

					private String label;

					private List<HintWord> hintWords;

					public String getLabel() {
						return this.label;
					}

					public void setLabel(String label) {
						this.label = label;
					}

					public List<HintWord> getHintWords() {
						return this.hintWords;
					}

					public void setHintWords(List<HintWord> hintWords) {
						this.hintWords = hintWords;
					}

					public static class HintWord {

						private String context;

						public String getContext() {
							return this.context;
						}

						public void setContext(String context) {
							this.context = context;
						}
					}
				}
			}
		}
	}

	@Override
	public ScanTextResponse getInstance(UnmarshallerContext context) {
		return	ScanTextResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
