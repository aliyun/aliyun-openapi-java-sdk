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

import com.aliyuncs.mse.model.v20190531.UpdateCircuitBreakerRuleResponse;
import com.aliyuncs.mse.model.v20190531.UpdateCircuitBreakerRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateCircuitBreakerRuleResponseUnmarshaller {

	public static UpdateCircuitBreakerRuleResponse unmarshall(UpdateCircuitBreakerRuleResponse updateCircuitBreakerRuleResponse, UnmarshallerContext _ctx) {
		
		updateCircuitBreakerRuleResponse.setRequestId(_ctx.stringValue("UpdateCircuitBreakerRuleResponse.RequestId"));
		updateCircuitBreakerRuleResponse.setMessage(_ctx.stringValue("UpdateCircuitBreakerRuleResponse.Message"));
		updateCircuitBreakerRuleResponse.setCode(_ctx.stringValue("UpdateCircuitBreakerRuleResponse.Code"));
		updateCircuitBreakerRuleResponse.setSuccess(_ctx.booleanValue("UpdateCircuitBreakerRuleResponse.Success"));

		Data data = new Data();
		data.setNamespace(_ctx.stringValue("UpdateCircuitBreakerRuleResponse.Data.Namespace"));
		data.setId(_ctx.longValue("UpdateCircuitBreakerRuleResponse.Data.Id"));
		data.setAppName(_ctx.stringValue("UpdateCircuitBreakerRuleResponse.Data.AppName"));
		data.setResource(_ctx.stringValue("UpdateCircuitBreakerRuleResponse.Data.Resource"));
		data.setStrategy(_ctx.integerValue("UpdateCircuitBreakerRuleResponse.Data.Strategy"));
		data.setThreshold(_ctx.floatValue("UpdateCircuitBreakerRuleResponse.Data.Threshold"));
		data.setEnable(_ctx.booleanValue("UpdateCircuitBreakerRuleResponse.Data.Enable"));
		data.setRetryTimeoutMs(_ctx.integerValue("UpdateCircuitBreakerRuleResponse.Data.RetryTimeoutMs"));
		data.setStatIntervalMs(_ctx.integerValue("UpdateCircuitBreakerRuleResponse.Data.StatIntervalMs"));
		data.setAppId(_ctx.stringValue("UpdateCircuitBreakerRuleResponse.Data.AppId"));
		data.setMaxAllowedRtMs(_ctx.integerValue("UpdateCircuitBreakerRuleResponse.Data.MaxAllowedRtMs"));
		data.setMinRequestAmount(_ctx.integerValue("UpdateCircuitBreakerRuleResponse.Data.MinRequestAmount"));
		data.setHalfOpenBaseAmountPerStep(_ctx.integerValue("UpdateCircuitBreakerRuleResponse.Data.HalfOpenBaseAmountPerStep"));
		data.setHalfOpenRecoveryStepNum(_ctx.integerValue("UpdateCircuitBreakerRuleResponse.Data.HalfOpenRecoveryStepNum"));
		updateCircuitBreakerRuleResponse.setData(data);
	 
	 	return updateCircuitBreakerRuleResponse;
	}
}