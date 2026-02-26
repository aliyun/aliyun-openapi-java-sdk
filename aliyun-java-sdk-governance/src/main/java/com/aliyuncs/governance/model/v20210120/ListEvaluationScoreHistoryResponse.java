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
import com.aliyuncs.governance.transform.v20210120.ListEvaluationScoreHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEvaluationScoreHistoryResponse extends AcsResponse {

	private String requestId;

	private ScoreDiff scoreDiff;

	private ScoreHistory scoreHistory;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ScoreDiff getScoreDiff() {
		return this.scoreDiff;
	}

	public void setScoreDiff(ScoreDiff scoreDiff) {
		this.scoreDiff = scoreDiff;
	}

	public ScoreHistory getScoreHistory() {
		return this.scoreHistory;
	}

	public void setScoreHistory(ScoreHistory scoreHistory) {
		this.scoreHistory = scoreHistory;
	}

	public static class ScoreDiff {

		private List<CategoryScoreDiff> categoryScoreDiffs;

		private List<MetricScoreDiff> metricScoreDiffs;

		public List<CategoryScoreDiff> getCategoryScoreDiffs() {
			return this.categoryScoreDiffs;
		}

		public void setCategoryScoreDiffs(List<CategoryScoreDiff> categoryScoreDiffs) {
			this.categoryScoreDiffs = categoryScoreDiffs;
		}

		public List<MetricScoreDiff> getMetricScoreDiffs() {
			return this.metricScoreDiffs;
		}

		public void setMetricScoreDiffs(List<MetricScoreDiff> metricScoreDiffs) {
			this.metricScoreDiffs = metricScoreDiffs;
		}

		public static class CategoryScoreDiff {

			private String currentEvaluationTime;

			private String id;

			private String previousEvaluationTime;

			private String scoreDiff;

			public String getCurrentEvaluationTime() {
				return this.currentEvaluationTime;
			}

			public void setCurrentEvaluationTime(String currentEvaluationTime) {
				this.currentEvaluationTime = currentEvaluationTime;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getPreviousEvaluationTime() {
				return this.previousEvaluationTime;
			}

			public void setPreviousEvaluationTime(String previousEvaluationTime) {
				this.previousEvaluationTime = previousEvaluationTime;
			}

			public String getScoreDiff() {
				return this.scoreDiff;
			}

			public void setScoreDiff(String scoreDiff) {
				this.scoreDiff = scoreDiff;
			}
		}

		public static class MetricScoreDiff {

			private String category;

			private String currentEvaluationTime;

			private String id;

			private String previousEvaluationTime;

			private String scoreDiff;

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getCurrentEvaluationTime() {
				return this.currentEvaluationTime;
			}

			public void setCurrentEvaluationTime(String currentEvaluationTime) {
				this.currentEvaluationTime = currentEvaluationTime;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getPreviousEvaluationTime() {
				return this.previousEvaluationTime;
			}

			public void setPreviousEvaluationTime(String previousEvaluationTime) {
				this.previousEvaluationTime = previousEvaluationTime;
			}

			public String getScoreDiff() {
				return this.scoreDiff;
			}

			public void setScoreDiff(String scoreDiff) {
				this.scoreDiff = scoreDiff;
			}
		}
	}

	public static class ScoreHistory {

		private List<TotalScoreHistoryItem> totalScoreHistory;

		public List<TotalScoreHistoryItem> getTotalScoreHistory() {
			return this.totalScoreHistory;
		}

		public void setTotalScoreHistory(List<TotalScoreHistoryItem> totalScoreHistory) {
			this.totalScoreHistory = totalScoreHistory;
		}

		public static class TotalScoreHistoryItem {

			private String evaluationTime;

			private Double score;

			public String getEvaluationTime() {
				return this.evaluationTime;
			}

			public void setEvaluationTime(String evaluationTime) {
				this.evaluationTime = evaluationTime;
			}

			public Double getScore() {
				return this.score;
			}

			public void setScore(Double score) {
				this.score = score;
			}
		}
	}

	@Override
	public ListEvaluationScoreHistoryResponse getInstance(UnmarshallerContext context) {
		return	ListEvaluationScoreHistoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
