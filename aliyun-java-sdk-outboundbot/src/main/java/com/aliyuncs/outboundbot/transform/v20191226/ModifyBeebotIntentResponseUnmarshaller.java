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

import com.aliyuncs.outboundbot.model.v20191226.ModifyBeebotIntentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyBeebotIntentResponseUnmarshaller {

	public static ModifyBeebotIntentResponse unmarshall(ModifyBeebotIntentResponse modifyBeebotIntentResponse, UnmarshallerContext _ctx) {
		
		modifyBeebotIntentResponse.setRequestId(_ctx.stringValue("ModifyBeebotIntentResponse.RequestId"));
		modifyBeebotIntentResponse.setHttpStatusCode(_ctx.integerValue("ModifyBeebotIntentResponse.HttpStatusCode"));
		modifyBeebotIntentResponse.setSuccess(_ctx.booleanValue("ModifyBeebotIntentResponse.Success"));
		modifyBeebotIntentResponse.setBeebotRequestId(_ctx.stringValue("ModifyBeebotIntentResponse.BeebotRequestId"));
		modifyBeebotIntentResponse.setCode(_ctx.stringValue("ModifyBeebotIntentResponse.Code"));
		modifyBeebotIntentResponse.setMessage(_ctx.stringValue("ModifyBeebotIntentResponse.Message"));
		modifyBeebotIntentResponse.setIntentId(_ctx.longValue("ModifyBeebotIntentResponse.IntentId"));
	 
	 	return modifyBeebotIntentResponse;
	}
}