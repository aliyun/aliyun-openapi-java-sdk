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

import com.aliyuncs.config.model.v20200907.GetManagedRuleResponse;
import com.aliyuncs.config.model.v20200907.GetManagedRuleResponse.ManagedRule;
import com.aliyuncs.config.model.v20200907.GetManagedRuleResponse.ManagedRule.Scope;
import com.aliyuncs.config.model.v20200907.GetManagedRuleResponse.ManagedRule.SourceDetailsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetManagedRuleResponseUnmarshaller {

	public static GetManagedRuleResponse unmarshall(GetManagedRuleResponse getManagedRuleResponse, UnmarshallerContext _ctx) {
		
		getManagedRuleResponse.setRequestId(_ctx.stringValue("GetManagedRuleResponse.RequestId"));

		ManagedRule managedRule = new ManagedRule();
		managedRule.setRiskLevel(_ctx.integerValue("GetManagedRuleResponse.ManagedRule.RiskLevel"));
		managedRule.setHelpHint(_ctx.stringValue("GetManagedRuleResponse.ManagedRule.HelpHint"));
		managedRule.setDefaultName(_ctx.stringValue("GetManagedRuleResponse.ManagedRule.DefaultName"));
		managedRule.setOptionalInputParameterDetails(_ctx.mapValue("GetManagedRuleResponse.ManagedRule.OptionalInputParameterDetails"));
		managedRule.setIdentifier(_ctx.stringValue("GetManagedRuleResponse.ManagedRule.Identifier"));
		managedRule.setCompulsoryInputParameterDetails(_ctx.mapValue("GetManagedRuleResponse.ManagedRule.CompulsoryInputParameterDetails"));
		managedRule.setRegionId(_ctx.stringValue("GetManagedRuleResponse.ManagedRule.RegionId"));
		managedRule.setDescription(_ctx.stringValue("GetManagedRuleResponse.ManagedRule.Description"));
		managedRule.setFunctionName(_ctx.stringValue("GetManagedRuleResponse.ManagedRule.FunctionName"));
		managedRule.setConfigRuleName(_ctx.stringValue("GetManagedRuleResponse.ManagedRule.ConfigRuleName"));
		managedRule.setHelpDoc(_ctx.stringValue("GetManagedRuleResponse.ManagedRule.HelpDoc"));
		managedRule.setHelpUrls(_ctx.stringValue("GetManagedRuleResponse.ManagedRule.HelpUrls"));
		managedRule.setServiceName(_ctx.stringValue("GetManagedRuleResponse.ManagedRule.ServiceName"));
		managedRule.setCreateTimestamp(_ctx.longValue("GetManagedRuleResponse.ManagedRule.CreateTimestamp"));

		List<String> labels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetManagedRuleResponse.ManagedRule.Labels.Length"); i++) {
			labels.add(_ctx.stringValue("GetManagedRuleResponse.ManagedRule.Labels["+ i +"]"));
		}
		managedRule.setLabels(labels);

		List<Map<Object, Object>> sourceConditions = _ctx.listMapValue("GetManagedRuleResponse.ManagedRule.SourceConditions");
		managedRule.setSourceConditions(sourceConditions);

		Scope scope = new Scope();

		List<String> complianceResourceTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetManagedRuleResponse.ManagedRule.Scope.ComplianceResourceTypes.Length"); i++) {
			complianceResourceTypes.add(_ctx.stringValue("GetManagedRuleResponse.ManagedRule.Scope.ComplianceResourceTypes["+ i +"]"));
		}
		scope.setComplianceResourceTypes(complianceResourceTypes);
		managedRule.setScope(scope);

		List<SourceDetailsItem> sourceDetails = new ArrayList<SourceDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetManagedRuleResponse.ManagedRule.SourceDetails.Length"); i++) {
			SourceDetailsItem sourceDetailsItem = new SourceDetailsItem();
			sourceDetailsItem.setMessageType(_ctx.stringValue("GetManagedRuleResponse.ManagedRule.SourceDetails["+ i +"].MessageType"));
			sourceDetailsItem.setEventSource(_ctx.stringValue("GetManagedRuleResponse.ManagedRule.SourceDetails["+ i +"].EventSource"));
			sourceDetailsItem.setMaximumExecutionFrequency(_ctx.stringValue("GetManagedRuleResponse.ManagedRule.SourceDetails["+ i +"].MaximumExecutionFrequency"));

			sourceDetails.add(sourceDetailsItem);
		}
		managedRule.setSourceDetails(sourceDetails);
		getManagedRuleResponse.setManagedRule(managedRule);
	 
	 	return getManagedRuleResponse;
	}
}