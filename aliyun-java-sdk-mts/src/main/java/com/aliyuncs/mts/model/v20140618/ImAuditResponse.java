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

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.ImAuditResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ImAuditResponse extends AcsResponse {

	private Boolean textQuotaExceed;

	private Boolean imageQuotaExceed;

	private String requestId;

	private ImageResults imageResults;

	private TextResults textResults;

	public Boolean getTextQuotaExceed() {
		return this.textQuotaExceed;
	}

	public void setTextQuotaExceed(Boolean textQuotaExceed) {
		this.textQuotaExceed = textQuotaExceed;
	}

	public Boolean getImageQuotaExceed() {
		return this.imageQuotaExceed;
	}

	public void setImageQuotaExceed(Boolean imageQuotaExceed) {
		this.imageQuotaExceed = imageQuotaExceed;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ImageResults getImageResults() {
		return this.imageResults;
	}

	public void setImageResults(ImageResults imageResults) {
		this.imageResults = imageResults;
	}

	public TextResults getTextResults() {
		return this.textResults;
	}

	public void setTextResults(TextResults textResults) {
		this.textResults = textResults;
	}

	public static class ImageResults {

		private List<ResultItem> result;

		public List<ResultItem> getResult() {
			return this.result;
		}

		public void setResult(List<ResultItem> result) {
			this.result = result;
		}

		public static class ResultItem {

			private Long code;

			private String dataId;

			private Map<Object,Object> extras;

			private String msg;

			private String taskId;

			private String url;

			private List<Result> results;

			public Long getCode() {
				return this.code;
			}

			public void setCode(Long code) {
				this.code = code;
			}

			public String getDataId() {
				return this.dataId;
			}

			public void setDataId(String dataId) {
				this.dataId = dataId;
			}

			public Map<Object,Object> getExtras() {
				return this.extras;
			}

			public void setExtras(Map<Object,Object> extras) {
				this.extras = extras;
			}

			public String getMsg() {
				return this.msg;
			}

			public void setMsg(String msg) {
				this.msg = msg;
			}

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public List<Result> getResults() {
				return this.results;
			}

			public void setResults(List<Result> results) {
				this.results = results;
			}

			public static class Result {

				private String label;

				private Double rate;

				private String scene;

				private String suggestion;

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public Double getRate() {
					return this.rate;
				}

				public void setRate(Double rate) {
					this.rate = rate;
				}

				public String getScene() {
					return this.scene;
				}

				public void setScene(String scene) {
					this.scene = scene;
				}

				public String getSuggestion() {
					return this.suggestion;
				}

				public void setSuggestion(String suggestion) {
					this.suggestion = suggestion;
				}
			}
		}
	}

	public static class TextResults {

		private List<ResultItem2> result1;

		public List<ResultItem2> getResult1() {
			return this.result1;
		}

		public void setResult1(List<ResultItem2> result1) {
			this.result1 = result1;
		}

		public static class ResultItem2 {

			private Long code;

			private String content;

			private String dataId;

			private String msg;

			private String taskId;

			private List<Result4> results3;

			public Long getCode() {
				return this.code;
			}

			public void setCode(Long code) {
				this.code = code;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public String getDataId() {
				return this.dataId;
			}

			public void setDataId(String dataId) {
				this.dataId = dataId;
			}

			public String getMsg() {
				return this.msg;
			}

			public void setMsg(String msg) {
				this.msg = msg;
			}

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public List<Result4> getResults3() {
				return this.results3;
			}

			public void setResults3(List<Result4> results3) {
				this.results3 = results3;
			}

			public static class Result4 {

				private String label;

				private Double rate;

				private String scene;

				private String suggestion;

				private List<DetailsItem> details;

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public Double getRate() {
					return this.rate;
				}

				public void setRate(Double rate) {
					this.rate = rate;
				}

				public String getScene() {
					return this.scene;
				}

				public void setScene(String scene) {
					this.scene = scene;
				}

				public String getSuggestion() {
					return this.suggestion;
				}

				public void setSuggestion(String suggestion) {
					this.suggestion = suggestion;
				}

				public List<DetailsItem> getDetails() {
					return this.details;
				}

				public void setDetails(List<DetailsItem> details) {
					this.details = details;
				}

				public static class DetailsItem {

					private String label;

					public String getLabel() {
						return this.label;
					}

					public void setLabel(String label) {
						this.label = label;
					}
				}
			}
		}
	}

	@Override
	public ImAuditResponse getInstance(UnmarshallerContext context) {
		return	ImAuditResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
