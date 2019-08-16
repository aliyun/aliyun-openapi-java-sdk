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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryDeviceByDriverResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceByDriverResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryDeviceByDriverResponse.Data.Device;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceByDriverResponseUnmarshaller {

	public static QueryDeviceByDriverResponse unmarshall(QueryDeviceByDriverResponse queryDeviceByDriverResponse, UnmarshallerContext _ctx) {
		
		queryDeviceByDriverResponse.setRequestId(_ctx.stringValue("QueryDeviceByDriverResponse.RequestId"));
		queryDeviceByDriverResponse.setSuccess(_ctx.booleanValue("QueryDeviceByDriverResponse.Success"));
		queryDeviceByDriverResponse.setCode(_ctx.stringValue("QueryDeviceByDriverResponse.Code"));
		queryDeviceByDriverResponse.setErrorMessage(_ctx.stringValue("QueryDeviceByDriverResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryDeviceByDriverResponse.Data.Total"));
		data.setPageSize(_ctx.integerValue("QueryDeviceByDriverResponse.Data.PageSize"));
		data.setCurrentPage(_ctx.integerValue("QueryDeviceByDriverResponse.Data.CurrentPage"));

		List<Device> deviceList = new ArrayList<Device>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceByDriverResponse.Data.DeviceList.Length"); i++) {
			Device device = new Device();
			device.setIotId(_ctx.stringValue("QueryDeviceByDriverResponse.Data.DeviceList["+ i +"].IotId"));
			device.setProductKey(_ctx.stringValue("QueryDeviceByDriverResponse.Data.DeviceList["+ i +"].ProductKey"));
			device.setDeviceName(_ctx.stringValue("QueryDeviceByDriverResponse.Data.DeviceList["+ i +"].DeviceName"));

			deviceList.add(device);
		}
		data.setDeviceList(deviceList);
		queryDeviceByDriverResponse.setData(data);
	 
	 	return queryDeviceByDriverResponse;
	}
}