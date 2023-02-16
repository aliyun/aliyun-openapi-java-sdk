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

package com.aliyuncs.eventbridge.transform.v20200401;

import com.aliyuncs.eventbridge.model.v20200401.CreateRuleResponse;
import com.aliyuncs.eventbridge.model.v20200401.CreateRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRuleResponseUnmarshaller {

	public static CreateRuleResponse unmarshall(CreateRuleResponse createRuleResponse, UnmarshallerContext _ctx) {
		
		createRuleResponse.setRequestId(_ctx.stringValue("CreateRuleResponse.RequestId"));
		createRuleResponse.setMessage(_ctx.stringValue("CreateRuleResponse.Message"));
		createRuleResponse.setCode(_ctx.stringValue("CreateRuleResponse.Code"));
		createRuleResponse.setSuccess(_ctx.booleanValue("CreateRuleResponse.Success"));

		Data data = new Data();
		data.setRuleARN(_ctx.stringValue("CreateRuleResponse.Data.RuleARN"));
		createRuleResponse.setData(data);
	 
	 	return createRuleResponse;
	}
}