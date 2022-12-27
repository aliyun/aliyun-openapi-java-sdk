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

import com.aliyuncs.config.model.v20200907.ListPreManagedRulesResponse;
import com.aliyuncs.config.model.v20200907.ListPreManagedRulesResponse.ManagedRule;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPreManagedRulesResponseUnmarshaller {

	public static ListPreManagedRulesResponse unmarshall(ListPreManagedRulesResponse listPreManagedRulesResponse, UnmarshallerContext _ctx) {
		
		listPreManagedRulesResponse.setRequestId(_ctx.stringValue("ListPreManagedRulesResponse.RequestId"));
		listPreManagedRulesResponse.setPageNumber(_ctx.longValue("ListPreManagedRulesResponse.PageNumber"));
		listPreManagedRulesResponse.setPageSize(_ctx.longValue("ListPreManagedRulesResponse.PageSize"));

		List<ManagedRule> managedRules = new ArrayList<ManagedRule>();
		for (int i = 0; i < _ctx.lengthValue("ListPreManagedRulesResponse.ManagedRules.Length"); i++) {
			ManagedRule managedRule = new ManagedRule();
			managedRule.setResourceType(_ctx.stringValue("ListPreManagedRulesResponse.ManagedRules["+ i +"].ResourceType"));
			managedRule.setDescription(_ctx.stringValue("ListPreManagedRulesResponse.ManagedRules["+ i +"].Description"));
			managedRule.setInputParameters(_ctx.mapValue("ListPreManagedRulesResponse.ManagedRules["+ i +"].InputParameters"));
			managedRule.setOptionalInputParameterDetails(_ctx.mapValue("ListPreManagedRulesResponse.ManagedRules["+ i +"].OptionalInputParameterDetails"));
			managedRule.setIdentifier(_ctx.stringValue("ListPreManagedRulesResponse.ManagedRules["+ i +"].Identifier"));
			managedRule.setConfigRuleName(_ctx.stringValue("ListPreManagedRulesResponse.ManagedRules["+ i +"].ConfigRuleName"));
			managedRule.setHelpUrls(_ctx.stringValue("ListPreManagedRulesResponse.ManagedRules["+ i +"].HelpUrls"));
			managedRule.setDefaultEnable(_ctx.booleanValue("ListPreManagedRulesResponse.ManagedRules["+ i +"].DefaultEnable"));
			managedRule.setNonCompliantSample(_ctx.stringValue("ListPreManagedRulesResponse.ManagedRules["+ i +"].NonCompliantSample"));
			managedRule.setCompliantSample(_ctx.stringValue("ListPreManagedRulesResponse.ManagedRules["+ i +"].CompliantSample"));
			managedRule.setCompulsoryInputParameterDetails(_ctx.mapValue("ListPreManagedRulesResponse.ManagedRules["+ i +"].CompulsoryInputParameterDetails"));

			List<Map<Object, Object>> sourceConditions = _ctx.listMapValue("ListPreManagedRulesResponse.ManagedRules["+ i +"].SourceConditions");
			managedRule.setSourceConditions(sourceConditions);

			managedRules.add(managedRule);
		}
		listPreManagedRulesResponse.setManagedRules(managedRules);
	 
	 	return listPreManagedRulesResponse;
	}
}