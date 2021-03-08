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

import com.aliyuncs.dataworks_public.model.v20200518.ListQualityResultsByEntityResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListQualityResultsByEntityResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListQualityResultsByEntityResponse.Data.RuleChecksItem;
import com.aliyuncs.dataworks_public.model.v20200518.ListQualityResultsByEntityResponse.Data.RuleChecksItem.ReferenceValueItem;
import com.aliyuncs.dataworks_public.model.v20200518.ListQualityResultsByEntityResponse.Data.RuleChecksItem.SampleValueItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQualityResultsByEntityResponseUnmarshaller {

	public static ListQualityResultsByEntityResponse unmarshall(ListQualityResultsByEntityResponse listQualityResultsByEntityResponse, UnmarshallerContext _ctx) {
		
		listQualityResultsByEntityResponse.setRequestId(_ctx.stringValue("ListQualityResultsByEntityResponse.RequestId"));
		listQualityResultsByEntityResponse.setHttpStatusCode(_ctx.integerValue("ListQualityResultsByEntityResponse.HttpStatusCode"));
		listQualityResultsByEntityResponse.setErrorMessage(_ctx.stringValue("ListQualityResultsByEntityResponse.ErrorMessage"));
		listQualityResultsByEntityResponse.setErrorCode(_ctx.stringValue("ListQualityResultsByEntityResponse.ErrorCode"));
		listQualityResultsByEntityResponse.setSuccess(_ctx.booleanValue("ListQualityResultsByEntityResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListQualityResultsByEntityResponse.Data.TotalCount"));
		data.setPageNumber(_ctx.integerValue("ListQualityResultsByEntityResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListQualityResultsByEntityResponse.Data.PageSize"));

		List<RuleChecksItem> ruleChecks = new ArrayList<RuleChecksItem>();
		for (int i = 0; i < _ctx.lengthValue("ListQualityResultsByEntityResponse.Data.RuleChecks.Length"); i++) {
			RuleChecksItem ruleChecksItem = new RuleChecksItem();
			ruleChecksItem.setId(_ctx.integerValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].Id"));
			ruleChecksItem.setTaskId(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].TaskId"));
			ruleChecksItem.setEntityId(_ctx.integerValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].EntityId"));
			ruleChecksItem.setRuleId(_ctx.integerValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].RuleId"));
			ruleChecksItem.setProperty(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].Property"));
			ruleChecksItem.setBizDate(_ctx.longValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].BizDate"));
			ruleChecksItem.setDateType(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].DateType"));
			ruleChecksItem.setActualExpression(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].ActualExpression"));
			ruleChecksItem.setMatchExpression(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].MatchExpression"));
			ruleChecksItem.setBlockType(_ctx.integerValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].BlockType"));
			ruleChecksItem.setCheckResult(_ctx.integerValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].CheckResult"));
			ruleChecksItem.setCheckResultStatus(_ctx.integerValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].CheckResultStatus"));
			ruleChecksItem.setMethodName(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].MethodName"));
			ruleChecksItem.setComment(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].Comment"));
			ruleChecksItem.setWhereCondition(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].WhereCondition"));
			ruleChecksItem.setBeginTime(_ctx.longValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].BeginTime"));
			ruleChecksItem.setEndTime(_ctx.longValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].EndTime"));
			ruleChecksItem.setTimeCost(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].TimeCost"));
			ruleChecksItem.setExternalType(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].ExternalType"));
			ruleChecksItem.setExternalId(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].ExternalId"));
			ruleChecksItem.setDiscreteCheck(_ctx.booleanValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].DiscreteCheck"));
			ruleChecksItem.setFixedCheck(_ctx.booleanValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].FixedCheck"));
			ruleChecksItem.setTrend(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].Trend"));
			ruleChecksItem.setWarningThreshold(_ctx.floatValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].WarningThreshold"));
			ruleChecksItem.setCriticalThreshold(_ctx.floatValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].CriticalThreshold"));
			ruleChecksItem.setExpectValue(_ctx.floatValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].ExpectValue"));
			ruleChecksItem.setOp(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].Op"));
			ruleChecksItem.setProjectName(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].ProjectName"));
			ruleChecksItem.setTableName(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].TableName"));
			ruleChecksItem.setTemplateId(_ctx.integerValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].TemplateId"));
			ruleChecksItem.setTemplateName(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].TemplateName"));
			ruleChecksItem.setResultString(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].ResultString"));
			ruleChecksItem.setCheckerId(_ctx.integerValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].CheckerId"));
			ruleChecksItem.setCheckerType(_ctx.integerValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].CheckerType"));
			ruleChecksItem.setRuleName(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].RuleName"));
			ruleChecksItem.setIsPrediction(_ctx.booleanValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].IsPrediction"));
			ruleChecksItem.setUpperValue(_ctx.floatValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].UpperValue"));
			ruleChecksItem.setLowerValue(_ctx.floatValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].LowerValue"));
			ruleChecksItem.setCheckerName(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].CheckerName"));

			List<ReferenceValueItem> referenceValue = new ArrayList<ReferenceValueItem>();
			for (int j = 0; j < _ctx.lengthValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].ReferenceValue.Length"); j++) {
				ReferenceValueItem referenceValueItem = new ReferenceValueItem();
				referenceValueItem.setBizDate(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].ReferenceValue["+ j +"].BizDate"));
				referenceValueItem.setDiscreteProperty(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].ReferenceValue["+ j +"].DiscreteProperty"));
				referenceValueItem.setValue(_ctx.floatValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].ReferenceValue["+ j +"].Value"));
				referenceValueItem.setThreshold(_ctx.floatValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].ReferenceValue["+ j +"].Threshold"));
				referenceValueItem.setSingleCheckResult(_ctx.integerValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].ReferenceValue["+ j +"].SingleCheckResult"));

				referenceValue.add(referenceValueItem);
			}
			ruleChecksItem.setReferenceValue(referenceValue);

			List<SampleValueItem> sampleValue = new ArrayList<SampleValueItem>();
			for (int j = 0; j < _ctx.lengthValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].SampleValue.Length"); j++) {
				SampleValueItem sampleValueItem = new SampleValueItem();
				sampleValueItem.setBizDate(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].SampleValue["+ j +"].BizDate"));
				sampleValueItem.setDiscreteProperty(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].SampleValue["+ j +"].DiscreteProperty"));
				sampleValueItem.setValue(_ctx.floatValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].SampleValue["+ j +"].Value"));

				sampleValue.add(sampleValueItem);
			}
			ruleChecksItem.setSampleValue(sampleValue);

			ruleChecks.add(ruleChecksItem);
		}
		data.setRuleChecks(ruleChecks);
		listQualityResultsByEntityResponse.setData(data);
	 
	 	return listQualityResultsByEntityResponse;
	}
}