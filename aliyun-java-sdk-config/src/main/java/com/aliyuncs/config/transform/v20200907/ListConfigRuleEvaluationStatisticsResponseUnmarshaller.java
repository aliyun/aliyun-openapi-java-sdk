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

import com.aliyuncs.config.model.v20200907.ListConfigRuleEvaluationStatisticsResponse;
import com.aliyuncs.config.model.v20200907.ListConfigRuleEvaluationStatisticsResponse.EvaluationResultsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConfigRuleEvaluationStatisticsResponseUnmarshaller {

	public static ListConfigRuleEvaluationStatisticsResponse unmarshall(ListConfigRuleEvaluationStatisticsResponse listConfigRuleEvaluationStatisticsResponse, UnmarshallerContext _ctx) {
		
		listConfigRuleEvaluationStatisticsResponse.setRequestId(_ctx.stringValue("ListConfigRuleEvaluationStatisticsResponse.RequestId"));

		List<EvaluationResultsItem> evaluationResults = new ArrayList<EvaluationResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListConfigRuleEvaluationStatisticsResponse.EvaluationResults.Length"); i++) {
			EvaluationResultsItem evaluationResultsItem = new EvaluationResultsItem();
			evaluationResultsItem.setAccountId(_ctx.longValue("ListConfigRuleEvaluationStatisticsResponse.EvaluationResults["+ i +"].AccountId"));
			evaluationResultsItem.setNonCompliantResourceCnt(_ctx.integerValue("ListConfigRuleEvaluationStatisticsResponse.EvaluationResults["+ i +"].NonCompliantResourceCnt"));
			evaluationResultsItem.setTotalResourceCnt(_ctx.integerValue("ListConfigRuleEvaluationStatisticsResponse.EvaluationResults["+ i +"].TotalResourceCnt"));
			evaluationResultsItem.setNonCompliantRuleCnt(_ctx.integerValue("ListConfigRuleEvaluationStatisticsResponse.EvaluationResults["+ i +"].NonCompliantRuleCnt"));
			evaluationResultsItem.setTotalRuleCnt(_ctx.integerValue("ListConfigRuleEvaluationStatisticsResponse.EvaluationResults["+ i +"].TotalRuleCnt"));
			evaluationResultsItem.setGmtCreate(_ctx.longValue("ListConfigRuleEvaluationStatisticsResponse.EvaluationResults["+ i +"].GmtCreate"));
			evaluationResultsItem.setNonCompliantRuleDetail(_ctx.stringValue("ListConfigRuleEvaluationStatisticsResponse.EvaluationResults["+ i +"].NonCompliantRuleDetail"));
			evaluationResultsItem.setStatisticDate(_ctx.stringValue("ListConfigRuleEvaluationStatisticsResponse.EvaluationResults["+ i +"].StatisticDate"));

			evaluationResults.add(evaluationResultsItem);
		}
		listConfigRuleEvaluationStatisticsResponse.setEvaluationResults(evaluationResults);
	 
	 	return listConfigRuleEvaluationStatisticsResponse;
	}
}