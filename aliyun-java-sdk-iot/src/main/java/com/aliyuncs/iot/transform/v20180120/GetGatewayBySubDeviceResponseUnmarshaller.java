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

	public static GetGatewayBySubDeviceResponse unmarshall(GetGatewayBySubDeviceResponse getGatewayBySubDeviceResponse, UnmarshallerContext context) {
		
		getGatewayBySubDeviceResponse.setRequestId(context.stringValue("GetGatewayBySubDeviceResponse.RequestId"));
		getGatewayBySubDeviceResponse.setSuccess(context.booleanValue("GetGatewayBySubDeviceResponse.Success"));
		getGatewayBySubDeviceResponse.setCode(context.stringValue("GetGatewayBySubDeviceResponse.Code"));
		getGatewayBySubDeviceResponse.setErrorMessage(context.stringValue("GetGatewayBySubDeviceResponse.ErrorMessage"));

		Data data = new Data();
		data.setProductKey(context.stringValue("GetGatewayBySubDeviceResponse.Data.ProductKey"));
		data.setProductName(context.stringValue("GetGatewayBySubDeviceResponse.Data.ProductName"));
		data.setDeviceSecret(context.stringValue("GetGatewayBySubDeviceResponse.Data.DeviceSecret"));
		data.setDeviceName(context.stringValue("GetGatewayBySubDeviceResponse.Data.DeviceName"));
		data.setFirmwareVersion(context.stringValue("GetGatewayBySubDeviceResponse.Data.FirmwareVersion"));
		data.setGmtCreate(context.stringValue("GetGatewayBySubDeviceResponse.Data.GmtCreate"));
		data.setUtcCreate(context.stringValue("GetGatewayBySubDeviceResponse.Data.UtcCreate"));
		data.setGmtActive(context.stringValue("GetGatewayBySubDeviceResponse.Data.GmtActive"));
		data.setUtcActive(context.stringValue("GetGatewayBySubDeviceResponse.Data.UtcActive"));
		data.setGmtOnline(context.stringValue("GetGatewayBySubDeviceResponse.Data.GmtOnline"));
		data.setUtcOnline(context.stringValue("GetGatewayBySubDeviceResponse.Data.UtcOnline"));
		data.setStatus(context.stringValue("GetGatewayBySubDeviceResponse.Data.Status"));
		data.setIpAddress(context.stringValue("GetGatewayBySubDeviceResponse.Data.IpAddress"));
		data.setNodeType(context.stringValue("GetGatewayBySubDeviceResponse.Data.NodeType"));
		data.setRegion(context.stringValue("GetGatewayBySubDeviceResponse.Data.region"));
		data.setIotId(context.stringValue("GetGatewayBySubDeviceResponse.Data.iotId"));
		getGatewayBySubDeviceResponse.setData(data);
	 
	 	return getGatewayBySubDeviceResponse;
	}
}