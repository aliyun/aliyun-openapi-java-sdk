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

import com.aliyuncs.qualitycheck.model.v20190115.GetRuleResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetRuleResponse.Data;
import com.aliyuncs.qualitycheck.model.v20190115.GetRuleResponse.Data.RuleInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRuleResponseUnmarshaller {

	public static GetRuleResponse unmarshall(GetRuleResponse getRuleResponse, UnmarshallerContext _ctx) {
		
		getRuleResponse.setRequestId(_ctx.stringValue("GetRuleResponse.RequestId"));
		getRuleResponse.setSuccess(_ctx.booleanValue("GetRuleResponse.Success"));
		getRuleResponse.setCode(_ctx.stringValue("GetRuleResponse.Code"));
		getRuleResponse.setMessage(_ctx.stringValue("GetRuleResponse.Message"));

		Data data = new Data();

		List<RuleInfo> rules = new ArrayList<RuleInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetRuleResponse.Data.Rules.Length"); i++) {
			RuleInfo ruleInfo = new RuleInfo();
			ruleInfo.setRid(_ctx.stringValue("GetRuleResponse.Data.Rules["+ i +"].Rid"));
			ruleInfo.setRuleLambda(_ctx.stringValue("GetRuleResponse.Data.Rules["+ i +"].RuleLambda"));
			ruleInfo.setName(_ctx.stringValue("GetRuleResponse.Data.Rules["+ i +"].Name"));
			ruleInfo.setType(_ctx.integerValue("GetRuleResponse.Data.Rules["+ i +"].Type"));
			ruleInfo.setStatus(_ctx.integerValue("GetRuleResponse.Data.Rules["+ i +"].Status"));
			ruleInfo.setIsDelete(_ctx.integerValue("GetRuleResponse.Data.Rules["+ i +"].IsDelete"));
			ruleInfo.setStartTime(_ctx.stringValue("GetRuleResponse.Data.Rules["+ i +"].StartTime"));
			ruleInfo.setEndTime(_ctx.stringValue("GetRuleResponse.Data.Rules["+ i +"].EndTime"));
			ruleInfo.setWeight(_ctx.stringValue("GetRuleResponse.Data.Rules["+ i +"].Weight"));
			ruleInfo.setIsOnline(_ctx.integerValue("GetRuleResponse.Data.Rules["+ i +"].IsOnline"));
			ruleInfo.setCreateEmpid(_ctx.stringValue("GetRuleResponse.Data.Rules["+ i +"].CreateEmpid"));
			ruleInfo.setCreateTime(_ctx.stringValue("GetRuleResponse.Data.Rules["+ i +"].CreateTime"));
			ruleInfo.setLastUpdateTime(_ctx.stringValue("GetRuleResponse.Data.Rules["+ i +"].LastUpdateTime"));
			ruleInfo.setLastUpdateEmpid(_ctx.stringValue("GetRuleResponse.Data.Rules["+ i +"].LastUpdateEmpid"));
			ruleInfo.setComments(_ctx.stringValue("GetRuleResponse.Data.Rules["+ i +"].Comments"));
			ruleInfo.setAutoReview(_ctx.integerValue("GetRuleResponse.Data.Rules["+ i +"].AutoReview"));
			ruleInfo.setRuleScoreType(_ctx.integerValue("GetRuleResponse.Data.Rules["+ i +"].RuleScoreType"));
			ruleInfo.setScoreName(_ctx.stringValue("GetRuleResponse.Data.Rules["+ i +"].ScoreName"));
			ruleInfo.setScoreSubName(_ctx.stringValue("GetRuleResponse.Data.Rules["+ i +"].ScoreSubName"));

			List<String> businessCategoryNameList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetRuleResponse.Data.Rules["+ i +"].BusinessCategoryNameList.Length"); j++) {
				businessCategoryNameList.add(_ctx.stringValue("GetRuleResponse.Data.Rules["+ i +"].BusinessCategoryNameList["+ j +"]"));
			}
			ruleInfo.setBusinessCategoryNameList(businessCategoryNameList);

			rules.add(ruleInfo);
		}
		data.setRules(rules);
		getRuleResponse.setData(data);
	 
	 	return getRuleResponse;
	}
}