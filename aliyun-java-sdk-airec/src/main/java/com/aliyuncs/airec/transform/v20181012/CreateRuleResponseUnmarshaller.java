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

package com.aliyuncs.airec.transform.v20181012;

import com.aliyuncs.airec.model.v20181012.CreateRuleResponse;
import com.aliyuncs.airec.model.v20181012.CreateRuleResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRuleResponseUnmarshaller {

	public static CreateRuleResponse unmarshall(CreateRuleResponse createRuleResponse, UnmarshallerContext _ctx) {
		
		createRuleResponse.setRequestId(_ctx.stringValue("CreateRuleResponse.RequestId"));

		Result result = new Result();
		result.setStatus(_ctx.stringValue("CreateRuleResponse.Result.Status"));
		result.setGmtCreate(_ctx.stringValue("CreateRuleResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.stringValue("CreateRuleResponse.Result.GmtModified"));
		result.setRuleId(_ctx.stringValue("CreateRuleResponse.Result.RuleId"));
		createRuleResponse.setResult(result);
	 
	 	return createRuleResponse;
	}
}