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

import com.aliyuncs.outboundbot.model.v20191226.ModifyBeebotIntentLgfResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyBeebotIntentLgfResponseUnmarshaller {

	public static ModifyBeebotIntentLgfResponse unmarshall(ModifyBeebotIntentLgfResponse modifyBeebotIntentLgfResponse, UnmarshallerContext _ctx) {
		
		modifyBeebotIntentLgfResponse.setRequestId(_ctx.stringValue("ModifyBeebotIntentLgfResponse.RequestId"));
		modifyBeebotIntentLgfResponse.setHttpStatusCode(_ctx.integerValue("ModifyBeebotIntentLgfResponse.HttpStatusCode"));
		modifyBeebotIntentLgfResponse.setLgfId(_ctx.longValue("ModifyBeebotIntentLgfResponse.LgfId"));
		modifyBeebotIntentLgfResponse.setSuccess(_ctx.booleanValue("ModifyBeebotIntentLgfResponse.Success"));
		modifyBeebotIntentLgfResponse.setBeebotRequestId(_ctx.stringValue("ModifyBeebotIntentLgfResponse.BeebotRequestId"));
		modifyBeebotIntentLgfResponse.setCode(_ctx.stringValue("ModifyBeebotIntentLgfResponse.Code"));
		modifyBeebotIntentLgfResponse.setMessage(_ctx.stringValue("ModifyBeebotIntentLgfResponse.Message"));
	 
	 	return modifyBeebotIntentLgfResponse;
	}
}