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

package com.aliyuncs.config.transform.v20200907;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20200907.ListManagedRulesResponse;
import com.aliyuncs.config.model.v20200907.ListManagedRulesResponse.Data;
import com.aliyuncs.config.model.v20200907.ListManagedRulesResponse.Data.ManagedRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListManagedRulesResponseUnmarshaller {

	public static ListManagedRulesResponse unmarshall(ListManagedRulesResponse listManagedRulesResponse, UnmarshallerContext _ctx) {
		
		listManagedRulesResponse.setRequestId(_ctx.stringValue("ListManagedRulesResponse.RequestId"));

		List<Data> managedRules = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListManagedRulesResponse.ManagedRules.Length"); i++) {
			Data data = new Data();
			data.setPageSize(_ctx.integerValue("ListManagedRulesResponse.ManagedRules["+ i +"].PageSize"));
			data.setPageNumber(_ctx.integerValue("ListManagedRulesResponse.ManagedRules["+ i +"].PageNumber"));
			data.setTotalCount(_ctx.longValue("ListManagedRulesResponse.ManagedRules["+ i +"].TotalCount"));

			List<ManagedRule> managedRuleList = new ArrayList<ManagedRule>();
			for (int j = 0; j < _ctx.lengthValue("ListManagedRulesResponse.ManagedRules["+ i +"].ManagedRuleList.Length"); j++) {
				ManagedRule managedRule = new ManagedRule();
				managedRule.setRiskLevel(_ctx.integerValue("ListManagedRulesResponse.ManagedRules["+ i +"].ManagedRuleList["+ j +"].RiskLevel"));
				managedRule.setDescription(_ctx.stringValue("ListManagedRulesResponse.ManagedRules["+ i +"].ManagedRuleList["+ j +"].Description"));
				managedRule.setUseCases(_ctx.stringValue("ListManagedRulesResponse.ManagedRules["+ i +"].ManagedRuleList["+ j +"].UseCases"));
				managedRule.setIdentifier(_ctx.stringValue("ListManagedRulesResponse.ManagedRules["+ i +"].ManagedRuleList["+ j +"].Identifier"));
				managedRule.setConfigRuleName(_ctx.stringValue("ListManagedRulesResponse.ManagedRules["+ i +"].ManagedRuleList["+ j +"].ConfigRuleName"));
				managedRule.setReferenceCount(_ctx.integerValue("ListManagedRulesResponse.ManagedRules["+ i +"].ManagedRuleList["+ j +"].ReferenceCount"));
				managedRule.setHelpUrls(_ctx.stringValue("ListManagedRulesResponse.ManagedRules["+ i +"].ManagedRuleList["+ j +"].HelpUrls"));

				List<String> labels = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListManagedRulesResponse.ManagedRules["+ i +"].ManagedRuleList["+ j +"].Labels.Length"); k++) {
					labels.add(_ctx.stringValue("ListManagedRulesResponse.ManagedRules["+ i +"].ManagedRuleList["+ j +"].Labels["+ k +"]"));
				}
				managedRule.setLabels(labels);

				managedRuleList.add(managedRule);
			}
			data.setManagedRuleList(managedRuleList);

			managedRules.add(data);
		}
		listManagedRulesResponse.setManagedRules(managedRules);
	 
	 	return listManagedRulesResponse;
	}
}