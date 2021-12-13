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

import com.aliyuncs.config.model.v20200907.ListAggregateConfigRulesResponse;
import com.aliyuncs.config.model.v20200907.ListAggregateConfigRulesResponse.ConfigRules;
import com.aliyuncs.config.model.v20200907.ListAggregateConfigRulesResponse.ConfigRules.ConfigRule;
import com.aliyuncs.config.model.v20200907.ListAggregateConfigRulesResponse.ConfigRules.ConfigRule.Compliance;
import com.aliyuncs.config.model.v20200907.ListAggregateConfigRulesResponse.ConfigRules.ConfigRule.CreateBy;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAggregateConfigRulesResponseUnmarshaller {

	public static ListAggregateConfigRulesResponse unmarshall(ListAggregateConfigRulesResponse listAggregateConfigRulesResponse, UnmarshallerContext _ctx) {
		
		listAggregateConfigRulesResponse.setRequestId(_ctx.stringValue("ListAggregateConfigRulesResponse.RequestId"));

		ConfigRules configRules = new ConfigRules();
		configRules.setPageSize(_ctx.integerValue("ListAggregateConfigRulesResponse.ConfigRules.PageSize"));
		configRules.setPageNumber(_ctx.integerValue("ListAggregateConfigRulesResponse.ConfigRules.PageNumber"));
		configRules.setTotalCount(_ctx.longValue("ListAggregateConfigRulesResponse.ConfigRules.TotalCount"));

		List<ConfigRule> configRuleList = new ArrayList<ConfigRule>();
		for (int i = 0; i < _ctx.lengthValue("ListAggregateConfigRulesResponse.ConfigRules.ConfigRuleList.Length"); i++) {
			ConfigRule configRule = new ConfigRule();
			configRule.setRiskLevel(_ctx.integerValue("ListAggregateConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].RiskLevel"));
			configRule.setSourceOwner(_ctx.stringValue("ListAggregateConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].SourceOwner"));
			configRule.setAccountId(_ctx.longValue("ListAggregateConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].AccountId"));
			configRule.setConfigRuleState(_ctx.stringValue("ListAggregateConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].ConfigRuleState"));
			configRule.setSourceIdentifier(_ctx.stringValue("ListAggregateConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].SourceIdentifier"));
			configRule.setConfigRuleArn(_ctx.stringValue("ListAggregateConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].ConfigRuleArn"));
			configRule.setDescription(_ctx.stringValue("ListAggregateConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].Description"));
			configRule.setAutomationType(_ctx.stringValue("ListAggregateConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].AutomationType"));
			configRule.setConfigRuleName(_ctx.stringValue("ListAggregateConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].ConfigRuleName"));
			configRule.setConfigRuleId(_ctx.stringValue("ListAggregateConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].ConfigRuleId"));

			Compliance compliance = new Compliance();
			compliance.setComplianceType(_ctx.stringValue("ListAggregateConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].Compliance.ComplianceType"));
			compliance.setCount(_ctx.integerValue("ListAggregateConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].Compliance.Count"));
			configRule.setCompliance(compliance);

			CreateBy createBy = new CreateBy();
			createBy.setCompliancePackId(_ctx.stringValue("ListAggregateConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].CreateBy.CompliancePackId"));
			createBy.setAggregatorName(_ctx.stringValue("ListAggregateConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].CreateBy.AggregatorName"));
			createBy.setCompliancePackName(_ctx.stringValue("ListAggregateConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].CreateBy.CompliancePackName"));
			createBy.setCreatorName(_ctx.stringValue("ListAggregateConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].CreateBy.CreatorName"));
			createBy.setCreatorType(_ctx.stringValue("ListAggregateConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].CreateBy.CreatorType"));
			createBy.setCreatorId(_ctx.stringValue("ListAggregateConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].CreateBy.CreatorId"));
			createBy.setAggregatorId(_ctx.stringValue("ListAggregateConfigRulesResponse.ConfigRules.ConfigRuleList["+ i +"].CreateBy.AggregatorId"));
			configRule.setCreateBy(createBy);

			configRuleList.add(configRule);
		}
		configRules.setConfigRuleList(configRuleList);
		listAggregateConfigRulesResponse.setConfigRules(configRules);
	 
	 	return listAggregateConfigRulesResponse;
	}
}