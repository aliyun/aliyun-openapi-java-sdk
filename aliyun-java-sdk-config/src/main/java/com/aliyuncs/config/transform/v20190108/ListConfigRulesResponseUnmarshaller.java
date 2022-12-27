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

package com.aliyuncs.config.transform.v20190108;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20190108.ListConfigRulesResponse;
import com.aliyuncs.config.model.v20190108.ListConfigRulesResponse.ConfigRules;
import com.aliyuncs.config.model.v20190108.ListConfigRulesResponse.ConfigRules.ConfigRule;
import com.aliyuncs.config.model.v20190108.ListConfigRulesResponse.ConfigRules.ConfigRule.Compliance;
import com.aliyuncs.config.model.v20190108.ListConfigRulesResponse.ConfigRules.ConfigRule.CreateBy;
import com.aliyuncs.config.model.v20190108.ListConfigRulesResponse.ConfigRules.ConfigRule.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConfigRulesResponseUnmarshaller {

	public static ListConfigRulesResponse unmarshall(ListConfigRulesResponse listConfigRulesResponse, UnmarshallerContext _ctx) {
		
		listConfigRulesResponse.setRequestId(_ctx.stringValue("ListConfigRulesResponse.RequestId"));

		ConfigRules configRules = new ConfigRules();
		configRules.setPageNumber(_ctx.integerValue("ListConfigRulesResponse.ConfigRules.PageNumber"));
		configRules.setPageSize(_ctx.integerValue("ListConfigRulesResponse.ConfigRules.PageSize"));
		configRules.setTotalCount(_ctx.longValue("ListConfigRulesResponse.ConfigRules.TotalCount"));

		List<ConfigRule> configRuleList = new ArrayList<ConfigRule>();
		for (int i = 0; i < _ctx.lengthValue("ListConfigRulesResponse.ConfigRules.ConfigRuleList.Length"); i++) {
			ConfigRule configRule = new ConfigRule();
			configRule.setCompliancePackId(_ctx.stringValue("ListConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].CompliancePackId"));
			configRule.setRiskLevel(_ctx.integerValue("ListConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].RiskLevel"));
			configRule.setSourceOwner(_ctx.stringValue("ListConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].SourceOwner"));
			configRule.setAccountId(_ctx.longValue("ListConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].AccountId"));
			configRule.setConfigRuleState(_ctx.stringValue("ListConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].ConfigRuleState"));
			configRule.setSourceIdentifier(_ctx.stringValue("ListConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].SourceIdentifier"));
			configRule.setConfigRuleArn(_ctx.stringValue("ListConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].ConfigRuleArn"));
			configRule.setDescription(_ctx.stringValue("ListConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].Description"));
			configRule.setAutomationType(_ctx.stringValue("ListConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].AutomationType"));
			configRule.setConfigRuleName(_ctx.stringValue("ListConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].ConfigRuleName"));
			configRule.setConfigRuleId(_ctx.stringValue("ListConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].ConfigRuleId"));

			Compliance compliance = new Compliance();
			compliance.setComplianceType(_ctx.stringValue("ListConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].Compliance.ComplianceType"));
			compliance.setCount(_ctx.integerValue("ListConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].Compliance.Count"));
			configRule.setCompliance(compliance);

			CreateBy createBy = new CreateBy();
			createBy.setCompliancePackId(_ctx.stringValue("ListConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].CreateBy.CompliancePackId"));
			createBy.setConfigRuleSceneId(_ctx.stringValue("ListConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].CreateBy.ConfigRuleSceneId"));
			createBy.setCompliancePackName(_ctx.stringValue("ListConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].CreateBy.CompliancePackName"));
			createBy.setCreatorName(_ctx.stringValue("ListConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].CreateBy.CreatorName"));
			createBy.setCreatorType(_ctx.stringValue("ListConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].CreateBy.CreatorType"));
			createBy.setCreatorId(_ctx.stringValue("ListConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].CreateBy.CreatorId"));
			createBy.setConfigRuleSceneName(_ctx.stringValue("ListConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].CreateBy.ConfigRuleSceneName"));
			configRule.setCreateBy(createBy);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("ListConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("ListConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			configRule.setTags(tags);

			configRuleList.add(configRule);
		}
		configRules.setConfigRuleList(configRuleList);
		listConfigRulesResponse.setConfigRules(configRules);
	 
	 	return listConfigRulesResponse;
	}
}