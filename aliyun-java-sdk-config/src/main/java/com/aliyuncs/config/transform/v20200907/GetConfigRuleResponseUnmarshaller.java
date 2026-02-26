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

import com.aliyuncs.config.model.v20200907.GetConfigRuleResponse;
import com.aliyuncs.config.model.v20200907.GetConfigRuleResponse.ConfigRule;
import com.aliyuncs.config.model.v20200907.GetConfigRuleResponse.ConfigRule.Compliance;
import com.aliyuncs.config.model.v20200907.GetConfigRuleResponse.ConfigRule.ComplianceExcludeTagsScope;
import com.aliyuncs.config.model.v20200907.GetConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus;
import com.aliyuncs.config.model.v20200907.GetConfigRuleResponse.ConfigRule.CreateBy;
import com.aliyuncs.config.model.v20200907.GetConfigRuleResponse.ConfigRule.ManagedRule;
import com.aliyuncs.config.model.v20200907.GetConfigRuleResponse.ConfigRule.ManagedRule.SourceDetailsItem;
import com.aliyuncs.config.model.v20200907.GetConfigRuleResponse.ConfigRule.Scope;
import com.aliyuncs.config.model.v20200907.GetConfigRuleResponse.ConfigRule.Source;
import com.aliyuncs.config.model.v20200907.GetConfigRuleResponse.ConfigRule.Source.SourceDetailsItem2;
import com.aliyuncs.config.model.v20200907.GetConfigRuleResponse.ConfigRule.TagsItem;
import com.aliyuncs.config.model.v20200907.GetConfigRuleResponse.ConfigRule.TagsScopeItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConfigRuleResponseUnmarshaller {

	public static GetConfigRuleResponse unmarshall(GetConfigRuleResponse getConfigRuleResponse, UnmarshallerContext _ctx) {
		
		getConfigRuleResponse.setRequestId(_ctx.stringValue("GetConfigRuleResponse.RequestId"));

		ConfigRule configRule = new ConfigRule();
		configRule.setAccountId(_ctx.longValue("GetConfigRuleResponse.ConfigRule.AccountId"));
		configRule.setConfigRuleArn(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ConfigRuleArn"));
		configRule.setConfigRuleId(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ConfigRuleId"));
		configRule.setConfigRuleName(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ConfigRuleName"));
		configRule.setConfigRuleState(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ConfigRuleState"));
		configRule.setConfigRuleTriggerTypes(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ConfigRuleTriggerTypes"));
		configRule.setCreateTimestamp(_ctx.longValue("GetConfigRuleResponse.ConfigRule.CreateTimestamp"));
		configRule.setDescription(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.Description"));
		configRule.setExcludeRegionIdsScope(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ExcludeRegionIdsScope"));
		configRule.setExcludeResourceGroupIdsScope(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ExcludeResourceGroupIdsScope"));
		configRule.setExcludeResourceIdsScope(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ExcludeResourceIdsScope"));
		configRule.setInputParameters(_ctx.mapValue("GetConfigRuleResponse.ConfigRule.InputParameters"));
		configRule.setMaximumExecutionFrequency(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.MaximumExecutionFrequency"));
		configRule.setModifiedTimestamp(_ctx.longValue("GetConfigRuleResponse.ConfigRule.ModifiedTimestamp"));
		configRule.setRegionIdsScope(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.RegionIdsScope"));
		configRule.setResourceGroupIdsScope(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ResourceGroupIdsScope"));
		configRule.setResourceIdsScope(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ResourceIdsScope"));
		configRule.setResourceTypesScope(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ResourceTypesScope"));
		configRule.setRiskLevel(_ctx.integerValue("GetConfigRuleResponse.ConfigRule.RiskLevel"));
		configRule.setServiceChannel(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ServiceChannel"));
		configRule.setTagKeyLogicScope(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.TagKeyLogicScope"));
		configRule.setTagKeyScope(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.TagKeyScope"));
		configRule.setTagValueScope(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.TagValueScope"));
		configRule.setResourceNameScope(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ResourceNameScope"));
		configRule.setExtendContent(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ExtendContent"));

		Compliance compliance = new Compliance();
		compliance.setComplianceType(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.Compliance.ComplianceType"));
		compliance.setCount(_ctx.integerValue("GetConfigRuleResponse.ConfigRule.Compliance.Count"));
		configRule.setCompliance(compliance);

		ConfigRuleEvaluationStatus configRuleEvaluationStatus = new ConfigRuleEvaluationStatus();
		configRuleEvaluationStatus.setFirstActivatedTimestamp(_ctx.longValue("GetConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.FirstActivatedTimestamp"));
		configRuleEvaluationStatus.setFirstEvaluationStarted(_ctx.booleanValue("GetConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.FirstEvaluationStarted"));
		configRuleEvaluationStatus.setLastErrorCode(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.LastErrorCode"));
		configRuleEvaluationStatus.setLastErrorMessage(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.LastErrorMessage"));
		configRuleEvaluationStatus.setLastFailedEvaluationTimestamp(_ctx.longValue("GetConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.LastFailedEvaluationTimestamp"));
		configRuleEvaluationStatus.setLastFailedInvocationTimestamp(_ctx.longValue("GetConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.LastFailedInvocationTimestamp"));
		configRuleEvaluationStatus.setLastSuccessfulEvaluationTimestamp(_ctx.longValue("GetConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.LastSuccessfulEvaluationTimestamp"));
		configRuleEvaluationStatus.setLastSuccessfulInvocationTimestamp(_ctx.longValue("GetConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.LastSuccessfulInvocationTimestamp"));
		configRule.setConfigRuleEvaluationStatus(configRuleEvaluationStatus);

		CreateBy createBy = new CreateBy();
		createBy.setAggregatorId(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.CreateBy.AggregatorId"));
		createBy.setAggregatorName(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.CreateBy.AggregatorName"));
		createBy.setCompliancePackId(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.CreateBy.CompliancePackId"));
		createBy.setCompliancePackName(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.CreateBy.CompliancePackName"));
		createBy.setCreatorId(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.CreateBy.CreatorId"));
		createBy.setCreatorName(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.CreateBy.CreatorName"));
		createBy.setCreatorType(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.CreateBy.CreatorType"));
		configRule.setCreateBy(createBy);

		ManagedRule managedRule = new ManagedRule();
		managedRule.setCompulsoryInputParameterDetails(_ctx.mapValue("GetConfigRuleResponse.ConfigRule.ManagedRule.CompulsoryInputParameterDetails"));
		managedRule.setDescription(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ManagedRule.Description"));
		managedRule.setHelpUrl(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ManagedRule.HelpUrl"));
		managedRule.setIdentifier(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ManagedRule.Identifier"));
		managedRule.setManagedRuleName(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ManagedRule.ManagedRuleName"));
		managedRule.setOptionalInputParameterDetails(_ctx.mapValue("GetConfigRuleResponse.ConfigRule.ManagedRule.OptionalInputParameterDetails"));

		List<String> labels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetConfigRuleResponse.ConfigRule.ManagedRule.Labels.Length"); i++) {
			labels.add(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ManagedRule.Labels["+ i +"]"));
		}
		managedRule.setLabels(labels);

		List<SourceDetailsItem> sourceDetails = new ArrayList<SourceDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetConfigRuleResponse.ConfigRule.ManagedRule.SourceDetails.Length"); i++) {
			SourceDetailsItem sourceDetailsItem = new SourceDetailsItem();
			sourceDetailsItem.setEventSource(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ManagedRule.SourceDetails["+ i +"].EventSource"));
			sourceDetailsItem.setMaximumExecutionFrequency(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ManagedRule.SourceDetails["+ i +"].MaximumExecutionFrequency"));
			sourceDetailsItem.setMessageType(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ManagedRule.SourceDetails["+ i +"].MessageType"));

			sourceDetails.add(sourceDetailsItem);
		}
		managedRule.setSourceDetails(sourceDetails);
		configRule.setManagedRule(managedRule);

		Scope scope = new Scope();

		List<String> complianceResourceTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetConfigRuleResponse.ConfigRule.Scope.ComplianceResourceTypes.Length"); i++) {
			complianceResourceTypes.add(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.Scope.ComplianceResourceTypes["+ i +"]"));
		}
		scope.setComplianceResourceTypes(complianceResourceTypes);
		configRule.setScope(scope);

		Source source = new Source();
		source.setConditions(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.Source.Conditions"));
		source.setIdentifier(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.Source.Identifier"));
		source.setOwner(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.Source.Owner"));

		List<Map<Object, Object>> sourceConditions = _ctx.listMapValue("GetConfigRuleResponse.ConfigRule.Source.SourceConditions");
		source.setSourceConditions(sourceConditions);

		List<SourceDetailsItem2> sourceDetails1 = new ArrayList<SourceDetailsItem2>();
		for (int i = 0; i < _ctx.lengthValue("GetConfigRuleResponse.ConfigRule.Source.SourceDetails.Length"); i++) {
			SourceDetailsItem2 sourceDetailsItem2 = new SourceDetailsItem2();
			sourceDetailsItem2.setEventSource(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.Source.SourceDetails["+ i +"].EventSource"));
			sourceDetailsItem2.setMaximumExecutionFrequency(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.Source.SourceDetails["+ i +"].MaximumExecutionFrequency"));
			sourceDetailsItem2.setMessageType(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.Source.SourceDetails["+ i +"].MessageType"));

			sourceDetails1.add(sourceDetailsItem2);
		}
		source.setSourceDetails1(sourceDetails1);
		configRule.setSource(source);

		List<ComplianceExcludeTagsScope> excludeTagsScope = new ArrayList<ComplianceExcludeTagsScope>();
		for (int i = 0; i < _ctx.lengthValue("GetConfigRuleResponse.ConfigRule.ExcludeTagsScope.Length"); i++) {
			ComplianceExcludeTagsScope complianceExcludeTagsScope = new ComplianceExcludeTagsScope();
			complianceExcludeTagsScope.setTagKey(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ExcludeTagsScope["+ i +"].TagKey"));
			complianceExcludeTagsScope.setTagValue(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ExcludeTagsScope["+ i +"].TagValue"));

			excludeTagsScope.add(complianceExcludeTagsScope);
		}
		configRule.setExcludeTagsScope(excludeTagsScope);

		List<TagsScopeItem> tagsScope = new ArrayList<TagsScopeItem>();
		for (int i = 0; i < _ctx.lengthValue("GetConfigRuleResponse.ConfigRule.TagsScope.Length"); i++) {
			TagsScopeItem tagsScopeItem = new TagsScopeItem();
			tagsScopeItem.setTagKey(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.TagsScope["+ i +"].TagKey"));
			tagsScopeItem.setTagValue(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.TagsScope["+ i +"].TagValue"));

			tagsScope.add(tagsScopeItem);
		}
		configRule.setTagsScope(tagsScope);

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetConfigRuleResponse.ConfigRule.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setTagKey(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.Tags["+ i +"].TagKey"));
			tagsItem.setTagValue(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.Tags["+ i +"].TagValue"));

			tags.add(tagsItem);
		}
		configRule.setTags(tags);
		getConfigRuleResponse.setConfigRule(configRule);
	 
	 	return getConfigRuleResponse;
	}
}