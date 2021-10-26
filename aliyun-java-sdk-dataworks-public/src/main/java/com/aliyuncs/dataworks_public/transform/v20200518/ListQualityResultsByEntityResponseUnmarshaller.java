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
		listQualityResultsByEntityResponse.setSuccess(_ctx.booleanValue("ListQualityResultsByEntityResponse.Success"));
		listQualityResultsByEntityResponse.setErrorCode(_ctx.stringValue("ListQualityResultsByEntityResponse.ErrorCode"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListQualityResultsByEntityResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListQualityResultsByEntityResponse.Data.PageSize"));
		data.setTotalCount(_ctx.longValue("ListQualityResultsByEntityResponse.Data.TotalCount"));

		List<RuleChecksItem> ruleChecks = new ArrayList<RuleChecksItem>();
		for (int i = 0; i < _ctx.lengthValue("ListQualityResultsByEntityResponse.Data.RuleChecks.Length"); i++) {
			RuleChecksItem ruleChecksItem = new RuleChecksItem();
			ruleChecksItem.setBlockType(_ctx.integerValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].BlockType"));
			ruleChecksItem.setWarningThreshold(_ctx.floatValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].WarningThreshold"));
			ruleChecksItem.setProperty(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].Property"));
			ruleChecksItem.setTableName(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].TableName"));
			ruleChecksItem.setComment(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].Comment"));
			ruleChecksItem.setCheckResultStatus(_ctx.integerValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].CheckResultStatus"));
			ruleChecksItem.setTemplateName(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].TemplateName"));
			ruleChecksItem.setCheckerName(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].CheckerName"));
			ruleChecksItem.setRuleId(_ctx.integerValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].RuleId"));
			ruleChecksItem.setFixedCheck(_ctx.booleanValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].FixedCheck"));
			ruleChecksItem.setOp(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].Op"));
			ruleChecksItem.setUpperValue(_ctx.floatValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].UpperValue"));
			ruleChecksItem.setActualExpression(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].ActualExpression"));
			ruleChecksItem.setExternalId(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].ExternalId"));
			ruleChecksItem.setTimeCost(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].TimeCost"));
			ruleChecksItem.setTrend(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].Trend"));
			ruleChecksItem.setExternalType(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].ExternalType"));
			ruleChecksItem.setBizDate(_ctx.longValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].BizDate"));
			ruleChecksItem.setCheckResult(_ctx.integerValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].CheckResult"));
			ruleChecksItem.setResultString(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].ResultString"));
			ruleChecksItem.setMatchExpression(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].MatchExpression"));
			ruleChecksItem.setCheckerType(_ctx.integerValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].CheckerType"));
			ruleChecksItem.setProjectName(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].ProjectName"));
			ruleChecksItem.setBeginTime(_ctx.longValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].BeginTime"));
			ruleChecksItem.setDateType(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].DateType"));
			ruleChecksItem.setCriticalThreshold(_ctx.floatValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].CriticalThreshold"));
			ruleChecksItem.setIsPrediction(_ctx.booleanValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].IsPrediction"));
			ruleChecksItem.setRuleName(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].RuleName"));
			ruleChecksItem.setCheckerId(_ctx.integerValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].CheckerId"));
			ruleChecksItem.setDiscreteCheck(_ctx.booleanValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].DiscreteCheck"));
			ruleChecksItem.setEndTime(_ctx.longValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].EndTime"));
			ruleChecksItem.setMethodName(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].MethodName"));
			ruleChecksItem.setLowerValue(_ctx.floatValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].LowerValue"));
			ruleChecksItem.setEntityId(_ctx.integerValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].EntityId"));
			ruleChecksItem.setWhereCondition(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].WhereCondition"));
			ruleChecksItem.setExpectValue(_ctx.floatValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].ExpectValue"));
			ruleChecksItem.setTemplateId(_ctx.integerValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].TemplateId"));
			ruleChecksItem.setTaskId(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].TaskId"));
			ruleChecksItem.setId(_ctx.integerValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].Id"));

			List<ReferenceValueItem> referenceValue = new ArrayList<ReferenceValueItem>();
			for (int j = 0; j < _ctx.lengthValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].ReferenceValue.Length"); j++) {
				ReferenceValueItem referenceValueItem = new ReferenceValueItem();
				referenceValueItem.setDiscreteProperty(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].ReferenceValue["+ j +"].DiscreteProperty"));
				referenceValueItem.setValue(_ctx.floatValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].ReferenceValue["+ j +"].Value"));
				referenceValueItem.setBizDate(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].ReferenceValue["+ j +"].BizDate"));
				referenceValueItem.setSingleCheckResult(_ctx.integerValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].ReferenceValue["+ j +"].SingleCheckResult"));
				referenceValueItem.setThreshold(_ctx.floatValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].ReferenceValue["+ j +"].Threshold"));

				referenceValue.add(referenceValueItem);
			}
			ruleChecksItem.setReferenceValue(referenceValue);

			List<SampleValueItem> sampleValue = new ArrayList<SampleValueItem>();
			for (int j = 0; j < _ctx.lengthValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].SampleValue.Length"); j++) {
				SampleValueItem sampleValueItem = new SampleValueItem();
				sampleValueItem.setDiscreteProperty(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].SampleValue["+ j +"].DiscreteProperty"));
				sampleValueItem.setBizDate(_ctx.stringValue("ListQualityResultsByEntityResponse.Data.RuleChecks["+ i +"].SampleValue["+ j +"].BizDate"));
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