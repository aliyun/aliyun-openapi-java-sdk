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

import com.aliyuncs.qualitycheck.model.v20160801.GetRuleResponse;
import com.aliyuncs.qualitycheck.model.v20160801.GetRuleResponse.Data;
import com.aliyuncs.qualitycheck.model.v20160801.GetRuleResponse.Data.RuleInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRuleResponseUnmarshaller {

	public static GetRuleResponse unmarshall(GetRuleResponse getRuleResponse, UnmarshallerContext context) {
		
		getRuleResponse.setRequestId(context.stringValue("GetRuleResponse.requestId"));
		getRuleResponse.setSuccess(context.booleanValue("GetRuleResponse.success"));
		getRuleResponse.setCode(context.stringValue("GetRuleResponse.code"));
		getRuleResponse.setMessage(context.stringValue("GetRuleResponse.message"));

		Data data = new Data();

		List<RuleInfo> rules = new ArrayList<RuleInfo>();
		for (int i = 0; i < context.lengthValue("GetRuleResponse.data.rules.Length"); i++) {
			RuleInfo ruleInfo = new RuleInfo();
			ruleInfo.setRid(context.stringValue("GetRuleResponse.data.rules["+ i +"].rid"));
			ruleInfo.setRuleLambda(context.stringValue("GetRuleResponse.data.rules["+ i +"].ruleLambda"));
			ruleInfo.setName(context.stringValue("GetRuleResponse.data.rules["+ i +"].name"));
			ruleInfo.setType(context.integerValue("GetRuleResponse.data.rules["+ i +"].type"));
			ruleInfo.setStatus(context.integerValue("GetRuleResponse.data.rules["+ i +"].status"));
			ruleInfo.setIsDelete(context.integerValue("GetRuleResponse.data.rules["+ i +"].isDelete"));
			ruleInfo.setStartTime(context.stringValue("GetRuleResponse.data.rules["+ i +"].startTime"));
			ruleInfo.setEndTime(context.stringValue("GetRuleResponse.data.rules["+ i +"].endTime"));
			ruleInfo.setWeight(context.stringValue("GetRuleResponse.data.rules["+ i +"].weight"));
			ruleInfo.setIsOnline(context.integerValue("GetRuleResponse.data.rules["+ i +"].isOnline"));
			ruleInfo.setCreateEmpid(context.stringValue("GetRuleResponse.data.rules["+ i +"].createEmpid"));
			ruleInfo.setCreateTime(context.stringValue("GetRuleResponse.data.rules["+ i +"].createTime"));
			ruleInfo.setLastUpdateTime(context.stringValue("GetRuleResponse.data.rules["+ i +"].lastUpdateTime"));
			ruleInfo.setLastUpdateEmpid(context.stringValue("GetRuleResponse.data.rules["+ i +"].lastUpdateEmpid"));
			ruleInfo.setComments(context.stringValue("GetRuleResponse.data.rules["+ i +"].comments"));
			ruleInfo.setAutoReview(context.integerValue("GetRuleResponse.data.rules["+ i +"].autoReview"));
			ruleInfo.setRuleScoreType(context.integerValue("GetRuleResponse.data.rules["+ i +"].ruleScoreType"));
			ruleInfo.setScoreName(context.stringValue("GetRuleResponse.data.rules["+ i +"].scoreName"));
			ruleInfo.setScoreSubName(context.stringValue("GetRuleResponse.data.rules["+ i +"].scoreSubName"));

			rules.add(ruleInfo);
		}
		data.setRules(rules);
		getRuleResponse.setData(data);
	 
	 	return getRuleResponse;
	}
}