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
import com.aliyuncs.config.model.v20200907.GetConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus;
import com.aliyuncs.config.model.v20200907.GetConfigRuleResponse.ConfigRule.CreateBy;
import com.aliyuncs.config.model.v20200907.GetConfigRuleResponse.ConfigRule.ManagedRule;
import com.aliyuncs.config.model.v20200907.GetConfigRuleResponse.ConfigRule.ManagedRule.SourceDetailsItem2;
import com.aliyuncs.config.model.v20200907.GetConfigRuleResponse.ConfigRule.Scope;
import com.aliyuncs.config.model.v20200907.GetConfigRuleResponse.ConfigRule.Source;
import com.aliyuncs.config.model.v20200907.GetConfigRuleResponse.ConfigRule.Source.SourceDetailsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConfigRuleResponseUnmarshaller {

	public static GetConfigRuleResponse unmarshall(GetConfigRuleResponse getConfigRuleResponse, UnmarshallerContext _ctx) {
		
		getConfigRuleResponse.setRequestId(_ctx.stringValue("GetConfigRuleResponse.RequestId"));

		ConfigRule configRule = new ConfigRule();
		configRule.setRiskLevel(_ctx.integerValue("GetConfigRuleResponse.ConfigRule.RiskLevel"));
		configRule.setInputParameters(_ctx.mapValue("GetConfigRuleResponse.ConfigRule.InputParameters"));
		configRule.setConfigRuleState(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ConfigRuleState"));
		configRule.setMaximumExecutionFrequency(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.MaximumExecutionFrequency"));
		configRule.setConfigRuleArn(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ConfigRuleArn"));
		configRule.setDescription(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.Description"));
		configRule.setConfigRuleName(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ConfigRuleName"));
		configRule.setConfigRuleId(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ConfigRuleId"));
		configRule.setModifiedTimestamp(_ctx.longValue("GetConfigRuleResponse.ConfigRule.ModifiedTimestamp"));
		configRule.setCreateTimestamp(_ctx.longValue("GetConfigRuleResponse.ConfigRule.CreateTimestamp"));
		configRule.setResourceTypesScope(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ResourceTypesScope"));
		configRule.setRegionIdsScope(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.RegionIdsScope"));
		configRule.setExcludeResourceIdsScope(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ExcludeResourceIdsScope"));
		configRule.setResourceGroupIdsScope(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ResourceGroupIdsScope"));
		configRule.setTagKeyScope(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.TagKeyScope"));
		configRule.setTagValueScope(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.TagValueScope"));
		configRule.setConfigRuleTriggerTypes(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ConfigRuleTriggerTypes"));
		configRule.setTagKeyLogicScope(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.TagKeyLogicScope"));
		configRule.setAccountId(_ctx.longValue("GetConfigRuleResponse.ConfigRule.AccountId"));

		Source source = new Source();
		source.setOwner(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.Source.Owner"));
		source.setIdentifier(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.Source.Identifier"));

		List<Map<Object, Object>> sourceConditions = _ctx.listMapValue("GetConfigRuleResponse.ConfigRule.Source.SourceConditions");
		source.setSourceConditions(sourceConditions);

		List<SourceDetailsItem> sourceDetails = new ArrayList<SourceDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetConfigRuleResponse.ConfigRule.Source.SourceDetails.Length"); i++) {
			SourceDetailsItem sourceDetailsItem = new SourceDetailsItem();
			sourceDetailsItem.setMessageType(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.Source.SourceDetails["+ i +"].MessageType"));
			sourceDetailsItem.setEventSource(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.Source.SourceDetails["+ i +"].EventSource"));
			sourceDetailsItem.setMaximumExecutionFrequency(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.Source.SourceDetails["+ i +"].MaximumExecutionFrequency"));

			sourceDetails.add(sourceDetailsItem);
		}
		source.setSourceDetails(sourceDetails);
		configRule.setSource(source);

		ManagedRule managedRule = new ManagedRule();
		managedRule.setHelpUrl(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ManagedRule.HelpUrl"));
		managedRule.setDescription(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ManagedRule.Description"));
		managedRule.setIdentifier(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ManagedRule.Identifier"));
		managedRule.setOptionalInputParameterDetails(_ctx.mapValue("GetConfigRuleResponse.ConfigRule.ManagedRule.OptionalInputParameterDetails"));
		managedRule.setManagedRuleName(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ManagedRule.ManagedRuleName"));
		managedRule.setCompulsoryInputParameterDetails(_ctx.mapValue("GetConfigRuleResponse.ConfigRule.ManagedRule.CompulsoryInputParameterDetails"));

		List<String> labels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetConfigRuleResponse.ConfigRule.ManagedRule.Labels.Length"); i++) {
			labels.add(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ManagedRule.Labels["+ i +"]"));
		}
		managedRule.setLabels(labels);

		List<SourceDetailsItem2> sourceDetails1 = new ArrayList<SourceDetailsItem2>();
		for (int i = 0; i < _ctx.lengthValue("GetConfigRuleResponse.ConfigRule.ManagedRule.SourceDetails.Length"); i++) {
			SourceDetailsItem2 sourceDetailsItem2 = new SourceDetailsItem2();
			sourceDetailsItem2.setMessageType(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ManagedRule.SourceDetails["+ i +"].MessageType"));
			sourceDetailsItem2.setEventSource(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ManagedRule.SourceDetails["+ i +"].EventSource"));
			sourceDetailsItem2.setMaximumExecutionFrequency(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ManagedRule.SourceDetails["+ i +"].MaximumExecutionFrequency"));

			sourceDetails1.add(sourceDetailsItem2);
		}
		managedRule.setSourceDetails1(sourceDetails1);
		configRule.setManagedRule(managedRule);

		CreateBy createBy = new CreateBy();
		createBy.setCompliancePackId(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.CreateBy.CompliancePackId"));
		createBy.setAggregatorName(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.CreateBy.AggregatorName"));
		createBy.setCompliancePackName(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.CreateBy.CompliancePackName"));
		createBy.setCreatorName(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.CreateBy.CreatorName"));
		createBy.setCreatorType(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.CreateBy.CreatorType"));
		createBy.setCreatorId(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.CreateBy.CreatorId"));
		createBy.setAggregatorId(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.CreateBy.AggregatorId"));
		configRule.setCreateBy(createBy);

		ConfigRuleEvaluationStatus configRuleEvaluationStatus = new ConfigRuleEvaluationStatus();
		configRuleEvaluationStatus.setLastErrorCode(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.LastErrorCode"));
		configRuleEvaluationStatus.setLastSuccessfulEvaluationTimestamp(_ctx.longValue("GetConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.LastSuccessfulEvaluationTimestamp"));
		configRuleEvaluationStatus.setFirstActivatedTimestamp(_ctx.longValue("GetConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.FirstActivatedTimestamp"));
		configRuleEvaluationStatus.setFirstEvaluationStarted(_ctx.booleanValue("GetConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.FirstEvaluationStarted"));
		configRuleEvaluationStatus.setLastSuccessfulInvocationTimestamp(_ctx.longValue("GetConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.LastSuccessfulInvocationTimestamp"));
		configRuleEvaluationStatus.setLastErrorMessage(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.LastErrorMessage"));
		configRuleEvaluationStatus.setLastFailedEvaluationTimestamp(_ctx.longValue("GetConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.LastFailedEvaluationTimestamp"));
		configRuleEvaluationStatus.setLastFailedInvocationTimestamp(_ctx.longValue("GetConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.LastFailedInvocationTimestamp"));
		configRule.setConfigRuleEvaluationStatus(configRuleEvaluationStatus);

		Scope scope = new Scope();

		List<String> complianceResourceTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetConfigRuleResponse.ConfigRule.Scope.ComplianceResourceTypes.Length"); i++) {
			complianceResourceTypes.add(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.Scope.ComplianceResourceTypes["+ i +"]"));
		}
		scope.setComplianceResourceTypes(complianceResourceTypes);
		configRule.setScope(scope);

		Compliance compliance = new Compliance();
		compliance.setComplianceType(_ctx.stringValue("GetConfigRuleResponse.ConfigRule.Compliance.ComplianceType"));
		compliance.setCount(_ctx.integerValue("GetConfigRuleResponse.ConfigRule.Compliance.Count"));
		configRule.setCompliance(compliance);
		getConfigRuleResponse.setConfigRule(configRule);
	 
	 	return getConfigRuleResponse;
	}
}