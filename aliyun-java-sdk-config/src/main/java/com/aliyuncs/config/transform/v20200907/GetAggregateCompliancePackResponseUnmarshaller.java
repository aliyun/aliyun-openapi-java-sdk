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

import com.aliyuncs.config.model.v20200907.GetAggregateCompliancePackResponse;
import com.aliyuncs.config.model.v20200907.GetAggregateCompliancePackResponse.CompliancePack;
import com.aliyuncs.config.model.v20200907.GetAggregateCompliancePackResponse.CompliancePack.ConfigRulesItem;
import com.aliyuncs.config.model.v20200907.GetAggregateCompliancePackResponse.CompliancePack.ConfigRulesItem.ConfigRuleParametersItem;
import com.aliyuncs.config.model.v20200907.GetAggregateCompliancePackResponse.CompliancePack.Scope;
import com.aliyuncs.config.model.v20200907.GetAggregateCompliancePackResponse.CompliancePack.Scope.ExcludeTagsScopeItem;
import com.aliyuncs.config.model.v20200907.GetAggregateCompliancePackResponse.CompliancePack.Scope.TagsScopeItem;
import com.aliyuncs.config.model.v20200907.GetAggregateCompliancePackResponse.CompliancePack.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAggregateCompliancePackResponseUnmarshaller {

	public static GetAggregateCompliancePackResponse unmarshall(GetAggregateCompliancePackResponse getAggregateCompliancePackResponse, UnmarshallerContext _ctx) {
		
		getAggregateCompliancePackResponse.setRequestId(_ctx.stringValue("GetAggregateCompliancePackResponse.RequestId"));

		CompliancePack compliancePack = new CompliancePack();
		compliancePack.setStatus(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.Status"));
		compliancePack.setRiskLevel(_ctx.integerValue("GetAggregateCompliancePackResponse.CompliancePack.RiskLevel"));
		compliancePack.setCompliancePackId(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.CompliancePackId"));
		compliancePack.setDescription(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.Description"));
		compliancePack.setTemplateContent(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.TemplateContent"));
		compliancePack.setCompliancePackName(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.CompliancePackName"));
		compliancePack.setAccountId(_ctx.longValue("GetAggregateCompliancePackResponse.CompliancePack.AccountId"));
		compliancePack.setAggregatorId(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.AggregatorId"));
		compliancePack.setCompliancePackTemplateId(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.CompliancePackTemplateId"));
		compliancePack.setCreateTimestamp(_ctx.longValue("GetAggregateCompliancePackResponse.CompliancePack.CreateTimestamp"));

		Scope scope = new Scope();
		scope.setExcludeRegionIdsScope(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.Scope.ExcludeRegionIdsScope"));
		scope.setResourceIdsScope(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.Scope.ResourceIdsScope"));
		scope.setExcludeResourceGroupIdsScope(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.Scope.ExcludeResourceGroupIdsScope"));
		scope.setTagKeyScope(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.Scope.TagKeyScope"));
		scope.setTagValueScope(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.Scope.TagValueScope"));
		scope.setRegionIdsScope(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.Scope.RegionIdsScope"));
		scope.setExcludeResourceIdsScope(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.Scope.ExcludeResourceIdsScope"));
		scope.setResourceGroupIdsScope(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.Scope.ResourceGroupIdsScope"));

		List<TagsScopeItem> tagsScope = new ArrayList<TagsScopeItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAggregateCompliancePackResponse.CompliancePack.Scope.TagsScope.Length"); i++) {
			TagsScopeItem tagsScopeItem = new TagsScopeItem();
			tagsScopeItem.setTagKey(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.Scope.TagsScope["+ i +"].TagKey"));
			tagsScopeItem.setTagValue(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.Scope.TagsScope["+ i +"].TagValue"));

			tagsScope.add(tagsScopeItem);
		}
		scope.setTagsScope(tagsScope);

		List<ExcludeTagsScopeItem> excludeTagsScope = new ArrayList<ExcludeTagsScopeItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAggregateCompliancePackResponse.CompliancePack.Scope.ExcludeTagsScope.Length"); i++) {
			ExcludeTagsScopeItem excludeTagsScopeItem = new ExcludeTagsScopeItem();
			excludeTagsScopeItem.setTagKey(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.Scope.ExcludeTagsScope["+ i +"].TagKey"));
			excludeTagsScopeItem.setTagValue(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.Scope.ExcludeTagsScope["+ i +"].TagValue"));

			excludeTagsScope.add(excludeTagsScopeItem);
		}
		scope.setExcludeTagsScope(excludeTagsScope);
		compliancePack.setScope(scope);

		List<ConfigRulesItem> configRules = new ArrayList<ConfigRulesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAggregateCompliancePackResponse.CompliancePack.ConfigRules.Length"); i++) {
			ConfigRulesItem configRulesItem = new ConfigRulesItem();
			configRulesItem.setManagedRuleIdentifier(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.ConfigRules["+ i +"].ManagedRuleIdentifier"));
			configRulesItem.setConfigRuleName(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.ConfigRules["+ i +"].ConfigRuleName"));
			configRulesItem.setConfigRuleId(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.ConfigRules["+ i +"].ConfigRuleId"));
			configRulesItem.setDescription(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.ConfigRules["+ i +"].Description"));
			configRulesItem.setRiskLevel(_ctx.integerValue("GetAggregateCompliancePackResponse.CompliancePack.ConfigRules["+ i +"].RiskLevel"));
			configRulesItem.setResourceTypesScope(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.ConfigRules["+ i +"].ResourceTypesScope"));

			List<ConfigRuleParametersItem> configRuleParameters = new ArrayList<ConfigRuleParametersItem>();
			for (int j = 0; j < _ctx.lengthValue("GetAggregateCompliancePackResponse.CompliancePack.ConfigRules["+ i +"].ConfigRuleParameters.Length"); j++) {
				ConfigRuleParametersItem configRuleParametersItem = new ConfigRuleParametersItem();
				configRuleParametersItem.setRequired(_ctx.booleanValue("GetAggregateCompliancePackResponse.CompliancePack.ConfigRules["+ i +"].ConfigRuleParameters["+ j +"].Required"));
				configRuleParametersItem.setParameterName(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.ConfigRules["+ i +"].ConfigRuleParameters["+ j +"].ParameterName"));
				configRuleParametersItem.setParameterValue(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.ConfigRules["+ i +"].ConfigRuleParameters["+ j +"].ParameterValue"));

				configRuleParameters.add(configRuleParametersItem);
			}
			configRulesItem.setConfigRuleParameters(configRuleParameters);

			configRules.add(configRulesItem);
		}
		compliancePack.setConfigRules(configRules);

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAggregateCompliancePackResponse.CompliancePack.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setTagKey(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.Tags["+ i +"].TagKey"));
			tagsItem.setTagValue(_ctx.stringValue("GetAggregateCompliancePackResponse.CompliancePack.Tags["+ i +"].TagValue"));

			tags.add(tagsItem);
		}
		compliancePack.setTags(tags);
		getAggregateCompliancePackResponse.setCompliancePack(compliancePack);
	 
	 	return getAggregateCompliancePackResponse;
	}
}