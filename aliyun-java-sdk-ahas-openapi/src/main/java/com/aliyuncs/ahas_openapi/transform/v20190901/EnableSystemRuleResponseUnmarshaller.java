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

import com.aliyuncs.ahas_openapi.model.v20190901.EnableSystemRuleResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.EnableSystemRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableSystemRuleResponseUnmarshaller {

	public static EnableSystemRuleResponse unmarshall(EnableSystemRuleResponse enableSystemRuleResponse, UnmarshallerContext _ctx) {
		
		enableSystemRuleResponse.setRequestId(_ctx.stringValue("EnableSystemRuleResponse.RequestId"));
		enableSystemRuleResponse.setMessage(_ctx.stringValue("EnableSystemRuleResponse.Message"));
		enableSystemRuleResponse.setCode(_ctx.stringValue("EnableSystemRuleResponse.Code"));
		enableSystemRuleResponse.setSuccess(_ctx.booleanValue("EnableSystemRuleResponse.Success"));

		Data data = new Data();
		data.setMetricType(_ctx.integerValue("EnableSystemRuleResponse.Data.MetricType"));
		data.setThreshold(_ctx.floatValue("EnableSystemRuleResponse.Data.Threshold"));
		data.setRuleId(_ctx.longValue("EnableSystemRuleResponse.Data.RuleId"));
		data.setEnable(_ctx.booleanValue("EnableSystemRuleResponse.Data.Enable"));
		enableSystemRuleResponse.setData(data);
	 
	 	return enableSystemRuleResponse;
	}
}