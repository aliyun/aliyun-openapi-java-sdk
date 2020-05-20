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

package com.aliyuncs.aliyuncvc.transform.v20191030;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aliyuncvc.model.v20191030.ListDeviceIpResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.ListDeviceIpResponse.DevicesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeviceIpResponseUnmarshaller {

	public static ListDeviceIpResponse unmarshall(ListDeviceIpResponse listDeviceIpResponse, UnmarshallerContext _ctx) {
		
		listDeviceIpResponse.setRequestId(_ctx.stringValue("ListDeviceIpResponse.RequestId"));
		listDeviceIpResponse.setErrorCode(_ctx.integerValue("ListDeviceIpResponse.ErrorCode"));
		listDeviceIpResponse.setMessage(_ctx.stringValue("ListDeviceIpResponse.Message"));
		listDeviceIpResponse.setSuccess(_ctx.booleanValue("ListDeviceIpResponse.Success"));

		List<DevicesItem> devices = new ArrayList<DevicesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDeviceIpResponse.Devices.Length"); i++) {
			DevicesItem devicesItem = new DevicesItem();
			devicesItem.setScreenCode(_ctx.stringValue("ListDeviceIpResponse.Devices["+ i +"].ScreenCode"));
			devicesItem.setIp(_ctx.stringValue("ListDeviceIpResponse.Devices["+ i +"].Ip"));
			devicesItem.setMac(_ctx.stringValue("ListDeviceIpResponse.Devices["+ i +"].Mac"));
			devicesItem.setSsId(_ctx.stringValue("ListDeviceIpResponse.Devices["+ i +"].SsId"));

			devices.add(devicesItem);
		}
		listDeviceIpResponse.setDevices(devices);
	 
	 	return listDeviceIpResponse;
	}
}