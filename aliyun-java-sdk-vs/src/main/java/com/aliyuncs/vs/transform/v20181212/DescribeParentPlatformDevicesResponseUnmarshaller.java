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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeParentPlatformDevicesResponse;
import com.aliyuncs.vs.model.v20181212.DescribeParentPlatformDevicesResponse.Device;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParentPlatformDevicesResponseUnmarshaller {

	public static DescribeParentPlatformDevicesResponse unmarshall(DescribeParentPlatformDevicesResponse describeParentPlatformDevicesResponse, UnmarshallerContext _ctx) {
		
		describeParentPlatformDevicesResponse.setRequestId(_ctx.stringValue("DescribeParentPlatformDevicesResponse.RequestId"));
		describeParentPlatformDevicesResponse.setPageSize(_ctx.longValue("DescribeParentPlatformDevicesResponse.PageSize"));
		describeParentPlatformDevicesResponse.setPageNum(_ctx.longValue("DescribeParentPlatformDevicesResponse.PageNum"));
		describeParentPlatformDevicesResponse.setPageCount(_ctx.longValue("DescribeParentPlatformDevicesResponse.PageCount"));
		describeParentPlatformDevicesResponse.setTotalCount(_ctx.longValue("DescribeParentPlatformDevicesResponse.TotalCount"));

		List<Device> devices = new ArrayList<Device>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParentPlatformDevicesResponse.Devices.Length"); i++) {
			Device device = new Device();
			device.setId(_ctx.stringValue("DescribeParentPlatformDevicesResponse.Devices["+ i +"].Id"));
			device.setName(_ctx.stringValue("DescribeParentPlatformDevicesResponse.Devices["+ i +"].Name"));
			device.setGbId(_ctx.stringValue("DescribeParentPlatformDevicesResponse.Devices["+ i +"].GbId"));
			device.setGroupId(_ctx.stringValue("DescribeParentPlatformDevicesResponse.Devices["+ i +"].GroupId"));
			device.setParentId(_ctx.stringValue("DescribeParentPlatformDevicesResponse.Devices["+ i +"].ParentId"));

			devices.add(device);
		}
		describeParentPlatformDevicesResponse.setDevices(devices);
	 
	 	return describeParentPlatformDevicesResponse;
	}
}