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
import com.aliyuncs.qualitycheck.model.v20160801.GetRuleDetailResponse.Data.RuleBasicInfo.BusinessCategoryBasicInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRuleDetailResponseUnmarshaller {

	public static GetRuleDetailResponse unmarshall(GetRuleDetailResponse getRuleDetailResponse, UnmarshallerContext context) {
		
		getRuleDetailResponse.setRequestId(context.stringValue("GetRuleDetailResponse.requestId"));
		getRuleDetailResponse.setSuccess(context.booleanValue("GetRuleDetailResponse.success"));
		getRuleDetailResponse.setCode(context.stringValue("GetRuleDetailResponse.code"));
		getRuleDetailResponse.setMessage(context.stringValue("GetRuleDetailResponse.message"));

		Data data = new Data();

		List<ConditionBasicInfo> conditions = new ArrayList<ConditionBasicInfo>();
		for (int i = 0; i < context.lengthValue("GetRuleDetailResponse.data.conditions.Length"); i++) {
			ConditionBasicInfo conditionBasicInfo = new ConditionBasicInfo();
			conditionBasicInfo.setConditionInfoCid(context.stringValue("GetRuleDetailResponse.data.conditions["+ i +"].conditionInfoCid"));
			conditionBasicInfo.setOperLambda(context.stringValue("GetRuleDetailResponse.data.conditions["+ i +"].operLambda"));

			CheckRange checkRange = new CheckRange();
			checkRange.setRole(context.stringValue("GetRuleDetailResponse.data.conditions["+ i +"].checkRange.role"));

			Anchor anchor = new Anchor();
			anchor.setAnchorCid(context.stringValue("GetRuleDetailResponse.data.conditions["+ i +"].checkRange.anchor.anchorCid"));
			anchor.setLocation(context.stringValue("GetRuleDetailResponse.data.conditions["+ i +"].checkRange.anchor.location"));
			anchor.setHitTime(context.integerValue("GetRuleDetailResponse.data.conditions["+ i +"].checkRange.anchor.hitTime"));
			checkRange.setAnchor(anchor);

			Range range = new Range();
			range.setFrom(context.integerValue("GetRuleDetailResponse.data.conditions["+ i +"].checkRange.range.from"));
			range.setTo(context.integerValue("GetRuleDetailResponse.data.conditions["+ i +"].checkRange.range.to"));
			checkRange.setRange(range);
			conditionBasicInfo.setCheckRange(checkRange);

			List<OperatorBasicInfo> operators = new ArrayList<OperatorBasicInfo>();
			for (int j = 0; j < context.lengthValue("GetRuleDetailResponse.data.conditions["+ i +"].operators.Length"); j++) {
				OperatorBasicInfo operatorBasicInfo = new OperatorBasicInfo();
				operatorBasicInfo.setOid(context.stringValue("GetRuleDetailResponse.data.conditions["+ i +"].operators["+ j +"].oid"));
				operatorBasicInfo.setType(context.stringValue("GetRuleDetailResponse.data.conditions["+ i +"].operators["+ j +"].type"));
				operatorBasicInfo.setOperName(context.stringValue("GetRuleDetailResponse.data.conditions["+ i +"].operators["+ j +"].operName"));

				Param param = new Param();
				param.setRegex(context.stringValue("GetRuleDetailResponse.data.conditions["+ i +"].operators["+ j +"].param.regex"));
				param.setPhrase(context.stringValue("GetRuleDetailResponse.data.conditions["+ i +"].operators["+ j +"].param.phrase"));
				param.setInterval(context.integerValue("GetRuleDetailResponse.data.conditions["+ i +"].operators["+ j +"].param.interval"));
				param.setThreshold(context.floatValue("GetRuleDetailResponse.data.conditions["+ i +"].operators["+ j +"].param.threshold"));
				param.setInSentence(context.booleanValue("GetRuleDetailResponse.data.conditions["+ i +"].operators["+ j +"].param.inSentence"));
				param.setTarget(context.integerValue("GetRuleDetailResponse.data.conditions["+ i +"].operators["+ j +"].param.target"));
				param.setFromEnd(context.booleanValue("GetRuleDetailResponse.data.conditions["+ i +"].operators["+ j +"].param.fromEnd"));
				param.setDifferentRole(context.booleanValue("GetRuleDetailResponse.data.conditions["+ i +"].operators["+ j +"].param.differentRole"));
				param.setTargetRole(context.stringValue("GetRuleDetailResponse.data.conditions["+ i +"].operators["+ j +"].param.targetRole"));

				List<String> operKeyWords = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("GetRuleDetailResponse.data.conditions["+ i +"].operators["+ j +"].param.operKeyWords.Length"); k++) {
					operKeyWords.add(context.stringValue("GetRuleDetailResponse.data.conditions["+ i +"].operators["+ j +"].param.operKeyWords["+ k +"]"));
				}
				param.setOperKeyWords(operKeyWords);

				List<String> references = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("GetRuleDetailResponse.data.conditions["+ i +"].operators["+ j +"].param.references.Length"); k++) {
					references.add(context.stringValue("GetRuleDetailResponse.data.conditions["+ i +"].operators["+ j +"].param.references["+ k +"]"));
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
		for (int i = 0; i < context.lengthValue("GetRuleDetailResponse.data.rules.Length"); i++) {
			RuleBasicInfo ruleBasicInfo = new RuleBasicInfo();
			ruleBasicInfo.setRid(context.stringValue("GetRuleDetailResponse.data.rules["+ i +"].rid"));
			ruleBasicInfo.setRuleLambda(context.stringValue("GetRuleDetailResponse.data.rules["+ i +"].ruleLambda"));

			List<String> triggers = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("GetRuleDetailResponse.data.rules["+ i +"].triggers.Length"); j++) {
				triggers.add(context.stringValue("GetRuleDetailResponse.data.rules["+ i +"].triggers["+ j +"]"));
			}
			ruleBasicInfo.setTriggers(triggers);

			List<BusinessCategoryBasicInfo> businessCategories = new ArrayList<BusinessCategoryBasicInfo>();
			for (int j = 0; j < context.lengthValue("GetRuleDetailResponse.data.rules["+ i +"].BusinessCategories.Length"); j++) {
				BusinessCategoryBasicInfo businessCategoryBasicInfo = new BusinessCategoryBasicInfo();
				businessCategoryBasicInfo.setBid(context.integerValue("GetRuleDetailResponse.data.rules["+ i +"].BusinessCategories["+ j +"].Bid"));
				businessCategoryBasicInfo.setServiceType(context.integerValue("GetRuleDetailResponse.data.rules["+ i +"].BusinessCategories["+ j +"].ServiceType"));
				businessCategoryBasicInfo.setBusinessName(context.stringValue("GetRuleDetailResponse.data.rules["+ i +"].BusinessCategories["+ j +"].BusinessName"));

				businessCategories.add(businessCategoryBasicInfo);
			}
			ruleBasicInfo.setBusinessCategories(businessCategories);

			rules.add(ruleBasicInfo);
		}
		data.setRules(rules);
		getRuleDetailResponse.setData(data);
	 
	 	return getRuleDetailResponse;
	}
}