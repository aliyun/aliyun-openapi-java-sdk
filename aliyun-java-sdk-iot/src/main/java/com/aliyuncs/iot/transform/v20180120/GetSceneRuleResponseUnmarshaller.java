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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.GetSceneRuleResponse;
import com.aliyuncs.iot.model.v20180120.GetSceneRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSceneRuleResponseUnmarshaller {

	public static GetSceneRuleResponse unmarshall(GetSceneRuleResponse getSceneRuleResponse, UnmarshallerContext _ctx) {
		
		getSceneRuleResponse.setRequestId(_ctx.stringValue("GetSceneRuleResponse.RequestId"));
		getSceneRuleResponse.setCode(_ctx.stringValue("GetSceneRuleResponse.Code"));
		getSceneRuleResponse.setErrorMessage(_ctx.stringValue("GetSceneRuleResponse.ErrorMessage"));
		getSceneRuleResponse.setSuccess(_ctx.booleanValue("GetSceneRuleResponse.Success"));

		Data data = new Data();
		data.setRuleStatus(_ctx.integerValue("GetSceneRuleResponse.Data.RuleStatus"));
		data.setRuleContent(_ctx.stringValue("GetSceneRuleResponse.Data.RuleContent"));
		data.setGmtCreate(_ctx.longValue("GetSceneRuleResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.longValue("GetSceneRuleResponse.Data.GmtModified"));
		data.setRuleDescription(_ctx.stringValue("GetSceneRuleResponse.Data.RuleDescription"));
		data.setRuleName(_ctx.stringValue("GetSceneRuleResponse.Data.RuleName"));
		getSceneRuleResponse.setData(data);
	 
	 	return getSceneRuleResponse;
	}
}