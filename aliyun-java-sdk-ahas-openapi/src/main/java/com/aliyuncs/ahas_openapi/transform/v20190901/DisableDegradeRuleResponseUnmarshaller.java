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

import com.aliyuncs.ahas_openapi.model.v20190901.DisableDegradeRuleResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.DisableDegradeRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableDegradeRuleResponseUnmarshaller {

	public static DisableDegradeRuleResponse unmarshall(DisableDegradeRuleResponse disableDegradeRuleResponse, UnmarshallerContext _ctx) {
		
		disableDegradeRuleResponse.setRequestId(_ctx.stringValue("DisableDegradeRuleResponse.RequestId"));
		disableDegradeRuleResponse.setMessage(_ctx.stringValue("DisableDegradeRuleResponse.Message"));
		disableDegradeRuleResponse.setCode(_ctx.stringValue("DisableDegradeRuleResponse.Code"));
		disableDegradeRuleResponse.setSuccess(_ctx.booleanValue("DisableDegradeRuleResponse.Success"));

		Data data = new Data();
		data.setSlowRtMs(_ctx.integerValue("DisableDegradeRuleResponse.Data.SlowRtMs"));
		data.setHalfOpenRecoveryStepNum(_ctx.integerValue("DisableDegradeRuleResponse.Data.HalfOpenRecoveryStepNum"));
		data.setNamespace(_ctx.stringValue("DisableDegradeRuleResponse.Data.Namespace"));
		data.setStatDurationMs(_ctx.integerValue("DisableDegradeRuleResponse.Data.StatDurationMs"));
		data.setRuleId(_ctx.longValue("DisableDegradeRuleResponse.Data.RuleId"));
		data.setStrategy(_ctx.integerValue("DisableDegradeRuleResponse.Data.Strategy"));
		data.setResource(_ctx.stringValue("DisableDegradeRuleResponse.Data.Resource"));
		data.setAppName(_ctx.stringValue("DisableDegradeRuleResponse.Data.AppName"));
		data.setHalfOpenBaseAmountPerStep(_ctx.integerValue("DisableDegradeRuleResponse.Data.HalfOpenBaseAmountPerStep"));
		data.setRecoveryTimeoutMs(_ctx.integerValue("DisableDegradeRuleResponse.Data.RecoveryTimeoutMs"));
		data.setMinRequestAmount(_ctx.integerValue("DisableDegradeRuleResponse.Data.MinRequestAmount"));
		data.setThreshold(_ctx.floatValue("DisableDegradeRuleResponse.Data.Threshold"));
		data.setEnable(_ctx.booleanValue("DisableDegradeRuleResponse.Data.Enable"));
		disableDegradeRuleResponse.setData(data);
	 
	 	return disableDegradeRuleResponse;
	}
}