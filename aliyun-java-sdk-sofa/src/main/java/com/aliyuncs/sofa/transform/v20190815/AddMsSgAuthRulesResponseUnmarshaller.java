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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.AddMsSgAuthRulesResponse;
import com.aliyuncs.sofa.model.v20190815.AddMsSgAuthRulesResponse.AuthRule;
import com.aliyuncs.sofa.model.v20190815.AddMsSgAuthRulesResponse.AuthRule.RuleItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddMsSgAuthRulesResponseUnmarshaller {

	public static AddMsSgAuthRulesResponse unmarshall(AddMsSgAuthRulesResponse addMsSgAuthRulesResponse, UnmarshallerContext _ctx) {
		
		addMsSgAuthRulesResponse.setRequestId(_ctx.stringValue("AddMsSgAuthRulesResponse.RequestId"));
		addMsSgAuthRulesResponse.setResultCode(_ctx.stringValue("AddMsSgAuthRulesResponse.ResultCode"));
		addMsSgAuthRulesResponse.setResultMessage(_ctx.stringValue("AddMsSgAuthRulesResponse.ResultMessage"));

		AuthRule authRule = new AuthRule();
		authRule.setAuthRuleGroupId(_ctx.longValue("AddMsSgAuthRulesResponse.AuthRule.AuthRuleGroupId"));
		authRule.setEnabled(_ctx.longValue("AddMsSgAuthRulesResponse.AuthRule.Enabled"));
		authRule.setMode(_ctx.stringValue("AddMsSgAuthRulesResponse.AuthRule.Mode"));
		authRule.setName(_ctx.stringValue("AddMsSgAuthRulesResponse.AuthRule.Name"));

		List<RuleItemsItem> ruleItems = new ArrayList<RuleItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("AddMsSgAuthRulesResponse.AuthRule.RuleItems.Length"); i++) {
			RuleItemsItem ruleItemsItem = new RuleItemsItem();
			ruleItemsItem.setAuthRuleId(_ctx.longValue("AddMsSgAuthRulesResponse.AuthRule.RuleItems["+ i +"].AuthRuleId"));
			ruleItemsItem.setField(_ctx.stringValue("AddMsSgAuthRulesResponse.AuthRule.RuleItems["+ i +"].Field"));
			ruleItemsItem.setOperation(_ctx.stringValue("AddMsSgAuthRulesResponse.AuthRule.RuleItems["+ i +"].Operation"));
			ruleItemsItem.setType(_ctx.stringValue("AddMsSgAuthRulesResponse.AuthRule.RuleItems["+ i +"].Type"));
			ruleItemsItem.setValue(_ctx.stringValue("AddMsSgAuthRulesResponse.AuthRule.RuleItems["+ i +"].Value"));

			ruleItems.add(ruleItemsItem);
		}
		authRule.setRuleItems(ruleItems);
		addMsSgAuthRulesResponse.setAuthRule(authRule);
	 
	 	return addMsSgAuthRulesResponse;
	}
}