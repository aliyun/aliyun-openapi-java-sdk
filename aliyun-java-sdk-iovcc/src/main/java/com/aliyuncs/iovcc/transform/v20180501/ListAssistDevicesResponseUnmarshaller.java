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

import com.aliyuncs.iovcc.model.v20180501.ListAssistDevicesResponse;
import com.aliyuncs.iovcc.model.v20180501.ListAssistDevicesResponse.DevicesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAssistDevicesResponseUnmarshaller {

	public static ListAssistDevicesResponse unmarshall(ListAssistDevicesResponse listAssistDevicesResponse, UnmarshallerContext _ctx) {
		
		listAssistDevicesResponse.setRequestId(_ctx.stringValue("ListAssistDevicesResponse.RequestId"));
		listAssistDevicesResponse.setPageIndex(_ctx.integerValue("ListAssistDevicesResponse.PageIndex"));
		listAssistDevicesResponse.setPerPage(_ctx.integerValue("ListAssistDevicesResponse.PerPage"));
		listAssistDevicesResponse.setTotalCount(_ctx.integerValue("ListAssistDevicesResponse.TotalCount"));

		List<DevicesItem> devices = new ArrayList<DevicesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAssistDevicesResponse.Devices.Length"); i++) {
			DevicesItem devicesItem = new DevicesItem();
			devicesItem.setDeviceId(_ctx.stringValue("ListAssistDevicesResponse.Devices["+ i +"].DeviceId"));
			devicesItem.setDeviceName(_ctx.stringValue("ListAssistDevicesResponse.Devices["+ i +"].DeviceName"));
			devicesItem.setSerialNumber(_ctx.stringValue("ListAssistDevicesResponse.Devices["+ i +"].SerialNumber"));
			devicesItem.setHardwareId(_ctx.stringValue("ListAssistDevicesResponse.Devices["+ i +"].HardwareId"));
			devicesItem.setUUID(_ctx.stringValue("ListAssistDevicesResponse.Devices["+ i +"].UUID"));
			devicesItem.setVIN(_ctx.stringValue("ListAssistDevicesResponse.Devices["+ i +"].VIN"));
			devicesItem.setAccessTime(_ctx.longValue("ListAssistDevicesResponse.Devices["+ i +"].AccessTime"));

			devices.add(devicesItem);
		}
		listAssistDevicesResponse.setDevices(devices);
	 
	 	return listAssistDevicesResponse;
	}
}