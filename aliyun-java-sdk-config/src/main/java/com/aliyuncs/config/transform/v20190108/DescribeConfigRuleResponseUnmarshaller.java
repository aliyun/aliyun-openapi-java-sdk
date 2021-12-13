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

import com.aliyuncs.config.model.v20190108.DescribeConfigRuleResponse;
import com.aliyuncs.config.model.v20190108.DescribeConfigRuleResponse.ConfigRule;
import com.aliyuncs.config.model.v20190108.DescribeConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus;
import com.aliyuncs.config.model.v20190108.DescribeConfigRuleResponse.ConfigRule.CreateBy;
import com.aliyuncs.config.model.v20190108.DescribeConfigRuleResponse.ConfigRule.ManagedRule;
import com.aliyuncs.config.model.v20190108.DescribeConfigRuleResponse.ConfigRule.ManagedRule.SourceDetailsItem2;
import com.aliyuncs.config.model.v20190108.DescribeConfigRuleResponse.ConfigRule.Scope;
import com.aliyuncs.config.model.v20190108.DescribeConfigRuleResponse.ConfigRule.Source;
import com.aliyuncs.config.model.v20190108.DescribeConfigRuleResponse.ConfigRule.Source.SourceConditionsItem;
import com.aliyuncs.config.model.v20190108.DescribeConfigRuleResponse.ConfigRule.Source.SourceDetailsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConfigRuleResponseUnmarshaller {

	public static DescribeConfigRuleResponse unmarshall(DescribeConfigRuleResponse describeConfigRuleResponse, UnmarshallerContext _ctx) {
		
		describeConfigRuleResponse.setRequestId(_ctx.stringValue("DescribeConfigRuleResponse.RequestId"));

		ConfigRule configRule = new ConfigRule();
		configRule.setRiskLevel(_ctx.integerValue("DescribeConfigRuleResponse.ConfigRule.RiskLevel"));
		configRule.setInputParameters(_ctx.mapValue("DescribeConfigRuleResponse.ConfigRule.InputParameters"));
		configRule.setConfigRuleState(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.ConfigRuleState"));
		configRule.setMaximumExecutionFrequency(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.MaximumExecutionFrequency"));
		configRule.setOrganizationRule(_ctx.booleanValue("DescribeConfigRuleResponse.ConfigRule.OrganizationRule"));
		configRule.setConfigRuleArn(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.ConfigRuleArn"));
		configRule.setDescription(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.Description"));
		configRule.setConfigRuleName(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.ConfigRuleName"));
		configRule.setConfigRuleId(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.ConfigRuleId"));
		configRule.setModifiedTimestamp(_ctx.longValue("DescribeConfigRuleResponse.ConfigRule.ModifiedTimestamp"));
		configRule.setCreateTimestamp(_ctx.longValue("DescribeConfigRuleResponse.ConfigRule.CreateTimestamp"));

		Source source = new Source();
		source.setOwner(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.Source.Owner"));
		source.setIdentifier(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.Source.Identifier"));

		List<SourceDetailsItem> sourceDetails = new ArrayList<SourceDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConfigRuleResponse.ConfigRule.Source.SourceDetails.Length"); i++) {
			SourceDetailsItem sourceDetailsItem = new SourceDetailsItem();
			sourceDetailsItem.setMessageType(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.Source.SourceDetails["+ i +"].MessageType"));
			sourceDetailsItem.setEventSource(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.Source.SourceDetails["+ i +"].EventSource"));
			sourceDetailsItem.setMaximumExecutionFrequency(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.Source.SourceDetails["+ i +"].MaximumExecutionFrequency"));

			sourceDetails.add(sourceDetailsItem);
		}
		source.setSourceDetails(sourceDetails);

		List<SourceConditionsItem> sourceConditions = new ArrayList<SourceConditionsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConfigRuleResponse.ConfigRule.Source.SourceConditions.Length"); i++) {
			SourceConditionsItem sourceConditionsItem = new SourceConditionsItem();
			sourceConditionsItem.setDesiredValue(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.Source.SourceConditions["+ i +"].DesiredValue"));
			sourceConditionsItem.setRequired(_ctx.booleanValue("DescribeConfigRuleResponse.ConfigRule.Source.SourceConditions["+ i +"].Required"));
			sourceConditionsItem.setTips(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.Source.SourceConditions["+ i +"].Tips"));
			sourceConditionsItem.setOperator(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.Source.SourceConditions["+ i +"].Operator"));
			sourceConditionsItem.setName(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.Source.SourceConditions["+ i +"].Name"));
			sourceConditionsItem.setSelectPath(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.Source.SourceConditions["+ i +"].SelectPath"));

			sourceConditions.add(sourceConditionsItem);
		}
		source.setSourceConditions(sourceConditions);
		configRule.setSource(source);

		ManagedRule managedRule = new ManagedRule();
		managedRule.setHelpUrl(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.ManagedRule.HelpUrl"));
		managedRule.setDescription(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.ManagedRule.Description"));
		managedRule.setIdentifier(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.ManagedRule.Identifier"));
		managedRule.setOptionalInputParameterDetails(_ctx.mapValue("DescribeConfigRuleResponse.ConfigRule.ManagedRule.OptionalInputParameterDetails"));
		managedRule.setManagedRuleName(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.ManagedRule.ManagedRuleName"));
		managedRule.setCompulsoryInputParameterDetails(_ctx.mapValue("DescribeConfigRuleResponse.ConfigRule.ManagedRule.CompulsoryInputParameterDetails"));

		List<String> labels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConfigRuleResponse.ConfigRule.ManagedRule.Labels.Length"); i++) {
			labels.add(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.ManagedRule.Labels["+ i +"]"));
		}
		managedRule.setLabels(labels);

		List<SourceDetailsItem2> sourceDetails1 = new ArrayList<SourceDetailsItem2>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConfigRuleResponse.ConfigRule.ManagedRule.SourceDetails.Length"); i++) {
			SourceDetailsItem2 sourceDetailsItem2 = new SourceDetailsItem2();
			sourceDetailsItem2.setMessageType(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.ManagedRule.SourceDetails["+ i +"].MessageType"));
			sourceDetailsItem2.setEventSource(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.ManagedRule.SourceDetails["+ i +"].EventSource"));
			sourceDetailsItem2.setMaximumExecutionFrequency(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.ManagedRule.SourceDetails["+ i +"].MaximumExecutionFrequency"));

			sourceDetails1.add(sourceDetailsItem2);
		}
		managedRule.setSourceDetails1(sourceDetails1);
		configRule.setManagedRule(managedRule);

		CreateBy createBy = new CreateBy();
		createBy.setConfigRuleSceneId(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.CreateBy.ConfigRuleSceneId"));
		createBy.setCreatorName(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.CreateBy.CreatorName"));
		createBy.setCreatorType(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.CreateBy.CreatorType"));
		createBy.setCreatorId(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.CreateBy.CreatorId"));
		createBy.setConfigRuleSceneName(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.CreateBy.ConfigRuleSceneName"));
		configRule.setCreateBy(createBy);

		Scope scope = new Scope();
		scope.setComplianceResourceId(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.Scope.ComplianceResourceId"));

		List<String> complianceResourceTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConfigRuleResponse.ConfigRule.Scope.ComplianceResourceTypes.Length"); i++) {
			complianceResourceTypes.add(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.Scope.ComplianceResourceTypes["+ i +"]"));
		}
		scope.setComplianceResourceTypes(complianceResourceTypes);
		configRule.setScope(scope);

		ConfigRuleEvaluationStatus configRuleEvaluationStatus = new ConfigRuleEvaluationStatus();
		configRuleEvaluationStatus.setLastErrorCode(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.LastErrorCode"));
		configRuleEvaluationStatus.setLastSuccessfulEvaluationTimestamp(_ctx.longValue("DescribeConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.LastSuccessfulEvaluationTimestamp"));
		configRuleEvaluationStatus.setFirstActivatedTimestamp(_ctx.longValue("DescribeConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.FirstActivatedTimestamp"));
		configRuleEvaluationStatus.setFirstEvaluationStarted(_ctx.booleanValue("DescribeConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.FirstEvaluationStarted"));
		configRuleEvaluationStatus.setLastSuccessfulInvocationTimestamp(_ctx.longValue("DescribeConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.LastSuccessfulInvocationTimestamp"));
		configRuleEvaluationStatus.setLastErrorMessage(_ctx.stringValue("DescribeConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.LastErrorMessage"));
		configRuleEvaluationStatus.setLastFailedEvaluationTimestamp(_ctx.longValue("DescribeConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.LastFailedEvaluationTimestamp"));
		configRuleEvaluationStatus.setLastFailedInvocationTimestamp(_ctx.longValue("DescribeConfigRuleResponse.ConfigRule.ConfigRuleEvaluationStatus.LastFailedInvocationTimestamp"));
		configRule.setConfigRuleEvaluationStatus(configRuleEvaluationStatus);
		describeConfigRuleResponse.setConfigRule(configRule);
	 
	 	return describeConfigRuleResponse;
	}
}