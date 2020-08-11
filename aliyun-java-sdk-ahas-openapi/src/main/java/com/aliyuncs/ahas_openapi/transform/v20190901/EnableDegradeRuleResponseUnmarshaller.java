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

import com.aliyuncs.ahas_openapi.model.v20190901.EnableDegradeRuleResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.EnableDegradeRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableDegradeRuleResponseUnmarshaller {

	public static EnableDegradeRuleResponse unmarshall(EnableDegradeRuleResponse enableDegradeRuleResponse, UnmarshallerContext _ctx) {
		
		enableDegradeRuleResponse.setRequestId(_ctx.stringValue("EnableDegradeRuleResponse.RequestId"));
		enableDegradeRuleResponse.setCode(_ctx.stringValue("EnableDegradeRuleResponse.Code"));
		enableDegradeRuleResponse.setMessage(_ctx.stringValue("EnableDegradeRuleResponse.Message"));
		enableDegradeRuleResponse.setSuccess(_ctx.booleanValue("EnableDegradeRuleResponse.Success"));

		Data data = new Data();
		data.setAppName(_ctx.stringValue("EnableDegradeRuleResponse.Data.AppName"));
		data.setEnable(_ctx.booleanValue("EnableDegradeRuleResponse.Data.Enable"));
		data.setHalfOpenBaseAmountPerStep(_ctx.integerValue("EnableDegradeRuleResponse.Data.HalfOpenBaseAmountPerStep"));
		data.setHalfOpenRecoveryStepNum(_ctx.integerValue("EnableDegradeRuleResponse.Data.HalfOpenRecoveryStepNum"));
		data.setMinRequestAmount(_ctx.integerValue("EnableDegradeRuleResponse.Data.MinRequestAmount"));
		data.setNamespace(_ctx.stringValue("EnableDegradeRuleResponse.Data.Namespace"));
		data.setRecoveryTimeoutMs(_ctx.integerValue("EnableDegradeRuleResponse.Data.RecoveryTimeoutMs"));
		data.setResource(_ctx.stringValue("EnableDegradeRuleResponse.Data.Resource"));
		data.setRuleId(_ctx.longValue("EnableDegradeRuleResponse.Data.RuleId"));
		data.setSlowRtMs(_ctx.integerValue("EnableDegradeRuleResponse.Data.SlowRtMs"));
		data.setStatDurationMs(_ctx.integerValue("EnableDegradeRuleResponse.Data.StatDurationMs"));
		data.setStrategy(_ctx.integerValue("EnableDegradeRuleResponse.Data.Strategy"));
		data.setThreshold(_ctx.floatValue("EnableDegradeRuleResponse.Data.Threshold"));
		enableDegradeRuleResponse.setData(data);
	 
	 	return enableDegradeRuleResponse;
	}
}