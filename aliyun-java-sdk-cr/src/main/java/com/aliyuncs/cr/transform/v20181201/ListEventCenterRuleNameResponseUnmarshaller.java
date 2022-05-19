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

package com.aliyuncs.cr.transform.v20181201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cr.model.v20181201.ListEventCenterRuleNameResponse;
import com.aliyuncs.cr.model.v20181201.ListEventCenterRuleNameResponse.RuleNamesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEventCenterRuleNameResponseUnmarshaller {

	public static ListEventCenterRuleNameResponse unmarshall(ListEventCenterRuleNameResponse listEventCenterRuleNameResponse, UnmarshallerContext _ctx) {
		
		listEventCenterRuleNameResponse.setRequestId(_ctx.stringValue("ListEventCenterRuleNameResponse.RequestId"));
		listEventCenterRuleNameResponse.setCode(_ctx.stringValue("ListEventCenterRuleNameResponse.Code"));
		listEventCenterRuleNameResponse.setIsSuccess(_ctx.booleanValue("ListEventCenterRuleNameResponse.IsSuccess"));

		List<RuleNamesItem> ruleNames = new ArrayList<RuleNamesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEventCenterRuleNameResponse.RuleNames.Length"); i++) {
			RuleNamesItem ruleNamesItem = new RuleNamesItem();
			ruleNamesItem.setRuleId(_ctx.stringValue("ListEventCenterRuleNameResponse.RuleNames["+ i +"].RuleId"));
			ruleNamesItem.setRuleName(_ctx.stringValue("ListEventCenterRuleNameResponse.RuleNames["+ i +"].RuleName"));

			ruleNames.add(ruleNamesItem);
		}
		listEventCenterRuleNameResponse.setRuleNames(ruleNames);
	 
	 	return listEventCenterRuleNameResponse;
	}
}