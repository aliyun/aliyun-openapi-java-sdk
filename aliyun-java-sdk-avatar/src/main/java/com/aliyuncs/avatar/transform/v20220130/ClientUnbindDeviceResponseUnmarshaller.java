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

package com.aliyuncs.avatar.transform.v20220130;

import com.aliyuncs.avatar.model.v20220130.ClientUnbindDeviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ClientUnbindDeviceResponseUnmarshaller {

	public static ClientUnbindDeviceResponse unmarshall(ClientUnbindDeviceResponse clientUnbindDeviceResponse, UnmarshallerContext _ctx) {
		
		clientUnbindDeviceResponse.setRequestId(_ctx.stringValue("ClientUnbindDeviceResponse.RequestId"));
		clientUnbindDeviceResponse.setSuccess(_ctx.booleanValue("ClientUnbindDeviceResponse.Success"));
		clientUnbindDeviceResponse.setCode(_ctx.stringValue("ClientUnbindDeviceResponse.Code"));
		clientUnbindDeviceResponse.setMessage(_ctx.stringValue("ClientUnbindDeviceResponse.Message"));
	 
	 	return clientUnbindDeviceResponse;
	}
}