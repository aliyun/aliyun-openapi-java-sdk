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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListDesensitizationRuleResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListDesensitizationRuleResponse.DesensitizationRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDesensitizationRuleResponseUnmarshaller {

	public static ListDesensitizationRuleResponse unmarshall(ListDesensitizationRuleResponse listDesensitizationRuleResponse, UnmarshallerContext _ctx) {
		
		listDesensitizationRuleResponse.setRequestId(_ctx.stringValue("ListDesensitizationRuleResponse.RequestId"));
		listDesensitizationRuleResponse.setTotalCount(_ctx.integerValue("ListDesensitizationRuleResponse.TotalCount"));
		listDesensitizationRuleResponse.setErrorCode(_ctx.stringValue("ListDesensitizationRuleResponse.ErrorCode"));
		listDesensitizationRuleResponse.setErrorMessage(_ctx.stringValue("ListDesensitizationRuleResponse.ErrorMessage"));
		listDesensitizationRuleResponse.setSuccess(_ctx.booleanValue("ListDesensitizationRuleResponse.Success"));

		List<DesensitizationRule> desensitizationRuleList = new ArrayList<DesensitizationRule>();
		for (int i = 0; i < _ctx.lengthValue("ListDesensitizationRuleResponse.DesensitizationRuleList.Length"); i++) {
			DesensitizationRule desensitizationRule = new DesensitizationRule();
			desensitizationRule.setRuleName(_ctx.stringValue("ListDesensitizationRuleResponse.DesensitizationRuleList["+ i +"].RuleName"));
			desensitizationRule.setRuleType(_ctx.stringValue("ListDesensitizationRuleResponse.DesensitizationRuleList["+ i +"].RuleType"));
			desensitizationRule.setRuleDesc(_ctx.stringValue("ListDesensitizationRuleResponse.DesensitizationRuleList["+ i +"].RuleDesc"));
			desensitizationRule.setFunctionType(_ctx.stringValue("ListDesensitizationRuleResponse.DesensitizationRuleList["+ i +"].FunctionType"));
			desensitizationRule.setFuncParams(_ctx.stringValue("ListDesensitizationRuleResponse.DesensitizationRuleList["+ i +"].FuncParams"));
			desensitizationRule.setFuncSample(_ctx.stringValue("ListDesensitizationRuleResponse.DesensitizationRuleList["+ i +"].FuncSample"));
			desensitizationRule.setLastModifierId(_ctx.stringValue("ListDesensitizationRuleResponse.DesensitizationRuleList["+ i +"].LastModifierId"));
			desensitizationRule.setLastModifierName(_ctx.stringValue("ListDesensitizationRuleResponse.DesensitizationRuleList["+ i +"].LastModifierName"));
			desensitizationRule.setReferenceCount(_ctx.integerValue("ListDesensitizationRuleResponse.DesensitizationRuleList["+ i +"].ReferenceCount"));
			desensitizationRule.setRuleId(_ctx.integerValue("ListDesensitizationRuleResponse.DesensitizationRuleList["+ i +"].RuleId"));

			desensitizationRuleList.add(desensitizationRule);
		}
		listDesensitizationRuleResponse.setDesensitizationRuleList(desensitizationRuleList);
	 
	 	return listDesensitizationRuleResponse;
	}
}