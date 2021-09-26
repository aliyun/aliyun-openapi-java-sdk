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

import com.aliyuncs.dataworks_public.model.v20200518.ListQualityRulesResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListQualityRulesResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListQualityRulesResponse.Data.RulesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQualityRulesResponseUnmarshaller {

	public static ListQualityRulesResponse unmarshall(ListQualityRulesResponse listQualityRulesResponse, UnmarshallerContext _ctx) {
		
		listQualityRulesResponse.setRequestId(_ctx.stringValue("ListQualityRulesResponse.RequestId"));
		listQualityRulesResponse.setHttpStatusCode(_ctx.integerValue("ListQualityRulesResponse.HttpStatusCode"));
		listQualityRulesResponse.setErrorMessage(_ctx.stringValue("ListQualityRulesResponse.ErrorMessage"));
		listQualityRulesResponse.setSuccess(_ctx.booleanValue("ListQualityRulesResponse.Success"));
		listQualityRulesResponse.setErrorCode(_ctx.stringValue("ListQualityRulesResponse.ErrorCode"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListQualityRulesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListQualityRulesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.longValue("ListQualityRulesResponse.Data.TotalCount"));

		List<RulesItem> rules = new ArrayList<RulesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListQualityRulesResponse.Data.Rules.Length"); i++) {
			RulesItem rulesItem = new RulesItem();
			rulesItem.setBlockType(_ctx.integerValue("ListQualityRulesResponse.Data.Rules["+ i +"].BlockType"));
			rulesItem.setOnDutyAccountName(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].OnDutyAccountName"));
			rulesItem.setProperty(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].Property"));
			rulesItem.setWarningThreshold(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].WarningThreshold"));
			rulesItem.setTableName(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].TableName"));
			rulesItem.setOnDuty(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].OnDuty"));
			rulesItem.setComment(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].Comment"));
			rulesItem.setRuleCheckerRelationId(_ctx.integerValue("ListQualityRulesResponse.Data.Rules["+ i +"].RuleCheckerRelationId"));
			rulesItem.setFixCheck(_ctx.booleanValue("ListQualityRulesResponse.Data.Rules["+ i +"].FixCheck"));
			rulesItem.setMethodId(_ctx.integerValue("ListQualityRulesResponse.Data.Rules["+ i +"].MethodId"));
			rulesItem.setTemplateName(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].TemplateName"));
			rulesItem.setTrend(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].Trend"));
			rulesItem.setHistoryWarningThreshold(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].HistoryWarningThreshold"));
			rulesItem.setRuleType(_ctx.integerValue("ListQualityRulesResponse.Data.Rules["+ i +"].RuleType"));
			rulesItem.setMatchExpression(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].MatchExpression"));
			rulesItem.setProjectName(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].ProjectName"));
			rulesItem.setPropertyKey(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].PropertyKey"));
			rulesItem.setCriticalThreshold(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].CriticalThreshold"));
			rulesItem.setHistoryCriticalThreshold(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].HistoryCriticalThreshold"));
			rulesItem.setMethodName(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].MethodName"));
			rulesItem.setCheckerId(_ctx.integerValue("ListQualityRulesResponse.Data.Rules["+ i +"].CheckerId"));
			rulesItem.setEntityId(_ctx.integerValue("ListQualityRulesResponse.Data.Rules["+ i +"].EntityId"));
			rulesItem.setExpectValue(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].ExpectValue"));
			rulesItem.setTemplateId(_ctx.integerValue("ListQualityRulesResponse.Data.Rules["+ i +"].TemplateId"));
			rulesItem.setId(_ctx.integerValue("ListQualityRulesResponse.Data.Rules["+ i +"].Id"));

			rules.add(rulesItem);
		}
		data.setRules(rules);
		listQualityRulesResponse.setData(data);
	 
	 	return listQualityRulesResponse;
	}
}