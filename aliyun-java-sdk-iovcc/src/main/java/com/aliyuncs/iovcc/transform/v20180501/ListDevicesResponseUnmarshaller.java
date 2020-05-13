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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.ListDevicesResponse;
import com.aliyuncs.iovcc.model.v20180501.ListDevicesResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDevicesResponseUnmarshaller {

	public static ListDevicesResponse unmarshall(ListDevicesResponse listDevicesResponse, UnmarshallerContext _ctx) {
		
		listDevicesResponse.setRequestId(_ctx.stringValue("ListDevicesResponse.RequestId"));

		List<Result> devices = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("ListDevicesResponse.Devices.Length"); i++) {
			Result result = new Result();
			result.setDeviceId(_ctx.stringValue("ListDevicesResponse.Devices["+ i +"].DeviceId"));
			result.setDeviceType(_ctx.stringValue("ListDevicesResponse.Devices["+ i +"].DeviceType"));
			result.setUsageType(_ctx.integerValue("ListDevicesResponse.Devices["+ i +"].UsageType"));
			result.setUsageTypeDesc(_ctx.stringValue("ListDevicesResponse.Devices["+ i +"].UsageTypeDesc"));
			result.setDeviceModel(_ctx.stringValue("ListDevicesResponse.Devices["+ i +"].DeviceModel"));
			result.setDeviceModelId(_ctx.longValue("ListDevicesResponse.Devices["+ i +"].DeviceModelId"));
			result.setDeviceBrand(_ctx.stringValue("ListDevicesResponse.Devices["+ i +"].DeviceBrand"));
			result.setUuid(_ctx.stringValue("ListDevicesResponse.Devices["+ i +"].Uuid"));
			result.setVin(_ctx.stringValue("ListDevicesResponse.Devices["+ i +"].Vin"));
			result.setSerialNumber(_ctx.stringValue("ListDevicesResponse.Devices["+ i +"].SerialNumber"));
			result.setMacAddress(_ctx.stringValue("ListDevicesResponse.Devices["+ i +"].MacAddress"));
			result.setHardwareId(_ctx.stringValue("ListDevicesResponse.Devices["+ i +"].HardwareId"));
			result.setSoftwareId(_ctx.stringValue("ListDevicesResponse.Devices["+ i +"].SoftwareId"));
			result.setRegion(_ctx.stringValue("ListDevicesResponse.Devices["+ i +"].Region"));
			result.setName(_ctx.stringValue("ListDevicesResponse.Devices["+ i +"].Name"));
			result.setProjectId(_ctx.stringValue("ListDevicesResponse.Devices["+ i +"].ProjectId"));
			result.setStatus(_ctx.stringValue("ListDevicesResponse.Devices["+ i +"].Status"));

			devices.add(result);
		}
		listDevicesResponse.setDevices(devices);
	 
	 	return listDevicesResponse;
	}
}