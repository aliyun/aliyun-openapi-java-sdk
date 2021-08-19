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

import com.aliyuncs.outboundbot.model.v20191226.GetCurrentConcurrencyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCurrentConcurrencyResponseUnmarshaller {

	public static GetCurrentConcurrencyResponse unmarshall(GetCurrentConcurrencyResponse getCurrentConcurrencyResponse, UnmarshallerContext _ctx) {
		
		getCurrentConcurrencyResponse.setRequestId(_ctx.stringValue("GetCurrentConcurrencyResponse.RequestId"));
		getCurrentConcurrencyResponse.setSuccess(_ctx.booleanValue("GetCurrentConcurrencyResponse.Success"));
		getCurrentConcurrencyResponse.setCode(_ctx.stringValue("GetCurrentConcurrencyResponse.Code"));
		getCurrentConcurrencyResponse.setMessage(_ctx.stringValue("GetCurrentConcurrencyResponse.Message"));
		getCurrentConcurrencyResponse.setHttpStatusCode(_ctx.integerValue("GetCurrentConcurrencyResponse.HttpStatusCode"));
		getCurrentConcurrencyResponse.setMaxConcurrentConversation(_ctx.integerValue("GetCurrentConcurrencyResponse.MaxConcurrentConversation"));
		getCurrentConcurrencyResponse.setCurrentConcurrency(_ctx.integerValue("GetCurrentConcurrencyResponse.CurrentConcurrency"));
		getCurrentConcurrencyResponse.setInstanceId(_ctx.stringValue("GetCurrentConcurrencyResponse.InstanceId"));
	 
	 	return getCurrentConcurrencyResponse;
	}
}