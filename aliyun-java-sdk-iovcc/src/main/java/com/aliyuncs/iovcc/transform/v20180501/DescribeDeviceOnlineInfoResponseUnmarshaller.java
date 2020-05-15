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

import com.aliyuncs.iovcc.model.v20180501.DescribeDeviceOnlineInfoResponse;
import com.aliyuncs.iovcc.model.v20180501.DescribeDeviceOnlineInfoResponse.DevicesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeviceOnlineInfoResponseUnmarshaller {

	public static DescribeDeviceOnlineInfoResponse unmarshall(DescribeDeviceOnlineInfoResponse describeDeviceOnlineInfoResponse, UnmarshallerContext _ctx) {
		
		describeDeviceOnlineInfoResponse.setRequestId(_ctx.stringValue("DescribeDeviceOnlineInfoResponse.RequestId"));

		List<DevicesItem> devices = new ArrayList<DevicesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeviceOnlineInfoResponse.Devices.Length"); i++) {
			DevicesItem devicesItem = new DevicesItem();
			devicesItem.setProjectId(_ctx.stringValue("DescribeDeviceOnlineInfoResponse.Devices["+ i +"].ProjectId"));
			devicesItem.setTerminal(_ctx.stringValue("DescribeDeviceOnlineInfoResponse.Devices["+ i +"].Terminal"));
			devicesItem.setIasId(_ctx.stringValue("DescribeDeviceOnlineInfoResponse.Devices["+ i +"].IasId"));
			devicesItem.setDeviceId(_ctx.stringValue("DescribeDeviceOnlineInfoResponse.Devices["+ i +"].DeviceId"));
			devicesItem.setClientVersion(_ctx.stringValue("DescribeDeviceOnlineInfoResponse.Devices["+ i +"].ClientVersion"));
			devicesItem.setSystemVersion(_ctx.stringValue("DescribeDeviceOnlineInfoResponse.Devices["+ i +"].SystemVersion"));
			devicesItem.setOnline(_ctx.integerValue("DescribeDeviceOnlineInfoResponse.Devices["+ i +"].Online"));
			devicesItem.setLoginTime(_ctx.longValue("DescribeDeviceOnlineInfoResponse.Devices["+ i +"].LoginTime"));

			devices.add(devicesItem);
		}
		describeDeviceOnlineInfoResponse.setDevices(devices);
	 
	 	return describeDeviceOnlineInfoResponse;
	}
}