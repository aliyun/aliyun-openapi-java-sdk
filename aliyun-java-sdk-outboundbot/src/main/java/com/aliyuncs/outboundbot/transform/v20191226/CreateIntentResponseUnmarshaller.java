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

import com.aliyuncs.outboundbot.model.v20191226.CreateIntentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateIntentResponseUnmarshaller {

	public static CreateIntentResponse unmarshall(CreateIntentResponse createIntentResponse, UnmarshallerContext _ctx) {
		
		createIntentResponse.setRequestId(_ctx.stringValue("CreateIntentResponse.RequestId"));
		createIntentResponse.setSuccess(_ctx.booleanValue("CreateIntentResponse.Success"));
		createIntentResponse.setCode(_ctx.stringValue("CreateIntentResponse.Code"));
		createIntentResponse.setMessage(_ctx.stringValue("CreateIntentResponse.Message"));
		createIntentResponse.setHttpStatusCode(_ctx.integerValue("CreateIntentResponse.HttpStatusCode"));
		createIntentResponse.setIntentId(_ctx.stringValue("CreateIntentResponse.IntentId"));
	 
	 	return createIntentResponse;
	}
}