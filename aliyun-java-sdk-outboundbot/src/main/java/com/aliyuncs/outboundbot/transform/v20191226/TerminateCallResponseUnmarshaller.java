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

import com.aliyuncs.outboundbot.model.v20191226.TerminateCallResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TerminateCallResponseUnmarshaller {

	public static TerminateCallResponse unmarshall(TerminateCallResponse terminateCallResponse, UnmarshallerContext _ctx) {
		
		terminateCallResponse.setRequestId(_ctx.stringValue("TerminateCallResponse.RequestId"));
		terminateCallResponse.setSuccess(_ctx.booleanValue("TerminateCallResponse.Success"));
		terminateCallResponse.setCode(_ctx.stringValue("TerminateCallResponse.Code"));
		terminateCallResponse.setMessage(_ctx.stringValue("TerminateCallResponse.Message"));
		terminateCallResponse.setHttpStatusCode(_ctx.integerValue("TerminateCallResponse.HttpStatusCode"));
	 
	 	return terminateCallResponse;
	}
}