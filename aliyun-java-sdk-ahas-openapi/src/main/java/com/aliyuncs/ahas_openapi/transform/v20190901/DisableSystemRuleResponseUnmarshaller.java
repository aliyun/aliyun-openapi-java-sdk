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

import com.aliyuncs.ahas_openapi.model.v20190901.DisableSystemRuleResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.DisableSystemRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableSystemRuleResponseUnmarshaller {

	public static DisableSystemRuleResponse unmarshall(DisableSystemRuleResponse disableSystemRuleResponse, UnmarshallerContext _ctx) {
		
		disableSystemRuleResponse.setRequestId(_ctx.stringValue("DisableSystemRuleResponse.RequestId"));
		disableSystemRuleResponse.setCode(_ctx.stringValue("DisableSystemRuleResponse.Code"));
		disableSystemRuleResponse.setMessage(_ctx.stringValue("DisableSystemRuleResponse.Message"));
		disableSystemRuleResponse.setSuccess(_ctx.booleanValue("DisableSystemRuleResponse.Success"));

		Data data = new Data();
		data.setThreshold(_ctx.floatValue("DisableSystemRuleResponse.Data.Threshold"));
		data.setEnable(_ctx.booleanValue("DisableSystemRuleResponse.Data.Enable"));
		data.setMetricType(_ctx.integerValue("DisableSystemRuleResponse.Data.MetricType"));
		data.setRuleId(_ctx.longValue("DisableSystemRuleResponse.Data.RuleId"));
		disableSystemRuleResponse.setData(data);
	 
	 	return disableSystemRuleResponse;
	}
}