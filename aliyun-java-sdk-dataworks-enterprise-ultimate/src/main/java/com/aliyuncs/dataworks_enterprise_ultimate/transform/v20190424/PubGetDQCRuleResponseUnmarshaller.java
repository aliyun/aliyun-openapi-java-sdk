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

package com.aliyuncs.dataworks_enterprise_ultimate.transform.v20190424;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.PubGetDQCRuleResponse;
import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.PubGetDQCRuleResponse.ReturnValue;
import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.PubGetDQCRuleResponse.ReturnValue.SelfserviceRule;
import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.PubGetDQCRuleResponse.ReturnValue.TemplateRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class PubGetDQCRuleResponseUnmarshaller {

	public static PubGetDQCRuleResponse unmarshall(PubGetDQCRuleResponse pubGetDQCRuleResponse, UnmarshallerContext _ctx) {
		
		pubGetDQCRuleResponse.setReturnCode(_ctx.stringValue("PubGetDQCRuleResponse.ReturnCode"));

		ReturnValue returnValue = new ReturnValue();

		List<TemplateRule> templateRules = new ArrayList<TemplateRule>();
		for (int i = 0; i < _ctx.lengthValue("PubGetDQCRuleResponse.ReturnValue.TemplateRules.Length"); i++) {
			TemplateRule templateRule = new TemplateRule();
			templateRule.setProjectName(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.TemplateRules["+ i +"].ProjectName"));
			templateRule.setTableName(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.TemplateRules["+ i +"].TableName"));
			templateRule.setId(_ctx.integerValue("PubGetDQCRuleResponse.ReturnValue.TemplateRules["+ i +"].Id"));
			templateRule.setEntityId(_ctx.integerValue("PubGetDQCRuleResponse.ReturnValue.TemplateRules["+ i +"].EntityId"));
			templateRule.setProperty(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.TemplateRules["+ i +"].Property"));
			templateRule.setMethodId(_ctx.integerValue("PubGetDQCRuleResponse.ReturnValue.TemplateRules["+ i +"].MethodId"));
			templateRule.setMethodName(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.TemplateRules["+ i +"].MethodName"));
			templateRule.setOnDuty(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.TemplateRules["+ i +"].OnDuty"));
			templateRule.setRuleType(_ctx.integerValue("PubGetDQCRuleResponse.ReturnValue.TemplateRules["+ i +"].RuleType"));
			templateRule.setBlockType(_ctx.integerValue("PubGetDQCRuleResponse.ReturnValue.TemplateRules["+ i +"].BlockType"));
			templateRule.setTemplateId(_ctx.integerValue("PubGetDQCRuleResponse.ReturnValue.TemplateRules["+ i +"].TemplateId"));
			templateRule.setTemplateName(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.TemplateRules["+ i +"].TemplateName"));
			templateRule.setRuleCheckerRelationId(_ctx.integerValue("PubGetDQCRuleResponse.ReturnValue.TemplateRules["+ i +"].RuleCheckerRelationId"));
			templateRule.setCheckerId(_ctx.integerValue("PubGetDQCRuleResponse.ReturnValue.TemplateRules["+ i +"].CheckerId"));
			templateRule.setFixCheck(_ctx.booleanValue("PubGetDQCRuleResponse.ReturnValue.TemplateRules["+ i +"].FixCheck"));
			templateRule.setTrend(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.TemplateRules["+ i +"].Trend"));
			templateRule.setWarningThreshold(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.TemplateRules["+ i +"].WarningThreshold"));
			templateRule.setCriticalThreshold(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.TemplateRules["+ i +"].CriticalThreshold"));
			templateRule.setHistoryWarningThreshold(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.TemplateRules["+ i +"].HistoryWarningThreshold"));
			templateRule.setHistoryCriticalThreshold(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.TemplateRules["+ i +"].HistoryCriticalThreshold"));
			templateRule.setPropertyKey(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.TemplateRules["+ i +"].PropertyKey"));
			templateRule.setMatchExpression(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.TemplateRules["+ i +"].MatchExpression"));
			templateRule.setComment(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.TemplateRules["+ i +"].Comment"));
			templateRule.setExpectValue(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.TemplateRules["+ i +"].ExpectValue"));

			templateRules.add(templateRule);
		}
		returnValue.setTemplateRules(templateRules);

		List<SelfserviceRule> selfserviceRules = new ArrayList<SelfserviceRule>();
		for (int i = 0; i < _ctx.lengthValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules.Length"); i++) {
			SelfserviceRule selfserviceRule = new SelfserviceRule();
			selfserviceRule.setProjectName(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].ProjectName"));
			selfserviceRule.setTableName(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].TableName"));
			selfserviceRule.setId(_ctx.integerValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].Id"));
			selfserviceRule.setEntityId(_ctx.integerValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].EntityId"));
			selfserviceRule.setProperty(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].Property"));
			selfserviceRule.setMethodId(_ctx.integerValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].MethodId"));
			selfserviceRule.setMethodName(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].MethodName"));
			selfserviceRule.setWhereCondition(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].WhereCondition"));
			selfserviceRule.setOnDuty(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].OnDuty"));
			selfserviceRule.setRuleType(_ctx.integerValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].RuleType"));
			selfserviceRule.setBlockType(_ctx.integerValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].BlockType"));
			selfserviceRule.setRuleCheckerRelationId(_ctx.integerValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].RuleCheckerRelationId"));
			selfserviceRule.setCheckerId(_ctx.integerValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].CheckerId"));
			selfserviceRule.setChecker(_ctx.integerValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].Checker"));
			selfserviceRule.setCheckerName(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].CheckerName"));
			selfserviceRule.setFixCheck(_ctx.booleanValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].FixCheck"));
			selfserviceRule.setTrend(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].Trend"));
			selfserviceRule.setCheckResult(_ctx.integerValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].CheckResult"));
			selfserviceRule.setWarningThreshold(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].WarningThreshold"));
			selfserviceRule.setCriticalThreshold(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].CriticalThreshold"));
			selfserviceRule.setHistoryWarningThreshold(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].HistoryWarningThreshold"));
			selfserviceRule.setHistoryCriticalThreshold(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].HistoryCriticalThreshold"));
			selfserviceRule.setHistoryActualThreshold(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].HistoryActualThreshold"));
			selfserviceRule.setPropertyKey(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].PropertyKey"));
			selfserviceRule.setMatchExpression(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].MatchExpression"));
			selfserviceRule.setComment(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].Comment"));
			selfserviceRule.setExpectValue(_ctx.stringValue("PubGetDQCRuleResponse.ReturnValue.SelfserviceRules["+ i +"].ExpectValue"));

			selfserviceRules.add(selfserviceRule);
		}
		returnValue.setSelfserviceRules(selfserviceRules);
		pubGetDQCRuleResponse.setReturnValue(returnValue);
	 
	 	return pubGetDQCRuleResponse;
	}
}