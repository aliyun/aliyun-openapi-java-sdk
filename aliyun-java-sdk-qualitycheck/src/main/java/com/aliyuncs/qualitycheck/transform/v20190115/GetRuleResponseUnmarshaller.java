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

	public static GetRuleResponse unmarshall(GetRuleResponse getRuleResponse, UnmarshallerContext context) {
		
		getRuleResponse.setRequestId(context.stringValue("GetRuleResponse.RequestId"));
		getRuleResponse.setSuccess(context.booleanValue("GetRuleResponse.Success"));
		getRuleResponse.setCode(context.stringValue("GetRuleResponse.Code"));
		getRuleResponse.setMessage(context.stringValue("GetRuleResponse.Message"));

		Data data = new Data();

		List<RuleInfo> rules = new ArrayList<RuleInfo>();
		for (int i = 0; i < context.lengthValue("GetRuleResponse.Data.Rules.Length"); i++) {
			RuleInfo ruleInfo = new RuleInfo();
			ruleInfo.setRid(context.stringValue("GetRuleResponse.Data.Rules["+ i +"].Rid"));
			ruleInfo.setRuleLambda(context.stringValue("GetRuleResponse.Data.Rules["+ i +"].RuleLambda"));
			ruleInfo.setName(context.stringValue("GetRuleResponse.Data.Rules["+ i +"].Name"));
			ruleInfo.setType(context.integerValue("GetRuleResponse.Data.Rules["+ i +"].Type"));
			ruleInfo.setStatus(context.integerValue("GetRuleResponse.Data.Rules["+ i +"].Status"));
			ruleInfo.setIsDelete(context.integerValue("GetRuleResponse.Data.Rules["+ i +"].IsDelete"));
			ruleInfo.setStartTime(context.stringValue("GetRuleResponse.Data.Rules["+ i +"].StartTime"));
			ruleInfo.setEndTime(context.stringValue("GetRuleResponse.Data.Rules["+ i +"].EndTime"));
			ruleInfo.setWeight(context.stringValue("GetRuleResponse.Data.Rules["+ i +"].Weight"));
			ruleInfo.setIsOnline(context.integerValue("GetRuleResponse.Data.Rules["+ i +"].IsOnline"));
			ruleInfo.setCreateEmpid(context.stringValue("GetRuleResponse.Data.Rules["+ i +"].CreateEmpid"));
			ruleInfo.setCreateTime(context.stringValue("GetRuleResponse.Data.Rules["+ i +"].CreateTime"));
			ruleInfo.setLastUpdateTime(context.stringValue("GetRuleResponse.Data.Rules["+ i +"].LastUpdateTime"));
			ruleInfo.setLastUpdateEmpid(context.stringValue("GetRuleResponse.Data.Rules["+ i +"].LastUpdateEmpid"));
			ruleInfo.setComments(context.stringValue("GetRuleResponse.Data.Rules["+ i +"].Comments"));
			ruleInfo.setAutoReview(context.integerValue("GetRuleResponse.Data.Rules["+ i +"].AutoReview"));
			ruleInfo.setRuleScoreType(context.integerValue("GetRuleResponse.Data.Rules["+ i +"].RuleScoreType"));
			ruleInfo.setScoreName(context.stringValue("GetRuleResponse.Data.Rules["+ i +"].ScoreName"));
			ruleInfo.setScoreSubName(context.stringValue("GetRuleResponse.Data.Rules["+ i +"].ScoreSubName"));

			List<String> businessCategoryNameList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("GetRuleResponse.Data.Rules["+ i +"].BusinessCategoryNameList.Length"); j++) {
				businessCategoryNameList.add(context.stringValue("GetRuleResponse.Data.Rules["+ i +"].BusinessCategoryNameList["+ j +"]"));
			}
			ruleInfo.setBusinessCategoryNameList(businessCategoryNameList);

			rules.add(ruleInfo);
		}
		data.setRules(rules);
		getRuleResponse.setData(data);
	 
	 	return getRuleResponse;
	}
}