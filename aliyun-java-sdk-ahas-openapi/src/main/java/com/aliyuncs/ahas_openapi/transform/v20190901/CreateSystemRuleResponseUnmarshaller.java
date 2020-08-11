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

import com.aliyuncs.ahas_openapi.model.v20190901.CreateSystemRuleResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.CreateSystemRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSystemRuleResponseUnmarshaller {

	public static CreateSystemRuleResponse unmarshall(CreateSystemRuleResponse createSystemRuleResponse, UnmarshallerContext _ctx) {
		
		createSystemRuleResponse.setRequestId(_ctx.stringValue("CreateSystemRuleResponse.RequestId"));
		createSystemRuleResponse.setCode(_ctx.stringValue("CreateSystemRuleResponse.Code"));
		createSystemRuleResponse.setMessage(_ctx.stringValue("CreateSystemRuleResponse.Message"));
		createSystemRuleResponse.setSuccess(_ctx.booleanValue("CreateSystemRuleResponse.Success"));

		Data data = new Data();
		data.setThreshold(_ctx.floatValue("CreateSystemRuleResponse.Data.Threshold"));
		data.setEnable(_ctx.booleanValue("CreateSystemRuleResponse.Data.Enable"));
		data.setMetricType(_ctx.integerValue("CreateSystemRuleResponse.Data.MetricType"));
		data.setRuleId(_ctx.longValue("CreateSystemRuleResponse.Data.RuleId"));
		createSystemRuleResponse.setData(data);
	 
	 	return createSystemRuleResponse;
	}
}