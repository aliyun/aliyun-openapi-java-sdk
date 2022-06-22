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

import com.aliyuncs.config.model.v20200907.GetAggregateConfigRuleResponse;
import com.aliyuncs.config.model.v20200907.GetAggregateConfigRuleResponse.ConfigRule;
import com.aliyuncs.config.model.v20200907.GetAggregateConfigRuleResponse.ConfigRule.Compliance;
import com.aliyuncs.config.model.v20200907.GetAggregateConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus;
import com.aliyuncs.config.model.v20200907.GetAggregateConfigRuleResponse.ConfigRule.CreateBy;
import com.aliyuncs.config.model.v20200907.GetAggregateConfigRuleResponse.ConfigRule.ManagedRule;
import com.aliyuncs.config.model.v20200907.GetAggregateConfigRuleResponse.ConfigRule.ManagedRule.SourceDetailsItem2;
import com.aliyuncs.config.model.v20200907.GetAggregateConfigRuleResponse.ConfigRule.Scope;
import com.aliyuncs.config.model.v20200907.GetAggregateConfigRuleResponse.ConfigRule.Source;
import com.aliyuncs.config.model.v20200907.GetAggregateConfigRuleResponse.ConfigRule.Source.SourceDetailsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAggregateConfigRuleResponseUnmarshaller {

	public static GetAggregateConfigRuleResponse unmarshall(GetAggregateConfigRuleResponse getAggregateConfigRuleResponse, UnmarshallerContext _ctx) {
		
		getAggregateConfigRuleResponse.setRequestId(_ctx.stringValue("GetAggregateConfigRuleResponse.RequestId"));

		ConfigRule configRule = new ConfigRule();
		configRule.setRiskLevel(_ctx.integerValue("GetAggregateConfigRuleResponse.ConfigRule.RiskLevel"));
		configRule.setInputParameters(_ctx.mapValue("GetAggregateConfigRuleResponse.ConfigRule.InputParameters"));
		configRule.setConfigRuleState(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.ConfigRuleState"));
		configRule.setMaximumExecutionFrequency(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.MaximumExecutionFrequency"));
		configRule.setConfigRuleArn(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.ConfigRuleArn"));
		configRule.setDescription(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.Description"));
		configRule.setConfigRuleName(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.ConfigRuleName"));
		configRule.setConfigRuleId(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.ConfigRuleId"));
		configRule.setModifiedTimestamp(_ctx.longValue("GetAggregateConfigRuleResponse.ConfigRule.ModifiedTimestamp"));
		configRule.setCreateTimestamp(_ctx.longValue("GetAggregateConfigRuleResponse.ConfigRule.CreateTimestamp"));
		configRule.setResourceTypesScope(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.ResourceTypesScope"));
		configRule.setRegionIdsScope(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.RegionIdsScope"));
		configRule.setExcludeResourceIdsScope(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.ExcludeResourceIdsScope"));
		configRule.setResourceGroupIdsScope(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.ResourceGroupIdsScope"));
		configRule.setTagKeyScope(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.TagKeyScope"));
		configRule.setTagValueScope(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.TagValueScope"));
		configRule.setConfigRuleTriggerTypes(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.ConfigRuleTriggerTypes"));
		configRule.setTagKeyLogicScope(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.TagKeyLogicScope"));
		configRule.setFolderIdsScope(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.FolderIdsScope"));
		configRule.setExcludeFolderIdsScope(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.ExcludeFolderIdsScope"));
		configRule.setExcludeAccountIdsScope(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.ExcludeAccountIdsScope"));
		configRule.setAccountId(_ctx.longValue("GetAggregateConfigRuleResponse.ConfigRule.AccountId"));

		Source source = new Source();
		source.setOwner(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.Source.Owner"));
		source.setIdentifier(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.Source.Identifier"));

		List<Map<Object, Object>> sourceConditions = _ctx.listMapValue("GetAggregateConfigRuleResponse.ConfigRule.Source.SourceConditions");
		source.setSourceConditions(sourceConditions);

		List<SourceDetailsItem> sourceDetails = new ArrayList<SourceDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAggregateConfigRuleResponse.ConfigRule.Source.SourceDetails.Length"); i++) {
			SourceDetailsItem sourceDetailsItem = new SourceDetailsItem();
			sourceDetailsItem.setMessageType(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.Source.SourceDetails["+ i +"].MessageType"));
			sourceDetailsItem.setEventSource(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.Source.SourceDetails["+ i +"].EventSource"));
			sourceDetailsItem.setMaximumExecutionFrequency(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.Source.SourceDetails["+ i +"].MaximumExecutionFrequency"));

			sourceDetails.add(sourceDetailsItem);
		}
		source.setSourceDetails(sourceDetails);
		configRule.setSource(source);

		ManagedRule managedRule = new ManagedRule();
		managedRule.setHelpUrl(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.ManagedRule.HelpUrl"));
		managedRule.setDescription(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.ManagedRule.Description"));
		managedRule.setIdentifier(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.ManagedRule.Identifier"));
		managedRule.setOptionalInputParameterDetails(_ctx.mapValue("GetAggregateConfigRuleResponse.ConfigRule.ManagedRule.OptionalInputParameterDetails"));
		managedRule.setManagedRuleName(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.ManagedRule.ManagedRuleName"));
		managedRule.setCompulsoryInputParameterDetails(_ctx.mapValue("GetAggregateConfigRuleResponse.ConfigRule.ManagedRule.CompulsoryInputParameterDetails"));

		List<String> labels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAggregateConfigRuleResponse.ConfigRule.ManagedRule.Labels.Length"); i++) {
			labels.add(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.ManagedRule.Labels["+ i +"]"));
		}
		managedRule.setLabels(labels);

		List<SourceDetailsItem2> sourceDetails1 = new ArrayList<SourceDetailsItem2>();
		for (int i = 0; i < _ctx.lengthValue("GetAggregateConfigRuleResponse.ConfigRule.ManagedRule.SourceDetails.Length"); i++) {
			SourceDetailsItem2 sourceDetailsItem2 = new SourceDetailsItem2();
			sourceDetailsItem2.setMessageType(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.ManagedRule.SourceDetails["+ i +"].MessageType"));
			sourceDetailsItem2.setEventSource(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.ManagedRule.SourceDetails["+ i +"].EventSource"));
			sourceDetailsItem2.setMaximumExecutionFrequency(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.ManagedRule.SourceDetails["+ i +"].MaximumExecutionFrequency"));

			sourceDetails1.add(sourceDetailsItem2);
		}
		managedRule.setSourceDetails1(sourceDetails1);
		configRule.setManagedRule(managedRule);

		CreateBy createBy = new CreateBy();
		createBy.setCompliancePackId(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.CreateBy.CompliancePackId"));
		createBy.setAggregatorName(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.CreateBy.AggregatorName"));
		createBy.setCompliancePackName(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.CreateBy.CompliancePackName"));
		createBy.setCreatorName(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.CreateBy.CreatorName"));
		createBy.setCreatorType(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.CreateBy.CreatorType"));
		createBy.setCreatorId(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.CreateBy.CreatorId"));
		createBy.setAggregatorId(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.CreateBy.AggregatorId"));
		configRule.setCreateBy(createBy);

		ConfigRuleEvaluationStatus configRuleEvaluationStatus = new ConfigRuleEvaluationStatus();
		configRuleEvaluationStatus.setLastErrorCode(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.LastErrorCode"));
		configRuleEvaluationStatus.setLastSuccessfulEvaluationTimestamp(_ctx.longValue("GetAggregateConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.LastSuccessfulEvaluationTimestamp"));
		configRuleEvaluationStatus.setFirstActivatedTimestamp(_ctx.longValue("GetAggregateConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.FirstActivatedTimestamp"));
		configRuleEvaluationStatus.setFirstEvaluationStarted(_ctx.booleanValue("GetAggregateConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.FirstEvaluationStarted"));
		configRuleEvaluationStatus.setLastSuccessfulInvocationTimestamp(_ctx.longValue("GetAggregateConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.LastSuccessfulInvocationTimestamp"));
		configRuleEvaluationStatus.setLastErrorMessage(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.LastErrorMessage"));
		configRuleEvaluationStatus.setLastFailedEvaluationTimestamp(_ctx.longValue("GetAggregateConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.LastFailedEvaluationTimestamp"));
		configRuleEvaluationStatus.setLastFailedInvocationTimestamp(_ctx.longValue("GetAggregateConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.LastFailedInvocationTimestamp"));
		configRule.setConfigRuleEvaluationStatus(configRuleEvaluationStatus);

		Scope scope = new Scope();

		List<String> complianceResourceTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAggregateConfigRuleResponse.ConfigRule.Scope.ComplianceResourceTypes.Length"); i++) {
			complianceResourceTypes.add(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.Scope.ComplianceResourceTypes["+ i +"]"));
		}
		scope.setComplianceResourceTypes(complianceResourceTypes);
		configRule.setScope(scope);

		Compliance compliance = new Compliance();
		compliance.setComplianceType(_ctx.stringValue("GetAggregateConfigRuleResponse.ConfigRule.Compliance.ComplianceType"));
		compliance.setCount(_ctx.integerValue("GetAggregateConfigRuleResponse.ConfigRule.Compliance.Count"));
		configRule.setCompliance(compliance);
		getAggregateConfigRuleResponse.setConfigRule(configRule);
	 
	 	return getAggregateConfigRuleResponse;
	}
}