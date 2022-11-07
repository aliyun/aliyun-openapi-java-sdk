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

import com.aliyuncs.ahas_openapi.model.v20190901.ModifyDegradeRuleResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.ModifyDegradeRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyDegradeRuleResponseUnmarshaller {

	public static ModifyDegradeRuleResponse unmarshall(ModifyDegradeRuleResponse modifyDegradeRuleResponse, UnmarshallerContext _ctx) {
		
		modifyDegradeRuleResponse.setRequestId(_ctx.stringValue("ModifyDegradeRuleResponse.RequestId"));
		modifyDegradeRuleResponse.setMessage(_ctx.stringValue("ModifyDegradeRuleResponse.Message"));
		modifyDegradeRuleResponse.setCode(_ctx.stringValue("ModifyDegradeRuleResponse.Code"));
		modifyDegradeRuleResponse.setSuccess(_ctx.booleanValue("ModifyDegradeRuleResponse.Success"));

		Data data = new Data();
		data.setSlowRtMs(_ctx.integerValue("ModifyDegradeRuleResponse.Data.SlowRtMs"));
		data.setHalfOpenRecoveryStepNum(_ctx.integerValue("ModifyDegradeRuleResponse.Data.HalfOpenRecoveryStepNum"));
		data.setNamespace(_ctx.stringValue("ModifyDegradeRuleResponse.Data.Namespace"));
		data.setStatDurationMs(_ctx.integerValue("ModifyDegradeRuleResponse.Data.StatDurationMs"));
		data.setRuleId(_ctx.longValue("ModifyDegradeRuleResponse.Data.RuleId"));
		data.setStrategy(_ctx.integerValue("ModifyDegradeRuleResponse.Data.Strategy"));
		data.setResource(_ctx.stringValue("ModifyDegradeRuleResponse.Data.Resource"));
		data.setAppName(_ctx.stringValue("ModifyDegradeRuleResponse.Data.AppName"));
		data.setHalfOpenBaseAmountPerStep(_ctx.integerValue("ModifyDegradeRuleResponse.Data.HalfOpenBaseAmountPerStep"));
		data.setRecoveryTimeoutMs(_ctx.integerValue("ModifyDegradeRuleResponse.Data.RecoveryTimeoutMs"));
		data.setMinRequestAmount(_ctx.integerValue("ModifyDegradeRuleResponse.Data.MinRequestAmount"));
		data.setThreshold(_ctx.floatValue("ModifyDegradeRuleResponse.Data.Threshold"));
		data.setEnable(_ctx.booleanValue("ModifyDegradeRuleResponse.Data.Enable"));
		modifyDegradeRuleResponse.setData(data);
	 
	 	return modifyDegradeRuleResponse;
	}
}