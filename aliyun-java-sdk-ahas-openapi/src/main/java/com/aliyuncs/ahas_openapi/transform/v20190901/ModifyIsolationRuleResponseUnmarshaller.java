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

import com.aliyuncs.ahas_openapi.model.v20190901.ModifyIsolationRuleResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.ModifyIsolationRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyIsolationRuleResponseUnmarshaller {

	public static ModifyIsolationRuleResponse unmarshall(ModifyIsolationRuleResponse modifyIsolationRuleResponse, UnmarshallerContext _ctx) {
		
		modifyIsolationRuleResponse.setRequestId(_ctx.stringValue("ModifyIsolationRuleResponse.RequestId"));
		modifyIsolationRuleResponse.setCode(_ctx.stringValue("ModifyIsolationRuleResponse.Code"));
		modifyIsolationRuleResponse.setMessage(_ctx.stringValue("ModifyIsolationRuleResponse.Message"));
		modifyIsolationRuleResponse.setSuccess(_ctx.booleanValue("ModifyIsolationRuleResponse.Success"));

		Data data = new Data();
		data.setAppName(_ctx.stringValue("ModifyIsolationRuleResponse.Data.AppName"));
		data.setThreshold(_ctx.floatValue("ModifyIsolationRuleResponse.Data.Threshold"));
		data.setEnable(_ctx.booleanValue("ModifyIsolationRuleResponse.Data.Enable"));
		data.setLimitOrigin(_ctx.stringValue("ModifyIsolationRuleResponse.Data.LimitOrigin"));
		data.setNamespace(_ctx.stringValue("ModifyIsolationRuleResponse.Data.Namespace"));
		data.setRefResource(_ctx.stringValue("ModifyIsolationRuleResponse.Data.RefResource"));
		data.setRelationStrategy(_ctx.integerValue("ModifyIsolationRuleResponse.Data.RelationStrategy"));
		data.setResource(_ctx.stringValue("ModifyIsolationRuleResponse.Data.Resource"));
		data.setRuleId(_ctx.longValue("ModifyIsolationRuleResponse.Data.RuleId"));
		modifyIsolationRuleResponse.setData(data);
	 
	 	return modifyIsolationRuleResponse;
	}
}