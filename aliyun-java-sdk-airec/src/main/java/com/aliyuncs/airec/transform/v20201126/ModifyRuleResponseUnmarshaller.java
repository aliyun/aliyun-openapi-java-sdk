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

import com.aliyuncs.airec.model.v20201126.ModifyRuleResponse;
import com.aliyuncs.airec.model.v20201126.ModifyRuleResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyRuleResponseUnmarshaller {

	public static ModifyRuleResponse unmarshall(ModifyRuleResponse modifyRuleResponse, UnmarshallerContext _ctx) {
		
		modifyRuleResponse.setRequestId(_ctx.stringValue("ModifyRuleResponse.requestId"));
		modifyRuleResponse.setCode(_ctx.stringValue("ModifyRuleResponse.code"));
		modifyRuleResponse.setMessage(_ctx.stringValue("ModifyRuleResponse.message"));

		Result result = new Result();
		result.setGmtCreate(_ctx.stringValue("ModifyRuleResponse.result.gmtCreate"));
		result.setGmtModified(_ctx.stringValue("ModifyRuleResponse.result.gmtModified"));
		result.setRuleId(_ctx.stringValue("ModifyRuleResponse.result.ruleId"));
		result.setRuleMeta(_ctx.mapValue("ModifyRuleResponse.result.ruleMeta"));
		result.setStatus(_ctx.stringValue("ModifyRuleResponse.result.status"));
		modifyRuleResponse.setResult(result);
	 
	 	return modifyRuleResponse;
	}
}