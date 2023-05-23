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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.CreateCircuitBreakerRuleResponse;
import com.aliyuncs.mse.model.v20190531.CreateCircuitBreakerRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCircuitBreakerRuleResponseUnmarshaller {

	public static CreateCircuitBreakerRuleResponse unmarshall(CreateCircuitBreakerRuleResponse createCircuitBreakerRuleResponse, UnmarshallerContext _ctx) {
		
		createCircuitBreakerRuleResponse.setRequestId(_ctx.stringValue("CreateCircuitBreakerRuleResponse.RequestId"));
		createCircuitBreakerRuleResponse.setMessage(_ctx.stringValue("CreateCircuitBreakerRuleResponse.Message"));
		createCircuitBreakerRuleResponse.setCode(_ctx.stringValue("CreateCircuitBreakerRuleResponse.Code"));
		createCircuitBreakerRuleResponse.setSuccess(_ctx.booleanValue("CreateCircuitBreakerRuleResponse.Success"));

		Data data = new Data();
		data.setNamespace(_ctx.stringValue("CreateCircuitBreakerRuleResponse.Data.Namespace"));
		data.setId(_ctx.longValue("CreateCircuitBreakerRuleResponse.Data.Id"));
		data.setAppName(_ctx.stringValue("CreateCircuitBreakerRuleResponse.Data.AppName"));
		data.setResource(_ctx.stringValue("CreateCircuitBreakerRuleResponse.Data.Resource"));
		data.setStatIntervalMs(_ctx.integerValue("CreateCircuitBreakerRuleResponse.Data.StatIntervalMs"));
		data.setThreshold(_ctx.floatValue("CreateCircuitBreakerRuleResponse.Data.Threshold"));
		data.setEnable(_ctx.booleanValue("CreateCircuitBreakerRuleResponse.Data.Enable"));
		data.setStrategy(_ctx.integerValue("CreateCircuitBreakerRuleResponse.Data.Strategy"));
		data.setRetryTimeoutMs(_ctx.integerValue("CreateCircuitBreakerRuleResponse.Data.RetryTimeoutMs"));
		data.setAppId(_ctx.stringValue("CreateCircuitBreakerRuleResponse.Data.AppId"));
		data.setRegionId(_ctx.stringValue("CreateCircuitBreakerRuleResponse.Data.RegionId"));
		data.setMaxAllowedRtMs(_ctx.integerValue("CreateCircuitBreakerRuleResponse.Data.MaxAllowedRtMs"));
		data.setMinRequestAmount(_ctx.integerValue("CreateCircuitBreakerRuleResponse.Data.MinRequestAmount"));
		data.setHalfOpenBaseAmountPerStep(_ctx.integerValue("CreateCircuitBreakerRuleResponse.Data.HalfOpenBaseAmountPerStep"));
		data.setHalfOpenRecoveryStepNum(_ctx.integerValue("CreateCircuitBreakerRuleResponse.Data.HalfOpenRecoveryStepNum"));
		createCircuitBreakerRuleResponse.setData(data);
	 
	 	return createCircuitBreakerRuleResponse;
	}
}