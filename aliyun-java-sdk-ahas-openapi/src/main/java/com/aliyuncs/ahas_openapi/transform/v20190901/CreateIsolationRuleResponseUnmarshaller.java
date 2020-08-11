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

import com.aliyuncs.ahas_openapi.model.v20190901.CreateIsolationRuleResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.CreateIsolationRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateIsolationRuleResponseUnmarshaller {

	public static CreateIsolationRuleResponse unmarshall(CreateIsolationRuleResponse createIsolationRuleResponse, UnmarshallerContext _ctx) {
		
		createIsolationRuleResponse.setRequestId(_ctx.stringValue("CreateIsolationRuleResponse.RequestId"));
		createIsolationRuleResponse.setCode(_ctx.stringValue("CreateIsolationRuleResponse.Code"));
		createIsolationRuleResponse.setMessage(_ctx.stringValue("CreateIsolationRuleResponse.Message"));
		createIsolationRuleResponse.setSuccess(_ctx.booleanValue("CreateIsolationRuleResponse.Success"));

		Data data = new Data();
		data.setAppName(_ctx.stringValue("CreateIsolationRuleResponse.Data.AppName"));
		data.setThreshold(_ctx.floatValue("CreateIsolationRuleResponse.Data.Threshold"));
		data.setEnable(_ctx.booleanValue("CreateIsolationRuleResponse.Data.Enable"));
		data.setLimitOrigin(_ctx.stringValue("CreateIsolationRuleResponse.Data.LimitOrigin"));
		data.setNamespace(_ctx.stringValue("CreateIsolationRuleResponse.Data.Namespace"));
		data.setRefResource(_ctx.stringValue("CreateIsolationRuleResponse.Data.RefResource"));
		data.setRelationStrategy(_ctx.integerValue("CreateIsolationRuleResponse.Data.RelationStrategy"));
		data.setResource(_ctx.stringValue("CreateIsolationRuleResponse.Data.Resource"));
		data.setRuleId(_ctx.longValue("CreateIsolationRuleResponse.Data.RuleId"));
		createIsolationRuleResponse.setData(data);
	 
	 	return createIsolationRuleResponse;
	}
}