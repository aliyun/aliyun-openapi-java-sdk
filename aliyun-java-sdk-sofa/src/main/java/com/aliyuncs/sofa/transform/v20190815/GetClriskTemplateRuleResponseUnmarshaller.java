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

import com.aliyuncs.sofa.model.v20190815.GetClriskTemplateRuleResponse;
import com.aliyuncs.sofa.model.v20190815.GetClriskTemplateRuleResponse.TemplateRuleInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClriskTemplateRuleResponseUnmarshaller {

	public static GetClriskTemplateRuleResponse unmarshall(GetClriskTemplateRuleResponse getClriskTemplateRuleResponse, UnmarshallerContext _ctx) {
		
		getClriskTemplateRuleResponse.setRequestId(_ctx.stringValue("GetClriskTemplateRuleResponse.RequestId"));
		getClriskTemplateRuleResponse.setResultCode(_ctx.stringValue("GetClriskTemplateRuleResponse.ResultCode"));
		getClriskTemplateRuleResponse.setResultMessage(_ctx.stringValue("GetClriskTemplateRuleResponse.ResultMessage"));

		TemplateRuleInfo templateRuleInfo = new TemplateRuleInfo();
		templateRuleInfo.setContent(_ctx.stringValue("GetClriskTemplateRuleResponse.TemplateRuleInfo.Content"));
		templateRuleInfo.setDebugStatus(_ctx.stringValue("GetClriskTemplateRuleResponse.TemplateRuleInfo.DebugStatus"));
		templateRuleInfo.setDesc(_ctx.stringValue("GetClriskTemplateRuleResponse.TemplateRuleInfo.Desc"));
		templateRuleInfo.setGmtCreate(_ctx.stringValue("GetClriskTemplateRuleResponse.TemplateRuleInfo.GmtCreate"));
		templateRuleInfo.setGmtModified(_ctx.stringValue("GetClriskTemplateRuleResponse.TemplateRuleInfo.GmtModified"));
		templateRuleInfo.setRuleCode(_ctx.stringValue("GetClriskTemplateRuleResponse.TemplateRuleInfo.RuleCode"));
		templateRuleInfo.setRuleName(_ctx.stringValue("GetClriskTemplateRuleResponse.TemplateRuleInfo.RuleName"));
		templateRuleInfo.setTemplateCode(_ctx.stringValue("GetClriskTemplateRuleResponse.TemplateRuleInfo.TemplateCode"));
		templateRuleInfo.setType(_ctx.stringValue("GetClriskTemplateRuleResponse.TemplateRuleInfo.Type"));
		templateRuleInfo.setCheckType(_ctx.stringValue("GetClriskTemplateRuleResponse.TemplateRuleInfo.CheckType"));
		getClriskTemplateRuleResponse.setTemplateRuleInfo(templateRuleInfo);
	 
	 	return getClriskTemplateRuleResponse;
	}
}