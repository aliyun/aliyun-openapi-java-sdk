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

import com.aliyuncs.sofa.model.v20190815.SaveClriskTemplateRuleResponse;
import com.aliyuncs.sofa.model.v20190815.SaveClriskTemplateRuleResponse.RuleInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveClriskTemplateRuleResponseUnmarshaller {

	public static SaveClriskTemplateRuleResponse unmarshall(SaveClriskTemplateRuleResponse saveClriskTemplateRuleResponse, UnmarshallerContext _ctx) {
		
		saveClriskTemplateRuleResponse.setRequestId(_ctx.stringValue("SaveClriskTemplateRuleResponse.RequestId"));
		saveClriskTemplateRuleResponse.setResultCode(_ctx.stringValue("SaveClriskTemplateRuleResponse.ResultCode"));
		saveClriskTemplateRuleResponse.setResultMessage(_ctx.stringValue("SaveClriskTemplateRuleResponse.ResultMessage"));

		RuleInfo ruleInfo = new RuleInfo();
		ruleInfo.setContent(_ctx.stringValue("SaveClriskTemplateRuleResponse.RuleInfo.Content"));
		ruleInfo.setDebugStatus(_ctx.stringValue("SaveClriskTemplateRuleResponse.RuleInfo.DebugStatus"));
		ruleInfo.setDesc(_ctx.stringValue("SaveClriskTemplateRuleResponse.RuleInfo.Desc"));
		ruleInfo.setGmtCreate(_ctx.stringValue("SaveClriskTemplateRuleResponse.RuleInfo.GmtCreate"));
		ruleInfo.setGmtModified(_ctx.stringValue("SaveClriskTemplateRuleResponse.RuleInfo.GmtModified"));
		ruleInfo.setRuleCode(_ctx.stringValue("SaveClriskTemplateRuleResponse.RuleInfo.RuleCode"));
		ruleInfo.setRuleName(_ctx.stringValue("SaveClriskTemplateRuleResponse.RuleInfo.RuleName"));
		ruleInfo.setTemplateCode(_ctx.stringValue("SaveClriskTemplateRuleResponse.RuleInfo.TemplateCode"));
		ruleInfo.setType(_ctx.stringValue("SaveClriskTemplateRuleResponse.RuleInfo.Type"));
		ruleInfo.setCheckType(_ctx.stringValue("SaveClriskTemplateRuleResponse.RuleInfo.CheckType"));
		saveClriskTemplateRuleResponse.setRuleInfo(ruleInfo);
	 
	 	return saveClriskTemplateRuleResponse;
	}
}