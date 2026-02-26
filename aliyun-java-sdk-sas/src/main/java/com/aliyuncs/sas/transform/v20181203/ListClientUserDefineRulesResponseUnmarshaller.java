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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListClientUserDefineRulesResponse;
import com.aliyuncs.sas.model.v20181203.ListClientUserDefineRulesResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.ListClientUserDefineRulesResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClientUserDefineRulesResponseUnmarshaller {

	public static ListClientUserDefineRulesResponse unmarshall(ListClientUserDefineRulesResponse listClientUserDefineRulesResponse, UnmarshallerContext _ctx) {
		
		listClientUserDefineRulesResponse.setRequestId(_ctx.stringValue("ListClientUserDefineRulesResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListClientUserDefineRulesResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListClientUserDefineRulesResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("ListClientUserDefineRulesResponse.PageInfo.TotalCount"));
		listClientUserDefineRulesResponse.setPageInfo(pageInfo);

		List<Rule> userDefineRuleList = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("ListClientUserDefineRulesResponse.UserDefineRuleList.Length"); i++) {
			Rule rule = new Rule();
			rule.setType(_ctx.integerValue("ListClientUserDefineRulesResponse.UserDefineRuleList["+ i +"].Type"));
			rule.setName(_ctx.stringValue("ListClientUserDefineRulesResponse.UserDefineRuleList["+ i +"].Name"));
			rule.setSwitchId(_ctx.stringValue("ListClientUserDefineRulesResponse.UserDefineRuleList["+ i +"].SwitchId"));
			rule.setId(_ctx.longValue("ListClientUserDefineRulesResponse.UserDefineRuleList["+ i +"].Id"));
			rule.setActionType(_ctx.integerValue("ListClientUserDefineRulesResponse.UserDefineRuleList["+ i +"].ActionType"));
			rule.setPlatform(_ctx.stringValue("ListClientUserDefineRulesResponse.UserDefineRuleList["+ i +"].Platform"));

			userDefineRuleList.add(rule);
		}
		listClientUserDefineRulesResponse.setUserDefineRuleList(userDefineRuleList);
	 
	 	return listClientUserDefineRulesResponse;
	}
}