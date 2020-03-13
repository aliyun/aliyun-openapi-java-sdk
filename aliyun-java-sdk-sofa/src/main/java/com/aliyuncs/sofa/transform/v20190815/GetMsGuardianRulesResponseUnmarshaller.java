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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.GetMsGuardianRulesResponse;
import com.aliyuncs.sofa.model.v20190815.GetMsGuardianRulesResponse.GuardianRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMsGuardianRulesResponseUnmarshaller {

	public static GetMsGuardianRulesResponse unmarshall(GetMsGuardianRulesResponse getMsGuardianRulesResponse, UnmarshallerContext _ctx) {
		
		getMsGuardianRulesResponse.setRequestId(_ctx.stringValue("GetMsGuardianRulesResponse.RequestId"));
		getMsGuardianRulesResponse.setResultCode(_ctx.stringValue("GetMsGuardianRulesResponse.ResultCode"));
		getMsGuardianRulesResponse.setResultMessage(_ctx.stringValue("GetMsGuardianRulesResponse.ResultMessage"));

		GuardianRule guardianRule = new GuardianRule();
		guardianRule.setAppName(_ctx.stringValue("GetMsGuardianRulesResponse.GuardianRule.AppName"));
		guardianRule.setEnable(_ctx.booleanValue("GetMsGuardianRulesResponse.GuardianRule.Enable"));
		guardianRule.setGmtCreate(_ctx.stringValue("GetMsGuardianRulesResponse.GuardianRule.GmtCreate"));
		guardianRule.setGmtModified(_ctx.stringValue("GetMsGuardianRulesResponse.GuardianRule.GmtModified"));
		guardianRule.setId(_ctx.longValue("GetMsGuardianRulesResponse.GuardianRule.Id"));
		guardianRule.setInstanceId(_ctx.stringValue("GetMsGuardianRulesResponse.GuardianRule.InstanceId"));
		guardianRule.setName(_ctx.stringValue("GetMsGuardianRulesResponse.GuardianRule.Name"));
		guardianRule.setOperator(_ctx.stringValue("GetMsGuardianRulesResponse.GuardianRule.Operator"));
		guardianRule.setResourceType(_ctx.stringValue("GetMsGuardianRulesResponse.GuardianRule.ResourceType"));
		guardianRule.setRuleConfig(_ctx.stringValue("GetMsGuardianRulesResponse.GuardianRule.RuleConfig"));
		guardianRule.setRunMode(_ctx.stringValue("GetMsGuardianRulesResponse.GuardianRule.RunMode"));
		getMsGuardianRulesResponse.setGuardianRule(guardianRule);
	 
	 	return getMsGuardianRulesResponse;
	}
}