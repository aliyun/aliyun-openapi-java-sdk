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

package com.aliyuncs.config.transform.v20190108;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20190108.DescribeEvaluationResultsResponse;
import com.aliyuncs.config.model.v20190108.DescribeEvaluationResultsResponse.EvaluationResults;
import com.aliyuncs.config.model.v20190108.DescribeEvaluationResultsResponse.EvaluationResults.EvaluationResult;
import com.aliyuncs.config.model.v20190108.DescribeEvaluationResultsResponse.EvaluationResults.EvaluationResult.EvaluationResultIdentifier;
import com.aliyuncs.config.model.v20190108.DescribeEvaluationResultsResponse.EvaluationResults.EvaluationResult.EvaluationResultIdentifier.EvaluationResultQualifier;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEvaluationResultsResponseUnmarshaller {

	public static DescribeEvaluationResultsResponse unmarshall(DescribeEvaluationResultsResponse describeEvaluationResultsResponse, UnmarshallerContext _ctx) {
		
		describeEvaluationResultsResponse.setRequestId(_ctx.stringValue("DescribeEvaluationResultsResponse.RequestId"));

		EvaluationResults evaluationResults = new EvaluationResults();
		evaluationResults.setPageNumber(_ctx.integerValue("DescribeEvaluationResultsResponse.EvaluationResults.PageNumber"));
		evaluationResults.setPageSize(_ctx.integerValue("DescribeEvaluationResultsResponse.EvaluationResults.PageSize"));
		evaluationResults.setTotalCount(_ctx.longValue("DescribeEvaluationResultsResponse.EvaluationResults.TotalCount"));

		List<EvaluationResult> evaluationResultList = new ArrayList<EvaluationResult>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEvaluationResultsResponse.EvaluationResults.EvaluationResultList.Length"); i++) {
			EvaluationResult evaluationResult = new EvaluationResult();
			evaluationResult.setAnnotation(_ctx.stringValue("DescribeEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].Annotation"));
			evaluationResult.setComplianceType(_ctx.stringValue("DescribeEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].ComplianceType"));
			evaluationResult.setConfigRuleInvokedTimestamp(_ctx.longValue("DescribeEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].ConfigRuleInvokedTimestamp"));
			evaluationResult.setInvokingEventMessageType(_ctx.stringValue("DescribeEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].InvokingEventMessageType"));
			evaluationResult.setResultRecordedTimestamp(_ctx.longValue("DescribeEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].ResultRecordedTimestamp"));
			evaluationResult.setRiskLevel(_ctx.integerValue("DescribeEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].RiskLevel"));

			EvaluationResultIdentifier evaluationResultIdentifier = new EvaluationResultIdentifier();
			evaluationResultIdentifier.setOrderingTimestamp(_ctx.longValue("DescribeEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.OrderingTimestamp"));

			EvaluationResultQualifier evaluationResultQualifier = new EvaluationResultQualifier();
			evaluationResultQualifier.setConfigRuleArn(_ctx.stringValue("DescribeEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.EvaluationResultQualifier.ConfigRuleArn"));
			evaluationResultQualifier.setConfigRuleId(_ctx.stringValue("DescribeEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.EvaluationResultQualifier.ConfigRuleId"));
			evaluationResultQualifier.setConfigRuleName(_ctx.stringValue("DescribeEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.EvaluationResultQualifier.ConfigRuleName"));
			evaluationResultQualifier.setResourceId(_ctx.stringValue("DescribeEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.EvaluationResultQualifier.ResourceId"));
			evaluationResultQualifier.setResourceType(_ctx.stringValue("DescribeEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.EvaluationResultQualifier.ResourceType"));
			evaluationResultQualifier.setRegionId(_ctx.stringValue("DescribeEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.EvaluationResultQualifier.RegionId"));
			evaluationResultIdentifier.setEvaluationResultQualifier(evaluationResultQualifier);
			evaluationResult.setEvaluationResultIdentifier(evaluationResultIdentifier);

			evaluationResultList.add(evaluationResult);
		}
		evaluationResults.setEvaluationResultList(evaluationResultList);
		describeEvaluationResultsResponse.setEvaluationResults(evaluationResults);
	 
	 	return describeEvaluationResultsResponse;
	}
}