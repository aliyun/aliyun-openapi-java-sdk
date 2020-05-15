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

import com.aliyuncs.sofa.model.v20190815.SaveMsSgAuthRuleGroupsResponse;
import com.aliyuncs.sofa.model.v20190815.SaveMsSgAuthRuleGroupsResponse.AuthRuleGroupsItem;
import com.aliyuncs.sofa.model.v20190815.SaveMsSgAuthRuleGroupsResponse.AuthRuleGroupsItem.RulesItem;
import com.aliyuncs.sofa.model.v20190815.SaveMsSgAuthRuleGroupsResponse.AuthRuleGroupsItem.RulesItem.RuleItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveMsSgAuthRuleGroupsResponseUnmarshaller {

	public static SaveMsSgAuthRuleGroupsResponse unmarshall(SaveMsSgAuthRuleGroupsResponse saveMsSgAuthRuleGroupsResponse, UnmarshallerContext _ctx) {
		
		saveMsSgAuthRuleGroupsResponse.setRequestId(_ctx.stringValue("SaveMsSgAuthRuleGroupsResponse.RequestId"));
		saveMsSgAuthRuleGroupsResponse.setResultCode(_ctx.stringValue("SaveMsSgAuthRuleGroupsResponse.ResultCode"));
		saveMsSgAuthRuleGroupsResponse.setResultMessage(_ctx.stringValue("SaveMsSgAuthRuleGroupsResponse.ResultMessage"));

		List<AuthRuleGroupsItem> authRuleGroups = new ArrayList<AuthRuleGroupsItem>();
		for (int i = 0; i < _ctx.lengthValue("SaveMsSgAuthRuleGroupsResponse.AuthRuleGroups.Length"); i++) {
			AuthRuleGroupsItem authRuleGroupsItem = new AuthRuleGroupsItem();
			authRuleGroupsItem.setDataId(_ctx.stringValue("SaveMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].DataId"));
			authRuleGroupsItem.setEnabled(_ctx.longValue("SaveMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Enabled"));
			authRuleGroupsItem.setInstanceId(_ctx.stringValue("SaveMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].InstanceId"));
			authRuleGroupsItem.setStatus(_ctx.longValue("SaveMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Status"));
			authRuleGroupsItem.setType(_ctx.stringValue("SaveMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Type"));

			List<RulesItem> rules = new ArrayList<RulesItem>();
			for (int j = 0; j < _ctx.lengthValue("SaveMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules.Length"); j++) {
				RulesItem rulesItem = new RulesItem();
				rulesItem.setAuthRuleGroupId(_ctx.longValue("SaveMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].AuthRuleGroupId"));
				rulesItem.setEnabled(_ctx.longValue("SaveMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].Enabled"));
				rulesItem.setMode(_ctx.stringValue("SaveMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].Mode"));
				rulesItem.setName(_ctx.stringValue("SaveMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].Name"));

				List<RuleItemsItem> ruleItems = new ArrayList<RuleItemsItem>();
				for (int k = 0; k < _ctx.lengthValue("SaveMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems.Length"); k++) {
					RuleItemsItem ruleItemsItem = new RuleItemsItem();
					ruleItemsItem.setAuthRuleId(_ctx.longValue("SaveMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].AuthRuleId"));
					ruleItemsItem.setField(_ctx.stringValue("SaveMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].Field"));
					ruleItemsItem.setOperation(_ctx.stringValue("SaveMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].Operation"));
					ruleItemsItem.setType(_ctx.stringValue("SaveMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].Type"));
					ruleItemsItem.setValue(_ctx.stringValue("SaveMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].Value"));

					ruleItems.add(ruleItemsItem);
				}
				rulesItem.setRuleItems(ruleItems);

				rules.add(rulesItem);
			}
			authRuleGroupsItem.setRules(rules);

			authRuleGroups.add(authRuleGroupsItem);
		}
		saveMsSgAuthRuleGroupsResponse.setAuthRuleGroups(authRuleGroups);
	 
	 	return saveMsSgAuthRuleGroupsResponse;
	}
}