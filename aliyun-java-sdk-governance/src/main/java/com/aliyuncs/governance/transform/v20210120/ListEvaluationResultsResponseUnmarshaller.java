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

import com.aliyuncs.governance.model.v20210120.ListEvaluationResultsResponse;
import com.aliyuncs.governance.model.v20210120.ListEvaluationResultsResponse.Results;
import com.aliyuncs.governance.model.v20210120.ListEvaluationResultsResponse.Results.CategoryResultsItem;
import com.aliyuncs.governance.model.v20210120.ListEvaluationResultsResponse.Results.GroupResultsItem;
import com.aliyuncs.governance.model.v20210120.ListEvaluationResultsResponse.Results.MetricResult;
import com.aliyuncs.governance.model.v20210120.ListEvaluationResultsResponse.Results.MetricResult.ErrorInfo;
import com.aliyuncs.governance.model.v20210120.ListEvaluationResultsResponse.Results.MetricResult.ResourcesSummary;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEvaluationResultsResponseUnmarshaller {

	public static ListEvaluationResultsResponse unmarshall(ListEvaluationResultsResponse listEvaluationResultsResponse, UnmarshallerContext _ctx) {
		
		listEvaluationResultsResponse.setRequestId(_ctx.stringValue("ListEvaluationResultsResponse.RequestId"));
		listEvaluationResultsResponse.setAccountId(_ctx.longValue("ListEvaluationResultsResponse.AccountId"));

		Results results = new Results();
		results.setEvaluationTime(_ctx.stringValue("ListEvaluationResultsResponse.Results.EvaluationTime"));
		results.setStatus(_ctx.stringValue("ListEvaluationResultsResponse.Results.Status"));
		results.setTotalScore(_ctx.doubleValue("ListEvaluationResultsResponse.Results.TotalScore"));

		List<CategoryResultsItem> categoryResults = new ArrayList<CategoryResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEvaluationResultsResponse.Results.CategoryResults.Length"); i++) {
			CategoryResultsItem categoryResultsItem = new CategoryResultsItem();
			categoryResultsItem.setId(_ctx.stringValue("ListEvaluationResultsResponse.Results.CategoryResults["+ i +"].Id"));
			categoryResultsItem.setResult(_ctx.doubleValue("ListEvaluationResultsResponse.Results.CategoryResults["+ i +"].Result"));

			categoryResults.add(categoryResultsItem);
		}
		results.setCategoryResults(categoryResults);

		List<GroupResultsItem> groupResults = new ArrayList<GroupResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEvaluationResultsResponse.Results.GroupResults.Length"); i++) {
			GroupResultsItem groupResultsItem = new GroupResultsItem();
			groupResultsItem.setId(_ctx.stringValue("ListEvaluationResultsResponse.Results.GroupResults["+ i +"].Id"));
			groupResultsItem.setPotentialScoreIncrease(_ctx.doubleValue("ListEvaluationResultsResponse.Results.GroupResults["+ i +"].PotentialScoreIncrease"));

			groupResults.add(groupResultsItem);
		}
		results.setGroupResults(groupResults);

		List<MetricResult> metricResults = new ArrayList<MetricResult>();
		for (int i = 0; i < _ctx.lengthValue("ListEvaluationResultsResponse.Results.MetricResults.Length"); i++) {
			MetricResult metricResult = new MetricResult();
			metricResult.setEvaluationTime(_ctx.stringValue("ListEvaluationResultsResponse.Results.MetricResults["+ i +"].EvaluationTime"));
			metricResult.setId(_ctx.stringValue("ListEvaluationResultsResponse.Results.MetricResults["+ i +"].Id"));
			metricResult.setResult(_ctx.doubleValue("ListEvaluationResultsResponse.Results.MetricResults["+ i +"].Result"));
			metricResult.setRisk(_ctx.stringValue("ListEvaluationResultsResponse.Results.MetricResults["+ i +"].Risk"));
			metricResult.setStatus(_ctx.stringValue("ListEvaluationResultsResponse.Results.MetricResults["+ i +"].Status"));

			ErrorInfo errorInfo = new ErrorInfo();
			errorInfo.setCode(_ctx.stringValue("ListEvaluationResultsResponse.Results.MetricResults["+ i +"].ErrorInfo.Code"));
			errorInfo.setMessage(_ctx.stringValue("ListEvaluationResultsResponse.Results.MetricResults["+ i +"].ErrorInfo.Message"));
			metricResult.setErrorInfo(errorInfo);

			ResourcesSummary resourcesSummary = new ResourcesSummary();
			resourcesSummary.setNonCompliant(_ctx.integerValue("ListEvaluationResultsResponse.Results.MetricResults["+ i +"].ResourcesSummary.NonCompliant"));
			metricResult.setResourcesSummary(resourcesSummary);

			metricResults.add(metricResult);
		}
		results.setMetricResults(metricResults);
		listEvaluationResultsResponse.setResults(results);
	 
	 	return listEvaluationResultsResponse;
	}
}