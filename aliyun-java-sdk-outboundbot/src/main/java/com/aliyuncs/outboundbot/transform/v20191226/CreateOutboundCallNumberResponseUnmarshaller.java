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

import com.aliyuncs.outboundbot.model.v20191226.CreateOutboundCallNumberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOutboundCallNumberResponseUnmarshaller {

	public static CreateOutboundCallNumberResponse unmarshall(CreateOutboundCallNumberResponse createOutboundCallNumberResponse, UnmarshallerContext _ctx) {
		
		createOutboundCallNumberResponse.setRequestId(_ctx.stringValue("CreateOutboundCallNumberResponse.RequestId"));
		createOutboundCallNumberResponse.setSuccess(_ctx.booleanValue("CreateOutboundCallNumberResponse.Success"));
		createOutboundCallNumberResponse.setCode(_ctx.stringValue("CreateOutboundCallNumberResponse.Code"));
		createOutboundCallNumberResponse.setMessage(_ctx.stringValue("CreateOutboundCallNumberResponse.Message"));
		createOutboundCallNumberResponse.setHttpStatusCode(_ctx.integerValue("CreateOutboundCallNumberResponse.HttpStatusCode"));
		createOutboundCallNumberResponse.setOutboundCallNumberId(_ctx.stringValue("CreateOutboundCallNumberResponse.OutboundCallNumberId"));
	 
	 	return createOutboundCallNumberResponse;
	}
}