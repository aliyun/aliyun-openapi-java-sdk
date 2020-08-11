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

import com.aliyuncs.ahas_openapi.model.v20190901.DisableIsolationRuleResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.DisableIsolationRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableIsolationRuleResponseUnmarshaller {

	public static DisableIsolationRuleResponse unmarshall(DisableIsolationRuleResponse disableIsolationRuleResponse, UnmarshallerContext _ctx) {
		
		disableIsolationRuleResponse.setRequestId(_ctx.stringValue("DisableIsolationRuleResponse.RequestId"));
		disableIsolationRuleResponse.setCode(_ctx.stringValue("DisableIsolationRuleResponse.Code"));
		disableIsolationRuleResponse.setMessage(_ctx.stringValue("DisableIsolationRuleResponse.Message"));
		disableIsolationRuleResponse.setSuccess(_ctx.booleanValue("DisableIsolationRuleResponse.Success"));

		Data data = new Data();
		data.setAppName(_ctx.stringValue("DisableIsolationRuleResponse.Data.AppName"));
		data.setThreshold(_ctx.floatValue("DisableIsolationRuleResponse.Data.Threshold"));
		data.setEnable(_ctx.booleanValue("DisableIsolationRuleResponse.Data.Enable"));
		data.setLimitOrigin(_ctx.stringValue("DisableIsolationRuleResponse.Data.LimitOrigin"));
		data.setNamespace(_ctx.stringValue("DisableIsolationRuleResponse.Data.Namespace"));
		data.setRefResource(_ctx.stringValue("DisableIsolationRuleResponse.Data.RefResource"));
		data.setRelationStrategy(_ctx.integerValue("DisableIsolationRuleResponse.Data.RelationStrategy"));
		data.setResource(_ctx.stringValue("DisableIsolationRuleResponse.Data.Resource"));
		data.setRuleId(_ctx.longValue("DisableIsolationRuleResponse.Data.RuleId"));
		disableIsolationRuleResponse.setData(data);
	 
	 	return disableIsolationRuleResponse;
	}
}