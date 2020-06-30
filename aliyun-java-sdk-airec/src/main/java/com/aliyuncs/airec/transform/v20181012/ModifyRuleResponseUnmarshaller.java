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

import com.aliyuncs.airec.model.v20181012.ModifyRuleResponse;
import com.aliyuncs.airec.model.v20181012.ModifyRuleResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyRuleResponseUnmarshaller {

	public static ModifyRuleResponse unmarshall(ModifyRuleResponse modifyRuleResponse, UnmarshallerContext _ctx) {
		
		modifyRuleResponse.setRequestId(_ctx.stringValue("ModifyRuleResponse.RequestId"));

		Result result = new Result();
		result.setRuleId(_ctx.stringValue("ModifyRuleResponse.Result.RuleId"));
		result.setGmtCreate(_ctx.stringValue("ModifyRuleResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.stringValue("ModifyRuleResponse.Result.GmtModified"));
		result.setStatus(_ctx.stringValue("ModifyRuleResponse.Result.Status"));
		result.setRuleMeta(_ctx.mapValue("ModifyRuleResponse.Result.RuleMeta"));
		modifyRuleResponse.setResult(result);
	 
	 	return modifyRuleResponse;
	}
}