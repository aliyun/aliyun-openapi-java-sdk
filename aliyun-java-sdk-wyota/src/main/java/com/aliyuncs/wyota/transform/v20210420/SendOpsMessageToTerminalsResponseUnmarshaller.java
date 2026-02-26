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

package com.aliyuncs.wyota.transform.v20210420;

import com.aliyuncs.wyota.model.v20210420.SendOpsMessageToTerminalsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SendOpsMessageToTerminalsResponseUnmarshaller {

	public static SendOpsMessageToTerminalsResponse unmarshall(SendOpsMessageToTerminalsResponse sendOpsMessageToTerminalsResponse, UnmarshallerContext _ctx) {
		
		sendOpsMessageToTerminalsResponse.setRequestId(_ctx.stringValue("SendOpsMessageToTerminalsResponse.RequestId"));
		sendOpsMessageToTerminalsResponse.setSuccess(_ctx.booleanValue("SendOpsMessageToTerminalsResponse.Success"));
		sendOpsMessageToTerminalsResponse.setCode(_ctx.stringValue("SendOpsMessageToTerminalsResponse.Code"));
		sendOpsMessageToTerminalsResponse.setMessage(_ctx.stringValue("SendOpsMessageToTerminalsResponse.Message"));
		sendOpsMessageToTerminalsResponse.setHttpStatusCode(_ctx.integerValue("SendOpsMessageToTerminalsResponse.HttpStatusCode"));
	 
	 	return sendOpsMessageToTerminalsResponse;
	}
}