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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeDevicesResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeDevicesResponse.DevicesItem;
import com.aliyuncs.ecd.model.v20200930.DescribeDevicesResponse.DevicesItem.EndUserListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDevicesResponseUnmarshaller {

	public static DescribeDevicesResponse unmarshall(DescribeDevicesResponse describeDevicesResponse, UnmarshallerContext _ctx) {
		
		describeDevicesResponse.setRequestId(_ctx.stringValue("DescribeDevicesResponse.RequestId"));

		List<DevicesItem> devices = new ArrayList<DevicesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDevicesResponse.Devices.Length"); i++) {
			DevicesItem devicesItem = new DevicesItem();
			devicesItem.setDeviceId(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].DeviceId"));

			List<EndUserListItem> endUserList = new ArrayList<EndUserListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDevicesResponse.Devices["+ i +"].EndUserList.Length"); j++) {
				EndUserListItem endUserListItem = new EndUserListItem();
				endUserListItem.setEndUserId(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].EndUserList["+ j +"].EndUserId"));
				endUserListItem.setUserType(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].EndUserList["+ j +"].UserType"));
				endUserListItem.setDirectoryId(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].EndUserList["+ j +"].DirectoryId"));
				endUserListItem.setAdDomain(_ctx.stringValue("DescribeDevicesResponse.Devices["+ i +"].EndUserList["+ j +"].AdDomain"));

				endUserList.add(endUserListItem);
			}
			devicesItem.setEndUserList(endUserList);

			devices.add(devicesItem);
		}
		describeDevicesResponse.setDevices(devices);
	 
	 	return describeDevicesResponse;
	}
}