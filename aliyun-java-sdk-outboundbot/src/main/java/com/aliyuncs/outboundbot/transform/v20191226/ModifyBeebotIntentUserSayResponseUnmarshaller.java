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

import com.aliyuncs.outboundbot.model.v20191226.ModifyBeebotIntentUserSayResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyBeebotIntentUserSayResponseUnmarshaller {

	public static ModifyBeebotIntentUserSayResponse unmarshall(ModifyBeebotIntentUserSayResponse modifyBeebotIntentUserSayResponse, UnmarshallerContext _ctx) {
		
		modifyBeebotIntentUserSayResponse.setRequestId(_ctx.stringValue("ModifyBeebotIntentUserSayResponse.RequestId"));
		modifyBeebotIntentUserSayResponse.setHttpStatusCode(_ctx.integerValue("ModifyBeebotIntentUserSayResponse.HttpStatusCode"));
		modifyBeebotIntentUserSayResponse.setUserSayId(_ctx.longValue("ModifyBeebotIntentUserSayResponse.UserSayId"));
		modifyBeebotIntentUserSayResponse.setSuccess(_ctx.booleanValue("ModifyBeebotIntentUserSayResponse.Success"));
		modifyBeebotIntentUserSayResponse.setBeebotRequestId(_ctx.stringValue("ModifyBeebotIntentUserSayResponse.BeebotRequestId"));
		modifyBeebotIntentUserSayResponse.setCode(_ctx.stringValue("ModifyBeebotIntentUserSayResponse.Code"));
		modifyBeebotIntentUserSayResponse.setMessage(_ctx.stringValue("ModifyBeebotIntentUserSayResponse.Message"));
	 
	 	return modifyBeebotIntentUserSayResponse;
	}
}