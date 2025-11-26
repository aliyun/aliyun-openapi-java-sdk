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

import com.aliyuncs.outboundbot.model.v20191226.CreateBeebotIntentLgfResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBeebotIntentLgfResponseUnmarshaller {

	public static CreateBeebotIntentLgfResponse unmarshall(CreateBeebotIntentLgfResponse createBeebotIntentLgfResponse, UnmarshallerContext _ctx) {
		
		createBeebotIntentLgfResponse.setRequestId(_ctx.stringValue("CreateBeebotIntentLgfResponse.RequestId"));
		createBeebotIntentLgfResponse.setHttpStatusCode(_ctx.integerValue("CreateBeebotIntentLgfResponse.HttpStatusCode"));
		createBeebotIntentLgfResponse.setLgfId(_ctx.longValue("CreateBeebotIntentLgfResponse.LgfId"));
		createBeebotIntentLgfResponse.setSuccess(_ctx.booleanValue("CreateBeebotIntentLgfResponse.Success"));
		createBeebotIntentLgfResponse.setBeebotRequestId(_ctx.stringValue("CreateBeebotIntentLgfResponse.BeebotRequestId"));
		createBeebotIntentLgfResponse.setCode(_ctx.stringValue("CreateBeebotIntentLgfResponse.Code"));
		createBeebotIntentLgfResponse.setMessage(_ctx.stringValue("CreateBeebotIntentLgfResponse.Message"));
	 
	 	return createBeebotIntentLgfResponse;
	}
}