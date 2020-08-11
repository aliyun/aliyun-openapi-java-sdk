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

import com.aliyuncs.ahas_openapi.model.v20190901.CreateDegradeRuleResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.CreateDegradeRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDegradeRuleResponseUnmarshaller {

	public static CreateDegradeRuleResponse unmarshall(CreateDegradeRuleResponse createDegradeRuleResponse, UnmarshallerContext _ctx) {
		
		createDegradeRuleResponse.setRequestId(_ctx.stringValue("CreateDegradeRuleResponse.RequestId"));
		createDegradeRuleResponse.setCode(_ctx.stringValue("CreateDegradeRuleResponse.Code"));
		createDegradeRuleResponse.setMessage(_ctx.stringValue("CreateDegradeRuleResponse.Message"));
		createDegradeRuleResponse.setSuccess(_ctx.booleanValue("CreateDegradeRuleResponse.Success"));

		Data data = new Data();
		data.setAppName(_ctx.stringValue("CreateDegradeRuleResponse.Data.AppName"));
		data.setEnable(_ctx.booleanValue("CreateDegradeRuleResponse.Data.Enable"));
		data.setHalfOpenBaseAmountPerStep(_ctx.integerValue("CreateDegradeRuleResponse.Data.HalfOpenBaseAmountPerStep"));
		data.setHalfOpenRecoveryStepNum(_ctx.integerValue("CreateDegradeRuleResponse.Data.HalfOpenRecoveryStepNum"));
		data.setMinRequestAmount(_ctx.integerValue("CreateDegradeRuleResponse.Data.MinRequestAmount"));
		data.setNamespace(_ctx.stringValue("CreateDegradeRuleResponse.Data.Namespace"));
		data.setRecoveryTimeoutMs(_ctx.integerValue("CreateDegradeRuleResponse.Data.RecoveryTimeoutMs"));
		data.setResource(_ctx.stringValue("CreateDegradeRuleResponse.Data.Resource"));
		data.setRuleId(_ctx.longValue("CreateDegradeRuleResponse.Data.RuleId"));
		data.setSlowRtMs(_ctx.integerValue("CreateDegradeRuleResponse.Data.SlowRtMs"));
		data.setStatDurationMs(_ctx.integerValue("CreateDegradeRuleResponse.Data.StatDurationMs"));
		data.setStrategy(_ctx.integerValue("CreateDegradeRuleResponse.Data.Strategy"));
		data.setThreshold(_ctx.floatValue("CreateDegradeRuleResponse.Data.Threshold"));
		createDegradeRuleResponse.setData(data);
	 
	 	return createDegradeRuleResponse;
	}
}