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

import com.aliyuncs.config.model.v20200907.ListCompliancePackTemplatesResponse;
import com.aliyuncs.config.model.v20200907.ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult;
import com.aliyuncs.config.model.v20200907.ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplate;
import com.aliyuncs.config.model.v20200907.ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplate.ConfigRulesItem;
import com.aliyuncs.config.model.v20200907.ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplate.ConfigRulesItem.ConfigRuleParametersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCompliancePackTemplatesResponseUnmarshaller {

	public static ListCompliancePackTemplatesResponse unmarshall(ListCompliancePackTemplatesResponse listCompliancePackTemplatesResponse, UnmarshallerContext _ctx) {
		
		listCompliancePackTemplatesResponse.setRequestId(_ctx.stringValue("ListCompliancePackTemplatesResponse.RequestId"));

		CompliancePackTemplatesResult compliancePackTemplatesResult = new CompliancePackTemplatesResult();
		compliancePackTemplatesResult.setPageSize(_ctx.integerValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.PageSize"));
		compliancePackTemplatesResult.setPageNumber(_ctx.integerValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.PageNumber"));
		compliancePackTemplatesResult.setTotalCount(_ctx.longValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.TotalCount"));

		List<CompliancePackTemplate> compliancePackTemplates = new ArrayList<CompliancePackTemplate>();
		for (int i = 0; i < _ctx.lengthValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplates.Length"); i++) {
			CompliancePackTemplate compliancePackTemplate = new CompliancePackTemplate();
			compliancePackTemplate.setRiskLevel(_ctx.integerValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplates["+ i +"].RiskLevel"));
			compliancePackTemplate.setDescription(_ctx.stringValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplates["+ i +"].Description"));
			compliancePackTemplate.setAutomationHelpUrl(_ctx.stringValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplates["+ i +"].AutomationHelpUrl"));
			compliancePackTemplate.setCompliancePackTemplateName(_ctx.stringValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplates["+ i +"].CompliancePackTemplateName"));
			compliancePackTemplate.setCompliancePackTemplateId(_ctx.stringValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplates["+ i +"].CompliancePackTemplateId"));
			compliancePackTemplate.setDomain(_ctx.stringValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplates["+ i +"].Domain"));
			compliancePackTemplate.setLabels(_ctx.stringValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplates["+ i +"].Labels"));
			compliancePackTemplate.setDeveloperType(_ctx.stringValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplates["+ i +"].DeveloperType"));
			compliancePackTemplate.setLastUpdate(_ctx.integerValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplates["+ i +"].LastUpdate"));

			List<ConfigRulesItem> configRules = new ArrayList<ConfigRulesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplates["+ i +"].ConfigRules.Length"); j++) {
				ConfigRulesItem configRulesItem = new ConfigRulesItem();
				configRulesItem.setDescription(_ctx.stringValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplates["+ i +"].ConfigRules["+ j +"].Description"));
				configRulesItem.setManagedRuleIdentifier(_ctx.stringValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplates["+ i +"].ConfigRules["+ j +"].ManagedRuleIdentifier"));
				configRulesItem.setManagedRuleName(_ctx.stringValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplates["+ i +"].ConfigRules["+ j +"].ManagedRuleName"));
				configRulesItem.setRiskLevel(_ctx.integerValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplates["+ i +"].ConfigRules["+ j +"].RiskLevel"));
				configRulesItem.setDeveloperType(_ctx.stringValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplates["+ i +"].ConfigRules["+ j +"].DeveloperType"));
				configRulesItem.setControlId(_ctx.stringValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplates["+ i +"].ConfigRules["+ j +"].ControlId"));
				configRulesItem.setControlDescription(_ctx.stringValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplates["+ i +"].ConfigRules["+ j +"].ControlDescription"));
				configRulesItem.setDefaultEnable(_ctx.booleanValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplates["+ i +"].ConfigRules["+ j +"].DefaultEnable"));

				List<ConfigRuleParametersItem> configRuleParameters = new ArrayList<ConfigRuleParametersItem>();
				for (int k = 0; k < _ctx.lengthValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplates["+ i +"].ConfigRules["+ j +"].ConfigRuleParameters.Length"); k++) {
					ConfigRuleParametersItem configRuleParametersItem = new ConfigRuleParametersItem();
					configRuleParametersItem.setRequired(_ctx.booleanValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplates["+ i +"].ConfigRules["+ j +"].ConfigRuleParameters["+ k +"].Required"));
					configRuleParametersItem.setParameterName(_ctx.stringValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplates["+ i +"].ConfigRules["+ j +"].ConfigRuleParameters["+ k +"].ParameterName"));
					configRuleParametersItem.setParameterValue(_ctx.stringValue("ListCompliancePackTemplatesResponse.CompliancePackTemplatesResult.CompliancePackTemplates["+ i +"].ConfigRules["+ j +"].ConfigRuleParameters["+ k +"].ParameterValue"));

					configRuleParameters.add(configRuleParametersItem);
				}
				configRulesItem.setConfigRuleParameters(configRuleParameters);

				configRules.add(configRulesItem);
			}
			compliancePackTemplate.setConfigRules(configRules);

			compliancePackTemplates.add(compliancePackTemplate);
		}
		compliancePackTemplatesResult.setCompliancePackTemplates(compliancePackTemplates);
		listCompliancePackTemplatesResponse.setCompliancePackTemplatesResult(compliancePackTemplatesResult);
	 
	 	return listCompliancePackTemplatesResponse;
	}
}