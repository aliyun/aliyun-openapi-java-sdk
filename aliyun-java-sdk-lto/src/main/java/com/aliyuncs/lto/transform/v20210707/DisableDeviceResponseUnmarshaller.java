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

package com.aliyuncs.lto.transform.v20210707;

import com.aliyuncs.lto.model.v20210707.DisableDeviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableDeviceResponseUnmarshaller {

	public static DisableDeviceResponse unmarshall(DisableDeviceResponse disableDeviceResponse, UnmarshallerContext _ctx) {
		
		disableDeviceResponse.setRequestId(_ctx.stringValue("DisableDeviceResponse.RequestId"));
		disableDeviceResponse.setCode(_ctx.stringValue("DisableDeviceResponse.Code"));
		disableDeviceResponse.setHttpStatusCode(_ctx.integerValue("DisableDeviceResponse.HttpStatusCode"));
		disableDeviceResponse.setMessage(_ctx.stringValue("DisableDeviceResponse.Message"));
		disableDeviceResponse.setSuccess(_ctx.booleanValue("DisableDeviceResponse.Success"));
	 
	 	return disableDeviceResponse;
	}
}