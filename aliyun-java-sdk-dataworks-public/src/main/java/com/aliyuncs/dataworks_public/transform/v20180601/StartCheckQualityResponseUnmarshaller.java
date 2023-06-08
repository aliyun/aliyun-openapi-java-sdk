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

package com.aliyuncs.dataworks_public.transform.v20180601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20180601.StartCheckQualityResponse;
import com.aliyuncs.dataworks_public.model.v20180601.StartCheckQualityResponse.ReturnValue;
import com.aliyuncs.dataworks_public.model.v20180601.StartCheckQualityResponse.ReturnValue.ResultsItem;
import com.aliyuncs.dataworks_public.model.v20180601.StartCheckQualityResponse.ReturnValue.ResultsItem.ActualResultItem;
import com.aliyuncs.dataworks_public.model.v20180601.StartCheckQualityResponse.ReturnValue.ResultsItem.SampleResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartCheckQualityResponseUnmarshaller {

	public static StartCheckQualityResponse unmarshall(StartCheckQualityResponse startCheckQualityResponse, UnmarshallerContext _ctx) {
		
		startCheckQualityResponse.setRequestId(_ctx.stringValue("StartCheckQualityResponse.RequestId"));
		startCheckQualityResponse.setReturnCode(_ctx.stringValue("StartCheckQualityResponse.ReturnCode"));

		ReturnValue returnValue = new ReturnValue();
		returnValue.setSuccess(_ctx.booleanValue("StartCheckQualityResponse.ReturnValue.Success"));
		returnValue.setTaskId(_ctx.stringValue("StartCheckQualityResponse.ReturnValue.TaskId"));

		List<ResultsItem> results = new ArrayList<ResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("StartCheckQualityResponse.ReturnValue.Results.Length"); i++) {
			ResultsItem resultsItem = new ResultsItem();
			resultsItem.setActualExpression(_ctx.stringValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].ActualExpression"));
			resultsItem.setBizdate(_ctx.stringValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].Bizdate"));
			resultsItem.setBlockType(_ctx.longValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].BlockType"));
			resultsItem.setCheckResult(_ctx.longValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].CheckResult"));
			resultsItem.setCheckerName(_ctx.stringValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].CheckerName"));
			resultsItem.setContainStrongRule(_ctx.longValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].ContainStrongRule"));
			resultsItem.setCriticalThreshold(_ctx.stringValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].CriticalThreshold"));
			resultsItem.setDateType(_ctx.stringValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].DateType"));
			resultsItem.setEntityName(_ctx.stringValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].EntityName"));
			resultsItem.setExternalId(_ctx.stringValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].ExternalId"));
			resultsItem.setExternalType(_ctx.stringValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].ExternalType"));
			resultsItem.setFinishTime(_ctx.stringValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].FinishTime"));
			resultsItem.setIfFixedCheck(_ctx.longValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].IfFixedCheck"));
			resultsItem.setMatchExpression(_ctx.stringValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].MatchExpression"));
			resultsItem.setMethodId(_ctx.longValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].MethodId"));
			resultsItem.setMethodName(_ctx.stringValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].MethodName"));
			resultsItem.setProjectName(_ctx.stringValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].ProjectName"));
			resultsItem.setProperty(_ctx.stringValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].Property"));
			resultsItem.setRuleId(_ctx.longValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].RuleId"));
			resultsItem.setTaskLevel(_ctx.longValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].TaskLevel"));
			resultsItem.setTaskStatus(_ctx.longValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].TaskStatus"));
			resultsItem.setTrend(_ctx.stringValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].Trend"));
			resultsItem.setWarningThreshold(_ctx.stringValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].WarningThreshold"));
			resultsItem.setWhereCondition(_ctx.stringValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].WhereCondition"));

			List<ActualResultItem> actualResult = new ArrayList<ActualResultItem>();
			for (int j = 0; j < _ctx.lengthValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].ActualResult.Length"); j++) {
				ActualResultItem actualResultItem = new ActualResultItem();
				actualResultItem.setActualThreshold(_ctx.stringValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].ActualResult["+ j +"].ActualThreshold"));
				actualResultItem.setBizDate(_ctx.stringValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].ActualResult["+ j +"].BizDate"));
				actualResultItem.setProperty(_ctx.stringValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].ActualResult["+ j +"].Property"));
				actualResultItem.setResult(_ctx.stringValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].ActualResult["+ j +"].Result"));
				actualResultItem.setStatus(_ctx.longValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].ActualResult["+ j +"].Status"));

				actualResult.add(actualResultItem);
			}
			resultsItem.setActualResult(actualResult);

			List<SampleResultItem> sampleResult = new ArrayList<SampleResultItem>();
			for (int j = 0; j < _ctx.lengthValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].SampleResult.Length"); j++) {
				SampleResultItem sampleResultItem = new SampleResultItem();
				sampleResultItem.setBizDate(_ctx.stringValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].SampleResult["+ j +"].BizDate"));
				sampleResultItem.setProperty(_ctx.stringValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].SampleResult["+ j +"].Property"));
				sampleResultItem.setResult(_ctx.stringValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].SampleResult["+ j +"].Result"));
				sampleResultItem.setStatus(_ctx.longValue("StartCheckQualityResponse.ReturnValue.Results["+ i +"].SampleResult["+ j +"].Status"));

				sampleResult.add(sampleResultItem);
			}
			resultsItem.setSampleResult(sampleResult);

			results.add(resultsItem);
		}
		returnValue.setResults(results);
		startCheckQualityResponse.setReturnValue(returnValue);
	 
	 	return startCheckQualityResponse;
	}
}