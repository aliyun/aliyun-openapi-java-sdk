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

package com.aliyuncs.waf_openapi.transform.v20180117;

import com.aliyuncs.waf_openapi.model.v20180117.ModifyAclRuleResponse;
import com.aliyuncs.waf_openapi.model.v20180117.ModifyAclRuleResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyAclRuleResponseUnmarshaller {

	public static ModifyAclRuleResponse unmarshall(ModifyAclRuleResponse modifyAclRuleResponse, UnmarshallerContext _ctx) {
		
		modifyAclRuleResponse.setRequestId(_ctx.stringValue("ModifyAclRuleResponse.RequestId"));

		Result result = new Result();
		result.setWafTaskId(_ctx.stringValue("ModifyAclRuleResponse.Result.WafTaskId"));
		result.setStatus(_ctx.integerValue("ModifyAclRuleResponse.Result.Status"));
		modifyAclRuleResponse.setResult(result);
	 
	 	return modifyAclRuleResponse;
	}
}