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

package com.aliyuncs.eventbridge.transform.v20200401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eventbridge.model.v20200401.ListRulesResponse;
import com.aliyuncs.eventbridge.model.v20200401.ListRulesResponse.Data;
import com.aliyuncs.eventbridge.model.v20200401.ListRulesResponse.Data.RulesItem;
import com.aliyuncs.eventbridge.model.v20200401.ListRulesResponse.Data.RulesItem.TargetsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRulesResponseUnmarshaller {

	public static ListRulesResponse unmarshall(ListRulesResponse listRulesResponse, UnmarshallerContext _ctx) {
		
		listRulesResponse.setRequestId(_ctx.stringValue("ListRulesResponse.RequestId"));
		listRulesResponse.setMessage(_ctx.stringValue("ListRulesResponse.Message"));
		listRulesResponse.setCode(_ctx.stringValue("ListRulesResponse.Code"));
		listRulesResponse.setSuccess(_ctx.booleanValue("ListRulesResponse.Success"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ListRulesResponse.Data.NextToken"));
		data.setTotal(_ctx.integerValue("ListRulesResponse.Data.Total"));

		List<RulesItem> rules = new ArrayList<RulesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRulesResponse.Data.Rules.Length"); i++) {
			RulesItem rulesItem = new RulesItem();
			rulesItem.setDetailMap(_ctx.mapValue("ListRulesResponse.Data.Rules["+ i +"].DetailMap"));
			rulesItem.setStatus(_ctx.stringValue("ListRulesResponse.Data.Rules["+ i +"].Status"));
			rulesItem.setEventBusName(_ctx.stringValue("ListRulesResponse.Data.Rules["+ i +"].EventBusName"));
			rulesItem.setRuleARN(_ctx.stringValue("ListRulesResponse.Data.Rules["+ i +"].RuleARN"));
			rulesItem.setDescription(_ctx.stringValue("ListRulesResponse.Data.Rules["+ i +"].Description"));
			rulesItem.setFilterPattern(_ctx.stringValue("ListRulesResponse.Data.Rules["+ i +"].FilterPattern"));
			rulesItem.setCreatedTimestamp(_ctx.longValue("ListRulesResponse.Data.Rules["+ i +"].CreatedTimestamp"));
			rulesItem.setRuleName(_ctx.stringValue("ListRulesResponse.Data.Rules["+ i +"].RuleName"));

			List<TargetsItem> targets = new ArrayList<TargetsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListRulesResponse.Data.Rules["+ i +"].Targets.Length"); j++) {
				TargetsItem targetsItem = new TargetsItem();
				targetsItem.setType(_ctx.stringValue("ListRulesResponse.Data.Rules["+ i +"].Targets["+ j +"].Type"));
				targetsItem.setEndpoint(_ctx.stringValue("ListRulesResponse.Data.Rules["+ i +"].Targets["+ j +"].Endpoint"));
				targetsItem.setId(_ctx.stringValue("ListRulesResponse.Data.Rules["+ i +"].Targets["+ j +"].Id"));
				targetsItem.setPushSelector(_ctx.stringValue("ListRulesResponse.Data.Rules["+ i +"].Targets["+ j +"].PushSelector"));
				targetsItem.setErrorsTolerance(_ctx.stringValue("ListRulesResponse.Data.Rules["+ i +"].Targets["+ j +"].ErrorsTolerance"));

				targets.add(targetsItem);
			}
			rulesItem.setTargets(targets);

			rules.add(rulesItem);
		}
		data.setRules(rules);
		listRulesResponse.setData(data);
	 
	 	return listRulesResponse;
	}
}