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

import com.aliyuncs.ahas_openapi.model.v20190901.EnableIsolationRuleResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.EnableIsolationRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableIsolationRuleResponseUnmarshaller {

	public static EnableIsolationRuleResponse unmarshall(EnableIsolationRuleResponse enableIsolationRuleResponse, UnmarshallerContext _ctx) {
		
		enableIsolationRuleResponse.setRequestId(_ctx.stringValue("EnableIsolationRuleResponse.RequestId"));
		enableIsolationRuleResponse.setCode(_ctx.stringValue("EnableIsolationRuleResponse.Code"));
		enableIsolationRuleResponse.setMessage(_ctx.stringValue("EnableIsolationRuleResponse.Message"));
		enableIsolationRuleResponse.setSuccess(_ctx.booleanValue("EnableIsolationRuleResponse.Success"));

		Data data = new Data();
		data.setAppName(_ctx.stringValue("EnableIsolationRuleResponse.Data.AppName"));
		data.setThreshold(_ctx.floatValue("EnableIsolationRuleResponse.Data.Threshold"));
		data.setEnable(_ctx.booleanValue("EnableIsolationRuleResponse.Data.Enable"));
		data.setLimitOrigin(_ctx.stringValue("EnableIsolationRuleResponse.Data.LimitOrigin"));
		data.setNamespace(_ctx.stringValue("EnableIsolationRuleResponse.Data.Namespace"));
		data.setRefResource(_ctx.stringValue("EnableIsolationRuleResponse.Data.RefResource"));
		data.setRelationStrategy(_ctx.integerValue("EnableIsolationRuleResponse.Data.RelationStrategy"));
		data.setResource(_ctx.stringValue("EnableIsolationRuleResponse.Data.Resource"));
		data.setRuleId(_ctx.longValue("EnableIsolationRuleResponse.Data.RuleId"));
		enableIsolationRuleResponse.setData(data);
	 
	 	return enableIsolationRuleResponse;
	}
}