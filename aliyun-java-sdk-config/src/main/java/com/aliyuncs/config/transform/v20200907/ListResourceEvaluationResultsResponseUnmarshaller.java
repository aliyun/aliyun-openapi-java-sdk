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

import com.aliyuncs.config.model.v20200907.ListResourceEvaluationResultsResponse;
import com.aliyuncs.config.model.v20200907.ListResourceEvaluationResultsResponse.EvaluationResults;
import com.aliyuncs.config.model.v20200907.ListResourceEvaluationResultsResponse.EvaluationResults.EvaluationResult;
import com.aliyuncs.config.model.v20200907.ListResourceEvaluationResultsResponse.EvaluationResults.EvaluationResult.EvaluationResultIdentifier;
import com.aliyuncs.config.model.v20200907.ListResourceEvaluationResultsResponse.EvaluationResults.EvaluationResult.EvaluationResultIdentifier.EvaluationResultQualifier;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceEvaluationResultsResponseUnmarshaller {

	public static ListResourceEvaluationResultsResponse unmarshall(ListResourceEvaluationResultsResponse listResourceEvaluationResultsResponse, UnmarshallerContext _ctx) {
		
		listResourceEvaluationResultsResponse.setRequestId(_ctx.stringValue("ListResourceEvaluationResultsResponse.RequestId"));

		EvaluationResults evaluationResults = new EvaluationResults();
		evaluationResults.setNextToken(_ctx.stringValue("ListResourceEvaluationResultsResponse.EvaluationResults.NextToken"));
		evaluationResults.setMaxResults(_ctx.integerValue("ListResourceEvaluationResultsResponse.EvaluationResults.MaxResults"));

		List<EvaluationResult> evaluationResultList = new ArrayList<EvaluationResult>();
		for (int i = 0; i < _ctx.lengthValue("ListResourceEvaluationResultsResponse.EvaluationResults.EvaluationResultList.Length"); i++) {
			EvaluationResult evaluationResult = new EvaluationResult();
			evaluationResult.setRiskLevel(_ctx.integerValue("ListResourceEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].RiskLevel"));
			evaluationResult.setComplianceType(_ctx.stringValue("ListResourceEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].ComplianceType"));
			evaluationResult.setResultRecordedTimestamp(_ctx.longValue("ListResourceEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].ResultRecordedTimestamp"));
			evaluationResult.setAnnotation(_ctx.stringValue("ListResourceEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].Annotation"));
			evaluationResult.setConfigRuleInvokedTimestamp(_ctx.longValue("ListResourceEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].ConfigRuleInvokedTimestamp"));
			evaluationResult.setInvokingEventMessageType(_ctx.stringValue("ListResourceEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].InvokingEventMessageType"));
			evaluationResult.setRemediationEnabled(_ctx.booleanValue("ListResourceEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].RemediationEnabled"));

			EvaluationResultIdentifier evaluationResultIdentifier = new EvaluationResultIdentifier();
			evaluationResultIdentifier.setOrderingTimestamp(_ctx.longValue("ListResourceEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.OrderingTimestamp"));

			EvaluationResultQualifier evaluationResultQualifier = new EvaluationResultQualifier();
			evaluationResultQualifier.setConfigRuleArn(_ctx.stringValue("ListResourceEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.EvaluationResultQualifier.ConfigRuleArn"));
			evaluationResultQualifier.setResourceType(_ctx.stringValue("ListResourceEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.EvaluationResultQualifier.ResourceType"));
			evaluationResultQualifier.setConfigRuleName(_ctx.stringValue("ListResourceEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.EvaluationResultQualifier.ConfigRuleName"));
			evaluationResultQualifier.setResourceId(_ctx.stringValue("ListResourceEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.EvaluationResultQualifier.ResourceId"));
			evaluationResultQualifier.setConfigRuleId(_ctx.stringValue("ListResourceEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.EvaluationResultQualifier.ConfigRuleId"));
			evaluationResultQualifier.setResourceName(_ctx.stringValue("ListResourceEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.EvaluationResultQualifier.ResourceName"));
			evaluationResultQualifier.setRegionId(_ctx.stringValue("ListResourceEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.EvaluationResultQualifier.RegionId"));
			evaluationResultQualifier.setIgnoreDate(_ctx.stringValue("ListResourceEvaluationResultsResponse.EvaluationResults.EvaluationResultList["+ i +"].EvaluationResultIdentifier.EvaluationResultQualifier.IgnoreDate"));
			evaluationResultIdentifier.setEvaluationResultQualifier(evaluationResultQualifier);
			evaluationResult.setEvaluationResultIdentifier(evaluationResultIdentifier);

			evaluationResultList.add(evaluationResult);
		}
		evaluationResults.setEvaluationResultList(evaluationResultList);
		listResourceEvaluationResultsResponse.setEvaluationResults(evaluationResults);
	 
	 	return listResourceEvaluationResultsResponse;
	}
}