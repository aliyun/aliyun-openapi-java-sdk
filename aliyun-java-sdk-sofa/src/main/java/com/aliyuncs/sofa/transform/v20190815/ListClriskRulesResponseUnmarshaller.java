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

import com.aliyuncs.sofa.model.v20190815.ListClriskRulesResponse;
import com.aliyuncs.sofa.model.v20190815.ListClriskRulesResponse.RuleListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClriskRulesResponseUnmarshaller {

	public static ListClriskRulesResponse unmarshall(ListClriskRulesResponse listClriskRulesResponse, UnmarshallerContext _ctx) {
		
		listClriskRulesResponse.setRequestId(_ctx.stringValue("ListClriskRulesResponse.RequestId"));
		listClriskRulesResponse.setResultCode(_ctx.stringValue("ListClriskRulesResponse.ResultCode"));
		listClriskRulesResponse.setResultMessage(_ctx.stringValue("ListClriskRulesResponse.ResultMessage"));

		List<RuleListItem> ruleList = new ArrayList<RuleListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClriskRulesResponse.RuleList.Length"); i++) {
			RuleListItem ruleListItem = new RuleListItem();
			ruleListItem.setContent(_ctx.stringValue("ListClriskRulesResponse.RuleList["+ i +"].Content"));
			ruleListItem.setDebugStatus(_ctx.stringValue("ListClriskRulesResponse.RuleList["+ i +"].DebugStatus"));
			ruleListItem.setDesc(_ctx.stringValue("ListClriskRulesResponse.RuleList["+ i +"].Desc"));
			ruleListItem.setGmtCreate(_ctx.stringValue("ListClriskRulesResponse.RuleList["+ i +"].GmtCreate"));
			ruleListItem.setGmtModified(_ctx.stringValue("ListClriskRulesResponse.RuleList["+ i +"].GmtModified"));
			ruleListItem.setModelCode(_ctx.stringValue("ListClriskRulesResponse.RuleList["+ i +"].ModelCode"));
			ruleListItem.setRuleCode(_ctx.stringValue("ListClriskRulesResponse.RuleList["+ i +"].RuleCode"));
			ruleListItem.setRuleName(_ctx.stringValue("ListClriskRulesResponse.RuleList["+ i +"].RuleName"));

			ruleList.add(ruleListItem);
		}
		listClriskRulesResponse.setRuleList(ruleList);
	 
	 	return listClriskRulesResponse;
	}
}