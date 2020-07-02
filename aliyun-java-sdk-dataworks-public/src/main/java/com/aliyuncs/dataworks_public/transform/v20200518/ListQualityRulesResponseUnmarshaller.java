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
		listQualityRulesResponse.setErrorCode(_ctx.stringValue("ListQualityRulesResponse.ErrorCode"));
		listQualityRulesResponse.setSuccess(_ctx.booleanValue("ListQualityRulesResponse.Success"));
		listQualityRulesResponse.setErrorMessage(_ctx.stringValue("ListQualityRulesResponse.ErrorMessage"));
		listQualityRulesResponse.setHttpStatusCode(_ctx.integerValue("ListQualityRulesResponse.HttpStatusCode"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListQualityRulesResponse.Data.TotalCount"));
		data.setPageNumber(_ctx.integerValue("ListQualityRulesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListQualityRulesResponse.Data.PageSize"));

		List<RulesItem> rules = new ArrayList<RulesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListQualityRulesResponse.Data.Rules.Length"); i++) {
			RulesItem rulesItem = new RulesItem();
			rulesItem.setProjectName(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].ProjectName"));
			rulesItem.setTableName(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].TableName"));
			rulesItem.setId(_ctx.integerValue("ListQualityRulesResponse.Data.Rules["+ i +"].Id"));
			rulesItem.setEntityId(_ctx.integerValue("ListQualityRulesResponse.Data.Rules["+ i +"].EntityId"));
			rulesItem.setProperty(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].Property"));
			rulesItem.setMethodId(_ctx.integerValue("ListQualityRulesResponse.Data.Rules["+ i +"].MethodId"));
			rulesItem.setMethodName(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].MethodName"));
			rulesItem.setOnDuty(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].OnDuty"));
			rulesItem.setRuleType(_ctx.integerValue("ListQualityRulesResponse.Data.Rules["+ i +"].RuleType"));
			rulesItem.setBlockType(_ctx.integerValue("ListQualityRulesResponse.Data.Rules["+ i +"].BlockType"));
			rulesItem.setTemplateId(_ctx.integerValue("ListQualityRulesResponse.Data.Rules["+ i +"].TemplateId"));
			rulesItem.setTemplateName(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].TemplateName"));
			rulesItem.setRuleCheckerRelationId(_ctx.integerValue("ListQualityRulesResponse.Data.Rules["+ i +"].RuleCheckerRelationId"));
			rulesItem.setCheckerId(_ctx.integerValue("ListQualityRulesResponse.Data.Rules["+ i +"].CheckerId"));
			rulesItem.setFixCheck(_ctx.booleanValue("ListQualityRulesResponse.Data.Rules["+ i +"].FixCheck"));
			rulesItem.setTrend(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].Trend"));
			rulesItem.setWarningThreshold(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].WarningThreshold"));
			rulesItem.setCriticalThreshold(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].CriticalThreshold"));
			rulesItem.setHistoryWarningThreshold(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].HistoryWarningThreshold"));
			rulesItem.setHistoryCriticalThreshold(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].HistoryCriticalThreshold"));
			rulesItem.setPropertyKey(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].PropertyKey"));
			rulesItem.setMatchExpression(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].MatchExpression"));
			rulesItem.setComment(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].Comment"));
			rulesItem.setExpectValue(_ctx.stringValue("ListQualityRulesResponse.Data.Rules["+ i +"].ExpectValue"));

			rules.add(rulesItem);
		}
		data.setRules(rules);
		listQualityRulesResponse.setData(data);
	 
	 	return listQualityRulesResponse;
	}
}