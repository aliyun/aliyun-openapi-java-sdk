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

import com.aliyuncs.config.model.v20200907.GetCompliancePackResponse;
import com.aliyuncs.config.model.v20200907.GetCompliancePackResponse.CompliancePack;
import com.aliyuncs.config.model.v20200907.GetCompliancePackResponse.CompliancePack.ConfigRulesItem;
import com.aliyuncs.config.model.v20200907.GetCompliancePackResponse.CompliancePack.ConfigRulesItem.ConfigRuleParametersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCompliancePackResponseUnmarshaller {

	public static GetCompliancePackResponse unmarshall(GetCompliancePackResponse getCompliancePackResponse, UnmarshallerContext _ctx) {
		
		getCompliancePackResponse.setRequestId(_ctx.stringValue("GetCompliancePackResponse.RequestId"));

		CompliancePack compliancePack = new CompliancePack();
		compliancePack.setStatus(_ctx.stringValue("GetCompliancePackResponse.CompliancePack.Status"));
		compliancePack.setCompliancePackId(_ctx.stringValue("GetCompliancePackResponse.CompliancePack.CompliancePackId"));
		compliancePack.setRiskLevel(_ctx.integerValue("GetCompliancePackResponse.CompliancePack.RiskLevel"));
		compliancePack.setDescription(_ctx.stringValue("GetCompliancePackResponse.CompliancePack.Description"));
		compliancePack.setCompliancePackName(_ctx.stringValue("GetCompliancePackResponse.CompliancePack.CompliancePackName"));
		compliancePack.setAccountId(_ctx.longValue("GetCompliancePackResponse.CompliancePack.AccountId"));
		compliancePack.setCompliancePackTemplateId(_ctx.stringValue("GetCompliancePackResponse.CompliancePack.CompliancePackTemplateId"));
		compliancePack.setCreateTimestamp(_ctx.longValue("GetCompliancePackResponse.CompliancePack.CreateTimestamp"));

		List<ConfigRulesItem> configRules = new ArrayList<ConfigRulesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCompliancePackResponse.CompliancePack.ConfigRules.Length"); i++) {
			ConfigRulesItem configRulesItem = new ConfigRulesItem();
			configRulesItem.setManagedRuleIdentifier(_ctx.stringValue("GetCompliancePackResponse.CompliancePack.ConfigRules["+ i +"].ManagedRuleIdentifier"));
			configRulesItem.setConfigRuleName(_ctx.stringValue("GetCompliancePackResponse.CompliancePack.ConfigRules["+ i +"].ConfigRuleName"));
			configRulesItem.setConfigRuleId(_ctx.stringValue("GetCompliancePackResponse.CompliancePack.ConfigRules["+ i +"].ConfigRuleId"));
			configRulesItem.setDescription(_ctx.stringValue("GetCompliancePackResponse.CompliancePack.ConfigRules["+ i +"].Description"));
			configRulesItem.setRiskLevel(_ctx.integerValue("GetCompliancePackResponse.CompliancePack.ConfigRules["+ i +"].RiskLevel"));

			List<ConfigRuleParametersItem> configRuleParameters = new ArrayList<ConfigRuleParametersItem>();
			for (int j = 0; j < _ctx.lengthValue("GetCompliancePackResponse.CompliancePack.ConfigRules["+ i +"].ConfigRuleParameters.Length"); j++) {
				ConfigRuleParametersItem configRuleParametersItem = new ConfigRuleParametersItem();
				configRuleParametersItem.setRequired(_ctx.booleanValue("GetCompliancePackResponse.CompliancePack.ConfigRules["+ i +"].ConfigRuleParameters["+ j +"].Required"));
				configRuleParametersItem.setParameterName(_ctx.stringValue("GetCompliancePackResponse.CompliancePack.ConfigRules["+ i +"].ConfigRuleParameters["+ j +"].ParameterName"));
				configRuleParametersItem.setParameterValue(_ctx.stringValue("GetCompliancePackResponse.CompliancePack.ConfigRules["+ i +"].ConfigRuleParameters["+ j +"].ParameterValue"));

				configRuleParameters.add(configRuleParametersItem);
			}
			configRulesItem.setConfigRuleParameters(configRuleParameters);

			configRules.add(configRulesItem);
		}
		compliancePack.setConfigRules(configRules);
		getCompliancePackResponse.setCompliancePack(compliancePack);
	 
	 	return getCompliancePackResponse;
	}
}