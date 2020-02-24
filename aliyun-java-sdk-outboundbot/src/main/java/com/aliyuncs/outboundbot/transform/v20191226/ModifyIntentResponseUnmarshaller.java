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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.ModifyIntentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyIntentResponseUnmarshaller {

	public static ModifyIntentResponse unmarshall(ModifyIntentResponse modifyIntentResponse, UnmarshallerContext _ctx) {
		
		modifyIntentResponse.setRequestId(_ctx.stringValue("ModifyIntentResponse.RequestId"));
		modifyIntentResponse.setSuccess(_ctx.booleanValue("ModifyIntentResponse.Success"));
		modifyIntentResponse.setCode(_ctx.stringValue("ModifyIntentResponse.Code"));
		modifyIntentResponse.setMessage(_ctx.stringValue("ModifyIntentResponse.Message"));
		modifyIntentResponse.setHttpStatusCode(_ctx.integerValue("ModifyIntentResponse.HttpStatusCode"));
		modifyIntentResponse.setIntentId(_ctx.stringValue("ModifyIntentResponse.IntentId"));
	 
	 	return modifyIntentResponse;
	}
}