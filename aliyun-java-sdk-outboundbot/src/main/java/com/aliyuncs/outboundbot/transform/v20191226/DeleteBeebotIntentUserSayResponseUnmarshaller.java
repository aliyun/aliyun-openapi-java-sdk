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

import com.aliyuncs.outboundbot.model.v20191226.DeleteBeebotIntentUserSayResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteBeebotIntentUserSayResponseUnmarshaller {

	public static DeleteBeebotIntentUserSayResponse unmarshall(DeleteBeebotIntentUserSayResponse deleteBeebotIntentUserSayResponse, UnmarshallerContext _ctx) {
		
		deleteBeebotIntentUserSayResponse.setRequestId(_ctx.stringValue("DeleteBeebotIntentUserSayResponse.RequestId"));
		deleteBeebotIntentUserSayResponse.setHttpStatusCode(_ctx.integerValue("DeleteBeebotIntentUserSayResponse.HttpStatusCode"));
		deleteBeebotIntentUserSayResponse.setUserSayId(_ctx.longValue("DeleteBeebotIntentUserSayResponse.UserSayId"));
		deleteBeebotIntentUserSayResponse.setSuccess(_ctx.booleanValue("DeleteBeebotIntentUserSayResponse.Success"));
		deleteBeebotIntentUserSayResponse.setBeebotRequestId(_ctx.stringValue("DeleteBeebotIntentUserSayResponse.BeebotRequestId"));
		deleteBeebotIntentUserSayResponse.setCode(_ctx.stringValue("DeleteBeebotIntentUserSayResponse.Code"));
		deleteBeebotIntentUserSayResponse.setMessage(_ctx.stringValue("DeleteBeebotIntentUserSayResponse.Message"));
	 
	 	return deleteBeebotIntentUserSayResponse;
	}
}