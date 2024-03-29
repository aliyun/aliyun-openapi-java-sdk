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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.GetRuleDetailResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetRuleDetailResponse.Data;
import com.aliyuncs.qualitycheck.model.v20190115.GetRuleDetailResponse.Data.ConditionBasicInfo;
import com.aliyuncs.qualitycheck.model.v20190115.GetRuleDetailResponse.Data.ConditionBasicInfo.CheckRange;
import com.aliyuncs.qualitycheck.model.v20190115.GetRuleDetailResponse.Data.ConditionBasicInfo.CheckRange.Anchor;
import com.aliyuncs.qualitycheck.model.v20190115.GetRuleDetailResponse.Data.ConditionBasicInfo.CheckRange.Range;
import com.aliyuncs.qualitycheck.model.v20190115.GetRuleDetailResponse.Data.ConditionBasicInfo.OperatorBasicInfo;
import com.aliyuncs.qualitycheck.model.v20190115.GetRuleDetailResponse.Data.ConditionBasicInfo.OperatorBasicInfo.Param;
import com.aliyuncs.qualitycheck.model.v20190115.GetRuleDetailResponse.Data.RuleBasicInfo;
import com.aliyuncs.qualitycheck.model.v20190115.GetRuleDetailResponse.Data.RuleBasicInfo.BusinessCategoryBasicInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRuleDetailResponseUnmarshaller {

	public static GetRuleDetailResponse unmarshall(GetRuleDetailResponse getRuleDetailResponse, UnmarshallerContext _ctx) {
		
		getRuleDetailResponse.setRequestId(_ctx.stringValue("GetRuleDetailResponse.RequestId"));
		getRuleDetailResponse.setCode(_ctx.stringValue("GetRuleDetailResponse.Code"));
		getRuleDetailResponse.setMessage(_ctx.stringValue("GetRuleDetailResponse.Message"));
		getRuleDetailResponse.setSuccess(_ctx.booleanValue("GetRuleDetailResponse.Success"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("GetRuleDetailResponse.Data.PageSize"));
		data.setPageNumber(_ctx.integerValue("GetRuleDetailResponse.Data.PageNumber"));
		data.setCount(_ctx.integerValue("GetRuleDetailResponse.Data.Count"));

		List<ConditionBasicInfo> conditions = new ArrayList<ConditionBasicInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetRuleDetailResponse.Data.Conditions.Length"); i++) {
			ConditionBasicInfo conditionBasicInfo = new ConditionBasicInfo();
			conditionBasicInfo.setConditionInfoCid(_ctx.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].ConditionInfoCid"));
			conditionBasicInfo.setOperLambda(_ctx.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].OperLambda"));

			CheckRange checkRange = new CheckRange();
			checkRange.setAbsolute(_ctx.booleanValue("GetRuleDetailResponse.Data.Conditions["+ i +"].CheckRange.Absolute"));
			checkRange.setRole(_ctx.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].CheckRange.Role"));

			Anchor anchor = new Anchor();
			anchor.setHitTime(_ctx.integerValue("GetRuleDetailResponse.Data.Conditions["+ i +"].CheckRange.Anchor.HitTime"));
			anchor.setLocation(_ctx.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].CheckRange.Anchor.Location"));
			anchor.setAnchorCid(_ctx.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].CheckRange.Anchor.AnchorCid"));
			checkRange.setAnchor(anchor);

			Range range = new Range();
			range.setTo(_ctx.integerValue("GetRuleDetailResponse.Data.Conditions["+ i +"].CheckRange.Range.To"));
			range.setFrom(_ctx.integerValue("GetRuleDetailResponse.Data.Conditions["+ i +"].CheckRange.Range.From"));
			checkRange.setRange(range);
			conditionBasicInfo.setCheckRange(checkRange);

			List<OperatorBasicInfo> operators = new ArrayList<OperatorBasicInfo>();
			for (int j = 0; j < _ctx.lengthValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators.Length"); j++) {
				OperatorBasicInfo operatorBasicInfo = new OperatorBasicInfo();
				operatorBasicInfo.setType(_ctx.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Type"));
				operatorBasicInfo.setOid(_ctx.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Oid"));
				operatorBasicInfo.setOperName(_ctx.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].OperName"));

				Param param = new Param();
				param.setDifferentRole(_ctx.booleanValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.DifferentRole"));
				param.setRegex(_ctx.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.Regex"));
				param.setTargetRole(_ctx.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.TargetRole"));
				param.setVelocityInMint(_ctx.integerValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.VelocityInMint"));
				param.setAverage(_ctx.booleanValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.Average"));
				param.setKeywordExtension(_ctx.booleanValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.KeywordExtension"));
				param.setScore(_ctx.integerValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.Score"));
				param.setNotRegex(_ctx.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.NotRegex"));
				param.setCompareOperator(_ctx.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.CompareOperator"));
				param.setDelayTime(_ctx.integerValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.DelayTime"));
				param.setKeywordMatchSize(_ctx.integerValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.KeywordMatchSize"));
				param.setHitTime(_ctx.integerValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.HitTime"));
				param.setBeginType(_ctx.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.BeginType"));
				param.setTarget(_ctx.integerValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.Target"));
				param.setMaxEmotionChangeValue(_ctx.integerValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.MaxEmotionChangeValue"));
				param.setThreshold(_ctx.floatValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.Threshold"));
				param.setFrom(_ctx.integerValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.From"));
				param.setFromEnd(_ctx.booleanValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.FromEnd"));
				param.setMinWordSize(_ctx.integerValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.MinWordSize"));
				param.setInSentence(_ctx.booleanValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.InSentence"));
				param.setPhrase(_ctx.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.Phrase"));
				param.setSimilarity_threshold(_ctx.floatValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.Similarity_threshold"));
				param.setCheckType(_ctx.integerValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.CheckType"));
				param.setInterval(_ctx.integerValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.Interval"));
				param.setContextChatMatch(_ctx.booleanValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.ContextChatMatch"));

				List<String> excludes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.Excludes.Length"); k++) {
					excludes.add(_ctx.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.Excludes["+ k +"]"));
				}
				param.setExcludes(excludes);

				List<String> antModelInfo = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.AntModelInfo.Length"); k++) {
					antModelInfo.add(_ctx.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.AntModelInfo["+ k +"]"));
				}
				param.setAntModelInfo(antModelInfo);

				List<String> pvalues = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.Pvalues.Length"); k++) {
					pvalues.add(_ctx.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.Pvalues["+ k +"]"));
				}
				param.setPvalues(pvalues);

				List<String> references = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.References.Length"); k++) {
					references.add(_ctx.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.References["+ k +"]"));
				}
				param.setReferences(references);

				List<String> similarlySentences = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.SimilarlySentences.Length"); k++) {
					similarlySentences.add(_ctx.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.SimilarlySentences["+ k +"]"));
				}
				param.setSimilarlySentences(similarlySentences);

				List<String> operKeyWords = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.OperKeyWords.Length"); k++) {
					operKeyWords.add(_ctx.stringValue("GetRuleDetailResponse.Data.Conditions["+ i +"].Operators["+ j +"].Param.OperKeyWords["+ k +"]"));
				}
				param.setOperKeyWords(operKeyWords);
				operatorBasicInfo.setParam(param);

				operators.add(operatorBasicInfo);
			}
			conditionBasicInfo.setOperators(operators);

			conditions.add(conditionBasicInfo);
		}
		data.setConditions(conditions);

		List<RuleBasicInfo> rules = new ArrayList<RuleBasicInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetRuleDetailResponse.Data.Rules.Length"); i++) {
			RuleBasicInfo ruleBasicInfo = new RuleBasicInfo();
			ruleBasicInfo.setRuleLambda(_ctx.stringValue("GetRuleDetailResponse.Data.Rules["+ i +"].RuleLambda"));
			ruleBasicInfo.setRid(_ctx.stringValue("GetRuleDetailResponse.Data.Rules["+ i +"].Rid"));

			List<String> triggers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetRuleDetailResponse.Data.Rules["+ i +"].Triggers.Length"); j++) {
				triggers.add(_ctx.stringValue("GetRuleDetailResponse.Data.Rules["+ i +"].Triggers["+ j +"]"));
			}
			ruleBasicInfo.setTriggers(triggers);

			List<BusinessCategoryBasicInfo> businessCategories = new ArrayList<BusinessCategoryBasicInfo>();
			for (int j = 0; j < _ctx.lengthValue("GetRuleDetailResponse.Data.Rules["+ i +"].BusinessCategories.Length"); j++) {
				BusinessCategoryBasicInfo businessCategoryBasicInfo = new BusinessCategoryBasicInfo();
				businessCategoryBasicInfo.setBusinessName(_ctx.stringValue("GetRuleDetailResponse.Data.Rules["+ i +"].BusinessCategories["+ j +"].BusinessName"));
				businessCategoryBasicInfo.setServiceType(_ctx.integerValue("GetRuleDetailResponse.Data.Rules["+ i +"].BusinessCategories["+ j +"].ServiceType"));
				businessCategoryBasicInfo.setBid(_ctx.integerValue("GetRuleDetailResponse.Data.Rules["+ i +"].BusinessCategories["+ j +"].Bid"));

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