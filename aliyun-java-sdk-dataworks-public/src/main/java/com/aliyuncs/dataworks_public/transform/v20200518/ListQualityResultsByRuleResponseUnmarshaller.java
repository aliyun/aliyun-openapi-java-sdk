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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListQualityResultsByRuleResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListQualityResultsByRuleResponse.QualityResults;
import com.aliyuncs.dataworks_public.model.v20200518.ListQualityResultsByRuleResponse.QualityResults.RuleChecksItem;
import com.aliyuncs.dataworks_public.model.v20200518.ListQualityResultsByRuleResponse.QualityResults.RuleChecksItem.ReferenceValueItem;
import com.aliyuncs.dataworks_public.model.v20200518.ListQualityResultsByRuleResponse.QualityResults.RuleChecksItem.SampleValueItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQualityResultsByRuleResponseUnmarshaller {

	public static ListQualityResultsByRuleResponse unmarshall(ListQualityResultsByRuleResponse listQualityResultsByRuleResponse, UnmarshallerContext _ctx) {
		
		listQualityResultsByRuleResponse.setRequestId(_ctx.stringValue("ListQualityResultsByRuleResponse.RequestId"));

		QualityResults qualityResults = new QualityResults();
		qualityResults.setTotalCount(_ctx.longValue("ListQualityResultsByRuleResponse.QualityResults.TotalCount"));
		qualityResults.setPageNumber(_ctx.integerValue("ListQualityResultsByRuleResponse.QualityResults.PageNumber"));
		qualityResults.setPageSize(_ctx.integerValue("ListQualityResultsByRuleResponse.QualityResults.PageSize"));

		List<RuleChecksItem> ruleChecks = new ArrayList<RuleChecksItem>();
		for (int i = 0; i < _ctx.lengthValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks.Length"); i++) {
			RuleChecksItem ruleChecksItem = new RuleChecksItem();
			ruleChecksItem.setId(_ctx.integerValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].Id"));
			ruleChecksItem.setTaskId(_ctx.stringValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].TaskId"));
			ruleChecksItem.setEntityId(_ctx.integerValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].EntityId"));
			ruleChecksItem.setRuleId(_ctx.integerValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].RuleId"));
			ruleChecksItem.setProperty(_ctx.stringValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].Property"));
			ruleChecksItem.setBizDate(_ctx.longValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].BizDate"));
			ruleChecksItem.setDateType(_ctx.stringValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].DateType"));
			ruleChecksItem.setActualExpression(_ctx.stringValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].ActualExpression"));
			ruleChecksItem.setMatchExpression(_ctx.stringValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].MatchExpression"));
			ruleChecksItem.setBlockType(_ctx.integerValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].BlockType"));
			ruleChecksItem.setCheckResult(_ctx.integerValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].CheckResult"));
			ruleChecksItem.setCheckResultStatus(_ctx.integerValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].CheckResultStatus"));
			ruleChecksItem.setMethodName(_ctx.stringValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].MethodName"));
			ruleChecksItem.setComment(_ctx.stringValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].Comment"));
			ruleChecksItem.setWhereCondition(_ctx.stringValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].WhereCondition"));
			ruleChecksItem.setBeginTime(_ctx.longValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].BeginTime"));
			ruleChecksItem.setEndTime(_ctx.longValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].EndTime"));
			ruleChecksItem.setTimeCost(_ctx.stringValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].TimeCost"));
			ruleChecksItem.setExternalType(_ctx.stringValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].ExternalType"));
			ruleChecksItem.setExternalId(_ctx.stringValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].ExternalId"));
			ruleChecksItem.setDiscreteCheck(_ctx.booleanValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].DiscreteCheck"));
			ruleChecksItem.setFixedCheck(_ctx.booleanValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].FixedCheck"));
			ruleChecksItem.setTrend(_ctx.stringValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].Trend"));
			ruleChecksItem.setWarningThreshold(_ctx.floatValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].WarningThreshold"));
			ruleChecksItem.setCriticalThreshold(_ctx.floatValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].CriticalThreshold"));
			ruleChecksItem.setExpectValue(_ctx.floatValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].ExpectValue"));
			ruleChecksItem.setOp(_ctx.stringValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].Op"));
			ruleChecksItem.setProjectName(_ctx.stringValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].ProjectName"));
			ruleChecksItem.setTableName(_ctx.stringValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].TableName"));
			ruleChecksItem.setTemplateId(_ctx.integerValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].TemplateId"));
			ruleChecksItem.setTemplateName(_ctx.stringValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].TemplateName"));
			ruleChecksItem.setResultString(_ctx.stringValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].ResultString"));
			ruleChecksItem.setCheckerId(_ctx.integerValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].CheckerId"));
			ruleChecksItem.setCheckerType(_ctx.integerValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].CheckerType"));
			ruleChecksItem.setRuleName(_ctx.stringValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].RuleName"));
			ruleChecksItem.setIsPrediction(_ctx.booleanValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].IsPrediction"));
			ruleChecksItem.setUpperValue(_ctx.floatValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].UpperValue"));
			ruleChecksItem.setLowerValue(_ctx.floatValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].LowerValue"));
			ruleChecksItem.setCheckerName(_ctx.stringValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].CheckerName"));

			List<ReferenceValueItem> referenceValue = new ArrayList<ReferenceValueItem>();
			for (int j = 0; j < _ctx.lengthValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].ReferenceValue.Length"); j++) {
				ReferenceValueItem referenceValueItem = new ReferenceValueItem();
				referenceValueItem.setBizDate(_ctx.longValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].ReferenceValue["+ j +"].BizDate"));
				referenceValueItem.setDiscreteProperty(_ctx.stringValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].ReferenceValue["+ j +"].DiscreteProperty"));
				referenceValueItem.setValue(_ctx.floatValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].ReferenceValue["+ j +"].Value"));
				referenceValueItem.setThreshold(_ctx.floatValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].ReferenceValue["+ j +"].Threshold"));
				referenceValueItem.setSingleCheckResult(_ctx.integerValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].ReferenceValue["+ j +"].SingleCheckResult"));

				referenceValue.add(referenceValueItem);
			}
			ruleChecksItem.setReferenceValue(referenceValue);

			List<SampleValueItem> sampleValue = new ArrayList<SampleValueItem>();
			for (int j = 0; j < _ctx.lengthValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].SampleValue.Length"); j++) {
				SampleValueItem sampleValueItem = new SampleValueItem();
				sampleValueItem.setBizDate(_ctx.longValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].SampleValue["+ j +"].BizDate"));
				sampleValueItem.setDiscreteProperty(_ctx.stringValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].SampleValue["+ j +"].DiscreteProperty"));
				sampleValueItem.setValue(_ctx.floatValue("ListQualityResultsByRuleResponse.QualityResults.RuleChecks["+ i +"].SampleValue["+ j +"].Value"));

				sampleValue.add(sampleValueItem);
			}
			ruleChecksItem.setSampleValue(sampleValue);

			ruleChecks.add(ruleChecksItem);
		}
		qualityResults.setRuleChecks(ruleChecks);
		listQualityResultsByRuleResponse.setQualityResults(qualityResults);
	 
	 	return listQualityResultsByRuleResponse;
	}
}