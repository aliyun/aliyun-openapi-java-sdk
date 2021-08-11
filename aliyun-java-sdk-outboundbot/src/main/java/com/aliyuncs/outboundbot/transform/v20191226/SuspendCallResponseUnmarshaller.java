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

import com.aliyuncs.outboundbot.model.v20191226.SuspendCallResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SuspendCallResponseUnmarshaller {

	public static SuspendCallResponse unmarshall(SuspendCallResponse suspendCallResponse, UnmarshallerContext _ctx) {
		
		suspendCallResponse.setRequestId(_ctx.stringValue("SuspendCallResponse.RequestId"));
		suspendCallResponse.setSuccess(_ctx.booleanValue("SuspendCallResponse.Success"));
		suspendCallResponse.setCode(_ctx.stringValue("SuspendCallResponse.Code"));
		suspendCallResponse.setMessage(_ctx.stringValue("SuspendCallResponse.Message"));
		suspendCallResponse.setHttpStatusCode(_ctx.integerValue("SuspendCallResponse.HttpStatusCode"));
	 
	 	return suspendCallResponse;
	}
}