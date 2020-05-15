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

import com.aliyuncs.aliyuncvc.model.v20191030.ActiveDeviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ActiveDeviceResponseUnmarshaller {

	public static ActiveDeviceResponse unmarshall(ActiveDeviceResponse activeDeviceResponse, UnmarshallerContext _ctx) {
		
		activeDeviceResponse.setRequestId(_ctx.stringValue("ActiveDeviceResponse.RequestId"));
		activeDeviceResponse.setErrorCode(_ctx.integerValue("ActiveDeviceResponse.ErrorCode"));
		activeDeviceResponse.setMessage(_ctx.stringValue("ActiveDeviceResponse.Message"));
		activeDeviceResponse.setSuccess(_ctx.booleanValue("ActiveDeviceResponse.Success"));
		activeDeviceResponse.setToken(_ctx.stringValue("ActiveDeviceResponse.Token"));
	 
	 	return activeDeviceResponse;
	}
}