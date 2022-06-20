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

import com.aliyuncs.iot.model.v20180120.QueryImportedDeviceByApplyIdResponse;
import com.aliyuncs.iot.model.v20180120.QueryImportedDeviceByApplyIdResponse.Device;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryImportedDeviceByApplyIdResponseUnmarshaller {

	public static QueryImportedDeviceByApplyIdResponse unmarshall(QueryImportedDeviceByApplyIdResponse queryImportedDeviceByApplyIdResponse, UnmarshallerContext _ctx) {
		
		queryImportedDeviceByApplyIdResponse.setRequestId(_ctx.stringValue("QueryImportedDeviceByApplyIdResponse.RequestId"));
		queryImportedDeviceByApplyIdResponse.setSuccess(_ctx.booleanValue("QueryImportedDeviceByApplyIdResponse.Success"));
		queryImportedDeviceByApplyIdResponse.setCode(_ctx.stringValue("QueryImportedDeviceByApplyIdResponse.Code"));
		queryImportedDeviceByApplyIdResponse.setErrorMessage(_ctx.stringValue("QueryImportedDeviceByApplyIdResponse.ErrorMessage"));
		queryImportedDeviceByApplyIdResponse.setPageNo(_ctx.integerValue("QueryImportedDeviceByApplyIdResponse.PageNo"));
		queryImportedDeviceByApplyIdResponse.setPageSize(_ctx.integerValue("QueryImportedDeviceByApplyIdResponse.PageSize"));
		queryImportedDeviceByApplyIdResponse.setTotalPage(_ctx.integerValue("QueryImportedDeviceByApplyIdResponse.TotalPage"));
		queryImportedDeviceByApplyIdResponse.setProductKey(_ctx.stringValue("QueryImportedDeviceByApplyIdResponse.ProductKey"));

		List<Device> deviceList = new ArrayList<Device>();
		for (int i = 0; i < _ctx.lengthValue("QueryImportedDeviceByApplyIdResponse.DeviceList.Length"); i++) {
			Device device = new Device();
			device.setProductKey(_ctx.stringValue("QueryImportedDeviceByApplyIdResponse.DeviceList["+ i +"].ProductKey"));
			device.setDeviceName(_ctx.stringValue("QueryImportedDeviceByApplyIdResponse.DeviceList["+ i +"].DeviceName"));
			device.setDeviceSecret(_ctx.stringValue("QueryImportedDeviceByApplyIdResponse.DeviceList["+ i +"].DeviceSecret"));
			device.setSn(_ctx.stringValue("QueryImportedDeviceByApplyIdResponse.DeviceList["+ i +"].Sn"));

			deviceList.add(device);
		}
		queryImportedDeviceByApplyIdResponse.setDeviceList(deviceList);
	 
	 	return queryImportedDeviceByApplyIdResponse;
	}
}