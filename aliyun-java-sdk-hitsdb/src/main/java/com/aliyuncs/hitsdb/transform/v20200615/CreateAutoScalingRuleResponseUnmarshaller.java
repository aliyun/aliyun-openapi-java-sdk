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

package com.aliyuncs.hitsdb.transform.v20200615;

import com.aliyuncs.hitsdb.model.v20200615.CreateAutoScalingRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAutoScalingRuleResponseUnmarshaller {

	public static CreateAutoScalingRuleResponse unmarshall(CreateAutoScalingRuleResponse createAutoScalingRuleResponse, UnmarshallerContext _ctx) {
		
		createAutoScalingRuleResponse.setRequestId(_ctx.stringValue("CreateAutoScalingRuleResponse.RequestId"));
		createAutoScalingRuleResponse.setSuccess(_ctx.booleanValue("CreateAutoScalingRuleResponse.Success"));
		createAutoScalingRuleResponse.setCode(_ctx.stringValue("CreateAutoScalingRuleResponse.Code"));
		createAutoScalingRuleResponse.setMessage(_ctx.stringValue("CreateAutoScalingRuleResponse.Message"));
		createAutoScalingRuleResponse.setHttpStatusCode(_ctx.integerValue("CreateAutoScalingRuleResponse.HttpStatusCode"));
	 
	 	return createAutoScalingRuleResponse;
	}
}