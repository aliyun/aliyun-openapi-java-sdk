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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.ModifyLosslessRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyLosslessRuleResponseUnmarshaller {

	public static ModifyLosslessRuleResponse unmarshall(ModifyLosslessRuleResponse modifyLosslessRuleResponse, UnmarshallerContext _ctx) {
		
		modifyLosslessRuleResponse.setRequestId(_ctx.stringValue("ModifyLosslessRuleResponse.RequestId"));
		modifyLosslessRuleResponse.setErrorCode(_ctx.stringValue("ModifyLosslessRuleResponse.ErrorCode"));
		modifyLosslessRuleResponse.setHttpCode(_ctx.stringValue("ModifyLosslessRuleResponse.HttpCode"));
		modifyLosslessRuleResponse.setMessage(_ctx.stringValue("ModifyLosslessRuleResponse.Message"));
		modifyLosslessRuleResponse.setSuccess(_ctx.booleanValue("ModifyLosslessRuleResponse.Success"));
	 
	 	return modifyLosslessRuleResponse;
	}
}