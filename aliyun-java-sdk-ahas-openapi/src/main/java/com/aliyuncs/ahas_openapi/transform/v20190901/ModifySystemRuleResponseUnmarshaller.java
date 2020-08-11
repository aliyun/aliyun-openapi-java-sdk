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

package com.aliyuncs.ahas_openapi.transform.v20190901;

import com.aliyuncs.ahas_openapi.model.v20190901.ModifySystemRuleResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.ModifySystemRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifySystemRuleResponseUnmarshaller {

	public static ModifySystemRuleResponse unmarshall(ModifySystemRuleResponse modifySystemRuleResponse, UnmarshallerContext _ctx) {
		
		modifySystemRuleResponse.setRequestId(_ctx.stringValue("ModifySystemRuleResponse.RequestId"));
		modifySystemRuleResponse.setCode(_ctx.stringValue("ModifySystemRuleResponse.Code"));
		modifySystemRuleResponse.setMessage(_ctx.stringValue("ModifySystemRuleResponse.Message"));
		modifySystemRuleResponse.setSuccess(_ctx.booleanValue("ModifySystemRuleResponse.Success"));

		Data data = new Data();
		data.setThreshold(_ctx.floatValue("ModifySystemRuleResponse.Data.Threshold"));
		data.setEnable(_ctx.booleanValue("ModifySystemRuleResponse.Data.Enable"));
		data.setMetricType(_ctx.integerValue("ModifySystemRuleResponse.Data.MetricType"));
		data.setRuleId(_ctx.longValue("ModifySystemRuleResponse.Data.RuleId"));
		modifySystemRuleResponse.setData(data);
	 
	 	return modifySystemRuleResponse;
	}
}