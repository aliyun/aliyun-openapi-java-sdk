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

import com.aliyuncs.outboundbot.model.v20191226.ModifyOutboundCallNumberResponse;
import com.aliyuncs.outboundbot.model.v20191226.ModifyOutboundCallNumberResponse.OutboundCallNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyOutboundCallNumberResponseUnmarshaller {

	public static ModifyOutboundCallNumberResponse unmarshall(ModifyOutboundCallNumberResponse modifyOutboundCallNumberResponse, UnmarshallerContext _ctx) {
		
		modifyOutboundCallNumberResponse.setRequestId(_ctx.stringValue("ModifyOutboundCallNumberResponse.RequestId"));
		modifyOutboundCallNumberResponse.setSuccess(_ctx.booleanValue("ModifyOutboundCallNumberResponse.Success"));
		modifyOutboundCallNumberResponse.setCode(_ctx.stringValue("ModifyOutboundCallNumberResponse.Code"));
		modifyOutboundCallNumberResponse.setMessage(_ctx.stringValue("ModifyOutboundCallNumberResponse.Message"));
		modifyOutboundCallNumberResponse.setHttpStatusCode(_ctx.integerValue("ModifyOutboundCallNumberResponse.HttpStatusCode"));

		OutboundCallNumber outboundCallNumber = new OutboundCallNumber();
		outboundCallNumber.setOutboundCallNumberId(_ctx.stringValue("ModifyOutboundCallNumberResponse.OutboundCallNumber.OutboundCallNumberId"));
		outboundCallNumber.setNumber(_ctx.stringValue("ModifyOutboundCallNumberResponse.OutboundCallNumber.Number"));
		outboundCallNumber.setRateLimitPeriod(_ctx.stringValue("ModifyOutboundCallNumberResponse.OutboundCallNumber.RateLimitPeriod"));
		outboundCallNumber.setRateLimitCount(_ctx.stringValue("ModifyOutboundCallNumberResponse.OutboundCallNumber.RateLimitCount"));
		modifyOutboundCallNumberResponse.setOutboundCallNumber(outboundCallNumber);
	 
	 	return modifyOutboundCallNumberResponse;
	}
}