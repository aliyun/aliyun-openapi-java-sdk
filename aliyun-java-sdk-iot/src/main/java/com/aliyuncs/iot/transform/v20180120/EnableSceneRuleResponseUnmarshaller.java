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

import com.aliyuncs.iot.model.v20180120.EnableSceneRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableSceneRuleResponseUnmarshaller {

	public static EnableSceneRuleResponse unmarshall(EnableSceneRuleResponse enableSceneRuleResponse, UnmarshallerContext _ctx) {
		
		enableSceneRuleResponse.setRequestId(_ctx.stringValue("EnableSceneRuleResponse.RequestId"));
		enableSceneRuleResponse.setSuccess(_ctx.booleanValue("EnableSceneRuleResponse.Success"));
		enableSceneRuleResponse.setErrorMessage(_ctx.stringValue("EnableSceneRuleResponse.ErrorMessage"));
		enableSceneRuleResponse.setCode(_ctx.stringValue("EnableSceneRuleResponse.Code"));
	 
	 	return enableSceneRuleResponse;
	}
}