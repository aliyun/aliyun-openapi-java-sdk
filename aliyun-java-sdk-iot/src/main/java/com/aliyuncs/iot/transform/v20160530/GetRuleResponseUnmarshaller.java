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
package com.aliyuncs.iot.transform.v20160530;

import com.aliyuncs.iot.model.v20160530.GetRuleResponse;
import com.aliyuncs.iot.model.v20160530.GetRuleResponse.RuleInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRuleResponseUnmarshaller {

	public static GetRuleResponse unmarshall(GetRuleResponse getRuleResponse, UnmarshallerContext context) {
		
		getRuleResponse.setRequestId(context.stringValue("GetRuleResponse.RequestId"));
		getRuleResponse.setSuccess(context.booleanValue("GetRuleResponse.Success"));
		getRuleResponse.setErrorMessage(context.stringValue("GetRuleResponse.ErrorMessage"));

		RuleInfo ruleInfo = new RuleInfo();
		ruleInfo.setId(context.longValue("GetRuleResponse.RuleInfo.Id"));
		ruleInfo.setSelect(context.stringValue("GetRuleResponse.RuleInfo.Select"));
		ruleInfo.setTopic(context.stringValue("GetRuleResponse.RuleInfo.Topic"));
		ruleInfo.setShortTopic(context.stringValue("GetRuleResponse.RuleInfo.ShortTopic"));
		ruleInfo.setWhere(context.stringValue("GetRuleResponse.RuleInfo.Where"));
		ruleInfo.setStatus(context.stringValue("GetRuleResponse.RuleInfo.Status"));
		ruleInfo.setCreateUserId(context.longValue("GetRuleResponse.RuleInfo.CreateUserId"));
		ruleInfo.setProductKey(context.longValue("GetRuleResponse.RuleInfo.ProductKey"));
		ruleInfo.setName(context.stringValue("GetRuleResponse.RuleInfo.Name"));
		ruleInfo.setRuleDesc(context.stringValue("GetRuleResponse.RuleInfo.RuleDesc"));
		ruleInfo.setCreated(context.stringValue("GetRuleResponse.RuleInfo.Created"));
		ruleInfo.setModified(context.stringValue("GetRuleResponse.RuleInfo.Modified"));
		getRuleResponse.setRuleInfo(ruleInfo);
	 
	 	return getRuleResponse;
	}
}