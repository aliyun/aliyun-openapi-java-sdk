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

import com.aliyuncs.dataworks_public.model.v20200518.GetQualityRuleResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetQualityRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQualityRuleResponseUnmarshaller {

	public static GetQualityRuleResponse unmarshall(GetQualityRuleResponse getQualityRuleResponse, UnmarshallerContext _ctx) {
		
		getQualityRuleResponse.setRequestId(_ctx.stringValue("GetQualityRuleResponse.RequestId"));
		getQualityRuleResponse.setHttpStatusCode(_ctx.integerValue("GetQualityRuleResponse.HttpStatusCode"));
		getQualityRuleResponse.setErrorMessage(_ctx.stringValue("GetQualityRuleResponse.ErrorMessage"));
		getQualityRuleResponse.setErrorCode(_ctx.stringValue("GetQualityRuleResponse.ErrorCode"));
		getQualityRuleResponse.setSuccess(_ctx.booleanValue("GetQualityRuleResponse.Success"));

		Data data = new Data();
		data.setBlockType(_ctx.integerValue("GetQualityRuleResponse.Data.BlockType"));
		data.setOnDutyAccountName(_ctx.stringValue("GetQualityRuleResponse.Data.OnDutyAccountName"));
		data.setWarningThreshold(_ctx.stringValue("GetQualityRuleResponse.Data.WarningThreshold"));
		data.setProperty(_ctx.stringValue("GetQualityRuleResponse.Data.Property"));
		data.setRuleType(_ctx.integerValue("GetQualityRuleResponse.Data.RuleType"));
		data.setComment(_ctx.stringValue("GetQualityRuleResponse.Data.Comment"));
		data.setOnDuty(_ctx.stringValue("GetQualityRuleResponse.Data.OnDuty"));
		data.setChecker(_ctx.integerValue("GetQualityRuleResponse.Data.Checker"));
		data.setFixCheck(_ctx.booleanValue("GetQualityRuleResponse.Data.FixCheck"));
		data.setMethodId(_ctx.integerValue("GetQualityRuleResponse.Data.MethodId"));
		data.setCriticalThreshold(_ctx.stringValue("GetQualityRuleResponse.Data.CriticalThreshold"));
		data.setPredictType(_ctx.integerValue("GetQualityRuleResponse.Data.PredictType"));
		data.setTemplateName(_ctx.stringValue("GetQualityRuleResponse.Data.TemplateName"));
		data.setCheckerName(_ctx.stringValue("GetQualityRuleResponse.Data.CheckerName"));
		data.setRuleName(_ctx.stringValue("GetQualityRuleResponse.Data.RuleName"));
		data.setMethodName(_ctx.stringValue("GetQualityRuleResponse.Data.MethodName"));
		data.setEntityId(_ctx.longValue("GetQualityRuleResponse.Data.EntityId"));
		data.setWhereCondition(_ctx.stringValue("GetQualityRuleResponse.Data.WhereCondition"));
		data.setOperator(_ctx.stringValue("GetQualityRuleResponse.Data.Operator"));
		data.setExpectValue(_ctx.stringValue("GetQualityRuleResponse.Data.ExpectValue"));
		data.setTrend(_ctx.stringValue("GetQualityRuleResponse.Data.Trend"));
		data.setTemplateId(_ctx.integerValue("GetQualityRuleResponse.Data.TemplateId"));
		data.setId(_ctx.longValue("GetQualityRuleResponse.Data.Id"));
		getQualityRuleResponse.setData(data);
	 
	 	return getQualityRuleResponse;
	}
}