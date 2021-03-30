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

package com.aliyuncs.airec.transform.v20201126;

import com.aliyuncs.airec.model.v20201126.CreateRuleResponse;
import com.aliyuncs.airec.model.v20201126.CreateRuleResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRuleResponseUnmarshaller {

	public static CreateRuleResponse unmarshall(CreateRuleResponse createRuleResponse, UnmarshallerContext _ctx) {
		
		createRuleResponse.setCode(_ctx.stringValue("CreateRuleResponse.code"));
		createRuleResponse.setRequestId(_ctx.stringValue("CreateRuleResponse.requestId"));
		createRuleResponse.setMessage(_ctx.stringValue("CreateRuleResponse.message"));

		Result result = new Result();
		result.setGmtModified(_ctx.stringValue("CreateRuleResponse.result.gmtModified"));
		result.setGmtCreate(_ctx.stringValue("CreateRuleResponse.result.gmtCreate"));
		result.setRuleId(_ctx.stringValue("CreateRuleResponse.result.ruleId"));
		result.setStatus(_ctx.stringValue("CreateRuleResponse.result.status"));
		createRuleResponse.setResult(result);
	 
	 	return createRuleResponse;
	}
}