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

package com.aliyuncs.governance.transform.v20210120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.governance.model.v20210120.ListEvaluationScoreHistoryResponse;
import com.aliyuncs.governance.model.v20210120.ListEvaluationScoreHistoryResponse.ScoreDiff;
import com.aliyuncs.governance.model.v20210120.ListEvaluationScoreHistoryResponse.ScoreDiff.CategoryScoreDiff;
import com.aliyuncs.governance.model.v20210120.ListEvaluationScoreHistoryResponse.ScoreDiff.MetricScoreDiff;
import com.aliyuncs.governance.model.v20210120.ListEvaluationScoreHistoryResponse.ScoreHistory;
import com.aliyuncs.governance.model.v20210120.ListEvaluationScoreHistoryResponse.ScoreHistory.TotalScoreHistoryItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEvaluationScoreHistoryResponseUnmarshaller {

	public static ListEvaluationScoreHistoryResponse unmarshall(ListEvaluationScoreHistoryResponse listEvaluationScoreHistoryResponse, UnmarshallerContext _ctx) {
		
		listEvaluationScoreHistoryResponse.setRequestId(_ctx.stringValue("ListEvaluationScoreHistoryResponse.RequestId"));

		ScoreDiff scoreDiff = new ScoreDiff();

		List<CategoryScoreDiff> categoryScoreDiffs = new ArrayList<CategoryScoreDiff>();
		for (int i = 0; i < _ctx.lengthValue("ListEvaluationScoreHistoryResponse.ScoreDiff.CategoryScoreDiffs.Length"); i++) {
			CategoryScoreDiff categoryScoreDiff = new CategoryScoreDiff();
			categoryScoreDiff.setCurrentEvaluationTime(_ctx.stringValue("ListEvaluationScoreHistoryResponse.ScoreDiff.CategoryScoreDiffs["+ i +"].CurrentEvaluationTime"));
			categoryScoreDiff.setId(_ctx.stringValue("ListEvaluationScoreHistoryResponse.ScoreDiff.CategoryScoreDiffs["+ i +"].Id"));
			categoryScoreDiff.setPreviousEvaluationTime(_ctx.stringValue("ListEvaluationScoreHistoryResponse.ScoreDiff.CategoryScoreDiffs["+ i +"].PreviousEvaluationTime"));
			categoryScoreDiff.setScoreDiff(_ctx.stringValue("ListEvaluationScoreHistoryResponse.ScoreDiff.CategoryScoreDiffs["+ i +"].ScoreDiff"));

			categoryScoreDiffs.add(categoryScoreDiff);
		}
		scoreDiff.setCategoryScoreDiffs(categoryScoreDiffs);

		List<MetricScoreDiff> metricScoreDiffs = new ArrayList<MetricScoreDiff>();
		for (int i = 0; i < _ctx.lengthValue("ListEvaluationScoreHistoryResponse.ScoreDiff.MetricScoreDiffs.Length"); i++) {
			MetricScoreDiff metricScoreDiff = new MetricScoreDiff();
			metricScoreDiff.setCategory(_ctx.stringValue("ListEvaluationScoreHistoryResponse.ScoreDiff.MetricScoreDiffs["+ i +"].Category"));
			metricScoreDiff.setCurrentEvaluationTime(_ctx.stringValue("ListEvaluationScoreHistoryResponse.ScoreDiff.MetricScoreDiffs["+ i +"].CurrentEvaluationTime"));
			metricScoreDiff.setId(_ctx.stringValue("ListEvaluationScoreHistoryResponse.ScoreDiff.MetricScoreDiffs["+ i +"].Id"));
			metricScoreDiff.setPreviousEvaluationTime(_ctx.stringValue("ListEvaluationScoreHistoryResponse.ScoreDiff.MetricScoreDiffs["+ i +"].PreviousEvaluationTime"));
			metricScoreDiff.setScoreDiff(_ctx.stringValue("ListEvaluationScoreHistoryResponse.ScoreDiff.MetricScoreDiffs["+ i +"].ScoreDiff"));

			metricScoreDiffs.add(metricScoreDiff);
		}
		scoreDiff.setMetricScoreDiffs(metricScoreDiffs);
		listEvaluationScoreHistoryResponse.setScoreDiff(scoreDiff);

		ScoreHistory scoreHistory = new ScoreHistory();

		List<TotalScoreHistoryItem> totalScoreHistory = new ArrayList<TotalScoreHistoryItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEvaluationScoreHistoryResponse.ScoreHistory.TotalScoreHistory.Length"); i++) {
			TotalScoreHistoryItem totalScoreHistoryItem = new TotalScoreHistoryItem();
			totalScoreHistoryItem.setEvaluationTime(_ctx.stringValue("ListEvaluationScoreHistoryResponse.ScoreHistory.TotalScoreHistory["+ i +"].EvaluationTime"));
			totalScoreHistoryItem.setScore(_ctx.doubleValue("ListEvaluationScoreHistoryResponse.ScoreHistory.TotalScoreHistory["+ i +"].Score"));

			totalScoreHistory.add(totalScoreHistoryItem);
		}
		scoreHistory.setTotalScoreHistory(totalScoreHistory);
		listEvaluationScoreHistoryResponse.setScoreHistory(scoreHistory);
	 
	 	return listEvaluationScoreHistoryResponse;
	}
}