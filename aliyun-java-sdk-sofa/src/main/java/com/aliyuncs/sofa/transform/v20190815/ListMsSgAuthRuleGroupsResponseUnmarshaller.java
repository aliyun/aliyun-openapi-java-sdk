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

import com.aliyuncs.sofa.model.v20190815.ListMsSgAuthRuleGroupsResponse;
import com.aliyuncs.sofa.model.v20190815.ListMsSgAuthRuleGroupsResponse.AuthRuleGroupsItem;
import com.aliyuncs.sofa.model.v20190815.ListMsSgAuthRuleGroupsResponse.AuthRuleGroupsItem.RulesItem;
import com.aliyuncs.sofa.model.v20190815.ListMsSgAuthRuleGroupsResponse.AuthRuleGroupsItem.RulesItem.RuleItemsItem;
import com.aliyuncs.sofa.model.v20190815.ListMsSgAuthRuleGroupsResponse.AuthRuleGroupsItem.RulesItem.RuleItemsItem.PublishedAuthRuleItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMsSgAuthRuleGroupsResponseUnmarshaller {

	public static ListMsSgAuthRuleGroupsResponse unmarshall(ListMsSgAuthRuleGroupsResponse listMsSgAuthRuleGroupsResponse, UnmarshallerContext _ctx) {
		
		listMsSgAuthRuleGroupsResponse.setRequestId(_ctx.stringValue("ListMsSgAuthRuleGroupsResponse.RequestId"));
		listMsSgAuthRuleGroupsResponse.setResultCode(_ctx.stringValue("ListMsSgAuthRuleGroupsResponse.ResultCode"));
		listMsSgAuthRuleGroupsResponse.setResultMessage(_ctx.stringValue("ListMsSgAuthRuleGroupsResponse.ResultMessage"));

		List<AuthRuleGroupsItem> authRuleGroups = new ArrayList<AuthRuleGroupsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups.Length"); i++) {
			AuthRuleGroupsItem authRuleGroupsItem = new AuthRuleGroupsItem();
			authRuleGroupsItem.setDataId(_ctx.stringValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].DataId"));
			authRuleGroupsItem.setEnabled(_ctx.longValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Enabled"));
			authRuleGroupsItem.setGmtModified(_ctx.stringValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].GmtModified"));
			authRuleGroupsItem.setId(_ctx.longValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Id"));
			authRuleGroupsItem.setInstanceId(_ctx.stringValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].InstanceId"));
			authRuleGroupsItem.setStatus(_ctx.longValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Status"));
			authRuleGroupsItem.setType(_ctx.stringValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Type"));

			List<RulesItem> rules = new ArrayList<RulesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules.Length"); j++) {
				RulesItem rulesItem = new RulesItem();
				rulesItem.setAuthRuleGroupId(_ctx.stringValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].AuthRuleGroupId"));
				rulesItem.setChangedItemCnt(_ctx.longValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].ChangedItemCnt"));
				rulesItem.setChangedType(_ctx.stringValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].ChangedType"));
				rulesItem.setEnabled(_ctx.longValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].Enabled"));
				rulesItem.setId(_ctx.longValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].Id"));
				rulesItem.setMode(_ctx.stringValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].Mode"));
				rulesItem.setName(_ctx.stringValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].Name"));

				List<RuleItemsItem> ruleItems = new ArrayList<RuleItemsItem>();
				for (int k = 0; k < _ctx.lengthValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems.Length"); k++) {
					RuleItemsItem ruleItemsItem = new RuleItemsItem();
					ruleItemsItem.setAuthRuleId(_ctx.longValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].AuthRuleId"));
					ruleItemsItem.setChangedType(_ctx.stringValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].ChangedType"));
					ruleItemsItem.setField(_ctx.stringValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].Field"));
					ruleItemsItem.setId(_ctx.longValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].Id"));
					ruleItemsItem.setOperation(_ctx.stringValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].Operation"));
					ruleItemsItem.setType(_ctx.stringValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].Type"));
					ruleItemsItem.setValue(_ctx.stringValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].Value"));

					PublishedAuthRuleItem publishedAuthRuleItem = new PublishedAuthRuleItem();
					publishedAuthRuleItem.setAuthRuleId(_ctx.longValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].PublishedAuthRuleItem.AuthRuleId"));
					publishedAuthRuleItem.setChangedType(_ctx.stringValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].PublishedAuthRuleItem.ChangedType"));
					publishedAuthRuleItem.setField(_ctx.stringValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].PublishedAuthRuleItem.Field"));
					publishedAuthRuleItem.setOperation(_ctx.stringValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].PublishedAuthRuleItem.Operation"));
					publishedAuthRuleItem.setValue(_ctx.stringValue("ListMsSgAuthRuleGroupsResponse.AuthRuleGroups["+ i +"].Rules["+ j +"].RuleItems["+ k +"].PublishedAuthRuleItem.Value"));
					ruleItemsItem.setPublishedAuthRuleItem(publishedAuthRuleItem);

					ruleItems.add(ruleItemsItem);
				}
				rulesItem.setRuleItems(ruleItems);

				rules.add(rulesItem);
			}
			authRuleGroupsItem.setRules(rules);

			authRuleGroups.add(authRuleGroupsItem);
		}
		listMsSgAuthRuleGroupsResponse.setAuthRuleGroups(authRuleGroups);
	 
	 	return listMsSgAuthRuleGroupsResponse;
	}
}