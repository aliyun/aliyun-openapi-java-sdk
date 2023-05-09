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

import com.aliyuncs.iot.model.v20180120.QueryVehicleDeviceResponse;
import com.aliyuncs.iot.model.v20180120.QueryVehicleDeviceResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryVehicleDeviceResponse.Data.JtProtocolDeviceData;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryVehicleDeviceResponseUnmarshaller {

	public static QueryVehicleDeviceResponse unmarshall(QueryVehicleDeviceResponse queryVehicleDeviceResponse, UnmarshallerContext _ctx) {
		
		queryVehicleDeviceResponse.setRequestId(_ctx.stringValue("QueryVehicleDeviceResponse.RequestId"));
		queryVehicleDeviceResponse.setCode(_ctx.stringValue("QueryVehicleDeviceResponse.Code"));
		queryVehicleDeviceResponse.setErrorMessage(_ctx.stringValue("QueryVehicleDeviceResponse.ErrorMessage"));
		queryVehicleDeviceResponse.setSuccess(_ctx.booleanValue("QueryVehicleDeviceResponse.Success"));

		Data data = new Data();
		data.setProductKey(_ctx.stringValue("QueryVehicleDeviceResponse.Data.ProductKey"));
		data.setModifiedTime(_ctx.longValue("QueryVehicleDeviceResponse.Data.ModifiedTime"));
		data.setDeviceName(_ctx.stringValue("QueryVehicleDeviceResponse.Data.DeviceName"));
		data.setBizProtocol(_ctx.stringValue("QueryVehicleDeviceResponse.Data.Protocol"));
		data.setCreateTime(_ctx.longValue("QueryVehicleDeviceResponse.Data.CreateTime"));
		data.setIotId(_ctx.stringValue("QueryVehicleDeviceResponse.Data.IotId"));

		JtProtocolDeviceData jtProtocolDeviceData = new JtProtocolDeviceData();
		jtProtocolDeviceData.setStatus(_ctx.stringValue("QueryVehicleDeviceResponse.Data.JtProtocolDeviceData.Status"));
		jtProtocolDeviceData.setRegisterTime(_ctx.stringValue("QueryVehicleDeviceResponse.Data.JtProtocolDeviceData.RegisterTime"));
		jtProtocolDeviceData.setAuthCode(_ctx.stringValue("QueryVehicleDeviceResponse.Data.JtProtocolDeviceData.AuthCode"));
		jtProtocolDeviceData.setVehicleColour(_ctx.stringValue("QueryVehicleDeviceResponse.Data.JtProtocolDeviceData.VehicleColour"));
		jtProtocolDeviceData.setDeviceId(_ctx.stringValue("QueryVehicleDeviceResponse.Data.JtProtocolDeviceData.DeviceId"));
		jtProtocolDeviceData.setVehicleNumber(_ctx.stringValue("QueryVehicleDeviceResponse.Data.JtProtocolDeviceData.VehicleNumber"));
		jtProtocolDeviceData.setCity(_ctx.stringValue("QueryVehicleDeviceResponse.Data.JtProtocolDeviceData.City"));
		jtProtocolDeviceData.setDeviceModel(_ctx.stringValue("QueryVehicleDeviceResponse.Data.JtProtocolDeviceData.DeviceModel"));
		jtProtocolDeviceData.setManufacturer(_ctx.stringValue("QueryVehicleDeviceResponse.Data.JtProtocolDeviceData.Manufacturer"));
		jtProtocolDeviceData.setProvince(_ctx.stringValue("QueryVehicleDeviceResponse.Data.JtProtocolDeviceData.Province"));
		data.setJtProtocolDeviceData(jtProtocolDeviceData);
		queryVehicleDeviceResponse.setData(data);
	 
	 	return queryVehicleDeviceResponse;
	}
}