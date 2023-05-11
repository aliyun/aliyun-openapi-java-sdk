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

import com.aliyuncs.iot.model.v20180120.GetDeviceTunnelShareStatusResponse;
import com.aliyuncs.iot.model.v20180120.GetDeviceTunnelShareStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeviceTunnelShareStatusResponseUnmarshaller {

	public static GetDeviceTunnelShareStatusResponse unmarshall(GetDeviceTunnelShareStatusResponse getDeviceTunnelShareStatusResponse, UnmarshallerContext _ctx) {
		
		getDeviceTunnelShareStatusResponse.setRequestId(_ctx.stringValue("GetDeviceTunnelShareStatusResponse.RequestId"));
		getDeviceTunnelShareStatusResponse.setSuccess(_ctx.booleanValue("GetDeviceTunnelShareStatusResponse.Success"));
		getDeviceTunnelShareStatusResponse.setErrorMessage(_ctx.stringValue("GetDeviceTunnelShareStatusResponse.ErrorMessage"));
		getDeviceTunnelShareStatusResponse.setCode(_ctx.stringValue("GetDeviceTunnelShareStatusResponse.Code"));

		Data data = new Data();
		data.setShareId(_ctx.stringValue("GetDeviceTunnelShareStatusResponse.Data.ShareId"));
		data.setPassword(_ctx.stringValue("GetDeviceTunnelShareStatusResponse.Data.Password"));
		data.setIsOpen(_ctx.booleanValue("GetDeviceTunnelShareStatusResponse.Data.IsOpen"));
		data.setGmtOpened(_ctx.longValue("GetDeviceTunnelShareStatusResponse.Data.GmtOpened"));
		getDeviceTunnelShareStatusResponse.setData(data);
	 
	 	return getDeviceTunnelShareStatusResponse;
	}
}