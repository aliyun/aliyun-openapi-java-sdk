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

import com.aliyuncs.dms_enterprise.model.v20181101.AddDesensitizationRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddDesensitizationRuleResponseUnmarshaller {

	public static AddDesensitizationRuleResponse unmarshall(AddDesensitizationRuleResponse addDesensitizationRuleResponse, UnmarshallerContext _ctx) {
		
		addDesensitizationRuleResponse.setRequestId(_ctx.stringValue("AddDesensitizationRuleResponse.RequestId"));
		addDesensitizationRuleResponse.setErrorCode(_ctx.stringValue("AddDesensitizationRuleResponse.ErrorCode"));
		addDesensitizationRuleResponse.setErrorMessage(_ctx.stringValue("AddDesensitizationRuleResponse.ErrorMessage"));
		addDesensitizationRuleResponse.setSuccess(_ctx.booleanValue("AddDesensitizationRuleResponse.Success"));
		addDesensitizationRuleResponse.setRuleId(_ctx.integerValue("AddDesensitizationRuleResponse.RuleId"));
	 
	 	return addDesensitizationRuleResponse;
	}
}