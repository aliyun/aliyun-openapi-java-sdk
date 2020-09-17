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

import com.aliyuncs.sofa.model.v20190815.ListMsSgAuthRuleGroupServicesResponse;
import com.aliyuncs.sofa.model.v20190815.ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroupsItem;
import com.aliyuncs.sofa.model.v20190815.ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroupsItem.RulesItem;
import com.aliyuncs.sofa.model.v20190815.ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroupsItem.RulesItem.RuleItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMsSgAuthRuleGroupServicesResponseUnmarshaller {

	public static ListMsSgAuthRuleGroupServicesResponse unmarshall(ListMsSgAuthRuleGroupServicesResponse listMsSgAuthRuleGroupServicesResponse, UnmarshallerContext _ctx) {
		
		listMsSgAuthRuleGroupServicesResponse.setRequestId(_ctx.stringValue("ListMsSgAuthRuleGroupServicesResponse.RequestId"));
		listMsSgAuthRuleGroupServicesResponse.setResultCode(_ctx.stringValue("ListMsSgAuthRuleGroupServicesResponse.ResultCode"));
		listMsSgAuthRuleGroupServicesResponse.setResultMessage(_ctx.stringValue("ListMsSgAuthRuleGroupServicesResponse.ResultMessage"));
		listMsSgAuthRuleGroupServicesResponse.setCurrentPage(_ctx.longValue("ListMsSgAuthRuleGroupServicesResponse.CurrentPage"));
		listMsSgAuthRuleGroupServicesResponse.setPageSize(_ctx.longValue("ListMsSgAuthRuleGroupServicesResponse.PageSize"));
		listMsSgAuthRuleGroupServicesResponse.setStartIndex(_ctx.longValue("ListMsSgAuthRuleGroupServicesResponse.StartIndex"));
		listMsSgAuthRuleGroupServicesResponse.setTotalSize(_ctx.longValue("ListMsSgAuthRuleGroupServicesResponse.TotalSize"));

		List<AuthRuleGroupsItem> authRuleGroups = new ArrayList<AuthRuleGroupsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups.Length"); i++) {
			AuthRuleGroupsItem authRuleGroupsItem = new AuthRuleGroupsItem();
			authRuleGroupsItem.setAppName(_ctx.stringValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].AppName"));
			authRuleGroupsItem.setBlackGroupId(_ctx.longValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].BlackGroupId"));
			authRuleGroupsItem.setBlackState(_ctx.longValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].BlackState"));
			authRuleGroupsItem.setChangeStatus(_ctx.stringValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].ChangeStatus"));
			authRuleGroupsItem.setDataId(_ctx.stringValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].DataId"));
			authRuleGroupsItem.setGmtCreate(_ctx.stringValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].GmtCreate"));
			authRuleGroupsItem.setGmtModified(_ctx.stringValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].GmtModified"));
			authRuleGroupsItem.setId(_ctx.longValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].Id"));
			authRuleGroupsItem.setInstanceId(_ctx.stringValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].InstanceId"));
			authRuleGroupsItem.setOperator(_ctx.stringValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].Operator"));
			authRuleGroupsItem.setStatus(_ctx.longValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].Status"));
			authRuleGroupsItem.setWhiteGroupId(_ctx.longValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].WhiteGroupId"));
			authRuleGroupsItem.setWhiteState(_ctx.longValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].WhiteState"));

			List<RulesItem> rules = new ArrayList<RulesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].Rules.Length"); j++) {
				RulesItem rulesItem = new RulesItem();
				rulesItem.setAuthRuleGroupId(_ctx.longValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].AuthRuleGroupId"));
				rulesItem.setEnabled(_ctx.longValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].Enabled"));
				rulesItem.setGmtCreate(_ctx.stringValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].GmtCreate"));
				rulesItem.setGmtModified(_ctx.stringValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].GmtModified"));
				rulesItem.setId(_ctx.stringValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].Id"));
				rulesItem.setMode(_ctx.stringValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].Mode"));
				rulesItem.setName(_ctx.stringValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].Name"));
				rulesItem.setType(_ctx.stringValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].Type"));

				List<RuleItemsItem> ruleItems = new ArrayList<RuleItemsItem>();
				for (int k = 0; k < _ctx.lengthValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems.Length"); k++) {
					RuleItemsItem ruleItemsItem = new RuleItemsItem();
					ruleItemsItem.setAuthRuleId(_ctx.longValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].AuthRuleId"));
					ruleItemsItem.setField(_ctx.stringValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].Field"));
					ruleItemsItem.setGmtCreate(_ctx.stringValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].GmtCreate"));
					ruleItemsItem.setGmtModified(_ctx.stringValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].GmtModified"));
					ruleItemsItem.setId(_ctx.longValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].Id"));
					ruleItemsItem.setOperation(_ctx.stringValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].Operation"));
					ruleItemsItem.setOperator(_ctx.stringValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].Operator"));
					ruleItemsItem.setType(_ctx.stringValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].Type"));
					ruleItemsItem.setValue(_ctx.stringValue("ListMsSgAuthRuleGroupServicesResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].Value"));

					ruleItems.add(ruleItemsItem);
				}
				rulesItem.setRuleItems(ruleItems);

				rules.add(rulesItem);
			}
			authRuleGroupsItem.setRules(rules);

			authRuleGroups.add(authRuleGroupsItem);
		}
		listMsSgAuthRuleGroupServicesResponse.setAuthRuleGroups(authRuleGroups);
	 
	 	return listMsSgAuthRuleGroupServicesResponse;
	}
}