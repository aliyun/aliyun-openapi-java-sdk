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

import com.aliyuncs.waf_openapi.model.v20180117.CreateAclRuleResponse;
import com.aliyuncs.waf_openapi.model.v20180117.CreateAclRuleResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAclRuleResponseUnmarshaller {

	public static CreateAclRuleResponse unmarshall(CreateAclRuleResponse createAclRuleResponse, UnmarshallerContext _ctx) {
		
		createAclRuleResponse.setRequestId(_ctx.stringValue("CreateAclRuleResponse.RequestId"));

		Result result = new Result();
		result.setWafTaskId(_ctx.stringValue("CreateAclRuleResponse.Result.WafTaskId"));
		result.setStatus(_ctx.integerValue("CreateAclRuleResponse.Result.Status"));
		createAclRuleResponse.setResult(result);
	 
	 	return createAclRuleResponse;
	}
}