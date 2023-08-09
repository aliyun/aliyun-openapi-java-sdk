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

package com.aliyuncs.config.transform.v20200907;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20200907.ListAggregateConfigRuleEvaluationStatisticsResponse;
import com.aliyuncs.config.model.v20200907.ListAggregateConfigRuleEvaluationStatisticsResponse.EvaluationResultsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAggregateConfigRuleEvaluationStatisticsResponseUnmarshaller {

	public static ListAggregateConfigRuleEvaluationStatisticsResponse unmarshall(ListAggregateConfigRuleEvaluationStatisticsResponse listAggregateConfigRuleEvaluationStatisticsResponse, UnmarshallerContext _ctx) {
		
		listAggregateConfigRuleEvaluationStatisticsResponse.setRequestId(_ctx.stringValue("ListAggregateConfigRuleEvaluationStatisticsResponse.RequestId"));

		List<EvaluationResultsItem> evaluationResults = new ArrayList<EvaluationResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAggregateConfigRuleEvaluationStatisticsResponse.EvaluationResults.Length"); i++) {
			EvaluationResultsItem evaluationResultsItem = new EvaluationResultsItem();
			evaluationResultsItem.setAccountId(_ctx.longValue("ListAggregateConfigRuleEvaluationStatisticsResponse.EvaluationResults["+ i +"].AccountId"));
			evaluationResultsItem.setAggregatorId(_ctx.stringValue("ListAggregateConfigRuleEvaluationStatisticsResponse.EvaluationResults["+ i +"].AggregatorId"));
			evaluationResultsItem.setAggregatorName(_ctx.stringValue("ListAggregateConfigRuleEvaluationStatisticsResponse.EvaluationResults["+ i +"].AggregatorName"));
			evaluationResultsItem.setNonCompliantResourceCnt(_ctx.integerValue("ListAggregateConfigRuleEvaluationStatisticsResponse.EvaluationResults["+ i +"].NonCompliantResourceCnt"));
			evaluationResultsItem.setTotalResourceCnt(_ctx.integerValue("ListAggregateConfigRuleEvaluationStatisticsResponse.EvaluationResults["+ i +"].TotalResourceCnt"));
			evaluationResultsItem.setNonCompliantRuleCnt(_ctx.integerValue("ListAggregateConfigRuleEvaluationStatisticsResponse.EvaluationResults["+ i +"].NonCompliantRuleCnt"));
			evaluationResultsItem.setTotalRuleCnt(_ctx.integerValue("ListAggregateConfigRuleEvaluationStatisticsResponse.EvaluationResults["+ i +"].TotalRuleCnt"));
			evaluationResultsItem.setGmtCreate(_ctx.longValue("ListAggregateConfigRuleEvaluationStatisticsResponse.EvaluationResults["+ i +"].GmtCreate"));
			evaluationResultsItem.setNonCompliantRuleDetail(_ctx.stringValue("ListAggregateConfigRuleEvaluationStatisticsResponse.EvaluationResults["+ i +"].NonCompliantRuleDetail"));
			evaluationResultsItem.setStatisticDate(_ctx.stringValue("ListAggregateConfigRuleEvaluationStatisticsResponse.EvaluationResults["+ i +"].StatisticDate"));

			evaluationResults.add(evaluationResultsItem);
		}
		listAggregateConfigRuleEvaluationStatisticsResponse.setEvaluationResults(evaluationResults);
	 
	 	return listAggregateConfigRuleEvaluationStatisticsResponse;
	}
}