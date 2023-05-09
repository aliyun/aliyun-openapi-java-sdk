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

import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceDeviceResponse;
import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceDeviceResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceDeviceResponse.Data.Device;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEdgeInstanceDeviceResponseUnmarshaller {

	public static QueryEdgeInstanceDeviceResponse unmarshall(QueryEdgeInstanceDeviceResponse queryEdgeInstanceDeviceResponse, UnmarshallerContext _ctx) {
		
		queryEdgeInstanceDeviceResponse.setRequestId(_ctx.stringValue("QueryEdgeInstanceDeviceResponse.RequestId"));
		queryEdgeInstanceDeviceResponse.setCode(_ctx.stringValue("QueryEdgeInstanceDeviceResponse.Code"));
		queryEdgeInstanceDeviceResponse.setErrorMessage(_ctx.stringValue("QueryEdgeInstanceDeviceResponse.ErrorMessage"));
		queryEdgeInstanceDeviceResponse.setSuccess(_ctx.booleanValue("QueryEdgeInstanceDeviceResponse.Success"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("QueryEdgeInstanceDeviceResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("QueryEdgeInstanceDeviceResponse.Data.PageSize"));
		data.setTotal(_ctx.integerValue("QueryEdgeInstanceDeviceResponse.Data.Total"));

		List<Device> deviceList = new ArrayList<Device>();
		for (int i = 0; i < _ctx.lengthValue("QueryEdgeInstanceDeviceResponse.Data.DeviceList.Length"); i++) {
			Device device = new Device();
			device.setProductKey(_ctx.stringValue("QueryEdgeInstanceDeviceResponse.Data.DeviceList["+ i +"].ProductKey"));
			device.setDriverId(_ctx.stringValue("QueryEdgeInstanceDeviceResponse.Data.DeviceList["+ i +"].DriverId"));
			device.setDeviceName(_ctx.stringValue("QueryEdgeInstanceDeviceResponse.Data.DeviceList["+ i +"].DeviceName"));
			device.setIotId(_ctx.stringValue("QueryEdgeInstanceDeviceResponse.Data.DeviceList["+ i +"].IotId"));

			deviceList.add(device);
		}
		data.setDeviceList(deviceList);
		queryEdgeInstanceDeviceResponse.setData(data);
	 
	 	return queryEdgeInstanceDeviceResponse;
	}
}