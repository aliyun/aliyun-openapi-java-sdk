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

import com.aliyuncs.eventbridge.model.v20200401.DisableRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableRuleResponseUnmarshaller {

	public static DisableRuleResponse unmarshall(DisableRuleResponse disableRuleResponse, UnmarshallerContext _ctx) {
		
		disableRuleResponse.setRequestId(_ctx.stringValue("DisableRuleResponse.RequestId"));
		disableRuleResponse.setMessage(_ctx.stringValue("DisableRuleResponse.Message"));
		disableRuleResponse.setData(_ctx.booleanValue("DisableRuleResponse.Data"));
		disableRuleResponse.setCode(_ctx.stringValue("DisableRuleResponse.Code"));
		disableRuleResponse.setSuccess(_ctx.booleanValue("DisableRuleResponse.Success"));
	 
	 	return disableRuleResponse;
	}
}