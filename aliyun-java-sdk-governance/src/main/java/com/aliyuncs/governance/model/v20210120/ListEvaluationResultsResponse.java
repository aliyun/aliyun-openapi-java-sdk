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

package com.aliyuncs.governance.model.v20210120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.governance.transform.v20210120.ListEvaluationResultsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEvaluationResultsResponse extends AcsResponse {

	private Long accountId;

	private String requestId;

	private Results results;

	public Long getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Results getResults() {
		return this.results;
	}

	public void setResults(Results results) {
		this.results = results;
	}

	public static class Results {

		private String evaluationTime;

		private String status;

		private Double totalScore;

		private List<CategoryResultsItem> categoryResults;

		private List<GroupResultsItem> groupResults;

		private List<MetricResult> metricResults;

		public String getEvaluationTime() {
			return this.evaluationTime;
		}

		public void setEvaluationTime(String evaluationTime) {
			this.evaluationTime = evaluationTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Double getTotalScore() {
			return this.totalScore;
		}

		public void setTotalScore(Double totalScore) {
			this.totalScore = totalScore;
		}

		public List<CategoryResultsItem> getCategoryResults() {
			return this.categoryResults;
		}

		public void setCategoryResults(List<CategoryResultsItem> categoryResults) {
			this.categoryResults = categoryResults;
		}

		public List<GroupResultsItem> getGroupResults() {
			return this.groupResults;
		}

		public void setGroupResults(List<GroupResultsItem> groupResults) {
			this.groupResults = groupResults;
		}

		public List<MetricResult> getMetricResults() {
			return this.metricResults;
		}

		public void setMetricResults(List<MetricResult> metricResults) {
			this.metricResults = metricResults;
		}

		public static class CategoryResultsItem {

			private String id;

			private Double result;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public Double getResult() {
				return this.result;
			}

			public void setResult(Double result) {
				this.result = result;
			}
		}

		public static class GroupResultsItem {

			private String id;

			private Double potentialScoreIncrease;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public Double getPotentialScoreIncrease() {
				return this.potentialScoreIncrease;
			}

			public void setPotentialScoreIncrease(Double potentialScoreIncrease) {
				this.potentialScoreIncrease = potentialScoreIncrease;
			}
		}

		public static class MetricResult {

			private String evaluationTime;

			private String id;

			private Double result;

			private String risk;

			private String status;

			private ErrorInfo errorInfo;

			private ResourcesSummary resourcesSummary;

			public String getEvaluationTime() {
				return this.evaluationTime;
			}

			public void setEvaluationTime(String evaluationTime) {
				this.evaluationTime = evaluationTime;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public Double getResult() {
				return this.result;
			}

			public void setResult(Double result) {
				this.result = result;
			}

			public String getRisk() {
				return this.risk;
			}

			public void setRisk(String risk) {
				this.risk = risk;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public ErrorInfo getErrorInfo() {
				return this.errorInfo;
			}

			public void setErrorInfo(ErrorInfo errorInfo) {
				this.errorInfo = errorInfo;
			}

			public ResourcesSummary getResourcesSummary() {
				return this.resourcesSummary;
			}

			public void setResourcesSummary(ResourcesSummary resourcesSummary) {
				this.resourcesSummary = resourcesSummary;
			}

			public static class ErrorInfo {

				private String code;

				private String message;

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
			}

			public static class ResourcesSummary {

				private Integer nonCompliant;

				public Integer getNonCompliant() {
					return this.nonCompliant;
				}

				public void setNonCompliant(Integer nonCompliant) {
					this.nonCompliant = nonCompliant;
				}
			}
		}
	}

	@Override
	public ListEvaluationResultsResponse getInstance(UnmarshallerContext context) {
		return	ListEvaluationResultsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
