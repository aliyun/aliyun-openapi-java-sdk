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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.DisableDeviceTunnelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableDeviceTunnelResponseUnmarshaller {

	public static DisableDeviceTunnelResponse unmarshall(DisableDeviceTunnelResponse disableDeviceTunnelResponse, UnmarshallerContext _ctx) {
		
		disableDeviceTunnelResponse.setRequestId(_ctx.stringValue("DisableDeviceTunnelResponse.RequestId"));
		disableDeviceTunnelResponse.setSuccess(_ctx.booleanValue("DisableDeviceTunnelResponse.Success"));
		disableDeviceTunnelResponse.setCode(_ctx.stringValue("DisableDeviceTunnelResponse.Code"));
		disableDeviceTunnelResponse.setErrorMessage(_ctx.stringValue("DisableDeviceTunnelResponse.ErrorMessage"));
	 
	 	return disableDeviceTunnelResponse;
	}
}