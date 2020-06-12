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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.CreateSceneRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSceneRuleResponseUnmarshaller {

	public static CreateSceneRuleResponse unmarshall(CreateSceneRuleResponse createSceneRuleResponse, UnmarshallerContext _ctx) {
		
		createSceneRuleResponse.setRequestId(_ctx.stringValue("CreateSceneRuleResponse.RequestId"));
		createSceneRuleResponse.setSuccess(_ctx.booleanValue("CreateSceneRuleResponse.Success"));
		createSceneRuleResponse.setCode(_ctx.stringValue("CreateSceneRuleResponse.Code"));
		createSceneRuleResponse.setErrorMessage(_ctx.stringValue("CreateSceneRuleResponse.ErrorMessage"));
		createSceneRuleResponse.setRuleId(_ctx.stringValue("CreateSceneRuleResponse.RuleId"));
	 
	 	return createSceneRuleResponse;
	}
}