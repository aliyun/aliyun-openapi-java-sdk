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

import com.aliyuncs.sofa.model.v20190815.ListMsSgAuthRuleGroupAppsResponse;
import com.aliyuncs.sofa.model.v20190815.ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroupsItem;
import com.aliyuncs.sofa.model.v20190815.ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroupsItem.RulesItem;
import com.aliyuncs.sofa.model.v20190815.ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroupsItem.RulesItem.RuleItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMsSgAuthRuleGroupAppsResponseUnmarshaller {

	public static ListMsSgAuthRuleGroupAppsResponse unmarshall(ListMsSgAuthRuleGroupAppsResponse listMsSgAuthRuleGroupAppsResponse, UnmarshallerContext _ctx) {
		
		listMsSgAuthRuleGroupAppsResponse.setRequestId(_ctx.stringValue("ListMsSgAuthRuleGroupAppsResponse.RequestId"));
		listMsSgAuthRuleGroupAppsResponse.setResultCode(_ctx.stringValue("ListMsSgAuthRuleGroupAppsResponse.ResultCode"));
		listMsSgAuthRuleGroupAppsResponse.setResultMessage(_ctx.stringValue("ListMsSgAuthRuleGroupAppsResponse.ResultMessage"));
		listMsSgAuthRuleGroupAppsResponse.setCurrentPage(_ctx.longValue("ListMsSgAuthRuleGroupAppsResponse.CurrentPage"));
		listMsSgAuthRuleGroupAppsResponse.setPageSize(_ctx.longValue("ListMsSgAuthRuleGroupAppsResponse.PageSize"));
		listMsSgAuthRuleGroupAppsResponse.setStartIndex(_ctx.longValue("ListMsSgAuthRuleGroupAppsResponse.StartIndex"));
		listMsSgAuthRuleGroupAppsResponse.setTotalSize(_ctx.longValue("ListMsSgAuthRuleGroupAppsResponse.TotalSize"));

		List<AuthRuleGroupsItem> authRuleGroups = new ArrayList<AuthRuleGroupsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups.Length"); i++) {
			AuthRuleGroupsItem authRuleGroupsItem = new AuthRuleGroupsItem();
			authRuleGroupsItem.setAppName(_ctx.stringValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].AppName"));
			authRuleGroupsItem.setBlackGroupId(_ctx.longValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].BlackGroupId"));
			authRuleGroupsItem.setBlackState(_ctx.longValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].BlackState"));
			authRuleGroupsItem.setChangeStatus(_ctx.stringValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].ChangeStatus"));
			authRuleGroupsItem.setDataId(_ctx.stringValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].DataId"));
			authRuleGroupsItem.setGmtCreate(_ctx.stringValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].GmtCreate"));
			authRuleGroupsItem.setGmtModified(_ctx.stringValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].GmtModified"));
			authRuleGroupsItem.setId(_ctx.longValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].Id"));
			authRuleGroupsItem.setInstanceId(_ctx.stringValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].InstanceId"));
			authRuleGroupsItem.setOperator(_ctx.stringValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].Operator"));
			authRuleGroupsItem.setStatus(_ctx.longValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].Status"));
			authRuleGroupsItem.setWhiteGroupId(_ctx.longValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].WhiteGroupId"));
			authRuleGroupsItem.setWhiteState(_ctx.longValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].WhiteState"));

			List<RulesItem> rules = new ArrayList<RulesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].Rules.Length"); j++) {
				RulesItem rulesItem = new RulesItem();
				rulesItem.setAuthRuleGroupId(_ctx.longValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].AuthRuleGroupId"));
				rulesItem.setEnabled(_ctx.longValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].Enabled"));
				rulesItem.setGmtCreate(_ctx.stringValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].GmtCreate"));
				rulesItem.setGmtModified(_ctx.stringValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].GmtModified"));
				rulesItem.setId(_ctx.stringValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].Id"));
				rulesItem.setMode(_ctx.stringValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].Mode"));
				rulesItem.setName(_ctx.stringValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].Name"));
				rulesItem.setType(_ctx.stringValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].Type"));

				List<RuleItemsItem> ruleItems = new ArrayList<RuleItemsItem>();
				for (int k = 0; k < _ctx.lengthValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems.Length"); k++) {
					RuleItemsItem ruleItemsItem = new RuleItemsItem();
					ruleItemsItem.setAuthRuleId(_ctx.longValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].AuthRuleId"));
					ruleItemsItem.setField(_ctx.stringValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].Field"));
					ruleItemsItem.setGmtCreate(_ctx.stringValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].GmtCreate"));
					ruleItemsItem.setGmtModified(_ctx.stringValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].GmtModified"));
					ruleItemsItem.setId(_ctx.longValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].Id"));
					ruleItemsItem.setOperation(_ctx.stringValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].Operation"));
					ruleItemsItem.setOperator(_ctx.stringValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].Operator"));
					ruleItemsItem.setType(_ctx.stringValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].Type"));
					ruleItemsItem.setValue(_ctx.stringValue("ListMsSgAuthRuleGroupAppsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].Value"));

					ruleItems.add(ruleItemsItem);
				}
				rulesItem.setRuleItems(ruleItems);

				rules.add(rulesItem);
			}
			authRuleGroupsItem.setRules(rules);

			authRuleGroups.add(authRuleGroupsItem);
		}
		listMsSgAuthRuleGroupAppsResponse.setAuthRuleGroups(authRuleGroups);
	 
	 	return listMsSgAuthRuleGroupAppsResponse;
	}
}