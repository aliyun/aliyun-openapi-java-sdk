/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.qualitycheck.transform.v20160801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20160801.GetRuleDetailResponse;
import com.aliyuncs.qualitycheck.model.v20160801.GetRuleDetailResponse.Data;
import com.aliyuncs.qualitycheck.model.v20160801.GetRuleDetailResponse.Data.ConditionBasicInfo;
import com.aliyuncs.qualitycheck.model.v20160801.GetRuleDetailResponse.Data.ConditionBasicInfo.CheckRange;
import com.aliyuncs.qualitycheck.model.v20160801.GetRuleDetailResponse.Data.ConditionBasicInfo.CheckRange.Anchor;
import com.aliyuncs.qualitycheck.model.v20160801.GetRuleDetailResponse.Data.ConditionBasicInfo.CheckRange.Range;
import com.aliyuncs.qualitycheck.model.v20160801.GetRuleDetailResponse.Data.ConditionBasicInfo.OperatorBasicInfo;
import com.aliyuncs.qualitycheck.model.v20160801.GetRuleDetailResponse.Data.ConditionBasicInfo.OperatorBasicInfo.Param;
import com.aliyuncs.qualitycheck.model.v20160801.GetRuleDetailResponse.Data.RuleBasicInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRuleDetailResponseUnmarshaller {

	public static GetRuleDetailResponse unmarshall(GetRuleDetailResponse getRuleDetailResponse, UnmarshallerContext context) {
		
		getRuleDetailResponse.setRequestId(context.stringValue("GetRuleDetailResponse.RequestId"));
		getRuleDetailResponse.setSuccess(context.booleanValue("GetRuleDetailResponse.Success"));
		getRuleDetailResponse.setCode(context.stringValue("GetRuleDetailResponse.Code"));
		getRuleDetailResponse.setMessage(context.stringValue("GetRuleDetailResponse.Message"));

		Data data = new Data();

		List<ConditionBasicInfo> conditions = new ArrayList<ConditionBasicInfo>();
		for (int i = 0; i < context.lengthValue("GetRuleDetailResponse.Data.Conditions.Length"); i++) {
			ConditionBasicInfo conditionBasicInfo = new ConditionBasicInfo();
			conditionBasicInfo.setConditionInfoCid(context.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].ConditionInfoCid"));
			conditionBasicInfo.setOperLambda(context.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].OperLambda"));

			CheckRange checkRange = new CheckRange();
			checkRange.setRole(context.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].CheckRange.Role"));

			Anchor anchor = new Anchor();
			anchor.setAnchorCid(context.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].CheckRange.Anchor.AnchorCid"));
			anchor.setLocation(context.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].CheckRange.Anchor.Location"));
			anchor.setHitTime(context.integerValue("GetRuleDetailResponse.Data.Conditions["+ i +"].CheckRange.Anchor.HitTime"));
			checkRange.setAnchor(anchor);

			Range range = new Range();
			range.setFrom(context.integerValue("GetRuleDetailResponse.Data.Conditions["+ i +"].CheckRange.Range.From"));
			range.setTo(context.integerValue("GetRuleDetailResponse.Data.Conditions["+ i +"].CheckRange.Range.To"));
			checkRange.setRange(range);
			conditionBasicInfo.setCheckRange(checkRange);

			List<OperatorBasicInfo> operators = new ArrayList<OperatorBasicInfo>();
			for (int j = 0; j < context.lengthValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators.Length"); j++) {
				OperatorBasicInfo operatorBasicInfo = new OperatorBasicInfo();
				operatorBasicInfo.setOid(context.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Oid"));
				operatorBasicInfo.setType(context.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Type"));
				operatorBasicInfo.setOperName(context.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].OperName"));

				Param param = new Param();
				param.setRegex(context.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.Regex"));
				param.setPhrase(context.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.Phrase"));
				param.setInterval(context.integerValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.Interval"));
				param.setThreshold(context.floatValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.Threshold"));
				param.setInSentence(context.booleanValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.InSentence"));
				param.setTarget(context.integerValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.Target"));
				param.setFromEnd(context.booleanValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.FromEnd"));
				param.setDifferentRole(context.booleanValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.DifferentRole"));
				param.setTargetRole(context.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.TargetRole"));

				List<String> operKeyWords = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.OperKeyWords.Length"); k++) {
					operKeyWords.add(context.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.OperKeyWords["+ k +"]"));
				}
				param.setOperKeyWords(operKeyWords);

				List<String> references = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.References.Length"); k++) {
					references.add(context.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.References["+ k +"]"));
				}
				param.setReferences(references);
				operatorBasicInfo.setParam(param);

				operators.add(operatorBasicInfo);
			}
			conditionBasicInfo.setOperators(operators);

			conditions.add(conditionBasicInfo);
		}
		data.setConditions(conditions);

		List<RuleBasicInfo> rules = new ArrayList<RuleBasicInfo>();
		for (int i = 0; i < context.lengthValue("GetRuleDetailResponse.Data.Rules.Length"); i++) {
			RuleBasicInfo ruleBasicInfo = new RuleBasicInfo();
			ruleBasicInfo.setRid(context.stringValue("GetRuleDetailResponse.Data.Rules["+ i +"].Rid"));
			ruleBasicInfo.setRuleLambda(context.stringValue("GetRuleDetailResponse.Data.Rules["+ i +"].RuleLambda"));

			List<String> triggers = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("GetRuleDetailResponse.Data.Rules["+ i +"].Triggers.Length"); j++) {
				triggers.add(context.stringValue("GetRuleDetailResponse.Data.Rules["+ i +"].Triggers["+ j +"]"));
			}
			ruleBasicInfo.setTriggers(triggers);

			rules.add(ruleBasicInfo);
		}
		data.setRules(rules);
		getRuleDetailResponse.setData(data);
	 
	 	return getRuleDetailResponse;
	}
}