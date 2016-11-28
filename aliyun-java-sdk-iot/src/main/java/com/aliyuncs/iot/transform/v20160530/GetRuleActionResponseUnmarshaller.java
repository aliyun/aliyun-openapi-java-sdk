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

import com.aliyuncs.iot.model.v20160530.GetRuleActionResponse;
import com.aliyuncs.iot.model.v20160530.GetRuleActionResponse.RuleActionInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRuleActionResponseUnmarshaller {

	public static GetRuleActionResponse unmarshall(GetRuleActionResponse getRuleActionResponse, UnmarshallerContext context) {
		
		getRuleActionResponse.setRequestId(context.stringValue("GetRuleActionResponse.RequestId"));
		getRuleActionResponse.setSuccess(context.booleanValue("GetRuleActionResponse.Success"));
		getRuleActionResponse.setErrorMessage(context.stringValue("GetRuleActionResponse.ErrorMessage"));

		RuleActionInfo ruleActionInfo = new RuleActionInfo();
		ruleActionInfo.setId(context.longValue("GetRuleActionResponse.RuleActionInfo.Id"));
		ruleActionInfo.setRuleId(context.longValue("GetRuleActionResponse.RuleActionInfo.RuleId"));
		ruleActionInfo.setType(context.stringValue("GetRuleActionResponse.RuleActionInfo.Type"));
		ruleActionInfo.setConfiguration(context.stringValue("GetRuleActionResponse.RuleActionInfo.Configuration"));
		getRuleActionResponse.setRuleActionInfo(ruleActionInfo);
	 
	 	return getRuleActionResponse;
	}
}