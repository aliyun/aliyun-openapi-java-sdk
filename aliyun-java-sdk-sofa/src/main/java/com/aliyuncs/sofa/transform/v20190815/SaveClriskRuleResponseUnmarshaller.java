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

import com.aliyuncs.sofa.model.v20190815.SaveClriskRuleResponse;
import com.aliyuncs.sofa.model.v20190815.SaveClriskRuleResponse.RuleInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveClriskRuleResponseUnmarshaller {

	public static SaveClriskRuleResponse unmarshall(SaveClriskRuleResponse saveClriskRuleResponse, UnmarshallerContext _ctx) {
		
		saveClriskRuleResponse.setRequestId(_ctx.stringValue("SaveClriskRuleResponse.RequestId"));
		saveClriskRuleResponse.setResultCode(_ctx.stringValue("SaveClriskRuleResponse.ResultCode"));
		saveClriskRuleResponse.setResultMessage(_ctx.stringValue("SaveClriskRuleResponse.ResultMessage"));

		RuleInfo ruleInfo = new RuleInfo();
		ruleInfo.setContent(_ctx.stringValue("SaveClriskRuleResponse.RuleInfo.Content"));
		ruleInfo.setDebugStatus(_ctx.stringValue("SaveClriskRuleResponse.RuleInfo.DebugStatus"));
		ruleInfo.setDesc(_ctx.stringValue("SaveClriskRuleResponse.RuleInfo.Desc"));
		ruleInfo.setGmtCreate(_ctx.stringValue("SaveClriskRuleResponse.RuleInfo.GmtCreate"));
		ruleInfo.setGmtModified(_ctx.stringValue("SaveClriskRuleResponse.RuleInfo.GmtModified"));
		ruleInfo.setModelCode(_ctx.stringValue("SaveClriskRuleResponse.RuleInfo.ModelCode"));
		ruleInfo.setRuleCode(_ctx.stringValue("SaveClriskRuleResponse.RuleInfo.RuleCode"));
		ruleInfo.setRuleName(_ctx.stringValue("SaveClriskRuleResponse.RuleInfo.RuleName"));
		saveClriskRuleResponse.setRuleInfo(ruleInfo);
	 
	 	return saveClriskRuleResponse;
	}
}