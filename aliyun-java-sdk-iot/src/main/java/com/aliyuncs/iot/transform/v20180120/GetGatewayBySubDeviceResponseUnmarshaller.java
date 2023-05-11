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

import com.aliyuncs.iot.model.v20180120.GetGatewayBySubDeviceResponse;
import com.aliyuncs.iot.model.v20180120.GetGatewayBySubDeviceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGatewayBySubDeviceResponseUnmarshaller {

	public static GetGatewayBySubDeviceResponse unmarshall(GetGatewayBySubDeviceResponse getGatewayBySubDeviceResponse, UnmarshallerContext _ctx) {
		
		getGatewayBySubDeviceResponse.setRequestId(_ctx.stringValue("GetGatewayBySubDeviceResponse.RequestId"));
		getGatewayBySubDeviceResponse.setSuccess(_ctx.booleanValue("GetGatewayBySubDeviceResponse.Success"));
		getGatewayBySubDeviceResponse.setCode(_ctx.stringValue("GetGatewayBySubDeviceResponse.Code"));
		getGatewayBySubDeviceResponse.setErrorMessage(_ctx.stringValue("GetGatewayBySubDeviceResponse.ErrorMessage"));

		Data data = new Data();
		data.setProductKey(_ctx.stringValue("GetGatewayBySubDeviceResponse.Data.ProductKey"));
		data.setProductName(_ctx.stringValue("GetGatewayBySubDeviceResponse.Data.ProductName"));
		data.setDeviceSecret(_ctx.stringValue("GetGatewayBySubDeviceResponse.Data.DeviceSecret"));
		data.setDeviceName(_ctx.stringValue("GetGatewayBySubDeviceResponse.Data.DeviceName"));
		data.setFirmwareVersion(_ctx.stringValue("GetGatewayBySubDeviceResponse.Data.FirmwareVersion"));
		data.setGmtCreate(_ctx.stringValue("GetGatewayBySubDeviceResponse.Data.GmtCreate"));
		data.setUtcCreate(_ctx.stringValue("GetGatewayBySubDeviceResponse.Data.UtcCreate"));
		data.setGmtActive(_ctx.stringValue("GetGatewayBySubDeviceResponse.Data.GmtActive"));
		data.setUtcActive(_ctx.stringValue("GetGatewayBySubDeviceResponse.Data.UtcActive"));
		data.setGmtOnline(_ctx.stringValue("GetGatewayBySubDeviceResponse.Data.GmtOnline"));
		data.setUtcOnline(_ctx.stringValue("GetGatewayBySubDeviceResponse.Data.UtcOnline"));
		data.setStatus(_ctx.stringValue("GetGatewayBySubDeviceResponse.Data.Status"));
		data.setIpAddress(_ctx.stringValue("GetGatewayBySubDeviceResponse.Data.IpAddress"));
		data.setNodeType(_ctx.stringValue("GetGatewayBySubDeviceResponse.Data.NodeType"));
		data.setRegion(_ctx.stringValue("GetGatewayBySubDeviceResponse.Data.region"));
		data.setIotId(_ctx.stringValue("GetGatewayBySubDeviceResponse.Data.iotId"));
		getGatewayBySubDeviceResponse.setData(data);
	 
	 	return getGatewayBySubDeviceResponse;
	}
}