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

import com.aliyuncs.qualitycheck.model.v20190115.ConfigDataSetResponse;
import com.aliyuncs.qualitycheck.model.v20190115.ConfigDataSetResponse.Data;
import com.aliyuncs.qualitycheck.model.v20190115.ConfigDataSetResponse.Data.RuleInfo;
import com.aliyuncs.qualitycheck.model.v20190115.ConfigDataSetResponse.Data.RuleInfo.ConditionBasicInfo;
import com.aliyuncs.qualitycheck.model.v20190115.ConfigDataSetResponse.Data.RuleInfo.ConditionBasicInfo.CheckRange;
import com.aliyuncs.qualitycheck.model.v20190115.ConfigDataSetResponse.Data.RuleInfo.ConditionBasicInfo.CheckRange.Anchor;
import com.aliyuncs.qualitycheck.model.v20190115.ConfigDataSetResponse.Data.RuleInfo.ConditionBasicInfo.CheckRange.Range;
import com.aliyuncs.qualitycheck.model.v20190115.ConfigDataSetResponse.Data.RuleInfo.ConditionBasicInfo.OperatorBasicInfo;
import com.aliyuncs.qualitycheck.model.v20190115.ConfigDataSetResponse.Data.RuleInfo.ConditionBasicInfo.OperatorBasicInfo.Param;
import com.aliyuncs.qualitycheck.model.v20190115.ConfigDataSetResponse.Data.RuleInfo.RuleBasicInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfigDataSetResponseUnmarshaller {

	public static ConfigDataSetResponse unmarshall(ConfigDataSetResponse configDataSetResponse, UnmarshallerContext _ctx) {
		
		configDataSetResponse.setRequestId(_ctx.stringValue("ConfigDataSetResponse.RequestId"));
		configDataSetResponse.setSuccess(_ctx.booleanValue("ConfigDataSetResponse.Success"));
		configDataSetResponse.setCode(_ctx.stringValue("ConfigDataSetResponse.Code"));
		configDataSetResponse.setMessage(_ctx.stringValue("ConfigDataSetResponse.Message"));

		Data data = new Data();
		data.setRoleConfigStatus(_ctx.integerValue("ConfigDataSetResponse.Data.RoleConfigStatus"));
		data.setJudgeType(_ctx.integerValue("ConfigDataSetResponse.Data.JudgeType"));
		data.setSetId(_ctx.longValue("ConfigDataSetResponse.Data.SetId"));
		data.setChannelType(_ctx.integerValue("ConfigDataSetResponse.Data.ChannelType"));

		RuleInfo ruleInfo = new RuleInfo();

		List<ConditionBasicInfo> conditions = new ArrayList<ConditionBasicInfo>();
		for (int i = 0; i < _ctx.lengthValue("ConfigDataSetResponse.Data.RuleInfo.Conditions.Length"); i++) {
			ConditionBasicInfo conditionBasicInfo = new ConditionBasicInfo();
			conditionBasicInfo.setCid(_ctx.stringValue("ConfigDataSetResponse.Data.RuleInfo.Conditions["+ i +"].Cid"));
			conditionBasicInfo.setLambda(_ctx.stringValue("ConfigDataSetResponse.Data.RuleInfo.Conditions["+ i +"].Lambda"));

			CheckRange checkRange = new CheckRange();
			checkRange.setRoleId(_ctx.integerValue("ConfigDataSetResponse.Data.RuleInfo.Conditions["+ i +"].CheckRange.RoleId"));
			checkRange.setRole(_ctx.stringValue("ConfigDataSetResponse.Data.RuleInfo.Conditions["+ i +"].CheckRange.Role"));

			Anchor anchor = new Anchor();
			anchor.setCid(_ctx.stringValue("ConfigDataSetResponse.Data.RuleInfo.Conditions["+ i +"].CheckRange.Anchor.Cid"));
			anchor.setLocation(_ctx.stringValue("ConfigDataSetResponse.Data.RuleInfo.Conditions["+ i +"].CheckRange.Anchor.Location"));
			anchor.setHitTime(_ctx.integerValue("ConfigDataSetResponse.Data.RuleInfo.Conditions["+ i +"].CheckRange.Anchor.HitTime"));
			checkRange.setAnchor(anchor);

			Range range = new Range();
			range.setFrom(_ctx.integerValue("ConfigDataSetResponse.Data.RuleInfo.Conditions["+ i +"].CheckRange.Range.From"));
			range.setTo(_ctx.integerValue("ConfigDataSetResponse.Data.RuleInfo.Conditions["+ i +"].CheckRange.Range.To"));
			checkRange.setRange(range);
			conditionBasicInfo.setCheckRange(checkRange);

			List<OperatorBasicInfo> operators = new ArrayList<OperatorBasicInfo>();
			for (int j = 0; j < _ctx.lengthValue("ConfigDataSetResponse.Data.RuleInfo.Conditions["+ i +"].Operators.Length"); j++) {
				OperatorBasicInfo operatorBasicInfo = new OperatorBasicInfo();
				operatorBasicInfo.setOid(_ctx.stringValue("ConfigDataSetResponse.Data.RuleInfo.Conditions["+ i +"].Operators["+ j +"].Oid"));
				operatorBasicInfo.setType(_ctx.stringValue("ConfigDataSetResponse.Data.RuleInfo.Conditions["+ i +"].Operators["+ j +"].Type"));

				Param param = new Param();
				param.setInSentence(_ctx.booleanValue("ConfigDataSetResponse.Data.RuleInfo.Conditions["+ i +"].Operators["+ j +"].Param.InSentence"));

				List<String> keywords = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ConfigDataSetResponse.Data.RuleInfo.Conditions["+ i +"].Operators["+ j +"].Param.Keywords.Length"); k++) {
					keywords.add(_ctx.stringValue("ConfigDataSetResponse.Data.RuleInfo.Conditions["+ i +"].Operators["+ j +"].Param.Keywords["+ k +"]"));
				}
				param.setKeywords(keywords);
				operatorBasicInfo.setParam(param);

				operators.add(operatorBasicInfo);
			}
			conditionBasicInfo.setOperators(operators);

			conditions.add(conditionBasicInfo);
		}
		ruleInfo.setConditions(conditions);

		List<RuleBasicInfo> rules = new ArrayList<RuleBasicInfo>();
		for (int i = 0; i < _ctx.lengthValue("ConfigDataSetResponse.Data.RuleInfo.Rules.Length"); i++) {
			RuleBasicInfo ruleBasicInfo = new RuleBasicInfo();
			ruleBasicInfo.setExternalProperty(_ctx.integerValue("ConfigDataSetResponse.Data.RuleInfo.Rules["+ i +"].ExternalProperty"));
			ruleBasicInfo.setLambda(_ctx.stringValue("ConfigDataSetResponse.Data.RuleInfo.Rules["+ i +"].Lambda"));
			ruleBasicInfo.setRid(_ctx.stringValue("ConfigDataSetResponse.Data.RuleInfo.Rules["+ i +"].Rid"));

			rules.add(ruleBasicInfo);
		}
		ruleInfo.setRules(rules);
		data.setRuleInfo(ruleInfo);
		configDataSetResponse.setData(data);
	 
	 	return configDataSetResponse;
	}
}