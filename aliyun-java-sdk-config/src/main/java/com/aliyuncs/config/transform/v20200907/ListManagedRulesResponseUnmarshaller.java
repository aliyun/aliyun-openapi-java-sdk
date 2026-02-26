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
import com.aliyuncs.config.model.v20200907.ListManagedRulesResponse.ManagedRules;
import com.aliyuncs.config.model.v20200907.ListManagedRulesResponse.ManagedRules.ManagedRule;
import com.aliyuncs.config.model.v20200907.ListManagedRulesResponse.ManagedRules.ManagedRule.Scope;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListManagedRulesResponseUnmarshaller {

	public static ListManagedRulesResponse unmarshall(ListManagedRulesResponse listManagedRulesResponse, UnmarshallerContext _ctx) {
		
		listManagedRulesResponse.setRequestId(_ctx.stringValue("ListManagedRulesResponse.RequestId"));

		ManagedRules managedRules = new ManagedRules();
		managedRules.setPageSize(_ctx.integerValue("ListManagedRulesResponse.ManagedRules.PageSize"));
		managedRules.setPageNumber(_ctx.integerValue("ListManagedRulesResponse.ManagedRules.PageNumber"));
		managedRules.setTotalCount(_ctx.longValue("ListManagedRulesResponse.ManagedRules.TotalCount"));

		List<ManagedRule> managedRuleList = new ArrayList<ManagedRule>();
		for (int i = 0; i < _ctx.lengthValue("ListManagedRulesResponse.ManagedRules.ManagedRuleList.Length"); i++) {
			ManagedRule managedRule = new ManagedRule();
			managedRule.setRiskLevel(_ctx.integerValue("ListManagedRulesResponse.ManagedRules.ManagedRuleList["+ i +"].RiskLevel"));
			managedRule.setDescription(_ctx.stringValue("ListManagedRulesResponse.ManagedRules.ManagedRuleList["+ i +"].Description"));
			managedRule.setUseCases(_ctx.stringValue("ListManagedRulesResponse.ManagedRules.ManagedRuleList["+ i +"].UseCases"));
			managedRule.setIdentifier(_ctx.stringValue("ListManagedRulesResponse.ManagedRules.ManagedRuleList["+ i +"].Identifier"));
			managedRule.setConfigRuleName(_ctx.stringValue("ListManagedRulesResponse.ManagedRules.ManagedRuleList["+ i +"].ConfigRuleName"));
			managedRule.setReferenceCount(_ctx.integerValue("ListManagedRulesResponse.ManagedRules.ManagedRuleList["+ i +"].ReferenceCount"));
			managedRule.setHelpUrls(_ctx.stringValue("ListManagedRulesResponse.ManagedRules.ManagedRuleList["+ i +"].HelpUrls"));
			managedRule.setSupportPreviewManagedRule(_ctx.booleanValue("ListManagedRulesResponse.ManagedRules.ManagedRuleList["+ i +"].SupportPreviewManagedRule"));
			managedRule.setRemediationTemplateIdentifier(_ctx.stringValue("ListManagedRulesResponse.ManagedRules.ManagedRuleList["+ i +"].RemediationTemplateIdentifier"));
			managedRule.setRemediationTemplateName(_ctx.stringValue("ListManagedRulesResponse.ManagedRules.ManagedRuleList["+ i +"].RemediationTemplateName"));

			List<String> labels = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListManagedRulesResponse.ManagedRules.ManagedRuleList["+ i +"].Labels.Length"); j++) {
				labels.add(_ctx.stringValue("ListManagedRulesResponse.ManagedRules.ManagedRuleList["+ i +"].Labels["+ j +"]"));
			}
			managedRule.setLabels(labels);

			Scope scope = new Scope();

			List<String> complianceResourceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListManagedRulesResponse.ManagedRules.ManagedRuleList["+ i +"].Scope.ComplianceResourceTypes.Length"); j++) {
				complianceResourceTypes.add(_ctx.stringValue("ListManagedRulesResponse.ManagedRules.ManagedRuleList["+ i +"].Scope.ComplianceResourceTypes["+ j +"]"));
			}
			scope.setComplianceResourceTypes(complianceResourceTypes);
			managedRule.setScope(scope);

			managedRuleList.add(managedRule);
		}
		managedRules.setManagedRuleList(managedRuleList);
		listManagedRulesResponse.setManagedRules(managedRules);
	 
	 	return listManagedRulesResponse;
	}
}