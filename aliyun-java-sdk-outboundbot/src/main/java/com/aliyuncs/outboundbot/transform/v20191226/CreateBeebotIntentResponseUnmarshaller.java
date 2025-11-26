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

import com.aliyuncs.outboundbot.model.v20191226.CreateBeebotIntentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBeebotIntentResponseUnmarshaller {

	public static CreateBeebotIntentResponse unmarshall(CreateBeebotIntentResponse createBeebotIntentResponse, UnmarshallerContext _ctx) {
		
		createBeebotIntentResponse.setRequestId(_ctx.stringValue("CreateBeebotIntentResponse.RequestId"));
		createBeebotIntentResponse.setHttpStatusCode(_ctx.integerValue("CreateBeebotIntentResponse.HttpStatusCode"));
		createBeebotIntentResponse.setSuccess(_ctx.booleanValue("CreateBeebotIntentResponse.Success"));
		createBeebotIntentResponse.setBeebotRequestId(_ctx.stringValue("CreateBeebotIntentResponse.BeebotRequestId"));
		createBeebotIntentResponse.setCode(_ctx.stringValue("CreateBeebotIntentResponse.Code"));
		createBeebotIntentResponse.setMessage(_ctx.stringValue("CreateBeebotIntentResponse.Message"));
		createBeebotIntentResponse.setIntentId(_ctx.longValue("CreateBeebotIntentResponse.IntentId"));
	 
	 	return createBeebotIntentResponse;
	}
}