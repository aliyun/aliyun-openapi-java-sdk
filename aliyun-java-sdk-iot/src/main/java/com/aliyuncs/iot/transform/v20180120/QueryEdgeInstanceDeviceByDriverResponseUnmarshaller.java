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

import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceDeviceByDriverResponse;
import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceDeviceByDriverResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceDeviceByDriverResponse.Data.Device;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEdgeInstanceDeviceByDriverResponseUnmarshaller {

	public static QueryEdgeInstanceDeviceByDriverResponse unmarshall(QueryEdgeInstanceDeviceByDriverResponse queryEdgeInstanceDeviceByDriverResponse, UnmarshallerContext _ctx) {
		
		queryEdgeInstanceDeviceByDriverResponse.setRequestId(_ctx.stringValue("QueryEdgeInstanceDeviceByDriverResponse.RequestId"));
		queryEdgeInstanceDeviceByDriverResponse.setSuccess(_ctx.booleanValue("QueryEdgeInstanceDeviceByDriverResponse.Success"));
		queryEdgeInstanceDeviceByDriverResponse.setCode(_ctx.stringValue("QueryEdgeInstanceDeviceByDriverResponse.Code"));
		queryEdgeInstanceDeviceByDriverResponse.setErrorMessage(_ctx.stringValue("QueryEdgeInstanceDeviceByDriverResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryEdgeInstanceDeviceByDriverResponse.Data.Total"));
		data.setPageSize(_ctx.integerValue("QueryEdgeInstanceDeviceByDriverResponse.Data.PageSize"));
		data.setCurrentPage(_ctx.integerValue("QueryEdgeInstanceDeviceByDriverResponse.Data.CurrentPage"));

		List<Device> deviceList = new ArrayList<Device>();
		for (int i = 0; i < _ctx.lengthValue("QueryEdgeInstanceDeviceByDriverResponse.Data.DeviceList.Length"); i++) {
			Device device = new Device();
			device.setIotId(_ctx.stringValue("QueryEdgeInstanceDeviceByDriverResponse.Data.DeviceList["+ i +"].IotId"));

			deviceList.add(device);
		}
		data.setDeviceList(deviceList);
		queryEdgeInstanceDeviceByDriverResponse.setData(data);
	 
	 	return queryEdgeInstanceDeviceByDriverResponse;
	}
}