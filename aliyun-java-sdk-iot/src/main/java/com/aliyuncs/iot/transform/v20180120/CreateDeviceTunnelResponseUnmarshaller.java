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

import com.aliyuncs.iot.model.v20180120.CreateDeviceTunnelResponse;
import com.aliyuncs.iot.model.v20180120.CreateDeviceTunnelResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDeviceTunnelResponseUnmarshaller {

	public static CreateDeviceTunnelResponse unmarshall(CreateDeviceTunnelResponse createDeviceTunnelResponse, UnmarshallerContext _ctx) {
		
		createDeviceTunnelResponse.setRequestId(_ctx.stringValue("CreateDeviceTunnelResponse.RequestId"));
		createDeviceTunnelResponse.setCode(_ctx.stringValue("CreateDeviceTunnelResponse.Code"));
		createDeviceTunnelResponse.setErrorMessage(_ctx.stringValue("CreateDeviceTunnelResponse.ErrorMessage"));
		createDeviceTunnelResponse.setSuccess(_ctx.booleanValue("CreateDeviceTunnelResponse.Success"));

		Data data = new Data();
		data.setTunnelId(_ctx.stringValue("CreateDeviceTunnelResponse.Data.TunnelId"));
		data.setSourceURI(_ctx.stringValue("CreateDeviceTunnelResponse.Data.SourceURI"));
		data.setSourceAccessToken(_ctx.stringValue("CreateDeviceTunnelResponse.Data.SourceAccessToken"));
		createDeviceTunnelResponse.setData(data);
	 
	 	return createDeviceTunnelResponse;
	}
}