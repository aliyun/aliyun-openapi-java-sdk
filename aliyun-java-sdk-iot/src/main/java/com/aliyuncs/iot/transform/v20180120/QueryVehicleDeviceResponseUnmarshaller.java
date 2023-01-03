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
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryVehicleDeviceResponseUnmarshaller {

	public static QueryVehicleDeviceResponse unmarshall(QueryVehicleDeviceResponse queryVehicleDeviceResponse, UnmarshallerContext _ctx) {
		
		queryVehicleDeviceResponse.setRequestId(_ctx.stringValue("QueryVehicleDeviceResponse.RequestId"));
		queryVehicleDeviceResponse.setSuccess(_ctx.booleanValue("QueryVehicleDeviceResponse.Success"));
		queryVehicleDeviceResponse.setCode(_ctx.stringValue("QueryVehicleDeviceResponse.Code"));
		queryVehicleDeviceResponse.setErrorMessage(_ctx.stringValue("QueryVehicleDeviceResponse.ErrorMessage"));

		Data data = new Data();
		data.setIotId(_ctx.stringValue("QueryVehicleDeviceResponse.Data.IotId"));
		data.setProductKey(_ctx.stringValue("QueryVehicleDeviceResponse.Data.ProductKey"));
		data.setDeviceName(_ctx.stringValue("QueryVehicleDeviceResponse.Data.DeviceName"));
		data.setManufacturer(_ctx.stringValue("QueryVehicleDeviceResponse.Data.Manufacturer"));
		data.setDeviceModel(_ctx.stringValue("QueryVehicleDeviceResponse.Data.DeviceModel"));
		data.setDeviceId(_ctx.stringValue("QueryVehicleDeviceResponse.Data.DeviceId"));
		data.setStatus(_ctx.stringValue("QueryVehicleDeviceResponse.Data.Status"));
		data.setAuthCode(_ctx.stringValue("QueryVehicleDeviceResponse.Data.AuthCode"));
		data.setProvince(_ctx.stringValue("QueryVehicleDeviceResponse.Data.Province"));
		data.setCity(_ctx.stringValue("QueryVehicleDeviceResponse.Data.City"));
		data.setVehicleColour(_ctx.stringValue("QueryVehicleDeviceResponse.Data.VehicleColour"));
		data.setVehicleNumber(_ctx.stringValue("QueryVehicleDeviceResponse.Data.VehicleNumber"));
		data.setCreateTime(_ctx.longValue("QueryVehicleDeviceResponse.Data.CreateTime"));
		data.setModifiedTime(_ctx.longValue("QueryVehicleDeviceResponse.Data.ModifiedTime"));
		data.setRegisterTime(_ctx.longValue("QueryVehicleDeviceResponse.Data.RegisterTime"));
		queryVehicleDeviceResponse.setData(data);
	 
	 	return queryVehicleDeviceResponse;
	}
}