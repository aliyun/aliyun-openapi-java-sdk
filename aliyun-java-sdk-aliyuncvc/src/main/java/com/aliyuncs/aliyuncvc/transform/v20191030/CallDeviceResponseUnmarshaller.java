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

package com.aliyuncs.aliyuncvc.transform.v20191030;

import com.aliyuncs.aliyuncvc.model.v20191030.CallDeviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CallDeviceResponseUnmarshaller {

	public static CallDeviceResponse unmarshall(CallDeviceResponse callDeviceResponse, UnmarshallerContext _ctx) {
		
		callDeviceResponse.setRequestId(_ctx.stringValue("CallDeviceResponse.RequestId"));
		callDeviceResponse.setErrorCode(_ctx.integerValue("CallDeviceResponse.ErrorCode"));
		callDeviceResponse.setMessage(_ctx.stringValue("CallDeviceResponse.Message"));
		callDeviceResponse.setSuccess(_ctx.booleanValue("CallDeviceResponse.Success"));
		callDeviceResponse.setMessageId(_ctx.stringValue("CallDeviceResponse.MessageId"));
	 
	 	return callDeviceResponse;
	}
}